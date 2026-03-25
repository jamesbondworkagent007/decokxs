package com.okinc.trade.arch.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.InterfaceC49369unJ;
import o.InterfaceC56560yJx;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes11.dex */
public final class IUiRetrievable$withUiState$4<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<A, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ InterfaceC56560yJx<T, A> $prop1;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yJx<T, ? extends A> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IUiRetrievable$withUiState$4(Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> function2, InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, Continuation<? super IUiRetrievable$withUiState$4> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$prop1 = interfaceC56560yJx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IUiRetrievable$withUiState$4 iUiRetrievable$withUiState$4 = new IUiRetrievable$withUiState$4(this.$block, this.$prop1, continuation);
        iUiRetrievable$withUiState$4.L$0 = obj;
        return iUiRetrievable$withUiState$4;
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
        return ((IUiRetrievable$withUiState$4) create(interfaceC49369unJ, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.okinc.trade.arch.ui.IUiRetrievable$withUiState$4<T> for r4v1 'this'  java.lang.Object
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
            goto L2f
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            o.C56391yDq.AEQbTJ(r5)
            java.lang.Object r5 = r4.L$0
            o.unJ r5 = (o.InterfaceC49369unJ) r5
            kotlin.jvm.functions.Function2<A, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$block
            o.yJx<T, A> r3 = r4.$prop1
            java.lang.Object r5 = r3.get(r5)
            r4.label = r2
            java.lang.Object r5 = r1.invoke(r5, r4)
            if (r5 != r0) goto L2f
            return r0
        L2f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.trade.arch.ui.IUiRetrievable$withUiState$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
