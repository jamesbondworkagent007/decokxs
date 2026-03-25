package co.nstant.in.cbor.model;

/* JADX INFO: loaded from: classes2.dex */
public enum MajorType {
    INVALID(-1),
    UNSIGNED_INTEGER(0),
    NEGATIVE_INTEGER(1),
    BYTE_STRING(2),
    UNICODE_STRING(3),
    ARRAY(4),
    MAP(5),
    TAG(6),
    SPECIAL(7);

    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static MajorType ofByte(int i) {
        switch (i >> 5) {
            case 0:
                return UNSIGNED_INTEGER;
            case 1:
                return NEGATIVE_INTEGER;
            case 2:
                return BYTE_STRING;
            case 3:
                return UNICODE_STRING;
            case 4:
                return ARRAY;
            case 5:
                return MAP;
            case 6:
                return TAG;
            case 7:
                return SPECIAL;
            default:
                return INVALID;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getValue() {
        return this.value;
    }

    MajorType(int i) {
        this.value = i;
    }
}
