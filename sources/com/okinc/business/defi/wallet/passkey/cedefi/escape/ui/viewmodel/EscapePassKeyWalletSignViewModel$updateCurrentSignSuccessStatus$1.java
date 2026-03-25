package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignStatus;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeTransactionData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fLT;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletSignViewModel$updateCurrentSignSuccessStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ PasskeyAuthenticateRequest $serverOption;
    final /* synthetic */ PasskeyAuthenticateResponse $signedTx;
    final /* synthetic */ String $uopHash;
    int label;
    final /* synthetic */ fLT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletSignViewModel$updateCurrentSignSuccessStatus$1(fLT flt, int i, PasskeyAuthenticateRequest passkeyAuthenticateRequest, String str, PasskeyAuthenticateResponse passkeyAuthenticateResponse, Continuation<? super EscapePassKeyWalletSignViewModel$updateCurrentSignSuccessStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = flt;
        this.$index = i;
        this.$serverOption = passkeyAuthenticateRequest;
        this.$uopHash = str;
        this.$signedTx = passkeyAuthenticateResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletSignViewModel$updateCurrentSignSuccessStatus$1(this.this$0, this.$index, this.$serverOption, this.$uopHash, this.$signedTx, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletSignViewModel$updateCurrentSignSuccessStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AYXKKw.set(this.$index, EscapeSignAddressData.copy$default((EscapeSignAddressData) this.this$0.AYXKKw.get(this.$index), null, null, 0L, null, EscapeSignStatus.ESCAPE_SIGN_STATUS_COMPLETED, new EscapeTransactionData(this.$serverOption, this.$uopHash, this.$signedTx), 15, null));
            this.this$0.djBIcL++;
            MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(this.this$0.djBIcL);
            this.label = 1;
            if (mutableStateFlow.emit(numAEQbTJ, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
