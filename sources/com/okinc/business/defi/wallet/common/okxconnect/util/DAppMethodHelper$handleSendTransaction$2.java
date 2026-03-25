package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.wallet.common.okxconnect.util.MethodHelperActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o.C15974ebF;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$handleSendTransaction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ DappInteractionArgs $args;
    final /* synthetic */ WeakReference<Context> $context;
    final /* synthetic */ String $messageId;
    final /* synthetic */ String $method;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$handleSendTransaction$2(String str, C15974ebF c15974ebF, String str2, WeakReference<Context> weakReference, DappInteractionArgs dappInteractionArgs, Continuation<? super DAppMethodHelper$handleSendTransaction$2> continuation) {
        super(2, continuation);
        this.$method = str;
        this.this$0 = c15974ebF;
        this.$messageId = str2;
        this.$context = weakReference;
        this.$args = dappInteractionArgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppMethodHelper$handleSendTransaction$2(this.$method, this.this$0, this.$messageId, this.$context, this.$args, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DAppMethodHelper$handleSendTransaction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DAppMethodHelper", "Start " + this.$method);
            C15974ebF c15974ebF = this.this$0;
            String str = this.$messageId;
            WeakReference<Context> weakReference = this.$context;
            String str2 = this.$method;
            DappInteractionArgs dappInteractionArgs = this.$args;
            this.L$0 = c15974ebF;
            this.L$1 = str;
            this.L$2 = weakReference;
            this.L$3 = str2;
            this.L$4 = dappInteractionArgs;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl.initCancellability();
            c15974ebF.copydefault(str, cancellableContinuationImpl);
            Context context = weakReference.get();
            if (context != null) {
                MethodHelperActivity.StateListAnimator.startSendTransaction$default(MethodHelperActivity.Companion, context, str, dappInteractionArgs, Intrinsics.EZpvd((Object) str2, (Object) "ton_sendTransaction") ? "tx_sign" : "data", false, c15974ebF, 16, null);
            } else {
                c15974ebF.OLrzqt(str, "");
            }
            obj = cancellableContinuationImpl.getResult();
            if (obj == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
