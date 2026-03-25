package com.okinc.planet.biz_plugin.domain;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_plugin.ChartTimeframeConfig;
import com.okinc.planet.biz_plugin.future.data.FilteredOrderPoints;
import com.okinc.planet.biz_plugin.future.data.FutureChatBean;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C33129mqd;
import o.C43248rlh;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49513upv;
import o.pTA;
import o.pUU;
import o.tBN;
import o.tBO;
import o.yDY;
import o.yET;

/* JADX INFO: loaded from: classes19.dex */
public final class GetFuturesChatDataUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends FutureChatBean, ? extends Boolean>>, Object> {
    final /* synthetic */ String $cTimestamp;
    final /* synthetic */ String $instId;
    final /* synthetic */ String $instType;
    final /* synthetic */ String $listTime;
    final /* synthetic */ String $pluginDataTime;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFuturesChatDataUseCase$invoke$2(String str, String str2, String str3, String str4, String str5, Continuation<? super GetFuturesChatDataUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$pluginDataTime = str;
        this.$cTimestamp = str2;
        this.$listTime = str3;
        this.$instId = str4;
        this.$instType = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetFuturesChatDataUseCase$invoke$2 getFuturesChatDataUseCase$invoke$2 = new GetFuturesChatDataUseCase$invoke$2(this.$pluginDataTime, this.$cTimestamp, this.$listTime, this.$instId, this.$instType, continuation);
        getFuturesChatDataUseCase$invoke$2.L$0 = obj;
        return getFuturesChatDataUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends FutureChatBean, ? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<FutureChatBean, Boolean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<FutureChatBean, Boolean>> continuation) {
        return ((GetFuturesChatDataUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Deferred deferredAsync$default;
        Object objAwait;
        Object objAwait2;
        Object obj2;
        String str = "========================================";
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                ChartTimeframeConfig chartTimeframeConfigOLrzqt = tBO.copydefault.OLrzqt(C33129mqd.valueOf(this.$cTimestamp), C33129mqd.valueOf(this.$listTime), C33129mqd.valueOf(this.$pluginDataTime));
                pUU.EZpvd("GetFuturesHisChatData", "  getChatRes: " + chartTimeframeConfigOLrzqt);
                Date date = new Date(C33129mqd.valueOf(this.$cTimestamp));
                OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_SIMPLE;
                OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
                pUU.EZpvd("GetFuturesHisChatData", "  开仓: " + pTA.format$default(date, oKDateEnum, oKTimeEnum, null, null, false, 28, null) + " (" + this.$cTimestamp + ")");
                pUU.EZpvd("GetFuturesHisChatData", "  getMarkStartTime: " + pTA.format$default(new Date(chartTimeframeConfigOLrzqt.getStartTimestamp()), oKDateEnum, oKTimeEnum, null, null, false, 28, null) + " (" + chartTimeframeConfigOLrzqt.getStartTimestamp() + ")");
                pUU.EZpvd("GetFuturesHisChatData", "  getMarkEndTime: " + pTA.format$default(new Date(chartTimeframeConfigOLrzqt.getEndTimestamp()), oKDateEnum, oKTimeEnum, null, null, false, 28, null) + " (" + chartTimeframeConfigOLrzqt.getEndTimestamp() + ")");
                InterfaceC49513upv interfaceC49513upv = (InterfaceC49513upv) C43248rlh.KWHzl.AEQbTJ(InterfaceC49513upv.class);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetFuturesChatDataUseCase$invoke$2$lineResultDeferred$1(interfaceC49513upv, this.$instId, this.$instType, chartTimeframeConfigOLrzqt, null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new GetFuturesChatDataUseCase$invoke$2$ordersResultDeferred$1(interfaceC49513upv, this.$instId, this.$instType, chartTimeframeConfigOLrzqt, null), 3, null);
                this.L$0 = deferredAsync$default;
                this.label = 1;
                objAwait = deferredAsync$default2.await(this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAwait2 = obj;
                    Object objM7386unboximpl = ((Result) objAwait2).m7386unboximpl();
                    if (!Result.m7384isSuccessimpl(obj2) && Result.m7384isSuccessimpl(objM7386unboximpl)) {
                        C56391yDq.AEQbTJ(obj2);
                        List<TradeTickerChartEntry> list = (List) obj2;
                        C56391yDq.AEQbTJ(objM7386unboximpl);
                        List<TradeHisPositionHisOrderPlanetBean> list2 = (List) objM7386unboximpl;
                        pUU.EZpvd("GetFuturesHisChatData", "========================================");
                        pUU.EZpvd("GetFuturesHisChatData", "K-line Data (Total: " + list.size() + ")");
                        if (!list.isEmpty()) {
                            TradeTickerChartEntry tradeTickerChartEntry = (TradeTickerChartEntry) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
                            TradeTickerChartEntry tradeTickerChartEntry2 = (TradeTickerChartEntry) CollectionsKt___CollectionsKt.AubY(list);
                            Date date2 = new Date(C33129mqd.valueOf(tradeTickerChartEntry.getTimestamp()));
                            OKDateEnum oKDateEnum2 = OKDateEnum.DATE_FORMAT_SIMPLE;
                            OKTimeEnum oKTimeEnum2 = OKTimeEnum.TIME_FORMAT_SIMPLE_HM;
                            String str2 = pTA.format$default(date2, oKDateEnum2, oKTimeEnum2, null, null, false, 28, null);
                            String str3 = pTA.format$default(new Date(C33129mqd.valueOf(tradeTickerChartEntry2.getTimestamp())), oKDateEnum2, oKTimeEnum2, null, null, false, 28, null);
                            pUU.EZpvd("GetFuturesHisChatData", "  First K-line: " + str2 + " (" + tradeTickerChartEntry.getTimestamp() + ")");
                            pUU.EZpvd("GetFuturesHisChatData", "  Last K-line:  " + str3 + " (" + tradeTickerChartEntry2.getTimestamp() + ")");
                        }
                        pUU.EZpvd("GetFuturesHisChatData", "----------------------------------------");
                        pUU.EZpvd("GetFuturesHisChatData", "Original Order Data (Total: " + list2.size() + ")");
                        Iterator it = list2.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (i2 < 0) {
                                yDY.AYXKKw();
                            }
                            TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean = (TradeHisPositionHisOrderPlanetBean) next;
                            String str4 = str;
                            pUU.EZpvd("GetFuturesHisChatData", "  Order[" + i2 + "]: " + pTA.format$default(new Date(C33129mqd.valueOf(tradeHisPositionHisOrderPlanetBean.getTimestamp())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null) + " | " + tradeHisPositionHisOrderPlanetBean.getSide() + " | fillPx=" + tradeHisPositionHisOrderPlanetBean.getFillPx() + " | timestamp=" + tradeHisPositionHisOrderPlanetBean.getTimestamp());
                            i2++;
                            it = it;
                            str = str4;
                        }
                        String str5 = str;
                        FilteredOrderPoints filteredOrderPointsComponent1 = tBN.AEQbTJ.AEQbTJ(list, list2).component1();
                        List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.djBIcL((Collection) filteredOrderPointsComponent1.getBuyOrders(), (Iterable) filteredOrderPointsComponent1.getSellOrders()), new ActionBar());
                        pUU.EZpvd("GetFuturesHisChatData", "----------------------------------------");
                        pUU.EZpvd("GetFuturesHisChatData", "Filtered Orders (Total: " + listEZpvd.size() + ")");
                        pUU.EZpvd("GetFuturesHisChatData", "  Buy orders: " + filteredOrderPointsComponent1.getBuyOrders().size());
                        pUU.EZpvd("GetFuturesHisChatData", "  Sell orders: " + filteredOrderPointsComponent1.getSellOrders().size());
                        int i3 = 0;
                        for (Object obj3 : listEZpvd) {
                            if (i3 < 0) {
                                yDY.AYXKKw();
                            }
                            TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean2 = (TradeHisPositionHisOrderPlanetBean) obj3;
                            pUU.EZpvd("GetFuturesHisChatData", "  Filtered[" + i3 + "]: " + pTA.format$default(new Date(C33129mqd.valueOf(tradeHisPositionHisOrderPlanetBean2.getTimestamp())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null) + " | " + tradeHisPositionHisOrderPlanetBean2.getSide() + " | fillPx=" + tradeHisPositionHisOrderPlanetBean2.getFillPx() + " | timestamp=" + tradeHisPositionHisOrderPlanetBean2.getTimestamp());
                            i3++;
                        }
                        pUU.EZpvd("GetFuturesHisChatData", str5);
                        return C56390yDp.OLrzqt(new FutureChatBean(list, listEZpvd), C56443yFo.KWHzl(true));
                    }
                    z = false;
                    try {
                        return C56390yDp.OLrzqt(null, C56443yFo.KWHzl(false));
                    } catch (Exception unused) {
                        return C56390yDp.OLrzqt(null, C56443yFo.KWHzl(z));
                    }
                }
                deferredAsync$default = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
            }
            Object objM7386unboximpl2 = ((Result) objAwait).m7386unboximpl();
            this.L$0 = objM7386unboximpl2;
            this.label = 2;
            objAwait2 = deferredAsync$default.await(this);
            if (objAwait2 == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objM7386unboximpl2;
            Object objM7386unboximpl3 = ((Result) objAwait2).m7386unboximpl();
            if (!Result.m7384isSuccessimpl(obj2)) {
            }
            z = false;
            return C56390yDp.OLrzqt(null, C56443yFo.KWHzl(false));
        } catch (Exception unused2) {
            z = false;
        }
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Long.valueOf(C33129mqd.valueOf(((TradeHisPositionHisOrderPlanetBean) t).getTimestamp())), Long.valueOf(C33129mqd.valueOf(((TradeHisPositionHisOrderPlanetBean) t2).getTimestamp())));
        }
    }
}
