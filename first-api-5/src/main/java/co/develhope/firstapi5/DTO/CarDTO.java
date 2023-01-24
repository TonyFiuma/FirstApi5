package co.develhope.firstapi5.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
public class CarDTO{
    @NotNull(message = "Mandatory!")
    private String id;
    @NotNull(message = "Mandatory!")
    private String modelName;
    private double price;

    public String getId(){
        return id;
    }

    public String getModelName(){
        return modelName;
    }

    public double getPrice(){
        return price;
    }
}
