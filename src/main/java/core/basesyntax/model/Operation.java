package core.basesyntax.model;

public enum Operation {
    BALANCE("b"),
    SUPPLY("s"),
    PURCHASE("p"),
    RETURN("r");

    private String code;

    Operation(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Operation fromCode(String code) {
        for (Operation operation : values()) {
            if (operation.code.equals(code)) {
                return operation;
            }
        }
        throw new IllegalArgumentException("Invalid operation code: " + code);
    }
}