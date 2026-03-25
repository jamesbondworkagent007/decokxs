package com.okinc.trade.arch.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class BaseViewModelExtKt$executeUseCaseInner$8 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Throwable, Continuation<? super Unit>, Object> $onUpdateFailure;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelExtKt$executeUseCaseInner$8(Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super BaseViewModelExtKt$executeUseCaseInner$8> continuation) {
        super(2, continuation);
        this.$onUpdateFailure = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseViewModelExtKt$executeUseCaseInner$8 baseViewModelExtKt$executeUseCaseInner$8 = new BaseViewModelExtKt$executeUseCaseInner$8(this.$onUpdateFailure, continuation);
        baseViewModelExtKt$executeUseCaseInner$8.L$0 = obj;
        return baseViewModelExtKt$executeUseCaseInner$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$executeUseCaseInner$8) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            Function2<Throwable, Continuation<? super Unit>, Object> function2 = this.$onUpdateFailure;
            if (function2 != null) {
                this.label = 1;
                if (function2.invoke(th, this) == objCopydefault) {
                    return objCopydefault;
                }
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
