package com.okinc.business.market.features.history.ui;

import androidx.lifecycle.MutableLiveData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25624jAh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryChangeViewModel$getAmountDisplay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HistoryChangeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryChangeViewModel$getAmountDisplay$1(HistoryChangeViewModel historyChangeViewModel, Continuation<? super HistoryChangeViewModel$getAmountDisplay$1> continuation) {
        super(2, continuation);
        this.this$0 = historyChangeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryChangeViewModel$getAmountDisplay$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryChangeViewModel$getAmountDisplay$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableLiveData mutableLiveData2 = this.this$0.copydefault;
            C25624jAh c25624jAh = this.this$0.AuCTel;
            this.L$0 = mutableLiveData2;
            this.label = 1;
            Object objEZpvd = c25624jAh.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            mutableLiveData = mutableLiveData2;
            objM7386unboximpl = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        Boolean bool = (Boolean) objM7386unboximpl;
        mutableLiveData.postValue(C56443yFo.KWHzl(bool != null ? bool.booleanValue() : false));
        return Unit.INSTANCE;
    }
}
