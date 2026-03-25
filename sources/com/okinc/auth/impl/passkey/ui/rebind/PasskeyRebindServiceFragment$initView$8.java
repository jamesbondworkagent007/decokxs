package com.okinc.auth.impl.passkey.ui.rebind;

import android.graphics.drawable.Drawable;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.auth.api.passkey.PasskeyRebindState;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5991aGs;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C5922aFc;
import o.C6081aIc;
import o.C6254aLq;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRebindServiceFragment$initView$8 extends SuspendLambda implements Function2<AbstractC5991aGs, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6254aLq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindServiceFragment$initView$8(C6254aLq c6254aLq, Continuation<? super PasskeyRebindServiceFragment$initView$8> continuation) {
        super(2, continuation);
        this.this$0 = c6254aLq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyRebindServiceFragment$initView$8 passkeyRebindServiceFragment$initView$8 = new PasskeyRebindServiceFragment$initView$8(this.this$0, continuation);
        passkeyRebindServiceFragment$initView$8.L$0 = obj;
        return passkeyRebindServiceFragment$initView$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC5991aGs abstractC5991aGs, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceFragment$initView$8) create(abstractC5991aGs, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentManager supportFragmentManager;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC5991aGs abstractC5991aGs = (AbstractC5991aGs) this.L$0;
            if (abstractC5991aGs instanceof AbstractC5991aGs.LoaderManager) {
                C5922aFc.log$default(C5922aFc.KWHzl, "[REBIND]", null, "start fido2", 2, null);
                this.this$0.showLoadingAtOnce();
                this.this$0.AEQbTJ(((AbstractC5991aGs.LoaderManager) abstractC5991aGs).EZpvd());
            } else if (abstractC5991aGs instanceof AbstractC5991aGs.TaskDescription) {
                this.this$0.showLoadingAtOnce();
                C5922aFc.log$default(C5922aFc.KWHzl, "[REBIND]", null, "start credential manager", 2, null);
                C6254aLq c6254aLq = this.this$0;
                CreatePublicKeyCredentialRequest createPublicKeyCredentialRequestEZpvd = ((AbstractC5991aGs.TaskDescription) abstractC5991aGs).EZpvd();
                this.label = 1;
                objAEQbTJ = c6254aLq.AEQbTJ(createPublicKeyCredentialRequestEZpvd, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else if (Intrinsics.EZpvd(abstractC5991aGs, AbstractC5991aGs.FragmentManager.EZpvd)) {
                C5922aFc.log$default(C5922aFc.KWHzl, "[REBIND]", null, "unlock token expired", 2, null);
                this.this$0.copydefault(PasskeyRebindState.TokenExpired.copydefault);
            } else if (abstractC5991aGs instanceof AbstractC5991aGs.ActionBar) {
                C55326xho.toast$default(C33070mpX.AYXKKw(C8206ayP.Dialog.AxsJAY), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else if (!(abstractC5991aGs instanceof AbstractC5991aGs.StateListAnimator)) {
                if (abstractC5991aGs instanceof AbstractC5991aGs.Application) {
                    AbstractC5991aGs.Application application = (AbstractC5991aGs.Application) abstractC5991aGs;
                    C5922aFc.log$default(C5922aFc.KWHzl, "[REBIND]", null, "error: " + application.EZpvd(), 2, null);
                    C55326xho.toast$default(application.EZpvd(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                } else if (Intrinsics.EZpvd(abstractC5991aGs, AbstractC5991aGs.Activity.EZpvd)) {
                    C55326xho.toast$default("account frozen", (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                } else {
                    if (!Intrinsics.EZpvd(abstractC5991aGs, AbstractC5991aGs.PendingIntent.KWHzl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C5922aFc.log$default(C5922aFc.KWHzl, "[REBIND]", null, "unsupported algorithm", 2, null);
                    FragmentActivity activity = this.this$0.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        C6081aIc.TaskDescription.newInstance$default(C6081aIc.Companion, null, 1, null).show(supportFragmentManager);
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
        this.this$0.isConnected().OLrzqt((PasskeySdkResult) objAEQbTJ, this.this$0.AhwBna());
        return Unit.INSTANCE;
    }
}
