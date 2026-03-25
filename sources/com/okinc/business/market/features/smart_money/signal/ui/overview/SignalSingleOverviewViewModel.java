package com.okinc.business.market.features.smart_money.signal.ui.overview;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.model.CoinRankingWsData;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C28586kda;
import o.C29468kuH;
import o.C29506kut;
import o.C29507kuu;
import o.C29509kuw;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC29663kxr;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalSingleOverviewViewModel extends ViewModel {
    public final C29507kuu AEQbTJ;
    public final C29506kut EZpvd;
    public final C28586kda KWHzl;
    public final MutableStateFlow<InterfaceC29663kxr> OLrzqt;
    public final C29509kuw copydefault;
    public final StateFlow<InterfaceC29663kxr> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC29663kxr> OLrzqt() {
        return this.gEmmrt;
    }

    @yCM
    public SignalSingleOverviewViewModel(@NotNull C29509kuw c29509kuw, @NotNull C29507kuu c29507kuu, @NotNull C28586kda c28586kda, @NotNull C29506kut c29506kut) {
        Intrinsics.checkNotNullParameter(c29509kuw, "");
        Intrinsics.checkNotNullParameter(c29507kuu, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(c29506kut, "");
        this.copydefault = c29509kuw;
        this.AEQbTJ = c29507kuu;
        this.KWHzl = c28586kda;
        this.EZpvd = c29506kut;
        MutableStateFlow<InterfaceC29663kxr> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC29663kxr.ActionBar.EZpvd);
        this.OLrzqt = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalSingleOverviewViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SignalSingleOverviewViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(SignalSingleOverviewViewModel.this.copydefault.AEQbTJ());
                final SignalSingleOverviewViewModel signalSingleOverviewViewModel = SignalSingleOverviewViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalSingleOverviewViewModel.1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(CoinRankingWsData coinRankingWsData, Continuation<? super Unit> continuation) {
                        signalSingleOverviewViewModel.AEQbTJ(coinRankingWsData);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalSingleOverviewViewModel$loadSignalOverview$1(this, str, str2, null), 3, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull TimeIntervalSelector timeIntervalSelector) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalSingleOverviewViewModel$onChartIntervalSelected$1(this, timeIntervalSelector, str, str2, null), 3, null);
    }

    public final void KWHzl(@NotNull BuySellMarker buySellMarker) {
        Object next;
        Intrinsics.checkNotNullParameter(buySellMarker, "");
        if (this.gEmmrt.getValue() instanceof InterfaceC29663kxr.StateListAnimator) {
            InterfaceC29663kxr value = this.gEmmrt.getValue();
            Intrinsics.copydefault(value, "");
            SignalOverviewUiModel signalOverviewUiModelEZpvd = ((InterfaceC29663kxr.StateListAnimator) value).EZpvd();
            Iterator<T> it = signalOverviewUiModelEZpvd.djBIcL().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((SignalUiModel) next).djBIcL(), (Object) buySellMarker.AEQbTJ())) {
                        break;
                    }
                }
            }
            SignalUiModel signalUiModel = (SignalUiModel) next;
            if (signalUiModel == null) {
                return;
            }
            this.OLrzqt.setValue(new InterfaceC29663kxr.StateListAnimator(signalOverviewUiModelEZpvd.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelEZpvd.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelEZpvd.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelEZpvd.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelEZpvd.values : null, (212991 & 16) != 0 ? signalOverviewUiModelEZpvd.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelEZpvd.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelEZpvd.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelEZpvd.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelEZpvd.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelEZpvd.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModelEZpvd.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModelEZpvd.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModelEZpvd.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelEZpvd.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelEZpvd.AYXKKw : signalUiModel, (212991 & 32768) != 0 ? signalOverviewUiModelEZpvd.djBIcL : null, (212991 & 65536) != 0 ? signalOverviewUiModelEZpvd.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelEZpvd.AuCTel : null)));
        }
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull TimeIntervalSelector timeIntervalSelector) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
        if (this.gEmmrt.getValue() instanceof InterfaceC29663kxr.StateListAnimator) {
            InterfaceC29663kxr value = this.gEmmrt.getValue();
            Intrinsics.copydefault(value, "");
            SignalOverviewUiModel signalOverviewUiModelEZpvd = ((InterfaceC29663kxr.StateListAnimator) value).EZpvd();
            if (signalOverviewUiModelEZpvd.OLrzqt().OLrzqt()) {
                this.OLrzqt.setValue(new InterfaceC29663kxr.StateListAnimator(signalOverviewUiModelEZpvd.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelEZpvd.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelEZpvd.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelEZpvd.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelEZpvd.values : null, (212991 & 16) != 0 ? signalOverviewUiModelEZpvd.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelEZpvd.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelEZpvd.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelEZpvd.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelEZpvd.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelEZpvd.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModelEZpvd.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModelEZpvd.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModelEZpvd.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelEZpvd.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelEZpvd.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelEZpvd.djBIcL : SignalOverviewKLineUiModel.copy$default(signalOverviewUiModelEZpvd.OLrzqt(), null, null, false, false, false, false, 15, null), (212991 & 65536) != 0 ? signalOverviewUiModelEZpvd.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelEZpvd.AuCTel : null)));
                C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalSingleOverviewViewModel$onFetchKlineLoadMore$1(this, str, str2, timeIntervalSelector, signalOverviewUiModelEZpvd, null), 3, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        SignalSingleOverviewViewModel$isUserWalletAddressValid$1 signalSingleOverviewViewModel$isUserWalletAddressValid$1;
        Object objOLrzqt;
        if (continuation instanceof SignalSingleOverviewViewModel$isUserWalletAddressValid$1) {
            signalSingleOverviewViewModel$isUserWalletAddressValid$1 = (SignalSingleOverviewViewModel$isUserWalletAddressValid$1) continuation;
            int i = signalSingleOverviewViewModel$isUserWalletAddressValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalSingleOverviewViewModel$isUserWalletAddressValid$1.label = i - Integer.MIN_VALUE;
            } else {
                signalSingleOverviewViewModel$isUserWalletAddressValid$1 = new SignalSingleOverviewViewModel$isUserWalletAddressValid$1(this, continuation);
            }
        }
        Object obj = signalSingleOverviewViewModel$isUserWalletAddressValid$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalSingleOverviewViewModel$isUserWalletAddressValid$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.KWHzl;
            signalSingleOverviewViewModel$isUserWalletAddressValid$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(signalSingleOverviewViewModel$isUserWalletAddressValid$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        return C56443yFo.KWHzl(C33129mqd.OLrzqt((CharSequence) (dexUserIdentity != null ? dexUserIdentity.EZpvd() : null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull SignalUiModel signalUiModel, @NotNull Continuation<? super Result<? extends List<C29468kuH>>> continuation) {
        SignalSingleOverviewViewModel$fetchOverviewAddresses$1 signalSingleOverviewViewModel$fetchOverviewAddresses$1;
        String strEZpvd;
        String strKWHzl;
        String str;
        String str2;
        C29506kut c29506kut;
        Object objM7386unboximpl;
        String str3;
        if (continuation instanceof SignalSingleOverviewViewModel$fetchOverviewAddresses$1) {
            signalSingleOverviewViewModel$fetchOverviewAddresses$1 = (SignalSingleOverviewViewModel$fetchOverviewAddresses$1) continuation;
            int i = signalSingleOverviewViewModel$fetchOverviewAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalSingleOverviewViewModel$fetchOverviewAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                signalSingleOverviewViewModel$fetchOverviewAddresses$1 = new SignalSingleOverviewViewModel$fetchOverviewAddresses$1(this, continuation);
            }
        }
        SignalSingleOverviewViewModel$fetchOverviewAddresses$1 signalSingleOverviewViewModel$fetchOverviewAddresses$12 = signalSingleOverviewViewModel$fetchOverviewAddresses$1;
        Object obj = signalSingleOverviewViewModel$fetchOverviewAddresses$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalSingleOverviewViewModel$fetchOverviewAddresses$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C29506kut c29506kut2 = this.EZpvd;
            String strFIwbmz = signalUiModel.fIwbmz();
            strEZpvd = signalUiModel.EZpvd();
            String strIsConnected = signalUiModel.isConnected();
            strKWHzl = signalUiModel.KWHzl();
            String strOLrzqt = signalUiModel.OLrzqt();
            C28586kda c28586kda = this.KWHzl;
            signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$0 = c29506kut2;
            signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$1 = strFIwbmz;
            signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$2 = strEZpvd;
            signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$3 = strIsConnected;
            signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$4 = strKWHzl;
            signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$5 = strOLrzqt;
            signalSingleOverviewViewModel$fetchOverviewAddresses$12.label = 1;
            Object objOLrzqt = c28586kda.OLrzqt(signalSingleOverviewViewModel$fetchOverviewAddresses$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            str = strOLrzqt;
            str2 = strFIwbmz;
            c29506kut = c29506kut2;
            objM7386unboximpl = objOLrzqt;
            str3 = strIsConnected;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            String str4 = (String) signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$5;
            String str5 = (String) signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$4;
            str3 = (String) signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$3;
            strEZpvd = (String) signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$2;
            String str6 = (String) signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$1;
            C29506kut c29506kut3 = (C29506kut) signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            str = str4;
            str2 = str6;
            strKWHzl = str5;
            c29506kut = c29506kut3;
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objM7386unboximpl;
        String strEZpvd2 = dexUserIdentity != null ? dexUserIdentity.EZpvd() : null;
        if (strEZpvd2 == null) {
            strEZpvd2 = "";
        }
        signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$0 = null;
        signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$1 = null;
        signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$2 = null;
        signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$3 = null;
        signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$4 = null;
        signalSingleOverviewViewModel$fetchOverviewAddresses$12.L$5 = null;
        signalSingleOverviewViewModel$fetchOverviewAddresses$12.label = 2;
        Object objOLrzqt2 = c29506kut.OLrzqt(strEZpvd, str3, strKWHzl, str, str2, strEZpvd2, signalSingleOverviewViewModel$fetchOverviewAddresses$12);
        return objOLrzqt2 == objCopydefault ? objCopydefault : objOLrzqt2;
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt(str, str2);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.OLrzqt.getValue() instanceof InterfaceC29663kxr.StateListAnimator) {
            this.copydefault.AEQbTJ(str, str2);
        }
    }

    public final void copydefault() {
        this.copydefault.EZpvd();
    }

    public final void AEQbTJ(CoinRankingWsData coinRankingWsData) {
        InterfaceC29663kxr value = this.OLrzqt.getValue();
        if (value instanceof InterfaceC29663kxr.StateListAnimator) {
            SignalOverviewUiModel signalOverviewUiModelEZpvd = ((InterfaceC29663kxr.StateListAnimator) value).EZpvd();
            this.OLrzqt.setValue(new InterfaceC29663kxr.StateListAnimator(signalOverviewUiModelEZpvd.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelEZpvd.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelEZpvd.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelEZpvd.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelEZpvd.values : null, (212991 & 16) != 0 ? signalOverviewUiModelEZpvd.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelEZpvd.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelEZpvd.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelEZpvd.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelEZpvd.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelEZpvd.KWHzl : coinRankingWsData.getPrice(), (212991 & 1024) != 0 ? signalOverviewUiModelEZpvd.EZpvd : coinRankingWsData.getMarketCap(), (212991 & 2048) != 0 ? signalOverviewUiModelEZpvd.copydefault : coinRankingWsData.getHolders(), (212991 & 4096) != 0 ? signalOverviewUiModelEZpvd.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelEZpvd.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelEZpvd.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelEZpvd.djBIcL : null, (212991 & 65536) != 0 ? signalOverviewUiModelEZpvd.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelEZpvd.AuCTel : null)));
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.copydefault.EZpvd();
    }
}
