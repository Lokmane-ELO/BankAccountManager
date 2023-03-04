/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bankaccountmanager;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author lokma
 */
public class StatisticsLayout extends javax.swing.JInternalFrame {

    /**
     * Creates new form StatisticsLayout
     */
    private Bank bank;
    private ArrayList<Transaction> transaction;
    private String AccountNumber;
    private Double Balance;
    private HashMap<String, Double> Mounth_Amount = new HashMap<String, Double>();
    private Double value;
    private ArrayList<String> mounths ;
    public StatisticsLayout() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui =(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        bank = new Bank();
       
        
    }
     public void setAccountNumber(String s){
         this.AccountNumber = s;
         mounths = new ArrayList<String>();
          transaction = bank.getTransaction(s);
          Balance = bank.getAccountBalance(s);
         AnnalyseTransaction();
        //showLineChart();
        showBarChart();
     }
     
     public void showBarChart(){
         
         for(Transaction t :transaction){
            switch(t.getDate().getMonth()){
                case 0 :
                     value = Mounth_Amount.get("Janvier");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Janvier" , value + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Janvier" , parseDouble(t.getAmount()));
                    }
                    
                    break;
                case 1 :
                       value = Mounth_Amount.get("Fevrier");
                    if (value != null && !value.isNaN()) {
                            Mounth_Amount.put("Fevrier" , Mounth_Amount.get("Fevrier") +parseDouble(t.getAmount()));                    }else{
                         Mounth_Amount.put("Fevrier" , parseDouble(t.getAmount()));
                    }
                   
                    break;

                case 2 :
                      value = Mounth_Amount.get("Mars");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Mars" , Mounth_Amount.get("Mars") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Mars" , parseDouble(t.getAmount()));
                    }
                    break;
                case 3 :
                       value = Mounth_Amount.get("Avril");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Avril" , Mounth_Amount.get("Avril") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Avril" , parseDouble(t.getAmount()));
                    }
                    break;
                case 4 :
                       value = Mounth_Amount.get("Mai");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Mai" , Mounth_Amount.get("Mai") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Mai" , parseDouble(t.getAmount()));
                    }
                    break;
                case 5 :
                       value = Mounth_Amount.get("Juin");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Juin" , Mounth_Amount.get("Juin") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Juin" , parseDouble(t.getAmount()));
                    }
                   
                    break;
                 case 6 :
                        value = Mounth_Amount.get("Juillet");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Juillet" , Mounth_Amount.get("Juillet") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Juillet" , parseDouble(t.getAmount()));
                    }
                   
                    break;
                    
                case 7 :
                       value = Mounth_Amount.get("Aout");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Aout" , Mounth_Amount.get("Aout") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Aout" , parseDouble(t.getAmount()));
                    }
                
                    break;
                case 8 :
                      value = Mounth_Amount.get("Septembre");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Septembre" , Mounth_Amount.get("Septembre") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Septembre" , parseDouble(t.getAmount()));
                    }
                    
                    break;
                case 9 :
                      value = Mounth_Amount.get("Octobre");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Octobre" , Mounth_Amount.get("Octobre") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Octobre" , parseDouble(t.getAmount()));
                    }
                    
                    break;
                case 10 :
                       value = Mounth_Amount.get("Novembre");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Novembre" , Mounth_Amount.get("Novembre") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Novembre" , parseDouble(t.getAmount()));
                    }
                    
                    break;
                case 11:
                       value = Mounth_Amount.get("Decembre");
                    if (value != null && !value.isNaN()) {
                        Mounth_Amount.put("Decembre" , Mounth_Amount.get("Decembre") + parseDouble(t.getAmount()));
                    }else{
                         Mounth_Amount.put("Decembre" , parseDouble(t.getAmount()));
                    }
                    
                    break;
            }
        }
         setMonths();
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         Double valeur = 0.0;
         for(String m : mounths){
            Double getOldValue = Mounth_Amount.get(m);
             
             
             
             
             
              Double valueeM = Mounth_Amount.get(m);
                    if (valueeM != null && !valueeM.isNaN()){
                        valeur += valueeM;
                        dataset.setValue( valeur , "Montant", m);
                    }
             
              valeur = Mounth_Amount.get(m);
         }
            
            
         
         
        
        JFreeChart chart = ChartFactory.createBarChart("","Mois","Montant", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        panelLineChart.removeAll();
        panelLineChart.add(barpChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
        
        
    }
     private void setMonths(){
         mounths.add("Janvier");
         mounths.add("Fevrier");
         mounths.add("Mars");
         mounths.add("Avril");
         mounths.add("Mai");
         mounths.add("Juin");
         mounths.add("Juillet");
         mounths.add("Aout");
         mounths.add("Septembre");
         mounths.add("Octobre");
         mounths.add("Novembre");
         mounths.add("Decembre");
     }
    public void showPieChart(Double Withdraw , Double Deposit,Double VirCredit,Double VirDebit , Double Tot){
        

        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue("CREDIT" , Double.valueOf(Deposit* 100 / Balance));  
      barDataset.setValue("DEBIT" , Double.valueOf( -Withdraw* 100 / Balance) );   
     barDataset.setValue("VirCredit" , Double.valueOf( VirCredit* 100 / Balance) ); 
     barDataset.setValue("VirDebit" , Double.valueOf( -VirDebit* 100 / Balance) ); 
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
       piePlot.setSectionPaint("DEBIT", new Color(255,255,102));
        piePlot.setSectionPaint("CREDIT", new Color(102,255,102));
         
        piePlot.setSectionPaint("VirCredit", new Color(255,102,153));
        piePlot.setSectionPaint("VirDebit", new Color(0,204,204));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart1.removeAll();
        panelBarChart1.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart1.validate();
    }

    
    
    public void AnnalyseTransaction(){
        Double Deposit = 0.0;
        Double Withdraw = 0.0;
        Double VirCredit = 0.0;
        Double VirDebit  = 0.0;
        Double Tot = 0.0;
        
        for(Transaction t : transaction){
            
            if(t.getAmount().charAt(0) == '+' && t.getType().isEmpty()){
                Deposit += parseDouble(t.getAmount());
            }else if(t.getAmount().charAt(0) == '-' && t.getType().isEmpty()){   
                Withdraw +=  parseDouble(t.getAmount());
            }else if(t.getAmount().charAt(0) == '+' && !t.getType().isEmpty()){
                VirCredit+= parseDouble(t.getAmount());
            }else if(t.getAmount().charAt(0) == '-' && !t.getType().isEmpty()){
                VirDebit += parseDouble(t.getAmount());
            }
            Tot += parseDouble(t.getAmount());
        }
        showPieChart( Withdraw,Deposit,VirCredit,VirDebit , Tot);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        panelLineChart = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBarChart1 = new javax.swing.JPanel();

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(22, 116, 95));

        jPanel2.setBackground(new java.awt.Color(22, 116, 95));

        panelLineChart.setBackground(new java.awt.Color(255, 255, 255));
        panelLineChart.setPreferredSize(new java.awt.Dimension(600, 400));
        panelLineChart.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Les Statistiques du compte :");

        panelBarChart1.setBackground(new java.awt.Color(255, 255, 255));
        panelBarChart1.setPreferredSize(new java.awt.Dimension(600, 400));
        panelBarChart1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panelBarChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(panelLineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBarChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBarChart1;
    private javax.swing.JPanel panelLineChart;
    // End of variables declaration//GEN-END:variables
}
