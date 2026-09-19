import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTest {

    Pizza pizza;
    int ingredientesPadrao;

    @BeforeEach
    public void setUp(){
        //Arrange
        ingredientesPadrao = 4;
        pizza = new Pizza(ingredientesPadrao);
    }

    @Test
    public void adicionaIngredientesCorretamente(){
        //Act
        int quantos = pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(8, quantos);
    }

    @Test
    public void naoAdicionaIngredientesNegativos(){
        //Act
        int quantos = pizza.adicionarIngredientes(-5);

        //Assert
        assertEquals(4, quantos);
    }
    
}
    