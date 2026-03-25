package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.fUX;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$quoteFlow$2 extends SuspendLambda implements yHO<FlowCollector<? super Boolean>, Boolean, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ fUX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterViewModel$quoteFlow$2(fUX fux, Continuation<? super SmallAssetsConverterViewModel$quoteFlow$2> continuation) {
        super(3, continuation);
        this.this$0 = fux;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(FlowCollector<? super Boolean> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(flowCollector, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, boolean z, Continuation<? super Unit> continuation) {
        SmallAssetsConverterViewModel$quoteFlow$2 smallAssetsConverterViewModel$quoteFlow$2 = new SmallAssetsConverterViewModel$quoteFlow$2(this.this$0, continuation);
        smallAssetsConverterViewModel$quoteFlow$2.L$0 = flowCollector;
        smallAssetsConverterViewModel$quoteFlow$2.Z$0 = z;
        return smallAssetsConverterViewModel$quoteFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0083 -> B:21:0x0054). Please report as a decompilation issue!!! */
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
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L38
            if (r1 == r5) goto L34
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o.C56391yDq.AEQbTJ(r9)
            goto L54
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o.C56391yDq.AEQbTJ(r9)
            goto L71
        L2c:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o.C56391yDq.AEQbTJ(r9)
            goto L64
        L34:
            o.C56391yDq.AEQbTJ(r9)
            goto L51
        L38:
            o.C56391yDq.AEQbTJ(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            boolean r9 = r8.Z$0
            if (r9 == 0) goto L54
            java.lang.Boolean r9 = o.C56443yFo.KWHzl(r5)
            r8.label = r5
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L51
            return r0
        L51:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L54:
            r9 = 0
            java.lang.Boolean r9 = o.C56443yFo.KWHzl(r9)
            r8.L$0 = r1
            r8.label = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L64
            return r0
        L64:
            r8.L$0 = r1
            r8.label = r3
            r6 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
            if (r9 != r0) goto L71
            return r0
        L71:
            o.fUX r9 = r8.this$0
            kotlinx.coroutines.flow.MutableStateFlow r9 = o.fUX.gEmmrt(r9)
            java.lang.Boolean r6 = o.C56443yFo.KWHzl(r5)
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = r9.emit(r6, r8)
            if (r9 != r0) goto L54
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$quoteFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
