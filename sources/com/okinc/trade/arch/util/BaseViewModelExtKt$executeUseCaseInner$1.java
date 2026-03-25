package com.okinc.trade.arch.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AbstractC49411unz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.InterfaceC56554yJr;

/* JADX INFO: loaded from: classes11.dex */
public final class BaseViewModelExtKt$executeUseCaseInner$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC56554yJr<Object, InterfaceC49371unL<Object>> $property;
    final /* synthetic */ AbstractC49411unz<Object> $this_executeUseCaseInner;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModelExtKt$executeUseCaseInner$1(InterfaceC56554yJr<Object, InterfaceC49371unL<Object>> interfaceC56554yJr, AbstractC49411unz<Object> abstractC49411unz, Continuation<? super BaseViewModelExtKt$executeUseCaseInner$1> continuation) {
        super(1, continuation);
        this.$property = interfaceC56554yJr;
        this.$this_executeUseCaseInner = abstractC49411unz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BaseViewModelExtKt$executeUseCaseInner$1(this.$property, this.$this_executeUseCaseInner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$executeUseCaseInner$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC56554yJr<Object, InterfaceC49371unL<Object>> interfaceC56554yJr = this.$property;
            if (interfaceC56554yJr != null) {
                AbstractC49411unz<Object> abstractC49411unz = this.$this_executeUseCaseInner;
                InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.label = 1;
                if (abstractC49411unz.KWHzl((InterfaceC56554yJr<T, InterfaceC49371unL.ActionBar>) interfaceC56554yJr, actionBar, (Continuation<? super Unit>) this) == objCopydefault) {
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
