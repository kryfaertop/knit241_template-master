package laboratory2.lab1.Task1;


import laboratory2.TaskDescription;

@TaskDescription(name = "Chain of Responsibility", description = "Этот паттерн используется для передачи запроса по цепочке обработчиков, пока один из них не обработает его. Каждый обработчик в цепочке может либо обработать запрос, либо передать его дальше.")
public class Task1  {

    public void execute(){
        // Создаем обработчиков
        Approver call_center = new Сall_center();
        Approver manager = new Manager();
        Approver legal_department = new Legal_department();
        Approver director = new Director();

        // Устанавливаем цепочку: junior -> senior -> director
        call_center.setNextApprover(manager);
        manager.setNextApprover(legal_department);
        legal_department.setNextApprover(director);


        Problem problem1 = new Problem("Хочу кредит", 46);
        Problem problem2 = new Problem("Хочу кредит больше", 129);
        Problem problem3 = new Problem("Хочу кредит ещё больше", 358);
        Problem problem4 = new Problem("Хочу кредит ещё ещё больше", 707);
        Problem problem5 = new Problem("Хочу кредит ещё ещё ещё больше", 10000);

        call_center.processRequest(problem1);
        call_center.processRequest(problem2);
        call_center.processRequest(problem3);
        call_center.processRequest(problem4);
        call_center.processRequest(problem5);
    }
}

