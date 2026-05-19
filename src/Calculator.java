public class Calculator {
    public String ticket_system(int old) {
        if(old<6){
            return "無料";
        }else if(old<13){
            return "500円";
        }else if(old<18){
            return "1000円";
        }else{
            return "1500円";
        }
    }
}
