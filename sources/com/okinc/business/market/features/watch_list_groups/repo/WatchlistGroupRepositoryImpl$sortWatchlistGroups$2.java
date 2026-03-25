package com.okinc.business.market.features.watch_list_groups.repo;

import com.okinc.business.market.data.model.watchlist.GroupSortingRequest;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C27774kCw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupRepositoryImpl$sortWatchlistGroups$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<Unit>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ List<Integer> $groupIds;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C27774kCw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupRepositoryImpl$sortWatchlistGroups$2(C27774kCw c27774kCw, String str, String str2, List<Integer> list, Continuation<? super WatchlistGroupRepositoryImpl$sortWatchlistGroups$2> continuation) {
        super(1, continuation);
        this.this$0 = c27774kCw;
        this.$accountId = str;
        this.$walletAddress = str2;
        this.$groupIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WatchlistGroupRepositoryImpl$sortWatchlistGroups$2(this.this$0, this.$accountId, this.$walletAddress, this.$groupIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<Unit>> continuation) {
        return ((WatchlistGroupRepositoryImpl$sortWatchlistGroups$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
            GroupSortingRequest groupSortingRequest = new GroupSortingRequest(this.$accountId, this.$walletAddress, this.$groupIds);
            this.label = 1;
            obj = interfaceC27595jyE.KWHzl(groupSortingRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
