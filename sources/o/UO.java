package o;

/* JADX INFO: loaded from: classes21.dex */
public class UO {
    public static final UN AEQbTJ = new UN();
    public static final UR EZpvd = new UR();

    private UO() {
    }

    public static float EZpvd(java.lang.CharSequence charSequence) throws java.lang.NumberFormatException {
        return AEQbTJ(charSequence, 0, charSequence.length());
    }

    public static float AEQbTJ(java.lang.CharSequence charSequence, int i, int i2) throws java.lang.NumberFormatException {
        long jCopydefault = EZpvd.copydefault(charSequence, i, i2);
        if (jCopydefault == -1) {
            throw new java.lang.NumberFormatException("Illegal input");
        }
        return java.lang.Float.intBitsToFloat((int) jCopydefault);
    }
}
