package com.okinc.business.market.features.watch_list_groups.repo;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.network.okg.response.ResponseData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C27774kCw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.watch_list_groups.repo.WatchlistGroupRepositoryImpl$getWatchlistGroups-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupRepositoryImpl$getWatchlistGroups0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends CommonGroupData>>>, Object> {
    final /* synthetic */ String $accountId$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C27774kCw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupRepositoryImpl$getWatchlistGroups0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, String str, String str2, C27774kCw c27774kCw) {
        super(2, continuation);
        this.$walletAddress$inlined = str;
        this.$accountId$inlined = str2;
        this.this$0 = c27774kCw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistGroupRepositoryImpl$getWatchlistGroups0E7RQCE$$inlined$dexRunCatching$1(continuation, this.$walletAddress$inlined, this.$accountId$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends CommonGroupData>>> continuation) {
        return ((WatchlistGroupRepositoryImpl$getWatchlistGroups0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("walletAddress", this.$walletAddress$inlined);
                linkedHashMap.put("accountId", this.$accountId$inlined);
                InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
                this.label = 1;
                obj = interfaceC27595jyE.values(linkedHashMap, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object data = ((ResponseData) obj).getData();
            Intrinsics.copydefault(data);
            objM7377constructorimpl = Result.m7377constructorimpl(data);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
