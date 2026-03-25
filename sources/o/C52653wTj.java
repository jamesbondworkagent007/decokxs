package o;

import android.view.View;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wTj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52653wTj {
    public static final C52653wTj OLrzqt = new C52653wTj();

    private C52653wTj() {
    }

    public static final Unit copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wTj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showConfirmManuallyAddFundsDialog$default(C52653wTj c52653wTj, android.content.Context context, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: o.wTl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C52653wTj.copydefault((ViewOnClickListenerC54939xaY) obj2);
                }
            };
        }
        c52653wTj.copydefault(context, str, str2, function1);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C55688xof.Application.dxcTrN, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str), C56390yDp.OLrzqt("ccy", str2))));
        viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.hrNTAI, new View.OnClickListener() { // from class: o.wTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52653wTj.copydefault(function1, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C48033uCm.Fragment.OJuSTm, new View.OnClickListener() { // from class: o.wTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52653wTj.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wTj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showConfirmOrderAtMarketPrice$default(C52653wTj c52653wTj, android.content.Context context, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.wTi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C52653wTj.AEQbTJ((ViewOnClickListenerC54939xaY) obj2);
                }
            };
        }
        c52653wTj.copydefault(context, (Function1<? super ViewOnClickListenerC54939xaY, Unit>) function1);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull final Function1<? super ViewOnClickListenerC54939xaY, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.OLrzqt(C55688xof.Application.dvKsVJ, context));
        viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.hrNTAI, new View.OnClickListener() { // from class: o.wTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52653wTj.AEQbTJ(function1, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C48033uCm.Fragment.OJuSTm, new View.OnClickListener() { // from class: o.wTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52653wTj.valueOf(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function1.invoke(viewOnClickListenerC54939xaY);
    }

    public static final void valueOf(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultKt));
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C48033uCm.Fragment.fERRXa, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amount1", str), C56390yDp.OLrzqt("ccy1", str3), C56390yDp.OLrzqt("amount2", str2), C56390yDp.OLrzqt("ccy2", str3))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wTk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52653wTj.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
