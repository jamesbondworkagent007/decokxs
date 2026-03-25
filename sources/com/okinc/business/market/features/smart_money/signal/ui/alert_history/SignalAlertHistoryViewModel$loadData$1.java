package com.okinc.business.market.features.smart_money.signal.ui.alert_history;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC29518kvE;
import o.C29504kur;
import o.C29584kwR;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalAlertHistoryViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ List<Integer> $signalLabels;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ SignalAlertHistoryViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalAlertHistoryViewModel$loadData$1(SignalAlertHistoryViewModel signalAlertHistoryViewModel, String str, String str2, List<Integer> list, Continuation<? super SignalAlertHistoryViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = signalAlertHistoryViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$signalLabels = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalAlertHistoryViewModel$loadData$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$signalLabels, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalAlertHistoryViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.setValue(AbstractC29518kvE.Application.OLrzqt);
            C29504kur c29504kur = this.this$0.OLrzqt;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            List<Integer> list = this.$signalLabels;
            this.label = 1;
            objCopydefault = c29504kur.copydefault(str, str2, list, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        SignalAlertHistoryViewModel signalAlertHistoryViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            signalAlertHistoryViewModel.copydefault.setValue(new AbstractC29518kvE.Activity((C29584kwR) objCopydefault));
        }
        SignalAlertHistoryViewModel signalAlertHistoryViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            signalAlertHistoryViewModel2.copydefault.setValue(new AbstractC29518kvE.StateListAnimator(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
