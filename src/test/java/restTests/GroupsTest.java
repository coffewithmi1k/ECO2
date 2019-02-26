package restTests;

import apiControllers.GroupController;
import configuration.Configuration;
import org.testng.annotations.Test;

public class GroupsTest extends Configuration {

    GroupController groupController = new GroupController();


    @Test
    public void checkMyGroups(){
        groupController.checkMyGroups();
    }
}
