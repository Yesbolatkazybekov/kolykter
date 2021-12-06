package mashina.exception;

public class CarException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public CarException() {
        super();
    }

    /**
     * Korsetylgen khabarlamamen jana erekshelyk jasaidy , sebeby , basylgan nemese
     * oshyrylgen jane jazu mumkyndyktery bar stek yzy qosylgan nemese oshyrylgen
     *
     * @param message            khabarlama
     * @param cause              sebep
     * @param enableSuppression  Basudyn qosuly nemese owytuly ekenyn anyqtau
     * @param writableStackTrace Stack yzy jazyluy kerek pe
     */
    public CarException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Korsetylgen khabarlamamen jane sebeppen jana erekshelyk jasaidy
     *
     * @param message Khabarlama
     * @param cause   Sebep
     */
    public CarException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Korsetylgen khabarlamamen jana erekshelyk jasaidy
     *
     * @param message Khabarlama
     */
    public CarException(String message) {
        super(message);
    }

    /**
     * Korsetylgen sebeppen jana erekshelyk jasaidy (cause==null ? null :
     * cause.toString()) (adette class pen sebep turaly egjey-tegjeyli khabarlama
     * bar
     *
     * @param cause Sebep
     */
    public CarException(Throwable cause) {
        super(cause);
    }
}