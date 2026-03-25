package com.okinc.auth.impl.passkey.ui.register.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C5910aFQ;
import o.C5922aFc;
import o.C6268aMD;
import o.C8206ayP;
import o.InterfaceC5693aBL;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceBaseFragment$initObserveEvent$9 extends SuspendLambda implements Function2<C5910aFQ.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6268aMD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseFragment$initObserveEvent$9(C6268aMD c6268aMD, Continuation<? super PasskeyPromotionServiceBaseFragment$initObserveEvent$9> continuation) {
        super(2, continuation);
        this.this$0 = c6268aMD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyPromotionServiceBaseFragment$initObserveEvent$9 passkeyPromotionServiceBaseFragment$initObserveEvent$9 = new PasskeyPromotionServiceBaseFragment$initObserveEvent$9(this.this$0, continuation);
        passkeyPromotionServiceBaseFragment$initObserveEvent$9.L$0 = obj;
        return passkeyPromotionServiceBaseFragment$initObserveEvent$9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C5910aFQ.Application application, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseFragment$initObserveEvent$9) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C5910aFQ.Application application = (C5910aFQ.Application) this.L$0;
            C5922aFc c5922aFc = C5922aFc.KWHzl;
            c5922aFc.copydefault("[REGISTER]", "[GUARD]", this.this$0.getTAG() + " Guard registration result: " + application);
            if (application instanceof C5910aFQ.Application.TaskDescription) {
                C55326xho.toast$default(((C5910aFQ.Application.TaskDescription) application).OLrzqt(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else if (Intrinsics.EZpvd(application, C5910aFQ.Application.ActionBar.EZpvd)) {
                C55326xho.toast$default(C33070mpX.AYXKKw(C8206ayP.Dialog.AxsJAY), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else if (Intrinsics.EZpvd(application, C5910aFQ.Application.StateListAnimator.OLrzqt)) {
                c5922aFc.copydefault("[REGISTER]", "[GUARD]", this.this$0.getTAG() + " unlock token expired");
                this.this$0.AhwBna().fJNWhG();
            } else {
                if (!(application instanceof C5910aFQ.Application.C0818Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                C5910aFQ.Application.C0818Application c0818Application = (C5910aFQ.Application.C0818Application) application;
                c5922aFc.copydefault("[REGISTER]", "[GUARD]", this.this$0.getTAG() + " Success: " + c0818Application.EZpvd());
                ActivateGuardUseCase.TaskDescription taskDescriptionEZpvd = c0818Application.EZpvd();
                if (taskDescriptionEZpvd instanceof ActivateGuardUseCase.TaskDescription.Fragment) {
                    this.this$0.AhwBna().copydefault(((ActivateGuardUseCase.TaskDescription.Fragment) taskDescriptionEZpvd).AEQbTJ());
                } else if (Intrinsics.EZpvd(taskDescriptionEZpvd, ActivateGuardUseCase.TaskDescription.ActionBar.KWHzl)) {
                    this.this$0.DbNXlk();
                } else if (taskDescriptionEZpvd instanceof ActivateGuardUseCase.TaskDescription.StateListAnimator) {
                    ActivateGuardUseCase.TaskDescription.StateListAnimator stateListAnimator = (ActivateGuardUseCase.TaskDescription.StateListAnimator) taskDescriptionEZpvd;
                    c5922aFc.copydefault("[REGISTER]", "[GUARD]", this.this$0.getTAG() + " auth biometric error: " + stateListAnimator.KWHzl());
                    InterfaceC5693aBL.StateListAnimator stateListAnimatorKWHzl = stateListAnimator.KWHzl();
                    if (Intrinsics.EZpvd(stateListAnimatorKWHzl, InterfaceC5693aBL.StateListAnimator.TaskDescription.EZpvd)) {
                        Context context = this.this$0.getContext();
                        if (context == null) {
                            return Unit.INSTANCE;
                        }
                        this.this$0.KWHzl(context);
                    } else if (Intrinsics.EZpvd(stateListAnimatorKWHzl, InterfaceC5693aBL.StateListAnimator.Application.EZpvd)) {
                        C55326xho.toastWithFailedIcon$default(stateListAnimator.KWHzl().toString(), 0, 1, (Object) null);
                    } else if (stateListAnimatorKWHzl instanceof InterfaceC5693aBL.StateListAnimator.ActionBar) {
                        C55326xho.toastWithFailedIcon$default(((InterfaceC5693aBL.StateListAnimator.ActionBar) stateListAnimator.KWHzl()).toString(), 0, 1, (Object) null);
                    } else if (!Intrinsics.EZpvd(stateListAnimatorKWHzl, InterfaceC5693aBL.StateListAnimator.Activity.copydefault)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (taskDescriptionEZpvd instanceof ActivateGuardUseCase.TaskDescription.C0238TaskDescription) {
                        ActivateGuardUseCase.TaskDescription.C0238TaskDescription c0238TaskDescription = (ActivateGuardUseCase.TaskDescription.C0238TaskDescription) taskDescriptionEZpvd;
                        c5922aFc.copydefault("[REGISTER]", "[GUARD]", this.this$0.getTAG() + " create user key pair error: " + c0238TaskDescription.copydefault());
                        String strCopydefault = c0238TaskDescription.copydefault();
                        C55326xho.toastWithFailedIcon$default(strCopydefault != null ? strCopydefault : "", 0, 1, (Object) null);
                    } else if (taskDescriptionEZpvd instanceof ActivateGuardUseCase.TaskDescription.Activity) {
                        ActivateGuardUseCase.TaskDescription.Activity activity = (ActivateGuardUseCase.TaskDescription.Activity) taskDescriptionEZpvd;
                        c5922aFc.copydefault("[REGISTER]", "[GUARD]", this.this$0.getTAG() + " register passkey error: " + activity.EZpvd());
                        String strEZpvd = activity.EZpvd();
                        C55326xho.toastWithFailedIcon$default(strEZpvd != null ? strEZpvd : "", 0, 1, (Object) null);
                    } else if (taskDescriptionEZpvd instanceof ActivateGuardUseCase.TaskDescription.Application) {
                        ActivateGuardUseCase.TaskDescription.Application application2 = (ActivateGuardUseCase.TaskDescription.Application) taskDescriptionEZpvd;
                        c5922aFc.copydefault("[REGISTER]", "[GUARD]", this.this$0.getTAG() + " sign error: " + application2.OLrzqt());
                        String strOLrzqt = application2.OLrzqt();
                        C55326xho.toastWithFailedIcon$default(strOLrzqt != null ? strOLrzqt : "", 0, 1, (Object) null);
                    } else {
                        if (!(taskDescriptionEZpvd instanceof ActivateGuardUseCase.TaskDescription.Dialog)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ActivateGuardUseCase.TaskDescription.Dialog dialog = (ActivateGuardUseCase.TaskDescription.Dialog) taskDescriptionEZpvd;
                        c5922aFc.copydefault("[REBIND]", "[GUARD]", "unknown error: " + dialog.copydefault());
                        String strCopydefault2 = dialog.copydefault();
                        C55326xho.toastWithFailedIcon$default(strCopydefault2 != null ? strCopydefault2 : "", 0, 1, (Object) null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
