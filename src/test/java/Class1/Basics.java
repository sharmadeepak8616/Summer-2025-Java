package Class1;

public class Basics {

    /**
     * IMP Rules:
     *      1. Java-file-name and Java-Class-name MUST BE SAME ALWAYS!!
     *      2. If we want to write a something for information (non-code), we must write it as a comment.
     *      3. All code MUST BE within the curly-braces of Java-Class
     *      4. In a Java-Class, we can have ONLY-ONE main-method
     */

    /**
     * Ways to add comments in Java-File(or Java-Class)
     * 1. using double slash (//)
     *      Anything written after the double slash in going to be considered as a comment for the line
     * 2. using /star  star/
     *      This allows multiple lines comment
     * 3. using /starstar   star/
     *      This allows multiple lines comment
     */

    // Anything written on this line, after the double slash is going to be considered as a comment.
    /*
        this allows us to write

        multiple lines

        of comment.
     */
    /**
     * This also allows us to write
     *
     * multiple lines of comment
     *
     * and it highlights the comment as well.
     */

    /**
     * main-method: is the executable part of a Java-Class (or is the special method of a Java-Class which is executable)
     *      Only code written inside the main-method will get executed.
     *      Shortcut to create main-method is pvsm (IntelliJ)
     *      In a Java-Class, we can have ONLY-ONE main-method
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("How are you doing?");
    }

    /**
     * sout-statements or System.out.println-statements
     *      statements which can be used in order to print/show something in console window.
     */

}

