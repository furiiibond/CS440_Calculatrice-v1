package fr.esisar.calculatrice;

public class Calculatrice {

    //addition
    /**
     * @param operande1 is the first operand of the addition
     * @param operande2 is the second operand of the addition
     * @return the result of the addition of the two operands
     */
    public int ajouter(int operande1, int operande2) {
        return operande1 + operande2;
    }

    //soustraction
    /**
     * @param operande1 is the first operand of the subtraction
     * @param operande2 is the second operand of the subtraction
     * @return the result of the subtraction of the two operands
     */
    public int soustraire(int operande1, int operande2) {
        return operande1 - operande2;
    }

    //multiplication
    /**
     * @param operande1 is the first operand of the multiplication
     * @param operande2 is the second operand of the multiplication
     * @return the result of the multiplication of the two operands
     */
    public float multiplier(int operande1, int operande2) {
        return operande1 * operande2;
    }

    //division
    /**
     * @param operande1 is the first operand of the division
     * @param operande2 is the second operand of the division
     * @return the result of the division of the two operands
     */
    public float diviser(int operande1, int operande2) {
        // convert int to float to avoid integer division without cast
        return (float) operande1 / operande2;
    }
}
