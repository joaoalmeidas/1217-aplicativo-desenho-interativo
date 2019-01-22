import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DesenhaPanel extends JPanel {
	
	private MinhaForma[] formas;
	private int contagemFormas = 0;
	private int tipoForma = 0;
	private MinhaForma formaAtual;
	private Color corAtual;
	private boolean preenchido;
	private JLabel labelStatus;
	
	
	public MinhaForma[] getFormas() {
		return formas;
	}
	
	
	public void setFormas(MinhaForma[] formas) {
		this.formas = formas;
	}
	
	
	public int getContagemFormas() {
		return contagemFormas;
	}
	
	
	public void setContagemFormas(int contagemFormas) {
		
		if(contagemFormas < 0) {
			
			throw new IllegalArgumentException();
		}
		
		this.contagemFormas = contagemFormas;
	}
	
	
	public int getTipoForma() {
		return tipoForma;
	}
	
	
	public void setTipoForma(int tipoForma) {
		this.tipoForma = tipoForma;
	}
	
	
	public MinhaForma getFormaAtual() {
		return formaAtual;
	}
	
	
	public void setFormaAtual(MinhaForma formaAtual) {
		this.formaAtual = formaAtual;
	}
	
	
	public Color getCorAtual() {
		return corAtual;
	}
	
	
	public void setCorAtual(Color corAtual) {
		this.corAtual = corAtual;
	}
	
	
	public boolean isPreenchido() {
		return preenchido;
	}
	
	
	public void setPreenchido(boolean preenchido) {
		this.preenchido = preenchido;
	}
	
	
	public JLabel getLabelStatus() {
		return labelStatus;
	}
	
	
	public void setLabelStatus(JLabel labelStatus) {
		this.labelStatus = labelStatus;
	}
	
	
	@Override
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);               
		
		for(int i = 0; i < contagemFormas; i++) {
			
			if(getFormas()[i] != null) {
				setFormaAtual(getFormas()[i]);
				getFormaAtual().desenha(arg0);
			}
			
		}
	}
	
	public void limpaUltimaForma() {
		
		setContagemFormas(getContagemFormas() - 1);
		repaint();
		
	}
	
	public void limpaDesenho() {
		
		setContagemFormas(0);
		repaint();
		
	}
	
	
	
	
	
	
	
}
