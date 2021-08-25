import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class EmailTest {

    @Test
    public void EmailTest(){
     Email.getEmail().setCadastrado("Email");
     assertEquals("Email",Email.getEmail().getCadastrado());



    }


}
