public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
             // Пишем код для задачи
        var dog = 8.0;
        var cat = 3.6;
        var paper = 762789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task2 () {
        System.out.println("Задача 4");
        // задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task3 () {
            System.out.println("Задача 6");
            var firstBoxer = 78.2;
            var secondBoxer = 82.7;
            var sumWeight = firstBoxer + secondBoxer;
            var diffWeight = secondBoxer- firstBoxer;
            System.out.println("Сумма веса бойцов " + sumWeight + " кг");
            System.out.println("Разница в вессе " + diffWeight + " кг");
            System.out.println("Задача 7");
            var divWight = secondBoxer % firstBoxer;
            System.out.println("Разница в вессе " + diffWeight + " кг");
            System.out.println("Разница в вессе " + divWight + " кг");
            System.out.println("Задача 8");
            var allTime = 640;
            var staffTime = 8;
            var worker = allTime / staffTime;
            System.out.println("Всего работников в компании "+ worker + " человек");
            var moreWorker = worker + 94;
            var newStaffTime = allTime / moreWorker;
        System.out.println("Если в компании работает " + moreWorker + " человек, то всего " + newStaffTime + " часов работы может быть поделено между сотрудниками");
    }

}