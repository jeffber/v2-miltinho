
public class No<T extends Comparable<T>> {

	private T conteudo;
	private No<T> noEsq;
	private No<T> noDir;

	public No(T conteudo) {
		this.conteudo = conteudo;
		noEsq = noDir = null;
	}

	public No() {
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getNoEsq() {
		return noEsq;
	}

	public void setNoEsq(No<T> noEsq) {
		this.noEsq = noEsq;
	}

	public No<T> getNoDir() {
		return noDir;
	}

	public void setNoDir(No<T> noDir) {
		this.noDir = noDir;
	}

	@Override
	public String toString() {
		return "BinNo{" + "conteudo=" + conteudo + '}';
	}
}