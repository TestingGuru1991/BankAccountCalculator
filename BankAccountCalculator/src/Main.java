public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("1234", 0.00, "Bob Brown", "myemail@gmail.com", "(023) 234-345-456");
        System.out.println(bobsAccount.getNumber());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        Account petersAccount = new Account();
        System.out.println(petersAccount.getCustomerName());

        Account timsAccount = new Account("Tim", "time@gmail.com", "123");
        System.out.println(timsAccount.getNumber());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
    }

}
