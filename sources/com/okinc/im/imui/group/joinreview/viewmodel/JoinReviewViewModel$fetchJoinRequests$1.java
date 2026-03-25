package com.okinc.im.imui.group.joinreview.viewmodel;

import com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel;
import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nUK;
import o.oDJ;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinReviewViewModel$fetchJoinRequests$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fromApplicationId;
    int label;
    final /* synthetic */ JoinReviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinReviewViewModel$fetchJoinRequests$1(JoinReviewViewModel joinReviewViewModel, String str, Continuation<? super JoinReviewViewModel$fetchJoinRequests$1> continuation) {
        super(2, continuation);
        this.this$0 = joinReviewViewModel;
        this.$fromApplicationId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinReviewViewModel$fetchJoinRequests$1(this.this$0, this.$fromApplicationId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinReviewViewModel$fetchJoinRequests$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        MutableSharedFlow mutableSharedFlow;
        JoinReviewViewModel.ActionBar.StateListAnimator stateListAnimator;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oDJ odj = this.this$0.AYXKKw;
            long jFetchVPNInfo = this.this$0.fetchVPNInfo();
            String str = this.$fromApplicationId;
            this.label = 1;
            objCopydefault = odj.copydefault(jFetchVPNInfo, (12 & 2) != 0 ? null : str, (12 & 4) != 0 ? GroupApplicationStatus.PENDING : null, (12 & 8) != 0 ? null : null, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.AEQbTJ;
                stateListAnimator = JoinReviewViewModel.ActionBar.StateListAnimator.AEQbTJ;
                this.label = 3;
                if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        oDJ.Application application = (oDJ.Application) objCopydefault;
        if (application instanceof oDJ.Application.StateListAnimator) {
            oDJ.Application.StateListAnimator stateListAnimator2 = (oDJ.Application.StateListAnimator) application;
            this.this$0.djBIcL.set("KEY_REQUEST_LIST", nUK.EZpvd(this.this$0.ejfBZ(), stateListAnimator2.copydefault()));
            this.this$0.djBIcL.set("KEY_REQUEST_FULL_TOTAL", C56443yFo.AEQbTJ(stateListAnimator2.KWHzl()));
            MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
            JoinReviewViewModel.Application applicationDjBIcL = this.this$0.djBIcL();
            this.label = 2;
            if (mutableStateFlow.emit(applicationDjBIcL, this) == objCopydefault2) {
                return objCopydefault2;
            }
            mutableSharedFlow = this.this$0.AEQbTJ;
            stateListAnimator = JoinReviewViewModel.ActionBar.StateListAnimator.AEQbTJ;
            this.label = 3;
            if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault2) {
            }
            return Unit.INSTANCE;
        }
        if (!(application instanceof oDJ.Application.C0899Application)) {
            throw new NoWhenBranchMatchedException();
        }
        JoinReviewViewModel joinReviewViewModel = this.this$0;
        Throwable thAEQbTJ = ((oDJ.Application.C0899Application) application).AEQbTJ();
        this.label = 4;
        if (joinReviewViewModel.EZpvd(thAEQbTJ, this) == objCopydefault2) {
            return objCopydefault2;
        }
        return Unit.INSTANCE;
    }
}
