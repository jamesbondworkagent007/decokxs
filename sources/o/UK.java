package o;

/* JADX INFO: loaded from: classes21.dex */
public class UK {
    public static final UE copydefault = new UE();
    public static final UL AEQbTJ = new UL();

    private UK() {
    }

    public static double copydefault(java.lang.CharSequence charSequence) throws java.lang.NumberFormatException {
        return EZpvd(charSequence, 0, charSequence.length());
    }

    public static double EZpvd(java.lang.CharSequence charSequence, int i, int i2) throws java.lang.NumberFormatException {
        long jCopydefault = AEQbTJ.copydefault(charSequence, i, i2);
        if (jCopydefault == -1) {
            throw new java.lang.NumberFormatException("Illegal input");
        }
        return java.lang.Double.longBitsToDouble(jCopydefault);
    }
}
