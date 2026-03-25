package com.okinc.kline.ui.mvp;

import com.okinc.kline.news.data.po.KlineFlashContentPo;
import com.okinc.kline.news.data.po.KlineFlashPo;
import com.okinc.kline.news.data.vo.KlineFlashVo;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C37980pHv;
import o.C39562pug;
import o.C43393roT;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketDetailPresent$getKlineContentFlashData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<KlineFlashVo>>, Object> {
    final /* synthetic */ String $cursor;
    final /* synthetic */ String $group;
    final /* synthetic */ boolean $important;
    final /* synthetic */ Integer $size;
    final /* synthetic */ String $token;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C39562pug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDetailPresent$getKlineContentFlashData$2(String str, String str2, boolean z, String str3, Integer num, C39562pug c39562pug, Continuation<? super MarketDetailPresent$getKlineContentFlashData$2> continuation) {
        super(2, continuation);
        this.$group = str;
        this.$token = str2;
        this.$important = z;
        this.$cursor = str3;
        this.$size = num;
        this.this$0 = c39562pug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailPresent$getKlineContentFlashData$2(this.$group, this.$token, this.$important, this.$cursor, this.$size, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<KlineFlashVo>> continuation) {
        return ((MarketDetailPresent$getKlineContentFlashData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        String str2;
        ArrayList arrayList;
        KlineFlashPo klineFlashPo;
        List<KlineFlashContentPo> contentDataList;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                str = this.$group;
                String str3 = this.$token;
                boolean z = this.$important;
                String str4 = this.$cursor;
                Integer num = this.$size;
                Result.Application application = Result.Companion;
                KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
                this.L$0 = str;
                this.L$1 = str3;
                this.label = 1;
                Object klineContentFlashData = klineBizMarketService.getKlineContentFlashData(str, str3, z, str4, num, this);
                if (klineContentFlashData == objCopydefault) {
                    return objCopydefault;
                }
                str2 = str3;
                obj = klineContentFlashData;
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() != 0 || responseData.getData() == null || (klineFlashPo = (KlineFlashPo) responseData.getData()) == null || (contentDataList = klineFlashPo.getContentDataList()) == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(C56403yEb.AYXKKw(contentDataList, 10));
                for (KlineFlashContentPo klineFlashContentPo : contentDataList) {
                    arrayList.add(new KlineFlashVo(klineFlashContentPo, C37980pHv.OLrzqt.KWHzl(C56443yFo.KWHzl(C33129mqd.valueOf(klineFlashContentPo.getPublishTime()))), str2, str == null ? "" : str, null, null, 48, null));
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C39562pug c39562pug = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(c39562pug.OLrzqt, "getKlineContentFlashData: onError:" + thM7380exceptionOrNullimpl.getMessage());
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        ArrayList arrayList2 = objM7377constructorimpl instanceof ArrayList ? (ArrayList) objM7377constructorimpl : null;
        return arrayList2 == null ? new ArrayList() : arrayList2;
    }
}
