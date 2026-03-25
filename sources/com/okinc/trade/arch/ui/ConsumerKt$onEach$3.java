package com.okinc.trade.arch.ui;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.yHO;

/* JADX INFO: Add missing generic type declarations: [A, B] */
/* JADX INFO: loaded from: classes11.dex */
public final class ConsumerKt$onEach$3<A, B> extends SuspendLambda implements Function2<Pair<? extends A, ? extends B>, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHO<A, B, Continuation<? super Unit>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super A, ? super B, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsumerKt$onEach$3(yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> yho, Continuation<? super ConsumerKt$onEach$3> continuation) {
        super(2, continuation);
        this.$block = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConsumerKt$onEach$3 consumerKt$onEach$3 = new ConsumerKt$onEach$3(this.$block, continuation);
        consumerKt$onEach$3.L$0 = obj;
        return consumerKt$onEach$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends A, ? extends B> pair, Continuation<? super Unit> continuation) {
        return ((ConsumerKt$onEach$3) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.trade.arch.ui.ConsumerKt$onEach$3<A, B> for r4v1 'this'  java.lang.Object
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
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C56391yDq.AEQbTJ(r5)
            goto L31
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            o.C56391yDq.AEQbTJ(r5)
            java.lang.Object r5 = r4.L$0
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r1 = r5.component1()
            java.lang.Object r5 = r5.component2()
            o.yHO<A, B, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r4.$block
            r4.label = r2
            java.lang.Object r5 = r3.invoke(r1, r5, r4)
            if (r5 != r0) goto L31
            return r0
        L31:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.trade.arch.ui.ConsumerKt$onEach$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
