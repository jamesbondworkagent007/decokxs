package com.okinc.business.market.features.watch_list_groups.repo;

import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import com.okinc.network.okg.response.ResponseData;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C27774kCw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupRepositoryImpl$getWatchlistTokensByGroup$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends HomeFavoriteTokenData>>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ int $groupId;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C27774kCw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupRepositoryImpl$getWatchlistTokensByGroup$2(String str, String str2, int i, String str3, C27774kCw c27774kCw, Continuation<? super WatchlistGroupRepositoryImpl$getWatchlistTokensByGroup$2> continuation) {
        super(1, continuation);
        this.$accountId = str;
        this.$walletAddress = str2;
        this.$groupId = i;
        this.$chainId = str3;
        this.this$0 = c27774kCw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WatchlistGroupRepositoryImpl$getWatchlistTokensByGroup$2(this.$accountId, this.$walletAddress, this.$groupId, this.$chainId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends HomeFavoriteTokenData>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<HomeFavoriteTokenData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<HomeFavoriteTokenData>>> continuation) {
        return ((WatchlistGroupRepositoryImpl$getWatchlistTokensByGroup$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("accountId", this.$accountId);
            linkedHashMap.put("walletAddress", this.$walletAddress);
            linkedHashMap.put("groupId", C56443yFo.AEQbTJ(this.$groupId));
            String str = this.$chainId;
            if (str != null) {
                linkedHashMap.put("chainId", str);
            }
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
            this.label = 1;
            obj = interfaceC27595jyE.fetchVPNInfo(linkedHashMap, this);
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
