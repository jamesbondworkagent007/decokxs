package o;

import android.view.View;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.bot.data.SwapCoinMProfitSwitchUiModel;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50252vHn {
    public static final C50252vHn OLrzqt = new C50252vHn();

    private C50252vHn() {
    }

    public final void KWHzl(@NotNull android.content.Context context, TacticsData tacticsData) {
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel;
        Intrinsics.checkNotNullParameter(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DUUtXg));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.DGUQLIekVPG);
        java.lang.String ccy = (tacticsData == null || (swapCoinMProfitSwitchUiModel = tacticsData.getSwapCoinMProfitSwitchUiModel()) == null) ? null : swapCoinMProfitSwitchUiModel.getCcy();
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ccy != null ? ccy : ""))));
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.vHq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50252vHn.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
