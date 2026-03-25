package aws.smithy.kotlin.runtime.http.operation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BJ;
import o.BP;
import o.C5036Cg;
import o.C58859zS;
import o.CG;

/* JADX WARN: Unknown type variable: I in type: o.BJ<I, O> */
/* JADX WARN: Unknown type variable: O in type: o.BJ<I, O> */
/* JADX INFO: loaded from: classes2.dex */
public final class InterceptorTransmitMiddleware$handle$1<H extends CG<? super BP<C5036Cg>, ? extends C58859zS>> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ BJ<I, O> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unknown type variable: I in type: o.BJ<I, O> */
    /* JADX WARN: Unknown type variable: O in type: o.BJ<I, O> */
    public InterceptorTransmitMiddleware$handle$1(BJ<I, O> bj, Continuation<? super InterceptorTransmitMiddleware$handle$1> continuation) {
        super(continuation);
        this.this$0 = bj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to aws.smithy.kotlin.runtime.http.operation.InterceptorTransmitMiddleware$handle$1<H extends o.CG<? super o.BP<o.Cg>, ? extends o.zS>> for r1v1 'this'  kotlin.coroutines.Continuation
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
            o.BJ<I, O> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.EZpvd(r0, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: aws.smithy.kotlin.runtime.http.operation.InterceptorTransmitMiddleware$handle$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
