import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Classe que representa os passos de teste para as operações de uma conta bancária.
 */
public class ContaBancaria {

    /**
     * Configuração inicial: um cliente especial com saldo atual.
     *
     * @param saldoAtual Saldo inicial do cliente especial.
     */
    @Given("um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer saldoAtual) {
        // Implementação pendente
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Executado quando é solicitado um saque na conta.
     *
     * @param valorSaque Valor a ser sacado.
     */
    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer valorSaque) {
        // Implementação pendente
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Verifica se o saque foi efetuado corretamente e atualiza o saldo da conta.
     *
     * @param novoSaldo Novo saldo da conta após o saque.
     */
    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer novoSaldo) {
        // Implementação pendente
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Verifica mais resultados após o saque.
     */
    @Then("check more outcomes")
    public void check_more_outcomes() {
        // Implementação pendente
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Configuração inicial: um cliente comum com saldo atual.
     *
     * @param saldoAtual Saldo inicial do cliente comum.
     */
    @Given("um cliente comum com saldo atual de {int} reais")
    public void um_cliente_comum_com_saldo_atual_de_reais(Integer saldoAtual) {
        // Implementação pendente
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Executado quando um cliente comum solicita um saque.
     *
     * @param valorSaque Valor a ser sacado.
     */
    @When("solicitar um saque de {int} reais")
    public void solicitar_um_saque_de_reais(Integer valorSaque) {
        // Implementação pendente
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Verifica se o saque não foi efetuado devido a saldo insuficiente.
     * Deve retornar a mensagem "Saldo Insuficiente".
     */
    @Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
    public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
        // Implementação pendente
        throw new io.cucumber.java.PendingException();
    }
}
