package com.okinc.trade.arch.ui;

import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.yHT;

/* JADX INFO: Add missing generic type declarations: [A, B, C] */
/* JADX INFO: loaded from: classes11.dex */
public final class ConsumerKt$onEach$5<A, B, C> extends SuspendLambda implements Function2<Triple<? extends A, ? extends B, ? extends C>, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHT<A, B, C, Continuation<? super Unit>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHT<? super A, ? super B, ? super C, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsumerKt$onEach$5(yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> yht, Continuation<? super ConsumerKt$onEach$5> continuation) {
        super(2, continuation);
        this.$block = yht;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConsumerKt$onEach$5 consumerKt$onEach$5 = new ConsumerKt$onEach$5(this.$block, continuation);
        consumerKt$onEach$5.L$0 = obj;
        return consumerKt$onEach$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Triple<? extends A, ? extends B, ? extends C> triple, Continuation<? super Unit> continuation) {
        return ((ConsumerKt$onEach$5) create(triple, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.trade.arch.ui.ConsumerKt$onEach$5<A, B, C> for r5v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C56391yDq.AEQbTJ(r6)
            goto L35
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            o.C56391yDq.AEQbTJ(r6)
            java.lang.Object r6 = r5.L$0
            kotlin.Triple r6 = (kotlin.Triple) r6
            o.yHT<A, B, C, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r5.$block
            java.lang.Object r3 = r6.getFirst()
            java.lang.Object r4 = r6.getSecond()
            java.lang.Object r6 = r6.getThird()
            r5.label = r2
            java.lang.Object r6 = r1.invoke(r3, r4, r6, r5)
            if (r6 != r0) goto L35
            return r0
        L35:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.trade.arch.ui.ConsumerKt$onEach$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
