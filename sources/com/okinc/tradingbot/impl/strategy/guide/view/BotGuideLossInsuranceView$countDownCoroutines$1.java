package com.okinc.tradingbot.impl.strategy.guide.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class BotGuideLossInsuranceView$countDownCoroutines$1 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $isFirst;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideLossInsuranceView$countDownCoroutines$1(Ref.BooleanRef booleanRef, Continuation<? super BotGuideLossInsuranceView$countDownCoroutines$1> continuation) {
        super(2, continuation);
        this.$isFirst = booleanRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotGuideLossInsuranceView$countDownCoroutines$1 botGuideLossInsuranceView$countDownCoroutines$1 = new BotGuideLossInsuranceView$countDownCoroutines$1(this.$isFirst, continuation);
        botGuideLossInsuranceView$countDownCoroutines$1.L$0 = obj;
        return botGuideLossInsuranceView$countDownCoroutines$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
        return ((BotGuideLossInsuranceView$countDownCoroutines$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004e -> B:11:0x002e). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o.C56391yDq.AEQbTJ(r7)
            goto L2e
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o.C56391yDq.AEQbTJ(r7)
            goto L44
        L26:
            o.C56391yDq.AEQbTJ(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
        L2e:
            kotlin.jvm.internal.Ref$BooleanRef r7 = r6.$isFirst
            boolean r4 = r7.element
            if (r4 != 0) goto L41
            r6.L$0 = r1
            r6.label = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
            if (r7 != r0) goto L44
            return r0
        L41:
            r4 = 0
            r7.element = r4
        L44:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L2e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.tradingbot.impl.strategy.guide.view.BotGuideLossInsuranceView$countDownCoroutines$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
