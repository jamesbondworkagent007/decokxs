package com.okinc.business.market.features.address_tracker_sa.ui.filter;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC25705jDh;
import o.C25666jBw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardFilterViewModel$fetchFilterData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LeaderBoardFilterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardFilterViewModel$fetchFilterData$1(LeaderBoardFilterViewModel leaderBoardFilterViewModel, Continuation<? super LeaderBoardFilterViewModel$fetchFilterData$1> continuation) {
        super(2, continuation);
        this.this$0 = leaderBoardFilterViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardFilterViewModel$fetchFilterData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardFilterViewModel$fetchFilterData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object fragment;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25666jBw c25666jBw = this.this$0.AEQbTJ;
            this.label = 1;
            objKWHzl = c25666jBw.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        LeaderBoardFilterViewModel leaderBoardFilterViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            List list = (List) objKWHzl;
            MutableStateFlow mutableStateFlow = leaderBoardFilterViewModel.copydefault;
            if (list == null || list.isEmpty()) {
                fragment = AbstractC25705jDh.StateListAnimator.KWHzl;
            } else {
                fragment = new AbstractC25705jDh.Fragment(list);
            }
            mutableStateFlow.setValue(fragment);
        }
        LeaderBoardFilterViewModel leaderBoardFilterViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            leaderBoardFilterViewModel2.copydefault.setValue(AbstractC25705jDh.Activity.copydefault);
        }
        return Unit.INSTANCE;
    }
}
