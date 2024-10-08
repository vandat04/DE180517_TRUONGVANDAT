package W2;

public class Matrix {

    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public double[][] getData() {
        return data;
    }

    public double getEachData(int rows, int cols) {
        return data[rows][cols];
    }

    public void setEachData(double value, int rows, int cols) {
        this.data[rows][cols] = value;
    }

    public void setData(double[][] data) {
        this.data = data;
    }

    public void fillMatrix(int index) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = Utils_CheckValid.Utils.getNumber("Enter Matrix" + index + "[" + i + "][" + j + "]: ");
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("["+data[i][j]+"]" + "\t");
            }
            System.out.println();
        }
    }
}
