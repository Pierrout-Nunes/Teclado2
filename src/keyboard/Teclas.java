package keyboard;

import javax.swing.*;
import java.awt.*;

public class Teclas {
	
	private JFrame Principal = new JFrame("Teste Teclado Virtual");
	private JLabel label = new JLabel ("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");
	private JLabel label2 = new JLabel ("Note: Clicking the buttons with your mouse will not perform any action.");
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
	private JButton up = new JButton("↑");
	
	
	
	public Teclas(){
		
		Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Principal.setSize(new Dimension(820,500));
		Principal.setResizable(false);
		Principal.setVisible(true);
		
		Container ct = Principal.getContentPane();
		ct.setLayout(null);
		
		label.setBounds(10,10,600,30);
		label2.setBounds(10, 25, 400, 30);
		aspas.setBounds(10, 150, 50, 50);
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
		
		tab.setBounds(18, 204, 80, 50);
		q.setBounds(100, 204, 50, 50);
		w.setBounds(152, 204, 50, 50);
		e.setBounds(204, 204, 50, 50);
		r.setBounds(256, 204, 50, 50);
		t.setBounds(308, 204, 50, 50);
		y.setBounds(360, 204, 50, 50);
		u.setBounds(412, 204, 50, 50);
		i.setBounds(464, 204, 50, 50);
		o.setBounds(516, 204, 50, 50);
		p.setBounds(568, 204, 50, 50);
		agudo.setBounds(620, 204, 50, 50);
		chave_esq.setBounds(672, 204, 50, 50);
		
		caps.setBounds(13, 258, 80, 50);
		a.setBounds(95, 258, 50, 50);
		s.setBounds(147, 258, 50, 50);
		d.setBounds(199, 258, 50, 50);
		f.setBounds(251, 258, 50, 50);
		g.setBounds(303, 258, 50, 50);
		h.setBounds(355, 258, 50, 50);
		j.setBounds(407, 258, 50, 50);
		k.setBounds(459, 258, 50, 50);
		l.setBounds(511, 258, 50, 50);
		ç.setBounds(563, 258, 50, 50);
		til.setBounds(615, 258, 50, 50);
		chave_dir.setBounds(667, 258, 50, 50);
		enter.setBounds(719, 258, 80, 50);
		
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
		up.setBounds(670, 312, 50, 50);
		
		ct.add(label);
		ct.add(label2);
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
		ct.add(up);
	
		
	}

}
