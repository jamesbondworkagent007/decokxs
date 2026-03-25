package com.okinc.auth.impl.reset2fa.ui;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaPreconditionResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C6623aSo;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMfaViewModel$handleResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C6623aSo.StateListAnimator $preconditionResult;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ResetMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetMfaViewModel$handleResult$1(C6623aSo.StateListAnimator stateListAnimator, ResetMfaViewModel resetMfaViewModel, Continuation<? super ResetMfaViewModel$handleResult$1> continuation) {
        super(2, continuation);
        this.$preconditionResult = stateListAnimator;
        this.this$0 = resetMfaViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResetMfaViewModel$handleResult$1 resetMfaViewModel$handleResult$1 = new ResetMfaViewModel$handleResult$1(this.$preconditionResult, this.this$0, continuation);
        resetMfaViewModel$handleResult$1.L$0 = obj;
        return resetMfaViewModel$handleResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetMfaViewModel$handleResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C6623aSo.StateListAnimator stateListAnimator = this.$preconditionResult;
            if (stateListAnimator instanceof C6623aSo.StateListAnimator.ActionBar) {
                this.this$0.KWHzl.setValue(new C32989mnw(C56443yFo.KWHzl(false)));
                ResetMfaPreconditionResponse resetMfaPreconditionResponseOLrzqt = ((C6623aSo.StateListAnimator.ActionBar) this.$preconditionResult).OLrzqt();
                if (resetMfaPreconditionResponseOLrzqt != null) {
                    ResetMfaViewModel resetMfaViewModel = this.this$0;
                    resetMfaViewModel.gEmmrt = resetMfaPreconditionResponseOLrzqt;
                    resetMfaViewModel.fetchVPNInfo.setValue(new C32989mnw(Unit.INSTANCE));
                } else {
                    ResetMfaViewModel resetMfaViewModel2 = this.this$0;
                    resetMfaViewModel2.AEQbTJ.setValue(new C32989mnw(resetMfaViewModel2.DbNXlk(C8206ayP.Dialog.DPHNDa)));
                }
            } else if (stateListAnimator instanceof C6623aSo.StateListAnimator.TaskDescription) {
                this.this$0.KWHzl.setValue(new C32989mnw(C56443yFo.KWHzl(false)));
                MutableLiveData mutableLiveData = this.this$0.AEQbTJ;
                String strEZpvd = ((C6623aSo.StateListAnimator.TaskDescription) this.$preconditionResult).EZpvd();
                if (strEZpvd == null) {
                    strEZpvd = this.this$0.DbNXlk(C8206ayP.Dialog.DPHNDa);
                }
                mutableLiveData.setValue(new C32989mnw(strEZpvd));
            } else if (!Intrinsics.EZpvd(stateListAnimator, C6623aSo.StateListAnimator.Activity.copydefault)) {
                if (stateListAnimator instanceof C6623aSo.StateListAnimator.C0821StateListAnimator) {
                    this.this$0.KWHzl.setValue(new C32989mnw(C56443yFo.KWHzl(false)));
                    this.this$0.values.setValue(new C32989mnw(Unit.INSTANCE));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
