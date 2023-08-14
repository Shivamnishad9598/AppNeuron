package com.example.AppNeuron1;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document(collation =  "products")

public class Product {

    @Id
    private String id;
    private String name;



}
