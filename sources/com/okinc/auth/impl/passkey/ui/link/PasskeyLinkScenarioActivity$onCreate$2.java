package com.okinc.auth.impl.passkey.ui.link;

import androidx.activity.result.ActivityResultLauncher;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyLinkScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyLinkState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6144aJm;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyLinkScenarioActivity$onCreate$2 extends SuspendLambda implements Function2<PasskeyAuthenticateRequest, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6144aJm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyLinkScenarioActivity$onCreate$2(ActivityC6144aJm activityC6144aJm, Continuation<? super PasskeyLinkScenarioActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC6144aJm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyLinkScenarioActivity$onCreate$2 passkeyLinkScenarioActivity$onCreate$2 = new PasskeyLinkScenarioActivity$onCreate$2(this.this$0, continuation);
        passkeyLinkScenarioActivity$onCreate$2.L$0 = obj;
        return passkeyLinkScenarioActivity$onCreate$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PasskeyAuthenticateRequest passkeyAuthenticateRequest, Continuation<? super Unit> continuation) {
        return ((PasskeyLinkScenarioActivity$onCreate$2) create(passkeyAuthenticateRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyAuthenticateRequest passkeyAuthenticateRequest = (PasskeyAuthenticateRequest) this.L$0;
            pUU.KWHzl(this.this$0.getTAG(), "request: " + this.this$0.EZpvd());
            PasskeyLinkScenarioRequest passkeyLinkScenarioRequestEZpvd = this.this$0.EZpvd();
            if ((passkeyLinkScenarioRequestEZpvd != null ? passkeyLinkScenarioRequestEZpvd.getScenario() : null) instanceof PasskeyScenario.CedefiWallet) {
                PasskeyLinkScenarioRequest passkeyLinkScenarioRequestEZpvd2 = this.this$0.EZpvd();
                PasskeyScenario scenario = passkeyLinkScenarioRequestEZpvd2 != null ? passkeyLinkScenarioRequestEZpvd2.getScenario() : null;
                PasskeyScenario.CedefiWallet cedefiWallet = scenario instanceof PasskeyScenario.CedefiWallet ? (PasskeyScenario.CedefiWallet) scenario : null;
                String strEZpvd = cedefiWallet != null ? cedefiWallet.EZpvd() : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                ActivityResultLauncher activityResultLauncher = this.this$0.AhwBna;
                PasskeyScenario.CedefiWallet cedefiWallet2 = new PasskeyScenario.CedefiWallet(strEZpvd, false, 2, null);
                PasskeyLinkScenarioRequest passkeyLinkScenarioRequestEZpvd3 = this.this$0.EZpvd();
                activityResultLauncher.launch(new PasskeyAuthenticateScenarioRequest(cedefiWallet2, passkeyLinkScenarioRequestEZpvd3 != null ? passkeyLinkScenarioRequestEZpvd3.getEnableExternal() : true, passkeyAuthenticateRequest));
            } else {
                this.this$0.OLrzqt(PasskeyLinkState.Cancel.OLrzqt);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
