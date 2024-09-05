import com.apirest.userdept.entities.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {


    @Test
    public void somaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int somando = calculadora.soma(10, 20);
        //System.out.println(somando);
        Assertions.assertEquals(30, somando);

    }

   /* @Test
    public void verificaSeEPar(){
        Calculadora calculadora = new Calculadora();
        boolean verifica = calculadora.verificaPar(4);
        Assertions.assertTrue(verifica);
    }*/

}
