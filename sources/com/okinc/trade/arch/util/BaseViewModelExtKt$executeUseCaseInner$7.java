package com.okinc.trade.arch.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: loaded from: classes11.dex */
public final class BaseViewModelExtKt$executeUseCaseInner$7<V> extends SuspendLambda implements Function2<V, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<V, Boolean> $onCheckIsEmpty;
    final /* synthetic */ Function2<V, Continuation<? super Unit>, Object> $onUpdateEmpty;
    final /* synthetic */ Function2<V, Continuation<? super Unit>, Object> $onUpdateSuccess;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super V, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super V, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super V, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelExtKt$executeUseCaseInner$7(Function1<? super V, Boolean> function1, Function2<? super V, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super V, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super BaseViewModelExtKt$executeUseCaseInner$7> continuation) {
        super(2, continuation);
        this.$onCheckIsEmpty = function1;
        this.$onUpdateEmpty = function2;
        this.$onUpdateSuccess = function22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseViewModelExtKt$executeUseCaseInner$7 baseViewModelExtKt$executeUseCaseInner$7 = new BaseViewModelExtKt$executeUseCaseInner$7(this.$onCheckIsEmpty, this.$onUpdateEmpty, this.$onUpdateSuccess, continuation);
        baseViewModelExtKt$executeUseCaseInner$7.L$0 = obj;
        return baseViewModelExtKt$executeUseCaseInner$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(V v, Continuation<? super Unit> continuation) {
        return ((BaseViewModelExtKt$executeUseCaseInner$7) create(v, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$7<V> for r4v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            o.C56391yDq.AEQbTJ(r5)
            goto L4a
        L1b:
            o.C56391yDq.AEQbTJ(r5)
            java.lang.Object r5 = r4.L$0
            kotlin.jvm.functions.Function1<V, java.lang.Boolean> r1 = r4.$onCheckIsEmpty
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r1.invoke(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r3) goto L3d
            kotlin.jvm.functions.Function2<V, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$onUpdateEmpty
            if (r1 == 0) goto L4a
            r4.label = r3
            java.lang.Object r5 = r1.invoke(r5, r4)
            if (r5 != r0) goto L4a
            return r0
        L3d:
            kotlin.jvm.functions.Function2<V, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$onUpdateSuccess
            if (r1 == 0) goto L4a
            r4.label = r2
            java.lang.Object r5 = r1.invoke(r5, r4)
            if (r5 != r0) goto L4a
            return r0
        L4a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.trade.arch.util.BaseViewModelExtKt$executeUseCaseInner$7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
