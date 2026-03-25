package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jAO;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardViewModel$getLeaderBoardRowData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletAddress;
    Object L$0;
    int label;
    final /* synthetic */ LeaderBoardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardViewModel$getLeaderBoardRowData$3(LeaderBoardViewModel leaderBoardViewModel, String str, Continuation<? super LeaderBoardViewModel$getLeaderBoardRowData$3> continuation) {
        super(2, continuation);
        this.this$0 = leaderBoardViewModel;
        this.$walletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardViewModel$getLeaderBoardRowData$3(this.this$0, this.$walletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardViewModel$getLeaderBoardRowData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LeaderBoardViewModel leaderBoardViewModel;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LeaderBoardViewModel leaderBoardViewModel2 = this.this$0;
            jAO jao = leaderBoardViewModel2.ejfBZ;
            String str = this.$walletAddress;
            this.L$0 = leaderBoardViewModel2;
            this.label = 1;
            Object objAEQbTJ = jao.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            leaderBoardViewModel = leaderBoardViewModel2;
            objM7386unboximpl = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            leaderBoardViewModel = (LeaderBoardViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        leaderBoardViewModel.wlaJM = (List) objM7386unboximpl;
        return Unit.INSTANCE;
    }
}
