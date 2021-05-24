package keyboard;

import javax.swing.*;
import java.awt.*;

public class Teclas {
	
	private JFrame Principal = new JFrame("Teste Teclado Virtual");  // "Titulo" na parte superior do teclado
	private JLabel label = new JLabel ("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");
	private JLabel label2 = new JLabel ("Note: Clicking the buttons with your mouse will not perform any action.");  // Textos fixos
	private JTextArea caixa = new JTextArea();  // Caixa de texto
	
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
		Principal.setSize(new Dimension(820,470));
		Principal.setResizable(false);
		Principal.setVisible(true);
		
		Container ct = Principal.getContentPane();
		ct.setLayout(null);  // Com o layout null é possível posicionar os componentes onde desejar
		
		label.setBounds(10,5,600,30);       // tamanho e posição dos textos fixos
		label2.setBounds(10, 18, 400, 30);
		caixa.setBounds(10, 60, 750, 80);  // tamanho e posição da caixa de texto
		caixa.setVisible(true);
		
		aspas.setBounds(10, 150, 50, 50);  // tamanhos e posições dos botões
		um.setBounds(62, 150, 50, 50);
		dois.setBounds(114, 150, 50, 50);
		tres.setBounds(166, 150, 50, 50);
		quatro.setBounds(218, 150, 50, 50);
		cinco.setBounds(270, 150, 50, 50);
		seis.setBounds(322, 150, 50, 50);
		sete.setBounds(374, 150, 50, 50);
		oito.setBounds(426, 150, 50, 50);
		nove.setBounds(478, 150, 50, 50);
		zero.setBounds(530, 150, 50, 50);
		menos.setBounds(582, 150, 50, 50);
		igual.setBounds(634, 150, 50, 50);
		backspace.setBounds(686, 150, 98, 50);
		
		tab.setBounds(38, 204, 80, 50);
		q.setBounds(120, 204, 50, 50);
		w.setBounds(172, 204, 50, 50);
		e.setBounds(224, 204, 50, 50);
		r.setBounds(276, 204, 50, 50);
		t.setBounds(328, 204, 50, 50);
		y.setBounds(380, 204, 50, 50);
		u.setBounds(432, 204, 50, 50);
		i.setBounds(484, 204, 50, 50);
		o.setBounds(536, 204, 50, 50);
		p.setBounds(588, 204, 50, 50);
		agudo.setBounds(640, 204, 50, 50);
		chave_esq.setBounds(692, 204, 50, 50);
		
		caps.setBounds(10, 258, 80, 50);
		a.setBounds(92, 258, 50, 50);
		s.setBounds(144, 258, 50, 50);
		d.setBounds(196, 258, 50, 50);
		f.setBounds(248, 258, 50, 50);
		g.setBounds(300, 258, 50, 50);
		h.setBounds(352, 258, 50, 50);
		j.setBounds(404, 258, 50, 50);
		k.setBounds(456, 258, 50, 50);
		l.setBounds(508, 258, 50, 50);
		ç.setBounds(560, 258, 50, 50);
		til.setBounds(612, 258, 50, 50);
		chave_dir.setBounds(664, 258, 50, 50);
		enter.setBounds(716, 258, 70, 50);
		
		shift.setBounds(10, 312, 98, 50);
		z.setBounds(110, 312, 50, 50);
		x.setBounds(162, 312, 50, 50);
		c.setBounds(214, 312, 50, 50);
		v.setBounds(266, 312, 50, 50);
		b.setBounds(318, 312, 50, 50);
		n.setBounds(370, 312, 50, 50);
		m.setBounds(422, 312, 50, 50);
		virgula.setBounds(474, 312, 50, 50);
		ponto.setBounds(526, 312, 50, 50);
		ponto_virgula.setBounds(578, 312, 50, 50);
		cima.setBounds(664, 312, 50, 50);
		
		space.setBounds(200, 364, 300, 50);
		esquerda.setBounds(612, 364, 50, 50);
		baixo.setBounds(664, 364, 50, 50);
		direita.setBounds(716, 364, 50, 50);
		
		
		// adicionando a caixa de texto, textos fixos e botões ao teclado
		ct.add(label);
		ct.add(label2);
		ct.add(caixa);
		
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
	}

}