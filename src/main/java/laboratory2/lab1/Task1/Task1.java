package laboratory2.lab1.Task1;


public class Task1 {
    public static void main(String[] args) {
        // Создаем обработчиков
        Approver call_center = new Сall_center();
        Approver manager = new Manager();
        Approver legal_department = new Legal_department();
        Approver director = new Director();

        // Устанавливаем цепочку: junior -> senior -> director
        call_center.setNextApprover(manager);
        manager.setNextApprover(legal_department);
        legal_department.setNextApprover(director);

        // Запросы на одобрение разных сумм
        // Превышает лимит – запрос отклонен

        Problem problem1 = new Problem("Хочу кредит", 46);
        Problem problem2 = new Problem("Хочу кредит больше", 129);
        Problem problem3 = new Problem("Хочу кредит ещё больше", 358);
        Problem problem4 = new Problem("Хочу кредит ещё ещё больше", 707);
        Problem problem5 = new Problem("Хочу кредит ещё ещё ещё больше", 10000);

        call_center.processRequest(problem1);   // Младший менеджер одобряет
        call_center.processRequest(problem2);  // Старший менеджер одобряет
        call_center.processRequest(problem3); // Директор одобряет
        call_center.processRequest(problem4);
        call_center.processRequest(problem5);
    }

}

