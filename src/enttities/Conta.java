package enttities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public abstract class Conta extends Banco {

    @Override
    public void saque() {

    }

    public void extratoSaque() {

    }

    @Override
    public void Deposito() {

    }

    public void extratoDeposito() {

    }

    @Override
    public void transferencia() {

    }

    @Override
    public void informacoes() {

    }

    @Override
    public void tipoDeConta(String tipo) {

    }

    public void extrato() {

    }

    public void limparSaida() {
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(5);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
        }
    }

}
