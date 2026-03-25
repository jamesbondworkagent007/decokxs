package com.okinc.auth.impl.passkey.ui.resetremove.resetremove;

import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6460aPk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityResetRemovePasskeyServiceActivity$onCreate$2 extends SuspendLambda implements Function2<PasskeyResetRemoveType, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6460aPk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityResetRemovePasskeyServiceActivity$onCreate$2(ActivityC6460aPk activityC6460aPk, Continuation<? super SecurityResetRemovePasskeyServiceActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC6460aPk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityResetRemovePasskeyServiceActivity$onCreate$2 securityResetRemovePasskeyServiceActivity$onCreate$2 = new SecurityResetRemovePasskeyServiceActivity$onCreate$2(this.this$0, continuation);
        securityResetRemovePasskeyServiceActivity$onCreate$2.L$0 = obj;
        return securityResetRemovePasskeyServiceActivity$onCreate$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PasskeyResetRemoveType passkeyResetRemoveType, Continuation<? super Unit> continuation) {
        return ((SecurityResetRemovePasskeyServiceActivity$onCreate$2) create(passkeyResetRemoveType, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PasskeyScenario passkeyScenarioKWHzl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyResetRemoveType passkeyResetRemoveType = (PasskeyResetRemoveType) this.L$0;
            ResetRemovePasskeySelectionActivity.StateListAnimator stateListAnimator = ResetRemovePasskeySelectionActivity.Companion;
            ActivityC6460aPk activityC6460aPk = this.this$0;
            PasskeyResetRemoveRequest passkeyResetRemoveRequestDjBIcL = activityC6460aPk.djBIcL();
            if (passkeyResetRemoveRequestDjBIcL == null || (passkeyScenarioKWHzl = passkeyResetRemoveRequestDjBIcL.KWHzl()) == null) {
                passkeyScenarioKWHzl = PasskeyScenario.Account.AEQbTJ;
            }
            this.this$0.DbNXlk.launch(stateListAnimator.OLrzqt(activityC6460aPk, passkeyResetRemoveType, passkeyScenarioKWHzl, this.this$0.valueOf(), this.this$0.KWHzl()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
