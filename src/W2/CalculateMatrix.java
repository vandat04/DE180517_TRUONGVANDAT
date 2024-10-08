
package W2;

public class CalculateMatrix {
    // Matrix addition
    public Matrix add(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getRows() != matrix2.getRows() || matrix1.getCols() != matrix2.getCols()) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null;
        }
        Matrix result = new Matrix(matrix1.getRows(), matrix1.getCols());
        for (int row = 0; row < matrix1.getRows(); row++) {
            for (int col = 0; col < matrix1.getCols(); col++) {
                result.setEachData(matrix1.getEachData(row, col) + matrix2.getEachData(row, col), row, col);
            }
        }
        return result;
    }

    // Matrix subtraction
    public Matrix sub(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getRows() != matrix2.getRows() || matrix1.getCols() != matrix2.getCols()) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null;
        }
        Matrix result = new Matrix(matrix1.getRows(), matrix1.getCols());
        for (int row = 0; row < matrix1.getRows(); row++) {
            for (int col = 0; col < matrix1.getCols(); col++) {
                result.setEachData(matrix1.getEachData(row, col) - matrix2.getEachData(row, col), row, col);
            }
        }
        return result;
    }

    // Matrix multiplication
    public Matrix multiply(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getCols() != matrix2.getRows()) {
            System.out.println("Matrices cannot be multiplied: Invalid dimensions.");
            return null;
        }
        Matrix result = new Matrix(matrix1.getRows(), matrix2.getCols());
        for (int row = 0; row < matrix1.getRows(); row++) {
            for (int col = 0; col < matrix2.getCols(); col++) {
                result.setEachData(0, row, col);
                for (int k = 0; k < matrix1.getCols(); k++) {
                    result.setEachData(result.getEachData(row, col) + matrix1.getEachData(row, k) * matrix2.getEachData(k, col), row, col);
                }
            }
        }
        return result;
    }
}
