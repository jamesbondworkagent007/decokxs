package com.okinc.business.market.features.watch_list_groups.repo;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.network.okg.response.ResponseData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C27774kCw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupRepositoryImpl$getWatchListGroupsWithTokenStatus$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends CommonGroupData>>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C27774kCw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupRepositoryImpl$getWatchListGroupsWithTokenStatus$2(String str, String str2, String str3, String str4, C27774kCw c27774kCw, Continuation<? super WatchlistGroupRepositoryImpl$getWatchListGroupsWithTokenStatus$2> continuation) {
        super(1, continuation);
        this.$accountId = str;
        this.$walletAddress = str2;
        this.$chainId = str3;
        this.$tokenContractAddress = str4;
        this.this$0 = c27774kCw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WatchlistGroupRepositoryImpl$getWatchListGroupsWithTokenStatus$2(this.$accountId, this.$walletAddress, this.$chainId, this.$tokenContractAddress, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends CommonGroupData>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<CommonGroupData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<CommonGroupData>>> continuation) {
        return ((WatchlistGroupRepositoryImpl$getWatchListGroupsWithTokenStatus$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            linkedHashMap.put("chainId", this.$chainId);
            linkedHashMap.put("tokenContractAddress", this.$tokenContractAddress);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
            this.label = 1;
            obj = interfaceC27595jyE.AhwBna((Map<String, Object>) linkedHashMap, (Continuation<? super ResponseData<List<CommonGroupData>>>) this);
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
