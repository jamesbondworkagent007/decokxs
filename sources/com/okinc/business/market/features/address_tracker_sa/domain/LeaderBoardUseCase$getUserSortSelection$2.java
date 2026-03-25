package com.okinc.business.market.features.address_tracker_sa.domain;

import com.okinc.business.market.common.constants.DurationType;
import com.okinc.business.market.common.constants.RankingSortType;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import com.okinc.core.util.SPUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jBD;
import o.jBL;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardUseCase$getUserSortSelection$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LeaderBoardSortModel>, Object> {
    final /* synthetic */ RankingSortType $type;
    Object L$0;
    int label;
    final /* synthetic */ jBD this$0;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardUseCase$getUserSortSelection$2(RankingSortType rankingSortType, jBD jbd, Continuation<? super LeaderBoardUseCase$getUserSortSelection$2> continuation) {
        super(2, continuation);
        this.$type = rankingSortType;
        this.this$0 = jbd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardUseCase$getUserSortSelection$2(this.$type, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LeaderBoardSortModel> continuation) {
        return ((LeaderBoardUseCase$getUserSortSelection$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LeaderBoardSortModel leaderBoardSortModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int i2 = StateListAnimator.OLrzqt[this.$type.ordinal()];
            Object obj2 = null;
            if (i2 == 1) {
                String string = SPUtils.getString("SP_KEY_LEADERBOARD_SORT_SELECTION_DURATION_LABEL", "");
                Intrinsics.copydefault((Object) string);
                if (string.length() != 0) {
                    Iterator<T> it = jBL.EZpvd.AEQbTJ().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.EZpvd((Object) ((LeaderBoardSortModel) next).getFilterId(), (Object) string)) {
                            obj2 = next;
                            break;
                        }
                    }
                    return (LeaderBoardSortModel) obj2;
                }
                for (LeaderBoardSortModel leaderBoardSortModel2 : jBL.EZpvd.AEQbTJ()) {
                    if (Intrinsics.EZpvd((Object) leaderBoardSortModel2.getFilterId(), (Object) DurationType.SEVEN_DAYS.getValue())) {
                        jBD jbd = this.this$0;
                        this.L$0 = leaderBoardSortModel2;
                        this.label = 1;
                        if (jbd.AEQbTJ(leaderBoardSortModel2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        leaderBoardSortModel = leaderBoardSortModel2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (i2 != 2) {
                return null;
            }
            String string2 = SPUtils.getString("SP_KEY_LEADERBOARD_SORT_SELECTION_RANKING_LABEL", "");
            Intrinsics.copydefault((Object) string2);
            if (string2.length() != 0) {
                Iterator<T> it2 = jBL.EZpvd.EZpvd().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.EZpvd((Object) ((LeaderBoardSortModel) next2).getFilterId(), (Object) string2)) {
                        obj2 = next2;
                        break;
                    }
                }
                return (LeaderBoardSortModel) obj2;
            }
            LeaderBoardSortModel leaderBoardSortModel3 = (LeaderBoardSortModel) CollectionsKt___CollectionsKt.AuCTelauCTel(jBL.EZpvd.EZpvd());
            jBD jbd2 = this.this$0;
            this.L$0 = leaderBoardSortModel3;
            this.label = 2;
            if (jbd2.AEQbTJ(leaderBoardSortModel3, this) == objCopydefault) {
                return objCopydefault;
            }
            leaderBoardSortModel = leaderBoardSortModel3;
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            leaderBoardSortModel = (LeaderBoardSortModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return leaderBoardSortModel;
    }
}
