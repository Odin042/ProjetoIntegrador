package projetoIntegrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Button;
import java.awt.Panel;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Window.Type;

public class projetoIntegrador extends JFrame {

    //Variaveis globais e JavaComboBox declarados de forma que qualquer scopo pode modificalas
	boolean  febril,semPaladar,semOlfato,temTosse,temDorNoCorpo,comFaltaDeAr,comDorDeGarganta,comCorisa,comDorDeCabeca,comCoceira,comEspirros,comCatarroEsverdeado,comDorNoPeito,comSuorNoturno;
	JComboBox febre;
	JComboBox faltaDePaladar;
	JComboBox faltaDeOlfato;
	JComboBox tosse;
	JComboBox dorNoCorpo;
	JComboBox faltaDeAr;
	JComboBox DorDeGarganta;
	JComboBox corisa;
	JComboBox dorDeCabeca;
	JComboBox coceira;
	JComboBox espirros;
	JComboBox catarroEsverdeado;
	JComboBox dorNoPeito;
	JComboBox suorNoturno;
	
	
	private static final long serialVersionUID = 1L;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projetoIntegrador frame = new projetoIntegrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public projetoIntegrador() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Diagnostico");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//Funções de coleta das informações colocas pelo user final, getSelectItem() pega o item selecionado e toString() converte para uma string.
				febre.getSelectedItem().toString();
				faltaDePaladar.getSelectedItem().toString();
				faltaDeOlfato.getSelectedItem().toString();
				tosse.getSelectedItem().toString();
				dorNoCorpo.getSelectedItem().toString();
				faltaDeAr.getSelectedItem().toString();
				DorDeGarganta.getSelectedItem().toString();
				corisa.getSelectedItem().toString();
				coceira.getSelectedItem().toString();
				espirros.getSelectedItem().toString();
				catarroEsverdeado.getSelectedItem().toString();
				dorNoPeito.getSelectedItem().toString();
				suorNoturno.getSelectedItem().toString();
				//Como se trata de um boolean as variaveis abaixo verificam os sintomas e conforme a resposta guarda para validação
			if(febril && temTosse) { // Se o paciente colocar que não esta com febre e nao esta com tosse, o algoritmo retorna o else final.
				
				if(semPaladar && semOlfato && temDorNoCorpo && comFaltaDeAr && comDorDeGarganta && comDorDeCabeca && comCoceira) {// Verifica se o paciente esta com covid
					      JOptionPane.showMessageDialog(null, "Voce esta com Covid-19, procure atendimento."); //Função em Java  que mostra um texto de alerta
				  }
				else if (comCorisa && temDorNoCorpo && comEspirros && comDorDeCabeca ) {//verifica se o pacinte esta com com gripe
							JOptionPane.showMessageDialog(null, "Voce esta com Gripe, procure atendimento.");
						}
					}else if(comFaltaDeAr && comDorDeCabeca && comCatarroEsverdeado && comDorNoPeito && comSuorNoturno) {// verifica se o paciente esta com pneumonia
								  JOptionPane.showMessageDialog(null, "Voce esta com Pneumonia, procure atendimento."); 
							  }
		       else {
				JOptionPane.showMessageDialog(null, "Voce nao esta doente.");//  else feito para caso febril & temTosse seja marcado como nao
			     }
			      }
			
		      });
		btnNewButton.setBounds(295, 396, 150, 72);
		getContentPane().add(btnNewButton);
		
		JButton Sair = new JButton("Sair");
		Sair.addMouseListener(new MouseAdapter() { 
			public void mouseClicked(MouseEvent e) {
				System.exit(0);  // Função que fecha o aplicativo
			}
		});
		Sair.setBounds(484, 396, 150, 72);
		getContentPane().add(Sair);
		
		JLabel label_1 = new JLabel("Esta com febre?");
		label_1.setBounds(36, 71, 103, 14);
		getContentPane().add(label_1);
		
        JLabel lblEstaComFalta = new JLabel("Esta com falta de paladar?");
		lblEstaComFalta.setBounds(149, 71, 169, 14);
		getContentPane().add(lblEstaComFalta);
		
		JLabel lblEsta = new JLabel("Esta com falta de olfato?");
		lblEsta.setBounds(312, 71, 144, 14);
		getContentPane().add(lblEsta);
		
		JLabel lblEstaComTosse = new JLabel("Esta com tosse?");
		lblEstaComTosse.setBounds(470, 71, 103, 14);
		getContentPane().add(lblEstaComTosse);
		
		JLabel lblEstaComDor = new JLabel("Esta com dor no corpo?");
		lblEstaComDor.setBounds(589, 71, 160, 14);
		getContentPane().add(lblEstaComDor);
		
		JLabel lblEstaComFalta_1 = new JLabel("Esta com falta de ar?");
		lblEstaComFalta_1.setBounds(737, 71, 125, 14);
		getContentPane().add(lblEstaComFalta_1);
		
		JLabel lblEstaComDor_1 = new JLabel("Esta com dor de garganta?");
		lblEstaComDor_1.setBounds(50, 166, 169, 14);
		getContentPane().add(lblEstaComDor_1);
		
		JLabel lblEstaComCorisa = new JLabel("Esta com corisa?");
		lblEstaComCorisa.setBounds(229, 166, 109, 14);
		getContentPane().add(lblEstaComCorisa);
		
		JLabel febre_8 = new JLabel("Esta com dor de cabe\u00E7a?");
		febre_8.setBounds(348, 166, 160, 14);
		getContentPane().add(febre_8);
		
		JLabel febre_9 = new JLabel("Esta com co\u00E7eira?");
		febre_9.setBounds(530, 166, 111, 14);
		getContentPane().add(febre_9);
		
		JLabel febre_10 = new JLabel("Esta com espirros?");
		febre_10.setBounds(675, 166, 125, 14);
		getContentPane().add(febre_10);
		
		JLabel febre_12 = new JLabel("Tosse com catarro esverdeado?");
		febre_12.setBounds(116, 282, 186, 14);
		getContentPane().add(febre_12);
		
		JLabel febre_13 = new JLabel("Esta com dor no peito?");
		febre_13.setBounds(323, 282, 133, 14);
		getContentPane().add(febre_13);
		
		JLabel febre_14 = new JLabel("Esta com suor noturno?");
		febre_14.setBounds(488, 282, 146, 14);
		getContentPane().add(febre_14);
		
		//Abaixo são as funções que controlam as JCOMBOBOX
	    febre = new JComboBox();
			febre.addItemListener(new ItemListener() { // Função do java que adiciona a opção em uma lista durante a execução
				public void itemStateChanged(ItemEvent e) {
					febril = febre.getSelectedItem().toString() == "Sim"; // Coleta quando é marcado SIM na Combo box e converte para uma string
					  
					
	              }
				
			});
			
		febre.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		febre.setBounds(50, 96, 61, 22);
		getContentPane().add(febre);
		
		faltaDePaladar = new JComboBox();
		faltaDePaladar.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				semPaladar = faltaDePaladar.getSelectedItem().toString() == "Sim";
				
			}
			
		});
		
		faltaDePaladar.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		faltaDePaladar.setBounds(204, 96, 61, 22);
		getContentPane().add(faltaDePaladar);
		
		faltaDeOlfato = new JComboBox();
		faltaDeOlfato.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				semOlfato = faltaDeOlfato.getSelectedItem().toString() == "Sim";
			}
		});
		faltaDeOlfato.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		faltaDeOlfato.setBounds(348, 96, 61, 22);
		getContentPane().add(faltaDeOlfato);
		
		tosse = new JComboBox();
		tosse.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				temTosse = tosse.getSelectedItem().toString() == "Sim";
			}
		});
		tosse.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		tosse.setBounds(487, 96, 61, 22);
		getContentPane().add(tosse);
		
		dorNoCorpo = new JComboBox();
		dorNoCorpo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				temDorNoCorpo = dorNoCorpo.getSelectedItem().toString() == "Sim";
			}
		});
		dorNoCorpo.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		dorNoCorpo.setBounds(625, 96, 61, 22);
		getContentPane().add(dorNoCorpo);
		
		faltaDeAr = new JComboBox();
		faltaDeAr.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comFaltaDeAr = faltaDeAr.getSelectedItem().toString() == "Sim";
			}
		});
		faltaDeAr.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		faltaDeAr.setBounds(786, 96, 61, 22);
		getContentPane().add(faltaDeAr);
		
		DorDeGarganta = new JComboBox();
		DorDeGarganta.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comDorDeGarganta = DorDeGarganta.getSelectedItem().toString() == "Sim";
			}
		});
		DorDeGarganta.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		DorDeGarganta.setBounds(121, 191, 61, 22);
		getContentPane().add(DorDeGarganta);
		
		corisa = new JComboBox();
		corisa.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comCorisa = corisa.getSelectedItem().toString() == "Sim";
			}
		});
		corisa.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		corisa.setBounds(236, 191, 61, 22);
		getContentPane().add(corisa);
		
		dorDeCabeca = new JComboBox();
		dorDeCabeca.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comDorDeCabeca = dorDeCabeca.getSelectedItem().toString() =="Sim";
				
			}
		});
		dorDeCabeca.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		dorDeCabeca.setBounds(384, 191, 61, 22);
		getContentPane().add(dorDeCabeca);
		
		coceira = new JComboBox();
		coceira.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comCoceira = coceira.getSelectedItem().toString() == "Sim";
			}
		});
		coceira.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		coceira.setBounds(535, 191, 61, 22);
		getContentPane().add(coceira);
		
		espirros = new JComboBox();
		espirros.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comEspirros = espirros.getSelectedItem().toString() == "Sim";
			}
		});
		espirros.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		espirros.setBounds(688, 191, 61, 22);
		getContentPane().add(espirros);
		
		catarroEsverdeado = new JComboBox();
		catarroEsverdeado.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comCatarroEsverdeado = catarroEsverdeado.getSelectedItem().toString() == "Sim";
			}
		});
		catarroEsverdeado.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		catarroEsverdeado.setBounds(167, 307, 61, 22);
		getContentPane().add(catarroEsverdeado);
		
		dorNoPeito = new JComboBox();
		dorNoPeito.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comDorNoPeito = dorNoPeito.getSelectedItem().toString() == "Sim";
			}
		});
		dorNoPeito.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		dorNoPeito.setBounds(348, 307, 61, 22);
		getContentPane().add(dorNoPeito);
		
		suorNoturno = new JComboBox();
		suorNoturno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comSuorNoturno = suorNoturno.getSelectedItem().toString() == "Sim";
			}
		});
		suorNoturno.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "Nao"}));
		suorNoturno.setBounds(509, 307, 61, 22);
		getContentPane().add(suorNoturno);
	}
}
