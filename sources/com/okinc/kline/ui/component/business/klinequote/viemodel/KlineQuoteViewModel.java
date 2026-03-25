package com.okinc.kline.ui.component.business.klinequote.viemodel;

import android.animation.ValueAnimator;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.OkxTradePositionBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC36262oVg;
import o.AbstractC39006pkE;
import o.AbstractC54531xLw;
import o.C36236oUh;
import o.C36246oUr;
import o.C39008pkG;
import o.C39104plx;
import o.C39105ply;
import o.C56390yDp;
import o.InterfaceC54581xNr;
import o.oLS;
import o.oLY;
import o.xMS;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineQuoteViewModel extends AbstractC39006pkE {
    public MutableLiveData<ArrayList<HistoryOrderData>> AEQbTJ;
    public MutableLiveData<MarketTypeSelect> AYXKKw;
    public MutableLiveData<TimeIntervalItem> AhwBna;
    public final MutableLiveData<MarketTopInfo> AkhnZx;
    public MutableLiveData<Pair<Boolean, Boolean>> AuCTel;
    public MutableLiveData<Boolean> AuCTelauCTel;
    public MutableLiveData<Boolean> AubY;
    public MutableLiveData<Boolean> AwvSrB;
    public MutableLiveData<Boolean> AxsJAY;
    public MutableLiveData<Boolean> DTwDnp;
    public final MutableLiveData<C39105ply> DbNXlk;
    public MutableLiveData<Boolean> ORxRYg;
    public MutableLiveData<List<PriceWarningItemBean>> OcIXYQ;
    public MutableLiveData<Boolean> QKVWgx;
    public MutableLiveData<Boolean> QOLQEE;
    public MutableLiveData<String> QUSxYX;
    public final String QVAiDq;
    public MutableLiveData<List<oLY>> QbewEr;
    public MutableLiveData<List<oLY>> QfsBiF;
    public MutableLiveData<Boolean> RJOkX;
    public MutableLiveData<ArrayList<OkxTradePositionBean>> RcXXUw;
    public MutableLiveData<List<oLY>> UeEOUB;
    public MutableLiveData<List<String>> aKErDB;
    public MutableLiveData<KlineQuickOrderPriceBean> dNCPSb;
    public MutableLiveData<BizInstrument> djBIcL;
    public MutableLiveData<Integer> djSkpj;
    public MutableLiveData<Boolean> dvKsVJ;
    public MutableLiveData<Boolean> dxcTrN;
    public final String ejfBZ;
    public final MutableLiveData<C39105ply> fARcdN;
    public final MutableLiveData<String> fFgQHt;
    public MutableLiveData<Boolean> fIwbmz;
    public MutableLiveData<ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>>> fJNWhG;
    public MutableLiveData<String> fZBcTu;
    public final MutableLiveData<MarketCoinInfo> fetchVPNInfo;
    public MutableLiveData<KlineSpotAverageBean> finit;
    public MutableLiveData<Boolean> fvQaOB;
    public MutableLiveData<ValueAnimator> gEmmrt;
    public MutableLiveData<Boolean> gHZMYf;
    public MutableLiveData<C39104plx> gasjUx;
    public MutableLiveData<ArrayList<KLineEventBean>> getFieldNames;
    public MutableLiveData<Integer> getNewProxyInstance;
    public MutableLiveData<Boolean> hDKMBd;
    public MutableLiveData<ArrayList<DrawLineData.DrawLineItem>> isConnected;
    public MutableLiveData<Boolean> iwGUEr;
    public MutableLiveData<SourceResp<InterfaceC54581xNr>> sSMYrx;
    public MutableLiveData<Boolean> uzCIH;
    public final C39008pkG values;
    public final String wlaJM;
    public MutableLiveData<Boolean> zLjUOn;
    public MutableLiveData<AbstractC54531xLw> zsXlph;
    public MutableLiveData<List<KlineOpenOrderBean>> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<MarketCoinInfo> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ValueAnimator> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> AkhnZx() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AuCTel() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<PriceWarningItemBean>> AuCTelauCTel() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AubY() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AwvSrB() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> AxsJAY() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<oLY>> DTwDnp() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>>> DbNXlk() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ArrayList<HistoryOrderData>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<KlineQuickOrderPriceBean> ORxRYg() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<oLY>> OcIXYQ() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QKVWgx() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ArrayList<OkxTradePositionBean>> QOLQEE() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<KlineSpotAverageBean> QUSxYX() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Integer> QVAiDq() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> QbewEr() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> QfsBiF() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<String>> RJOkX() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> RcXXUw() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> UeEOUB() {
        return this.fvQaOB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C39104plx> aKErDB() {
        return this.gasjUx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<BizInstrument> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C39105ply> dNCPSb() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ArrayList<DrawLineData.DrawLineItem>> djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ArrayList<KLineEventBean>> fARcdN() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<MarketTopInfo> fFgQHt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AbstractC54531xLw> fIwbmz() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Integer> fJNWhG() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> fZBcTu() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> fetchVPNInfo() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> finit() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<MarketTypeSelect> gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> gHZMYf() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> getFieldNames() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> getNewProxyInstance() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> hDKMBd() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C39105ply> iZzfmt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> iwGUEr() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> sSMYrx() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> uzCIH() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<TimeIntervalItem> valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<Boolean, Boolean>> values() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<KlineOpenOrderBean>> zLjUOn() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> zsXlph() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<oLY>> zuBGHE() {
        return this.QbewEr;
    }

    @yCM
    public KlineQuoteViewModel(@NotNull C39008pkG c39008pkG) {
        Intrinsics.checkNotNullParameter(c39008pkG, "");
        this.values = c39008pkG;
        this.DbNXlk = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.fFgQHt = new MutableLiveData<>();
        this.zsXlph = new MutableLiveData<>();
        this.gHZMYf = new MutableLiveData<>();
        this.AuCTelauCTel = new MutableLiveData<>();
        this.AubY = new MutableLiveData<>();
        this.zLjUOn = new MutableLiveData<>();
        this.sSMYrx = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.fJNWhG = new MutableLiveData<>();
        this.hDKMBd = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.zuBGHE = new MutableLiveData<>();
        this.QKVWgx = new MutableLiveData<>();
        this.AuCTel = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.fvQaOB = new MutableLiveData<>();
        this.fZBcTu = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.getNewProxyInstance = new MutableLiveData<>();
        this.AwvSrB = new MutableLiveData<>();
        this.AxsJAY = new MutableLiveData<>();
        this.fIwbmz = new MutableLiveData<>();
        this.dxcTrN = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.ORxRYg = new MutableLiveData<>();
        this.QUSxYX = new MutableLiveData<>();
        this.QfsBiF = new MutableLiveData<>();
        this.QbewEr = new MutableLiveData<>();
        this.UeEOUB = new MutableLiveData<>();
        this.RcXXUw = new MutableLiveData<>();
        this.dNCPSb = new MutableLiveData<>();
        this.gasjUx = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.dvKsVJ = new MutableLiveData<>();
        this.djSkpj = new MutableLiveData<>();
        this.RJOkX = new MutableLiveData<>();
        this.aKErDB = new MutableLiveData<>();
        this.finit = new MutableLiveData<>();
        this.wlaJM = "initTimeSet";
        this.QVAiDq = "showIndicatorSetting";
        this.ejfBZ = "initChatUpdata";
        this.QOLQEE = new MutableLiveData<>();
        this.DTwDnp = new MutableLiveData<>();
        this.OcIXYQ = new MutableLiveData<>();
        this.getFieldNames = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
    }

    public final void copydefault(@NotNull KlineSpotAverageBean klineSpotAverageBean) {
        Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
        this.finit.setValue(klineSpotAverageBean);
    }

    public final void AxsJAYaxsJAY() {
        this.dvKsVJ.setValue(Boolean.TRUE);
    }

    public final void AEQbTJ(@NotNull MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        this.AYXKKw.postValue(marketTypeSelect);
    }

    public final void AEQbTJ(@NotNull C39104plx c39104plx) {
        Intrinsics.checkNotNullParameter(c39104plx, "");
        this.gasjUx.setValue(c39104plx);
    }

    public final void copydefault(@NotNull ArrayList<OkxTradePositionBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.RcXXUw.postValue(arrayList);
    }

    public final void OLrzqt(@NotNull KlineQuickOrderPriceBean klineQuickOrderPriceBean) {
        Intrinsics.checkNotNullParameter(klineQuickOrderPriceBean, "");
        this.dNCPSb.postValue(klineQuickOrderPriceBean);
    }

    public final void copydefault(@NotNull List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.QbewEr.setValue(list);
    }

    public final void AYXKKw(@NotNull List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.UeEOUB.setValue(list);
    }

    public final void AEQbTJ(@NotNull List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.QfsBiF.setValue(list);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QUSxYX.postValue(str);
    }

    public final void EZpvd(boolean z) {
        this.ORxRYg.postValue(Boolean.valueOf(z));
    }

    public final void copydefault(@NotNull ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        this.gEmmrt.setValue(valueAnimator);
    }

    public final void gkJEwt() {
        this.dxcTrN.postValue(Boolean.TRUE);
    }

    public final void dxcTrN() {
        this.fIwbmz.postValue(Boolean.TRUE);
    }

    public final void gasjUx() {
        this.AxsJAY.postValue(Boolean.TRUE);
    }

    public final void fvQaOB() {
        this.AwvSrB.setValue(Boolean.TRUE);
    }

    public final void KWHzl(int i) {
        this.getNewProxyInstance.setValue(Integer.valueOf(i));
    }

    public final void KWHzl(@NotNull ArrayList<HistoryOrderData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AEQbTJ.setValue(arrayList);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fZBcTu.postValue(str);
    }

    public final void AEQbTJ(@NotNull TimeIntervalItem timeIntervalItem) {
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        this.AhwBna.postValue(timeIntervalItem);
    }

    public final void EZpvd(BizInstrument bizInstrument) {
        if (bizInstrument != null) {
            this.djBIcL.setValue(bizInstrument);
        }
    }

    public final void EZpvd(@NotNull List<KlineOpenOrderBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zuBGHE.setValue(list);
    }

    public static /* synthetic */ void initDataAllSit$default(KlineQuoteViewModel klineQuoteViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        klineQuoteViewModel.OLrzqt(z, z2);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        this.AuCTel.postValue(C56390yDp.OLrzqt(Boolean.valueOf(z), Boolean.valueOf(z2)));
    }

    public final void KWHzl(boolean z) {
        this.hDKMBd.setValue(Boolean.valueOf(z));
    }

    public final void KWHzl(@NotNull List<PriceWarningItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OcIXYQ.setValue(list);
    }

    public final void EZpvd(@NotNull ArrayList<KLineEventBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.getFieldNames.setValue(arrayList);
    }

    public final void copydefault(boolean z) {
        this.QKVWgx.setValue(Boolean.valueOf(z));
    }

    public final void OLrzqt(@NotNull ArrayList<DrawLineData.DrawLineItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.isConnected.postValue(arrayList);
    }

    public final void AEQbTJ(@NotNull ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.fJNWhG.postValue(arrayList);
    }

    public final void copydefault(@NotNull C39105ply c39105ply) {
        Intrinsics.checkNotNullParameter(c39105ply, "");
        this.DbNXlk.postValue(c39105ply);
    }

    public final void KWHzl(@NotNull MarketCoinInfo marketCoinInfo) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        this.fetchVPNInfo.postValue(marketCoinInfo);
    }

    public final void OLrzqt(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        this.AkhnZx.setValue(marketTopInfo);
    }

    public final void KWHzl(@NotNull C39105ply c39105ply) {
        Intrinsics.checkNotNullParameter(c39105ply, "");
        this.fARcdN.postValue(c39105ply);
    }

    public final void dvKsVJ() {
        this.fFgQHt.postValue(this.wlaJM);
    }

    public final void iRxXKY() {
        this.fFgQHt.postValue(this.QVAiDq);
    }

    public final void djSkpj() {
        this.fFgQHt.postValue(this.ejfBZ);
    }

    public final void giSNqX() {
        this.gHZMYf.postValue(Boolean.TRUE);
    }

    public final void hUfVAv() {
        this.fvQaOB.postValue(Boolean.TRUE);
    }

    public final void flVtFt() {
        this.QOLQEE.setValue(Boolean.TRUE);
    }

    public final void gGvvIC() {
        this.DTwDnp.setValue(Boolean.TRUE);
    }

    public final void OLrzqt(@NotNull List<KLineEventBean> list) {
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn;
        Intrinsics.checkNotNullParameter(list, "");
        if (C36236oUh.EZpvd.hDKMBd() && (chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn()) != null) {
            List<oLS> klineEventMergeList = chartViewOutSideConfigZLjUOn.getKlineEventMergeList();
            if (!(klineEventMergeList instanceof Collection) || !klineEventMergeList.isEmpty()) {
                Iterator<T> it = klineEventMergeList.iterator();
                while (it.hasNext()) {
                    if (((oLS) it.next()).EZpvd()) {
                        return;
                    }
                }
            }
            if (list.isEmpty()) {
                return;
            }
            List<oLS> list2 = (List) this.values.EZpvd(list);
            List<oLS> klineEventMergeList2 = chartViewOutSideConfigZLjUOn.getKlineEventMergeList();
            if (!(klineEventMergeList2 instanceof Collection) || !klineEventMergeList2.isEmpty()) {
                Iterator<T> it2 = klineEventMergeList2.iterator();
                while (it2.hasNext()) {
                    if (((oLS) it2.next()).EZpvd()) {
                        return;
                    }
                }
            }
            chartViewOutSideConfigZLjUOn.setKlineEventMergeList(list2);
        }
    }

    public final String wlaJM() {
        BizInstrument bizInstrumentValueOf;
        String instFamily;
        String originPrice;
        xMS xmsGEmmrt;
        String strAhwBna;
        String instId;
        AbstractC54531xLw value = this.zsXlph.getValue();
        if (value != null) {
            BizInstrument value2 = this.djBIcL.getValue();
            if (value2 == null || (instId = value2.getInstId()) == null) {
                instId = "";
            }
            bizInstrumentValueOf = value.valueOf(instId);
        } else {
            bizInstrumentValueOf = null;
        }
        if (bizInstrumentValueOf == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) {
            instFamily = "";
        }
        MarketTopInfo value3 = this.AkhnZx.getValue();
        if (value3 == null || (originPrice = value3.getOriginPrice()) == null) {
            originPrice = "";
        }
        return (value == null || (xmsGEmmrt = value.gEmmrt(instFamily)) == null || (strAhwBna = xmsGEmmrt.AhwBna(originPrice)) == null) ? "" : strAhwBna;
    }
}
