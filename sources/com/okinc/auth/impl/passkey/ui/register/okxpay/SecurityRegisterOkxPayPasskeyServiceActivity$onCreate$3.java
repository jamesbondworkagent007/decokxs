package com.okinc.auth.impl.passkey.ui.register.okxpay;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.ui.bottomsheet.Error50162BottomSheet;
import com.okinc.auth.impl.passkey.ui.bottomsheet.ErrorAssetLinkJsonBottomSheet;
import com.okinc.auth.impl.passkey.ui.register.okxpay.SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5991aGs;
import o.ActivityC6354aNk;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5724aBq;
import o.C6024aHY;
import o.C6347aNd;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3 extends SuspendLambda implements Function2<AbstractC5991aGs, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6354aNk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3(ActivityC6354aNk activityC6354aNk, Continuation<? super SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC6354aNk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3 securityRegisterOkxPayPasskeyServiceActivity$onCreate$3 = new SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3(this.this$0, continuation);
        securityRegisterOkxPayPasskeyServiceActivity$onCreate$3.L$0 = obj;
        return securityRegisterOkxPayPasskeyServiceActivity$onCreate$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC5991aGs abstractC5991aGs, Continuation<? super Unit> continuation) {
        return ((SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3) create(abstractC5991aGs, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC5991aGs abstractC5991aGs = (AbstractC5991aGs) this.L$0;
            if (abstractC5991aGs instanceof AbstractC5991aGs.LoaderManager) {
                C6347aNd.ActionBar actionBar = C6347aNd.Companion;
                FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                final ActivityC6354aNk activityC6354aNk = this.this$0;
                actionBar.EZpvd(supportFragmentManager, activityC6354aNk, new Function1() { // from class: o.aNo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3.invokeSuspend$lambda$8(activityC6354aNk, (PasskeySdkResult) obj2);
                    }
                });
                C56443yFo.AEQbTJ(this.this$0.getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.hBpjJd, actionBar.KWHzl(((AbstractC5991aGs.LoaderManager) abstractC5991aGs).EZpvd()), C6347aNd.class.getName()).commitAllowingStateLoss());
            } else if (!(abstractC5991aGs instanceof AbstractC5991aGs.TaskDescription)) {
                if (Intrinsics.EZpvd(abstractC5991aGs, AbstractC5991aGs.FragmentManager.EZpvd)) {
                    this.this$0.KWHzl().gEmmrt();
                } else if (abstractC5991aGs instanceof AbstractC5991aGs.ActionBar) {
                    this.this$0.copydefault(PasskeyState.MaximumReached.INSTANCE);
                } else if (!(abstractC5991aGs instanceof AbstractC5991aGs.StateListAnimator)) {
                    if (Intrinsics.EZpvd(abstractC5991aGs, AbstractC5991aGs.Activity.EZpvd)) {
                        this.this$0.copydefault(PasskeyState.AccountFrozen.INSTANCE);
                    } else if (abstractC5991aGs instanceof AbstractC5991aGs.Application) {
                        ActivityC6354aNk activityC6354aNk2 = this.this$0;
                        String strEZpvd = ((AbstractC5991aGs.Application) abstractC5991aGs).EZpvd();
                        activityC6354aNk2.copydefault(new PasskeyState.RegisterError(strEZpvd != null ? strEZpvd : ""));
                    } else if (Intrinsics.EZpvd(abstractC5991aGs, AbstractC5991aGs.PendingIntent.KWHzl)) {
                        this.this$0.copydefault(new PasskeyState.RegisterError(C33070mpX.AYXKKw(C8206ayP.Dialog.ggKfIT)));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$8(final ActivityC6354aNk activityC6354aNk, final PasskeySdkResult passkeySdkResult) {
        if (!(passkeySdkResult instanceof PasskeySdkResult.SuccessWithJson)) {
            if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithPublicKeyCredential) {
                activityC6354aNk.KWHzl().EZpvd(((PasskeySdkResult.SuccessWithPublicKeyCredential) passkeySdkResult).OLrzqt());
            } else if (passkeySdkResult instanceof PasskeySdkResult.AlreadyExisted) {
                activityC6354aNk.copydefault(PasskeyState.RegisteredAlready.INSTANCE);
            } else if (passkeySdkResult instanceof PasskeySdkResult.Failure) {
                PasskeySdkResult.Failure failure = (PasskeySdkResult.Failure) passkeySdkResult;
                if (failure.AhwBna()) {
                    ErrorAssetLinkJsonBottomSheet errorAssetLinkJsonBottomSheetEZpvd = ErrorAssetLinkJsonBottomSheet.Companion.EZpvd(ErrorAssetLinkJsonBottomSheet.ErrorAssetLinkJsonType.Register.EZpvd);
                    errorAssetLinkJsonBottomSheetEZpvd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aNm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(android.content.DialogInterface dialogInterface) {
                            SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3.invokeSuspend$lambda$8$lambda$1$lambda$0(activityC6354aNk, passkeySdkResult, dialogInterface);
                        }
                    });
                    errorAssetLinkJsonBottomSheetEZpvd.show(activityC6354aNk.getSupportFragmentManager(), ErrorAssetLinkJsonBottomSheet.class.getName());
                } else if (failure.copydefault()) {
                    C6024aHY c6024aHYCopydefault = C6024aHY.Companion.copydefault();
                    c6024aHYCopydefault.KWHzl(new Function0() { // from class: o.aNn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3.invokeSuspend$lambda$8$lambda$4$lambda$2(activityC6354aNk);
                        }
                    });
                    c6024aHYCopydefault.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aNl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(android.content.DialogInterface dialogInterface) {
                            SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3.invokeSuspend$lambda$8$lambda$4$lambda$3(activityC6354aNk, passkeySdkResult, dialogInterface);
                        }
                    });
                    c6024aHYCopydefault.show(activityC6354aNk.getSupportFragmentManager(), C6024aHY.class.getName());
                } else if (failure.djBIcL()) {
                    Error50162BottomSheet error50162BottomSheetEZpvd = Error50162BottomSheet.Companion.EZpvd(false, Error50162BottomSheet.EventFlow.PAY);
                    error50162BottomSheetEZpvd.AEQbTJ(new Function0() { // from class: o.aNp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3.invokeSuspend$lambda$8$lambda$7$lambda$5(activityC6354aNk);
                        }
                    });
                    error50162BottomSheetEZpvd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aNs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(android.content.DialogInterface dialogInterface) {
                            SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$3.invokeSuspend$lambda$8$lambda$7$lambda$6(activityC6354aNk, passkeySdkResult, dialogInterface);
                        }
                    });
                    error50162BottomSheetEZpvd.show(activityC6354aNk.getSupportFragmentManager(), Error50162BottomSheet.class.getName());
                } else {
                    String strKWHzl = failure.KWHzl();
                    if (strKWHzl == null) {
                        strKWHzl = "";
                    }
                    activityC6354aNk.copydefault(new PasskeyState.OkxPaySdkError(strKWHzl, false));
                }
            } else if (passkeySdkResult instanceof PasskeySdkResult.CancelledOrVerifiedFail) {
                activityC6354aNk.copydefault(PasskeyState.Cancel.INSTANCE);
            } else if (passkeySdkResult instanceof PasskeySdkResult.NoValidPasskey) {
                activityC6354aNk.copydefault(PasskeyState.NoValidPasskey.INSTANCE);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$8$lambda$1$lambda$0(ActivityC6354aNk activityC6354aNk, PasskeySdkResult passkeySdkResult, DialogInterface dialogInterface) {
        String strKWHzl = ((PasskeySdkResult.Failure) passkeySdkResult).KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        activityC6354aNk.copydefault(new PasskeyState.OkxPaySdkError(strKWHzl, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$8$lambda$4$lambda$2(ActivityC6354aNk activityC6354aNk) {
        C5724aBq.EZpvd.KWHzl(activityC6354aNk);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$8$lambda$4$lambda$3(ActivityC6354aNk activityC6354aNk, PasskeySdkResult passkeySdkResult, DialogInterface dialogInterface) {
        String strKWHzl = ((PasskeySdkResult.Failure) passkeySdkResult).KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        activityC6354aNk.copydefault(new PasskeyState.OkxPaySdkError(strKWHzl, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$8$lambda$7$lambda$5(ActivityC6354aNk activityC6354aNk) {
        C5724aBq.EZpvd.copydefault(activityC6354aNk);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$8$lambda$7$lambda$6(ActivityC6354aNk activityC6354aNk, PasskeySdkResult passkeySdkResult, DialogInterface dialogInterface) {
        String strKWHzl = ((PasskeySdkResult.Failure) passkeySdkResult).KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        activityC6354aNk.copydefault(new PasskeyState.OkxPaySdkError(strKWHzl, true));
    }
}
