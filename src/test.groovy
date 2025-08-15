// Bad formatting, unused imports, unused variables, bad naming

import java.util.Date  // ❌ Unused import

class badClassName {   // ❌ Class name should be PascalCase

    static void main(String[] args) {
        def date = new Date() // ❌ Unused variable

        println("Hello World") // ✅ This line is fine

        println 'Missing parentheses' // ❌ Inconsistent parentheses style

        // ❌ Magic number without explanation
        def result = 42 * 7

        // ❌ Missing spaces and poor formatting
        if(result>100){
