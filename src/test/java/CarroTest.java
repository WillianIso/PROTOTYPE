import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Carro carro = new Carro(123, "Carro Original", new Concessionaria("Rua A", 1), "R$15.990,00");
        Carro carroClone = carro.clone();
        carroClone.setCodigoCarro(456);
        carroClone.setNome("Carro Clonado");
        carroClone.getConcessionaria().setNumero(2);

        assertEquals("Carro{codigoCarro=123, nome='Carro Original', concessionaria=Concessionaria{logradouro='Rua A', numero=1}, valor='R$15.990,00'}", carro.toString());
        assertEquals("Carro{codigoCarro=456, nome='Carro Clonado', concessionaria=Concessionaria{logradouro='Rua A', numero=2}, valor='R$15.990,00'}", carroClone.toString());
    }
}