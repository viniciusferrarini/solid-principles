# Sistema de Gerenciamento de Reservas de Hotel

## Descrição

Este projeto consiste no desenvolvimento de um sistema de gerenciamento de reservas para um hotel, aplicando os princípios do SOLID para garantir um código manutenível, extensível e de fácil compreensão. O sistema permite gerenciar reservas, clientes, quartos e processar pagamentos, além de gerar relatórios.

## Funcionalidades

- **Gerenciamento de Reservas:**
    - Criar, atualizar e cancelar reservas.
    - Verificar a disponibilidade de quartos.

- **Gerenciamento de Clientes:**
    - Adicionar, atualizar e remover informações dos clientes.

- **Gerenciamento de Quartos:**
    - Adicionar, atualizar e remover informações dos quartos.
    - Definir tipos de quartos (simples, duplo, suíte) e seus preços.

- **Processamento de Pagamentos:**
    - Processar pagamentos para as reservas.
    - Emitir recibos.

- **Relatórios:**
    - Gerar relatórios de ocupação do hotel.
    - Gerar relatórios financeiros.

## Princípios SOLID Aplicados

1. **Single Responsibility Principle (SRP):**
    - Cada classe no sistema tem uma única responsabilidade, como `ReservationManager` para gerenciar reservas, `ClientManager` para gerenciar clientes, e assim por diante.

2. **Open/Closed Principle (OCP):**
    - O sistema é projetado para ser facilmente estendido sem modificar o código existente, como ao adicionar novos tipos de quartos ou métodos de pagamento.

3. **Liskov Substitution Principle (LSP):**
    - Subclasses como `SingleRoom`, `DoubleRoom` e `SuiteRoom` podem ser usadas no lugar da classe base `Room` sem alterar o comportamento do sistema.

4. **Interface Segregation Principle (ISP):**
    - Interfaces menores e mais específicas são usadas, como `ReservationOperations` e `PaymentProcessor`, para evitar a dependência de métodos que não são necessários.

5. **Dependency Inversion Principle (DIP):**
    - O sistema depende de abstrações (interfaces), como `PaymentProcessor`, permitindo a troca de implementações concretas sem impacto no código cliente.

## Estrutura do Projeto

- **Classe `Reservation`:** Representa uma reserva, contendo informações como cliente, quarto e datas de início e fim.
- **Classe `Client`:** Representa um cliente, contendo informações como nome, email e telefone.
- **Classe `Room`:** Classe base para diferentes tipos de quartos, contendo informações como tipo, preço e disponibilidade.
- **Classe `RoomManager`:** Gerencia as operações relacionadas aos quartos.
- **Classe `PaymentProcessor`:** Interface para processar pagamentos, com implementações concretas como `CreditCardPaymentProcessor` e `PayPalPaymentProcessor`.
- **Classe `ReportGenerator`:** Responsável por gerar relatórios de ocupação e financeiros do hotel.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        RoomManager roomManager = new RoomManager();
        ReservationManager reservationManager = new ReservationManager();
        PaymentProcessor paymentProcessor = new CreditCardPaymentProcessor();
        ReportGenerator reportGenerator = new ReportGenerator();

        // Adicionando quartos ao sistema
        Room singleRoom = new SingleRoom("101", 100.0);
        Room doubleRoom = new DoubleRoom("102", 150.0);
        roomManager.addRoom(singleRoom);
        roomManager.addRoom(doubleRoom);

        // Criando uma reserva
        Client client = new Client("John Doe", "johndoe@example.com", "123456789");
        reservationManager.createReservation(client, singleRoom, new Date(), new Date());

        // Processando pagamento
        paymentProcessor.processPayment(100.0);

        // Gerando relatório
        reportGenerator.generateReport(roomManager.getRooms());

        System.out.println("Sistema de gerenciamento de reservas executado com sucesso!");
    }
}
