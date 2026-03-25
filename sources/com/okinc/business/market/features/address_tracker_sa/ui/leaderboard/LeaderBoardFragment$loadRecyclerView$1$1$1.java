package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardFragment$loadRecyclerView$1$1$1;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.gKN;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardFragment$loadRecyclerView$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFollowed;
    final /* synthetic */ LeaderBoardCardUIModel $item;
    int label;
    final /* synthetic */ LeaderBoardFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardFragment$loadRecyclerView$1$1$1(LeaderBoardFragment leaderBoardFragment, LeaderBoardCardUIModel leaderBoardCardUIModel, boolean z, Continuation<? super LeaderBoardFragment$loadRecyclerView$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = leaderBoardFragment;
        this.$item = leaderBoardCardUIModel;
        this.$isFollowed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardFragment$loadRecyclerView$1$1$1(this.this$0, this.$item, this.$isFollowed, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardFragment$loadRecyclerView$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gKN gknAhwBna = this.this$0.AhwBna();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            String walletAddress = this.$item.getWalletAddress();
            boolean z = this.$isFollowed;
            final LeaderBoardFragment leaderBoardFragment = this.this$0;
            final LeaderBoardCardUIModel leaderBoardCardUIModel = this.$item;
            Function1<? super Boolean, Unit> function1 = new Function1() { // from class: o.jCS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return LeaderBoardFragment$loadRecyclerView$1$1$1.invokeSuspend$lambda$0(leaderBoardFragment, leaderBoardCardUIModel, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            this.label = 1;
            if (gknAhwBna.KWHzl(contextRequireContext, childFragmentManager, walletAddress, z, function1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(LeaderBoardFragment leaderBoardFragment, LeaderBoardCardUIModel leaderBoardCardUIModel, boolean z) {
        leaderBoardFragment.djBIcL().EZpvd(leaderBoardCardUIModel.getWalletAddress(), z);
        return Unit.INSTANCE;
    }
}
