package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C15432eIc;
import o.C15438eIi;
import o.C15450eIu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckWalletNotAddedUseCase$checkWalletAdded$2$getAddressFromDevice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C15450eIu>, Object> {
    final /* synthetic */ String $connectId;
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ C15432eIc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckWalletNotAddedUseCase$checkWalletAdded$2$getAddressFromDevice$1(C15432eIc c15432eIc, String str, int i, Continuation<? super CheckWalletNotAddedUseCase$checkWalletAdded$2$getAddressFromDevice$1> continuation) {
        super(2, continuation);
        this.this$0 = c15432eIc;
        this.$connectId = str;
        this.$index = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckWalletNotAddedUseCase$checkWalletAdded$2$getAddressFromDevice$1(this.this$0, this.$connectId, this.$index, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C15450eIu> continuation) {
        return ((CheckWalletNotAddedUseCase$checkWalletAdded$2$getAddressFromDevice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15438eIi c15438eIi = this.this$0.KWHzl;
            String str = this.$connectId;
            int i2 = this.$index;
            this.label = 1;
            obj = c15438eIi.AEQbTJ(str, i2, this);
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
