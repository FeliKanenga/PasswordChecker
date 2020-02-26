import org.junit.Assert;
import org.junit.Test;

public class Password_CheckerTest {

        @Test
        public void passwordIsValid() throws PasswordException {
            Assert.assertTrue(Password_Checker.passwordIsValid("passsssssA\"3"));
        }

        @Test
        public void passwordIsOk(){

            Assert.assertTrue(Password_Checker.passwordIsOk());
        }

}