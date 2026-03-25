package com.okinc.trade.arch.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC49411unz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.InterfaceC56554yJr;

/* JADX INFO: loaded from: classes11.dex */
public final class BaseViewModelExtKt$executeUseCaseInner$2 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC56554yJr<Object, InterfaceC49371unL<Object>> $property;
    final /* synthetic */ AbstractC49411unz<Object> $this_executeUseCaseInner;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModelExtKt$executeUseCaseInner$2(InterfaceC56554yJr<Object, InterfaceC49371unL<Object>> interfaceC56554yJr, AbstractC49411unz<Object> abstractC49411unz, Continuation<? super BaseViewModelExtKt$executeUseCaseInner$2> continuation) {
        super(2, continuation);
        this.$property = interfaceC56554yJr;
        this.$this_executeUseCaseInner = abstractC49411unz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseViewModelExtKt$executeUseCaseInner$2 baseViewModelExtKt$executeUseCaseInner$2 = new BaseViewModelExtKt$executeUseCaseInner$2(this.$property, this.$this_executeUseCaseInner, continuation);
        baseViewModelExtKt$executeUseCaseInner$2.L$0 = obj;
        return baseViewModelExtKt$executeUseCaseInner$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$executeUseCaseInner$2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Object obj2 = this.L$0;
            InterfaceC56554yJr<Object, InterfaceC49371unL<Object>> interfaceC56554yJr = this.$property;
            if (interfaceC56554yJr != null) {
                AbstractC49411unz<Object> abstractC49411unz = this.$this_executeUseCaseInner;
                InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(obj2);
                this.label = 1;
                if (abstractC49411unz.KWHzl((InterfaceC56554yJr<T, InterfaceC49371unL.Activity>) interfaceC56554yJr, activity, (Continuation<? super Unit>) this) == objCopydefault) {
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
