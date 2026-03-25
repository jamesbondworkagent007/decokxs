package com.okinc.auth.impl.passkey.ui.start;

import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyRegisterConfig;
import com.okinc.auth.api.passkey.PasskeyRegisterScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC6490aQN;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyStartForAssetWithdrawActivity$onCreate$1 extends SuspendLambda implements Function2<PasskeyStartForAssetWithdrawViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6490aQN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyStartForAssetWithdrawActivity$onCreate$1(ActivityC6490aQN activityC6490aQN, Continuation<? super PasskeyStartForAssetWithdrawActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC6490aQN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyStartForAssetWithdrawActivity$onCreate$1 passkeyStartForAssetWithdrawActivity$onCreate$1 = new PasskeyStartForAssetWithdrawActivity$onCreate$1(this.this$0, continuation);
        passkeyStartForAssetWithdrawActivity$onCreate$1.L$0 = obj;
        return passkeyStartForAssetWithdrawActivity$onCreate$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PasskeyStartForAssetWithdrawViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        return ((PasskeyStartForAssetWithdrawActivity$onCreate$1) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyStartForAssetWithdrawViewModel.ActionBar actionBar = (PasskeyStartForAssetWithdrawViewModel.ActionBar) this.L$0;
            if (actionBar instanceof PasskeyStartForAssetWithdrawViewModel.ActionBar.TaskDescription) {
                if (((PasskeyStartForAssetWithdrawViewModel.ActionBar.TaskDescription) actionBar).AEQbTJ()) {
                    this.this$0.showLoadingAtOnce();
                } else {
                    this.this$0.releaseLoading();
                }
            } else if (Intrinsics.EZpvd(actionBar, PasskeyStartForAssetWithdrawViewModel.ActionBar.C0240ActionBar.copydefault)) {
                pUU.KWHzl(this.this$0.getTAG(), "start authenticate passkey");
                this.this$0.valueOf.launch(new PasskeyAuthenticateScenarioRequest(new PasskeyScenario.Asset(false, 1, null), false, null, 2, null));
            } else if (Intrinsics.EZpvd(actionBar, PasskeyStartForAssetWithdrawViewModel.ActionBar.Application.copydefault)) {
                pUU.KWHzl(this.this$0.getTAG(), "start register passkey");
                this.this$0.gEmmrt.launch(new PasskeyRegisterScenarioRequest(new PasskeyScenario.Asset(false), new PasskeyRegisterConfig(true, null, null, null, null, false, false, 62, null)));
            } else if (actionBar instanceof PasskeyStartForAssetWithdrawViewModel.ActionBar.StateListAnimator) {
                this.this$0.EZpvd(((PasskeyStartForAssetWithdrawViewModel.ActionBar.StateListAnimator) actionBar).AEQbTJ());
            } else if (actionBar instanceof PasskeyStartForAssetWithdrawViewModel.ActionBar.Activity) {
                this.this$0.copydefault(((PasskeyStartForAssetWithdrawViewModel.ActionBar.Activity) actionBar).OLrzqt());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
