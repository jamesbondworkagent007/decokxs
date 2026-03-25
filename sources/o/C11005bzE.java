package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.web3.security.service.Web3SecurityService;
import com.okinc.web3.security.service.Web3SecurityServiceProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11005bzE {
    public static final C11005bzE EZpvd = new C11005bzE();

    private C11005bzE() {
    }

    public final void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C11003bzC.Companion.KWHzl(function1).show(fragmentActivity.getSupportFragmentManager(), "DeleteNostrPrivateWalletNoticeFragment");
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIDGUQLI));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.zlvcHA), new View.OnClickListener() { // from class: o.bzI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C11005bzE.KWHzl(viewOnClickListenerC54939xaY, function1, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh), new View.OnClickListener() { // from class: o.bzH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C11005bzE.EZpvd(viewOnClickListenerC54939xaY, function1, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function1 function1, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function1.invoke(java.lang.Boolean.TRUE);
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function1 function1, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function1.invoke(java.lang.Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull C13855daU c13855daU) {
        java.lang.String strDjBIcL;
        java.lang.Character chWlaJM;
        java.lang.String string;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(c13855daU, "");
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(c13855daU.copydefault()), true);
        Web3SecurityService service = Web3SecurityServiceProvider.getService();
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (c10854bwMCopydefault != null ? c10854bwMCopydefault.copydefault() : null))) {
            strOLrzqt = c10854bwMCopydefault != null ? c10854bwMCopydefault.copydefault() : null;
        } else if (c10854bwMCopydefault != null && (strDjBIcL = c10854bwMCopydefault.djBIcL()) != null && (chWlaJM = C59454zhO.wlaJM(strDjBIcL)) != null && (string = chWlaJM.toString()) != null) {
            strOLrzqt = C9700baY.OLrzqt(string);
        }
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        java.lang.String strDjBIcL2 = c10854bwMCopydefault != null ? c10854bwMCopydefault.djBIcL() : null;
        service.showPrivateKeyBottomSheet(supportFragmentManager, strOLrzqt, strDjBIcL2 == null ? "" : strDjBIcL2, c13855daU.AEQbTJ(), C14079deg.getAddressStr$default(C14079deg.EZpvd, c13855daU.KWHzl(), false, 2, null));
    }
}
