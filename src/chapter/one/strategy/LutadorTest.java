package chapter.one.strategy;

public class LutadorTest {

	public static void main(String[] args) {
		Lutador as = new Lutador("Anderson Silva");
		as.setLuta(new Boxe());
		
		System.out.println(as.getNome());
		as.lutar();
		as.setLuta(new MuaiThai());
		as.lutar();
		as.setLuta(new JiuJitsu());
		as.lutar();
	}
}
