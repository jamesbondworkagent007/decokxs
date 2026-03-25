package com.okinc.business.market.features.meme.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase$subscribeWebSockets$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MemePumpUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemePumpUseCase$subscribeWebSockets$3(MemePumpUseCase memePumpUseCase, Continuation<? super MemePumpUseCase$subscribeWebSockets$3> continuation) {
        super(2, continuation);
        this.this$0 = memePumpUseCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemePumpUseCase$subscribeWebSockets$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemePumpUseCase$subscribeWebSockets$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[LOOP:0: B:13:0x0032->B:15:0x0038, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C56391yDq.AEQbTJ(r6)
            goto L25
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            o.C56391yDq.AEQbTJ(r6)
        L1a:
            r5.label = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
            if (r6 != r0) goto L25
            return r0
        L25:
            kotlin.ranges.IntRange r6 = new kotlin.ranges.IntRange
            r1 = 0
            r3 = 2
            r6.<init>(r1, r3)
            com.okinc.business.market.features.meme.ui.MemePumpUseCase r1 = r5.this$0
            java.util.Iterator r6 = r6.iterator()
        L32:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L1a
            r3 = r6
            o.yEn r3 = (o.AbstractC56415yEn) r3
            int r3 = r3.nextInt()
            com.okinc.business.market.features.meme.ui.MemePumpUseCase.KWHzl(r1, r3)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.market.features.meme.ui.MemePumpUseCase$subscribeWebSockets$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
