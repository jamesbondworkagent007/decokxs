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
import o.C29507kuu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29663kxr;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalSingleOverviewViewModel$onChartIntervalSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ TimeIntervalSelector $timeIntervalSelector;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ SignalSingleOverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalSingleOverviewViewModel$onChartIntervalSelected$1(SignalSingleOverviewViewModel signalSingleOverviewViewModel, TimeIntervalSelector timeIntervalSelector, String str, String str2, Continuation<? super SignalSingleOverviewViewModel$onChartIntervalSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = signalSingleOverviewViewModel;
        this.$timeIntervalSelector = timeIntervalSelector;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalSingleOverviewViewModel$onChartIntervalSelected$1(this.this$0, this.$timeIntervalSelector, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalSingleOverviewViewModel$onChartIntervalSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8675invokeyxL6bBk$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.OLrzqt().getValue() instanceof InterfaceC29663kxr.StateListAnimator) {
                InterfaceC29663kxr value = this.this$0.OLrzqt().getValue();
                Intrinsics.copydefault(value, "");
                SignalOverviewUiModel signalOverviewUiModelEZpvd = ((InterfaceC29663kxr.StateListAnimator) value).EZpvd();
                this.this$0.OLrzqt.setValue(new InterfaceC29663kxr.StateListAnimator(signalOverviewUiModelEZpvd.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelEZpvd.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelEZpvd.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelEZpvd.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelEZpvd.values : null, (212991 & 16) != 0 ? signalOverviewUiModelEZpvd.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelEZpvd.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelEZpvd.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelEZpvd.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelEZpvd.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelEZpvd.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModelEZpvd.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModelEZpvd.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModelEZpvd.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelEZpvd.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelEZpvd.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelEZpvd.djBIcL : SignalOverviewKLineUiModel.copy$default(signalOverviewUiModelEZpvd.OLrzqt(), this.$timeIntervalSelector, null, true, false, false, false, 58, null), (212991 & 65536) != 0 ? signalOverviewUiModelEZpvd.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelEZpvd.AuCTel : null)));
            }
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
            SignalOverviewKLineUiModel signalOverviewKLineUiModel = (SignalOverviewKLineUiModel) objM8675invokeyxL6bBk$default;
            if (signalSingleOverviewViewModel.OLrzqt().getValue() instanceof InterfaceC29663kxr.StateListAnimator) {
                InterfaceC29663kxr value2 = signalSingleOverviewViewModel.OLrzqt().getValue();
                Intrinsics.copydefault(value2, "");
                SignalOverviewUiModel signalOverviewUiModelEZpvd2 = ((InterfaceC29663kxr.StateListAnimator) value2).EZpvd();
                signalSingleOverviewViewModel.OLrzqt.setValue(new InterfaceC29663kxr.StateListAnimator(signalOverviewUiModelEZpvd2.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelEZpvd2.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelEZpvd2.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelEZpvd2.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelEZpvd2.values : null, (212991 & 16) != 0 ? signalOverviewUiModelEZpvd2.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelEZpvd2.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelEZpvd2.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelEZpvd2.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelEZpvd2.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelEZpvd2.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModelEZpvd2.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModelEZpvd2.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModelEZpvd2.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelEZpvd2.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelEZpvd2.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelEZpvd2.djBIcL : SignalOverviewKLineUiModel.copy$default(signalOverviewKLineUiModel, null, null, false, false, false, false, 51, null), (212991 & 65536) != 0 ? signalOverviewUiModelEZpvd2.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelEZpvd2.AuCTel : null)));
            }
        }
        SignalSingleOverviewViewModel signalSingleOverviewViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM8675invokeyxL6bBk$default) != null && (signalSingleOverviewViewModel2.OLrzqt().getValue() instanceof InterfaceC29663kxr.StateListAnimator)) {
            InterfaceC29663kxr value3 = signalSingleOverviewViewModel2.OLrzqt().getValue();
            Intrinsics.copydefault(value3, "");
            SignalOverviewUiModel signalOverviewUiModelEZpvd3 = ((InterfaceC29663kxr.StateListAnimator) value3).EZpvd();
            signalSingleOverviewViewModel2.OLrzqt.setValue(new InterfaceC29663kxr.StateListAnimator(signalOverviewUiModelEZpvd3.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModelEZpvd3.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModelEZpvd3.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModelEZpvd3.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModelEZpvd3.values : null, (212991 & 16) != 0 ? signalOverviewUiModelEZpvd3.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModelEZpvd3.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModelEZpvd3.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModelEZpvd3.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModelEZpvd3.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModelEZpvd3.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModelEZpvd3.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModelEZpvd3.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModelEZpvd3.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModelEZpvd3.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModelEZpvd3.AYXKKw : null, (212991 & 32768) != 0 ? signalOverviewUiModelEZpvd3.djBIcL : SignalOverviewKLineUiModel.copy$default(signalOverviewUiModelEZpvd3.OLrzqt(), null, null, false, false, false, false, 59, null), (212991 & 65536) != 0 ? signalOverviewUiModelEZpvd3.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModelEZpvd3.AuCTel : null)));
        }
        return Unit.INSTANCE;
    }
}
