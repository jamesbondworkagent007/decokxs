package com.okinc.business.dexlogic.main.limmitorder.orderdetail;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderDetailViewModel$resumeOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ LimitOrderDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderDetailViewModel$resumeOrder$1(LimitOrderDetailViewModel limitOrderDetailViewModel, String str, Continuation<? super LimitOrderDetailViewModel$resumeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = limitOrderDetailViewModel;
        this.$orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LimitOrderDetailViewModel$resumeOrder$1(this.this$0, this.$orderId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LimitOrderDetailViewModel$resumeOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0057 -> B:12:0x005a). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L2b
            if (r1 != r2) goto L23
            java.lang.Object r1 = r7.L$3
            java.lang.Object r3 = r7.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.L$1
            com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel r4 = (com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel) r4
            java.lang.Object r5 = r7.L$0
            kotlinx.coroutines.flow.MutableStateFlow r5 = (kotlinx.coroutines.flow.MutableStateFlow) r5
            o.C56391yDq.AEQbTJ(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.m7386unboximpl()
            goto L5a
        L23:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2b:
            o.C56391yDq.AEQbTJ(r8)
            com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel r8 = r7.this$0
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel.AhwBna(r8)
            com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel r1 = r7.this$0
            java.lang.String r3 = r7.$orderId
            r5 = r8
            r4 = r1
        L3a:
            java.lang.Object r1 = r5.getValue()
            r8 = r1
            kotlin.Result r8 = (kotlin.Result) r8
            o.gZH r8 = com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel.EZpvd(r4)
            java.util.List r6 = kotlin.collections.CollectionsKt.KWHzl(r3)
            r7.L$0 = r5
            r7.L$1 = r4
            r7.L$2 = r3
            r7.L$3 = r1
            r7.label = r2
            java.lang.Object r8 = r8.OLrzqt(r6, r7)
            if (r8 != r0) goto L5a
            return r0
        L5a:
            kotlin.Result r8 = kotlin.Result.m7376boximpl(r8)
            boolean r8 = r5.compareAndSet(r1, r8)
            if (r8 == 0) goto L3a
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.dexlogic.main.limmitorder.orderdetail.LimitOrderDetailViewModel$resumeOrder$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
