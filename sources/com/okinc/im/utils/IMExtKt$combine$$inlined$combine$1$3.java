package com.okinc.im.utils;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56518yIi;
import o.yHO;
import o.yHR;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes23.dex */
public final class IMExtKt$combine$$inlined$combine$1$3<R> extends SuspendLambda implements yHO<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
    final /* synthetic */ yHR $transform$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMExtKt$combine$$inlined$combine$1$3(Continuation continuation, yHR yhr) {
        super(3, continuation);
        this.$transform$inlined = yhr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
        IMExtKt$combine$$inlined$combine$1$3 iMExtKt$combine$$inlined$combine$1$3 = new IMExtKt$combine$$inlined$combine$1$3(continuation, this.$transform$inlined);
        iMExtKt$combine$$inlined$combine$1$3.L$0 = flowCollector;
        iMExtKt$combine$$inlined$combine$1$3.L$1 = objArr;
        return iMExtKt$combine$$inlined$combine$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            yHR yhr = this.$transform$inlined;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            this.L$0 = flowCollector;
            this.label = 1;
            obj = yhr.invoke(obj2, obj3, obj4, obj5, obj6, obj7, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        Object objInvoke = this.$transform$inlined.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], this);
        C56518yIi.AEQbTJ(0);
        flowCollector.emit(objInvoke, this);
        C56518yIi.AEQbTJ(1);
        return Unit.INSTANCE;
    }
}
