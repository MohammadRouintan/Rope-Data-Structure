//import java.util.LinkedList;
//import java.util.Scanner;
//
//
public class RopeTest {
    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.append("Rope");
        rope.append("_is");
        rope.append("_st");
        rope.append("ronger");
        rope.printRoot();
        System.out.println();
        System.out.println(rope.findByIndex(10));

        Rope rope1 = new Rope();
        rope1.append("Rope");
        rope1.append("_is");
        rope1.append("_st");
        rope1.append("ronger");
        rope.concatenation(rope1);
        rope.printRoot();
        System.out.println();
        System.out.println(rope.substring(1, 5));
    }
}
//public class RopeTest
//{
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        Rope r = new Rope("I am Ali");
//        System.out.println("Rope Test\n");
//        char ch;
//        do
//        {
//            System.out.println("\nRope Operations\n");
//            System.out.println("1. concat ");
//            System.out.println("2. get character at index");
//            System.out.println("3. substring");
//            System.out.println("4. clear");
//
//            int choice = scan.nextInt();
//            switch (choice)
//            {
//                case 1 :
//                    System.out.println("Enter string to concat");
//                    r.concat(scan.next());
//                    break;
//                case 2 :
//                    System.out.println("Enter index");
//                    System.out.println("Character at index = "+ r.indexAt(scan.nextInt()));
//                    break;
//                case 3 :
//                    System.out.println("Enter integer start and end limit");
//                    System.out.println("Substring : "+ r.substring( scan.nextInt(), scan.nextInt() ));
//                    break;
//                case 4 :
//                    System.out.println("\nRope Cleared\n");
//                    r.makeEmpty();
//                    break;
//                default :
//                    System.out.println("Wrong Entry \n ");
//                    break;
//            }
//            /**  Display rope  **/
//            System.out.print("\nRope : ");
//            r.print();
//
//            System.out.println("\nDo you want to continue (Type y or n) \n");
//            ch = scan.next().charAt(0);
//        } while (ch == 'Y'|| ch == 'y');
//    }
//}
