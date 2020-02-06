package academy.learning;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object oriented, platfort independant language");
        languages.put("Python", "an interpreted, object oriented, high level programming language with dynamic semantics");
        languages.put("Algol", "an algorithm language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java already in the Map");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println(languages.get("Java"));
        System.out.println("=====================================");

//        languages.remove("Lisp");

        if (languages.remove("Algol", "an algorithm language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed");
        }
        if (languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.replace("Scala", "test"));
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}

