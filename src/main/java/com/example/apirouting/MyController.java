/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */

// Write your code here.
package com.example.apirouting;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class MyController{
        MyService Suresh_Api = new MyService();
        @GetMapping("/")
        public String Get_SRS_Page(){
            return Suresh_Api.Get_SRS_Page();
        }
        @GetMapping("/about")
        public String Get_SRV_Page(){
            return Suresh_Api.Get_SRV_Page();
        }
  
}
