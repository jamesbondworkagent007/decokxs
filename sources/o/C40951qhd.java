package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.domain.usecase.RequestTradingCalendarGridUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.TradingCalendarGridVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40951qhd extends AbstractC49400uno<java.util.List<? extends TradingCalendarGridVo>, java.util.List<? extends TradingCalendarGridVo>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C40952qhe AYXKKw;
    public final C40890qgV AhwBna;
    public final int EZpvd;
    public final C40892qgX KWHzl;
    public final C40893qgY OLrzqt;
    public final int copydefault;
    public final C40889qgU gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C40951qhd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40889qgU c40889qgU, @NotNull C40890qgV c40890qgV, @NotNull C40952qhe c40952qhe, @NotNull C40892qgX c40892qgX, @NotNull C40893qgY c40893qgY) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40889qgU, "");
        Intrinsics.checkNotNullParameter(c40890qgV, "");
        Intrinsics.checkNotNullParameter(c40952qhe, "");
        Intrinsics.checkNotNullParameter(c40892qgX, "");
        Intrinsics.checkNotNullParameter(c40893qgY, "");
        this.AEQbTJ = coroutineDispatcher;
        this.gEmmrt = c40889qgU;
        this.AhwBna = c40890qgV;
        this.AYXKKw = c40952qhe;
        this.KWHzl = c40892qgX;
        this.OLrzqt = c40893qgY;
        this.copydefault = 6;
        this.EZpvd = 4;
    }

    /* JADX DEBUG: Duplicate block (B:98:0x02cd) to fix multi-entry loop: BACK_EDGE: B:98:0x02cd -> B:99:0x02d3 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r2v30, resolved type: java.util.ArrayList<com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x032a -> B:99:0x02d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x034e -> B:116:0x0353). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x02a4 -> B:99:0x02d3). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<TradingCalendarGridVo> list, @NotNull Continuation<? super java.util.List<TradingCalendarGridVo>> continuation) throws java.lang.Throwable {
        RequestTradingCalendarGridUseCase$onExecute$1 requestTradingCalendarGridUseCase$onExecute$1;
        C40951qhd c40951qhd;
        int iNextIndex;
        java.lang.String strValueOf;
        C40889qgU c40889qgU;
        java.lang.String requestValue;
        java.lang.Object objEZpvd;
        C40951qhd c40951qhd2;
        java.lang.String str;
        java.lang.String str2;
        C40889qgU c40889qgU2;
        java.lang.String str3;
        C40951qhd c40951qhd3;
        java.lang.Object objM7377constructorimpl;
        java.util.Collection collection;
        java.util.ArrayList<TradingCalendarGridVo> arrayList;
        java.util.Iterator it;
        java.util.Map map;
        TradingCalendarPo tradingCalendarPo;
        java.util.Iterator it2;
        java.util.Map map2;
        java.util.ArrayList arrayList2;
        C40951qhd c40951qhd4;
        TradingCalendarPo tradingCalendarPo2;
        TradingCalendarGridVo tradingCalendarGridVo;
        TradingCalendarGridVo tradingCalendarGridVo2;
        java.util.ArrayList arrayListCopydefault;
        TradingCalendarGridVo tradingCalendarGridVo3;
        java.lang.String strAYXKKw;
        java.util.List<TradingCalendarGridVo> list2 = list;
        if (continuation instanceof RequestTradingCalendarGridUseCase$onExecute$1) {
            requestTradingCalendarGridUseCase$onExecute$1 = (RequestTradingCalendarGridUseCase$onExecute$1) continuation;
            int i = requestTradingCalendarGridUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                requestTradingCalendarGridUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                requestTradingCalendarGridUseCase$onExecute$1 = new RequestTradingCalendarGridUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = requestTradingCalendarGridUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (requestTradingCalendarGridUseCase$onExecute$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objOLrzqt);
                try {
                    Result.Application application = Result.Companion;
                    java.util.Iterator<TradingCalendarGridVo> it3 = list.iterator();
                    int i2 = 0;
                    while (true) {
                        iNextIndex = -1;
                        if (!it3.hasNext()) {
                            i2 = -1;
                        } else if (!C33129mqd.OLrzqt((java.lang.CharSequence) it3.next().KWHzl())) {
                            i2++;
                        }
                    }
                    strValueOf = java.lang.String.valueOf(list2.get(i2).AEQbTJ());
                    java.util.ListIterator<TradingCalendarGridVo> listIterator = list2.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) listIterator.previous().KWHzl())) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        }
                    }
                    long jAEQbTJ = list2.get(iNextIndex).AEQbTJ();
                    c40889qgU = this.gEmmrt;
                    requestValue = TradingCalendarType.ALL.getRequestValue();
                    C40890qgV c40890qgV = this.AhwBna;
                    java.lang.Long lKWHzl = C56443yFo.KWHzl(jAEQbTJ);
                    requestTradingCalendarGridUseCase$onExecute$1.L$0 = this;
                    requestTradingCalendarGridUseCase$onExecute$1.L$1 = list2;
                    requestTradingCalendarGridUseCase$onExecute$1.L$2 = c40889qgU;
                    requestTradingCalendarGridUseCase$onExecute$1.L$3 = requestValue;
                    requestTradingCalendarGridUseCase$onExecute$1.L$4 = strValueOf;
                    requestTradingCalendarGridUseCase$onExecute$1.L$5 = "";
                    requestTradingCalendarGridUseCase$onExecute$1.label = 1;
                    objEZpvd = c40890qgV.EZpvd(lKWHzl, requestTradingCalendarGridUseCase$onExecute$1);
                    break;
                } catch (java.lang.Throwable th) {
                    th = th;
                    c40951qhd = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c40951qhd3 = c40951qhd;
                    collection = (java.util.Collection) (!Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                    if (collection != null) {
                    }
                    return list2;
                }
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c40951qhd2 = this;
                str = requestValue;
                str2 = strValueOf;
                objOLrzqt = objEZpvd;
                c40889qgU2 = c40889qgU;
                str3 = "";
                try {
                    long jLongValue = ((java.lang.Number) objOLrzqt).longValue();
                    requestTradingCalendarGridUseCase$onExecute$1.L$0 = c40951qhd2;
                    requestTradingCalendarGridUseCase$onExecute$1.L$1 = list2;
                    requestTradingCalendarGridUseCase$onExecute$1.L$2 = null;
                    requestTradingCalendarGridUseCase$onExecute$1.L$3 = null;
                    requestTradingCalendarGridUseCase$onExecute$1.L$4 = null;
                    requestTradingCalendarGridUseCase$onExecute$1.L$5 = null;
                    requestTradingCalendarGridUseCase$onExecute$1.label = 2;
                    objOLrzqt = c40889qgU2.OLrzqt(str, str3, str2, java.lang.String.valueOf(jLongValue), requestTradingCalendarGridUseCase$onExecute$1);
                    break;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c40951qhd = c40951qhd2;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c40951qhd3 = c40951qhd;
                }
                if (objOLrzqt != objCopydefault) {
                    return objCopydefault;
                }
                c40951qhd3 = c40951qhd2;
                objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objOLrzqt);
                collection = (java.util.Collection) (!Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (collection != null || collection.isEmpty()) {
                    return list2;
                }
                arrayList = new java.util.ArrayList();
                for (TradingCalendarGridVo tradingCalendarGridVo4 : list2) {
                    TradingCalendarGridVo tradingCalendarGridVoEZpvd = tradingCalendarGridVo4.EZpvd((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? tradingCalendarGridVo4.AYXKKw : null, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? tradingCalendarGridVo4.djBIcL : 0L, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? tradingCalendarGridVo4.gEmmrt : null, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? tradingCalendarGridVo4.OLrzqt : null, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? tradingCalendarGridVo4.EZpvd : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? tradingCalendarGridVo4.copydefault : false, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? tradingCalendarGridVo4.AEQbTJ : false, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? tradingCalendarGridVo4.KWHzl : false, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? tradingCalendarGridVo4.AhwBna : null);
                    tradingCalendarGridVoEZpvd.copydefault().clear();
                    tradingCalendarGridVoEZpvd.copydefault(false);
                    tradingCalendarGridVoEZpvd.copydefault("");
                    arrayList.add(tradingCalendarGridVoEZpvd);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
                for (java.lang.Object obj : arrayList) {
                    linkedHashMap.put(C56443yFo.KWHzl(((TradingCalendarGridVo) obj).AEQbTJ()), obj);
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                java.util.List list3 = (java.util.List) objM7377constructorimpl;
                if (list3 != null) {
                    it = list3.iterator();
                    map = linkedHashMap;
                    while (it.hasNext()) {
                        TradingCalendarPo tradingCalendarPo3 = (TradingCalendarPo) it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) tradingCalendarPo3.getType(), (java.lang.Object) TradingCalendarType.ECONOMIC.getRequestValue()) && tradingCalendarPo3.getEconomicData() != null) {
                            java.lang.String strValueOf2 = tradingCalendarPo3.getEconomicData().valueOf();
                            if (strValueOf2 != null) {
                                long j = java.lang.Long.parseLong(strValueOf2);
                                C40952qhe c40952qhe = c40951qhd3.AYXKKw;
                                java.lang.Long lKWHzl2 = C56443yFo.KWHzl(j);
                                requestTradingCalendarGridUseCase$onExecute$1.L$0 = c40951qhd3;
                                requestTradingCalendarGridUseCase$onExecute$1.L$1 = arrayList;
                                requestTradingCalendarGridUseCase$onExecute$1.L$2 = map;
                                requestTradingCalendarGridUseCase$onExecute$1.L$3 = it;
                                requestTradingCalendarGridUseCase$onExecute$1.L$4 = tradingCalendarPo3;
                                requestTradingCalendarGridUseCase$onExecute$1.L$5 = map;
                                requestTradingCalendarGridUseCase$onExecute$1.L$6 = null;
                                requestTradingCalendarGridUseCase$onExecute$1.label = 3;
                                java.lang.Object objEZpvd2 = c40952qhe.EZpvd(lKWHzl2, requestTradingCalendarGridUseCase$onExecute$1);
                                if (objEZpvd2 == objCopydefault) {
                                    return objCopydefault;
                                }
                                c40951qhd4 = c40951qhd3;
                                tradingCalendarPo = tradingCalendarPo3;
                                map2 = map;
                                java.util.ArrayList arrayList3 = arrayList;
                                it2 = it;
                                objOLrzqt = objEZpvd2;
                                arrayList2 = arrayList3;
                                tradingCalendarGridVo = (TradingCalendarGridVo) map.get(objOLrzqt);
                                if (tradingCalendarGridVo != null) {
                                    java.util.ArrayList<ITradingCalendarEventVo> arrayListCopydefault2 = tradingCalendarGridVo.copydefault();
                                    C40892qgX c40892qgX = c40951qhd4.KWHzl;
                                    C40888qgT economicData = tradingCalendarPo.getEconomicData();
                                    requestTradingCalendarGridUseCase$onExecute$1.L$0 = c40951qhd4;
                                    requestTradingCalendarGridUseCase$onExecute$1.L$1 = arrayList2;
                                    requestTradingCalendarGridUseCase$onExecute$1.L$2 = map2;
                                    requestTradingCalendarGridUseCase$onExecute$1.L$3 = it2;
                                    requestTradingCalendarGridUseCase$onExecute$1.L$4 = tradingCalendarGridVo;
                                    requestTradingCalendarGridUseCase$onExecute$1.L$5 = tradingCalendarGridVo;
                                    requestTradingCalendarGridUseCase$onExecute$1.L$6 = arrayListCopydefault2;
                                    requestTradingCalendarGridUseCase$onExecute$1.label = 4;
                                    java.lang.Object objEZpvd3 = c40892qgX.EZpvd(economicData, requestTradingCalendarGridUseCase$onExecute$1);
                                    if (objEZpvd3 == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    arrayListCopydefault2.add(objEZpvd3);
                                    tradingCalendarGridVo.copydefault(true);
                                }
                                it = it2;
                                map = map2;
                                arrayList = arrayList2;
                                c40951qhd3 = c40951qhd4;
                                while (it.hasNext()) {
                                }
                            }
                        } else if (Intrinsics.EZpvd((java.lang.Object) tradingCalendarPo3.getType(), (java.lang.Object) TradingCalendarType.TOKEN_UNLOCK.getRequestValue()) && tradingCalendarPo3.getTokenUnlockData() != null && (strAYXKKw = tradingCalendarPo3.getTokenUnlockData().AYXKKw()) != null) {
                            long j2 = java.lang.Long.parseLong(strAYXKKw);
                            C40952qhe c40952qhe2 = c40951qhd3.AYXKKw;
                            java.lang.Long lKWHzl3 = C56443yFo.KWHzl(j2);
                            requestTradingCalendarGridUseCase$onExecute$1.L$0 = c40951qhd3;
                            requestTradingCalendarGridUseCase$onExecute$1.L$1 = arrayList;
                            requestTradingCalendarGridUseCase$onExecute$1.L$2 = map;
                            requestTradingCalendarGridUseCase$onExecute$1.L$3 = it;
                            requestTradingCalendarGridUseCase$onExecute$1.L$4 = tradingCalendarPo3;
                            requestTradingCalendarGridUseCase$onExecute$1.L$5 = map;
                            requestTradingCalendarGridUseCase$onExecute$1.L$6 = null;
                            requestTradingCalendarGridUseCase$onExecute$1.label = 5;
                            java.lang.Object objEZpvd4 = c40952qhe2.EZpvd(lKWHzl3, requestTradingCalendarGridUseCase$onExecute$1);
                            if (objEZpvd4 == objCopydefault) {
                                return objCopydefault;
                            }
                            c40951qhd4 = c40951qhd3;
                            tradingCalendarPo2 = tradingCalendarPo3;
                            map2 = map;
                            java.util.ArrayList arrayList4 = arrayList;
                            it2 = it;
                            objOLrzqt = objEZpvd4;
                            arrayList2 = arrayList4;
                            tradingCalendarGridVo2 = (TradingCalendarGridVo) map.get(objOLrzqt);
                            if (tradingCalendarGridVo2 != null) {
                                arrayListCopydefault = tradingCalendarGridVo2.copydefault();
                                C40893qgY c40893qgY = c40951qhd4.OLrzqt;
                                C40885qgQ tokenUnlockData = tradingCalendarPo2.getTokenUnlockData();
                                requestTradingCalendarGridUseCase$onExecute$1.L$0 = c40951qhd4;
                                requestTradingCalendarGridUseCase$onExecute$1.L$1 = arrayList2;
                                requestTradingCalendarGridUseCase$onExecute$1.L$2 = map2;
                                requestTradingCalendarGridUseCase$onExecute$1.L$3 = it2;
                                requestTradingCalendarGridUseCase$onExecute$1.L$4 = tradingCalendarGridVo2;
                                requestTradingCalendarGridUseCase$onExecute$1.L$5 = tradingCalendarGridVo2;
                                requestTradingCalendarGridUseCase$onExecute$1.L$6 = arrayListCopydefault;
                                requestTradingCalendarGridUseCase$onExecute$1.label = 6;
                                java.lang.Object objEZpvd5 = c40893qgY.EZpvd(tokenUnlockData, (Continuation) requestTradingCalendarGridUseCase$onExecute$1);
                                if (objEZpvd5 == objCopydefault) {
                                    return objCopydefault;
                                }
                                tradingCalendarGridVo3 = tradingCalendarGridVo2;
                                objOLrzqt = objEZpvd5;
                                arrayListCopydefault.add(objOLrzqt);
                                tradingCalendarGridVo3.copydefault(true);
                            }
                            it = it2;
                            map = map2;
                            arrayList = arrayList2;
                            c40951qhd3 = c40951qhd4;
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                for (TradingCalendarGridVo tradingCalendarGridVo5 : arrayList) {
                    if (tradingCalendarGridVo5.copydefault().size() > c40951qhd3.copydefault) {
                        tradingCalendarGridVo5.copydefault(pTB.formatICUNumber$default(C56443yFo.AEQbTJ(tradingCalendarGridVo5.copydefault().size() - c40951qhd3.EZpvd), null, C38307pTy.Companion.EZpvd(0), DisplaySign.ALWAYS, null, 9, null));
                        java.util.List<? extends ITradingCalendarEventVo> listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) tradingCalendarGridVo5.copydefault(), c40951qhd3.EZpvd);
                        Intrinsics.copydefault(listAhwBna, "");
                        tradingCalendarGridVo5.EZpvd((java.util.ArrayList) listAhwBna);
                    } else {
                        tradingCalendarGridVo5.EZpvd(tradingCalendarGridVo5.copydefault());
                    }
                }
                return arrayList;
            case 1:
                java.lang.String str4 = (java.lang.String) requestTradingCalendarGridUseCase$onExecute$1.L$5;
                java.lang.String str5 = (java.lang.String) requestTradingCalendarGridUseCase$onExecute$1.L$4;
                str = (java.lang.String) requestTradingCalendarGridUseCase$onExecute$1.L$3;
                C40889qgU c40889qgU3 = (C40889qgU) requestTradingCalendarGridUseCase$onExecute$1.L$2;
                java.util.List<TradingCalendarGridVo> list4 = (java.util.List) requestTradingCalendarGridUseCase$onExecute$1.L$1;
                c40951qhd = (C40951qhd) requestTradingCalendarGridUseCase$onExecute$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objOLrzqt);
                    c40951qhd2 = c40951qhd;
                    str3 = str4;
                    list2 = list4;
                    str2 = str5;
                    c40889qgU2 = c40889qgU3;
                    long jLongValue2 = ((java.lang.Number) objOLrzqt).longValue();
                    requestTradingCalendarGridUseCase$onExecute$1.L$0 = c40951qhd2;
                    requestTradingCalendarGridUseCase$onExecute$1.L$1 = list2;
                    requestTradingCalendarGridUseCase$onExecute$1.L$2 = null;
                    requestTradingCalendarGridUseCase$onExecute$1.L$3 = null;
                    requestTradingCalendarGridUseCase$onExecute$1.L$4 = null;
                    requestTradingCalendarGridUseCase$onExecute$1.L$5 = null;
                    requestTradingCalendarGridUseCase$onExecute$1.label = 2;
                    objOLrzqt = c40889qgU2.OLrzqt(str, str3, str2, java.lang.String.valueOf(jLongValue2), requestTradingCalendarGridUseCase$onExecute$1);
                    if (objOLrzqt != objCopydefault) {
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    list2 = list4;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c40951qhd3 = c40951qhd;
                    collection = (java.util.Collection) (!Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                    if (collection != null) {
                    }
                    return list2;
                }
                break;
            case 2:
                list2 = (java.util.List) requestTradingCalendarGridUseCase$onExecute$1.L$1;
                c40951qhd3 = (C40951qhd) requestTradingCalendarGridUseCase$onExecute$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objOLrzqt);
                    objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objOLrzqt);
                    break;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    c40951qhd = c40951qhd3;
                    Result.Application application2222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c40951qhd3 = c40951qhd;
                }
                collection = (java.util.Collection) (!Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (collection != null) {
                    break;
                }
                return list2;
            case 3:
                map = (java.util.Map) requestTradingCalendarGridUseCase$onExecute$1.L$5;
                tradingCalendarPo = (TradingCalendarPo) requestTradingCalendarGridUseCase$onExecute$1.L$4;
                it2 = (java.util.Iterator) requestTradingCalendarGridUseCase$onExecute$1.L$3;
                map2 = (java.util.Map) requestTradingCalendarGridUseCase$onExecute$1.L$2;
                arrayList2 = (java.util.ArrayList) requestTradingCalendarGridUseCase$onExecute$1.L$1;
                c40951qhd4 = (C40951qhd) requestTradingCalendarGridUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                tradingCalendarGridVo = (TradingCalendarGridVo) map.get(objOLrzqt);
                if (tradingCalendarGridVo != null) {
                }
                it = it2;
                map = map2;
                arrayList = arrayList2;
                c40951qhd3 = c40951qhd4;
                while (it.hasNext()) {
                }
                while (r0.hasNext()) {
                }
                return arrayList;
            case 4:
                java.util.ArrayList arrayList5 = (java.util.ArrayList) requestTradingCalendarGridUseCase$onExecute$1.L$6;
                TradingCalendarGridVo tradingCalendarGridVo6 = (TradingCalendarGridVo) requestTradingCalendarGridUseCase$onExecute$1.L$5;
                it2 = (java.util.Iterator) requestTradingCalendarGridUseCase$onExecute$1.L$3;
                map2 = (java.util.Map) requestTradingCalendarGridUseCase$onExecute$1.L$2;
                arrayList2 = (java.util.ArrayList) requestTradingCalendarGridUseCase$onExecute$1.L$1;
                c40951qhd4 = (C40951qhd) requestTradingCalendarGridUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                arrayList5.add(objOLrzqt);
                tradingCalendarGridVo6.copydefault(true);
                it = it2;
                map = map2;
                arrayList = arrayList2;
                c40951qhd3 = c40951qhd4;
                while (it.hasNext()) {
                }
                while (r0.hasNext()) {
                }
                return arrayList;
            case 5:
                map = (java.util.Map) requestTradingCalendarGridUseCase$onExecute$1.L$5;
                tradingCalendarPo2 = (TradingCalendarPo) requestTradingCalendarGridUseCase$onExecute$1.L$4;
                it2 = (java.util.Iterator) requestTradingCalendarGridUseCase$onExecute$1.L$3;
                map2 = (java.util.Map) requestTradingCalendarGridUseCase$onExecute$1.L$2;
                arrayList2 = (java.util.ArrayList) requestTradingCalendarGridUseCase$onExecute$1.L$1;
                c40951qhd4 = (C40951qhd) requestTradingCalendarGridUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                tradingCalendarGridVo2 = (TradingCalendarGridVo) map.get(objOLrzqt);
                if (tradingCalendarGridVo2 != null) {
                }
                it = it2;
                map = map2;
                arrayList = arrayList2;
                c40951qhd3 = c40951qhd4;
                while (it.hasNext()) {
                }
                while (r0.hasNext()) {
                }
                return arrayList;
            case 6:
                arrayListCopydefault = (java.util.ArrayList) requestTradingCalendarGridUseCase$onExecute$1.L$6;
                tradingCalendarGridVo3 = (TradingCalendarGridVo) requestTradingCalendarGridUseCase$onExecute$1.L$5;
                it2 = (java.util.Iterator) requestTradingCalendarGridUseCase$onExecute$1.L$3;
                map2 = (java.util.Map) requestTradingCalendarGridUseCase$onExecute$1.L$2;
                arrayList2 = (java.util.ArrayList) requestTradingCalendarGridUseCase$onExecute$1.L$1;
                c40951qhd4 = (C40951qhd) requestTradingCalendarGridUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                arrayListCopydefault.add(objOLrzqt);
                tradingCalendarGridVo3.copydefault(true);
                it = it2;
                map = map2;
                arrayList = arrayList2;
                c40951qhd3 = c40951qhd4;
                while (it.hasNext()) {
                }
                while (r0.hasNext()) {
                }
                return arrayList;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
