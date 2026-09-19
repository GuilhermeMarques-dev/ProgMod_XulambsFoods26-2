import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PizzaTest {

    @Test
    public void adicionaIngredientesCorretamente(){
        //Arrange
        Pizza pizza = new Pizza();

        //Act
        int quantos = 
            pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(4, quantos);
    }

    @Test 
    public void testePodeAdicionarQuant(){
        Pizza pizza = new Pizza();
        int quantidadeIngredientes =
            pizza.adicionarIngredientes(10);

        assertEquals(0, quantidadeIngredientes);
    }    

    
    @Test 
    public void testeCriacaoValorFinal(){
        Pizza pizza = new Pizza();
        pizza.adicionarIngredientes(4);
        double valorFinal = pizza.valorFinal();

        assertEquals(49, valorFinal,0.01);

    }
}
    