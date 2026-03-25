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
public final class BaseViewModelExtKt$executeUseCaseInner$3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC56554yJr<Object, InterfaceC49371unL<Object>> $property;
    final /* synthetic */ AbstractC49411unz<Object> $this_executeUseCaseInner;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModelExtKt$executeUseCaseInner$3(InterfaceC56554yJr<Object, InterfaceC49371unL<Object>> interfaceC56554yJr, AbstractC49411unz<Object> abstractC49411unz, Continuation<? super BaseViewModelExtKt$executeUseCaseInner$3> continuation) {
        super(2, continuation);
        this.$property = interfaceC56554yJr;
        this.$this_executeUseCaseInner = abstractC49411unz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseViewModelExtKt$executeUseCaseInner$3 baseViewModelExtKt$executeUseCaseInner$3 = new BaseViewModelExtKt$executeUseCaseInner$3(this.$property, this.$this_executeUseCaseInner, continuation);
        baseViewModelExtKt$executeUseCaseInner$3.L$0 = obj;
        return baseViewModelExtKt$executeUseCaseInner$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$executeUseCaseInner$3) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            InterfaceC56554yJr<Object, InterfaceC49371unL<Object>> interfaceC56554yJr = this.$property;
            if (interfaceC56554yJr != null) {
                AbstractC49411unz<Object> abstractC49411unz = this.$this_executeUseCaseInner;
                InterfaceC49371unL.Application application = new InterfaceC49371unL.Application(th, null, 2, null);
                this.label = 1;
                if (abstractC49411unz.KWHzl((InterfaceC56554yJr<T, InterfaceC49371unL.Application>) interfaceC56554yJr, application, (Continuation<? super Unit>) this) == objCopydefault) {
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
