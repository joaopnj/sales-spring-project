package joao.engineering.sales.enums;

public enum Sex {

    MALE((short) 0, "MALE" ),
    FEMALE((short) 1, "FEMALE");

    private Short value;
    private String text;

    Sex(Short value, String text) {
        this.value = value;
        this.text = text;
    }
}
