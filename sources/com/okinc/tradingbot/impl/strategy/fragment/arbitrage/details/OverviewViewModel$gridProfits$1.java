package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryVO;
import com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryVO;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class OverviewViewModel$gridProfits$1 extends SuspendLambda implements yHO<vNB<? extends GridReinvestedProfitsQueryVO>, vNB<? extends GridWithdrawnProfitsQueryVO>, Continuation<? super vNB<? extends OverviewViewModel.TaskDescription>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OverviewViewModel$gridProfits$1(Continuation<? super OverviewViewModel$gridProfits$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends GridReinvestedProfitsQueryVO> vnb, vNB<? extends GridWithdrawnProfitsQueryVO> vnb2, Continuation<? super vNB<? extends OverviewViewModel.TaskDescription>> continuation) {
        return invoke2((vNB<GridReinvestedProfitsQueryVO>) vnb, (vNB<GridWithdrawnProfitsQueryVO>) vnb2, (Continuation<? super vNB<OverviewViewModel.TaskDescription>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<GridReinvestedProfitsQueryVO> vnb, vNB<GridWithdrawnProfitsQueryVO> vnb2, Continuation<? super vNB<OverviewViewModel.TaskDescription>> continuation) {
        OverviewViewModel$gridProfits$1 overviewViewModel$gridProfits$1 = new OverviewViewModel$gridProfits$1(continuation);
        overviewViewModel$gridProfits$1.L$0 = vnb;
        overviewViewModel$gridProfits$1.L$1 = vnb2;
        return overviewViewModel$gridProfits$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            Object taskDescription = (vNB) this.L$1;
            if ((vnb instanceof vNB.TaskDescription) && (taskDescription instanceof vNB.TaskDescription)) {
                taskDescription = new vNB.TaskDescription(OverviewViewModel.TaskDescription.OLrzqt(OverviewViewModel.TaskDescription.OLrzqt((GridReinvestedProfitsQueryVO) ((vNB.TaskDescription) vnb).AEQbTJ(), (GridWithdrawnProfitsQueryVO) ((vNB.TaskDescription) taskDescription).AEQbTJ())));
            } else {
                if (vnb instanceof vNB.StateListAnimator) {
                    return vnb;
                }
                if (!(taskDescription instanceof vNB.StateListAnimator)) {
                    return vNB.Activity.copydefault;
                }
            }
            return taskDescription;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
