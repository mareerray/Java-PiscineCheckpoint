import java.util.*;
import java.util.regex.*;

// validate whether a given HTML string is correctly formatted. The method should support a few basic HTML tags
// (<html>, <body>, <div>, <p>, <b>, <i>, <h1>, <h2>). If the HTML is valid,
// the method should return true. If the HTML is invalid, the method should return false
public class HTMLValidator {
    // Set.of(...) creates an immutable set directly
    //private static final Set<String> ALLOWED_TAGS = Set.of("html", "body", "div", "p", "b", "i", "h1", "h2");

    public boolean validateHTML(String html) {

        // Creates a regex pattern to match tags like <div>, </div>, etc.
        //([a-z0-9]+) captures the tag name for later inspections.
        Pattern tagPattern = Pattern.compile("</?([a-z0-9]+)(/?)>");
        Matcher matcher = tagPattern.matcher(html);

        Stack<String> stack = new Stack<>();
        // The stack keeps track of the order of opening tags.
        // Mimics the nested structure of HTML.

        // For every matched tag in the string, extracts the tag name.
        //Checks if the tag is a closing tag (</tag>).
        while (matcher.find()) {
            String tag = matcher.group(1);
            // This boolean is true only if the tag starts with a slash (</tag>)
            boolean isClosing = html.charAt(matcher.start() + 1) == '/';
            // The second group (/?) matches an optional forward slash at the end of the tag, right before >
            // Therefore, isSelfClosing is true ONLY for self-closing tags (for example <br/>, <img/>).
            boolean isSelfClosing = !isClosing && matcher.group(2).equals("/");

            // If the tag is not in your allowed set, returns false immediately (invalid HTML).
            //if (!ALLOWED_TAGS.contains(tag)) return false;

            if (isSelfClosing) {
                // Nothing to do (self-closing, no stack needed) just continue the loop
                continue;
            }
            if (!isClosing) { // If an opening tag, push it on the stack (keep track of nesting).
                stack.push(tag);
            } else {
                // If a closing tag, pop the last opening from the stack and compare:
                // If stack is empty (no opening to match) → invalid.
                //If popped tag doesn’t match closing tag → invalid.
                if (stack.isEmpty() || !stack.pop().equals(tag)) return false;
            }
        }
        return stack.isEmpty();
        // At the end if stack is empty, all tags closed in correct order → valid HTML.
        // if any tags remain unmatched (stack not empty), return false.
    }
}