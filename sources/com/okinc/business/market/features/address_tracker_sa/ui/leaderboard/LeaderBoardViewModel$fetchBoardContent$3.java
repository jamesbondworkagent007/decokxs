package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardContentUIModel;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC25708jDk;
import o.C25706jDi;
import o.C56391yDq;
import o.C56442yFn;
import o.jBH;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardViewModel$fetchBoardContent$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isBySelectionOrFilter;
    final /* synthetic */ boolean $isFirstPage;
    final /* synthetic */ boolean $isPullToRefresh;
    Object L$0;
    int label;
    final /* synthetic */ LeaderBoardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardViewModel$fetchBoardContent$3(boolean z, boolean z2, LeaderBoardViewModel leaderBoardViewModel, boolean z3, Continuation<? super LeaderBoardViewModel$fetchBoardContent$3> continuation) {
        super(2, continuation);
        this.$isFirstPage = z;
        this.$isPullToRefresh = z2;
        this.this$0 = leaderBoardViewModel;
        this.$isBySelectionOrFilter = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardViewModel$fetchBoardContent$3(this.$isFirstPage, this.$isPullToRefresh, this.this$0, this.$isBySelectionOrFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardViewModel$fetchBoardContent$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C25706jDi c25706jDi;
        jBH jbh;
        Object objAEQbTJ;
        Object objAEQbTJ2;
        LeaderBoardContentUIModel leaderBoardContentUIModel;
        List<LeaderBoardCardUIModel> listAhwBna;
        List<LeaderBoardCardUIModel> listAhwBna2;
        List<LeaderBoardCardUIModel> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isFirstPage) {
                c25706jDi = new C25706jDi(false, !this.$isPullToRefresh, false, null, 13, null);
            } else {
                c25706jDi = new C25706jDi(false, false, true, null, 11, null);
            }
            this.this$0.AEQbTJ.setValue(c25706jDi);
            jbh = new jBH(this.this$0.AEQbTJ().getValue().copydefault(), this.this$0.AEQbTJ().getValue().AEQbTJ(), this.this$0.AEQbTJ().getValue().EZpvd(), this.this$0.AEQbTJ().getValue().OLrzqt(), this.this$0.AYXKKw, this.this$0.iwGUEr);
            LeaderBoardViewModel leaderBoardViewModel = this.this$0;
            this.L$0 = jbh;
            this.label = 1;
            objAEQbTJ = leaderBoardViewModel.AEQbTJ((Continuation<? super String>) this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ2 = obj;
                leaderBoardContentUIModel = (LeaderBoardContentUIModel) objAEQbTJ2;
                if (leaderBoardContentUIModel != null || (listAhwBna = leaderBoardContentUIModel.getLeaderBoardCardUIModel()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                if (!this.$isFirstPage) {
                    AbstractC25708jDk value = this.this$0.valueOf().getValue();
                    AbstractC25708jDk.ActionBar actionBar = value instanceof AbstractC25708jDk.ActionBar ? (AbstractC25708jDk.ActionBar) value : null;
                    if (actionBar == null || (listAhwBna2 = actionBar.OLrzqt()) == null) {
                        listAhwBna2 = yDY.AhwBna();
                    }
                    listAhwBna = CollectionsKt___CollectionsKt.djBIcL((Collection) listAhwBna2, (Iterable) listAhwBna);
                }
                list = listAhwBna;
                if (!list.isEmpty() && this.$isBySelectionOrFilter) {
                    this.this$0.KWHzl.setValue(new AbstractC25708jDk.Activity());
                    this.this$0.AEQbTJ.setValue(new C25706jDi(false, false, false, new Exception(), 7, null));
                } else if (!list.isEmpty()) {
                    this.this$0.KWHzl.setValue(new AbstractC25708jDk.StateListAnimator());
                    this.this$0.AEQbTJ.setValue(new C25706jDi(false, false, false, new Exception(), 7, null));
                } else {
                    int iAEQbTJ = this.this$0.iwGUEr.AEQbTJ();
                    this.this$0.AEQbTJ.setValue(new C25706jDi(this.this$0.copydefault(leaderBoardContentUIModel), false, false, null, 14, null));
                    this.this$0.KWHzl.setValue(new AbstractC25708jDk.ActionBar(list, iAEQbTJ, list.size(), null, 8, null));
                }
                return Unit.INSTANCE;
            }
            jbh = (jBH) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        LeaderBoardViewModel leaderBoardViewModel2 = this.this$0;
        boolean z = this.$isPullToRefresh;
        this.L$0 = null;
        this.label = 2;
        objAEQbTJ2 = leaderBoardViewModel2.AEQbTJ(jbh, (String) objAEQbTJ, z, this);
        if (objAEQbTJ2 == objCopydefault) {
            return objCopydefault;
        }
        leaderBoardContentUIModel = (LeaderBoardContentUIModel) objAEQbTJ2;
        if (leaderBoardContentUIModel != null) {
            listAhwBna = yDY.AhwBna();
        }
        if (!this.$isFirstPage) {
        }
        list = listAhwBna;
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
            }
        }
        return Unit.INSTANCE;
    }
}
