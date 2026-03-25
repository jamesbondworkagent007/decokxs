package com.okinc.tradingbot.impl.strategy.fragment.list_common;

import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsListViewModel$borrowInterest$1 extends SuspendLambda implements yHO<vNB<? extends List<? extends BillsArchive>>, vNB<? extends InterestInfoResponse>, Continuation<? super vNB<? extends Pair<? extends List<? extends BillsArchive>, ? extends InterestInfoResponse>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsListViewModel$borrowInterest$1(Continuation<? super TacticsListViewModel$borrowInterest$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends List<? extends BillsArchive>> vnb, vNB<? extends InterestInfoResponse> vnb2, Continuation<? super vNB<? extends Pair<? extends List<? extends BillsArchive>, ? extends InterestInfoResponse>>> continuation) {
        return invoke2((vNB<? extends List<BillsArchive>>) vnb, (vNB<InterestInfoResponse>) vnb2, (Continuation<? super vNB<? extends Pair<? extends List<BillsArchive>, InterestInfoResponse>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<? extends List<BillsArchive>> vnb, vNB<InterestInfoResponse> vnb2, Continuation<? super vNB<? extends Pair<? extends List<BillsArchive>, InterestInfoResponse>>> continuation) {
        TacticsListViewModel$borrowInterest$1 tacticsListViewModel$borrowInterest$1 = new TacticsListViewModel$borrowInterest$1(continuation);
        tacticsListViewModel$borrowInterest$1.L$0 = vnb;
        tacticsListViewModel$borrowInterest$1.L$1 = vnb2;
        return tacticsListViewModel$borrowInterest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            vNB vnb2 = (vNB) this.L$1;
            return ((vnb instanceof vNB.TaskDescription) && (vnb2 instanceof vNB.TaskDescription)) ? new vNB.TaskDescription(C56390yDp.OLrzqt(((vNB.TaskDescription) vnb).AEQbTJ(), ((vNB.TaskDescription) vnb2).AEQbTJ())) : vnb instanceof vNB.StateListAnimator ? vnb : vnb2 instanceof vNB.StateListAnimator ? vnb2 : vNB.Activity.copydefault;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
