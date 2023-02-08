import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        //tODO passport class tuzup any tolturuu
        /*Random rnd = new Random();
        UUID uuid = UUID.randomUUID();
        Passport passport1 = new Passport();
        passport1.lastName= "Ysmaiylov;" ;
        passport1.firstName="Raiym";
        passport1.gender="male";
        passport1.notionality="Kyrgyz Republic";
        passport1.yearOfBirth=1971;
        passport1.countryOfBirth="Kyrgyz Republic";
        passport1.id=uuid.toString();
       // passport1.id=rnd.nextLong(1842483924,924857344);
        //passport1.idNum='A';
        System.out.println("Фамилясы: "+passport1.lastName+"\nАты: "+passport1.firstName+"\nЖынысы: "+passport1.gender+"\n" +
                "Жарандыгы: "+passport1.notionality+"\nТуулган жылы: "+passport1.countryOfBirth+"\nЖеке номери: "+passport1.id);*/
        //TODO Jyl mezgilderin anyktoo
        /*Seasons seasons1 = new Seasons();
        seasons1.season();*/
        //TODO javada ,jste kanch student bar ekenin anyktoo
       /* Student student1 = new Student();
        student1.name="Kanykei";
        student1.age=16;
        student1.group="Java";
        Student student2 = new Student();
        student2.name="Madina";
        student2.age=16;
        student2.group="Java";
        Student student3 = new Student();
        student3.name="Jyldyz";
        student3.age=26;
        student3.group="Java";
        Student student4 = new Student();
        student4.name="Maksat";
        student4.age=26;
        student4.group="JS";

        Student student6 = new Student();
        student6.name="Ali";
        student6.age=35;
        student6.group="JS";
        Student[] group1 = {student1,student2, student3,student4, student6};
        int counter = 0;
        int counter1 = 0;
        int sum = 0;
        String java=new String("Java");
        String js=new String("JS");
        for (int i = 0; i < group1.length; i++) {
           if (group1[i].group.equals(java)){
               counter++;
           } else if (group1[i].group.equals(js)) {
               counter1++;
           }
            sum += group1[i].age;
            System.out.println(group1[i].name+" "+group1[i].age+" "+group1[i].group);
        }
        System.out.println("Java gruppasynda "+counter+" bar");
        System.out.println("JS gruppasynda "+counter1+" bar");
        System.out.println("Srednee arifmeticheskiy znachenie: " + (sum /5));*/
        //TODO return method menen familia atty chygaruu
       /* Person person1 = new Person();
        person1.firstName="Manas ";
        person1.lastName=" Abdugani uulu";
        person1.age=28;
        person1.gender="Male";
        person1.countryOfBirth="Batken";
        System.out.println(person1.work(" Bishkek"));
        System.out.println(person1.eat("Banana,watermelon,melon"));*/
        //TODO Constructor

        Student student1 = new Student("Manas", LocalDate.of(1995,8,26),"Kyrgyz","0221788717");
        Student student2 = new Student("Matmusa", LocalDate.of(2002,01,01),"Kyrgyz","0221788717");
        Student student3 = new Student("Erjigit", LocalDate.of(2004,01,01),"Kyrgyz","0221788717");
        Student student4 = new Student("Abdumomun", LocalDate.of(2005,07,15),"Kyrgyz","0221788717");
        Student student5 = new Student("Kanykei", LocalDate.of(2005,03,19),"Kyrgyz","0221788717");

        LocalDate localDate = LocalDate.of(2023,02,8);

        Student[] students = new Student[]{student1,student2,student3,student4,student5};
       int counter=0;
        for (Student a:students) {

            Period ag1 = Period.between(localDate,a.dateOfBirth);

            counter++;
            System.out.println("-----------------------------------------");
            System.out.println(counter+" student");
            System.out.println("Aty: "+a.name+"\nAge: "+ag1+"\nDate of birth: "+a.dateOfBirth+"\nNationality: "+a.nationality+"\nPhone Number: "+a.phoneNumber);
        }
    }
}