package com.okinc.business.defi.wallet.tee.common.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.fTW;

/* JADX INFO: loaded from: classes5.dex */
public final class EvmSignHandleUseCase$teeBase64Signature$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $message;
    final /* synthetic */ String $prvKey;
    int label;
    final /* synthetic */ fTW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvmSignHandleUseCase$teeBase64Signature$2(fTW ftw, String str, String str2, Continuation<? super EvmSignHandleUseCase$teeBase64Signature$2> continuation) {
        super(2, continuation);
        this.this$0 = ftw;
        this.$prvKey = str;
        this.$message = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmSignHandleUseCase$teeBase64Signature$2(this.this$0, this.$prvKey, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((EvmSignHandleUseCase$teeBase64Signature$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.KWHzl.KWHzl(this.$prvKey, this.$message);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
