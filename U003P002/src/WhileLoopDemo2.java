/**
 * Created by mqc647 on 27.07.2016.
 */
public class WhileLoopDemo2 {
    public static void main(String[] args) {
        String [] friends = new String [20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[18]= "Hillary";
        friends[19]= "Natasha";

        for(String friend: friends){
            if (friend == "Matilda"){
                System.out.println(friend);
                break;
            }
        }
    }
}
