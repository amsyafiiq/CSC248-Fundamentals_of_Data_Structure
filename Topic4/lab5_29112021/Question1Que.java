import java.util.Scanner;
import universal_LLnNode.Queue;

public class Question1Que {
    public static void main(String[] args){
        Scanner inText = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        
        Queue<Integer> numQ = new Queue<Integer>();
        Queue<Integer> numQ_sub = new Queue<Integer>();

        boolean stop = false;
        String prompt;

        numQ.addFirst(3); numQ.addLast(13); numQ.addLast(22);
        
        do {
            System.out.println("Enter a number >> ");
            numQ.addLast(inNum.nextInt());

            System.out.println("Do you want to continue >> ");
            prompt = inText.nextLine();
            
            if (prompt.toUpperCase().equals("NO")) 
                stop = true;
        } while (!stop);

        inNum.close(); inText.close();

        int i = 1, highest = 0, total = 0;
        while (!numQ.isEmpty()) {
            Integer temp = numQ.removeFirst();
            System.out.println("#" + i + " : " + temp);
            if (temp > highest) highest = temp;
            total += temp;
            numQ_sub.addFirst(temp);
            i++;
        }
        System.out.println("Highest Value: " + highest);
        System.out.println("Average: " +  (total / (i- 1)));

        Queue<Integer> div5Q = new Queue<Integer>();
        Queue<Integer> div5Q_sub = new Queue<Integer>();

        while (!numQ_sub.isEmpty()) {
            Integer temp = numQ_sub.removeFirst();
            if (temp % 5 == 0) div5Q.addFirst(temp);
            numQ.addFirst(temp);
        }

        System.out.println("Number that can be devided by 5 :-");
        while (!div5Q.isEmpty()) {
            Integer temp = div5Q.removeFirst();
            System.out.println(temp + " ");
            div5Q_sub.addFirst(temp);
        }
    }
    
}