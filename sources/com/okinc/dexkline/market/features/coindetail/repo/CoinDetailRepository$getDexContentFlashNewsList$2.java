package com.okinc.dexkline.market.features.coindetail.repo;

import com.okinc.kline.news.data.po.KlineFlashPo;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C43393roT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;

/* JADX INFO: loaded from: classes8.dex */
public final class CoinDetailRepository$getDexContentFlashNewsList$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<KlineFlashPo>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $cursor;
    final /* synthetic */ String $group;
    final /* synthetic */ Integer $size;
    final /* synthetic */ String $token;
    final /* synthetic */ String $tokenAddress;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailRepository$getDexContentFlashNewsList$2(String str, String str2, String str3, String str4, String str5, Integer num, Continuation<? super CoinDetailRepository$getDexContentFlashNewsList$2> continuation) {
        super(1, continuation);
        this.$tokenAddress = str;
        this.$chainId = str2;
        this.$token = str3;
        this.$group = str4;
        this.$cursor = str5;
        this.$size = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CoinDetailRepository$getDexContentFlashNewsList$2(this.$tokenAddress, this.$chainId, this.$token, this.$group, this.$cursor, this.$size, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<KlineFlashPo>> continuation) {
        return ((CoinDetailRepository$getDexContentFlashNewsList$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
            String str = this.$tokenAddress;
            String str2 = this.$chainId;
            String str3 = this.$token;
            String str4 = this.$group;
            String str5 = this.$cursor;
            Integer num = this.$size;
            this.label = 1;
            obj = klineBizMarketService.getDexContentFlashNewsList(str, str2, str3, str4, str5, num, this);
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
