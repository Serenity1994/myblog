import com.myblog.entity.pojo.User;
import com.myblog.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author serenity
 * @date 17-11-11 16:52
 */
public class UserTest extends BaseTest{
    @Autowired
    private IUserService iUserService;

    @Test
    public void saveTest(){
        User user = new User();
        user.setUserName("Mike");
        user.setUserPwd("123456");
        iUserService.save(user);
        System.out.println(user.toString());
    }
}
