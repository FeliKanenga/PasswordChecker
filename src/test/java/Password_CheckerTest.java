import static org.junit.Assert.*;

public class Password_CheckerTest {

    public class Password_CheckerTest {

        @org.junit.Test
        public void passwordIsValid() throws PasswordException {
            Assert.assertTrue(Password_Checker.passwordIsValid("passsssssA\"3"));
        }

        @org.junit.Test
        public void passwordIsOk(){

            Assert.assertTrue(Password_Checker.passwordIsOk());
        }
    }
}