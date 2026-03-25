package com.okinc.business.defi.wallet.tee.common.usecase;

import com.okinc.wallet.core.tee.TeeAttestationVerifyData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.fTQ;

/* JADX INFO: loaded from: classes5.dex */
public final class AttestationVerifyUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TeeAttestationVerifyData>, Object> {
    final /* synthetic */ String $attestationDocHex;
    int label;
    final /* synthetic */ fTQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttestationVerifyUseCase$invoke$2(fTQ ftq, String str, Continuation<? super AttestationVerifyUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = ftq;
        this.$attestationDocHex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AttestationVerifyUseCase$invoke$2(this.this$0, this.$attestationDocHex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TeeAttestationVerifyData> continuation) {
        return ((AttestationVerifyUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.copydefault.KWHzl(this.$attestationDocHex);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
