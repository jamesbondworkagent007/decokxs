package com.okinc.business.dexui.main.limitorder.manager.handle;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.error.NoWallet;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeLimitStatePool;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitErrorViewHandle;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitWalletCheckHandle;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58260yxt;
import o.C22380heK;
import o.C22416heu;
import o.C22495hgT;
import o.C23261hur;
import o.C33050mpD;
import o.C33129mqd;
import o.InterfaceC22433hfK;
import o.InterfaceC23194htd;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.gLQ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitWalletCheckHandle {
    public static final int $stable = 8;
    private SwapState currentWalletState;
    private final InterfaceC22433hfK limitInputStateInterface;
    private final MutableLiveData<MpcWalletService.MpcWalletAbleStatus> mpcWalletState;
    private Object walletCheck;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.MPC_WALLET_LEGAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.WALLET_LEGAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    public LimitWalletCheckHandle(@NotNull MutableLiveData<MpcWalletService.MpcWalletAbleStatus> mutableLiveData, InterfaceC22433hfK interfaceC22433hfK) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.mpcWalletState = mutableLiveData;
        this.limitInputStateInterface = interfaceC22433hfK;
        this.walletCheck = new Object();
        this.currentWalletState = SwapState.WALLET_SUCCESS;
    }

    public final void checkWallet(@NotNull final C22495hgT c22495hgT, @NotNull final String str, @NotNull final TradeLimitStatePool tradeLimitStatePool, @NotNull final String str2, @NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradeLimitStatePool, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        C33050mpD.OLrzqt(this.walletCheck);
        C22380heK c22380heK = C22380heK.OLrzqt;
        C23261hur c23261hurCopydefault = c22380heK.copydefault();
        final LimitWsHandle limitWsHandleEZpvd = c23261hurCopydefault != null ? c23261hurCopydefault.EZpvd() : null;
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = c22380heK.copydefault(str2).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hLF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitWalletCheckHandle.checkWallet$lambda$1(str2, fragmentActivity, str, limitWsHandleEZpvd, this, tradeLimitStatePool, c22495hgT, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hLC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hLD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitWalletCheckHandle.checkWallet$lambda$3(this.copydefault, tradeLimitStatePool, limitWsHandleEZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hLG
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
    public static final Unit checkWallet$lambda$1(final String str, FragmentActivity fragmentActivity, final String str2, final LimitWsHandle limitWsHandle, final LimitWalletCheckHandle limitWalletCheckHandle, final TradeLimitStatePool tradeLimitStatePool, final C22495hgT c22495hgT, final InterfaceC9738bbJ interfaceC9738bbJ) {
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC23194htd interfaceC23194htdFARcdN = c22380heK.copydefault(str).fARcdN();
        Intrinsics.copydefault(interfaceC9738bbJ);
        final boolean zCopydefault = interfaceC23194htdFARcdN.copydefault(interfaceC9738bbJ);
        c22380heK.copydefault(str).fARcdN().KWHzl(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.hLx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitWalletCheckHandle.checkWallet$lambda$1$lambda$0(str, interfaceC9738bbJ, str2, limitWsHandle, limitWalletCheckHandle, tradeLimitStatePool, c22495hgT, zCopydefault, (MpcWalletService.MpcWalletAbleStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkWallet$lambda$1$lambda$0(String str, InterfaceC9738bbJ interfaceC9738bbJ, String str2, LimitWsHandle limitWsHandle, LimitWalletCheckHandle limitWalletCheckHandle, TradeLimitStatePool tradeLimitStatePool, C22495hgT c22495hgT, boolean z, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(str).fARcdN();
        Intrinsics.copydefault(interfaceC9738bbJ);
        if (interfaceC23194htdFARcdN.OLrzqt(interfaceC9738bbJ, str2, true) && !interfaceC9738bbJ.getFieldNames()) {
            if (limitWsHandle != null) {
                limitWsHandle.subWs();
            }
            limitWalletCheckHandle.mpcWalletState.setValue(mpcWalletAbleStatus);
            if (interfaceC9738bbJ.ORxRYg() && yDY.gEmmrt(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen).contains(mpcWalletAbleStatus)) {
                if (C22416heu.zLjUOn()) {
                    limitWalletCheckHandle.refreshStateSAWallet(tradeLimitStatePool);
                } else {
                    limitWalletCheckHandle.refreshStateMpcWalletLegal(tradeLimitStatePool);
                }
            } else {
                gLQ glqOLrzqt = c22495hgT.OLrzqt(str2, c22495hgT.dmfpNf());
                if (glqOLrzqt instanceof gLQ.ActionBar) {
                    c22495hgT.EZpvd(SwapState.SA_NOT_SMART_ACCOUNT);
                    InterfaceC22433hfK interfaceC22433hfK = limitWalletCheckHandle.limitInputStateInterface;
                    if (interfaceC22433hfK != null) {
                        interfaceC22433hfK.EZpvd(LimitErrorViewHandle.ErrorType.SmartAccountStatusError);
                    }
                } else if (glqOLrzqt instanceof gLQ.FragmentManager) {
                    c22495hgT.EZpvd(SwapState.SA_DISABLED);
                    InterfaceC22433hfK interfaceC22433hfK2 = limitWalletCheckHandle.limitInputStateInterface;
                    if (interfaceC22433hfK2 != null) {
                        interfaceC22433hfK2.EZpvd(LimitErrorViewHandle.ErrorType.SmartAccountStatusError);
                    }
                } else if (glqOLrzqt instanceof gLQ.AssistContent) {
                    c22495hgT.EZpvd(SwapState.SA_SERVICE_UPGRADED_ACCOUNT);
                    InterfaceC22433hfK interfaceC22433hfK3 = limitWalletCheckHandle.limitInputStateInterface;
                    if (interfaceC22433hfK3 != null) {
                        interfaceC22433hfK3.EZpvd(LimitErrorViewHandle.ErrorType.SmartAccountStatusError);
                    }
                } else if (glqOLrzqt instanceof gLQ.Activity) {
                    c22495hgT.EZpvd(SwapState.SA_NEED_TO_UPDATE_APP);
                    InterfaceC22433hfK interfaceC22433hfK4 = limitWalletCheckHandle.limitInputStateInterface;
                    if (interfaceC22433hfK4 != null) {
                        interfaceC22433hfK4.EZpvd(LimitErrorViewHandle.ErrorType.SmartAccountStatusError);
                    }
                } else {
                    limitWalletCheckHandle.refreshStateWallet(tradeLimitStatePool);
                }
            }
        } else if (z) {
            if (limitWsHandle != null) {
                limitWsHandle.unSubWs();
            }
            limitWalletCheckHandle.refreshStateTrackingWallet(tradeLimitStatePool);
        } else if (interfaceC9738bbJ.zsXlph()) {
            if (limitWsHandle != null) {
                limitWsHandle.unSubWs();
            }
            limitWalletCheckHandle.refreshStateNoWallet(tradeLimitStatePool);
        } else if (C22416heu.zLjUOn()) {
            limitWalletCheckHandle.refreshStateSAWallet(tradeLimitStatePool);
        } else {
            limitWalletCheckHandle.refreshStateWalletLegal(tradeLimitStatePool);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkWallet$lambda$3(LimitWalletCheckHandle limitWalletCheckHandle, TradeLimitStatePool tradeLimitStatePool, LimitWsHandle limitWsHandle, Throwable th) {
        if (th instanceof NoWallet) {
            limitWalletCheckHandle.refreshStateNoWallet(tradeLimitStatePool);
        } else {
            limitWalletCheckHandle.refreshStateWalletLegal(tradeLimitStatePool);
        }
        if (limitWsHandle != null) {
            limitWsHandle.unSubWs();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshWalletState$default(LimitWalletCheckHandle limitWalletCheckHandle, TradeLimitStatePool tradeLimitStatePool, SwapState swapState, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        limitWalletCheckHandle.refreshWalletState(tradeLimitStatePool, swapState, z);
    }

    private final void refreshWalletState(TradeLimitStatePool tradeLimitStatePool, SwapState swapState, boolean z) {
        this.currentWalletState = swapState;
        tradeLimitStatePool.refreshStatePool(new TradeStep(CheckStep.WALLET, true, swapState, z, true));
    }

    private final void refreshStateWalletLegal(TradeLimitStatePool tradeLimitStatePool) {
        refreshWalletState$default(this, tradeLimitStatePool, SwapState.WALLET_LEGAL, false, 4, null);
    }

    private final void refreshStateNoWallet(TradeLimitStatePool tradeLimitStatePool) {
        refreshWalletState$default(this, tradeLimitStatePool, SwapState.NO_WALLET, false, 4, null);
    }

    private final void refreshStateTrackingWallet(TradeLimitStatePool tradeLimitStatePool) {
        refreshWalletState$default(this, tradeLimitStatePool, SwapState.TRACKING_WALLET_SUCCESS, false, 4, null);
    }

    private final void refreshStateWallet(TradeLimitStatePool tradeLimitStatePool) {
        refreshWalletState(tradeLimitStatePool, SwapState.WALLET_SUCCESS, false);
    }

    private final void refreshStateMpcWalletLegal(TradeLimitStatePool tradeLimitStatePool) {
        refreshWalletState$default(this, tradeLimitStatePool, SwapState.MPC_WALLET_LEGAL, false, 4, null);
    }

    private final void refreshStateSAWallet(TradeLimitStatePool tradeLimitStatePool) {
        refreshWalletState$default(this, tradeLimitStatePool, SwapState.SA_NOT_SMART_ACCOUNT, false, 4, null);
    }

    public final void checkWalletState(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        getWalletState(str, str2, new Function1() { // from class: o.hLy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitWalletCheckHandle.checkWalletState$lambda$5(this.copydefault, (SwapState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkWalletState$lambda$5(LimitWalletCheckHandle limitWalletCheckHandle, SwapState swapState) {
        InterfaceC22433hfK interfaceC22433hfK;
        Intrinsics.checkNotNullParameter(swapState, "");
        int i = StateListAnimator.KWHzl[swapState.ordinal()];
        if (i == 1) {
            InterfaceC22433hfK interfaceC22433hfK2 = limitWalletCheckHandle.limitInputStateInterface;
            if (interfaceC22433hfK2 != null) {
                interfaceC22433hfK2.EZpvd(LimitErrorViewHandle.ErrorType.MpcWallet);
            }
        } else if (i == 2 && (interfaceC22433hfK = limitWalletCheckHandle.limitInputStateInterface) != null) {
            interfaceC22433hfK.EZpvd(LimitErrorViewHandle.ErrorType.WalletLegal);
        }
        return Unit.INSTANCE;
    }

    public final void getWalletState(@NotNull String str, @NotNull String str2, @NotNull Function1<? super SwapState, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC23194htd interfaceC23194htdFARcdN = c22380heK.copydefault(str2).fARcdN();
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = interfaceC23194htdFARcdN.AEQbTJ();
        if (interfaceC9738bbJAEQbTJ == null) {
            function1.invoke(SwapState.NO_WALLET);
            return;
        }
        boolean zKWHzl = interfaceC9738bbJAEQbTJ.KWHzl(Long.valueOf(C33129mqd.valueOf(str)));
        boolean zQfsBiF = interfaceC9738bbJAEQbTJ.QfsBiF();
        if (c22380heK.copydefault(str2).fARcdN().OLrzqt(interfaceC9738bbJAEQbTJ, str, true) && !interfaceC9738bbJAEQbTJ.getFieldNames()) {
            if (interfaceC9738bbJAEQbTJ.ORxRYg()) {
                if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends MpcWalletService.MpcWalletAbleStatus>) ((Iterable<? extends Object>) yDY.gEmmrt(MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete, MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen)), this.mpcWalletState.getValue())) {
                    function1.invoke(SwapState.MPC_WALLET_LEGAL);
                    return;
                }
            }
            function1.invoke(SwapState.WALLET_SUCCESS);
            return;
        }
        if (zQfsBiF) {
            function1.invoke(zKWHzl ? SwapState.TRACKING_WALLET_SUCCESS : SwapState.WALLET_LEGAL);
        } else if (interfaceC23194htdFARcdN.KWHzl(interfaceC9738bbJAEQbTJ)) {
            function1.invoke(SwapState.NO_WALLET);
        } else {
            function1.invoke(SwapState.WALLET_LEGAL);
        }
    }

    public final boolean isCurrentWalletStateError() {
        return yDY.gEmmrt(SwapState.WALLET_LEGAL, SwapState.MPC_WALLET_LEGAL).contains(this.currentWalletState);
    }

    public final boolean isCurrentTrackingWalletState() {
        return this.currentWalletState == SwapState.TRACKING_WALLET_SUCCESS;
    }

    public final void disposeCheck() {
        C33050mpD.OLrzqt(this.walletCheck);
    }
}
