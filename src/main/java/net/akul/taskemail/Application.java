package net.akul.taskemail;

import java.util.*;

import static java.util.Collections.*;

public class Application {

    public static void main(String[] args) {

        List<User> outUsers = new ArrayList<>();
        List<User> users = new ArrayList<>();
        HashSet outEmail = new HashSet();

        HashSet hashSet1 = new HashSet();
        hashSet1.add("xxx@mail.ru");
        hashSet1.add("vvv@mail.ru");
        hashSet1.add("ccc@mail.ru");
        User user1 = new User("user1", hashSet1);

        HashSet hashSet2 = new HashSet();
        hashSet2.add("ccc@mail.ru");
        hashSet2.add("sfaxzvzf@mail.ru");
        hashSet2.add("asnjvkn@mail.ru");
        hashSet2.add("xv@mail.ru");
        hashSet2.add("tt@mail.ru");
        User user2 = new User("user2", hashSet2);

        HashSet hashSet3 = new HashSet();
        hashSet3.add("sd@mail.ru");
        hashSet3.add("sfsdvaxzvzf@mail.ru");
        hashSet3.add("vd@mail.ru");
        //hashSet3.add("xv@mail.ru");
        hashSet3.add("dsdvvs@mail.ru");
        hashSet3.add("asnjvkn@mvxail.ru");
        hashSet3.add("vxzvcv@mail.ru");
        User user3 = new User("user3", hashSet3);

        HashSet hashSet4 = new HashSet();
        hashSet4.add("tt@mail.ru");
        hashSet4.add("xxx@mail.ru");
        User user4 = new User("user4", hashSet4);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        outUsers.add(users.get(0));
        users.remove(users.get(0));
        outEmail.addAll(users.get(0).getmAdress());

        for (int i = 0; i < users.size(); i++) {

            if (disjoint(users.get(i).getmAdress(), outEmail)) {
                outUsers.add(users.get(i));
                outEmail.add(users.get(i).getmAdress());
            }
        }

        for (User u2 : outUsers) {
            System.out.println(u2);
        }

    }
}
