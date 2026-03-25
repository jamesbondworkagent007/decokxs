package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.eHN;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckAndSignViewModel$handleBluetoothConnected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ eHN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckAndSignViewModel$handleBluetoothConnected$1(eHN ehn, Continuation<? super CheckAndSignViewModel$handleBluetoothConnected$1> continuation) {
        super(2, continuation);
        this.this$0 = ehn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckAndSignViewModel$handleBluetoothConnected$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CheckAndSignViewModel$handleBluetoothConnected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:45:0x00f8) to fix multi-entry loop: BACK_EDGE: B:45:0x00f8 -> B:46:0x0107 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: all -> 0x0051, CancellationException -> 0x0110, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:26:0x0081, B:30:0x009e, B:34:0x00c3, B:36:0x00d3, B:37:0x00d6, B:15:0x003c, B:18:0x004d), top: B:52:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:46:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d3 -> B:43:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00eb -> B:41:0x00ee). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = o.C56437yFi.OLrzqt()
            int r1 = r13.label
            r2 = 0
            r3 = 3
            java.lang.String r4 = "CheckAndSignViewModel"
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L54
            if (r1 == r6) goto L41
            if (r1 == r5) goto L2e
            if (r1 != r3) goto L26
            java.lang.Object r1 = r13.L$2
            java.lang.Object r7 = r13.L$1
            o.eHN r7 = (o.eHN) r7
            java.lang.Object r8 = r13.L$0
            kotlinx.coroutines.flow.MutableStateFlow r8 = (kotlinx.coroutines.flow.MutableStateFlow) r8
            o.C56391yDq.AEQbTJ(r14)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L110
            goto Lee
        L23:
            r14 = move-exception
            goto Lf8
        L26:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2e:
            java.lang.Object r1 = r13.L$3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r7 = r13.L$2
            java.lang.Object r8 = r13.L$1
            o.eHN r8 = (o.eHN) r8
            java.lang.Object r9 = r13.L$0
            kotlinx.coroutines.flow.MutableStateFlow r9 = (kotlinx.coroutines.flow.MutableStateFlow) r9
            o.C56391yDq.AEQbTJ(r14)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            goto Lc3
        L41:
            int r1 = r13.I$0
            java.lang.Object r7 = r13.L$2
            java.lang.Object r8 = r13.L$1
            o.eHN r8 = (o.eHN) r8
            java.lang.Object r9 = r13.L$0
            kotlinx.coroutines.flow.MutableStateFlow r9 = (kotlinx.coroutines.flow.MutableStateFlow) r9
            o.C56391yDq.AEQbTJ(r14)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            goto L9e
        L51:
            r14 = move-exception
            goto Lf5
        L54:
            o.C56391yDq.AEQbTJ(r14)
            o.eHN r14 = r13.this$0
            kotlinx.coroutines.flow.MutableStateFlow r14 = o.eHN.OLrzqt(r14)
            o.eHN r1 = r13.this$0
            r9 = r14
            r8 = r1
        L61:
            java.lang.Object r7 = r9.getValue()
            r14 = r7
            o.eHO r14 = (o.eHO) r14
            java.lang.String r14 = o.eHN.AEQbTJ(r8)
            if (r14 != 0) goto L81
            java.lang.String r14 = "handleBluetoothConnected: rootWalletId is null"
            o.pUU.copydefault(r4, r14)
            com.okinc.wallet.hardware.api.onekey.OneKeyException r14 = new com.okinc.wallet.hardware.api.onekey.OneKeyException
            java.lang.String r1 = "rootWalletId is null"
            r14.<init>(r1)
            o.eHO$Application r1 = new o.eHO$Application
            r1.<init>(r14)
            goto L107
        L81:
            o.eIn r14 = o.eHN.EZpvd(r8)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            java.lang.String r1 = o.eHN.AEQbTJ(r8)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$0 = r9     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$1 = r8     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$2 = r7     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$3 = r2     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r10 = 0
            r13.I$0 = r10     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.label = r6     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            java.lang.Object r14 = r14.copydefault(r1, r10, r13)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            if (r14 != r0) goto L9d
            return r0
        L9d:
            r1 = r10
        L9e:
            o.eIs r14 = (o.C15448eIs) r14     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            java.lang.String r10 = r14.KWHzl()     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            java.lang.String r14 = r14.copydefault()     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            o.eHN.AEQbTJ(r8, r10)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            o.eIi r11 = o.eHN.KWHzl(r8)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$0 = r9     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$1 = r8     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$2 = r7     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$3 = r14     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.label = r5     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            java.lang.Object r1 = r11.AEQbTJ(r10, r1, r13)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            if (r1 != r0) goto Lc0
            return r0
        Lc0:
            r12 = r1
            r1 = r14
            r14 = r12
        Lc3:
            o.eIu r14 = (o.C15450eIu) r14     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice r10 = r14.copydefault()     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            java.lang.String r14 = r14.KWHzl()     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            boolean r14 = kotlin.text.StringsKt.EZpvd(r1, r14, r6)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            if (r14 != 0) goto Ld6
            o.eHO$StateListAnimator r14 = o.eHO.StateListAnimator.EZpvd     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            goto Lf3
        Ld6:
            com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper$OneKeySignData r14 = o.eHN.copydefault(r8)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$0 = r9     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$1 = r8     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$2 = r7     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.L$3 = r2     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            r13.label = r3     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            java.lang.Object r14 = o.eHN.OLrzqt(r8, r10, r14, r13)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L110
            if (r14 != r0) goto Leb
            return r0
        Leb:
            r1 = r7
            r7 = r8
            r8 = r9
        Lee:
            o.eHO r14 = (o.eHO) r14     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L110
            r9 = r8
            r8 = r7
            r7 = r1
        Lf3:
            r1 = r14
            goto L107
        Lf5:
            r1 = r7
            r7 = r8
            r8 = r9
        Lf8:
            java.lang.String r9 = "handleBluetoothConnected: error"
            o.pUU.AEQbTJ(r4, r9, r14)
            o.eHO$Application r9 = new o.eHO$Application
            r9.<init>(r14)
            r12 = r7
            r7 = r1
            r1 = r9
            r9 = r8
            r8 = r12
        L107:
            boolean r14 = r9.compareAndSet(r7, r1)
            if (r14 == 0) goto L61
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L110:
            r14 = move-exception
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignViewModel$handleBluetoothConnected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
