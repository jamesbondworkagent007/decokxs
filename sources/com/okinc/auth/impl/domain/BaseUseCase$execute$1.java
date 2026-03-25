package com.okinc.auth.impl.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC5726aBs;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseUseCase$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ AbstractC5726aBs<Input, Output> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUseCase$execute$1(AbstractC5726aBs<Input, Output> abstractC5726aBs, Continuation<? super BaseUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = abstractC5726aBs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.auth.impl.domain.BaseUseCase$execute$1 for r1v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            o.aBs<Input, Output> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.KWHzl(r0, r1)
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            if (r2 != r0) goto L17
            return r2
        L17:
            kotlin.Result r2 = kotlin.Result.m7376boximpl(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.auth.impl.domain.BaseUseCase$execute$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
