package com.okinc.auth.impl.passkey.ui.authenticate.scenario;

import android.content.DialogInterface;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.impl.passkey.ui.authenticate.scenario.PasskeyAuthenticateScenarioActivity$onCreate$11;
import com.okinc.auth.impl.passkey.ui.bottomsheet.ErrorAssetLinkJsonBottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC6005aHF;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateScenarioActivity$onCreate$11 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6005aHF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateScenarioActivity$onCreate$11(ActivityC6005aHF activityC6005aHF, Continuation<? super PasskeyAuthenticateScenarioActivity$onCreate$11> continuation) {
        super(2, continuation);
        this.this$0 = activityC6005aHF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyAuthenticateScenarioActivity$onCreate$11 passkeyAuthenticateScenarioActivity$onCreate$11 = new PasskeyAuthenticateScenarioActivity$onCreate$11(this.this$0, continuation);
        passkeyAuthenticateScenarioActivity$onCreate$11.L$0 = obj;
        return passkeyAuthenticateScenarioActivity$onCreate$11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateScenarioActivity$onCreate$11) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final String str = (String) this.L$0;
            ErrorAssetLinkJsonBottomSheet errorAssetLinkJsonBottomSheetEZpvd = ErrorAssetLinkJsonBottomSheet.Companion.EZpvd(new ErrorAssetLinkJsonBottomSheet.ErrorAssetLinkJsonType.Authenticate(false));
            final ActivityC6005aHF activityC6005aHF = this.this$0;
            errorAssetLinkJsonBottomSheetEZpvd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aHP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    PasskeyAuthenticateScenarioActivity$onCreate$11.invokeSuspend$lambda$1$lambda$0(activityC6005aHF, str, dialogInterface);
                }
            });
            errorAssetLinkJsonBottomSheetEZpvd.show(activityC6005aHF.getSupportFragmentManager(), ErrorAssetLinkJsonBottomSheet.class.getName());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(ActivityC6005aHF activityC6005aHF, String str, DialogInterface dialogInterface) {
        activityC6005aHF.OLrzqt(new PasskeyAuthenticateState.SdkError(str, true));
    }
}
