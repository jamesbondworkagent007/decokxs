package com.okinc.business.defi.wallet.tee.common.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C17835fUa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class RsaCryptoHandleUseCase$teeRsaVerify$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $messageHex;
    final /* synthetic */ String $pubKeyHex;
    final /* synthetic */ String $signatureHex;
    int label;
    final /* synthetic */ C17835fUa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RsaCryptoHandleUseCase$teeRsaVerify$2(C17835fUa c17835fUa, String str, String str2, String str3, Continuation<? super RsaCryptoHandleUseCase$teeRsaVerify$2> continuation) {
        super(2, continuation);
        this.this$0 = c17835fUa;
        this.$messageHex = str;
        this.$pubKeyHex = str2;
        this.$signatureHex = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RsaCryptoHandleUseCase$teeRsaVerify$2(this.this$0, this.$messageHex, this.$pubKeyHex, this.$signatureHex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((RsaCryptoHandleUseCase$teeRsaVerify$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(this.this$0.KWHzl.EZpvd(this.$messageHex, this.$pubKeyHex, this.$signatureHex));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
