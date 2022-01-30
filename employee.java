package ru.geekbrains.lesson5;


    public class employee{
        public String FIO;
        public String position;
        public String Email;
        public String telephone;
        public int salary;
        public int age;

       public employee(){
        this.FIO = "Баталин Александр Алексеевич";
        this.position = "Тестировщик";
        this.Email = "Alex@mail.com";
        this.telephone = "89000000000";
        this.salary = 50000;
        this.age = 26;
       }

       public String toString(){
           return String.format (FIO, position, Email, telephone, salary, age);
       }

       public void getinfo(){
           System.out.println("ФИО " + FIO);
           System.out.println("Должность " + position);
           System.out.println("Email " + Email);
           System.out.println("Телефон " + telephone);
           System.out.println("Зарплата " + salary);
           System.out.println("Возраст " + age);
       }
   }
