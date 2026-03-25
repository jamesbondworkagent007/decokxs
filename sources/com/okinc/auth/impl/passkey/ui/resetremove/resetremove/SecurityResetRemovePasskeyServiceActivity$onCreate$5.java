package com.okinc.auth.impl.passkey.ui.resetremove.resetremove;

import android.content.Intent;
import androidx.activity.result.ActivityResultCallback;
import com.okinc.auth.api.passkey.PasskeyManagementRequest;
import com.okinc.auth.api.passkey.PasskeyManagementState;
import com.okinc.auth.api.passkey.PasskeyResetRemoveState;
import com.okinc.auth.impl.passkey.ui.resetremove.resetremove.SecurityResetRemovePasskeyServiceActivity$onCreate$5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6460aPk;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityResetRemovePasskeyServiceActivity$onCreate$5 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC6460aPk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityResetRemovePasskeyServiceActivity$onCreate$5(ActivityC6460aPk activityC6460aPk, Continuation<? super SecurityResetRemovePasskeyServiceActivity$onCreate$5> continuation) {
        super(2, continuation);
        this.this$0 = activityC6460aPk;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(PasskeyManagementState passkeyManagementState) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityResetRemovePasskeyServiceActivity$onCreate$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((SecurityResetRemovePasskeyServiceActivity$onCreate$5) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.getActivityResultRegistry().register(this.this$0.getClass().getSimpleName(), ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).valueOf(), new ActivityResultCallback() { // from class: o.aPA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj2) {
                    SecurityResetRemovePasskeyServiceActivity$onCreate$5.invokeSuspend$lambda$0((PasskeyManagementState) obj2);
                }
            }).launch(new PasskeyManagementRequest(true, false));
            this.this$0.setResult(-1, new Intent().putExtra("KEY_RESET_REMOVE_RESPONSE", PasskeyResetRemoveState.Cancel.copydefault));
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
