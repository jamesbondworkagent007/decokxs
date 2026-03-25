package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineScope;
import o.C15432eIc;
import o.C15436eIg;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckWalletNotAddedUseCase$checkWalletAdded$2$addressesFromWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Sequence<? extends String>>, Object> {
    final /* synthetic */ String $connectId;
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ C15432eIc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckWalletNotAddedUseCase$checkWalletAdded$2$addressesFromWallet$1(C15432eIc c15432eIc, String str, int i, Continuation<? super CheckWalletNotAddedUseCase$checkWalletAdded$2$addressesFromWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = c15432eIc;
        this.$connectId = str;
        this.$index = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckWalletNotAddedUseCase$checkWalletAdded$2$addressesFromWallet$1(this.this$0, this.$connectId, this.$index, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Sequence<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Sequence<String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Sequence<String>> continuation) {
        return ((CheckWalletNotAddedUseCase$checkWalletAdded$2$addressesFromWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15436eIg c15436eIg = this.this$0.EZpvd;
            String str = this.$connectId;
            int i2 = this.$index;
            this.label = 1;
            obj = c15436eIg.EZpvd(str, i2, this);
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
