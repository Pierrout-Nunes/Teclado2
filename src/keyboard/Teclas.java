
// T136
// ANA FLAVIA PIERROUT DA SILVA   MATRICULA: 2019200768
// ISABELLE NUNES FERREIRA       MATRICULA: 2019200769
// AV2 - PROGRAMAÇÃO ORIENTADA A OBJETOS


package keyboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teclas extends KeyAdapter {
	
	// Cria componentes
	
	private JFrame Principal = new JFrame("~*~* Teclado Virtual *~*~");
	private JLabel label = new JLabel ("Digite o texto usando o seu teclado. A teclas que você selecionar serão sinalizadas.");
	private JLabel label2 = new JLabel ("Obs: Não ocorrerá nenhuma ação caso clique nas teclas utilizando o mouse.");
	private JLabel label3 = new JLabel ("Este teclado virtual te ajudará a praticar a digitação sem olhar para o teclado fisico.");
	private JLabel label4 = new JLabel ("Digite o pangrama na caixa de texto abaixo, após dar um clique na mesma, visualizando ao final um relatório sobre seu desempenho!");
	private JLabel label5 = new JLabel ("> Lembre-se de clicar a tecla ENTER ao fim da frase! <");
	
	// Caixa de texto
	
	private JTextArea caixa1 = new JTextArea();
	private JTextField texto = new JTextField();
	
	String pangrama = "Gazeta publica hoje breve nota de faxina na quermesse";
	int tamanho = pangrama.length();
	String acerto;
	String erro;
	int contador = 0;
	int atual = 0;
	int erro_atual = 0;
	int acerto_atual = 0;
	private JLabel textoFinal;
	
	private JTextField pang = new JTextField(pangrama);
	
	
	// Declaração de botões
	
	private JButton aspas = new JButton("'");
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
		
		// Configurações do painel
		
		Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Principal.setSize(new Dimension(820,670));
		Principal.setResizable(false);
		Principal.setVisible(true);
		
		Container ct = Principal.getContentPane();
		ct.setLayout(null);  // Com o layout null é possível posicionar os componentes onde desejar
		
		// tamanho e posição dos textos fixos
		
		label.setBounds(10,2,700,30);  
		label2.setBounds(10, 16, 500, 30);
		label3.setBounds(10, 36, 500, 30);
		label4.setBounds(10, 48, 800, 30);
		label5.setBounds(10, 70, 500, 30);
		
		pang.setBounds(10, 110, 500, 20);
		
		// tamanho e posição da caixa de texto
		
		caixa1.setBounds(10, 190, 750, 120);
		caixa1.setVisible(true);
		caixa1.setLineWrap(true);
	    caixa1.setWrapStyleWord(true);
	    texto.setBounds(10,190,750,120);
	    
	   // tamanhos e posições dos botões

		aspas.setBounds(10, 350, 50, 50);
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
		
		
		// ouvir eventos do teclado
		final Color corOriginalaspas = aspas.getBackground();
		final Color corOriginalUM = um.getBackground();
        final Color corOriginalDOIS = dois.getBackground();
        final Color corOriginalTRES = tres.getBackground();
        final Color corOriginalQUATRO = quatro.getBackground();
        final Color corOriginalCINCO = cinco.getBackground();
        final Color corOriginalSEIS = seis.getBackground();
        final Color corOriginalSETE = sete.getBackground();
        final Color corOriginalOITO = oito.getBackground();
        final Color corOriginalNOVE = nove.getBackground();
        final Color corOriginalZERO = zero.getBackground();
        final Color corOriginalMENOS = menos.getBackground();
        final Color corOriginalIGUAL = igual.getBackground();
        final Color corOriginalBACKSPACE = backspace.getBackground();
       
        final Color corOriginalTAB = tab.getBackground();
        final Color corOriginalQ = q.getBackground();
        final Color corOriginalW = w.getBackground();
        final Color corOriginalE = e.getBackground();
        final Color corOriginalR = r.getBackground();
        final Color corOriginalT = t.getBackground();
        final Color corOriginalY = y.getBackground();
        final Color corOriginalU = u.getBackground();
        final Color corOriginalI = i.getBackground();
        final Color corOriginalO = o.getBackground();
        final Color corOriginalP = p.getBackground();
        final Color corOriginalAGUDO = agudo.getBackground();
        final Color corOriginalCHAVE_ESQ = chave_esq.getBackground();
        final Color corOriginalCAPS = caps.getBackground();
        final Color corOriginalA = a.getBackground();
        final Color corOriginalS = s.getBackground();
        final Color corOriginalD = d.getBackground();
        final Color corOriginalF = f.getBackground();
        final Color corOriginalG = g.getBackground();
        final Color corOriginalH = h.getBackground();
        final Color corOriginalJ = j.getBackground();
        final Color corOriginalK = k.getBackground();
        final Color corOriginalL = l.getBackground();
        final Color corOriginalÇ = ç.getBackground();
        final Color corOriginalTIL = til.getBackground();
        final Color corOriginalCHAVE_DIR = chave_dir.getBackground();
        final Color corOriginalENTER = enter.getBackground();
       
        final Color corOriginalSHIFT = shift.getBackground();
        final Color corOriginalZ = z.getBackground();
        final Color corOriginalX = x.getBackground();
        final Color corOriginalC = c.getBackground();
        final Color corOriginalV = v.getBackground();
        final Color corOriginalB = b.getBackground();
        final Color corOriginalN = n.getBackground();
        final Color corOriginalM = m.getBackground();
        final Color corOriginalVIRGULA = virgula.getBackground();
        final Color corOriginalPONTO = ponto.getBackground();
        final Color corOriginalPONTO_VIRGULA = ponto_virgula.getBackground();
        final Color corOriginalCIMA = cima.getBackground();
       
        final Color corOriginalSPACE = space.getBackground();
        final Color corOriginalESQUERDA = esquerda.getBackground();
        final Color corOriginalBAIXO = baixo.getBackground();
        final Color corOriginalDIREITA = direita.getBackground();
        
        
		caixa1.addKeyListener(new KeyAdapter() {
		@Override
		
		// ação de clicar o botão e sinalizar as teclas
		
		public void keyPressed(KeyEvent evt) {
			int keyCode = evt.getKeyCode();
			
			switch (keyCode) {
				case KeyEvent.VK_QUOTE:
						caixa1.append(texto.getText());
						aspas.doClick();
						aspas.setBackground(Color.red);
						break;
				case KeyEvent.VK_1:
						caixa1.append(texto.getText());
						um.doClick();
						um.setBackground(Color.red);
						break;
				case KeyEvent.VK_2:
						caixa1.append(texto.getText());
						dois.doClick();
						dois.setBackground(Color.red);
						break;
				case KeyEvent.VK_3:
						caixa1.append(texto.getText());
						tres.doClick();
						tres.setBackground(Color.red);
						break;
				case KeyEvent.VK_4:
						caixa1.append(texto.getText());
						quatro.doClick();
						quatro.setBackground(Color.red);
						break;
				case KeyEvent.VK_5:
						caixa1.append(texto.getText());
						cinco.doClick();
						cinco.setBackground(Color.red);
						break;
				case KeyEvent.VK_6:
						caixa1.append(texto.getText());
						seis.doClick();
						seis.setBackground(Color.red);
						break;
				case KeyEvent.VK_7:
						caixa1.append(texto.getText());
						sete.doClick();
						sete.setBackground(Color.red);
						break;
				case KeyEvent.VK_8:
						caixa1.append(texto.getText());
						oito.doClick();
						oito.setBackground(Color.red);
						break;
				case KeyEvent.VK_9:
						caixa1.append(texto.getText());
						nove.doClick();
						nove.setBackground(Color.red);
						break;
				case KeyEvent.VK_0:
						caixa1.append(texto.getText());
						zero.doClick();
						zero.setBackground(Color.red);
						break;
				case KeyEvent.VK_MINUS:
						caixa1.append(texto.getText());
						menos.doClick();
						menos.setBackground(Color.red);
						break;
				case KeyEvent.VK_EQUALS:
						caixa1.append(texto.getText());
						igual.doClick();
						igual.setBackground(Color.red);
						break;
				case KeyEvent.VK_BACK_SPACE:
						caixa1.append(texto.getText());
						backspace.doClick();
						backspace.setBackground(Color.red);
						break;
				case KeyEvent.VK_TAB:
						caixa1.append(texto.getText());
						tab.doClick();
						tab.setBackground(Color.red);
						break;
				case KeyEvent.VK_Q:
						caixa1.append(texto.getText());
						q.doClick();
						q.setBackground(Color.red);
						break;
				case KeyEvent.VK_W:
						caixa1.append(texto.getText());
						w.doClick();
						w.setBackground(Color.red);
						break;
				case KeyEvent.VK_E:
						caixa1.append(texto.getText());
						e.doClick();
						e.setBackground(Color.red);
						break;
				case KeyEvent.VK_R:
						caixa1.append(texto.getText());
						r.doClick();
						r.setBackground(Color.red);
						break;
				case KeyEvent.VK_T:
						caixa1.append(texto.getText());
						t.doClick();
						t.setBackground(Color.red);
						break;
				case KeyEvent.VK_Y:
						caixa1.append(texto.getText());
						y.doClick();
						y.setBackground(Color.red);
						break;
				case KeyEvent.VK_U:
						caixa1.append(texto.getText());
						u.doClick();
						u.setBackground(Color.red);
						break;
				case KeyEvent.VK_I:
						caixa1.append(texto.getText());
						i.doClick();
						i.setBackground(Color.red);
						break;
				case KeyEvent.VK_O:
						caixa1.append(texto.getText());
						o.doClick();
						o.setBackground(Color.red);
						break;
				case KeyEvent.VK_P:
						caixa1.append(texto.getText());
						p.doClick();
						p.setBackground(Color.red);
						break;
				case KeyEvent.VK_DEAD_ACUTE:
						caixa1.append(texto.getText());
						agudo.doClick();
						agudo.setBackground(Color.red);
						break;
				case KeyEvent.VK_OPEN_BRACKET:
						caixa1.append(texto.getText());
						chave_esq.doClick();
						chave_esq.setBackground(Color.red);
						break;
				case KeyEvent.VK_CAPS_LOCK:
						caixa1.append(texto.getText());
						caps.doClick();
						caps.setBackground(Color.red);
						break;
				case KeyEvent.VK_A:
						caixa1.append(texto.getText());
						a.doClick();
						a.setBackground(Color.red);
						break;
				case KeyEvent.VK_S:
						caixa1.append(texto.getText());
						s.doClick();
						s.setBackground(Color.red);
						break;
				case KeyEvent.VK_D:
						caixa1.append(texto.getText());
						d.doClick();
						d.setBackground(Color.red);
						break;
				case KeyEvent.VK_F:
						caixa1.append(texto.getText());
						f.doClick();
						f.setBackground(Color.red);
						break;
				case KeyEvent.VK_G:
						caixa1.append(texto.getText());
						g.doClick();
						g.setBackground(Color.red);
						break;
				case KeyEvent.VK_H:
						caixa1.append(texto.getText());
						h.doClick();
						h.setBackground(Color.red);
						break;
				case KeyEvent.VK_J:
						caixa1.append(texto.getText());
						j.doClick();
						j.setBackground(Color.red);
						break;
				case KeyEvent.VK_K:
						caixa1.append(texto.getText());
						k.doClick();
						k.setBackground(Color.red);
						break;
				case KeyEvent.VK_L:
						caixa1.append(texto.getText());
						l.doClick();
						l.setBackground(Color.red);
						break;
				case KeyEvent.VK_DEAD_TILDE:
						caixa1.append(texto.getText());
						til.doClick();
						til.setBackground(Color.red);
						break;
				case KeyEvent.VK_CLOSE_BRACKET:
						caixa1.append(texto.getText());
						chave_dir.doClick();
						chave_dir.setBackground(Color.red);
						break;
				case KeyEvent.VK_ENTER:
						caixa1.append(texto.getText());
						enter.doClick();
						enter.setBackground(Color.red);
						break;
				case KeyEvent.VK_SHIFT:
						caixa1.append(texto.getText());
						shift.doClick();
						shift.setBackground(Color.red);
						break;
				case KeyEvent.VK_Z:
						caixa1.append(texto.getText());
						z.doClick();
						z.setBackground(Color.red);
						break;
				case KeyEvent.VK_X:
						caixa1.append(texto.getText());
						x.doClick();
						x.setBackground(Color.red);
						break;
				case KeyEvent.VK_C:
						caixa1.append(texto.getText());
						c.doClick();
						c.setBackground(Color.red);
						break;
				case KeyEvent.VK_V:
						caixa1.append(texto.getText());
						v.doClick();
						v.setBackground(Color.red);
						break;
				case KeyEvent.VK_B:
						caixa1.append(texto.getText());
						b.doClick();
						b.setBackground(Color.red);
						break;
				case KeyEvent.VK_N:
						caixa1.append(texto.getText());
						n.doClick();
						n.setBackground(Color.red);
						break;
				case KeyEvent.VK_M:
						caixa1.append(texto.getText());
						m.doClick();
						m.setBackground(Color.red);
						break;
				case KeyEvent.VK_COMMA:
						caixa1.append(texto.getText());
						virgula.doClick();
						virgula.setBackground(Color.red);
						break;
				case KeyEvent.VK_PERIOD:
						caixa1.append(texto.getText());
						ponto.doClick();
						ponto.setBackground(Color.red);
						break;
				case KeyEvent.VK_SEMICOLON:
						caixa1.append(texto.getText());
						ponto_virgula.doClick();
						ponto_virgula.setBackground(Color.red);
						break;
				case KeyEvent.VK_SPACE:
						caixa1.append(texto.getText());
						space.doClick();
						space.setBackground(Color.red);
						break;
				case KeyEvent.VK_UP:
						caixa1.append(texto.getText());
						cima.doClick();
						cima.setBackground(Color.red);
						break;
				case KeyEvent.VK_RIGHT:
						caixa1.append(texto.getText());
						direita.doClick();
						direita.setBackground(Color.red);
						break;
				case KeyEvent.VK_LEFT:
						caixa1.append(texto.getText());
						esquerda.doClick();
						esquerda.setBackground(Color.red);
						break;
				case KeyEvent.VK_DOWN:
						caixa1.append(texto.getText());
						baixo.doClick();
						baixo.setBackground(Color.red);
						break;
				default:
						caixa1.append(texto.getText());
						ç.doClick();
						ç.setBackground(Color.red);
						break;
			}
						
		}
		
	@Override
	
	// quando deixa de pressionar o botão
	
	public void keyReleased (KeyEvent evt) {
		int keyCode = evt.getKeyCode();
		
		switch (keyCode) {
			case KeyEvent.VK_QUOTE:
				aspas.setBackground(corOriginalaspas);
				break;
			case KeyEvent.VK_1:
				um.setBackground(corOriginalUM);
				break;
			case KeyEvent.VK_2:
				dois.setBackground(corOriginalDOIS);
				break;
			case KeyEvent.VK_3:
				tres.setBackground(corOriginalTRES);
				break;
			case KeyEvent.VK_4:
				quatro.setBackground(corOriginalQUATRO);
				break;
			case KeyEvent.VK_5:
				cinco.setBackground(corOriginalCINCO);
				break;
			case KeyEvent.VK_6:
				seis.setBackground(corOriginalSEIS);
				break;
			case KeyEvent.VK_7:
				sete.setBackground(corOriginalSETE);
				break;
			case KeyEvent.VK_8:
				oito.setBackground(corOriginalOITO);
				break;
			case KeyEvent.VK_9:
				nove.setBackground(corOriginalNOVE);
				break;
			case KeyEvent.VK_0:
				zero.setBackground(corOriginalZERO);
				break;
			case KeyEvent.VK_MINUS:
				menos.setBackground(corOriginalMENOS);
				break;
			case KeyEvent.VK_EQUALS:
				igual.setBackground(corOriginalIGUAL);
				break;
			case KeyEvent.VK_BACK_SPACE:
				backspace.setBackground(corOriginalBACKSPACE);
				break;
			case KeyEvent.VK_TAB:
				tab.setBackground(corOriginalTAB);
				break;
			case KeyEvent.VK_Q:
				q.setBackground(corOriginalQ);
				break;
			case KeyEvent.VK_W:
				w.setBackground(corOriginalW);
				break;
			case KeyEvent.VK_E:
				e.setBackground(corOriginalE);
				break;
			case KeyEvent.VK_R:
				r.setBackground(corOriginalR);
				break;
			case KeyEvent.VK_T:
				t.setBackground(corOriginalT);
				break;
			case KeyEvent.VK_Y:
				y.setBackground(corOriginalY);
				break;
			case KeyEvent.VK_U:
				u.setBackground(corOriginalU);	
				break;
			case KeyEvent.VK_I:
				i.setBackground(corOriginalI);
				break;
			case KeyEvent.VK_O:
				o.setBackground(corOriginalO);
				break;
			case KeyEvent.VK_P:
				p.setBackground(corOriginalP);
				break;
			case KeyEvent.VK_DEAD_ACUTE:
				agudo.setBackground(corOriginalAGUDO);				
				break;
			case KeyEvent.VK_OPEN_BRACKET:
				chave_esq.setBackground(corOriginalCHAVE_ESQ);	
				break;
			case KeyEvent.VK_CAPS_LOCK:
				caps.setBackground(corOriginalCAPS);
				break;
			case KeyEvent.VK_A:
				a.setBackground(corOriginalA);
				break;
			case KeyEvent.VK_S:
				s.setBackground(corOriginalS);
				break;
			case KeyEvent.VK_D:
				d.setBackground(corOriginalD);
				break;
			case KeyEvent.VK_F:
				f.setBackground(corOriginalF);
				break;
			case KeyEvent.VK_G:
				g.setBackground(corOriginalG);
				break;
			case KeyEvent.VK_H:
				h.setBackground(corOriginalH);
				break;
			case KeyEvent.VK_J:
				j.setBackground(corOriginalJ);
				break;
			case KeyEvent.VK_K:
				k.setBackground(corOriginalK);
				break;
				
			case KeyEvent.VK_L:
				l.setBackground(corOriginalL);
				break;
			case KeyEvent.VK_DEAD_TILDE:
				til.setBackground(corOriginalTIL);
				break;
			case KeyEvent.VK_CLOSE_BRACKET:
				chave_dir.setBackground(corOriginalCHAVE_DIR);
				break;
			case KeyEvent.VK_ENTER:
				enter.setBackground(corOriginalENTER);
				break;
			case KeyEvent.VK_SHIFT:
				shift.setBackground(corOriginalSHIFT);
				break;
			case KeyEvent.VK_Z:
				z.setBackground(corOriginalZ);
				break;
			case KeyEvent.VK_X:
				x.setBackground(corOriginalX);
				break;
			case KeyEvent.VK_C:
				c.setBackground(corOriginalC);
				break;
			case KeyEvent.VK_V:
				v.setBackground(corOriginalV);
				break;
			case KeyEvent.VK_B:
				b.setBackground(corOriginalB);
				break;
			case KeyEvent.VK_N:
				n.setBackground(corOriginalN);
				break;
			case KeyEvent.VK_M:
				m.setBackground(corOriginalM);
				break;
			case KeyEvent.VK_COMMA:
				virgula.setBackground(corOriginalVIRGULA);
				break;
			case KeyEvent.VK_PERIOD:
				ponto.setBackground(corOriginalPONTO);
				break;
			case KeyEvent.VK_SEMICOLON:
				ponto_virgula.setBackground(corOriginalPONTO_VIRGULA);
				break;
			case KeyEvent.VK_SPACE:
				space.setBackground(corOriginalSPACE);
				break;
			case KeyEvent.VK_UP:
				cima.setBackground(corOriginalCIMA);
				break;
			case KeyEvent.VK_RIGHT:
				direita.setBackground(corOriginalDIREITA);
				break;
			case KeyEvent.VK_LEFT:
				esquerda.setBackground(corOriginalESQUERDA);
				break;
			case KeyEvent.VK_DOWN:
				baixo.setBackground(corOriginalBAIXO);
				break;
			default:
				ç.setBackground(corOriginalÇ);
				break;
				
	}
		// tratamento de excessão para o tamanho da string
		
		try {
			if (caixa1.getText().length() <= tamanho) {    // As letras serão capturadas enquanto a caixa que está digitando for menor ou igual o comprimento do pangrama
				
				if(caixa1.getText().charAt(atual) == pang.getText().charAt(atual) && (evt.getKeyCode()!=8)){
					acerto_atual++;
				}
				else
					if(caixa1.getText().charAt(atual) != pang.getText().charAt(atual)) {
						erro_atual++;
					}
				atual++;
				}

			else {   // quando o usuário termina de digitar o pangrama
				
				acerto = Integer.toString(acerto_atual);
				erro = Integer.toString(erro_atual);
				textoFinal = new JLabel("> Pressionamento de teclas >>   Corretas: " + acerto + "   Incorretas: " + erro);
				ct.add(textoFinal);
				textoFinal.setBounds(10,150, 700, 30);
				caixa1.setText(null);
				caixa1.setEditable(false);
					
			}
		}
			
		
		catch (Exception um){	
			if(evt.getKeyCode()==8) {     // caso a tecla seja BackSpace irá decrementar
				atual--;
				acerto_atual--;
				erro_atual--;
			}
			else {
				if (caixa1.getText().length() > tamanho) {
						System.out.println("Estourou o tamanho da string");
				}
			}
		}
		
	}	
	
	});
		
	}
	
}