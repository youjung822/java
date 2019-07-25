package coding.interview.array;

public class Person {
    private String FName,LName;
    private int age;
    private char gender;

    public Person(){
        FName = "Youjung";
        LName = "Kim";
        age = 29;
        gender = 'F';
    }

    public Person(String strFName,String strLName, int intAge, char charGender){
        FName = strFName;
        LName = strLName;
        age = intAge;
        gender = charGender;
    }

    public String getFullName(){
        return this.FName + " " + this.LName;
    }
}
