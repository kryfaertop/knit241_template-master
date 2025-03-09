package laboratory2.lab1.Task1;

class Legal_department extends Approver {
    @Override
    protected boolean canApprove(Problem amount) {
        return amount.getIndex() <= 500; // Директор одобряет до 50,000
    }

    @Override
    protected void approve(Problem amount) {
        System.out.println("Юридический отдел может решить ваш вопрос: '" + amount.getText() + "', ожидайте.");
    }
}
