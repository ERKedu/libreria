package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaLogin extends JFrame implements ActionListener {
	private static final long serialVersionUID = 5057387647629734076L;
	// Elementos de la ventana
    private JTextField usuarioTextField;
    private JPasswordField passwordField;
    private JButton botonLogin;
    private JButton botonCrearCuenta;

    public VentanaLogin() {
        super("Inicio de sesión");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear paneles para colocar los elementos de la ventana
        JPanel panelPrincipal = new JPanel(new GridLayout(3, 2));
        JPanel panelBotones = new JPanel(new GridLayout(1, 2));

        // Crear los elementos de la ventana
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioTextField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordField = new JPasswordField(20);
        botonLogin = new JButton("Iniciar sesión");
        botonCrearCuenta = new JButton("Crear una cuenta nueva");

        // Agregar elementos a los paneles
        panelPrincipal.add(usuarioLabel);
        panelPrincipal.add(usuarioTextField);
        panelPrincipal.add(passwordLabel);
        panelPrincipal.add(passwordField);
        panelBotones.add(botonCrearCuenta);
        panelBotones.add(botonLogin);

        // Agregar los paneles a la ventana
        add(panelPrincipal, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // Agregar ActionListeners a los botones
        botonCrearCuenta.addActionListener(this);
        botonLogin.addActionListener(this);
    }

    // Método que se ejecuta al hacer clic en los botones
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCrearCuenta) {
            // Abrir una nueva ventana para crear una cuenta nueva
            VentanaCrearCuenta ventanaCrearCuenta = new VentanaCrearCuenta();
            ventanaCrearCuenta.setVisible(true);
        } else if (e.getSource() == botonLogin) {
            // Verificar si el usuario y la contraseña son correctos
            String usuario = usuarioTextField.getText();
            String password = new String(passwordField.getPassword());

            // Verificar si el usuario y la contraseña son correctos            
            if(usuario.equals("root") && password.equals("root")) {
                JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
                dispose();
                VentanaPrincipal VentanaPrincipal = new VentanaPrincipal();
                VentanaPrincipal.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        }
    }

    public static void main(String[] args) {
        VentanaLogin ventana = new VentanaLogin();
        ventana.setVisible(true);
    }
}

class VentanaCrearCuenta extends JFrame implements ActionListener {
	private static final long serialVersionUID = -4194569509285711392L;
	// Elementos de la ventana
    private JTextField usuarioTextField, nombreTextField, telefonoTextField, correoTextField;
    private JPasswordField passwordField;
    private JButton botonCrear;

    public VentanaCrearCuenta() {
        super("Crear una cuenta nueva");
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear paneles para colocar los elementos de la ventana
        JPanel panelPrincipal = new JPanel(new GridLayout(3, 2));
        JPanel panelBoton = new JPanel();

        // Crear los elementos de la ventana
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioTextField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordField = new JPasswordField(20);
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextField = new JTextField(20);
        JLabel correoLabel = new JLabel("Correo:");
        correoTextField = new JTextField(20);
        JLabel telefonoLabel = new JLabel("Telefono:");
        telefonoTextField = new JTextField(20);
        
        	    botonCrear = new JButton("Crear cuenta");

        	    // Agregar elementos a los paneles
        	    panelPrincipal.add(usuarioLabel);
        	    panelPrincipal.add(usuarioTextField);
        	    panelPrincipal.add(passwordLabel);
        	    panelPrincipal.add(passwordField);
        	    panelPrincipal.add(nombreLabel);
        	    panelPrincipal.add(nombreTextField);
        	    panelPrincipal.add(correoLabel);
        	    panelPrincipal.add(correoTextField);
        	    panelPrincipal.add(telefonoLabel);
        	    panelPrincipal.add(telefonoTextField);

        	    panelBoton.add(botonCrear);

        	    // Agregar los paneles a la ventana
        	    add(panelPrincipal, BorderLayout.CENTER);
        	    add(panelBoton, BorderLayout.SOUTH);

        	    // Agregar ActionListener al botón
        	    botonCrear.addActionListener(this);
        	}

        	// Método que se ejecuta al hacer clic en el botón
        	public void actionPerformed(ActionEvent e) {
        	    // Obtener el usuario y la contraseña ingresados
        	    String usuario = usuarioTextField.getText();
        	    String password = new String(passwordField.getPassword());
        	    String nombre = nombreTextField.getText();
        	    String correo = correoTextField.getText();
        	    String telefono = telefonoTextField.getText();


        	    // Guardarlo en la base de datos
        	    JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente");
        	}

    }


class VentanaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = -1050104785588063965L;
	// Elementos de la ventana
    private JButton botonCrear, botonConsultar, botonBorrar;

    public VentanaPrincipal() {
        super("Menu Documentos");
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear paneles para colocar los elementos de la ventana
        JPanel panelPrincipal = new JPanel(new GridLayout(3, 2));
        JPanel panelBoton = new JPanel();

        // Crear los elementos de la ventana        
        botonCrear = new JButton("Crear");
        botonConsultar = new JButton("Consultar");
        botonBorrar = new JButton("Borrar");

        panelBoton.add(botonCrear);
        panelBoton.add(botonConsultar);
        panelBoton.add(botonBorrar);


        // Agregar los paneles a la ventana
        add(panelPrincipal, BorderLayout.NORTH);
        add(panelBoton, BorderLayout.CENTER);

        // Agregar ActionListener al botón
        	botonCrear.addActionListener(this);
        	botonConsultar.addActionListener(this);
        	botonBorrar.addActionListener(this);

        }

        	// Método que se ejecuta al hacer clic en el botón
        	public void actionPerformed(ActionEvent e) {
                if (e.getSource() == botonCrear) {
                    // Abrir una nueva ventana para crear una cuenta nueva
                    VentanaCrearDocumento VentanaCrearDocumento = new VentanaCrearDocumento();
                    VentanaCrearDocumento.setVisible(true);
                } else if (e.getSource() == botonConsultar) {
                    VentanaConsultarDocumento VentanaConsultarDocumento = new VentanaConsultarDocumento();
                    VentanaConsultarDocumento.setVisible(true);

                } else if (e.getSource() == botonBorrar) {
                    VentanaBorrarDocumento VentanaBorrarDocumento = new VentanaBorrarDocumento();
                    VentanaBorrarDocumento.setVisible(true);
                }

        	}

    }

class VentanaCrearDocumento extends JFrame implements ActionListener {
	private static final long serialVersionUID = 7704809550470454186L;
	// Elementos de la ventana
    private JButton botonCrearLibros, botonCrearMusica, botonCrearDocumentales, botonCrearPeliculas;

    public VentanaCrearDocumento() {
        super("Crear un nuevo...");
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear paneles para colocar los elementos de la ventana
        JPanel panelPrincipal = new JPanel(new GridLayout(3, 2));
        JPanel panelBoton = new JPanel();

        // Crear los elementos de la ventana        
        botonCrearLibros = new JButton("Libro");
        botonCrearMusica = new JButton("Musica");
        botonCrearDocumentales = new JButton("Documental");
        botonCrearPeliculas = new JButton("Pelicula");


        panelBoton.add(botonCrearLibros);
        panelBoton.add(botonCrearMusica);
        panelBoton.add(botonCrearDocumentales);
        panelBoton.add(botonCrearPeliculas);


        // Agregar los paneles a la ventana
        add(panelPrincipal, BorderLayout.NORTH);
        add(panelBoton, BorderLayout.CENTER);

        // Agregar ActionListener al botón
        botonCrearLibros.addActionListener(this);
        botonCrearMusica.addActionListener(this);
        botonCrearDocumentales.addActionListener(this);
        botonCrearPeliculas.addActionListener(this);
    }

        	// Método que se ejecuta al hacer clic en el botón
        	public void actionPerformed(ActionEvent e) {
                if (e.getSource() == botonCrearLibros) {
                    // Abrir una nueva ventana para crear una cuenta nueva
                    VentanaCrearLibro VentanaCrearLibro = new VentanaCrearLibro();
                    VentanaCrearLibro.setVisible(true);
                } else if (e.getSource() == botonCrearMusica) {
                	VentanaCrearMusica VentanaCrearMusica = new VentanaCrearMusica();
                	VentanaCrearMusica.setVisible(true);

                } else if (e.getSource() == botonCrearDocumentales) {
                	VentanaCrearDocumental VentanaCrearDocumental = new VentanaCrearDocumental();
                	VentanaCrearDocumental.setVisible(true);
                } else if (e.getSource() == botonCrearPeliculas) {
                	VentanaCrearPelicula VentanaCrearPelicula = new VentanaCrearPelicula();
                	VentanaCrearPelicula.setVisible(true);
                }

        	}
}









class VentanaConsultarDocumento extends JFrame implements ActionListener {
	private static final long serialVersionUID = 3423774522076822536L;

	// Elementos de la ventana
    // Cambiad por las variables
	

	public VentanaConsultarDocumento() {


    }
    
	public void actionPerformed(ActionEvent e) {

	}
}

class VentanaBorrarDocumento extends JFrame implements ActionListener {
	private static final long serialVersionUID = -2928518913953821012L;

	// Elementos de la ventana
    // Cambiad por las variables
	

	public VentanaBorrarDocumento() {


    }
    
	public void actionPerformed(ActionEvent e) {

	}
}



