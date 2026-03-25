package com.okinc.business.dex.trade.component.walletorderlist.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo;
import com.okinc.business.dex.trade.component.walletorderlist.ui.viewmodel.WalletPageOderListViewModel;
import com.okinc.business.dex.trade.order.domain.model.OpenOrderData;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.C19702gMd;
import o.C20004gXi;
import o.C20071gZv;
import o.C20075gZz;
import o.C25389ivm;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19701gMc;
import o.gRD;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPageOderListViewModel extends AbstractC33073mpa {
    public final C20075gZz AEQbTJ;
    public final C19700gMb AYXKKw;
    public InterfaceC19701gMc AhwBna;
    public final MutableStateFlow<gRD> EZpvd;
    public final C20004gXi KWHzl;
    public String OLrzqt;
    public String copydefault;
    public InterfaceC19701gMc djBIcL;
    public final C19702gMd gEmmrt;
    public final StateFlow<gRD> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gRD> EZpvd() {
        return this.valueOf;
    }

    @yCM
    public WalletPageOderListViewModel(@NotNull C19700gMb c19700gMb, @NotNull C20075gZz c20075gZz, @NotNull C20004gXi c20004gXi, @NotNull C19702gMd c19702gMd) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c20075gZz, "");
        Intrinsics.checkNotNullParameter(c20004gXi, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        this.AYXKKw = c19700gMb;
        this.AEQbTJ = c20075gZz;
        this.KWHzl = c20004gXi;
        this.gEmmrt = c19702gMd;
        this.OLrzqt = "";
        MutableStateFlow<gRD> MutableStateFlow = StateFlowKt.MutableStateFlow(gRD.StateListAnimator.EZpvd);
        this.EZpvd = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final gRD.Application copydefault() {
        gRD value = this.EZpvd.getValue();
        if (value instanceof gRD.Application) {
            return (gRD.Application) value;
        }
        return null;
    }

    public static /* synthetic */ void loadOrderList$default(WalletPageOderListViewModel walletPageOderListViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        walletPageOderListViewModel.AEQbTJ(z);
    }

    public final void KWHzl() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletPageOderListViewModel$loadMoreOrderList$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super Result<OrderListPagerResult<OpenOrderData>>> continuation) throws Throwable {
        WalletPageOderListViewModel$loadOrder$1 walletPageOderListViewModel$loadOrder$1;
        Object objEZpvd;
        WalletPageOderListViewModel walletPageOderListViewModel;
        if (continuation instanceof WalletPageOderListViewModel$loadOrder$1) {
            walletPageOderListViewModel$loadOrder$1 = (WalletPageOderListViewModel$loadOrder$1) continuation;
            int i = walletPageOderListViewModel$loadOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletPageOderListViewModel$loadOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                walletPageOderListViewModel$loadOrder$1 = new WalletPageOderListViewModel$loadOrder$1(this, continuation);
            }
        }
        Object obj = walletPageOderListViewModel$loadOrder$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletPageOderListViewModel$loadOrder$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C20075gZz c20075gZz = this.AEQbTJ;
            C20071gZv c20071gZv = new C20071gZv(this.OLrzqt, null, null, null, this.copydefault, null, 0, WalletImportError.ERROR_CODE_AA_CREATE_KEY, null);
            walletPageOderListViewModel$loadOrder$1.L$0 = this;
            walletPageOderListViewModel$loadOrder$1.label = 1;
            objEZpvd = c20075gZz.EZpvd(c20071gZv, walletPageOderListViewModel$loadOrder$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            walletPageOderListViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            walletPageOderListViewModel = (WalletPageOderListViewModel) walletPageOderListViewModel$loadOrder$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            walletPageOderListViewModel.OLrzqt = ((OrderListPagerResult) objEZpvd).getCursor();
        }
        return objEZpvd;
    }

    public final void AEQbTJ(String str) {
        this.copydefault = str;
        loadOrderList$default(this, false, 1, null);
    }

    public final void OLrzqt() {
        this.AhwBna = this.gEmmrt.EZpvd(new Function1() { // from class: o.gRX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletPageOderListViewModel.OLrzqt(this.AEQbTJ, (TeeWsOriginData) obj);
            }
        });
        this.djBIcL = this.gEmmrt.copydefault(new Function1() { // from class: o.gRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletPageOderListViewModel.EZpvd(this.KWHzl, (WsMarketOrderInfo) obj);
            }
        });
    }

    public static final Unit OLrzqt(WalletPageOderListViewModel walletPageOderListViewModel, TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        walletPageOderListViewModel.AEQbTJ(false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(WalletPageOderListViewModel walletPageOderListViewModel, WsMarketOrderInfo wsMarketOrderInfo) {
        Intrinsics.checkNotNullParameter(wsMarketOrderInfo, "");
        walletPageOderListViewModel.AEQbTJ(false);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        InterfaceC19701gMc interfaceC19701gMc = this.AhwBna;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.AhwBna = null;
        InterfaceC19701gMc interfaceC19701gMc2 = this.djBIcL;
        if (interfaceC19701gMc2 != null) {
            interfaceC19701gMc2.KWHzl();
        }
        this.djBIcL = null;
    }

    public final String EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AYXKKw.KWHzl(str);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        valueOf();
    }

    public final void AEQbTJ(boolean z) {
        gRD value;
        gRD grd;
        MutableStateFlow<gRD> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            if (z) {
                grd = gRD.Activity.KWHzl;
            } else {
                grd = gRD.StateListAnimator.EZpvd;
            }
        } while (!mutableStateFlow.compareAndSet(value, grd));
        this.OLrzqt = "";
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletPageOderListViewModel$loadOrderList$2(this, null), 3, null);
    }
}
