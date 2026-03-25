package o;

import com.okinc.business.trade.features.home.ui.meme.statepool.CheckStep;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStep;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWQ {
    public final kKG copydefault;

    @yCM
    public kWQ(@NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kkg, "");
        this.copydefault = kkg;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull TradeStatePool tradeStatePool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.copydefault.valueOf();
        if (interfaceC9738bbJValueOf == null || interfaceC9738bbJValueOf.zsXlph()) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.NO_WALLET, true, false));
            return;
        }
        if (interfaceC9738bbJValueOf.QfsBiF()) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.TRACKING_WALLET_SUCCESS, true, true));
            return;
        }
        if (interfaceC9738bbJValueOf.getFieldNames()) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.SWITCH_WALLET, true, false));
            return;
        }
        boolean zOLrzqt = C22380heK.OLrzqt.copydefault(str).fARcdN().OLrzqt(interfaceC9738bbJValueOf, str2, true);
        if (interfaceC9738bbJValueOf.ORxRYg() && yDY.gEmmrt(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen).contains(mpcWalletAbleStatus)) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.MPC_WALLET_LEGAL, true, false));
        } else {
            if (!zOLrzqt) {
                tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.SWITCH_WALLET, true, true));
                return;
            }
            EZpvd();
            OLrzqt();
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.WALLET_SUCCESS, false, true));
        }
    }

    public final void EZpvd() {
        C23263hut c23263hutDjBIcL = C22380heK.OLrzqt.djBIcL();
        if (c23263hutDjBIcL == null) {
            return;
        }
        c23263hutDjBIcL.AYXKKw().subWs();
    }

    public final void OLrzqt() {
        C23261hur c23261hurCopydefault = C22380heK.OLrzqt.copydefault();
        if (c23261hurCopydefault == null) {
            return;
        }
        c23261hurCopydefault.EZpvd().subWs();
    }
}
