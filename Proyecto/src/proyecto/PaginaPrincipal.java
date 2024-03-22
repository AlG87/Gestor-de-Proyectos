/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

/**
 *
 * @author asus
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbHomeUserName = new javax.swing.JLabel();
        jPanelProyectos = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanelMisProyectos = new javax.swing.JPanel();
        jPanelProyectosCompartidos = new javax.swing.JPanel();
        jPanelTareas = new javax.swing.JPanel();
        jPanelCuenta = new javax.swing.JPanel();
        jPanelInformacionDelUsuario = new javax.swing.JPanel();
        lbUserName = new javax.swing.JLabel();
        lbTitleUserName = new javax.swing.JLabel();
        lbTitleName = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbTitleEmail = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        lbTitleContraseña = new javax.swing.JLabel();
        jPanelCambioUsername = new javax.swing.JPanel();
        lbCambiarUserName = new javax.swing.JLabel();
        txtCambioDeUserName = new javax.swing.JTextField();
        btCambiarUserName = new javax.swing.JButton();
        jPanelCambioUsername1 = new javax.swing.JPanel();
        lbCambiarNombre = new javax.swing.JLabel();
        txtCambioDeNombre = new javax.swing.JTextField();
        btCambiarNombre = new javax.swing.JButton();
        jPanelCambioUsername2 = new javax.swing.JPanel();
        lbCambiarCorreo = new javax.swing.JLabel();
        txtCambioDeCorreo = new javax.swing.JTextField();
        btCambiarCorreo = new javax.swing.JButton();
        jPanelCambioUsername3 = new javax.swing.JPanel();
        lbCambiarContraseña = new javax.swing.JLabel();
        txtCambioDeContraseña = new javax.swing.JTextField();
        btCambiarContraseña = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        lbHomeUserName.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbHomeUserName.setText("@username");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHomeUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHomeUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 335, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", jPanelInicio);

        javax.swing.GroupLayout jPanelMisProyectosLayout = new javax.swing.GroupLayout(jPanelMisProyectos);
        jPanelMisProyectos.setLayout(jPanelMisProyectosLayout);
        jPanelMisProyectosLayout.setHorizontalGroup(
            jPanelMisProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jPanelMisProyectosLayout.setVerticalGroup(
            jPanelMisProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Mis Proyectos", jPanelMisProyectos);

        javax.swing.GroupLayout jPanelProyectosCompartidosLayout = new javax.swing.GroupLayout(jPanelProyectosCompartidos);
        jPanelProyectosCompartidos.setLayout(jPanelProyectosCompartidosLayout);
        jPanelProyectosCompartidosLayout.setHorizontalGroup(
            jPanelProyectosCompartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jPanelProyectosCompartidosLayout.setVerticalGroup(
            jPanelProyectosCompartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Proyectos Compartidos", jPanelProyectosCompartidos);

        javax.swing.GroupLayout jPanelProyectosLayout = new javax.swing.GroupLayout(jPanelProyectos);
        jPanelProyectos.setLayout(jPanelProyectosLayout);
        jPanelProyectosLayout.setHorizontalGroup(
            jPanelProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProyectosLayout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanelProyectosLayout.setVerticalGroup(
            jPanelProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProyectosLayout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Proyectos", jPanelProyectos);

        javax.swing.GroupLayout jPanelTareasLayout = new javax.swing.GroupLayout(jPanelTareas);
        jPanelTareas.setLayout(jPanelTareasLayout);
        jPanelTareasLayout.setHorizontalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        jPanelTareasLayout.setVerticalGroup(
            jPanelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tareas", jPanelTareas);

        jPanelInformacionDelUsuario.setBackground(new java.awt.Color(204, 204, 204));

        lbUserName.setText("@username");

        lbTitleUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTitleUserName.setText("Nombre de usuario");

        lbTitleName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTitleName.setText("Nombre");

        lbName.setText("nombre del usuario");

        lbEmail.setText("correo del usuario");

        lbTitleEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTitleEmail.setText("Correo electronico");

        lbContraseña.setText("**********");

        lbTitleContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTitleContraseña.setText("Contraseña");

        javax.swing.GroupLayout jPanelInformacionDelUsuarioLayout = new javax.swing.GroupLayout(jPanelInformacionDelUsuario);
        jPanelInformacionDelUsuario.setLayout(jPanelInformacionDelUsuarioLayout);
        jPanelInformacionDelUsuarioLayout.setHorizontalGroup(
            jPanelInformacionDelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacionDelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformacionDelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitleUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitleName, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitleEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitleContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(lbContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelInformacionDelUsuarioLayout.setVerticalGroup(
            jPanelInformacionDelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacionDelUsuarioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbTitleUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUserName)
                .addGap(18, 18, 18)
                .addComponent(lbTitleName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbName)
                .addGap(18, 18, 18)
                .addComponent(lbTitleEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEmail)
                .addGap(18, 18, 18)
                .addComponent(lbTitleContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbContraseña)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCambioUsername.setBackground(new java.awt.Color(153, 153, 153));
        jPanelCambioUsername.setPreferredSize(new java.awt.Dimension(374, 100));

        lbCambiarUserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCambiarUserName.setText("Cambiar nombre de usuario");

        txtCambioDeUserName.setBackground(new java.awt.Color(204, 204, 204));
        txtCambioDeUserName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCambioDeUserName.setText("jTextField1");
        txtCambioDeUserName.setToolTipText("");
        txtCambioDeUserName.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        txtCambioDeUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioDeUserNameActionPerformed(evt);
            }
        });

        btCambiarUserName.setBackground(new java.awt.Color(204, 204, 204));
        btCambiarUserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCambiarUserName.setText("Cambiar");
        btCambiarUserName.setBorder(null);

        javax.swing.GroupLayout jPanelCambioUsernameLayout = new javax.swing.GroupLayout(jPanelCambioUsername);
        jPanelCambioUsername.setLayout(jPanelCambioUsernameLayout);
        jPanelCambioUsernameLayout.setHorizontalGroup(
            jPanelCambioUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambioUsernameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCambioUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCambiarUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCambioDeUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCambiarUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanelCambioUsernameLayout.setVerticalGroup(
            jPanelCambioUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambioUsernameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCambiarUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCambioUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCambioDeUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCambiarUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelCambioUsername1.setBackground(new java.awt.Color(153, 153, 153));
        jPanelCambioUsername1.setPreferredSize(new java.awt.Dimension(374, 100));

        lbCambiarNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCambiarNombre.setText("Cambiar nombre ");

        txtCambioDeNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtCambioDeNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCambioDeNombre.setText("jTextField1");
        txtCambioDeNombre.setToolTipText("");
        txtCambioDeNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        txtCambioDeNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioDeNombreActionPerformed(evt);
            }
        });

        btCambiarNombre.setBackground(new java.awt.Color(204, 204, 204));
        btCambiarNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCambiarNombre.setText("Cambiar");
        btCambiarNombre.setBorder(null);

        javax.swing.GroupLayout jPanelCambioUsername1Layout = new javax.swing.GroupLayout(jPanelCambioUsername1);
        jPanelCambioUsername1.setLayout(jPanelCambioUsername1Layout);
        jPanelCambioUsername1Layout.setHorizontalGroup(
            jPanelCambioUsername1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambioUsername1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCambioUsername1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCambiarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(txtCambioDeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanelCambioUsername1Layout.setVerticalGroup(
            jPanelCambioUsername1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambioUsername1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCambiarNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCambioUsername1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCambioDeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelCambioUsername2.setBackground(new java.awt.Color(153, 153, 153));
        jPanelCambioUsername2.setPreferredSize(new java.awt.Dimension(374, 100));

        lbCambiarCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCambiarCorreo.setText("Cambiar correo");

        txtCambioDeCorreo.setBackground(new java.awt.Color(204, 204, 204));
        txtCambioDeCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCambioDeCorreo.setText("jTextField1");
        txtCambioDeCorreo.setToolTipText("");
        txtCambioDeCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        txtCambioDeCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioDeCorreoActionPerformed(evt);
            }
        });

        btCambiarCorreo.setBackground(new java.awt.Color(204, 204, 204));
        btCambiarCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCambiarCorreo.setText("Cambiar");
        btCambiarCorreo.setBorder(null);

        javax.swing.GroupLayout jPanelCambioUsername2Layout = new javax.swing.GroupLayout(jPanelCambioUsername2);
        jPanelCambioUsername2.setLayout(jPanelCambioUsername2Layout);
        jPanelCambioUsername2Layout.setHorizontalGroup(
            jPanelCambioUsername2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambioUsername2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCambioUsername2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCambiarCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(txtCambioDeCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCambiarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanelCambioUsername2Layout.setVerticalGroup(
            jPanelCambioUsername2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambioUsername2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCambiarCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCambioUsername2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCambioDeCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCambiarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelCambioUsername3.setBackground(new java.awt.Color(153, 153, 153));
        jPanelCambioUsername3.setPreferredSize(new java.awt.Dimension(374, 100));

        lbCambiarContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCambiarContraseña.setText("Cambiar contraseña");

        txtCambioDeContraseña.setBackground(new java.awt.Color(204, 204, 204));
        txtCambioDeContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCambioDeContraseña.setText("jTextField1");
        txtCambioDeContraseña.setToolTipText("");
        txtCambioDeContraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        txtCambioDeContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioDeContraseñaActionPerformed(evt);
            }
        });

        btCambiarContraseña.setBackground(new java.awt.Color(204, 204, 204));
        btCambiarContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCambiarContraseña.setText("Cambiar");
        btCambiarContraseña.setBorder(null);

        javax.swing.GroupLayout jPanelCambioUsername3Layout = new javax.swing.GroupLayout(jPanelCambioUsername3);
        jPanelCambioUsername3.setLayout(jPanelCambioUsername3Layout);
        jPanelCambioUsername3Layout.setHorizontalGroup(
            jPanelCambioUsername3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambioUsername3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCambioUsername3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCambiarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(txtCambioDeContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanelCambioUsername3Layout.setVerticalGroup(
            jPanelCambioUsername3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambioUsername3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCambiarContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCambioUsername3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCambioDeContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCuentaLayout = new javax.swing.GroupLayout(jPanelCuenta);
        jPanelCuenta.setLayout(jPanelCuentaLayout);
        jPanelCuentaLayout.setHorizontalGroup(
            jPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuentaLayout.createSequentialGroup()
                .addComponent(jPanelInformacionDelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCambioUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(jPanelCambioUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(jPanelCambioUsername2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(jPanelCambioUsername3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCuentaLayout.setVerticalGroup(
            jPanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInformacionDelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCambioUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCambioUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCambioUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCambioUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuenta", jPanelCuenta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCambioDeUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioDeUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioDeUserNameActionPerformed

    private void txtCambioDeNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioDeNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioDeNombreActionPerformed

    private void txtCambioDeCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioDeCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioDeCorreoActionPerformed

    private void txtCambioDeContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioDeContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioDeContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCambiarContraseña;
    private javax.swing.JButton btCambiarCorreo;
    private javax.swing.JButton btCambiarNombre;
    private javax.swing.JButton btCambiarUserName;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelCambioUsername;
    private javax.swing.JPanel jPanelCambioUsername1;
    private javax.swing.JPanel jPanelCambioUsername2;
    private javax.swing.JPanel jPanelCambioUsername3;
    private javax.swing.JPanel jPanelCuenta;
    private javax.swing.JPanel jPanelInformacionDelUsuario;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelMisProyectos;
    private javax.swing.JPanel jPanelProyectos;
    private javax.swing.JPanel jPanelProyectosCompartidos;
    private javax.swing.JPanel jPanelTareas;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lbCambiarContraseña;
    private javax.swing.JLabel lbCambiarCorreo;
    private javax.swing.JLabel lbCambiarNombre;
    private javax.swing.JLabel lbCambiarUserName;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHomeUserName;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTitleContraseña;
    private javax.swing.JLabel lbTitleEmail;
    private javax.swing.JLabel lbTitleName;
    private javax.swing.JLabel lbTitleUserName;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField txtCambioDeContraseña;
    private javax.swing.JTextField txtCambioDeCorreo;
    private javax.swing.JTextField txtCambioDeNombre;
    private javax.swing.JTextField txtCambioDeUserName;
    // End of variables declaration//GEN-END:variables
}
