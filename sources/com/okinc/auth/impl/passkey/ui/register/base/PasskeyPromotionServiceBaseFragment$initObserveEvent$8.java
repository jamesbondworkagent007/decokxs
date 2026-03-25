package com.okinc.auth.impl.passkey.ui.register.base;

import android.graphics.drawable.Drawable;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseFragment$initObserveEvent$8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5991aGs;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C5922aFc;
import o.C6020aHU;
import o.C6081aIc;
import o.C6268aMD;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyPromotionServiceBaseFragment$initObserveEvent$8 extends SuspendLambda implements Function2<AbstractC5991aGs, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6268aMD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseFragment$initObserveEvent$8(C6268aMD c6268aMD, Continuation<? super PasskeyPromotionServiceBaseFragment$initObserveEvent$8> continuation) {
        super(2, continuation);
        this.this$0 = c6268aMD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyPromotionServiceBaseFragment$initObserveEvent$8 passkeyPromotionServiceBaseFragment$initObserveEvent$8 = new PasskeyPromotionServiceBaseFragment$initObserveEvent$8(this.this$0, continuation);
        passkeyPromotionServiceBaseFragment$initObserveEvent$8.L$0 = obj;
        return passkeyPromotionServiceBaseFragment$initObserveEvent$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC5991aGs abstractC5991aGs, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseFragment$initObserveEvent$8) create(abstractC5991aGs, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.aHU.Activity.newInstance$default(o.aHU$Activity, java.lang.String, java.lang.String, int, java.lang.Object):o.aHU */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC5991aGs abstractC5991aGs = (AbstractC5991aGs) this.L$0;
            if (abstractC5991aGs instanceof AbstractC5991aGs.LoaderManager) {
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, this.this$0.getTAG() + " start fido2", 2, null);
                this.this$0.showLoadingAtOnce();
                this.this$0.AEQbTJ(((AbstractC5991aGs.LoaderManager) abstractC5991aGs).EZpvd());
            } else if (abstractC5991aGs instanceof AbstractC5991aGs.TaskDescription) {
                this.this$0.showLoadingAtOnce();
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, this.this$0.getTAG() + " start credential manager", 2, null);
                C6268aMD c6268aMD = this.this$0;
                CreatePublicKeyCredentialRequest createPublicKeyCredentialRequestEZpvd = ((AbstractC5991aGs.TaskDescription) abstractC5991aGs).EZpvd();
                this.label = 1;
                objAEQbTJ = c6268aMD.AEQbTJ(createPublicKeyCredentialRequestEZpvd, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else if (Intrinsics.EZpvd(abstractC5991aGs, AbstractC5991aGs.FragmentManager.EZpvd)) {
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, this.this$0.getTAG() + " unlock token expired", 2, null);
                this.this$0.AhwBna().fJNWhG();
            } else if (abstractC5991aGs instanceof AbstractC5991aGs.ActionBar) {
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, this.this$0.getTAG() + " cefi maximum reached", 2, null);
                C55326xho.toast$default(C33070mpX.AYXKKw(C8206ayP.Dialog.AxsJAY), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else if (abstractC5991aGs instanceof AbstractC5991aGs.StateListAnimator) {
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, this.this$0.getTAG() + " dex maximum reached", 2, null);
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null && (supportFragmentManager2 = activity.getSupportFragmentManager()) != null) {
                    final C6268aMD c6268aMD2 = this.this$0;
                    C6020aHU c6020aHUNewInstance$default = C6020aHU.Activity.newInstance$default(C6020aHU.Companion, ((AbstractC5991aGs.StateListAnimator) abstractC5991aGs).EZpvd(), null, 2, null);
                    c6020aHUNewInstance$default.KWHzl(new Function0() { // from class: o.aMQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return PasskeyPromotionServiceBaseFragment$initObserveEvent$8.invokeSuspend$lambda$3$lambda$2$lambda$0(c6268aMD2);
                        }
                    });
                    c6020aHUNewInstance$default.AEQbTJ(new Function0() { // from class: o.aMP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return Unit.INSTANCE;
                        }
                    });
                    c6020aHUNewInstance$default.show(supportFragmentManager2);
                }
            } else if (abstractC5991aGs instanceof AbstractC5991aGs.Application) {
                AbstractC5991aGs.Application application = (AbstractC5991aGs.Application) abstractC5991aGs;
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, this.this$0.getTAG() + " error: " + application.EZpvd(), 2, null);
                C55326xho.toast$default(application.EZpvd(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else if (Intrinsics.EZpvd(abstractC5991aGs, AbstractC5991aGs.Activity.EZpvd)) {
                C55326xho.toast$default("Account frozen", (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else {
                if (!Intrinsics.EZpvd(abstractC5991aGs, AbstractC5991aGs.PendingIntent.KWHzl)) {
                    throw new NoWhenBranchMatchedException();
                }
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, this.this$0.getTAG() + " unsupported algorithm", 2, null);
                FragmentActivity activity2 = this.this$0.getActivity();
                if (activity2 != null && (supportFragmentManager = activity2.getSupportFragmentManager()) != null) {
                    PasskeyScenario passkeyScenarioAuCTel = this.this$0.gEmmrt().AuCTel();
                    if (passkeyScenarioAuCTel instanceof PasskeyScenario.CedefiWallet) {
                        C6081aIc.Companion.AEQbTJ(((PasskeyScenario.CedefiWallet) passkeyScenarioAuCTel).EZpvd()).show(supportFragmentManager);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objAEQbTJ = obj;
        this.this$0.releaseLoading();
        this.this$0.AhwBna().copydefault((PasskeySdkResult) objAEQbTJ);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2$lambda$0(C6268aMD c6268aMD) {
        c6268aMD.gEmmrt().uzCIH();
        return Unit.INSTANCE;
    }
}
