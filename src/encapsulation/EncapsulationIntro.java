package encapsulation;

class Account {
    // To access a private variable you need to have getter and setter methods 

    private int bankBalance;

    public void setbankBalance(int bankBalance){
        boolean isAdmin = false;
        if (!isAdmin){
            System.out.println("You cannot set the bankBalance");
        }else{
           this.bankBalance = bankBalance;
        }
    }

    public int getBankBalance(){
        return bankBalance;
    }
}
public class EncapsulationIntro {

    // Encapsulation means the variables and methods in a class are used on for one purpose 
    // Real example - a capsule contains onlyt the ingredients to cure a specific disease and not multiple disease


    // a private method will only be accessible to the class EncapsulationIntro
    private void hidePassword(){
        System.out.println("password@123");
    }
    // public methods are available to all the other packages as well
    public void doWorkForEncaps (){
        System.out.println("This is a public function defined in another package called encapsulation. since it is public our MainClass can access this method");
    }

    // this method is default method. a default method can only be accessed 
    void learnEnglish (){
        System.out.println("learning English is really important in the 21st century");
    }

    // the methods which are protected can only be accessible to the parent and its child classes
    protected void trustYourself(){
        System.out.println("Trust yourseld more!");
    }

    public static void main(String[] args) {
        System.out.println("working working");
        EncapsulationIntro E2 = new EncapsulationIntro();
        E2.hidePassword();
        E2.learnEnglish();
        Account A1 = new Account();
        A1.setbankBalance(2394238);

        System.err.println(A1.getBankBalance());
    }

}

class EncapsulationIntroChild extends  EncapsulationIntro {
    public static void main(String[] args) {
        EncapsulationIntroChild E4 = new EncapsulationIntroChild();
        E4.trustYourself(); 
    }
}
