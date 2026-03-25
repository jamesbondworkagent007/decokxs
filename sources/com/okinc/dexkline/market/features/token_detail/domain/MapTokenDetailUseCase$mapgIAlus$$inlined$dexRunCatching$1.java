package com.okinc.dexkline.market.features.token_detail.domain;

import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C34576neg;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.token_detail.domain.MapTokenDetailUseCase$map-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TokenDetail>>, Object> {
    final /* synthetic */ LatestMarketInfoBean $from$inlined;
    int label;
    final /* synthetic */ C34576neg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$1(Continuation continuation, LatestMarketInfoBean latestMarketInfoBean, C34576neg c34576neg) {
        super(2, continuation);
        this.$from$inlined = latestMarketInfoBean;
        this.this$0 = c34576neg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$1(continuation, this.$from$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TokenDetail>> continuation) {
        return ((MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            LatestMarketInfoBean latestMarketInfoBean = this.$from$inlined;
            if (latestMarketInfoBean != null) {
                String change = latestMarketInfoBean.getChange();
                String changeUtc0 = this.$from$inlined.getChangeUtc0();
                String changeUtc8 = this.$from$inlined.getChangeUtc8();
                String maxPrice = this.$from$inlined.getMaxPrice();
                String minPrice = this.$from$inlined.getMinPrice();
                String price = this.$from$inlined.getPrice();
                String volume = this.$from$inlined.getVolume();
                String tradeNum = this.$from$inlined.getTradeNum();
                String tokenContractAddress = this.$from$inlined.getTokenContractAddress();
                String marketCap = this.$from$inlined.getMarketCap();
                String liquidity = this.$from$inlined.getLiquidity();
                String holders = this.$from$inlined.getHolders();
                String top10HoldAmountPercentage = this.$from$inlined.getTop10HoldAmountPercentage();
                List<CompactTagData> newTagList = this.$from$inlined.getNewTagList();
                String devHoldingRatio = this.$from$inlined.getDevHoldingRatio();
                MarketTxWsInfoItemBean marketTxWsInfoItemBean = new MarketTxWsInfoItemBean((String) null, change, (String) null, (String) null, (String) null, changeUtc0, changeUtc8, (String) null, (String) null, this.$from$inlined.getSnipersClear(), this.$from$inlined.getSnipersTotal(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, marketCap, maxPrice, minPrice, price, tokenContractAddress, tradeNum, (String) null, volume, liquidity, holders, (String) null, (String) null, top10HoldAmountPercentage, this.$from$inlined.getEarlyBuyerStatisticsInfo().getEarlyBuyerHoldAmount(), this.$from$inlined.getEarlyBuyerStatisticsInfo().getTotalEarlyBuyerAmount(), devHoldingRatio, newTagList, (String) null, (String) null, 272628125, 387, (DefaultConstructorMarker) null);
                C34576neg c34576neg = this.this$0;
                this.label = 1;
                Object objOLrzqt = c34576neg.OLrzqt(marketTxWsInfoItemBean, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objOLrzqt;
            }
            objM7386unboximpl = null;
            objM7377constructorimpl = Result.m7377constructorimpl(objM7386unboximpl);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objM7386unboximpl = ((Result) obj).m7386unboximpl();
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(objM7386unboximpl);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
