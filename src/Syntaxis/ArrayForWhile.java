package Syntaxis;

public class ArrayForWhile {
    public void show() {
        String players1[] = new String[4];
        String players2[] = {"Al","Ba","Ce","Dy"};
        players1[0] = "Al";
        players1[1] = "Ba";
        players1[2] = "Ce";
        players1[3] = "Dy";
        int counter;
        int len = players1.length;

        System.out.println("For & while cirle");


        for(counter=0; counter < len; counter++){
            System.out.println("'for'-- ArrayForWhile: " + players1[counter]);
        }

        for(int i = 10; i >= 0; i--){
            System.out.println("for -- " + i);
        }

        System.out.println("while");

        counter = 0;
        while (counter < len) {
            if (counter == 3){
                break;
            }
            
            /* if (players1[counter].equals("Ce")){

                continue;
            }*/

            System.out.println("'while'-- ArrayForWhile: " + players1[counter] +
                    " counter " + (counter));
            counter++;
        }


    }

}
