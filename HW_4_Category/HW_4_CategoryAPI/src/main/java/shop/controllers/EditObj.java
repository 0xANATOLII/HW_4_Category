package shop.controllers;

import lombok.Data;
import shop.dto.CategoryDTO;

@Data
public  class EditObj{
    public int id;
    public CategoryDTO categoryDTO;
}