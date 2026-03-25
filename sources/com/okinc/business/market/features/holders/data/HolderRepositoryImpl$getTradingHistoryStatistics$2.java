package com.okinc.business.market.features.holders.data;

import com.okinc.business.dexlogic.bean.TradingHistoryStatisticsResult;
import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C26284jYt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23229huL;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderRepositoryImpl$getTradingHistoryStatistics$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<TradingHistoryStatisticsResult>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C26284jYt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderRepositoryImpl$getTradingHistoryStatistics$2(String str, String str2, String str3, C26284jYt c26284jYt, Continuation<? super HolderRepositoryImpl$getTradingHistoryStatistics$2> continuation) {
        super(1, continuation);
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$walletAddress = str3;
        this.this$0 = c26284jYt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HolderRepositoryImpl$getTradingHistoryStatistics$2(this.$chainId, this.$tokenAddress, this.$walletAddress, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<TradingHistoryStatisticsResult>> continuation) {
        return ((HolderRepositoryImpl$getTradingHistoryStatistics$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap<String, String> map = new HashMap<>();
            map.put("chainId", this.$chainId);
            map.put("tokenAddress", this.$tokenAddress);
            map.put("walletAddress", this.$walletAddress);
            InterfaceC23229huL interfaceC23229huL = this.this$0.KWHzl;
            this.label = 1;
            obj = interfaceC23229huL.valueOf(map, this);
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
