package com.okinc.business.market.features.smart_money.signal.ui.overview;

import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29507kuu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29663kxr;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalSingleOverviewViewModel$onFetchKlineLoadMore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ SignalOverviewUiModel $currentOverview;
    final /* synthetic */ TimeIntervalSelector $timeIntervalSelector;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ SignalSingleOverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalSingleOverviewViewModel$onFetchKlineLoadMore$1(SignalSingleOverviewViewModel signalSingleOverviewViewModel, String str, String str2, TimeIntervalSelector timeIntervalSelector, SignalOverviewUiModel signalOverviewUiModel, Continuation<? super SignalSingleOverviewViewModel$onFetchKlineLoadMore$1> continuation) {
        super(2, continuation);
        this.this$0 = signalSingleOverviewViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$timeIntervalSelector = timeIntervalSelector;
        this.$currentOverview = signalOverviewUiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalSingleOverviewViewModel$onFetchKlineLoadMore$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$timeIntervalSelector, this.$currentOverview, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalSingleOverviewViewModel$onFetchKlineLoadMore$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8675invokeyxL6bBk$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29507kuu c29507kuu = this.this$0.AEQbTJ;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            TimeIntervalSelector timeIntervalSelector = this.$timeIntervalSelector;
            this.label = 1;
            objM8675invokeyxL6bBk$default = C29507kuu.m8675invokeyxL6bBk$default(c29507kuu, str, str2, timeIntervalSelector, 0L, this, 8, null);
            if (objM8675invokeyxL6bBk$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8675invokeyxL6bBk$default = ((Result) obj).m7386unboximpl();
        }
        SignalSingleOverviewViewModel signalSingleOverviewViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM8675invokeyxL6bBk$default)) {
            MutableStateFlow mutableStateFlow = signalSingleOverviewViewModel.OLrzqt;
            InterfaceC29663kxr value = signalSingleOverviewViewModel.OLrzqt().getValue();
            Intrinsics.copydefault(value, "");
            SignalOverviewUiModel signalOverviewUiModelEZpvd = ((InterfaceC29663kxr.StateListAnimator) value).EZpvd();
            mutableStateFlow.setValue(new InterfaceC29663kxr.StateListAnimator(signalOverviewUiModelEZpvd.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelEZpvd.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelEZpvd.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelEZpvd.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelEZpvd.values : null, (212991 & 16) != 0 ? signalOverviewUiModelEZpvd.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelEZpvd.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelEZpvd.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelEZpvd.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelEZpvd.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelEZpvd.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModelEZpvd.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModelEZpvd.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModelEZpvd.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelEZpvd.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelEZpvd.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelEZpvd.djBIcL : SignalOverviewKLineUiModel.copy$default((SignalOverviewKLineUiModel) objM8675invokeyxL6bBk$default, null, null, false, false, false, true, 15, null), (212991 & 65536) != 0 ? signalOverviewUiModelEZpvd.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelEZpvd.AuCTel : null)));
        }
        SignalSingleOverviewViewModel signalSingleOverviewViewModel2 = this.this$0;
        SignalOverviewUiModel signalOverviewUiModel = this.$currentOverview;
        if (Result.m7380exceptionOrNullimpl(objM8675invokeyxL6bBk$default) != null) {
            signalSingleOverviewViewModel2.OLrzqt.setValue(new InterfaceC29663kxr.StateListAnimator(signalOverviewUiModel.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModel.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModel.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModel.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModel.values : null, (212991 & 16) != 0 ? signalOverviewUiModel.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModel.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModel.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModel.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModel.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModel.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModel.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModel.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModel.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModel.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModel.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModel.djBIcL : SignalOverviewKLineUiModel.copy$default(signalOverviewUiModel.OLrzqt(), null, null, false, false, false, true, 15, null), (212991 & 65536) != 0 ? signalOverviewUiModel.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModel.AuCTel : null)));
        }
        return Unit.INSTANCE;
    }
}
