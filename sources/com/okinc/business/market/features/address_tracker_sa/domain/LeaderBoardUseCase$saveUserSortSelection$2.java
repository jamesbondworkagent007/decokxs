package com.okinc.business.market.features.address_tracker_sa.domain;

import com.okinc.business.market.common.constants.RankingSortType;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardUseCase$saveUserSortSelection$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LeaderBoardSortModel $selection;
    int label;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RankingSortType.values().length];
            try {
                iArr[RankingSortType.DURATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RankingSortType.RANKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardUseCase$saveUserSortSelection$2(LeaderBoardSortModel leaderBoardSortModel, Continuation<? super LeaderBoardUseCase$saveUserSortSelection$2> continuation) {
        super(2, continuation);
        this.$selection = leaderBoardSortModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardUseCase$saveUserSortSelection$2(this.$selection, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardUseCase$saveUserSortSelection$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            int i = Application.AEQbTJ[this.$selection.getType().ordinal()];
            if (i == 1) {
                SPUtils.put("SP_KEY_LEADERBOARD_SORT_SELECTION_DURATION_LABEL", this.$selection.getFilterId());
            } else if (i == 2) {
                SPUtils.put("SP_KEY_LEADERBOARD_SORT_SELECTION_RANKING_LABEL", this.$selection.getFilterId());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
