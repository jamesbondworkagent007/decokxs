package o;

import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.usP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49640usP {
    public static final C49640usP OLrzqt = new C49640usP();

    private C49640usP() {
    }

    public static /* synthetic */ java.lang.String getBusinessTradeModeTitle$default(C49640usP c49640usP, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return c49640usP.copydefault(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [25=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r4.equals("SPOT") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r4.equals("MARGIN") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return o.C33070mpX.AYXKKw(o.C49511upt.Activity.AxsJAY);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(@NotNull java.lang.String str, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES"))) {
            return C33070mpX.AYXKKw(C49511upt.Activity.sSMYrx);
        }
        switch (str.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                if (str.equals("OPTION")) {
                    return C33070mpX.AYXKKw(C49511upt.Activity.gHZMYf);
                }
                return C33070mpX.AYXKKw(C49511upt.Activity.wlaJM);
            case -1201878036:
                if (str.equals("COPYTRADING")) {
                    java.lang.String strKWHzl = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).KWHzl();
                    return strKWHzl == null ? "" : strKWHzl;
                }
                return C33070mpX.AYXKKw(C49511upt.Activity.wlaJM);
            case 2552066:
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    return C33070mpX.AYXKKw(C49511upt.Activity.zuBGHE);
                }
                return C33070mpX.AYXKKw(C49511upt.Activity.wlaJM);
            case 214415088:
                if (str.equals("FUTURES")) {
                    return C33070mpX.AYXKKw(C49511upt.Activity.sSMYrx);
                }
                return C33070mpX.AYXKKw(C49511upt.Activity.wlaJM);
            case 1669573011:
                if (str.equals("CONVERT")) {
                    return C33070mpX.AYXKKw(C49511upt.Activity.QSBOWP);
                }
                return C33070mpX.AYXKKw(C49511upt.Activity.wlaJM);
            case 1983970406:
                if (str.equals("CEDEFI")) {
                    return C33070mpX.AYXKKw(C49511upt.Activity.fARcdN);
                }
                return C33070mpX.AYXKKw(C49511upt.Activity.wlaJM);
            default:
                return C33070mpX.AYXKKw(C49511upt.Activity.wlaJM);
        }
    }
}
