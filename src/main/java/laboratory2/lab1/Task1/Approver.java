package laboratory2.lab1.Task1;

abstract class Approver {
    protected Approver nextApprover; // Следующий обработчик в цепочке

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void processRequest(Problem amount) {
        if (canApprove(amount)) {
            approve(amount);
        } else if (nextApprover != null) {
            nextApprover.processRequest(amount); // Передача запроса дальше
        } else {
            System.out.println("'" + amount.getText() + "', не рассматривается онлайн, необходимо подойти в банк.");
        }
    }

    protected abstract boolean canApprove(Problem amount); // Проверка лимита

    protected abstract void approve(Problem amount); // Логика одобрения
}
