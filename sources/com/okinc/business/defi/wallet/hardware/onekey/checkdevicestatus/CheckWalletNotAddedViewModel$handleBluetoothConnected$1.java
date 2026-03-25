package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckWalletNotAddedViewModel$handleBluetoothConnected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CheckWalletNotAddedViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckWalletNotAddedViewModel$handleBluetoothConnected$1(CheckWalletNotAddedViewModel checkWalletNotAddedViewModel, Continuation<? super CheckWalletNotAddedViewModel$handleBluetoothConnected$1> continuation) {
        super(2, continuation);
        this.this$0 = checkWalletNotAddedViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckWalletNotAddedViewModel$handleBluetoothConnected$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CheckWalletNotAddedViewModel$handleBluetoothConnected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0049 -> B:12:0x004c). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r6.L$2
            java.lang.Object r3 = r6.L$1
            com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedViewModel r3 = (com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedViewModel) r3
            java.lang.Object r4 = r6.L$0
            kotlinx.coroutines.flow.MutableStateFlow r4 = (kotlinx.coroutines.flow.MutableStateFlow) r4
            o.C56391yDq.AEQbTJ(r7)
            goto L4c
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            o.C56391yDq.AEQbTJ(r7)
            com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedViewModel r7 = r6.this$0
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedViewModel.copydefault(r7)
            com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedViewModel r1 = r6.this$0
            r4 = r7
            r3 = r1
        L2e:
            java.lang.Object r1 = r4.getValue()
            r7 = r1
            com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent r7 = (com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent) r7
            o.eIc r7 = com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedViewModel.KWHzl(r3)
            java.lang.String r5 = com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedViewModel.EZpvd(r3)
            r6.L$0 = r4
            r6.L$1 = r3
            r6.L$2 = r1
            r6.label = r2
            java.lang.Object r7 = r7.OLrzqt(r5, r6)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent r7 = (com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent) r7
            boolean r7 = r4.compareAndSet(r1, r7)
            if (r7 == 0) goto L2e
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedViewModel$handleBluetoothConnected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
