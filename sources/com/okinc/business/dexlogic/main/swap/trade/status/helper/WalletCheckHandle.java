package com.okinc.business.dexlogic.main.swap.trade.status.helper;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.error.NoWallet;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.WalletCheckHandle;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC23101hrq;
import o.AbstractC58260yxt;
import o.C22380heK;
import o.C22873hna;
import o.C23263hut;
import o.C33050mpD;
import o.InterfaceC23194htd;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class WalletCheckHandle {
    public static final int $stable = 8;
    private final MutableLiveData<MpcWalletService.MpcWalletAbleStatus> mpcWalletState;
    private final AbstractC23101hrq viewModel;
    private Object walletCheck;

    public WalletCheckHandle(@NotNull MutableLiveData<MpcWalletService.MpcWalletAbleStatus> mutableLiveData, @NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.mpcWalletState = mutableLiveData;
        this.viewModel = abstractC23101hrq;
        this.walletCheck = new Object();
    }

    public final void checkWallet(@NotNull final TradeStatePool tradeStatePool, @NotNull final String str, @NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        C33050mpD.OLrzqt(this.walletCheck);
        final boolean z = !this.viewModel.Dmq();
        C22380heK c22380heK = C22380heK.OLrzqt;
        C23263hut c23263hutDjBIcL = c22380heK.djBIcL();
        final WsHandle wsHandleAYXKKw = c23263hutDjBIcL != null ? c23263hutDjBIcL.AYXKKw() : null;
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = c22380heK.copydefault(str).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hpi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCheckHandle.checkWallet$lambda$1(this.copydefault, str, fragmentActivity, wsHandleAYXKKw, tradeStatePool, z, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCheckHandle.checkWallet$lambda$3(this.EZpvd, tradeStatePool, z, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hpk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.walletCheck);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkWallet$lambda$1(final WalletCheckHandle walletCheckHandle, final String str, FragmentActivity fragmentActivity, final WsHandle wsHandle, final TradeStatePool tradeStatePool, final boolean z, final InterfaceC9738bbJ interfaceC9738bbJ) {
        C22873hna c22873hnaQUSxYX = walletCheckHandle.viewModel.QUSxYX();
        Intrinsics.copydefault(interfaceC9738bbJ);
        final DefiChainInfo defiChainInfoEZpvd = c22873hnaQUSxYX.EZpvd(interfaceC9738bbJ);
        if (defiChainInfoEZpvd == null) {
            return Unit.INSTANCE;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        final boolean zCopydefault = c22380heK.copydefault(str).fARcdN().copydefault(interfaceC9738bbJ);
        c22380heK.copydefault(str).fARcdN().KWHzl(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.hpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCheckHandle.checkWallet$lambda$1$lambda$0(str, interfaceC9738bbJ, defiChainInfoEZpvd, walletCheckHandle, wsHandle, tradeStatePool, zCopydefault, z, (MpcWalletService.MpcWalletAbleStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkWallet$lambda$1$lambda$0(String str, InterfaceC9738bbJ interfaceC9738bbJ, DefiChainInfo defiChainInfo, WalletCheckHandle walletCheckHandle, WsHandle wsHandle, TradeStatePool tradeStatePool, boolean z, boolean z2, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(str).fARcdN();
        Intrinsics.copydefault(interfaceC9738bbJ);
        if (interfaceC23194htdFARcdN.OLrzqt(interfaceC9738bbJ, defiChainInfo.getChainId(), walletCheckHandle.viewModel.UlJrfe())) {
            if (wsHandle != null) {
                wsHandle.subWs();
            }
            walletCheckHandle.mpcWalletState.setValue(mpcWalletAbleStatus);
            if (interfaceC9738bbJ.ORxRYg() && yDY.gEmmrt(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen).contains(mpcWalletAbleStatus)) {
                walletCheckHandle.refreshStateMpcWalletLegal(tradeStatePool);
            } else {
                walletCheckHandle.refreshStateWallet(tradeStatePool);
            }
        } else if (z) {
            if (wsHandle != null) {
                wsHandle.unSubWs();
            }
            walletCheckHandle.refreshStateTrackingWallet(tradeStatePool);
        } else if (interfaceC9738bbJ.zsXlph()) {
            if (wsHandle != null) {
                wsHandle.unSubWs();
            }
            walletCheckHandle.refreshStateNoWallet(tradeStatePool, z2);
        } else {
            if (wsHandle != null) {
                wsHandle.subWs();
            }
            walletCheckHandle.refreshStateWalletLegal(tradeStatePool);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkWallet$lambda$3(WalletCheckHandle walletCheckHandle, TradeStatePool tradeStatePool, boolean z, Throwable th) {
        if (th instanceof NoWallet) {
            walletCheckHandle.refreshStateNoWallet(tradeStatePool, z);
        } else {
            walletCheckHandle.refreshStateWalletLegal(tradeStatePool);
        }
        return Unit.INSTANCE;
    }

    public final SwapState getSyncWalletState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC23194htd interfaceC23194htdFARcdN = c22380heK.copydefault(str).fARcdN();
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = interfaceC23194htdFARcdN.AEQbTJ();
        if (interfaceC9738bbJAEQbTJ == null) {
            return SwapState.NO_WALLET;
        }
        DefiChainInfo defiChainInfoEZpvd = this.viewModel.QUSxYX().EZpvd(interfaceC9738bbJAEQbTJ);
        if (defiChainInfoEZpvd == null) {
            return SwapState.WALLET_LEGAL;
        }
        boolean zOLrzqt = c22380heK.copydefault(str).fARcdN().OLrzqt(interfaceC9738bbJAEQbTJ, defiChainInfoEZpvd.getChainId(), this.viewModel.UlJrfe());
        boolean zCopydefault = c22380heK.copydefault(str).fARcdN().copydefault(interfaceC9738bbJAEQbTJ);
        boolean zKWHzl = interfaceC23194htdFARcdN.KWHzl(interfaceC9738bbJAEQbTJ);
        if (zCopydefault) {
            return SwapState.TRACKING_WALLET_SUCCESS;
        }
        if (zKWHzl) {
            return SwapState.NO_WALLET;
        }
        if (interfaceC9738bbJAEQbTJ.ORxRYg()) {
            boolean zKWHzl2 = CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends MpcWalletService.MpcWalletAbleStatus>) ((Iterable<? extends Object>) yDY.gEmmrt(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen)), this.mpcWalletState.getValue());
            if (zOLrzqt && !zKWHzl2) {
                return SwapState.WALLET_SUCCESS;
            }
            if (zKWHzl2) {
                return SwapState.MPC_WALLET_LEGAL;
            }
            return SwapState.WALLET_LEGAL;
        }
        return SwapState.WALLET_SUCCESS;
    }

    public final boolean isWalletError(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return yDY.gEmmrt(SwapState.MPC_WALLET_LEGAL, SwapState.WALLET_LEGAL).contains(getSyncWalletState(str));
    }

    private final void refreshStateWalletLegal(TradeStatePool tradeStatePool) {
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.WALLET_LEGAL, true, true));
    }

    private final void refreshStateNoWallet(TradeStatePool tradeStatePool, boolean z) {
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.NO_WALLET, true, z));
    }

    private final void refreshStateTrackingWallet(TradeStatePool tradeStatePool) {
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.TRACKING_WALLET_SUCCESS, true, true));
    }

    private final void refreshStateWallet(TradeStatePool tradeStatePool) {
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.WALLET_SUCCESS, false, true));
    }

    private final void refreshStateMpcWalletLegal(TradeStatePool tradeStatePool) {
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, SwapState.MPC_WALLET_LEGAL, true, true));
    }

    public final void disposeCheck() {
        C33050mpD.OLrzqt(this.walletCheck);
    }
}
