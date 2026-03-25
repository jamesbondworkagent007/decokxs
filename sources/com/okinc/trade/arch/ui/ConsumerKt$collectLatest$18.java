package com.okinc.trade.arch.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C49360unA;
import o.yHR;

/* JADX INFO: loaded from: classes11.dex */
public final class ConsumerKt$collectLatest$18 extends SuspendLambda implements Function2<C49360unA.Fragment, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHR<A, B, C, D, E, F, Continuation<? super Unit>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsumerKt$collectLatest$18(yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> yhr, Continuation<? super ConsumerKt$collectLatest$18> continuation) {
        super(2, continuation);
        this.$block = yhr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConsumerKt$collectLatest$18 consumerKt$collectLatest$18 = new ConsumerKt$collectLatest$18(this.$block, continuation);
        consumerKt$collectLatest$18.L$0 = obj;
        return consumerKt$collectLatest$18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C49360unA.Fragment fragment, Continuation<? super Unit> continuation) {
        return ((ConsumerKt$collectLatest$18) create(fragment, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.trade.arch.ui.ConsumerKt$collectLatest$18 for r11v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C56391yDq.AEQbTJ(r12)
            goto L42
        Lf:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L17:
            o.C56391yDq.AEQbTJ(r12)
            java.lang.Object r12 = r11.L$0
            o.unA$Fragment r12 = (o.C49360unA.Fragment) r12
            o.yHR<A, B, C, D, E, F, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r11.$block
            java.lang.Object r4 = r12.copydefault()
            java.lang.Object r5 = r12.KWHzl()
            java.lang.Object r6 = r12.EZpvd()
            java.lang.Object r7 = r12.OLrzqt()
            java.lang.Object r8 = r12.AEQbTJ()
            java.lang.Object r9 = r12.djBIcL()
            r11.label = r2
            r10 = r11
            java.lang.Object r12 = r3.invoke(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L42
            return r0
        L42:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.trade.arch.ui.ConsumerKt$collectLatest$18.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
