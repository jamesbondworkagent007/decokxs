package com.ibm.icu.text;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STANDARD_NAMES' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class DisplayContext {
    private static final /* synthetic */ DisplayContext[] $VALUES;
    public static final DisplayContext CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE;
    public static final DisplayContext CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE;
    public static final DisplayContext CAPITALIZATION_FOR_STANDALONE;
    public static final DisplayContext CAPITALIZATION_FOR_UI_LIST_OR_MENU;
    public static final DisplayContext CAPITALIZATION_NONE;
    public static final DisplayContext DIALECT_NAMES;
    public static final DisplayContext LENGTH_FULL;
    public static final DisplayContext LENGTH_SHORT;
    public static final DisplayContext NO_SUBSTITUTE;
    public static final DisplayContext STANDARD_NAMES;
    public static final DisplayContext SUBSTITUTE;
    private final Type type;
    private final int value;

    public enum Type {
        DIALECT_HANDLING,
        CAPITALIZATION,
        DISPLAY_LENGTH,
        SUBSTITUTE_HANDLING
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Type type() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int value() {
        return this.value;
    }

    public static DisplayContext valueOf(String str) {
        return (DisplayContext) Enum.valueOf(DisplayContext.class, str);
    }

    public static DisplayContext[] values() {
        return (DisplayContext[]) $VALUES.clone();
    }

    static {
        Type type = Type.DIALECT_HANDLING;
        DisplayContext displayContext = new DisplayContext("STANDARD_NAMES", 0, type, 0);
        STANDARD_NAMES = displayContext;
        DisplayContext displayContext2 = new DisplayContext("DIALECT_NAMES", 1, type, 1);
        DIALECT_NAMES = displayContext2;
        Type type2 = Type.CAPITALIZATION;
        DisplayContext displayContext3 = new DisplayContext("CAPITALIZATION_NONE", 2, type2, 0);
        CAPITALIZATION_NONE = displayContext3;
        DisplayContext displayContext4 = new DisplayContext("CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE", 3, type2, 1);
        CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE = displayContext4;
        DisplayContext displayContext5 = new DisplayContext("CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE", 4, type2, 2);
        CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE = displayContext5;
        DisplayContext displayContext6 = new DisplayContext("CAPITALIZATION_FOR_UI_LIST_OR_MENU", 5, type2, 3);
        CAPITALIZATION_FOR_UI_LIST_OR_MENU = displayContext6;
        DisplayContext displayContext7 = new DisplayContext("CAPITALIZATION_FOR_STANDALONE", 6, type2, 4);
        CAPITALIZATION_FOR_STANDALONE = displayContext7;
        Type type3 = Type.DISPLAY_LENGTH;
        DisplayContext displayContext8 = new DisplayContext("LENGTH_FULL", 7, type3, 0);
        LENGTH_FULL = displayContext8;
        DisplayContext displayContext9 = new DisplayContext("LENGTH_SHORT", 8, type3, 1);
        LENGTH_SHORT = displayContext9;
        Type type4 = Type.SUBSTITUTE_HANDLING;
        DisplayContext displayContext10 = new DisplayContext("SUBSTITUTE", 9, type4, 0);
        SUBSTITUTE = displayContext10;
        DisplayContext displayContext11 = new DisplayContext("NO_SUBSTITUTE", 10, type4, 1);
        NO_SUBSTITUTE = displayContext11;
        $VALUES = new DisplayContext[]{displayContext, displayContext2, displayContext3, displayContext4, displayContext5, displayContext6, displayContext7, displayContext8, displayContext9, displayContext10, displayContext11};
    }

    private DisplayContext(String str, int i, Type type, int i2) {
        this.type = type;
        this.value = i2;
    }
}
