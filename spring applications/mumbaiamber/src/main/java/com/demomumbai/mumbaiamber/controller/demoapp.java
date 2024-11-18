package com.demomumbai.mumbaiamber.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/demo")
public class demoapp 
{
    List<Integer> LL  = new ArrayList<>();
    @Autowired
   
    @GetMapping("intI")
    public int returnInt(){
        return 10;
    }
    @GetMapping("list")
    public List<Integer> returnList(){
    
    return LL;
    }

    @GetMapping("readInput")
    public String getMethodName(@RequestParam("ID") String ID) {
        return ID;
    }
    
    @GetMapping("readAge")
    public String getAge(@RequestParam("ID") int ID,@RequestParam("Age") int age, @RequestParam("Name") String name) {
        return "ID - "+ID + " " +" Age - " +age + " " +"Name - "+ name;
    }
    
    @PostMapping("AddValues")
    public String postMethodName(@RequestParam("ID") int valueFromPostMethod) {
        
        LL.add(valueFromPostMethod);
        return "The value added successfully"+ LL;
    }
    @DeleteMapping("DeleteValues")
    public String deleteValues(@RequestParam("ID") int value){
        if(LL.contains(value)){
        
            LL.remove(LL.indexOf(value));
            return "The value Deleted successfully"+ LL;
        }else{
            return "Value Does not Exists" + LL + "The value you entered is " + value;
        }
    }
    
    
}
