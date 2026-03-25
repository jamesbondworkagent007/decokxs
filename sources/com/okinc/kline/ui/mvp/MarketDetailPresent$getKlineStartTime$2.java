package com.okinc.kline.ui.mvp;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.KlineStartTimeVo;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C39562pug;
import o.C43251rlk;
import o.C43393roT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketDetailPresent$getKlineStartTime$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<KlineStartTimeVo>>, Object> {
    final /* synthetic */ String $instId;
    int label;
    final /* synthetic */ C39562pug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDetailPresent$getKlineStartTime$2(C39562pug c39562pug, String str, Continuation<? super MarketDetailPresent$getKlineStartTime$2> continuation) {
        super(2, continuation);
        this.this$0 = c39562pug;
        this.$instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailPresent$getKlineStartTime$2(this.this$0, this.$instId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<KlineStartTimeVo>> continuation) {
        return ((MarketDetailPresent$getKlineStartTime$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String underlying;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        ResponseData responseData;
        ArrayList arrayList;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C39562pug c39562pug = this.this$0;
                String str = this.$instId;
                Result.Application application = Result.Companion;
                String str2 = c39562pug.getFieldNames;
                if (Intrinsics.EZpvd((Object) str2, (Object) "TYPE_KLINE")) {
                    KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
                    this.label = 1;
                    obj = klineBizMarketService.getCandlesInitialTime(str, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else if (Intrinsics.EZpvd((Object) str2, (Object) "TYPE_INDEX_KLINE")) {
                    MarketCoinInfo marketCoinInfo = c39562pug.uzCIH;
                    if (marketCoinInfo != null) {
                        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(marketCoinInfo.getInstrumentId())) == null || (underlying = bizInstrumentValueOf.getUnderlying()) == null) {
                            underlying = "";
                        }
                    } else {
                        underlying = null;
                    }
                    KlineBizMarketService klineBizMarketService2 = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
                    this.label = 2;
                    obj = klineBizMarketService2.getIndexCandlesInitialTime(underlying, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                } else {
                    KlineBizMarketService klineBizMarketService3 = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
                    this.label = 3;
                    obj = klineBizMarketService3.getMarkCandlesInitialTime(str, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    responseData = (ResponseData) obj;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            } else if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
            }
            if (responseData.getCode() != 0 || responseData.getData() == null || (arrayList = (ArrayList) responseData.getData()) == null) {
                arrayList = new ArrayList();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C39562pug c39562pug2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(c39562pug2.OLrzqt, "getKlineContentFlashData: onError:" + thM7380exceptionOrNullimpl.getMessage());
        }
        ArrayList arrayList2 = (ArrayList) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        return arrayList2 == null ? new ArrayList() : arrayList2;
    }
}
