import com.itheima.domain.User;

import java.util.Arrays;

/**
 * @author LuoTao
 * @version 1.0
 * @date 2021/4/14 10:19
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);
        System.out.println(user.getId());
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Main.main");
        
    }

}
