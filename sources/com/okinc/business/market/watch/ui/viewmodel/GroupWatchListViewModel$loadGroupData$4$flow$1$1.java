package com.okinc.business.market.watch.ui.viewmodel;

import com.okinc.market.watch.data.UserGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C27997kLb;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListViewModel$loadGroupData$4$flow$1$1 extends SuspendLambda implements yHO<List<? extends UserGroup>, Boolean, Continuation<? super C27997kLb>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupWatchListViewModel$loadGroupData$4$flow$1$1(Continuation<? super GroupWatchListViewModel$loadGroupData$4$flow$1$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(List<? extends UserGroup> list, Boolean bool, Continuation<? super C27997kLb> continuation) {
        return invoke((List<UserGroup>) list, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(List<UserGroup> list, boolean z, Continuation<? super C27997kLb> continuation) {
        GroupWatchListViewModel$loadGroupData$4$flow$1$1 groupWatchListViewModel$loadGroupData$4$flow$1$1 = new GroupWatchListViewModel$loadGroupData$4$flow$1$1(continuation);
        groupWatchListViewModel$loadGroupData$4$flow$1$1.L$0 = list;
        groupWatchListViewModel$loadGroupData$4$flow$1$1.Z$0 = z;
        return groupWatchListViewModel$loadGroupData$4$flow$1$1.invokeSuspend(Unit.INSTANCE);
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
                arrayList.add(((UserGroup) it.next()).getGroupName());
            }
            pUU.KWHzl("GroupWatchListViewModel", "Watchlist GroupName list: " + arrayList);
            return new C27997kLb(list, z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
