/*
 *
 *
 *
 */

package com.alireza6677.jtaskbarlib.sample;

import com.alireza6677.jtaskbarlib.JProgressState;
import com.alireza6677.jtaskbarlib.JTaskbarController;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.GroupLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSlider;
import javax.swing.JSeparator;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JLabel;

/**
 *
 * @author Win8.1
 */
public class Main extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 6029508861129496616L;

	/**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        if(!System.getProperty("os.name").contains("Windows")){
            System.err.println("This app only runs in windows 7,8,8.1,10 + ...");
            System.exit(1);
            return;
        }
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
    
    private final JTaskbarController j;

    
    // UI variables :
    private javax.swing.JButton flashBtn;
    private javax.swing.JButton normalBtn;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton indBtn;
    private javax.swing.JButton NoProgressBtn;
    private javax.swing.JButton setMaxButton;
    private javax.swing.JButton tooltipSetButton;
    private javax.swing.JFormattedTextField maxTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar taskbarProgress;
    private javax.swing.JSlider valueSlider;
    private javax.swing.JButton stpoBtn;
    private JSeparator separator_1;
    private JTextField tooltipTextField;
    
    public Main() {

        initComponents();
        setTitle("Sample JTaskbarLib");
        setVisible(true); 
        j = new JTaskbarController(this);
        j.setProgressState(JProgressState.NORMAL);
        j.setProgressValue(50);
        j.setThumbnailTooltip("Test !");
      //  j.setThumbnailClip(50, 50, 50, 50);
        valueSlider.setValue(50);
        taskbarProgress.setValue(50);       

    }

    private void initComponents() {

        valueSlider = new javax.swing.JSlider();
        normalBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pauseBtn = new javax.swing.JButton();
        stpoBtn = new javax.swing.JButton();
        indBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        NoProgressBtn = new javax.swing.JButton();
        flashBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        taskbarProgress = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        setMaxButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        maxTextField = new javax.swing.JFormattedTextField();
        tooltipSetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        valueSlider.setValue(0);
        valueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
                jSlider1StateChanged1(evt);
            }
        });

        normalBtn.setBackground(new java.awt.Color(0, 153, 51));
        normalBtn.setForeground(new java.awt.Color(0, 153, 51));
        normalBtn.setText("Normal");
        normalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("JTaskBarLib");

        pauseBtn.setBackground(new java.awt.Color(255, 153, 0));
        pauseBtn.setForeground(new java.awt.Color(255, 153, 0));
        pauseBtn.setText("Pause");
        pauseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        stpoBtn.setBackground(new java.awt.Color(255, 0, 0));
        stpoBtn.setForeground(new java.awt.Color(255, 0, 0));
        stpoBtn.setText("Stop");
        stpoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stpoBtnActionPerformed(evt);
            }
        });

        indBtn.setBackground(new java.awt.Color(153, 51, 255));
        indBtn.setForeground(new java.awt.Color(153, 0, 255));
        indBtn.setText("Indeterminate");
        indBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("State :");

        jLabel3.setText("Value :");

        NoProgressBtn.setBackground(new java.awt.Color(0, 0, 0));
        NoProgressBtn.setText("No Progress");
        NoProgressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        flashBtn.setBackground(new java.awt.Color(255, 255, 0));
        flashBtn.setText("Flash icon !");
        flashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 51));
        jLabel4.setText("Developer : alireza6677");

        jLabel5.setText("Max (default=100) :");

        setMaxButton.setText("set");
        setMaxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("100");

        jLabel7.setText("0");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("TaskBar :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Window :");

        jLabel11.setText("Opacity :");

        maxTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        tooltipSetButton.setText("Set Tooltip");
        tooltipSetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        
        final JSlider opacitySlider = new JSlider();
        opacitySlider.setMaximum(255);
        opacitySlider.setValue(255);
        opacitySlider.setMinimum(20);
        opacitySlider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				j.setWindowOpacity(opacitySlider.getValue());
			}
		});
        
        separator_1 = new JSeparator();
        separator_1.setForeground(Color.DARK_GRAY);
        separator_1.setOrientation(SwingConstants.VERTICAL);
        
        tooltipTextField = new JTextField();
        tooltipTextField.setColumns(10);
        
        JLabel label = new JLabel("(20 - 255)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(165)
        					.addComponent(jLabel4))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(23)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel7)
        							.addPreferredGap(ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
        							.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
        							.addGap(152)
        							.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
        						.addComponent(valueSlider, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        						.addComponent(taskbarProgress, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel2)
        								.addComponent(jLabel3)
        								.addGroup(layout.createSequentialGroup()
        									.addGap(27)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(NoProgressBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(indBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(stpoBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(pauseBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(normalBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        									.addGap(53)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(tooltipTextField)
        										.addComponent(maxTextField, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        										.addComponent(jLabel5)
        										.addComponent(setMaxButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(tooltipSetButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        							.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
        							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel11)
        										.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        											.addComponent(flashBtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        											.addComponent(opacitySlider, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
        									.addGap(6))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(label)
        									.addGap(54)))))))
        			.addContainerGap(35, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(183, Short.MAX_VALUE)
        			.addComponent(jLabel1)
        			.addGap(194))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(83)
        			.addComponent(jLabel9)
        			.addPreferredGap(ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
        			.addComponent(jLabel10)
        			.addGap(83))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addGap(4)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9)
        				.addComponent(jLabel10))
        			.addGap(9)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel2)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(NoProgressBtn)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(normalBtn)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(pauseBtn))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel5)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(maxTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(setMaxButton)))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(stpoBtn)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(indBtn))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(tooltipTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(tooltipSetButton))))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(11)
        							.addComponent(jLabel11)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(opacitySlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(label)
        							.addGap(31)
        							.addComponent(flashBtn, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addComponent(jLabel3))
        				.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(valueSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jLabel7)
        				.addComponent(jLabel8))
        			.addGap(5)
        			.addComponent(taskbarProgress, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel4)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {

        if(!(j.getProgressState()==JProgressState.INDETERMINATE) && !(j.getProgressState()==JProgressState.NO_PROGRESS))
             j.setProgressValue(valueSlider.getValue());
        jLabel8.setText(Integer.toString(valueSlider.getValue()));
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        taskbarProgress.setIndeterminate(false);
        j.setProgressState(JProgressState.NORMAL); 
        j.setProgressValue(valueSlider.getValue());
        taskbarProgress.setValue(valueSlider.getValue());
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        j.setProgressState(JProgressState.PAUSE);
        taskbarProgress.setIndeterminate(false);
        j.setProgressValue(valueSlider.getValue());
        taskbarProgress.setValue(valueSlider.getValue()); 
    }

    private void stpoBtnActionPerformed(java.awt.event.ActionEvent evt) {
       j.setProgressState(JProgressState.STOP_ERROR);
       j.setProgressValue(valueSlider.getValue());
       taskbarProgress.setIndeterminate(false);
       taskbarProgress.setValue(valueSlider.getValue()); 
       
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        j.setProgressState(JProgressState.INDETERMINATE);
        taskbarProgress.setIndeterminate(true);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        j.setProgressState(JProgressState.NO_PROGRESS);
        taskbarProgress.setIndeterminate(false);
        taskbarProgress.setValue(0);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        j.flashWindow();
    }

    private void jSlider1StateChanged1(javax.swing.event.ChangeEvent evt) {
        if(!(j.getProgressState()==JProgressState.INDETERMINATE) && !(j.getProgressState()==JProgressState.NO_PROGRESS))
            taskbarProgress.setValue(valueSlider.getValue());
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {

        int i = 0;
        try{
            i = Integer.parseInt(maxTextField.getText());
        }
        catch(Exception e){
            System.err.println(maxTextField.getText() + " : not supported");
            return;
        }
        if(maxTextField.getText().length()>0){
            j.setMax(i);
            valueSlider.setMaximum(i);
            taskbarProgress.setMaximum(i);
            jLabel6.setText(Integer.toString(i));
        }
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        j.setThumbnailTooltip(tooltipTextField.getText());
    }
}
