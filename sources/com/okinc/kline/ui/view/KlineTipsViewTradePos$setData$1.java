package com.okinc.kline.ui.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39797pzC;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39510pth;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineTipsViewTradePos$setData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC39510pth $dataBean;
    int label;
    final /* synthetic */ C39797pzC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineTipsViewTradePos$setData$1(C39797pzC c39797pzC, InterfaceC39510pth interfaceC39510pth, Continuation<? super KlineTipsViewTradePos$setData$1> continuation) {
        super(2, continuation);
        this.this$0 = c39797pzC;
        this.$dataBean = interfaceC39510pth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineTipsViewTradePos$setData$1(this.this$0, this.$dataBean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineTipsViewTradePos$setData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C39797pzC c39797pzC = this.this$0;
                InterfaceC39510pth interfaceC39510pth = this.$dataBean;
                this.label = 1;
                obj = c39797pzC.AEQbTJ(interfaceC39510pth, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            this.this$0.KWHzl((C39797pzC.TaskDescription) obj, this.$dataBean);
        } catch (Exception e) {
            pUU.copydefault(this.this$0.copydefault, "Error in setData: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
