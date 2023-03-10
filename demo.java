import java.util.Scanner;
public class demo {
    public static void main(String [] args){
        //第一次修改，commit并push到github上
        System.out.println("Hello World!");
        //print:not insert a new line
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.");
        System.out.println(3);
        System.out.println(50000);
        System.out.println(3 + 3);
        System.out.println(2 * 5);
        //第二次修改，commit并push到github上
        //Java variables
        String name = "John";
        int myNum = 15;
        int myNum1;
        myNum1 = 15;
        System.out.println(name+","+myNum+","+myNum1);
        boolean rightflag = true;
        boolean wrongflag = false;
        System.out.println(rightflag);
        System.out.println(wrongflag);

        //Type Casting: Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double
        int myInt=9;
        double myD= myInt;
        System.out.println(myInt);
        System.out.println(myD);

        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte
        double mydb=9.78;
        int myI= (int) mydb;
        System.out.println(mydb);
        System.out.println(myI);

        //String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + "-" + lastName);
        System.out.println(firstName.concat(lastName));

        //Java uses the + operator for both addition and concatenation.Numbers are added. Strings are concatenated.
        String x = "10",y = "20";
        String z = x + y;
        System.out.println(z);

        String x1 = "10";
        int y1 = 20;
        String z1 = x1 + y1;
        System.out.println(z1);

        // \\=\,\"="
        String txt = "We are the so-called \n \"Vikings\" from the north.";
        System.out.println(txt);
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.abs(-3.6));
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);

        //boolean
        int a = 10;
        int b = 9;
        System.out.println(a==b);

        //If ... Else
        System.out.print("请输入一个时间：");
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Short Hand If...Else
        // variable = (condition) ? expressionTrue :  expressionFalse;
        System.out.print("请再输入一个时间：");
        Scanner input1 = new Scanner(System.in);
        int time1 = input1.nextInt();
        String result = (time1 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //Java Switch：selects one of many code blocks to be executed:
        System.out.print("请输入星期");
        Scanner input2 = new Scanner(System.in);
        int day = input2.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        //break keyword breaks out of the switch block.When a match is found, and the job is done, it's time for a break without need for more testing.

        //While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //Do/While Loop
        int ii = 0;
        do {
            System.out.println(ii);
            ii++;
        }
        while (ii < 11);

        // For Loop
        for (int s = 0; s <= 10; s = s + 2) {
            System.out.println(s);
        }

        // Nested Loops
        for (int q = 1; q <= 2; q++) {
            System.out.println("Outer: " + q); // Executes 2 times
            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        // For-Each Loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String cartype : cars) {
            System.out.println(cartype);
        }

        //Break: The break statement can also be used to jump out of a loop.
        for (int e = 0; e < 10; e++) {
            if (e == 4) {
                break;
            }
            System.out.println(" "+e);
        }

        //Continue: The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
        for (int d = 0; d < 10; d++) {
            if (d == 4) {
                continue;
            }
            System.out.print(" "+d);
        }

        // break in while loop
        int k = 0;
        System.out.println("//break in while loop");
        while (k < 10) {
            System.out.println(k);
            k++;
            if (k == 4) {
                break;
            }
        }
        // continue in while loop
        int p = 0;
        System.out.println("//continue in while loop");
        while (p < 6) {
            if (p == 4) {
                p++;
                continue;
            }
            System.out.println(p);
            p++;
        }

        // array:数组的创立和遍历可参考下面的例子，这里只展示Multidimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println("//array");
        System.out.println(myNumbers[1][2]);// Outputs 7
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        //Loop Through a Multi-Dimensional Array
        System.out.println("//Loop Through a Multi-Dimensional Array");
        int[][] myArr = { {1, 2, 3, 4}, {5, 6, 7}};
        // int [][] myArr1 = { {11, 21, 31, 41}, {15, 16, 17},{1,2,3,4}};
        // int [][] [] myArr2 = {myArr,myArr1}
        for (int r = 0; r < myArr.length; ++r) {
            for(int s = 0; s < myArr[r].length; ++s) {
                //for (int t = 0; t < myArr1[r][s].length; ++t) {
                System.out.println(myArr[r][s]);
                //}
            }
        }

        int [][] myArr1 = { {11, 21, 31, 41}, {15, 16, 17},{1,2,3,4}};
        System.out.println(myArr1[2][3]);
    }
}
