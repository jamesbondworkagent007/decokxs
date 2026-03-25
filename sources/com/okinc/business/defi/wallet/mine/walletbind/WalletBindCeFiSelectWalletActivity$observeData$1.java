package com.okinc.business.defi.wallet.mine.walletbind;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC16243egJ;
import o.ActivityC19292fyY;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindCeFiSelectWalletActivity$observeData$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ActivityC19292fyY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindCeFiSelectWalletActivity$observeData$1(ActivityC19292fyY activityC19292fyY, Continuation<? super WalletBindCeFiSelectWalletActivity$observeData$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC19292fyY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletBindCeFiSelectWalletActivity$observeData$1 walletBindCeFiSelectWalletActivity$observeData$1 = new WalletBindCeFiSelectWalletActivity$observeData$1(this.this$0, continuation);
        walletBindCeFiSelectWalletActivity$observeData$1.Z$0 = ((Boolean) obj).booleanValue();
        return walletBindCeFiSelectWalletActivity$observeData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((WalletBindCeFiSelectWalletActivity$observeData$1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C52794wYp c52794wYp;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            AbstractC16243egJ abstractC16243egJ = this.this$0.AYXKKw;
            if (abstractC16243egJ != null && (c52794wYp = abstractC16243egJ.copydefault) != null) {
                c52794wYp.setEnabled(z);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
