package shop.controllers;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.dto.CategoryDTO;
import shop.entities.CategoryEntity;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    private static List<CategoryDTO> list= new ArrayList<>();
    @GetMapping("/")
    public List<CategoryDTO> index() {
        return list;
    }

    @PostMapping("/add")
    public void add(@RequestBody CategoryDTO category) {
        list.add(category);
    }

    @PostMapping("/edit")
    public void edit(@RequestBody shop.controllers.EditObj edObj) {
        for(int i =0;i<list.size();i++){
            if(list.get(i).getId() ==edObj.id){
                list.set(i,edObj.categoryDTO);
            }
        }
    }



    @PostMapping("/delete")
    public void delete(@RequestBody int id) {
        for(int i =0;i<list.size();i++){
            if(list.get(i).getId() ==id){
                list.remove(i);

            }
        }
    }
}