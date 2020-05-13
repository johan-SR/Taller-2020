/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTextField;

public class Reloj extends Thread{
  private JTextField txtReloj;
  public Reloj(JTextField txtReloj) {
    this.txtReloj = txtReloj;
  }
   Reloj() {
        throw new UnsupportedOperationException("Not supported yet.");
   }
    
  @Override
  public void run() {
    super.run();
    while (true) {
      Calendar cal = Calendar.getInstance();
      Date date = cal.getTime();
      DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss ");
      String strDate = dateFormat.format(date);
      System.out.println("Hora: " + strDate);
      txtReloj.setText("                 "+strDate);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        //TODO something...
      }
    }
  }
}