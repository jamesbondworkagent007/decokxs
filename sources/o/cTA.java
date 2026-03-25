package o;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.ApiException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cTA {
    public final java.lang.String KWHzl = cTA.class.getSimpleName();
    public final java.lang.String EZpvd = "ok_backup_wallet_password";

    public static final java.lang.String AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public final void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.copydefault(0).OLrzqt(yBP.AEQbTJ());
        final Function1 function12 = new Function1() { // from class: o.cTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTA.copydefault(this.copydefault, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cTF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cTA.AYXKKw(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C11607cUn.valueOf(abstractC58260yxtCopydefault), fragmentActivity);
        final Function1 function13 = new Function1() { // from class: o.cTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTA.OLrzqt(function1, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cTA.djBIcL(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.cTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTA.EZpvd(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cTA.AhwBna(function14, obj);
            }
        });
    }

    public static final java.lang.String copydefault(cTA cta, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C11573cTg.KWHzl.OLrzqt(cta.EZpvd, false);
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(cTA cta, java.lang.Throwable th) {
        if (th instanceof ApiException) {
            java.lang.String str = cta.KWHzl;
            ApiException apiException = (ApiException) th;
            apiException.getStatusCode();
            apiException.getMessage();
        } else {
            java.lang.String str2 = cta.KWHzl;
            th.getMessage();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String strEZpvd = xXX.EZpvd.EZpvd(str);
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.copydefault(0).OLrzqt(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.cTG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTA.OLrzqt(this.EZpvd, strEZpvd, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cTI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cTA.isConnected(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        final Function1 function12 = new Function1() { // from class: o.cTK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTA.KWHzl(this.KWHzl, strEZpvd, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cTL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cTA.gEmmrt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cTB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTA.AEQbTJ(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cTA.fetchVPNInfo(function13, obj);
            }
        });
    }

    public static final java.lang.String isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String OLrzqt(cTA cta, java.lang.String str, java.lang.Integer num) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(num, "");
        C11573cTg.KWHzl.EZpvd(cta.EZpvd, "", str, false);
        return str;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(cTA cta, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = cta.KWHzl;
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(cTA cta, java.lang.Throwable th) {
        if (th instanceof ApiException) {
            java.lang.String str = cta.KWHzl;
            ApiException apiException = (ApiException) th;
            apiException.getStatusCode();
            apiException.getMessage();
        } else {
            java.lang.String str2 = cta.KWHzl;
            th.getMessage();
        }
        return Unit.INSTANCE;
    }
}
