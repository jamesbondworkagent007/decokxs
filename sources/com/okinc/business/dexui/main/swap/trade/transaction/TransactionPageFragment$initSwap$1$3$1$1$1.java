package com.okinc.business.dexui.main.swap.trade.transaction;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes15.dex */
public final class TransactionPageFragment$initSwap$1$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TransactionPageFragment<VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPageFragment$initSwap$1$3$1$1$1(TransactionPageFragment<VM> transactionPageFragment, Continuation<? super TransactionPageFragment$initSwap$1$3$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = transactionPageFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransactionPageFragment$initSwap$1$3$1$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransactionPageFragment$initSwap$1$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment$initSwap$1$3$1$1$1 for r9v1 'this'  kotlin.coroutines.Continuation
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
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r9.L$0
            o.irD r0 = (o.C25142irD) r0
            o.C56391yDq.AEQbTJ(r10)
            goto L33
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            o.C56391yDq.AEQbTJ(r10)
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r10 = r9.this$0
            o.irD r10 = r10.zsXlph()
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r1 = r9.this$0
            r9.L$0 = r10
            r9.label = r2
            java.lang.Object r1 = r1.EZpvd(r9)
            if (r1 != r0) goto L31
            return r0
        L31:
            r0 = r10
            r10 = r1
        L33:
            java.util.List r10 = (java.util.List) r10
            r0.KWHzl(r10)
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r10 = r9.this$0
            o.hpS r10 = r10.DbNXlk()
            androidx.lifecycle.MutableLiveData r10 = r10.AEQbTJ()
            r0 = 0
            java.lang.Boolean r1 = o.C56443yFo.KWHzl(r0)
            r10.setValue(r1)
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r10 = r9.this$0
            o.hpY r10 = r10.zLjUOn()
            androidx.lifecycle.MutableLiveData r10 = r10.gEmmrt()
            com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError r1 = new com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 3
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r10.setValue(r1)
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r10 = r9.this$0
            o.hpY r10 = r10.zLjUOn()
            androidx.lifecycle.MutableLiveData r10 = r10.DbNXlk()
            java.lang.Boolean r0 = o.C56443yFo.KWHzl(r0)
            r10.setValue(r0)
            com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment<VM> r10 = r9.this$0
            r0 = 2
            r1 = 0
            o.rVN.reportFullyDrawn$default(r10, r2, r1, r0, r1)
            java.lang.String r10 = "TransactionPageFragment"
            java.lang.String r0 = " fetchQuoteCallData handleData后"
            o.pUU.EZpvd(r10, r0)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment$initSwap$1$3$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
