package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.common.constants.RankingSortType;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25702jDe;
import o.C56391yDq;
import o.C56442yFn;
import o.jBD;
import o.jBN;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardViewModel$onSortTypeSelection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $filterReset;
    final /* synthetic */ LeaderBoardSortModel $sortModel;
    Object L$0;
    int label;
    final /* synthetic */ LeaderBoardViewModel this$0;

    public final /* synthetic */ class ActionBar {
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
            try {
                iArr[RankingSortType.CATEGORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardViewModel$onSortTypeSelection$1(LeaderBoardSortModel leaderBoardSortModel, LeaderBoardViewModel leaderBoardViewModel, boolean z, Continuation<? super LeaderBoardViewModel$onSortTypeSelection$1> continuation) {
        super(2, continuation);
        this.$sortModel = leaderBoardSortModel;
        this.this$0 = leaderBoardViewModel;
        this.$filterReset = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardViewModel$onSortTypeSelection$1(this.$sortModel, this.this$0, this.$filterReset, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardViewModel$onSortTypeSelection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C25702jDe c25702jDe;
        C25702jDe c25702jDe2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int i2 = ActionBar.AEQbTJ[this.$sortModel.getType().ordinal()];
            if (i2 == 1) {
                LeaderBoardSortModel leaderBoardSortModelOLrzqt = this.this$0.AEQbTJ().getValue().OLrzqt();
                if (!Intrinsics.EZpvd((Object) this.$sortModel.getFilterLabel(), (Object) (leaderBoardSortModelOLrzqt != null ? leaderBoardSortModelOLrzqt.getFilterLabel() : null))) {
                    if (leaderBoardSortModelOLrzqt != null) {
                        LeaderBoardSortModel leaderBoardSortModel = this.$sortModel;
                        jBN jbn = jBN.copydefault;
                        jBN.trackLeaderboardPageClick$default(jbn, DexTrackEventParameter.LeaderBoardButtonName.TIME_WINDOW_FILTER, jbn.copydefault(leaderBoardSortModelOLrzqt.getFilterId()), jbn.copydefault(leaderBoardSortModel.getFilterId()), false, 8, null);
                    }
                    C25702jDe c25702jDeCopy$default = C25702jDe.copy$default((C25702jDe) this.this$0.copydefault.getValue(), null, false, null, null, this.$sortModel, null, 47, null);
                    jBD jbd = this.this$0.uzCIH;
                    LeaderBoardSortModel leaderBoardSortModel2 = this.$sortModel;
                    this.L$0 = c25702jDeCopy$default;
                    this.label = 1;
                    if (jbd.AEQbTJ(leaderBoardSortModel2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    c25702jDe = c25702jDeCopy$default;
                    this.this$0.copydefault.setValue(c25702jDe);
                    LeaderBoardViewModel.fetchBoardContent$default(this.this$0, false, !this.$filterReset, true, 1, null);
                }
            } else if (i2 == 2) {
                LeaderBoardSortModel leaderBoardSortModelEZpvd = this.this$0.AEQbTJ().getValue().EZpvd();
                if (!Intrinsics.EZpvd((Object) this.$sortModel.getFilterLabel(), (Object) (leaderBoardSortModelEZpvd != null ? leaderBoardSortModelEZpvd.getFilterLabel() : null))) {
                    if (leaderBoardSortModelEZpvd != null) {
                        LeaderBoardSortModel leaderBoardSortModel3 = this.$sortModel;
                        jBN jbn2 = jBN.copydefault;
                        jBN.trackLeaderboardPageClick$default(jbn2, DexTrackEventParameter.LeaderBoardButtonName.SORT_BY_FILTER, jbn2.AEQbTJ(leaderBoardSortModelEZpvd.getFilterId()), jbn2.AEQbTJ(leaderBoardSortModel3.getFilterId()), false, 8, null);
                    }
                    C25702jDe c25702jDeCopy$default2 = C25702jDe.copy$default((C25702jDe) this.this$0.copydefault.getValue(), null, false, null, this.$sortModel, null, null, 55, null);
                    jBD jbd2 = this.this$0.uzCIH;
                    LeaderBoardSortModel leaderBoardSortModel4 = this.$sortModel;
                    this.L$0 = c25702jDeCopy$default2;
                    this.label = 2;
                    if (jbd2.AEQbTJ(leaderBoardSortModel4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    c25702jDe2 = c25702jDeCopy$default2;
                    this.this$0.copydefault.setValue(c25702jDe2);
                    LeaderBoardViewModel.fetchBoardContent$default(this.this$0, false, !this.$filterReset, true, 1, null);
                }
            } else if (i2 == 3) {
                LeaderBoardSortModel leaderBoardSortModelAEQbTJ = this.this$0.AEQbTJ().getValue().AEQbTJ();
                if (!Intrinsics.EZpvd((Object) this.$sortModel.getFilterLabel(), (Object) (leaderBoardSortModelAEQbTJ != null ? leaderBoardSortModelAEQbTJ.getFilterLabel() : null))) {
                    if (leaderBoardSortModelAEQbTJ != null) {
                        jBN.trackLeaderboardPageClick$default(jBN.copydefault, DexTrackEventParameter.LeaderBoardButtonName.ADDRESS_SOURCES_FILTER, leaderBoardSortModelAEQbTJ.getFilterId(), this.$sortModel.getFilterId(), false, 8, null);
                    }
                    this.this$0.copydefault.setValue(C25702jDe.copy$default((C25702jDe) this.this$0.copydefault.getValue(), null, false, this.$sortModel, null, null, null, 59, null));
                    LeaderBoardViewModel.fetchBoardContent$default(this.this$0, false, !this.$filterReset, true, 1, null);
                }
            }
        } else if (i == 1) {
            c25702jDe = (C25702jDe) this.L$0;
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.setValue(c25702jDe);
            LeaderBoardViewModel.fetchBoardContent$default(this.this$0, false, !this.$filterReset, true, 1, null);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25702jDe2 = (C25702jDe) this.L$0;
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.setValue(c25702jDe2);
            LeaderBoardViewModel.fetchBoardContent$default(this.this$0, false, !this.$filterReset, true, 1, null);
        }
        return Unit.INSTANCE;
    }
}
