package com.okinc.trade.arch.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.InterfaceC49369unJ;
import o.InterfaceC56560yJx;
import o.yHT;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes11.dex */
public final class IUiRetrievable$withUiState$10<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final /* synthetic */ yHT<A, B, C, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ InterfaceC56560yJx<T, A> $prop1;
    final /* synthetic */ InterfaceC56560yJx<T, B> $prop2;
    final /* synthetic */ InterfaceC56560yJx<T, C> $prop3;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHT<? super A, ? super B, ? super C, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yJx<T, ? extends A> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yJx<T, ? extends B> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yJx<T, ? extends C> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IUiRetrievable$withUiState$10(yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> yht, InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, Continuation<? super IUiRetrievable$withUiState$10> continuation) {
        super(2, continuation);
        this.$block = yht;
        this.$prop1 = interfaceC56560yJx;
        this.$prop2 = interfaceC56560yJx2;
        this.$prop3 = interfaceC56560yJx3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IUiRetrievable$withUiState$10 iUiRetrievable$withUiState$10 = new IUiRetrievable$withUiState$10(this.$block, this.$prop1, this.$prop2, this.$prop3, continuation);
        iUiRetrievable$withUiState$10.L$0 = obj;
        return iUiRetrievable$withUiState$10;
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
        return ((IUiRetrievable$withUiState$10) create(interfaceC49369unJ, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.trade.arch.ui.IUiRetrievable$withUiState$10<T> for r6v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C56391yDq.AEQbTJ(r7)
            goto L3b
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            o.C56391yDq.AEQbTJ(r7)
            java.lang.Object r7 = r6.L$0
            o.unJ r7 = (o.InterfaceC49369unJ) r7
            o.yHT<A, B, C, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r6.$block
            o.yJx<T, A> r3 = r6.$prop1
            java.lang.Object r3 = r3.get(r7)
            o.yJx<T, B> r4 = r6.$prop2
            java.lang.Object r4 = r4.get(r7)
            o.yJx<T, C> r5 = r6.$prop3
            java.lang.Object r7 = r5.get(r7)
            r6.label = r2
            java.lang.Object r7 = r1.invoke(r3, r4, r7, r6)
            if (r7 != r0) goto L3b
            return r0
        L3b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.trade.arch.ui.IUiRetrievable$withUiState$10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
