package com.okinc.business.market.features.holdings.repo;

import com.okinc.business.market.data.model.holdings.HoldingListResponseData;
import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28440kan;
import o.C28443kaq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC23229huL;

/* JADX INFO: loaded from: classes7.dex */
public final class HoldingsRepositoryImpl$getWalletHoldings$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<HoldingListResponseData>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ C28443kaq $activePositionFilter;
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $filterOutLowLiquidityTokens;
    final /* synthetic */ String $userUniqueId;
    int label;
    final /* synthetic */ C28440kan this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldingsRepositoryImpl$getWalletHoldings$2(C28440kan c28440kan, String str, String str2, String str3, boolean z, C28443kaq c28443kaq, Continuation<? super HoldingsRepositoryImpl$getWalletHoldings$2> continuation) {
        super(1, continuation);
        this.this$0 = c28440kan;
        this.$chainId = str;
        this.$userUniqueId = str2;
        this.$accountId = str3;
        this.$filterOutLowLiquidityTokens = z;
        this.$activePositionFilter = c28443kaq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HoldingsRepositoryImpl$getWalletHoldings$2(this.this$0, this.$chainId, this.$userUniqueId, this.$accountId, this.$filterOutLowLiquidityTokens, this.$activePositionFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<HoldingListResponseData>> continuation) {
        return ((HoldingsRepositoryImpl$getWalletHoldings$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap<String, Object> map = new HashMap<>();
            String str = this.$chainId;
            String str2 = this.$userUniqueId;
            String str3 = this.$accountId;
            boolean z = this.$filterOutLowLiquidityTokens;
            C28443kaq c28443kaq = this.$activePositionFilter;
            map.put("chainId", str);
            map.put("userUniqueId", str2);
            map.put("accountId", str3);
            map.put("isFilterOutLowLiquidityToken", C56443yFo.KWHzl(z));
            if (c28443kaq.EZpvd()) {
                map.put("smallBalanceThreshold", c28443kaq.OLrzqt());
            }
            map.put("filterStableOrNativeToken", C56443yFo.KWHzl(c28443kaq.KWHzl()));
            InterfaceC23229huL interfaceC23229huL = this.this$0.copydefault;
            this.label = 1;
            obj = interfaceC23229huL.KWHzl(map, this);
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
