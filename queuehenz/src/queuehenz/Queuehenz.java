package queuehenz;

public class Queuehenz {

    public static void main(String[] args) {

        arrayqueue<String> strq = new arrayqueue<>(); // by customzing the capacity you need to 
                                                      // input a number between the open aand closed parenthesis

        try {
            strq.enqueue("10");
            strq.enqueue("9");
            strq.enqueue("8");
            strq.enqueue("7");
            strq.enqueue("6");
            strq.enqueue("5");
            strq.enqueue("4");
            strq.enqueue("3");
            strq.enqueue("2");
            strq.enqueue("1");
          //  strq.enqueue("0");

            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print(strq.first() + "\n");
            strq.dequeue();
            System.out.print("Size: " + strq.size() + "\n" + "\n");
           

            

        } catch (FullQueueException ex) {
            System.out.print(ex.getMessage());
        }

    }

}
