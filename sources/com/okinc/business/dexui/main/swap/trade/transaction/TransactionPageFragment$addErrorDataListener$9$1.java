package com.okinc.business.dexui.main.swap.trade.transaction;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes15.dex */
public final class TransactionPageFragment$addErrorDataListener$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TransactionPageFragment<VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPageFragment$addErrorDataListener$9$1(TransactionPageFragment<VM> transactionPageFragment, Continuation<? super TransactionPageFragment$addErrorDataListener$9$1> continuation) {
        super(2, continuation);
        this.this$0 = transactionPageFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransactionPageFragment$addErrorDataListener$9$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransactionPageFragment$addErrorDataListener$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment$addErrorDataListener$9$1 for r3v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r3.L$0
            o.irD r0 = (o.C25142irD) r0
            o.C56391yDq.AEQbTJ(r4)
            goto L33
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L1b:
            o.C56391yDq.AEQbTJ(r4)
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r4 = r3.this$0
            o.irD r4 = r4.zsXlph()
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r1 = r3.this$0
            r3.L$0 = r4
            r3.label = r2
            java.lang.Object r1 = r1.EZpvd(r3)
            if (r1 != r0) goto L31
            return r0
        L31:
            r0 = r4
            r4 = r1
        L33:
            java.util.List r4 = (java.util.List) r4
            r0.KWHzl(r4)
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r4 = r3.this$0
            o.hFy r4 = r4.fJNWhG()
            if (r4 == 0) goto L53
            o.yiw r4 = r4.AYXKKw
            if (r4 == 0) goto L53
            o.wYp r4 = r4.EZpvd()
            if (r4 == 0) goto L53
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r0 = r3.this$0
            java.lang.String r0 = com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.AuCTel(r0)
            r4.setText(r0)
        L53:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment$addErrorDataListener$9$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
