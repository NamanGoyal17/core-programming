// Write a program to find the age of // Harry if the birth year is 2000. // Assume the Current Year is 2024
// I/P => NONE
// O/P => Harry's age in 2024 is ___ 


class Main {
    public static void main(String[] args) {
        int birthYear = 2000;
        int age = 0;
        int presentYear = 2024;
        for(int i=birthYear;i<presentYear;i++){
            age++;
        }
        System.out.println("Harry's age in 2024 is "+age);
    }
}