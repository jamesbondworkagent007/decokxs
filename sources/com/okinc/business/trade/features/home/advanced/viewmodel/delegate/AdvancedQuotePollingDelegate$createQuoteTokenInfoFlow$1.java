package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedQuotePollingDelegate$createQuoteTokenInfoFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedQuotePollingDelegate$createQuoteTokenInfoFlow$1(Continuation<? super AdvancedQuotePollingDelegate$createQuoteTokenInfoFlow$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedQuotePollingDelegate$createQuoteTokenInfoFlow$1 advancedQuotePollingDelegate$createQuoteTokenInfoFlow$1 = new AdvancedQuotePollingDelegate$createQuoteTokenInfoFlow$1(continuation);
        advancedQuotePollingDelegate$createQuoteTokenInfoFlow$1.L$0 = obj;
        return advancedQuotePollingDelegate$createQuoteTokenInfoFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((AdvancedQuotePollingDelegate$createQuoteTokenInfoFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:11:0x0034). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r8.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L21
            if (r1 != r2) goto L19
            int r1 = r8.I$0
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            o.C56391yDq.AEQbTJ(r9)
            goto L34
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            int r1 = r8.I$0
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            o.C56391yDq.AEQbTJ(r9)
            goto L4a
        L2b:
            o.C56391yDq.AEQbTJ(r9)
            java.lang.Object r9 = r8.L$0
            r5 = r9
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            r1 = r3
        L34:
            if (r1 == 0) goto L38
            r9 = r4
            goto L39
        L38:
            r9 = r3
        L39:
            java.lang.Boolean r9 = o.C56443yFo.KWHzl(r9)
            r8.L$0 = r5
            r8.I$0 = r1
            r8.label = r4
            java.lang.Object r9 = r5.emit(r9, r8)
            if (r9 != r0) goto L4a
            return r0
        L4a:
            if (r1 != 0) goto L4e
            r1 = r4
            goto L4f
        L4e:
            r1 = r3
        L4f:
            r8.L$0 = r5
            r8.I$0 = r1
            r8.label = r2
            r6 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
            if (r9 != r0) goto L34
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedQuotePollingDelegate$createQuoteTokenInfoFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
