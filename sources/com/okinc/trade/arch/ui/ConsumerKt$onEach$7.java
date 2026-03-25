package com.okinc.trade.arch.ui;

import com.okinc.trade.arch.util.Quartet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.yHS;

/* JADX INFO: Add missing generic type declarations: [A, B, C, D] */
/* JADX INFO: loaded from: classes11.dex */
public final class ConsumerKt$onEach$7<A, B, C, D> extends SuspendLambda implements Function2<Quartet<? extends A, ? extends B, ? extends C, ? extends D>, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHS<A, B, C, D, Continuation<? super Unit>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHS<? super A, ? super B, ? super C, ? super D, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsumerKt$onEach$7(yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> yhs, Continuation<? super ConsumerKt$onEach$7> continuation) {
        super(2, continuation);
        this.$block = yhs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConsumerKt$onEach$7 consumerKt$onEach$7 = new ConsumerKt$onEach$7(this.$block, continuation);
        consumerKt$onEach$7.L$0 = obj;
        return consumerKt$onEach$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Quartet<? extends A, ? extends B, ? extends C, ? extends D> quartet, Continuation<? super Unit> continuation) {
        return ((ConsumerKt$onEach$7) create(quartet, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.trade.arch.ui.ConsumerKt$onEach$7<A, B, C, D> for r9v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C56391yDq.AEQbTJ(r10)
            goto L3a
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            o.C56391yDq.AEQbTJ(r10)
            java.lang.Object r10 = r9.L$0
            com.okinc.trade.arch.util.Quartet r10 = (com.okinc.trade.arch.util.Quartet) r10
            o.yHS<A, B, C, D, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r9.$block
            java.lang.Object r4 = r10.getFirst()
            java.lang.Object r5 = r10.getSecond()
            java.lang.Object r6 = r10.getThird()
            java.lang.Object r7 = r10.getFourth()
            r9.label = r2
            r8 = r9
            java.lang.Object r10 = r3.invoke(r4, r5, r6, r7, r8)
            if (r10 != r0) goto L3a
            return r0
        L3a:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.trade.arch.ui.ConsumerKt$onEach$7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
