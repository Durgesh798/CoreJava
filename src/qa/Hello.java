package qa;

import java.util.Stack;

public class Hello {
           public static boolean check(String str) {
            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == ']') {
                    if (stack.isEmpty()) {
                        return false; // Unmatched closing bracket
                    }

                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == ']' && top != '[')) {
                        return false; // Mismatched brackets
                    }
                }
            }

            return stack.isEmpty(); // All brackets are matched if the stack is empty
        }

        public static void main(String[] args) {
            String str1 = "(([]))";
            String str2 = "(][)";
            String str3 = "]";
            String str4 = "()[]";

            System.out.println(check(str1)); // Output: true
            System.out.println(check(str2)); // Output: false
            System.out.println(check(str3)); // Output: false
            System.out.println(check(str4)); // Output: true
        }
    }

