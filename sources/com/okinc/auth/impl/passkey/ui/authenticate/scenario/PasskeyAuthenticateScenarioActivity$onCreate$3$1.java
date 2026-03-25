package com.okinc.auth.impl.passkey.ui.authenticate.scenario;

import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC6005aHF;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateScenarioActivity$onCreate$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $enableExternal;
    final /* synthetic */ PasskeyAuthenticateRequest $it;
    final /* synthetic */ PasskeyAuthenticateScenarioRequest $request;
    int label;
    final /* synthetic */ ActivityC6005aHF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateScenarioActivity$onCreate$3$1(PasskeyAuthenticateScenarioRequest passkeyAuthenticateScenarioRequest, ActivityC6005aHF activityC6005aHF, PasskeyAuthenticateRequest passkeyAuthenticateRequest, boolean z, Continuation<? super PasskeyAuthenticateScenarioActivity$onCreate$3$1> continuation) {
        super(2, continuation);
        this.$request = passkeyAuthenticateScenarioRequest;
        this.this$0 = activityC6005aHF;
        this.$it = passkeyAuthenticateRequest;
        this.$enableExternal = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyAuthenticateScenarioActivity$onCreate$3$1(this.$request, this.this$0, this.$it, this.$enableExternal, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateScenarioActivity$onCreate$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC8196ayF interfaceC8196ayF = (InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class);
            PasskeyScenario scenario = this.$request.getScenario();
            this.label = 1;
            obj = InterfaceC8196ayF.Activity.checkPasskeyCompatible$default(interfaceC8196ayF, scenario, false, this, 2, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.djBIcL().EZpvd(this.$it, this.$enableExternal);
        } else {
            this.this$0.OLrzqt(PasskeyAuthenticateState.DeviceNotCompatible.OLrzqt);
        }
        return Unit.INSTANCE;
    }
}
