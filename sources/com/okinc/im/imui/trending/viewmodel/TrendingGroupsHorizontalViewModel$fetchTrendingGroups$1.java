package com.okinc.im.imui.trending.viewmodel;

import com.okinc.im.imui.trending.viewmodel.TrendingGroupsHorizontalViewModel;
import com.okinc.okimcore.model.remote.GroupRecommendations;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35775oDf;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nGS;

/* JADX INFO: loaded from: classes8.dex */
public final class TrendingGroupsHorizontalViewModel$fetchTrendingGroups$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadingShow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TrendingGroupsHorizontalViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingGroupsHorizontalViewModel$fetchTrendingGroups$1(TrendingGroupsHorizontalViewModel trendingGroupsHorizontalViewModel, boolean z, Continuation<? super TrendingGroupsHorizontalViewModel$fetchTrendingGroups$1> continuation) {
        super(2, continuation);
        this.this$0 = trendingGroupsHorizontalViewModel;
        this.$isLoadingShow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrendingGroupsHorizontalViewModel$fetchTrendingGroups$1 trendingGroupsHorizontalViewModel$fetchTrendingGroups$1 = new TrendingGroupsHorizontalViewModel$fetchTrendingGroups$1(this.this$0, this.$isLoadingShow, continuation);
        trendingGroupsHorizontalViewModel$fetchTrendingGroups$1.L$0 = obj;
        return trendingGroupsHorizontalViewModel$fetchTrendingGroups$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrendingGroupsHorizontalViewModel$fetchTrendingGroups$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        TrendingGroupsHorizontalViewModel trendingGroupsHorizontalViewModel;
        Object objM7386unboximpl;
        nGS ngs;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                trendingGroupsHorizontalViewModel = (TrendingGroupsHorizontalViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            } else {
                C56391yDq.AEQbTJ(obj);
                if (this.this$0.KWHzl() || this.$isLoadingShow) {
                    this.this$0.KWHzl.setValue(TrendingGroupsHorizontalViewModel.Application.Activity.EZpvd);
                    this.this$0.AEQbTJ(false);
                }
                TrendingGroupsHorizontalViewModel trendingGroupsHorizontalViewModel2 = this.this$0;
                Result.Application application = Result.Companion;
                boolean zKWHzl = trendingGroupsHorizontalViewModel2.OLrzqt.KWHzl();
                C35775oDf c35775oDf = trendingGroupsHorizontalViewModel2.EZpvd;
                Boolean boolKWHzl = C56443yFo.KWHzl(!zKWHzl);
                Integer numEZpvd = trendingGroupsHorizontalViewModel2.EZpvd();
                this.L$0 = trendingGroupsHorizontalViewModel2;
                this.label = 1;
                Object objOLrzqt = c35775oDf.OLrzqt(boolKWHzl, numEZpvd, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                trendingGroupsHorizontalViewModel = trendingGroupsHorizontalViewModel2;
                objM7386unboximpl = objOLrzqt;
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.KWHzl("Failed to fetch trending groups", thM7380exceptionOrNullimpl);
                trendingGroupsHorizontalViewModel.KWHzl.setValue(TrendingGroupsHorizontalViewModel.Application.StateListAnimator.KWHzl);
            } else {
                ArrayList arrayList = new ArrayList();
                for (GroupRecommendations groupRecommendations : (List) objM7386unboximpl) {
                    if (groupRecommendations.getGroupId() == null || groupRecommendations.getGroupName() == null) {
                        ngs = null;
                    } else {
                        Long groupId = groupRecommendations.getGroupId();
                        long jLongValue = groupId != null ? groupId.longValue() : 0L;
                        String groupName = groupRecommendations.getGroupName();
                        String str = groupName == null ? "" : groupName;
                        Integer memberCount = groupRecommendations.getMemberCount();
                        int iIntValue = memberCount != null ? memberCount.intValue() : 0;
                        String groupDescription = groupRecommendations.getGroupDescription();
                        String str2 = groupDescription == null ? "" : groupDescription;
                        String groupAvatar = groupRecommendations.getGroupAvatar();
                        Boolean boolIsPaidGroup = groupRecommendations.isPaidGroup();
                        boolean zBooleanValue = boolIsPaidGroup != null ? boolIsPaidGroup.booleanValue() : false;
                        Integer maxMemberCount = groupRecommendations.getMaxMemberCount();
                        String invitationId = groupRecommendations.getInvitationId();
                        Boolean boolIsOfficialGroup = groupRecommendations.isOfficialGroup();
                        ngs = new nGS(jLongValue, str, iIntValue, str2, groupAvatar, zBooleanValue, maxMemberCount, invitationId, boolIsOfficialGroup != null ? boolIsOfficialGroup.booleanValue() : false);
                    }
                    if (ngs != null) {
                        arrayList.add(ngs);
                    }
                }
                trendingGroupsHorizontalViewModel.KWHzl.setValue(arrayList.isEmpty() ? TrendingGroupsHorizontalViewModel.Application.TaskDescription.AEQbTJ : new TrendingGroupsHorizontalViewModel.Application.C0486Application(arrayList));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        TrendingGroupsHorizontalViewModel trendingGroupsHorizontalViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl2 != null) {
            C44124sEe.KWHzl("Failed to fetch trending groups", thM7380exceptionOrNullimpl2);
            trendingGroupsHorizontalViewModel3.KWHzl.setValue(TrendingGroupsHorizontalViewModel.Application.StateListAnimator.KWHzl);
        }
        return Unit.INSTANCE;
    }
}
