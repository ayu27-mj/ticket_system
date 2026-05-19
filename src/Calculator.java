public class Calculator {
    public void ticket_system(int old) {
        if(old<6){
            System.out.println("無料");
        }else if(old<13){
            System.out.println("500円");
        }else if(old<18){
            System.out.println("1000円");
        }else{
            System.out.println("1500円");
        }
    }
}
