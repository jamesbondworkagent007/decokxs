package com.okinc.auth.impl.mfa.ui.passkey;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyFragment$initView$19;
import com.okinc.auth.impl.passkey.ui.bottomsheet.ErrorAssetLinkJsonBottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C5790aDC;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaPasskeyFragment$initView$19 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5790aDC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyFragment$initView$19(C5790aDC c5790aDC, Continuation<? super VerifyMfaPasskeyFragment$initView$19> continuation) {
        super(2, continuation);
        this.this$0 = c5790aDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaPasskeyFragment$initView$19(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyFragment$initView$19) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentManager supportFragmentManager;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return Unit.INSTANCE;
            }
            ErrorAssetLinkJsonBottomSheet errorAssetLinkJsonBottomSheetEZpvd = ErrorAssetLinkJsonBottomSheet.Companion.EZpvd(new ErrorAssetLinkJsonBottomSheet.ErrorAssetLinkJsonType.Authenticate(true));
            final C5790aDC c5790aDC = this.this$0;
            errorAssetLinkJsonBottomSheetEZpvd.copydefault(new Function0() { // from class: o.aDV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return VerifyMfaPasskeyFragment$initView$19.invokeSuspend$lambda$1$lambda$0(c5790aDC);
                }
            });
            errorAssetLinkJsonBottomSheetEZpvd.show(supportFragmentManager, ErrorAssetLinkJsonBottomSheet.class.getName());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(C5790aDC c5790aDC) {
        ActivityResultLauncher activityResultLauncher = c5790aDC.isConnected;
        if (activityResultLauncher == null) {
            Intrinsics.gEmmrt("");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(new PasskeyResetRemoveRequest(PasskeyResetRemoveType.BatchRemove.AEQbTJ, false, null, false, true, 14, null));
        return Unit.INSTANCE;
    }
}
