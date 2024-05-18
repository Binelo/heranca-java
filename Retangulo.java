public class Retangulo {

    private long width;
    private long height;
    private String texto;

    

    public void desenha() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("#");
                } else if (i == height / 2 && j == (width - texto.length()) / 2) {
                    System.out.print(texto);
                    j += texto.length() - 1;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void desenhaRosa() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("\u001B[35m" + "#" +"\u001B[0m");
                } else if (i == height / 2 && j == (width - texto.length()) / 2) {
                    System.out.print(texto);
                    j += texto.length() - 1;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
