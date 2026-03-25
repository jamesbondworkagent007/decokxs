package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.buN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10749buN implements Function1 {
    public static int OLrzqt;
    public static int copydefault;

    /* JADX DEBUG: Class process forced to load method for inline: o.buL.AEQbTJ(java.lang.String):kotlin.Pair */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return C10747buL.KWHzl((java.lang.String) obj);
    }

    public static int EZpvd() {
        int i = copydefault;
        int i2 = i % 9206777;
        copydefault = i + 1;
        if (i2 != 0) {
            return OLrzqt;
        }
        int iNextInt = new java.util.Random().nextInt(957044662);
        OLrzqt = iNextInt;
        return iNextInt;
    }
}
