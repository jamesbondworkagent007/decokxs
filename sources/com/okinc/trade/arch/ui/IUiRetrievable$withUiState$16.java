package com.okinc.trade.arch.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.InterfaceC49369unJ;
import o.InterfaceC56560yJx;
import o.yHQ;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes11.dex */
public final class IUiRetrievable$withUiState$16<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHQ<A, B, C, D, E, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ InterfaceC56560yJx<T, A> $prop1;
    final /* synthetic */ InterfaceC56560yJx<T, B> $prop2;
    final /* synthetic */ InterfaceC56560yJx<T, C> $prop3;
    final /* synthetic */ InterfaceC56560yJx<T, D> $prop4;
    final /* synthetic */ InterfaceC56560yJx<T, E> $prop5;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yJx<T, ? extends A> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yJx<T, ? extends B> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yJx<T, ? extends C> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.yJx<T, ? extends D> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.yJx<T, ? extends E> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IUiRetrievable$withUiState$16(yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> yhq, InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, Continuation<? super IUiRetrievable$withUiState$16> continuation) {
        super(2, continuation);
        this.$block = yhq;
        this.$prop1 = interfaceC56560yJx;
        this.$prop2 = interfaceC56560yJx2;
        this.$prop3 = interfaceC56560yJx3;
        this.$prop4 = interfaceC56560yJx4;
        this.$prop5 = interfaceC56560yJx5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IUiRetrievable$withUiState$16 iUiRetrievable$withUiState$16 = new IUiRetrievable$withUiState$16(this.$block, this.$prop1, this.$prop2, this.$prop3, this.$prop4, this.$prop5, continuation);
        iUiRetrievable$withUiState$16.L$0 = obj;
        return iUiRetrievable$withUiState$16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((InterfaceC49369unJ) obj, (Continuation) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Incorrect types in method signature: (TT;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public final Object invoke(InterfaceC49369unJ interfaceC49369unJ, Continuation continuation) {
        return ((IUiRetrievable$withUiState$16) create(interfaceC49369unJ, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.trade.arch.ui.IUiRetrievable$withUiState$16<T> for r10v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C56391yDq.AEQbTJ(r11)
            goto L48
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            o.C56391yDq.AEQbTJ(r11)
            java.lang.Object r11 = r10.L$0
            o.unJ r11 = (o.InterfaceC49369unJ) r11
            o.yHQ<A, B, C, D, E, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r10.$block
            o.yJx<T, A> r1 = r10.$prop1
            java.lang.Object r4 = r1.get(r11)
            o.yJx<T, B> r1 = r10.$prop2
            java.lang.Object r5 = r1.get(r11)
            o.yJx<T, C> r1 = r10.$prop3
            java.lang.Object r6 = r1.get(r11)
            o.yJx<T, D> r1 = r10.$prop4
            java.lang.Object r7 = r1.get(r11)
            o.yJx<T, E> r1 = r10.$prop5
            java.lang.Object r8 = r1.get(r11)
            r10.label = r2
            r9 = r10
            java.lang.Object r11 = r3.invoke(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L48
            return r0
        L48:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.trade.arch.ui.IUiRetrievable$withUiState$16.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
