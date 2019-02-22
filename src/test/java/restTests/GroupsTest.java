package restTests;

import apiControllers.GroupController;
import org.testng.annotations.Test;

public class GroupsTest {

    GroupController groupController = new GroupController();


    @Test
    public void checkMyGroups(){
        groupController.checkMyGroups();
    }
}
