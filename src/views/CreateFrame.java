package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class CreateFrame extends JFrame {
    InputPanel idPanel;
    InputPanel namePanel;
    InputPanel cityPanel;
    InputPanel  salaryPanel;
    
    public CreateFrame() {
        this.idPanel = new InputPanel("Azonító");
        this.namePanel = new InputPanel("Név");
        this.cityPanel = new InputPanel("Település");
        this.salaryPanel = new InputPanel("Fizetés");

        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        this.add(this.idPanel);
        this.add(this.namePanel);
        this.add(this.cityPanel);
        this.add(this.salaryPanel);
        //this.setSize(400,300);
        this.pack();
        
    
    }
    
}
