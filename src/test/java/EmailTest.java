import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class EmailTest {

    @Test
    public void EmailTest(){
     Email.getEmail().setCadastrado("Email@6eceb130");
     assertEquals("Email@6eceb130",Email.getEmail().getCadastrado());



    }


}
