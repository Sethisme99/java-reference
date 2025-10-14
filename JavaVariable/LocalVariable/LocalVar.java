//Local Variale rule:
//
//can be declared in method, constructor, or blocks.

//it created when the method, constructor or block is entered and the variable will be destroyed once it exit the method, constructor, or block.

//it can't be used Access modifiers

//Visible only within declared method, constructor or block.

//Local variables are implemented at stack level internally.

//There is no default value for local variable, it should be give or assigned it value before it first use.

//Example:
//age is alocal variable. This method is defined inside pubAge() method and it scope is limited to only this method.
//
//


public class LocalVar {
    // Method pupAge
    public void pupAge() {
        int age = 0; // local var initialized value after declared
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String[] args) {
        LocalVar l1 = new LocalVar();
        l1.pupAge();
    }
}





