package keyboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teclas extends KeyAdapter {
	
	private JFrame Principal = new JFrame("~*~* Teclado Virtual *~*~");  // "Titulo" na parte superior do teclado
	private JLabel label = new JLabel ("Digite textos usando o seu teclado. A teclas que você selecionar serão sinalizadas e o texto será exibido.");
	private JLabel label2 = new JLabel ("Obs: Não ocorrerá nenhuma ação caso clique nas teclas utilizando o mouse.");  // Textos fixos
	private JLabel label3 = new JLabel ("Este teclado virtual te ajudará a praticar a digitação sem olhar para o teclado fisico.");
	private JLabel label4 = new JLabel ("Digite os pangramas na caixa de texto abaixo, após dar um clique na mesma, visualizando ao final um relatório sobre seu desempenho!");
	private JLabel label5 = new JLabel ("> Lembre-se de clicar a tecla ENTER ao fim de cada frase! <");
	
	//private JTextArea pangrama1 = new JTextArea("Zebras caolhas de Java querem mandar fax para moça gigante de New York");
	private JTextArea caixa1 = new JTextArea();  // Caixa de texto
	private JTextField texto = new JTextField();
	
	String pangrama = "abc";
	int tamanho = pangrama.length();
	
	String pangrama2 = "abcde";
	int tamanho2 = pangrama2.length();
	
	int contador = 0;
	
	int atual = 0;
	int erro_atual = 0;
	int acerto_atual = 0;
	
	private JTextField pang = new JTextField(pangrama);
	
	private JButton aspas = new JButton("'");   // Botoes com nomes e conteúdos
	private JButton um = new JButton("1");
	private JButton dois = new JButton("2");
	private JButton tres = new JButton("3");
	private JButton quatro = new JButton("4");
	private JButton cinco = new JButton("5");
	private JButton seis = new JButton("6");
	private JButton sete = new JButton("7");
	private JButton oito = new JButton("8");
	private JButton nove = new JButton("9");
	private JButton zero = new JButton("0");
	private JButton menos = new JButton("-");
	private JButton igual = new JButton("=");
	private JButton backspace = new JButton("Backspace");
	
	private JButton tab = new JButton("Tab");
	private JButton q = new JButton("Q");
	private JButton w = new JButton("W");
	private JButton e = new JButton("E");
	private JButton r = new JButton("R");
	private JButton t = new JButton("T");
	private JButton y = new JButton("Y");
	private JButton u = new JButton("U");
	private JButton i = new JButton("I");
	private JButton o = new JButton("O");
	private JButton p = new JButton("P");
	private JButton agudo = new JButton("´");
	private JButton chave_esq = new JButton("[");
	
	private JButton caps = new JButton("Caps");
	private JButton a = new JButton("A");
	private JButton s = new JButton("S");
	private JButton d = new JButton("D");
	private JButton f = new JButton("F");
	private JButton g = new JButton("G");
	private JButton h = new JButton("H");
	private JButton j = new JButton("J");
	private JButton k = new JButton("K");
	private JButton l = new JButton("L");
	private JButton ç = new JButton("Ç");
	private JButton til = new JButton("~");
	private JButton chave_dir = new JButton("]");
	private JButton enter = new JButton("Enter");
	
	private JButton shift = new JButton("Shift");
	private JButton z = new JButton("Z");
	private JButton x = new JButton("X");
	private JButton c = new JButton("C");
	private JButton v = new JButton("V");
	private JButton b = new JButton("B");
	private JButton n = new JButton("N");
	private JButton m = new JButton("M");
	private JButton virgula = new JButton(",");
	private JButton ponto = new JButton(".");
	private JButton ponto_virgula = new JButton(";");
	private JButton cima = new JButton("↑");
	
	private JButton space = new JButton("Space");
	private JButton esquerda = new JButton("←");
	private JButton baixo = new JButton("↓");
	private JButton direita = new JButton("→");
	
	
	public Teclas(){
		
		Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Configurações do painel
		Principal.setSize(new Dimension(820,670));
		Principal.setResizable(false);
		Principal.setVisible(true);
		
		Container ct = Principal.getContentPane();
		ct.setLayout(null);  // Com o layout null é possível posicionar os componentes onde desejar
		
		label.setBounds(10,2,700,30);       // tamanho e posição dos textos fixos
		label2.setBounds(10, 16, 500, 30);
		label3.setBounds(10, 36, 500, 30);
		label4.setBounds(10, 48, 800, 30);
		label5.setBounds(10, 70, 500, 30);
	//	pangrama1.setBounds(10,110, 500, 20);
		
		pang.setBounds(10, 110, 500, 20);
		
		
		caixa1.setBounds(10, 150, 750, 170);  // tamanho e posição da caixa de texto
		caixa1.setVisible(true);
		caixa1.setLineWrap(true);
	    caixa1.setWrapStyleWord(true);
	    texto.setBounds(10,150,750,170);

		aspas.setBounds(10, 350, 50, 50);  // tamanhos e posições dos botões
		um.setBounds(62, 350, 50, 50);
		dois.setBounds(114, 350, 50, 50);
		tres.setBounds(166, 350, 50, 50);
		quatro.setBounds(218, 350, 50, 50);
		cinco.setBounds(270, 350, 50, 50);
		seis.setBounds(322, 350, 50, 50);
		sete.setBounds(374, 350, 50, 50);
		oito.setBounds(426, 350, 50, 50);
		nove.setBounds(478, 350, 50, 50);
		zero.setBounds(530, 350, 50, 50);
		menos.setBounds(582, 350, 50, 50);
		igual.setBounds(634, 350, 50, 50);
		backspace.setBounds(686, 350, 98, 50);
		
		tab.setBounds(38, 404, 80, 50);
		q.setBounds(120, 404, 50, 50);
		w.setBounds(172, 404, 50, 50);
		e.setBounds(224, 404, 50, 50);
		r.setBounds(276, 404, 50, 50);
		t.setBounds(328, 404, 50, 50);
		y.setBounds(380, 404, 50, 50);
		u.setBounds(432, 404, 50, 50);
		i.setBounds(484, 404, 50, 50);
		o.setBounds(536, 404, 50, 50);
		p.setBounds(588, 404, 50, 50);
		agudo.setBounds(640, 404, 50, 50);
		chave_esq.setBounds(692, 404, 50, 50);
		
		caps.setBounds(10, 458, 80, 50);
		a.setBounds(92, 458, 50, 50);
		s.setBounds(144, 458, 50, 50);
		d.setBounds(196, 458, 50, 50);
		f.setBounds(248, 458, 50, 50);
		g.setBounds(300, 458, 50, 50);
		h.setBounds(352, 458, 50, 50);
		j.setBounds(404, 458, 50, 50);
		k.setBounds(456, 458, 50, 50);
		l.setBounds(508, 458, 50, 50);
		ç.setBounds(560, 458, 50, 50);
		til.setBounds(612, 458, 50, 50);
		chave_dir.setBounds(664, 458, 50, 50);
		enter.setBounds(716, 458, 70, 50);
		
		shift.setBounds(10, 512, 98, 50);
		z.setBounds(110, 512, 50, 50);
		x.setBounds(162, 512, 50, 50);
		c.setBounds(214, 512, 50, 50);
		v.setBounds(266, 512, 50, 50);
		b.setBounds(318, 512, 50, 50);
		n.setBounds(370, 512, 50, 50);
		m.setBounds(422, 512, 50, 50);
		virgula.setBounds(474, 512, 50, 50);
		ponto.setBounds(526, 512, 50, 50);
		ponto_virgula.setBounds(578, 512, 50, 50);
		cima.setBounds(664, 512, 50, 50);
		
		space.setBounds(200, 564, 300, 50);
		esquerda.setBounds(612, 564, 50, 50);
		baixo.setBounds(664, 564, 50, 50);
		direita.setBounds(716, 564, 50, 50);
		
		
		// adicionando a caixa de texto, textos fixos e botões ao teclado
		ct.add(label);
		ct.add(label2);
		ct.add(label3);
		ct.add(label4);
		ct.add(label5);
	//	ct.add(pangrama1);
		
		ct.add(pang);
		
		ct.add(caixa1);
		ct.add(texto);
		
		ct.add(aspas);
		ct.add(um);
		ct.add(dois);
		ct.add(tres);
		ct.add(quatro);
		ct.add(cinco);
		ct.add(seis);
		ct.add(sete);
		ct.add(oito);
		ct.add(nove);
		ct.add(zero);
		ct.add(menos);
		ct.add(igual);
		ct.add(backspace);
		
		ct.add(tab);
		ct.add(q);
		ct.add(w);
		ct.add(e);
		ct.add(r);
		ct.add(t);
		ct.add(y);
		ct.add(u);
		ct.add(i);
		ct.add(o);
		ct.add(p);
		ct.add(agudo);
		ct.add(chave_esq);
		
		ct.add(caps);
		ct.add(a);
		ct.add(s);
		ct.add(d);
		ct.add(f);
		ct.add(g);
		ct.add(h);
		ct.add(j);
		ct.add(k);
		ct.add(l);
		ct.add(ç);
		ct.add(til);
		ct.add(chave_dir);
		ct.add(enter);
		
		ct.add(shift);
		ct.add(z);
		ct.add(x);
		ct.add(c);
		ct.add(v);
		ct.add(b);
		ct.add(n);
		ct.add(m);
		ct.add(virgula);
		ct.add(ponto);
		ct.add(ponto_virgula);
		ct.add(cima);
	
		ct.add(space);
		ct.add(esquerda);
		ct.add(baixo);
		ct.add(direita);
		
	caixa1.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent evt) {
			int keyCode = evt.getKeyCode();
			
			switch (keyCode) {
				case KeyEvent.VK_QUOTE:
						caixa1.append(texto.getText());
						aspas.doClick();
						break;
				case KeyEvent.VK_1:
						caixa1.append(texto.getText());
						um.doClick();
						break;
				case KeyEvent.VK_2:
						caixa1.append(texto.getText());
						dois.doClick();
						break;
				case KeyEvent.VK_3:
						caixa1.append(texto.getText());
						tres.doClick();
						break;
				case KeyEvent.VK_4:
						caixa1.append(texto.getText());
						quatro.doClick();
						break;
				case KeyEvent.VK_5:
						caixa1.append(texto.getText());
						cinco.doClick();
						break;
				case KeyEvent.VK_6:
						caixa1.append(texto.getText());
						seis.doClick();
						break;
				case KeyEvent.VK_7:
						caixa1.append(texto.getText());
						sete.doClick();
						break;
				case KeyEvent.VK_8:
						caixa1.append(texto.getText());
						oito.doClick();
						break;
				case KeyEvent.VK_9:
						caixa1.append(texto.getText());
						nove.doClick();
						break;
				case KeyEvent.VK_0:
						caixa1.append(texto.getText());
						zero.doClick();
						break;
				case KeyEvent.VK_MINUS:
						caixa1.append(texto.getText());
						menos.doClick();
						break;
				case KeyEvent.VK_EQUALS:
						caixa1.append(texto.getText());
						igual.doClick();
						break;
				case KeyEvent.VK_BACK_SPACE:
						caixa1.append(texto.getText());
						backspace.doClick();
						atual--;
						break;
				case KeyEvent.VK_TAB:
						caixa1.append(texto.getText());
						tab.doClick();
						break;
				case KeyEvent.VK_Q:
						caixa1.append(texto.getText());
						q.doClick();
						break;
				case KeyEvent.VK_W:
						caixa1.append(texto.getText());
						w.doClick();
						break;
				case KeyEvent.VK_E:
						caixa1.append(texto.getText());
						e.doClick();
						break;
				case KeyEvent.VK_R:
						caixa1.append(texto.getText());
						r.doClick();
						break;
				case KeyEvent.VK_T:
						caixa1.append(texto.getText());
						t.doClick();
						break;
				case KeyEvent.VK_Y:
						caixa1.append(texto.getText());
						y.doClick();
						break;
				case KeyEvent.VK_U:
						caixa1.append(texto.getText());
						u.doClick();
						break;
				case KeyEvent.VK_I:
						caixa1.append(texto.getText());
						i.doClick();
						break;
				case KeyEvent.VK_O:
						caixa1.append(texto.getText());
						o.doClick();	
						break;
				case KeyEvent.VK_P:
						caixa1.append(texto.getText());
						p.doClick();
						break;
				case KeyEvent.VK_DEAD_ACUTE:
						caixa1.append(texto.getText());
						agudo.doClick();
						break;
				case KeyEvent.VK_OPEN_BRACKET:
						caixa1.append(texto.getText());
						chave_esq.doClick();
						break;
				case KeyEvent.VK_CAPS_LOCK:
						caixa1.append(texto.getText());
						caps.doClick();
						break;
				case KeyEvent.VK_A:
						caixa1.append(texto.getText());
						a.doClick();
						break;
				case KeyEvent.VK_S:
						caixa1.append(texto.getText());
						s.doClick();
						break;
				case KeyEvent.VK_D:
						caixa1.append(texto.getText());
						d.doClick();
						break;
				case KeyEvent.VK_F:
						caixa1.append(texto.getText());
						f.doClick();
						break;
				case KeyEvent.VK_G:
						caixa1.append(texto.getText());
						g.doClick();
						break;
				case KeyEvent.VK_H:
						caixa1.append(texto.getText());
						h.doClick();
						break;
				case KeyEvent.VK_J:
						caixa1.append(texto.getText());
						j.doClick();
						break;
				case KeyEvent.VK_K:
						caixa1.append(texto.getText());
						k.doClick();
						break;
				case KeyEvent.VK_L:
						caixa1.append(texto.getText());
						l.doClick();
						break;
				
				case KeyEvent.VK_DEAD_TILDE:
						caixa1.append(texto.getText());
						til.doClick();
						break;
				case KeyEvent.VK_CLOSE_BRACKET:
						caixa1.append(texto.getText());
						chave_dir.doClick();
						break;
				case KeyEvent.VK_ENTER:
						caixa1.append(texto.getText());
						enter.doClick();
						break;
				case KeyEvent.VK_SHIFT:
						caixa1.append(texto.getText());
						shift.doClick();
						break;
				case KeyEvent.VK_Z:
						caixa1.append(texto.getText());
						z.doClick();
						break;
				case KeyEvent.VK_X:
						caixa1.append(texto.getText());
						x.doClick();
						break;
				case KeyEvent.VK_C:
						caixa1.append(texto.getText());
						c.doClick();
						break;
				case KeyEvent.VK_V:
						caixa1.append(texto.getText());
						v.doClick();
						break;
				case KeyEvent.VK_B:
						caixa1.append(texto.getText());
						b.doClick();
						break;
				case KeyEvent.VK_N:
						caixa1.append(texto.getText());
						n.doClick();
						break;
				case KeyEvent.VK_M:
						caixa1.append(texto.getText());
						m.doClick();
						break;
				case KeyEvent.VK_COMMA:
						caixa1.append(texto.getText());
						virgula.doClick();
						break;
				case KeyEvent.VK_PERIOD:
						caixa1.append(texto.getText());
						ponto.doClick();
						break;
				case KeyEvent.VK_SEMICOLON:
						caixa1.append(texto.getText());
						ponto_virgula.doClick();
						break;
				case KeyEvent.VK_SPACE:
						caixa1.append(texto.getText());
						space.doClick();
						break;
				case KeyEvent.VK_UP:
					caixa1.append(texto.getText());
					cima.doClick();
					break;
				case KeyEvent.VK_RIGHT:
					caixa1.append(texto.getText());
					direita.doClick();
					break;
				case KeyEvent.VK_LEFT:
					caixa1.append(texto.getText());
					esquerda.doClick();
					break;
				case KeyEvent.VK_DOWN:
					caixa1.append(texto.getText());
					baixo.doClick();
					break;
				default:
					caixa1.append(texto.getText());
					ç.doClick();
					break;
			}
						
		}
		
	@Override
	public void keyReleased (KeyEvent evt) {
		int keyCode = evt.getKeyCode();
		
		try {
			contador = 0;
			if ((caixa1.getText().length() <= tamanho) (contador = 0)) { 
				
				if(caixa1.getText().charAt(atual) == pang.getText().charAt(atual)){
					atual++;
					System.out.println("acertou");
					acerto_atual++;
					System.out.println("você acertou "+ acerto_atual);
				}
				else
					if(caixa1.getText().charAt(atual) != pang.getText().charAt(atual)) {
						erro_atual++;
						System.out.println("errou "+ erro_atual);
					}
				
			}
			else
			if(caixa1.getText().length() > tamanho) {
				pang.setText("appp");
				caixa1.setText(null);
				atual = 0;
				erro_atual = 0;
				acerto_atual = 0;
				System.out.println(" "+pang.getText());
			}
				else {
					pang.setText("abcde");
					caixa1.setText(null);
					atual = 0;
					erro_atual = 0;
					acerto_atual = 0;
					System.out.println(" "+pang.getText());
				}
				}
	//			else {
		//			tamanho = 1;
			//		if (caixa1.getText().length() <= tamanho) {
		//			pang.setText("sr");
				//	caixa1.setText(null);
			//		atual = 0;
		//			erro_atual = 0;
		//			acerto_atual = 0;
		//			System.out.println(" "+pang.getText());
		//			}
		//			}
				
			
			
		
		catch (Exception um)
		{		
			if(evt.getKeyCode()==8) {
				atual--;
				System.out.println("letra deletada");
			}
			else 
				if (caixa1.getText().length() > tamanho) {
			System.out.println("Estourou o tamanho da string");
			System.out.println(" exceção "+atual);
				}
		}
		
		if(pang.getText().equals(caixa1.getText())) {
			System.out.println("tudo certo");
		}
		
	}
		
		
	
	});
		
	}
	
}