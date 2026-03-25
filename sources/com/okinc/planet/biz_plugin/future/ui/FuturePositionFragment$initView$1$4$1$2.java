package com.okinc.planet.biz_plugin.future.ui;

import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45984tDn;
import o.C56391yDq;
import o.C56442yFn;
import o.tBY;

/* JADX INFO: loaded from: classes19.dex */
public final class FuturePositionFragment$initView$1$4$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FuturePositionBean $selected;
    int label;
    final /* synthetic */ C45984tDn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturePositionFragment$initView$1$4$1$2(C45984tDn c45984tDn, FuturePositionBean futurePositionBean, Continuation<? super FuturePositionFragment$initView$1$4$1$2> continuation) {
        super(2, continuation);
        this.this$0 = c45984tDn;
        this.$selected = futurePositionBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturePositionFragment$initView$1$4$1$2(this.this$0, this.$selected, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturePositionFragment$initView$1$4$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tBY tbyOLrzqt = this.this$0.OLrzqt();
            FuturePositionBean futurePositionBean = this.$selected;
            this.label = 1;
            if (tbyOLrzqt.copydefault(futurePositionBean, this) == objCopydefault) {
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
