package com.okinc.im.usecase.group.join;

import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import com.okinc.okimcore.model.remote.GroupJoinApplicationIdsRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDS;
import o.sIR;
import o.sOA;
import o.sOE;

/* JADX INFO: loaded from: classes8.dex */
public final class UpdateJoinGroupReviewsUseCase$invoke$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super oDS.Activity.StateListAnimator>, Object> {
    final /* synthetic */ boolean $isApproved;
    final /* synthetic */ GroupJoinApplicationIdsRequest $request;
    final /* synthetic */ oDS $this_runCatching;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateJoinGroupReviewsUseCase$invoke$2$1(boolean z, oDS ods, GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest, Continuation<? super UpdateJoinGroupReviewsUseCase$invoke$2$1> continuation) {
        super(2, continuation);
        this.$isApproved = z;
        this.$this_runCatching = ods;
        this.$request = groupJoinApplicationIdsRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateJoinGroupReviewsUseCase$invoke$2$1(this.$isApproved, this.$this_runCatching, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super oDS.Activity.StateListAnimator> continuation) {
        return ((UpdateJoinGroupReviewsUseCase$invoke$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sOE soe;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isApproved) {
                sIR sir = this.$this_runCatching.AEQbTJ;
                GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest = this.$request;
                this.label = 1;
                obj = sir.OLrzqt(groupJoinApplicationIdsRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                soe = (sOE) obj;
            } else {
                sIR sir2 = this.$this_runCatching.AEQbTJ;
                GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest2 = this.$request;
                this.label = 2;
                obj = sir2.KWHzl(groupJoinApplicationIdsRequest2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                soe = (sOE) obj;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            soe = (sOE) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            soe = (sOE) obj;
        }
        if (soe instanceof sOE.StateListAnimator) {
            sOE.StateListAnimator stateListAnimator = (sOE.StateListAnimator) soe;
            List<sOA.Application> listOLrzqt = stateListAnimator.OLrzqt();
            ArrayList arrayList = new ArrayList();
            for (sOA.Application application : listOLrzqt) {
                String strKWHzl = application.KWHzl();
                if (strKWHzl == null || application.EZpvd() == GroupApplicationStatus.PENDING) {
                    strKWHzl = null;
                }
                if (strKWHzl != null) {
                    arrayList.add(strKWHzl);
                }
            }
            return new oDS.Activity.StateListAnimator(arrayList, !stateListAnimator.EZpvd().isEmpty(), stateListAnimator.EZpvd());
        }
        if (!(soe instanceof sOE.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        throw ((sOE.Application) soe).KWHzl();
    }
}
