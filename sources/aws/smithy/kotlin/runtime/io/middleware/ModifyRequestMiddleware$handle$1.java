package aws.smithy.kotlin.runtime.io.middleware;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5080Dy;
import o.CG;

/* JADX WARN: Unknown type variable: Request in type: o.Dy<Request, Response> */
/* JADX WARN: Unknown type variable: Response in type: o.Dy<Request, Response> */
/* JADX INFO: loaded from: classes2.dex */
public final class ModifyRequestMiddleware$handle$1<H extends CG<? super Request, ? extends Response>> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C5080Dy<Request, Response> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unknown type variable: Request in type: o.Dy<Request, Response> */
    /* JADX WARN: Unknown type variable: Response in type: o.Dy<Request, Response> */
    public ModifyRequestMiddleware$handle$1(C5080Dy<Request, Response> c5080Dy, Continuation<? super ModifyRequestMiddleware$handle$1> continuation) {
        super(continuation);
        this.this$0 = c5080Dy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to aws.smithy.kotlin.runtime.io.middleware.ModifyRequestMiddleware$handle$1<H extends o.CG<? super Request, ? extends Response>> for r1v1 'this'  kotlin.coroutines.Continuation
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
            o.Dy<Request, Response> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.EZpvd(r0, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: aws.smithy.kotlin.runtime.io.middleware.ModifyRequestMiddleware$handle$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
