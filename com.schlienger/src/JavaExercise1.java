public class JavaExercise1 {
    public static void main(String[] args){

        for(int i=1; i<=18; i++){
            if(i%15==0){
                System.out.println("ka-ching!");
            }
            else if(i%5==0){
                System.out.println("ching!");
            }
            else if(i%3==0){
                System.out.println("ka");
            }
            else{
                System.out.println(i);
            }
        }

    }
}
