package com.okinc.business.defi.wallet.tee.common.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fTV;

/* JADX INFO: loaded from: classes5.dex */
public final class HPKEHandleUseCase$teeHPKEDecrypt$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $associatedDataHex;
    final /* synthetic */ String $ciphertextHex;
    final /* synthetic */ String $encapsulatedKeyHex;
    final /* synthetic */ String $receiverPriKeyHex;
    final /* synthetic */ String $senderPubKeyHex;
    int label;
    final /* synthetic */ fTV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HPKEHandleUseCase$teeHPKEDecrypt$2(fTV ftv, String str, String str2, String str3, String str4, String str5, Continuation<? super HPKEHandleUseCase$teeHPKEDecrypt$2> continuation) {
        super(2, continuation);
        this.this$0 = ftv;
        this.$ciphertextHex = str;
        this.$associatedDataHex = str2;
        this.$encapsulatedKeyHex = str3;
        this.$receiverPriKeyHex = str4;
        this.$senderPubKeyHex = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HPKEHandleUseCase$teeHPKEDecrypt$2(this.this$0, this.$ciphertextHex, this.$associatedDataHex, this.$encapsulatedKeyHex, this.$receiverPriKeyHex, this.$senderPubKeyHex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((HPKEHandleUseCase$teeHPKEDecrypt$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(this.this$0.copydefault.AEQbTJ(this.$ciphertextHex, this.$associatedDataHex, this.$encapsulatedKeyHex, this.$receiverPriKeyHex, this.$senderPubKeyHex));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
