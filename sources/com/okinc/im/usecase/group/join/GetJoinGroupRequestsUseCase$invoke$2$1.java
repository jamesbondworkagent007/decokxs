package com.okinc.im.usecase.group.join;

import com.okinc.okimcore.model.remote.ListGroupJoinApplicationsRequest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDJ;
import o.sIR;
import o.sOM;

/* JADX INFO: loaded from: classes8.dex */
public final class GetJoinGroupRequestsUseCase$invoke$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super oDJ.Application.StateListAnimator>, Object> {
    final /* synthetic */ ListGroupJoinApplicationsRequest $request;
    final /* synthetic */ oDJ $this_runCatching;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetJoinGroupRequestsUseCase$invoke$2$1(oDJ odj, ListGroupJoinApplicationsRequest listGroupJoinApplicationsRequest, Continuation<? super GetJoinGroupRequestsUseCase$invoke$2$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = odj;
        this.$request = listGroupJoinApplicationsRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetJoinGroupRequestsUseCase$invoke$2$1(this.$this_runCatching, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super oDJ.Application.StateListAnimator> continuation) {
        return ((GetJoinGroupRequestsUseCase$invoke$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sir = this.$this_runCatching.EZpvd;
            ListGroupJoinApplicationsRequest listGroupJoinApplicationsRequest = this.$request;
            this.label = 1;
            obj = sir.KWHzl(listGroupJoinApplicationsRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return (oDJ.Application.StateListAnimator) obj;
            }
            C56391yDq.AEQbTJ(obj);
        }
        sOM som = (sOM) obj;
        if (som instanceof sOM.StateListAnimator) {
            this.label = 2;
            obj = this.$this_runCatching.copydefault((sOM.StateListAnimator) som, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return (oDJ.Application.StateListAnimator) obj;
        }
        if (!(som instanceof sOM.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        throw ((sOM.ActionBar) som).copydefault();
    }
}
