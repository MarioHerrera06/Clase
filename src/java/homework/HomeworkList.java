
package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class HomeworkList {
    public static List<Homework> list = new ArrayList();
    
    
    
    public static Homework search(int id){
        Homework found=null;
        for (Homework homework : list) {
            if(homework.getId()==id){
                found=homework;
                break;
            }
            
            
        }
        return found;
}
}

