package com.reown.android.pairing.engine.domain;

import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PairingEngine$isNotExpired$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Pairing $this_isNotExpired;
    public int label;
    public final /* synthetic */ PairingEngine this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairingEngine$isNotExpired$1$1(PairingEngine pairingEngine, Pairing pairing, Continuation<? super PairingEngine$isNotExpired$1$1> continuation) {
        super(2, continuation);
        this.this$0 = pairingEngine;
        this.$this_isNotExpired = pairing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new PairingEngine$isNotExpired$1$1(this.this$0, this.$this_isNotExpired, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PairingEngine$isNotExpired$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(this.this$0.jsonRpcInteractor, this.$this_isNotExpired.getTopic(), null, null, 6, null);
                this.this$0.pairingRepository.deletePairing(this.$this_isNotExpired.getTopic());
                this.this$0.metadataRepository.deleteMetaData(this.$this_isNotExpired.getTopic());
                this.this$0.crypto.removeKeys(this.$this_isNotExpired.getTopic().getValue());
            } catch (Exception e) {
                this.this$0.logger.error("Error when deleting pairing: " + e);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
