package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbDetailsSheetViewModel$connectWsTasks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $this_connectWsTasks;
    Object L$0;
    int label;
    final /* synthetic */ SmartArbDetailsSheetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbDetailsSheetViewModel$connectWsTasks$1(SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel, Lifecycle lifecycle, Continuation<? super SmartArbDetailsSheetViewModel$connectWsTasks$1> continuation) {
        super(2, continuation);
        this.this$0 = smartArbDetailsSheetViewModel;
        this.$this_connectWsTasks = lifecycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartArbDetailsSheetViewModel$connectWsTasks$1(this.this$0, this.$this_connectWsTasks, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbDetailsSheetViewModel$connectWsTasks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel2 = this.this$0;
            Lifecycle lifecycle = this.$this_connectWsTasks;
            this.L$0 = smartArbDetailsSheetViewModel2;
            this.label = 1;
            Object objEZpvd = smartArbDetailsSheetViewModel2.EZpvd(lifecycle, (Continuation<? super Job>) this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            smartArbDetailsSheetViewModel = smartArbDetailsSheetViewModel2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            smartArbDetailsSheetViewModel = (SmartArbDetailsSheetViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        smartArbDetailsSheetViewModel.values = (Job) obj;
        return Unit.INSTANCE;
    }
}
