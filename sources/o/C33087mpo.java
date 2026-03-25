package o;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33087mpo {
    public static int AYXKKw;
    public static int AhwBna;
    public static int AkhnZx;
    public static int AuCTel;
    public static int DbNXlk;
    public static int OLrzqt;
    public static int djBIcL;
    public static int ejfBZ;
    public static int fARcdN;
    public static int fIwbmz;
    public static int fJNWhG;
    public static int fetchVPNInfo;
    public static int gEmmrt;
    public static int getFieldNames;
    public static int getNewProxyInstance;
    public static int hDKMBd;
    public static int isConnected;
    public static int iwGUEr;
    public static int uzCIH;
    public static int valueOf;
    public static int values;
    public static int wlaJM;
    public static int zLjUOn;
    public static final C33087mpo KWHzl = new C33087mpo();
    public static int AuCTelauCTel = android.R.string.cancel;
    public static Function2<? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.String> copydefault = new Function2() { // from class: o.mpn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return C33087mpo.AEQbTJ(((java.lang.Integer) obj).intValue(), (java.util.Map) obj2);
        }
    };
    public static Function1<? super android.content.Context, ? extends android.content.Context> AEQbTJ = new Function1() { // from class: o.mpm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C33087mpo.AEQbTJ((android.content.Context) obj);
        }
    };
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final android.content.Context AEQbTJ(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(int i, java.util.Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        fJNWhG = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(int i) {
        AuCTelauCTel = i;
    }

    private C33087mpo() {
    }

    public static /* synthetic */ java.lang.String getString$default(C33087mpo c33087mpo, android.content.Context context, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            str = "";
        }
        return c33087mpo.AEQbTJ(context, i, str);
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, @androidx.annotation.StringRes int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String string = context.getString(i);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }
}
