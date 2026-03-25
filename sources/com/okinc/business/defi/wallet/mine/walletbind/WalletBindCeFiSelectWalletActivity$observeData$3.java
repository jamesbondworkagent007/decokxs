package com.okinc.business.defi.wallet.mine.walletbind;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC19292fyY;
import o.C17304fAj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindCeFiSelectWalletActivity$observeData$3 extends SuspendLambda implements Function2<Pair<? extends String, ? extends String>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC19292fyY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindCeFiSelectWalletActivity$observeData$3(ActivityC19292fyY activityC19292fyY, Continuation<? super WalletBindCeFiSelectWalletActivity$observeData$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC19292fyY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletBindCeFiSelectWalletActivity$observeData$3 walletBindCeFiSelectWalletActivity$observeData$3 = new WalletBindCeFiSelectWalletActivity$observeData$3(this.this$0, continuation);
        walletBindCeFiSelectWalletActivity$observeData$3.L$0 = obj;
        return walletBindCeFiSelectWalletActivity$observeData$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends String, ? extends String> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<String, String>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<String, String> pair, Continuation<? super Unit> continuation) {
        return ((WalletBindCeFiSelectWalletActivity$observeData$3) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            C17304fAj.EZpvd.KWHzl((String) pair.getFirst(), (String) pair.getSecond(), this.this$0);
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
