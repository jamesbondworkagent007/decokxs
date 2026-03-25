package com.okinc.business.market.features.address_tracker_sa.ui.recommendation;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardContentUIModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25667jBx;
import o.C25718jDu;
import o.C27634jyr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.jBB;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class AddressTrackerRecommendationViewModel$loadLeaderBoardData$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<jBB> $boardData;
    final /* synthetic */ Ref.ObjectRef<List<MarketChainBean>> $chainList;
    final /* synthetic */ List<Job> $jobList;
    final /* synthetic */ int $startingPosition;
    int label;
    final /* synthetic */ AddressTrackerRecommendationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressTrackerRecommendationViewModel$loadLeaderBoardData$4(List<Job> list, AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModel, Ref.ObjectRef<jBB> objectRef, Ref.ObjectRef<List<MarketChainBean>> objectRef2, int i, Continuation<? super AddressTrackerRecommendationViewModel$loadLeaderBoardData$4> continuation) {
        super(2, continuation);
        this.$jobList = list;
        this.this$0 = addressTrackerRecommendationViewModel;
        this.$boardData = objectRef;
        this.$chainList = objectRef2;
        this.$startingPosition = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressTrackerRecommendationViewModel$loadLeaderBoardData$4(this.$jobList, this.this$0, this.$boardData, this.$chainList, this.$startingPosition, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressTrackerRecommendationViewModel$loadLeaderBoardData$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object emojiAddressMapping$default;
        LeaderBoardContentUIModel leaderBoardContentUIModelEZpvd;
        List<LeaderBoardCardUIModel> listAhwBna;
        Object value;
        Object value2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<Job> list = this.$jobList;
            this.label = 1;
            if (AwaitKt.joinAll(list, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                emojiAddressMapping$default = obj;
                Map map = (Map) emojiAddressMapping$default;
                jBB jbb = this.$boardData.element;
                leaderBoardContentUIModelEZpvd = jbb != null ? C25667jBx.EZpvd(jbb, this.$chainList.element, null, null, map, false) : null;
                if (leaderBoardContentUIModelEZpvd != null || (listAhwBna = leaderBoardContentUIModelEZpvd.getLeaderBoardCardUIModel()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                if (!listAhwBna.isEmpty()) {
                    MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                    AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModel = this.this$0;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, addressTrackerRecommendationViewModel.AhwBna.AEQbTJ((C25718jDu) value)));
                } else {
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
                    for (LeaderBoardCardUIModel leaderBoardCardUIModel : listAhwBna) {
                        arrayList.add(leaderBoardCardUIModel.copy((8388351 & 1) != 0 ? leaderBoardCardUIModel.id : null, (8388351 & 2) != 0 ? leaderBoardCardUIModel.walletAddress : null, (8388351 & 4) != 0 ? leaderBoardCardUIModel.walletLogoUrl : null, (8388351 & 8) != 0 ? leaderBoardCardUIModel.kolTwitterLink : null, (8388351 & 16) != 0 ? leaderBoardCardUIModel.addressAlias : null, (8388351 & 32) != 0 ? leaderBoardCardUIModel.accountName : null, (8388351 & 64) != 0 ? leaderBoardCardUIModel.isBookmarked : false, (8388351 & 128) != 0 ? leaderBoardCardUIModel.type : LeaderBoardCardUIModel.RECOMMENDATION_TYPE, (8388351 & 256) != 0 ? leaderBoardCardUIModel.isSelected : true, (8388351 & 512) != 0 ? leaderBoardCardUIModel.chartItems : null, (8388351 & 1024) != 0 ? leaderBoardCardUIModel.chainId : null, (8388351 & 2048) != 0 ? leaderBoardCardUIModel.chainLogoUrl : null, (8388351 & 4096) != 0 ? leaderBoardCardUIModel.tokenPrice : null, (8388351 & 8192) != 0 ? leaderBoardCardUIModel.tokenBalance : null, (8388351 & 16384) != 0 ? leaderBoardCardUIModel.pnlAmount : null, (8388351 & 32768) != 0 ? leaderBoardCardUIModel.roiPercentage : null, (8388351 & 65536) != 0 ? leaderBoardCardUIModel.winRatePercentage : null, (8388351 & 131072) != 0 ? leaderBoardCardUIModel.winLossToken : null, (8388351 & 262144) != 0 ? leaderBoardCardUIModel.transactions : 0, (8388351 & 524288) != 0 ? leaderBoardCardUIModel.lastTime : null, (8388351 & 1048576) != 0 ? leaderBoardCardUIModel.periodType : null, (8388351 & 2097152) != 0 ? leaderBoardCardUIModel.emoji : null, (8388351 & 4194304) != 0 ? leaderBoardCardUIModel.addressDisplayColorHex : null));
                    }
                    MutableStateFlow mutableStateFlow2 = this.this$0.OLrzqt;
                    AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModel2 = this.this$0;
                    int i2 = this.$startingPosition;
                    do {
                        value2 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value2, addressTrackerRecommendationViewModel2.AhwBna.EZpvd(i2, arrayList)));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C27634jyr c27634jyr = this.this$0.AEQbTJ;
        this.label = 2;
        emojiAddressMapping$default = C27634jyr.getEmojiAddressMapping$default(c27634jyr, false, this, 1, null);
        if (emojiAddressMapping$default == objCopydefault) {
            return objCopydefault;
        }
        Map map2 = (Map) emojiAddressMapping$default;
        jBB jbb2 = this.$boardData.element;
        if (jbb2 != null) {
        }
        if (leaderBoardContentUIModelEZpvd != null) {
            listAhwBna = yDY.AhwBna();
        }
        if (!listAhwBna.isEmpty()) {
        }
        return Unit.INSTANCE;
    }
}
