package com.okinc.auth.impl.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes14.dex */
public final class FlowObserveExtensionKt$observeEvent$2<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $action;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowObserveExtensionKt$observeEvent$2(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super FlowObserveExtensionKt$observeEvent$2> continuation) {
        super(2, continuation);
        this.$action = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowObserveExtensionKt$observeEvent$2 flowObserveExtensionKt$observeEvent$2 = new FlowObserveExtensionKt$observeEvent$2(this.$action, continuation);
        flowObserveExtensionKt$observeEvent$2.L$0 = obj;
        return flowObserveExtensionKt$observeEvent$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(T t, Continuation<? super Unit> continuation) {
        return ((FlowObserveExtensionKt$observeEvent$2) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.auth.impl.util.FlowObserveExtensionKt$observeEvent$2<T> for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C56391yDq.AEQbTJ(r4)
            goto L27
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            o.C56391yDq.AEQbTJ(r4)
            java.lang.Object r4 = r3.L$0
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r3.$action
            r3.label = r2
            java.lang.Object r4 = r1.invoke(r4, r3)
            if (r4 != r0) goto L27
            return r0
        L27:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.auth.impl.util.FlowObserveExtensionKt$observeEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
