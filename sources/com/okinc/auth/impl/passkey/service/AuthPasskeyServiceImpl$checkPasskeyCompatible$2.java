package com.okinc.auth.impl.passkey.service;

import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5958aGL;
import o.pUU;
import o.yEE;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthPasskeyServiceImpl$checkPasskeyCompatible$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $enableFido1;
    final /* synthetic */ PasskeyScenario $scenario;
    int label;
    final /* synthetic */ C5958aGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthPasskeyServiceImpl$checkPasskeyCompatible$2(PasskeyScenario passkeyScenario, boolean z, C5958aGL c5958aGL, Continuation<? super AuthPasskeyServiceImpl$checkPasskeyCompatible$2> continuation) {
        super(2, continuation);
        this.$scenario = passkeyScenario;
        this.$enableFido1 = z;
        this.this$0 = c5958aGL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthPasskeyServiceImpl$checkPasskeyCompatible$2(this.$scenario, this.$enableFido1, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((AuthPasskeyServiceImpl$checkPasskeyCompatible$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("AuthPasskeyServiceImpl", "internalCheckPasskeyCompatible: start with scenario: " + this.$scenario + " enableFido1: " + this.$enableFido1);
            C5958aGL c5958aGL = this.this$0;
            PasskeyScenario passkeyScenario = this.$scenario;
            boolean z = this.$enableFido1;
            this.label = 1;
            obj = c5958aGL.AEQbTJ(passkeyScenario, z, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(yEE.AhwBna(PasskeyVersionState.Fido2Compatible.INSTANCE, PasskeyVersionState.Fido1v1Compatible.INSTANCE, PasskeyVersionState.Fido1v2Compatible.INSTANCE).contains((PasskeyVersionState) obj));
    }
}
