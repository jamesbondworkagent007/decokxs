package com.okinc.im.imui.group.join.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel$checkPaymentStatusRegularly$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ JoinGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupViewModel$checkPaymentStatusRegularly$1(JoinGroupViewModel joinGroupViewModel, Continuation<? super JoinGroupViewModel$checkPaymentStatusRegularly$1> continuation) {
        super(2, continuation);
        this.this$0 = joinGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinGroupViewModel$checkPaymentStatusRegularly$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinGroupViewModel$checkPaymentStatusRegularly$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004b -> B:18:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r7.label
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            o.C56391yDq.AEQbTJ(r8)
            goto L4e
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            o.C56391yDq.AEQbTJ(r8)
            java.lang.String r8 = "JoinGroupViewModel=>checkPaymentStatusRegularly: Starting payment status check"
            o.C44124sEe.imLogGroup$default(r8, r4, r3, r4)
            com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel r8 = r7.this$0
            r1 = 3
            r5 = 0
            com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel.refreshInviteInfo$default(r8, r5, r5, r1, r4)
            com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel r8 = r7.this$0
            com.okinc.im.imui.group.join.model.JoinGroupDisplayModel r8 = com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel.djBIcL(r8)
            if (r8 == 0) goto L7f
            boolean r1 = o.nTM.valueOf(r8)
            if (r1 != r2) goto L7f
            com.okinc.okimcore.model.im.group.TransactionStatus r1 = o.nTM.AYXKKw(r8)
            com.okinc.okimcore.model.im.group.TransactionStatus r5 = com.okinc.okimcore.model.im.group.TransactionStatus.PENDING
            if (r1 != r5) goto L7f
            java.lang.String r8 = "JoinGroupViewModel=>checkPaymentStatusRegularly: Starting long polling for pending payment"
            o.C44124sEe.imLogGroup$default(r8, r4, r3, r4)
        L43:
            r7.label = r2
            r5 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
            if (r8 != r0) goto L4e
            return r0
        L4e:
            com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel r8 = r7.this$0
            r8.OLrzqt(r2, r2)
            com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel r8 = r7.this$0
            com.okinc.im.imui.group.join.model.JoinGroupDisplayModel r8 = com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel.djBIcL(r8)
            if (r8 == 0) goto L60
            com.okinc.okimcore.model.im.group.TransactionStatus r8 = o.nTM.AYXKKw(r8)
            goto L61
        L60:
            r8 = r4
        L61:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "JoinGroupViewModel=>checkPaymentStatusRegularly: Polling - new payment status="
            r1.append(r5)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            o.C44124sEe.imLogGroup$default(r1, r4, r3, r4)
            com.okinc.okimcore.model.im.group.TransactionStatus r1 = com.okinc.okimcore.model.im.group.TransactionStatus.PENDING
            if (r8 == r1) goto L43
            java.lang.String r8 = "JoinGroupViewModel=>checkPaymentStatusRegularly: Payment status changed, stopping polling"
            o.C44124sEe.imLogGroup$default(r8, r4, r3, r4)
            goto Laf
        L7f:
            if (r8 == 0) goto L8a
            boolean r0 = o.nTM.valueOf(r8)
            java.lang.Boolean r0 = o.C56443yFo.KWHzl(r0)
            goto L8b
        L8a:
            r0 = r4
        L8b:
            if (r8 == 0) goto L92
            com.okinc.okimcore.model.im.group.TransactionStatus r8 = o.nTM.AYXKKw(r8)
            goto L93
        L92:
            r8 = r4
        L93:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JoinGroupViewModel=>checkPaymentStatusRegularly: No need for polling - isPaidGroup="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", paymentStatus="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            o.C44124sEe.imLogGroup$default(r8, r4, r3, r4)
        Laf:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.im.imui.group.join.viewmodel.JoinGroupViewModel$checkPaymentStatusRegularly$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
