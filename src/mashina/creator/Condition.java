package mashina.creator;

public enum Condition {
    Buryn_ustalyngan, Jana;

    public String toString() {
        char[] arr = super.toString().toLowerCase().toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return String.valueOf(arr);
    }

}
