package com.okinc.planet.biz_plugin.future.ui;

import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.tBY;
import o.tCO;

/* JADX INFO: loaded from: classes19.dex */
public final class FutureHistoryFragment$initView$1$4$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FutureHistoryBean $selected;
    int label;
    final /* synthetic */ tCO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureHistoryFragment$initView$1$4$1$2(tCO tco, FutureHistoryBean futureHistoryBean, Continuation<? super FutureHistoryFragment$initView$1$4$1$2> continuation) {
        super(2, continuation);
        this.this$0 = tco;
        this.$selected = futureHistoryBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureHistoryFragment$initView$1$4$1$2(this.this$0, this.$selected, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureHistoryFragment$initView$1$4$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tBY tbyOLrzqt = this.this$0.OLrzqt();
            FutureHistoryBean futureHistoryBean = this.$selected;
            this.label = 1;
            if (tbyOLrzqt.AEQbTJ(futureHistoryBean, this) == objCopydefault) {
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
