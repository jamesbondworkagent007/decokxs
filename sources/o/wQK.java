package o;

import android.view.View;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wQK {
    public static final wQK OLrzqt = new wQK();

    private wQK() {
    }

    public final void AEQbTJ(android.content.Context context, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final TacticsData tacticsData) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (context != null) {
            if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "contract_grid")) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C55688xof.Application.dHAKvv), java.lang.Integer.valueOf(C55688xof.Application.setMediaTypeactivity_release));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C55688xof.Application.createIntent), java.lang.Integer.valueOf(C55688xof.Application.IMediaControllerCallbackStub));
            }
            int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
            int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(iIntValue));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.getLong));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(iIntValue2), new View.OnClickListener() { // from class: o.wQO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wQK.copydefault(viewOnClickListenerC54939xaY, tacticsData, fragmentManager, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.send), new View.OnClickListener() { // from class: o.wQN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wQK.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, TacticsData tacticsData, androidx.fragment.app.FragmentManager fragmentManager, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        java.lang.String orderType = tacticsData.getOrderType();
        if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
            vGL.Companion.OLrzqt(tacticsData).show(fragmentManager);
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid") || tacticsData.isFunctionForbidden(TacticsForbiddenFunctions.EditParameters)) {
                return;
            }
            C50225vGn.Companion.copydefault(tacticsData).show(fragmentManager);
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
