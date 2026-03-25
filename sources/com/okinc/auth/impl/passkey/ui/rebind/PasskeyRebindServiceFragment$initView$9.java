package com.okinc.auth.impl.passkey.ui.rebind;

import android.content.Context;
import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C5922aFc;
import o.C6254aLq;
import o.InterfaceC5693aBL;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRebindServiceFragment$initView$9 extends SuspendLambda implements Function2<ActivateGuardUseCase.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6254aLq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindServiceFragment$initView$9(C6254aLq c6254aLq, Continuation<? super PasskeyRebindServiceFragment$initView$9> continuation) {
        super(2, continuation);
        this.this$0 = c6254aLq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyRebindServiceFragment$initView$9 passkeyRebindServiceFragment$initView$9 = new PasskeyRebindServiceFragment$initView$9(this.this$0, continuation);
        passkeyRebindServiceFragment$initView$9.L$0 = obj;
        return passkeyRebindServiceFragment$initView$9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ActivateGuardUseCase.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceFragment$initView$9) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivateGuardUseCase.TaskDescription taskDescription = (ActivateGuardUseCase.TaskDescription) this.L$0;
            C5922aFc c5922aFc = C5922aFc.KWHzl;
            c5922aFc.copydefault("[REBIND]", "[GUARD]", "Guard registration result: " + taskDescription);
            if (taskDescription instanceof ActivateGuardUseCase.TaskDescription.Fragment) {
                c5922aFc.copydefault("[REBIND]", "[GUARD]", "success");
                this.this$0.isConnected().copydefault(((ActivateGuardUseCase.TaskDescription.Fragment) taskDescription).AEQbTJ());
            } else if (Intrinsics.EZpvd(taskDescription, ActivateGuardUseCase.TaskDescription.ActionBar.KWHzl)) {
                c5922aFc.copydefault("[REBIND]", "[GUARD]", "already existed ");
                this.this$0.AYXKKw();
            } else if (taskDescription instanceof ActivateGuardUseCase.TaskDescription.StateListAnimator) {
                ActivateGuardUseCase.TaskDescription.StateListAnimator stateListAnimator = (ActivateGuardUseCase.TaskDescription.StateListAnimator) taskDescription;
                c5922aFc.copydefault("[REBIND]", "[GUARD]", "auth biometric error: " + stateListAnimator.KWHzl());
                InterfaceC5693aBL.StateListAnimator stateListAnimatorKWHzl = stateListAnimator.KWHzl();
                if (Intrinsics.EZpvd(stateListAnimatorKWHzl, InterfaceC5693aBL.StateListAnimator.Application.EZpvd)) {
                    C55326xho.toastWithFailedIcon$default(stateListAnimator.KWHzl().toString(), 0, 1, (Object) null);
                } else if (Intrinsics.EZpvd(stateListAnimatorKWHzl, InterfaceC5693aBL.StateListAnimator.TaskDescription.EZpvd)) {
                    Context context = this.this$0.getContext();
                    if (context == null) {
                        return Unit.INSTANCE;
                    }
                    this.this$0.EZpvd(context);
                } else if (stateListAnimatorKWHzl instanceof InterfaceC5693aBL.StateListAnimator.ActionBar) {
                    C55326xho.toastWithFailedIcon$default(((InterfaceC5693aBL.StateListAnimator.ActionBar) stateListAnimator.KWHzl()).toString(), 0, 1, (Object) null);
                } else if (!Intrinsics.EZpvd(stateListAnimatorKWHzl, InterfaceC5693aBL.StateListAnimator.Activity.copydefault)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (taskDescription instanceof ActivateGuardUseCase.TaskDescription.C0238TaskDescription) {
                    ActivateGuardUseCase.TaskDescription.C0238TaskDescription c0238TaskDescription = (ActivateGuardUseCase.TaskDescription.C0238TaskDescription) taskDescription;
                    c5922aFc.copydefault("[REBIND]", "[GUARD]", "create user key pair error: " + c0238TaskDescription.copydefault());
                    String strCopydefault = c0238TaskDescription.copydefault();
                    C55326xho.toastWithFailedIcon$default(strCopydefault != null ? strCopydefault : "", 0, 1, (Object) null);
                } else if (taskDescription instanceof ActivateGuardUseCase.TaskDescription.Activity) {
                    ActivateGuardUseCase.TaskDescription.Activity activity = (ActivateGuardUseCase.TaskDescription.Activity) taskDescription;
                    c5922aFc.copydefault("[REBIND]", "[GUARD]", "register passkey error: " + activity.EZpvd());
                    String strEZpvd = activity.EZpvd();
                    C55326xho.toastWithFailedIcon$default(strEZpvd != null ? strEZpvd : "", 0, 1, (Object) null);
                } else if (taskDescription instanceof ActivateGuardUseCase.TaskDescription.Application) {
                    ActivateGuardUseCase.TaskDescription.Application application = (ActivateGuardUseCase.TaskDescription.Application) taskDescription;
                    c5922aFc.copydefault("[REBIND]", "[GUARD]", "sign error: " + application.OLrzqt());
                    String strOLrzqt = application.OLrzqt();
                    C55326xho.toastWithFailedIcon$default(strOLrzqt != null ? strOLrzqt : "", 0, 1, (Object) null);
                } else {
                    if (!(taskDescription instanceof ActivateGuardUseCase.TaskDescription.Dialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActivateGuardUseCase.TaskDescription.Dialog dialog = (ActivateGuardUseCase.TaskDescription.Dialog) taskDescription;
                    c5922aFc.copydefault("[REBIND]", "[GUARD]", "unknown error: " + dialog.copydefault());
                    String strCopydefault2 = dialog.copydefault();
                    C55326xho.toastWithFailedIcon$default(strCopydefault2 != null ? strCopydefault2 : "", 0, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
