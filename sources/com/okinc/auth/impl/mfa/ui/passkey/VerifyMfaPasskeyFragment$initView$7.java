package com.okinc.auth.impl.mfa.ui.passkey;

import androidx.credentials.GetPublicKeyCredentialOption;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C5767aCg;
import o.C5790aDC;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaPasskeyFragment$initView$7 extends SuspendLambda implements Function2<C5767aCg.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5790aDC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyFragment$initView$7(C5790aDC c5790aDC, Continuation<? super VerifyMfaPasskeyFragment$initView$7> continuation) {
        super(2, continuation);
        this.this$0 = c5790aDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaPasskeyFragment$initView$7 verifyMfaPasskeyFragment$initView$7 = new VerifyMfaPasskeyFragment$initView$7(this.this$0, continuation);
        verifyMfaPasskeyFragment$initView$7.L$0 = obj;
        return verifyMfaPasskeyFragment$initView$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C5767aCg.ActionBar actionBar, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyFragment$initView$7) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5767aCg.ActionBar actionBar = (C5767aCg.ActionBar) this.L$0;
            if (actionBar instanceof C5767aCg.ActionBar.FragmentManager) {
                this.this$0.showLoadingAtOnce();
                this.this$0.EZpvd(((C5767aCg.ActionBar.FragmentManager) actionBar).AEQbTJ());
                Unit unit = Unit.INSTANCE;
            } else if (actionBar instanceof C5767aCg.ActionBar.LoaderManager) {
                this.this$0.showLoadingAtOnce();
                C5790aDC c5790aDC = this.this$0;
                GetPublicKeyCredentialOption getPublicKeyCredentialOptionKWHzl = ((C5767aCg.ActionBar.LoaderManager) actionBar).KWHzl();
                this.label = 1;
                obj = c5790aDC.EZpvd(getPublicKeyCredentialOptionKWHzl, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else if (actionBar instanceof C5767aCg.ActionBar.StateListAnimator) {
                this.this$0.ejfBZ().EZpvd(((C5767aCg.ActionBar.StateListAnimator) actionBar).EZpvd());
            } else if (Intrinsics.EZpvd(actionBar, C5767aCg.ActionBar.Application.OLrzqt)) {
                this.this$0.DbNXlk();
                Unit unit2 = Unit.INSTANCE;
            } else if (Intrinsics.EZpvd(actionBar, C5767aCg.ActionBar.TaskDescription.KWHzl)) {
                this.this$0.fetchVPNInfo().getNewProxyInstance();
            } else if (actionBar instanceof C5767aCg.ActionBar.Activity) {
                VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModelFetchVPNInfo = this.this$0.fetchVPNInfo();
                C5790aDC c5790aDC2 = this.this$0;
                verifyMfaPasskeyViewModelFetchVPNInfo.OLrzqt(c5790aDC2, c5790aDC2.ejfBZ().DbNXlk());
            } else if (actionBar instanceof C5767aCg.ActionBar.PendingIntent) {
                VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModelFetchVPNInfo2 = this.this$0.fetchVPNInfo();
                C5790aDC c5790aDC3 = this.this$0;
                verifyMfaPasskeyViewModelFetchVPNInfo2.OLrzqt(c5790aDC3, c5790aDC3.ejfBZ().DbNXlk());
            } else if (Intrinsics.EZpvd(actionBar, C5767aCg.ActionBar.C0814ActionBar.KWHzl)) {
                this.this$0.fetchVPNInfo().getNewProxyInstance();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        this.this$0.releaseLoading();
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModelFetchVPNInfo3 = this.this$0.fetchVPNInfo();
        C5790aDC c5790aDC4 = this.this$0;
        verifyMfaPasskeyViewModelFetchVPNInfo3.EZpvd((PasskeySdkResult) obj, c5790aDC4, c5790aDC4.ejfBZ().DbNXlk());
        return Unit.INSTANCE;
    }
}
