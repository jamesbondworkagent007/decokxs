package com.okinc.okmarket.viewmodel;

import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel$loadGroupData$1$3$flow$1$1 extends SuspendLambda implements yHO<List<? extends UserGroupVo>, Boolean, Continuation<? super MarketHomeV2ViewModel.TaskDescription>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketHomeV2ViewModel$loadGroupData$1$3$flow$1$1(Continuation<? super MarketHomeV2ViewModel$loadGroupData$1$3$flow$1$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(List<? extends UserGroupVo> list, Boolean bool, Continuation<? super MarketHomeV2ViewModel.TaskDescription> continuation) {
        return invoke((List<UserGroupVo>) list, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(List<UserGroupVo> list, boolean z, Continuation<? super MarketHomeV2ViewModel.TaskDescription> continuation) {
        MarketHomeV2ViewModel$loadGroupData$1$3$flow$1$1 marketHomeV2ViewModel$loadGroupData$1$3$flow$1$1 = new MarketHomeV2ViewModel$loadGroupData$1$3$flow$1$1(continuation);
        marketHomeV2ViewModel$loadGroupData$1$3$flow$1$1.L$0 = list;
        marketHomeV2ViewModel$loadGroupData$1$3$flow$1$1.Z$0 = z;
        return marketHomeV2ViewModel$loadGroupData$1$3$flow$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            boolean z = this.Z$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((UserGroupVo) it.next()).getUserGroup().getGroupName());
            }
            pUU.KWHzl("MarketHomeV2ViewModel", "Watchlist GroupName list: " + arrayList);
            return new MarketHomeV2ViewModel.TaskDescription(list, z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
