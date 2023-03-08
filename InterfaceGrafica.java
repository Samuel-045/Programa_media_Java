package projectMedia;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class InterfaceGrafica extends JPanel{ //heran�a sobre a classe jpanel para poder programar as interfaces criando os objetos gr�ficos;
   double media;
	JTextField  nome, turma, nota1, nota2, nota3;//caixinhas de respostas
	JLabel pdnome, pdturma, p1, p2, p3, mensagem1; //mandar mensagem
	JButton butok; 
	ImageIcon logo;
	JLabel iblogo;
	Color mygreen = new Color(0,102,0) , 
		  myyellow = new Color(204,104,0),
		  myred = new Color(204,0,0);

public InterfaceGrafica(){
		InicializarComponentes();
		DefinirEventos();
	}
	
public void InicializarComponentes(){
	setLayout(null);
	 
	logo = new ImageIcon("C:\\Users\\Ana Paula\\eclipse-workspace\\terceirosemestre\\src\\projectMedia\\logo_ceap21.png");
	iblogo=new JLabel(logo);
	iblogo.setBounds(380,5, 180, 98);
	add(iblogo);
	
	mensagem1 = new JLabel("");
	mensagem1.setBounds(30, 140,500,40);
	add(mensagem1);
	
	 pdnome=new JLabel("Nome:"); // indicador p nome
	 pdnome.setBounds(10, 20, 50, 30);
     add(pdnome);
	
	 nome=new JTextField();
	 nome.setBounds(50, 20, 150, 30);
	 add(nome);
	
	 pdturma=new JLabel("Turma:"); //indicador p turma
	 pdturma.setBounds(8, 60, 50,30);
	 add(pdturma);
		
	 turma=new JTextField();
	 turma.setBounds(50, 60, 150, 30);
	 add(turma);
     
	 p1=new JLabel("P1:"); //indicador p p1
	 p1.setBounds(26, 100, 150, 30);
	 add(p1);
	 
	 nota1=new JTextField();
     nota1.setBounds(50, 100, 150, 30);
	 add(nota1);
	 
	 p2=new JLabel("P2:"); //indicador p p2
	 p2.setBounds(208, 100, 150, 30);
	 add(p2);
	 
	 nota2=new JTextField();
	 nota2.setBounds(230, 100, 150, 30);
	 add(nota2);
	 
	 p3=new JLabel("P3:"); //indicador p p3
	 p3.setBounds(388, 100, 150, 30);
	 add(p3);
	 
	 nota3=new JTextField();
	 nota3.setBounds(410, 100, 150, 30);
	 add(nota3);
	 
	 butok = new JButton("Calcular");
	 butok.setBounds(210,210,100,30);//setBounds posiciona em (posi��o x, posi��o y, comprimento, altura);
	 add(butok);
	 
	

	
	 
 }

public void DefinirEventos(){
	butok.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){	
			double pr1= Double.parseDouble(nota1.getText());
			double pr2= Double.parseDouble(nota2.getText());
		    double pr3= Double.parseDouble(nota3.getText());
			             media= (pr1+pr2+pr3)/3; 
			 
			             String turma11= turma.getText();
			        	 String nome11 = nome.getText();
			        	 			
			    if(media>6) {
			    	mensagem1.setText(String.format("Ol� %s do %s. Sua m�dia � %.1f+. Voc� passou :) ",nome11, turma11, media));
				    mensagem1.setForeground(mygreen);
			    } else if (media<4) {
			    	mensagem1.setText(String.format("Ol� %s do %s. Sua m�dia � %.1f+. Voc� repetiu :( ",nome11, turma11, media));
			    	mensagem1.setForeground(myred);
			    }else {
			    	mensagem1.setText(String.format("Ol� %s do %s. Sua m�dia � %.1f+. Voc� est� de recupera��o :/ ",nome11, turma11, media));
			    	mensagem1.setForeground(myyellow);
			    }
				 
			}
				
	});
	
}

	public static void main(String args[]){
		
		 JFrame frame = new JFrame("C�lculo da m�dia"); //declara a classe para criar uma janela
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//m�todo para fechar a janela
		 frame.getContentPane().add(new InterfaceGrafica()); //adiciona o construtor na janela
		 frame.setBounds(400,250,590,300);// define tamanho e posi��o da janela
		 frame.revalidate();
		 frame.setVisible(true);//define se a janela ir� ser visivel ou n�o
	}
	
}
