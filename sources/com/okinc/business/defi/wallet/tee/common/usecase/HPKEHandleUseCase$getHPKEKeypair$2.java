package com.okinc.business.defi.wallet.tee.common.usecase;

import com.okinc.wallet.core.tee.HPKEKeypair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.fTV;

/* JADX INFO: loaded from: classes5.dex */
public final class HPKEHandleUseCase$getHPKEKeypair$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HPKEKeypair>, Object> {
    final /* synthetic */ String $salt;
    final /* synthetic */ String $seedHex;
    int label;
    final /* synthetic */ fTV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HPKEHandleUseCase$getHPKEKeypair$2(fTV ftv, String str, String str2, Continuation<? super HPKEHandleUseCase$getHPKEKeypair$2> continuation) {
        super(2, continuation);
        this.this$0 = ftv;
        this.$seedHex = str;
        this.$salt = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HPKEHandleUseCase$getHPKEKeypair$2(this.this$0, this.$seedHex, this.$salt, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HPKEKeypair> continuation) {
        return ((HPKEHandleUseCase$getHPKEKeypair$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.copydefault.copydefault(this.$seedHex, this.$salt);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
