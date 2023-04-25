package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import models.Database;
import models.Employee;
import views.CreateFrame;
import views.MainFrame;

public class CreateController {
    CreateFrame createFrame;
    MainFrame mainFrame;
    public CreateController(MainFrame mainFrame) {
        this.mainFrame=mainFrame;
        this.createFrame=new CreateFrame(this.mainFrame);
        this.handleEvents();
    }
    public CreateFrame getCreateFrame(){
        return createFrame;
    }
    private void handleEvents(){
        JButton addButton = this.createFrame.getAddButton();
        addButton.addActionListener(e -> {
            startAdding();
        });
    }
    private void startAdding(){
        //System.out.println("hozzáadás");
        String idStr = createFrame.getIdPanel().getValue();
        Integer id = Integer.parseInt(idStr);
        String nameStr = createFrame.getNamePanel().getValue();
        String cityStr = createFrame.getCityPanel().getValue();
        String salaryStr = createFrame.getSalaryPanel().getValue();
        Double salary = Double.parseDouble(salaryStr);
        Employee emp = new Employee(id, nameStr, cityStr, salary);
        new Database().insertEmployee(emp);
        JOptionPane.showMessageDialog(createFrame,"A hozzáadás megtörtént");
    }
    
}
