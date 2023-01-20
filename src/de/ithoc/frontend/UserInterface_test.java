package de.ithoc.frontend;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import de.ithoc.backend.User;

public class UserInterface_test {
    
    @Test // nextUserSave()
    public void newUser_new(){
        //Vorbereitung Testdaten
        UserInterface ui = new UserInterface();
        String key = "testkey";
        String pwd = "testpwd";


        //Logik
        ui.newUserSave(key, pwd);

        //Ergebnis prüfen
        User user = ui.data.getUserList().get(key);
        Assertions.assertEquals(pwd, user.getPasswort());

    }
    @Test // nextUserSave()
    public void newUser_exists(){
        UserInterface ui = new UserInterface();
        String key = "testkey";
        String pwd = "testpwd";
        ui.newUserSave(key, pwd);

        User user = ui.newUserSave(key, pwd);


        Assertions.assertNull(user.getUsername());
        Assertions.assertNull(user.getPasswort());
    }

}
