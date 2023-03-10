import java.util.Scanner;// 导入要放在首行，否则会区分不清
public class GetAvgOfFiveV1 {

//Array example 1:通过循环，计算了5个分数的总和，并得出了平均分。但是score只使用了1个变量，
//先后存了5个分数，因此会被不断覆盖掉，最终只保留最后1个值。如果用5个变量存放，那么就不需要使用循环了。
//变量在声明内存空间的时候是随机分配的，没有规律。
//5个空间，分配要有规律，还要使用循环，就要用到【数组】


/*public class GetAvgOfFive{

  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    int sum = 0;
    int score =0;
    for (int i = 1;i<=5;i++){
      System.out.print("请输入第"+i+"个同学的成绩：");
      score = input.nextInt();
      sum += score;
    }
    double avg = sum/5.0;
    System.out.println("平均分数avg = "+avg);
    System.out.println("分数score = "+score);
  }

} */

/*Array example 2
使用数组:数组是存储相同数据类型的一组数据。其基本要素包括：标识符，数组元素，元素下标和元素类型。
step1:声明数组：int[] score;
step2:分配空间：score = new int[5];
step3:赋值：score[0]=99;
边声明边赋值：int[] score = {86，78，99};
for(int i:score){
  sum += i
} avg = sum/score.length;
动态从键盘输入信息并赋值。
step4:处理数据：score[0]=score[0]*10;
*/
        public static void main(String[] args){
            Scanner input= new Scanner(System.in);
            int sum = 0;
            //声明一个array,就是在内存上声明一段连续的空间；左边[]负责产生一个叫做score的有名空间。
            // new的作用是负责产生这段连续的空间，均为无名空间
            // =负责将有名空间指向无名空间的元素位置
            int[] score = new int[5];
            for (int i = 0;i<=4;i++){
                System.out.print("请输入第"+(i+1)+"个同学的成绩：");
                // i变量是array的下标，从0开始，到数组的长度-1为止
                score[i] = input.nextInt();
                sum += score[i];
            }
            double avg = sum/5.0;
            System.out.println("平均分数avg = "+avg);
            System.out.println("分数score = "+score[0]);
            System.out.println("分数score = "+score[1]);
            System.out.println("分数score = "+score[2]);
            System.out.println("分数score = "+score[3]);
            System.out.println("分数score = "+score[4]);
        }
    }

/*Array example 3
判断数组中是否存在某个值，不能用简单的遍历数组元素，如果arr[i]== 值，则存在；因为会输出arr.length个结果
此时要用bool
*/

/*
public class SearchArr{

  public static void main(String[] args){
    int[] arr = {8,4,4,3,2,11,12};
    int sum =0;
    for (int i = 0;i<arr.length;i++){
      //遍历数组元素
      System.out.println(arr[i]);
      sum += arr[i];
    }
    System.out.println("数组总和sum = "+sum);
    //判断数组中是否存在某个值
    System.out.println("请输入一个值：");
    Scanner input= new Scanner(System.in);
    int num = input.nextInt();
    for (int i = 0;i<arr.length;i++){
      if (arr[i]==num){
        System.out.println("有这个值："+num);
      }else {
        System.out.println("没有有这个值："+num);
      }
    }
    System.out.println("请再输入一个值：");
    Scanner input1 = new Scanner(System.in);
    int num1 = input1.nextInt();
    boolean flag = false;//默认没有这个值
    for (int i = 0;i<arr.length;i++){
      if (arr[i]==num1){
        flag = true;
      }
      }
      if (flag==true){
        System.out.println("有这个值："+num1);
      }else{
        System.out.println("没有这个值："+num1);
      }
    }
}
*/
//Array example 4,非整数

/*public class SearchArr{

  public static void main(String[] args){
    double [] arr = {8.1,4.2,4.2,3.0,2.2,11,12};
    double sum =0;
    for (int i = 0;i<arr.length;i++){
      //遍历数组元素
      System.out.println(arr[i]);
      sum += arr[i];
    }
    System.out.println("数组总和sum = "+sum);
    //判断数组中是否存在某个值
    System.out.println("请输入一个值：");
    Scanner input= new Scanner(System.in);
    double num = input.nextInt();
    for (int i = 0;i<arr.length;i++){
      if (arr[i]==num){
        System.out.println("有这个值："+num);
      }else {
        System.out.println("没有有这个值："+num);
      }
    }
    System.out.println("请再输入一个值：");
    Scanner input1 = new Scanner(System.in);
    double num1 = input1.nextInt();
    boolean flag = false;//默认没有这个值
    for (int i = 0;i<arr.length;i++){
      if (arr[i]==num1){
        flag = true;
      }
      }
      if (flag==true){
        System.out.println("有这个值："+num1);
      }else{
        System.out.println("没有这个值："+num1);
      }
    }
}*/

