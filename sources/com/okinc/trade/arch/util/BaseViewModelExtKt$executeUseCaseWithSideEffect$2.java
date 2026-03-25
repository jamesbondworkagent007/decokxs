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
import o.yJA;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: loaded from: classes11.dex */
public final class BaseViewModelExtKt$executeUseCaseWithSideEffect$2<V> extends SuspendLambda implements Function2<V, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<V, Continuation<? super Unit>, Object> $onUpdateSuccessSideEffect;
    final /* synthetic */ InterfaceC56554yJr<T, InterfaceC49371unL<V>> $property;
    final /* synthetic */ AbstractC49411unz<T> $this_executeUseCaseWithSideEffect;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super V, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelExtKt$executeUseCaseWithSideEffect$2(AbstractC49411unz<T> abstractC49411unz, InterfaceC56554yJr<T, InterfaceC49371unL<V>> interfaceC56554yJr, Function2<? super V, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super BaseViewModelExtKt$executeUseCaseWithSideEffect$2> continuation) {
        super(2, continuation);
        this.$this_executeUseCaseWithSideEffect = abstractC49411unz;
        this.$property = interfaceC56554yJr;
        this.$onUpdateSuccessSideEffect = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseViewModelExtKt$executeUseCaseWithSideEffect$2 baseViewModelExtKt$executeUseCaseWithSideEffect$2 = new BaseViewModelExtKt$executeUseCaseWithSideEffect$2(this.$this_executeUseCaseWithSideEffect, this.$property, this.$onUpdateSuccessSideEffect, continuation);
        baseViewModelExtKt$executeUseCaseWithSideEffect$2.L$0 = obj;
        return baseViewModelExtKt$executeUseCaseWithSideEffect$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(V v, Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$executeUseCaseWithSideEffect$2) create(v, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            obj2 = this.L$0;
            AbstractC49411unz<T> abstractC49411unz = this.$this_executeUseCaseWithSideEffect;
            yJA yja = this.$property;
            InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(obj2);
            this.L$0 = obj2;
            this.label = 1;
            if (abstractC49411unz.KWHzl((InterfaceC56554yJr<T, InterfaceC49371unL.Activity>) yja, activity, this) == objCopydefault) {
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
            obj2 = this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Function2<V, Continuation<? super Unit>, Object> function2 = this.$onUpdateSuccessSideEffect;
        if (function2 != null) {
            this.L$0 = null;
            this.label = 2;
            if (function2.invoke(obj2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
