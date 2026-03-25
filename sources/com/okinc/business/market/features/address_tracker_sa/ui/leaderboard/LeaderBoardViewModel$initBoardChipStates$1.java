package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardViewModel$initBoardChipStates$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LeaderBoardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardViewModel$initBoardChipStates$1(LeaderBoardViewModel leaderBoardViewModel, Continuation<? super LeaderBoardViewModel$initBoardChipStates$1> continuation) {
        super(continuation);
        this.this$0 = leaderBoardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((List<MarketChainBean>) null, (Continuation<? super Unit>) this);
    }
}
