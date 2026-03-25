package com.okinc.business.market.features.scanner.surge.ui;

import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29289kqo;
import o.C29512kuz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class SurgeTabViewModel$fetchSignalSection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isPullToRefresh;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SurgeTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeTabViewModel$fetchSignalSection$1(boolean z, SurgeTabViewModel surgeTabViewModel, Continuation<? super SurgeTabViewModel$fetchSignalSection$1> continuation) {
        super(2, continuation);
        this.$isPullToRefresh = z;
        this.this$0 = surgeTabViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SurgeTabViewModel$fetchSignalSection$1(this.$isPullToRefresh, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurgeTabViewModel$fetchSignalSection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object value;
        Object value2;
        SurgeTabViewModel surgeTabViewModel;
        MutableStateFlow mutableStateFlow;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isPullToRefresh) {
                MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
                do {
                    value = mutableStateFlow2.getValue();
                    ((Boolean) value).booleanValue();
                } while (!mutableStateFlow2.compareAndSet(value, C56443yFo.KWHzl(true)));
            }
            C29512kuz c29512kuz = this.this$0.AhwBna;
            this.label = 1;
            objKWHzl = c29512kuz.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                surgeTabViewModel = (SurgeTabViewModel) this.L$1;
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                mutableStateFlow = surgeTabViewModel.KWHzl;
                do {
                    value3 = mutableStateFlow.getValue();
                    ((Boolean) value3).booleanValue();
                } while (!mutableStateFlow.compareAndSet(value3, C56443yFo.KWHzl(false)));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        SurgeTabViewModel surgeTabViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            SmartMoneyConfig smartMoneyConfig = (SmartMoneyConfig) objKWHzl;
            MutableStateFlow mutableStateFlow3 = surgeTabViewModel2.copydefault;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, smartMoneyConfig));
            C29289kqo c29289kqo = surgeTabViewModel2.gEmmrt;
            String strKWHzl = smartMoneyConfig.KWHzl();
            this.L$0 = objKWHzl;
            this.L$1 = surgeTabViewModel2;
            this.label = 2;
            if (C29289kqo.m8671invoke0E7RQCE$default(c29289kqo, strKWHzl, false, this, 2, null) == objCopydefault) {
                return objCopydefault;
            }
            surgeTabViewModel = surgeTabViewModel2;
            mutableStateFlow = surgeTabViewModel.KWHzl;
            do {
                value3 = mutableStateFlow.getValue();
                ((Boolean) value3).booleanValue();
            } while (!mutableStateFlow.compareAndSet(value3, C56443yFo.KWHzl(false)));
        }
        return Unit.INSTANCE;
    }
}
