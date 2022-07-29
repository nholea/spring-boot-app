package test.app.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatedPermissionEndpoint {

    @PostMapping("/permissions")
    public String createPermission(){
        return new MyPermission("Edit").successfulMessage;
    }

}
