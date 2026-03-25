package com.okinc.business.market.features.smart_money.signal.domain;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C21950hSi;
import o.C29507kuu;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C59443zhD;
import o.InterfaceC29466kuF;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewKLineUseCase$invoke-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalOverviewKLineUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends SignalOverviewKLineUiModel>>, Object> {
    final /* synthetic */ long $afterTimestamp$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ TimeIntervalSelector $timeIntervalSelector$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ C29507kuu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalOverviewKLineUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, long j, C29507kuu c29507kuu, TimeIntervalSelector timeIntervalSelector, String str, String str2) {
        super(2, continuation);
        this.$afterTimestamp$inlined = j;
        this.this$0 = c29507kuu;
        this.$timeIntervalSelector$inlined = timeIntervalSelector;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalOverviewKLineUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(continuation, this.$afterTimestamp$inlined, this.this$0, this.$timeIntervalSelector$inlined, this.$chainId$inlined, this.$tokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends SignalOverviewKLineUiModel>> continuation) {
        return ((GetSignalOverviewKLineUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        SignalOverviewKLineUiModel.DataPoint dataPoint;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                Map mapOLrzqt = C56423yEv.OLrzqt();
                mapOLrzqt.put("chainId", this.$chainId$inlined);
                mapOLrzqt.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, this.$tokenContractAddress$inlined);
                mapOLrzqt.put(TtmlNode.RUBY_AFTER, C56443yFo.KWHzl(this.$afterTimestamp$inlined));
                mapOLrzqt.put(TtmlNode.RUBY_BEFORE, C56443yFo.KWHzl(this.$afterTimestamp$inlined - ((long) 1209600000)));
                mapOLrzqt.put("bar", this.$timeIntervalSelector$inlined.getGranularity());
                mapOLrzqt.put("limit", C56443yFo.AEQbTJ(this.$timeIntervalSelector$inlined.getLimit()));
                Map<String, ? extends Object> mapAYXKKw = C56423yEv.AYXKKw(mapOLrzqt);
                InterfaceC29466kuF interfaceC29466kuF = this.this$0.OLrzqt;
                this.label = 1;
                obj = interfaceC29466kuF.OLrzqt(mapAYXKKw, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List<? extends List<String>> list = (List) ((AbstractC43419rot) obj).AEQbTJ();
            TimeIntervalSelector timeIntervalSelector = this.$timeIntervalSelector$inlined;
            List<CandlesticksBean> listKWHzl = C21950hSi.OLrzqt.KWHzl(list);
            ArrayList arrayList = new ArrayList();
            for (CandlesticksBean candlesticksBean : listKWHzl) {
                Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(candlesticksBean.getTs());
                if (fieldNames != null) {
                    long jLongValue = fieldNames.longValue();
                    Float fFIwbmz = C59443zhD.fIwbmz(candlesticksBean.getO());
                    dataPoint = fFIwbmz != null ? new SignalOverviewKLineUiModel.DataPoint(jLongValue, fFIwbmz.floatValue()) : null;
                }
                if (dataPoint != null) {
                    arrayList.add(dataPoint);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(new SignalOverviewKLineUiModel(timeIntervalSelector, arrayList, false, false, false, false, 60, null));
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
