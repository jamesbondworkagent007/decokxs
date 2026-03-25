package com.okinc.auth.impl.passkey.ui.register;

import androidx.fragment.app.FragmentManager;
import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivity$onCreate$9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC6299aMi;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C6286aMV;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceActivity$onCreate$9 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC6299aMi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceActivity$onCreate$9(ActivityC6299aMi activityC6299aMi, Continuation<? super PasskeyPromotionServiceActivity$onCreate$9> continuation) {
        super(2, continuation);
        this.this$0 = activityC6299aMi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceActivity$onCreate$9(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceActivity$onCreate$9) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyScenario passkeyScenarioAuCTel = this.this$0.valueOf().AuCTel();
            if (passkeyScenarioAuCTel instanceof PasskeyScenario.CedefiWallet) {
                C6286aMV.TaskDescription taskDescription = C6286aMV.Companion;
                C6286aMV c6286aMVAEQbTJ = taskDescription.AEQbTJ(((PasskeyScenario.CedefiWallet) passkeyScenarioAuCTel).EZpvd());
                final ActivityC6299aMi activityC6299aMi = this.this$0;
                taskDescription.EZpvd(new Function0() { // from class: o.aMl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return PasskeyPromotionServiceActivity$onCreate$9.invokeSuspend$lambda$1$lambda$0(activityC6299aMi);
                    }
                });
                FragmentManager supportFragmentManager = activityC6299aMi.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c6286aMVAEQbTJ.show(supportFragmentManager);
            } else {
                if (!(passkeyScenarioAuCTel instanceof PasskeyScenario.Asset) && !Intrinsics.EZpvd(passkeyScenarioAuCTel, PasskeyScenario.Account.AEQbTJ) && !Intrinsics.EZpvd(passkeyScenarioAuCTel, PasskeyScenario.Pay.EZpvd)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.KWHzl(PasskeyRegisterState.RegisteredAlready.KWHzl);
                Function0<Unit> function0AEQbTJ = ActivityC6299aMi.Companion.AEQbTJ();
                if (function0AEQbTJ != null) {
                    function0AEQbTJ.invoke();
                } else {
                    C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C8206ayP.Dialog.dNCPSb), 0, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(ActivityC6299aMi activityC6299aMi) {
        activityC6299aMi.KWHzl(PasskeyRegisterState.RegisteredAlready.KWHzl);
        return Unit.INSTANCE;
    }
}
