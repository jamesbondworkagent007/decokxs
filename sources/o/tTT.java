package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tTT {
    public static final tTT copydefault = new tTT();

    private tTT() {
    }

    public static /* synthetic */ void navigateToTradeDetailPage$default(tTT ttt, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        ttt.OLrzqt(context, str, str2, str3);
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        if (str2 == null || str == null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, AEQbTJ(str, null, str3), null, new Function1() { // from class: o.tTS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tTT.OLrzqt((AbstractC43238rlX) obj);
                }
            }, 4, null);
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
        if (((interfaceC54581xNrEZpvd == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrEZpvd.OLrzqt(C46450tUu.copydefault.OLrzqt(java.lang.Integer.parseInt(str)))) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str2)) == null) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C47501trL.Fragment.invokespecialgBtXYZ), 0, 1, (java.lang.Object) null);
        } else {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, AEQbTJ(str, str2, str3), null, new Function1() { // from class: o.tTR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tTT.AEQbTJ((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        boolean z;
        java.lang.String str4;
        java.lang.String str5;
        boolean z2 = true;
        java.lang.String str6 = "trade/main/page";
        if (str != null) {
            str6 = "trade/main/page?bizType=" + str;
            z = true;
        } else {
            z = false;
        }
        if (str2 == null) {
            z2 = z;
            str4 = str6;
        } else if (z) {
            str6 = str6 + "&instId=" + str2;
            z2 = z;
            str4 = str6;
        } else {
            str4 = str6 + "?instId=" + str2;
        }
        if (str3 == null) {
            return str4;
        }
        if (z2) {
            str5 = "&bottomListFlag=" + str3;
        } else {
            str5 = "?bottomListFlag=" + str3;
        }
        return str4 + str5;
    }
}
