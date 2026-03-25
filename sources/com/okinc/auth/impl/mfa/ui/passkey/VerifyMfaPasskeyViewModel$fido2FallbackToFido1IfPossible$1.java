package com.okinc.auth.impl.mfa.ui.passkey;

import com.okinc.auth.api.passkey.PasskeyFido1State;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5790aDC;
import o.C5939aFt;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaPasskeyViewModel$fido2FallbackToFido1IfPossible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthenticationStartResponse $authStartResponse;
    final /* synthetic */ C5790aDC $fragment;
    final /* synthetic */ MfaScenario $mfaScenario;
    final /* synthetic */ String $originalErrorMessage;
    int label;
    final /* synthetic */ VerifyMfaPasskeyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyViewModel$fido2FallbackToFido1IfPossible$1(AuthenticationStartResponse authenticationStartResponse, VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel, C5790aDC c5790aDC, MfaScenario mfaScenario, String str, Continuation<? super VerifyMfaPasskeyViewModel$fido2FallbackToFido1IfPossible$1> continuation) {
        super(2, continuation);
        this.$authStartResponse = authenticationStartResponse;
        this.this$0 = verifyMfaPasskeyViewModel;
        this.$fragment = c5790aDC;
        this.$mfaScenario = mfaScenario;
        this.$originalErrorMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaPasskeyViewModel$fido2FallbackToFido1IfPossible$1(this.$authStartResponse, this.this$0, this.$fragment, this.$mfaScenario, this.$originalErrorMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyViewModel$fido2FallbackToFido1IfPossible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        String str;
        PasskeyFido1State passkeyFido1State;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<AuthenticationStartResponse.AdditionalData> additionalData = this.$authStartResponse.getAdditionalData();
            if (additionalData == null || additionalData.isEmpty()) {
                z = false;
                pUU.KWHzl("VerifyMfaPasskeyViewModel", "fido2FallbackToFido1IfPossible hasFido1Keys:" + z);
                if (!z) {
                    C5939aFt c5939aFt = this.this$0.getNewProxyInstance;
                    this.label = 1;
                    obj = c5939aFt.EZpvd(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    passkeyFido1State = (PasskeyFido1State) obj;
                    pUU.KWHzl("VerifyMfaPasskeyViewModel", "fido2FallbackToFido1IfPossible fido1State:" + passkeyFido1State);
                    if (Intrinsics.EZpvd(passkeyFido1State, PasskeyFido1State.Compatible.INSTANCE)) {
                    }
                } else {
                    MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
                    String str2 = this.$originalErrorMessage;
                    str = str2 != null ? str2 : "";
                    this.label = 3;
                    if (mutableSharedFlow.emit(str, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                Iterator<T> it = additionalData.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd(((AuthenticationStartResponse.AdditionalData) it.next()).getInHouse(), C56443yFo.KWHzl(true))) {
                        z = true;
                        break;
                    }
                }
                z = false;
                pUU.KWHzl("VerifyMfaPasskeyViewModel", "fido2FallbackToFido1IfPossible hasFido1Keys:" + z);
                if (!z) {
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            passkeyFido1State = (PasskeyFido1State) obj;
            pUU.KWHzl("VerifyMfaPasskeyViewModel", "fido2FallbackToFido1IfPossible fido1State:" + passkeyFido1State);
            if (Intrinsics.EZpvd(passkeyFido1State, PasskeyFido1State.Compatible.INSTANCE)) {
                MutableSharedFlow mutableSharedFlow2 = this.this$0.copydefault;
                String str3 = this.$originalErrorMessage;
                str = str3 != null ? str3 : "";
                this.label = 2;
                if (mutableSharedFlow2.emit(str, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                this.this$0.OLrzqt(this.$fragment, this.$mfaScenario);
            }
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
