package com.okinc.business.market.common.websocket;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C27592jyB;

/* JADX INFO: loaded from: classes6.dex */
public final class WsDataWindowHelper$processData$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C27592jyB<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsDataWindowHelper$processData$1(C27592jyB<T> c27592jyB, Continuation<? super WsDataWindowHelper$processData$1> continuation) {
        super(continuation);
        this.this$0 = c27592jyB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.business.market.common.websocket.WsDataWindowHelper$processData$1 for r6v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            r6.result = r7
            int r7 = r6.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.label = r7
            o.jyB<T> r0 = r6.this$0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r6
            java.lang.Object r7 = r0.KWHzl(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.market.common.websocket.WsDataWindowHelper$processData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
