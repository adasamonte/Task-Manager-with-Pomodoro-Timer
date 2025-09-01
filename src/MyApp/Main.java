package MyApp;

import MyLib.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
    Task newTask;
    TaskArray ta = new TaskArray();
    int taskCount = 1;
    
    public Main() {
        initComponents();
            openTimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TimerApp timerApp = new TimerApp();
                timerApp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose when closed
                timerApp.setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        taskNameLabel = new javax.swing.JLabel();
        taskNameText = new javax.swing.JTextField();
        dueDateLabel = new javax.swing.JLabel();
        dueDateText = new javax.swing.JTextField();
        taskTypeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        monthLabel = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        dateLabel = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        timeLabel = new javax.swing.JLabel();
        timeText = new javax.swing.JTextField();
        descriptionText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        TMLabel4 = new javax.swing.JLabel();
        TMLabel3 = new javax.swing.JLabel();
        TMLabel5 = new javax.swing.JLabel();
        miaLogo = new javax.swing.JLabel();
        TMLabel6 = new javax.swing.JLabel();
        taskManagerMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        addTaskFile = new javax.swing.JMenuItem();
        updateTaskFile = new javax.swing.JMenuItem();
        setStatusFile = new javax.swing.JMenu();
        notStartedStatus = new javax.swing.JMenuItem();
        inProgressStatus = new javax.swing.JMenuItem();
        completeStatus = new javax.swing.JMenuItem();
        deleteTaskFile = new javax.swing.JMenuItem();
        exitFile = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        clearTaskNameEdit = new javax.swing.JMenuItem();
        clearDueDateSubmenu = new javax.swing.JMenu();
        clearMonthCDD = new javax.swing.JMenuItem();
        clearDateCDD = new javax.swing.JMenuItem();
        clearYearCDD = new javax.swing.JMenuItem();
        clearAllCDD = new javax.swing.JMenuItem();
        clearTimeEdit = new javax.swing.JMenuItem();
        clearTaskTypeEdit = new javax.swing.JMenuItem();
        clearAllEdit = new javax.swing.JMenuItem();
        tableMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        notStartedCount = new javax.swing.JMenuItem();
        inProgressCount = new javax.swing.JMenuItem();
        completedCount = new javax.swing.JMenuItem();
        allCount = new javax.swing.JMenuItem();
        clearTableFile = new javax.swing.JMenuItem();
        timerMenu = new javax.swing.JMenu();
        openTimer = new javax.swing.JMenuItem();
        timerControls = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multipurpose Itenirary Assistant");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(248, 250, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taskNameLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        taskNameLabel.setText("Task Name:");
        jPanel1.add(taskNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        taskNameText.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jPanel1.add(taskNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 151, -1));

        dueDateLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        dueDateLabel.setText("Due Date: ");
        jPanel1.add(dueDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        dueDateText.setEditable(false);
        dueDateText.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        dueDateText.setText("MM / DD / YYYY");
        jPanel1.add(dueDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 151, -1));

        taskTypeLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        taskTypeLabel.setText("Task Type:");
        jPanel1.add(taskTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        taskTable.setBackground(new java.awt.Color(248, 250, 240));
        taskTable.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task Name", "Due Date", "Due Time", "Task Type", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        taskTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        taskTable.setRowSelectionAllowed(false);
        taskTable.setShowHorizontalLines(false);
        taskTable.getTableHeader().setReorderingAllowed(false);
        taskTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(taskTable);
        if (taskTable.getColumnModel().getColumnCount() > 0) {
            taskTable.getColumnModel().getColumn(0).setResizable(false);
            taskTable.getColumnModel().getColumn(1).setResizable(false);
            taskTable.getColumnModel().getColumn(2).setResizable(false);
            taskTable.getColumnModel().getColumn(3).setResizable(false);
            taskTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 667, 280));

        monthLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        monthLabel.setText("Month:");
        jPanel1.add(monthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        monthComboBox.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a month...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(monthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 150, -1));

        dateLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        dateLabel.setText("Date:");
        jPanel1.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        dateText.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jPanel1.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 151, -1));

        yearLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        yearLabel.setText("Year:");
        jPanel1.add(yearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        yearText.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jPanel1.add(yearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 151, -1));

        timeLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        timeLabel.setText("Time:");
        jPanel1.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        timeText.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jPanel1.add(timeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 151, -1));

        descriptionText.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jPanel1.add(descriptionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 151, -1));

        jPanel2.setBackground(new java.awt.Color(136, 171, 117));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TMLabel4.setBackground(new java.awt.Color(248, 250, 240));
        TMLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        TMLabel4.setForeground(new java.awt.Color(248, 250, 240));
        TMLabel4.setText("TASK MANAGER");
        jPanel2.add(TMLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1030, 90));

        TMLabel3.setBackground(new java.awt.Color(136, 171, 117));
        TMLabel3.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        TMLabel3.setForeground(new java.awt.Color(136, 171, 117));
        TMLabel3.setText("MIA");
        jPanel1.add(TMLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 50));

        TMLabel5.setBackground(new java.awt.Color(136, 171, 117));
        TMLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        TMLabel5.setForeground(new java.awt.Color(136, 171, 117));
        TMLabel5.setText("\"YOUR TASK, YOUR TIME, YOUR WAY\"");
        jPanel1.add(TMLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, 30));

        miaLogo.setForeground(new java.awt.Color(248, 250, 240));
        miaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyApp/booklogo.png"))); // NOI18N
        jPanel1.add(miaLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        TMLabel6.setBackground(new java.awt.Color(136, 171, 117));
        TMLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        TMLabel6.setForeground(new java.awt.Color(136, 171, 117));
        TMLabel6.setText("MULTIPURPOSE ITENERARY ASSISTANT");
        jPanel1.add(TMLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 30));

        fileMenu.setMnemonic('F');
        fileMenu.setText("File");

        addTaskFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        addTaskFile.setMnemonic('A');
        addTaskFile.setText("Add Task");
        addTaskFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuEvent(evt);
            }
        });
        fileMenu.add(addTaskFile);

        updateTaskFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        updateTaskFile.setMnemonic('U');
        updateTaskFile.setText("Update Task");
        updateTaskFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuEvent(evt);
            }
        });
        fileMenu.add(updateTaskFile);

        setStatusFile.setMnemonic('S');
        setStatusFile.setText("Set Status");

        notStartedStatus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_MASK));
        notStartedStatus.setMnemonic('N');
        notStartedStatus.setText("Not Started");
        notStartedStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStatusEvent(evt);
            }
        });
        setStatusFile.add(notStartedStatus);

        inProgressStatus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK));
        inProgressStatus.setMnemonic('I');
        inProgressStatus.setText("In Progress");
        inProgressStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStatusEvent(evt);
            }
        });
        setStatusFile.add(inProgressStatus);

        completeStatus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        completeStatus.setMnemonic('C');
        completeStatus.setText("Complete");
        completeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStatusEvent(evt);
            }
        });
        setStatusFile.add(completeStatus);

        fileMenu.add(setStatusFile);

        deleteTaskFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        deleteTaskFile.setMnemonic('D');
        deleteTaskFile.setText("Delete Task");
        deleteTaskFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuEvent(evt);
            }
        });
        fileMenu.add(deleteTaskFile);

        exitFile.setText("Exit");
        exitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileEvent(evt);
            }
        });
        fileMenu.add(exitFile);

        taskManagerMenuBar.add(fileMenu);

        editMenu.setMnemonic('E');
        editMenu.setText("Edit");

        clearTaskNameEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        clearTaskNameEdit.setMnemonic('N');
        clearTaskNameEdit.setText("Clear Task Name");
        clearTaskNameEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuEvent(evt);
            }
        });
        editMenu.add(clearTaskNameEdit);

        clearDueDateSubmenu.setMnemonic('D');
        clearDueDateSubmenu.setText("Clear Due Date");

        clearMonthCDD.setText("Clear Month");
        clearMonthCDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDueDateEvent(evt);
            }
        });
        clearDueDateSubmenu.add(clearMonthCDD);

        clearDateCDD.setText("Clear Date");
        clearDateCDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDueDateEvent(evt);
            }
        });
        clearDueDateSubmenu.add(clearDateCDD);

        clearYearCDD.setText("Clear Year");
        clearYearCDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDueDateEvent(evt);
            }
        });
        clearDueDateSubmenu.add(clearYearCDD);

        clearAllCDD.setText("Clear All Due Date");
        clearAllCDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDueDateEvent(evt);
            }
        });
        clearDueDateSubmenu.add(clearAllCDD);

        editMenu.add(clearDueDateSubmenu);

        clearTimeEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        clearTimeEdit.setMnemonic('t');
        clearTimeEdit.setText("Clear Time");
        clearTimeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuEvent(evt);
            }
        });
        editMenu.add(clearTimeEdit);

        clearTaskTypeEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        clearTaskTypeEdit.setMnemonic('T');
        clearTaskTypeEdit.setText("Clear Task Type");
        clearTaskTypeEdit.setToolTipText("");
        clearTaskTypeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuEvent(evt);
            }
        });
        editMenu.add(clearTaskTypeEdit);

        clearAllEdit.setMnemonic('A');
        clearAllEdit.setText("Clear All");
        clearAllEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuEvent(evt);
            }
        });
        editMenu.add(clearAllEdit);

        taskManagerMenuBar.add(editMenu);

        tableMenu.setMnemonic('b');
        tableMenu.setText("Table");

        jMenu2.setMnemonic('o');
        jMenu2.setText("Count");

        notStartedCount.setMnemonic('N');
        notStartedCount.setText("By Not Started");
        notStartedCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableMenuEvent(evt);
            }
        });
        jMenu2.add(notStartedCount);

        inProgressCount.setMnemonic('I');
        inProgressCount.setText("By In Progress");
        inProgressCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableMenuEvent(evt);
            }
        });
        jMenu2.add(inProgressCount);

        completedCount.setMnemonic('C');
        completedCount.setText("By Completed");
        completedCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableMenuEvent(evt);
            }
        });
        jMenu2.add(completedCount);

        allCount.setMnemonic('A');
        allCount.setText("By All Records");
        allCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableMenuEvent(evt);
            }
        });
        jMenu2.add(allCount);

        tableMenu.add(jMenu2);

        clearTableFile.setMnemonic('l');
        clearTableFile.setText("Clear Table");
        clearTableFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableMenuEvent(evt);
            }
        });
        tableMenu.add(clearTableFile);

        taskManagerMenuBar.add(tableMenu);

        timerMenu.setMnemonic('m');
        timerMenu.setText("Timer");

        openTimer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        openTimer.setMnemonic('O');
        openTimer.setText("Open Timer");
        openTimer.setToolTipText("");
        timerMenu.add(openTimer);

        timerControls.setMnemonic('C');
        timerControls.setText("Timer Controls");
        timerControls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerMenuEvent(evt);
            }
        });
        timerMenu.add(timerControls);

        taskManagerMenuBar.add(timerMenu);

        helpMenu.setMnemonic('H');
        helpMenu.setText("Help");

        aboutHelp.setMnemonic('A');
        aboutHelp.setText("About");
        aboutHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuEvent(evt);
            }
        });
        helpMenu.add(aboutHelp);

        taskManagerMenuBar.add(helpMenu);

        setJMenuBar(taskManagerMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskTableMouseClicked
        // mouse event handler for selecting rows in the table
        int selectedRow = taskTable.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel)taskTable.getModel();
        taskNameText.setText(model.getValueAt(selectedRow, 0).toString());
        dueDateText.setText(model.getValueAt(selectedRow, 1).toString());
        monthComboBox.setSelectedIndex(ta.tasks[selectedRow].getTaskDueDate().getMonth());
        dateText.setText(ta.tasks[selectedRow].getTaskDueDate().getDate());
        yearText.setText(ta.tasks[selectedRow].getTaskDueDate().getYear());
        timeText.setText((String) model.getValueAt(selectedRow, 2));
        descriptionText.setText(model.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_taskTableMouseClicked

    private void fileMenuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuEvent
        // menu event for file menu
        Object source = evt.getSource();
        String dueDate;
        int checkDateLength;
        
        checkDateLength = isMonthDateValid();
        
        // add inputs into task table
        if (source == addTaskFile) { 
            if (monthComboBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please select a month.", "Error: Invalid Month", JOptionPane.ERROR_MESSAGE);
            }
            else if (Integer.parseInt(dateText.getText()) < 0)
                JOptionPane.showMessageDialog(this, dateText.getText() + " is not a valid day! Input a real date.", "Error: Invalid Day", JOptionPane.ERROR_MESSAGE);
            else if (checkDateLength == 0 && Integer.parseInt(dateText.getText()) > 31)
                JOptionPane.showMessageDialog(this, dateText.getText() + " is not a valid day! Input a real date.", "Error: Invalid Day", JOptionPane.ERROR_MESSAGE);
            else if (checkDateLength == 1 && Integer.parseInt(dateText.getText()) > 30)
                JOptionPane.showMessageDialog(this, dateText.getText() + " is not a valid day! Input a real date.", "Error: Invalid Day", JOptionPane.ERROR_MESSAGE);
            else if (checkDateLength == 2 && Integer.parseInt(dateText.getText()) > 29)
                JOptionPane.showMessageDialog(this, dateText.getText() + " is not a valid day on February! Input a real date.", "Error: Invalid Day", JOptionPane.ERROR_MESSAGE);         
            else if (checkDateLength == 3 && Integer.parseInt(dateText.getText()) == 29)
                JOptionPane.showMessageDialog(this, dateText.getText() + " is not a valid day on February! Year selected is NOT a LEAP YEAR. Input a real date.", "Error: Invalid Day", JOptionPane.ERROR_MESSAGE);
            else if (checkDateLength == 3 && Integer.parseInt(dateText.getText()) > 28)
                JOptionPane.showMessageDialog(this, dateText.getText() + " is not a valid day on February! Input a real date.", "Error: Invalid Day", JOptionPane.ERROR_MESSAGE);
            else{   
                DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
                dueDate = setDate();
                newTask = new Task(taskCount, taskNameText.getText(), new dueDate(monthComboBox.getSelectedIndex(), dateText.getText(), 
                        yearText.getText()), descriptionText.getText(), "Not Started");
                taskCount++;
                model.addRow(new Object[]{taskNameText.getText(), dueDate, timeText.getText(), descriptionText.getText(), "Not Started"});
                ta.addTask(newTask);
                taskNameText.setText("");
                dueDateText.setText("MM / DD / YYYY");
                monthComboBox.setSelectedItem("Select a month...");
                dateText.setText("");
                yearText.setText("");
                timeText.setText("");
                descriptionText.setText("");                    
            }
        }
        // update selected task
        else if (source == updateTaskFile) { 
            int i = taskTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
            if (i >= 0) {
                dueDate = setDate();
                model.setValueAt(taskNameText.getText(), i, 0);
                model.setValueAt(dueDate, i, 1);
                model.setValueAt(timeText.getText(), i, 2);
                model.setValueAt(descriptionText.getText(), i, 3);
                ta.tasks[i].setTaskName(taskNameText.getText());
                ta.tasks[i].setTaskDueDate( new dueDate(monthComboBox.getSelectedIndex(), dateText.getText(), 
                        yearText.getText()));
                ta.tasks[i].setTaskDesc(descriptionText.getText());
                
                taskNameText.setText("");
                dueDateText.setText("MM / DD / YYYY");
                monthComboBox.setSelectedItem("Select a month...");
                dateText.setText("");
                yearText.setText("");
                timeText.setText("");
                descriptionText.setText("");
            } else 
                JOptionPane.showMessageDialog(null, "Error!");
        }
        // delete task at selected row
        else if (source == deleteTaskFile) { 
            int SelectedRowIndex = taskTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
            model.removeRow(SelectedRowIndex);
            taskNameText.setText("");
            dueDateText.setText("MM / DD / YYYY");
            monthComboBox.setSelectedItem("Select a month...");
            dateText.setText("");
            yearText.setText("");
            timeText.setText("");
            descriptionText.setText("");
            JOptionPane.showMessageDialog(this, "Record is NOW DELETED.", "Delete task", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_fileMenuEvent

    private void setStatusEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStatusEvent
        // event for setting status
        Object source = evt.getSource();
        String dueDate;
        
        // set status of selected task to 'Not Started'
        if (source == notStartedStatus) {
            int i = taskTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
            if (i >= 0) {
                dueDate = setDate();
                model.setValueAt("Not Started", i, 4);
                taskNameText.setText("");
                dueDateText.setText("MM / DD / YYYY");
                monthComboBox.setSelectedItem("Select a month...");
                dateText.setText("");
                yearText.setText("");
                timeText.setText("");
                descriptionText.setText("");
            }
        }
        
        // set status of selected task to 'In Progress' 
        else if (source == inProgressStatus) {
            int i = taskTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
            if (i >= 0) {
                dueDate = setDate();
                model.setValueAt("In Progress", i, 4);
                taskNameText.setText("");
                dueDateText.setText("MM / DD / YYYY");
                monthComboBox.setSelectedItem("Select a month...");
                dateText.setText("");
                yearText.setText("");
                timeText.setText("");
                descriptionText.setText("");
            }
        }
        
        // set status of selected task to 'Complete'
        else {
            int i = taskTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
            if (i >= 0) {
                dueDate = setDate();
                model.setValueAt("Completed", i, 4);
                taskNameText.setText("");
                dueDateText.setText("MM / DD / YYYY");
                monthComboBox.setSelectedItem("Select a month...");
                dateText.setText("");
                yearText.setText("");
                timeText.setText("");
                descriptionText.setText("");
            }
        }
    }//GEN-LAST:event_setStatusEvent

    private void clearDueDateEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearDueDateEvent
        // clear due date event handler
        Object source = evt.getSource();
        
        // clear the month combo box
        if (source == clearMonthCDD) {
            if (monthComboBox.getSelectedIndex() == 0)
                JOptionPane.showMessageDialog(this, "Month is already clear.", "Due Month", JOptionPane.INFORMATION_MESSAGE);
            else {
                monthComboBox.setSelectedIndex(0);
                JOptionPane.showMessageDialog(this, "Month is clear.", "Due Month", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        // clear date from text field
        else if (source == clearDateCDD) {
            if ("".equals(dateText.getText())) {
                JOptionPane.showMessageDialog(this, "Date is already clear.", "Due Date", JOptionPane.INFORMATION_MESSAGE);
            } else {
                dateText.setText("");
                JOptionPane.showMessageDialog(this, "Date is cleared.", "Due Date", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        // clear year from text field
        else if (source == clearYearCDD) {
            if ("".equals(yearText.getText())) {
                JOptionPane.showMessageDialog(this, "Year is already clear.", "Due Year", JOptionPane.INFORMATION_MESSAGE);
            } else {
                yearText.setText("");
                JOptionPane.showMessageDialog(this, "Year is cleared.", "Due Year", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        // clear all from date fields
        else {
            monthComboBox.setSelectedIndex(0);
            dateText.setText("");
            yearText.setText("");
        }
    }//GEN-LAST:event_clearDueDateEvent

    private void editMenuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuEvent
        // edit menu event handler
        Object source = evt.getSource();

        // clear task name text field
        if (source == clearTaskNameEdit) {
            if ("".equals(taskNameText.getText())) {
                JOptionPane.showMessageDialog(this, "Task Name is already clear.", "Task Name", JOptionPane.INFORMATION_MESSAGE);
            } else {
                taskNameText.setText("");
                JOptionPane.showMessageDialog(this, "Task Name is cleared.", "Task Name", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        
        // clear time text field
        else if (source == clearTimeEdit) {
            if ("".equals(timeText.getText())) {
                JOptionPane.showMessageDialog(this, "Time is already clear.", "Time Name", JOptionPane.INFORMATION_MESSAGE);
            } else {
                timeText.setText("");
                JOptionPane.showMessageDialog(this, "Time Name is cleared.", "Time Name", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        
        // clear task type text field
        else if (source == clearTaskTypeEdit) {
            if ("".equals(descriptionText.getText())) {
                JOptionPane.showMessageDialog(this, "Task Type is already clear.", "Task Type", JOptionPane.INFORMATION_MESSAGE);
            } else {
                descriptionText.setText("");
                JOptionPane.showMessageDialog(this, "Task Type is cleared.", "Task Type", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        
        // clear all fields
        else {
            taskNameText.setText("");
            dueDateText.setText("MM / DD / YYYY");
            monthComboBox.setSelectedIndex(0);
            dateText.setText("");
            yearText.setText("");
            timeText.setText("");
            descriptionText.setText("");
            JOptionPane.showMessageDialog(this, "Everything is cleared.", "Clear all", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_editMenuEvent

    private void tableMenuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableMenuEvent
        // table menu event handler
        Object source = evt.getSource();
        DefaultTableModel model = (DefaultTableModel) taskTable.getModel();
        int count, nsCount = 0, ipCount = 0, cCount = 0;
        
        // return number of tasks that are 'not started'
        if (source == notStartedCount) {
            for (int i = 0; i < taskTable.getRowCount (); i++) {
                if (model.getValueAt(i, 4) == "Not Started")
                    nsCount++;
            }
            JOptionPane.showMessageDialog(this, "Number of tasks that are NOT STARTED yet is " + nsCount + ".", "Not Started Count", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // return number of tasks that are 'in progress'
        else if (source == inProgressCount) {
            for (int i = 0; i < taskTable.getRowCount(); i++) {
                if (model.getValueAt(i, 4) == "In Progress") {
                    ipCount++;
                }
            }
            JOptionPane.showMessageDialog(this, "Number of tasks that are IN PROGRESS is " + ipCount + ".", "In Progress Count", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // return number of tasks that are 'completed'
        else if (source == completedCount) {
            for (int i = 0; i < taskTable.getRowCount(); i++) {
                if (model.getValueAt(i, 4) == "Completed") {
                    cCount++;
                }
            }
            JOptionPane.showMessageDialog(this, "Number of tasks that are COMPLETED is " + cCount + ".", "Complete Count", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // return total number of tasks
        else if (source == allCount){
            count = taskTable.getRowCount();
            JOptionPane.showMessageDialog(this, "TOTAL number of tasks is " + count + ".", "Total Count", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // deleting all records
        else {
            int confirmation = JOptionPane.showConfirmDialog(this, "Proceeding means ALL records from the table will be DELETED.\n\nAre you sure you want to proceed?",
                    "Confirm Delete Table Records", JOptionPane.OK_CANCEL_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                model.setRowCount(0);
                JOptionPane.showMessageDialog(this, "All Table records are now DELETED.", "Delete Table Records", JOptionPane.INFORMATION_MESSAGE);   
            }
        }
    }//GEN-LAST:event_tableMenuEvent

    private void helpMenuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuEvent
        // help menu event]
        JOptionPane.showMessageDialog(this, "Multipurpose Itenerary Assistant (MIA):\nCSS124L M2 Project\n\nsubmitted to:\nMs. Antonette Gabriel"
                + "\n\nsubmitted by:\nAnne Grace Bellen\nRoland Oscar Castaneda\nMaria Alessandra Capili"
                + "\nArvin Garcia\nAdriel Denzel Samonte\n\nSection:\nBM2\n\nDate:\nOctober 26, 2023", "About Us", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpMenuEvent

    private void timerMenuEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerMenuEvent
        // timer menu event
        JOptionPane.showMessageDialog(this, "How to Use Timer:\n\nRight-click timer (RMB): Edit timer input HH:MM:SS"
                + "\nLeft-Click label(LMB): Change label text", "How-to Timer", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_timerMenuEvent

    private void exitFileEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileEvent
        // exit program event
        System.exit(0);
    }//GEN-LAST:event_exitFileEvent

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            // create and display the form
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    // setting date string for table
    public String setDate() {
        return monthComboBox.getSelectedIndex() + " / " + dateText.getText() + " / " + yearText.getText();
    } 
    
    public int isMonthDateValid() {
        //checking for date count validity
        int isLong;
        int year = Integer.parseInt(yearText.getText());
        
        switch (monthComboBox.getSelectedIndex()) {
            // flag for dates that have 31, 30, 29, and 28 days
            case 2: {
                if (year % 4 == 0) {
                    if (year % 100 != 0 || year % 400 == 0) {
                        isLong = 2;
                    }
                    else
                        isLong = 3;
                }
               else 
                    isLong = 3;
                break;
            }
            case 4:
                isLong = 1;
                break;
            case 6:
                isLong = 1;
                break;
            case 9:
                isLong = 1;
                break;
            case 11: 
               isLong = 1;
               break;
            default:
                isLong = 0;
        }
        
        return isLong;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TMLabel3;
    private javax.swing.JLabel TMLabel4;
    private javax.swing.JLabel TMLabel5;
    private javax.swing.JLabel TMLabel6;
    private javax.swing.JMenuItem aboutHelp;
    private javax.swing.JMenuItem addTaskFile;
    private javax.swing.JMenuItem allCount;
    private javax.swing.JMenuItem clearAllCDD;
    private javax.swing.JMenuItem clearAllEdit;
    private javax.swing.JMenuItem clearDateCDD;
    private javax.swing.JMenu clearDueDateSubmenu;
    private javax.swing.JMenuItem clearMonthCDD;
    private javax.swing.JMenuItem clearTableFile;
    private javax.swing.JMenuItem clearTaskNameEdit;
    private javax.swing.JMenuItem clearTaskTypeEdit;
    private javax.swing.JMenuItem clearTimeEdit;
    private javax.swing.JMenuItem clearYearCDD;
    private javax.swing.JMenuItem completeStatus;
    private javax.swing.JMenuItem completedCount;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateText;
    private javax.swing.JMenuItem deleteTaskFile;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JLabel dueDateLabel;
    private javax.swing.JTextField dueDateText;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitFile;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem inProgressCount;
    private javax.swing.JMenuItem inProgressStatus;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel miaLogo;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JMenuItem notStartedCount;
    private javax.swing.JMenuItem notStartedStatus;
    private javax.swing.JMenuItem openTimer;
    private javax.swing.JMenu setStatusFile;
    private javax.swing.JMenu tableMenu;
    private javax.swing.JMenuBar taskManagerMenuBar;
    private javax.swing.JLabel taskNameLabel;
    private javax.swing.JTextField taskNameText;
    private javax.swing.JTable taskTable;
    private javax.swing.JLabel taskTypeLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField timeText;
    private javax.swing.JMenuItem timerControls;
    private javax.swing.JMenu timerMenu;
    private javax.swing.JMenuItem updateTaskFile;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
