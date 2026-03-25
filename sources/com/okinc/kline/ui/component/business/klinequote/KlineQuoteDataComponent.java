package com.okinc.kline.ui.component.business.klinequote;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.db.bean.DrawingDataEntity;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.DrawingLinesData;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.data.KLineOrderStatusBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.LineDataBean;
import com.okinc.kline.data.LineFibDataBean;
import com.okinc.kline.data.OkxTradePositionBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.ui.component.basic.BaseFragmentDataComponent;
import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.widget.data.TradeMenuItemBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC36262oVg;
import o.AbstractC39028pka;
import o.AbstractC54531xLw;
import o.AbstractC58260yxt;
import o.ActivityC38834pgs;
import o.C31947mJv;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C35964oKf;
import o.C36246oUr;
import o.C37854pDd;
import o.C37895pEr;
import o.C37897pEt;
import o.C37928pFx;
import o.C37932pGa;
import o.C37980pHv;
import o.C39263pox;
import o.C39562pug;
import o.C43248rlh;
import o.C43251rlk;
import o.C54536xML;
import o.C54589xNz;
import o.C54822xWp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56405yEd;
import o.C56407yEf;
import o.C56442yFn;
import o.InterfaceC39499ptW;
import o.InterfaceC39502ptZ;
import o.InterfaceC39563puh;
import o.InterfaceC40387qTz;
import o.InterfaceC43034rhf;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.oLT;
import o.oLY;
import o.oUJ;
import o.pCT;
import o.pCW;
import o.pEF;
import o.pEH;
import o.pEW;
import o.pFP;
import o.pGZ;
import o.pUU;
import o.qTB;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineQuoteDataComponent extends BaseFragmentDataComponent implements InterfaceC39563puh.Application {
    public final int AEQbTJ;
    public InterfaceC39499ptW AYXKKw;
    public final long AhwBna;
    public pGZ AkhnZx;
    public String AuCTel;
    public pCT AuCTelauCTel;
    public String AubY;
    public MarketCoinInfo AwvSrB;
    public InterfaceC39563puh.StateListAnimator AxsJAY;
    public Handler DTwDnp;
    public C39263pox DbNXlk;
    public final int KWHzl;
    public final int OLrzqt;
    public boolean ORxRYg;
    public List<WatchListData> OcIXYQ;
    public C37854pDd QKVWgx;
    public boolean QOLQEE;
    public boolean QUSxYX;
    public KLineOrderStatusBean QVAiDq;
    public ArrayList<TradeAllOrderApi> QbewEr;
    public ArrayList<KlineOpenOrderBean> QfsBiF;
    public List<? extends TradeAllOrderApi> RJOkX;
    public C54822xWp RcXXUw;
    public ArrayList<LineDataBean> UeEOUB;
    public ArrayList<LineFibDataBean> aKErDB;
    public InterfaceC39502ptZ copydefault;
    public String dNCPSb;
    public BizInstrument djBIcL;
    public JsonObject djSkpj;
    public MarketTopInfo dvKsVJ;
    public int dxcTrN;
    public boolean ejfBZ;
    public boolean fARcdN;
    public C37928pFx fFgQHt;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public int fZBcTu;
    public boolean fetchVPNInfo;
    public boolean finit;
    public AbstractC54531xLw gEmmrt;
    public int gHZMYf;
    public boolean getFieldNames;
    public InterfaceC58217yxC getNewProxyInstance;
    public List<? extends TradePositionManager.PositionItem> giSNqX;
    public KlineQuoteViewModel hDKMBd;
    public final MessageQueue.IdleHandler isConnected;
    public boolean iwGUEr;
    public final InterfaceC56387yDm sSMYrx;
    public pCW uzCIH;
    public ArrayList<DrawLineData.DrawLineItem> valueOf;
    public final Runnable values;
    public String wlaJM;
    public boolean zLjUOn;
    public String zsXlph;
    public String zuBGHE;

    public static final class ActionBar extends TypeToken<ArrayList<DrawingLinesData>> {
    }

    public static final class Activity extends TypeToken<ArrayList<DrawingLinesData>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39499ptW AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.gHZMYf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dNCPSb = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull List<WatchListData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OcIXYQ = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull pCT pct) {
        Intrinsics.checkNotNullParameter(pct, "");
        this.AuCTelauCTel = pct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.zLjUOn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(boolean z) {
        this.getFieldNames = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC54531xLw AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.finit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi>, java.util.List<com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi> */
    public final List<TradeAllOrderApi> AwvSrB() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DTwDnp() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(JsonObject jsonObject) {
        this.djSkpj = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull KlineQuoteViewModel klineQuoteViewModel) {
        Intrinsics.checkNotNullParameter(klineQuoteViewModel, "");
        this.hDKMBd = klineQuoteViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(String str) {
        this.AubY = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull pCW pcw) {
        Intrinsics.checkNotNullParameter(pcw, "");
        this.uzCIH = pcw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull C39263pox c39263pox) {
        Intrinsics.checkNotNullParameter(c39263pox, "");
        this.DbNXlk = c39263pox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.ORxRYg = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zuBGHE = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(AbstractC54531xLw abstractC54531xLw) {
        this.gEmmrt = abstractC54531xLw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.ejfBZ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int ORxRYg() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OcIXYQ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QKVWgx() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QOLQEE() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QUSxYX() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QVAiDq() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QbewEr() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.trade.manager.common.position.TradePositionManager$PositionItem>, java.util.List<com.okinc.trade.manager.common.position.TradePositionManager$PositionItem> */
    public final List<TradePositionManager.PositionItem> QfsBiF() {
        return this.giSNqX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37928pFx RJOkX() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean RcXXUw() {
        return this.iwGUEr;
    }

    public final boolean UeEOUB() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean aKErDB() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39502ptZ copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.wlaJM = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull C37854pDd c37854pDd) {
        Intrinsics.checkNotNullParameter(c37854pDd, "");
        this.QKVWgx = c37854pDd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull pGZ pgz) {
        Intrinsics.checkNotNullParameter(pgz, "");
        this.AkhnZx = pgz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC39502ptZ interfaceC39502ptZ) {
        this.copydefault = interfaceC39502ptZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull C54822xWp c54822xWp) {
        Intrinsics.checkNotNullParameter(c54822xWp, "");
        this.RcXXUw = c54822xWp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.fARcdN = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull List<? extends TradeAllOrderApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.RJOkX = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC fetchVPNInfo() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo(@NotNull List<? extends TradePositionManager.PositionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.giSNqX = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        this.iwGUEr = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gHZMYf() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCoinInfo hDKMBd() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int iwGUEr() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KLineOrderStatusBean sSMYrx() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39563puh.StateListAnimator uzCIH() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean wlaJM() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Handler zLjUOn() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WatchListData> zsXlph() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject zuBGHE() {
        return this.djSkpj;
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    public static final class StateListAnimator<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    public static final class TaskDescription<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    public KlineQuoteDataComponent() {
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        this.QUSxYX = !((OKComplianceRestrictionService) c43248rlh.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.BANNER);
        this.QOLQEE = !((OKComplianceRestrictionService) c43248rlh.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.RISK_BANNER);
        this.dNCPSb = "";
        this.iwGUEr = true;
        this.KWHzl = 1;
        this.OLrzqt = 2;
        this.fZBcTu = Color.parseColor("#F9F9F9");
        this.dxcTrN = Color.parseColor("#000000");
        this.AhwBna = 350L;
        this.valueOf = new ArrayList<>();
        this.UeEOUB = new ArrayList<>();
        this.aKErDB = new ArrayList<>();
        this.OcIXYQ = yDY.AhwBna();
        this.fARcdN = true;
        this.QVAiDq = new KLineOrderStatusBean();
        this.RJOkX = new ArrayList();
        this.QbewEr = new ArrayList<>();
        this.QfsBiF = new ArrayList<>();
        this.giSNqX = new ArrayList();
        this.fFgQHt = new C37928pFx();
        this.isConnected = new MessageQueue.IdleHandler() { // from class: o.plf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return KlineQuoteDataComponent.AhwBna(this.EZpvd);
            }
        };
        this.zuBGHE = "TYPE_KLINE";
        this.sSMYrx = C56392yDr.copydefault(new Function0() { // from class: o.pli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KlineQuoteDataComponent.AYXKKw(this.OLrzqt);
            }
        });
        this.DTwDnp = new Handler(Looper.getMainLooper());
        this.values = new Runnable() { // from class: o.plh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                KlineQuoteDataComponent.djBIcL(this.EZpvd);
            }
        };
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull String str, @NotNull List<? extends oLY> list) {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this, str, list);
    }

    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull ArrayList<MarketCoinInfo> arrayList) {
        InterfaceC39563puh.Application.C0921Application.EZpvd((InterfaceC39563puh.Application) this, arrayList);
    }

    @Override // o.InterfaceC39563puh.Application
    public void valueOf() {
        InterfaceC39563puh.Application.C0921Application.EZpvd(this);
    }

    public final KlineQuoteViewModel values() {
        KlineQuoteViewModel klineQuoteViewModel = this.hDKMBd;
        if (klineQuoteViewModel != null) {
            return klineQuoteViewModel;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final pCT ejfBZ() {
        pCT pct = this.AuCTelauCTel;
        if (pct != null) {
            return pct;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C54822xWp AxsJAY() {
        C54822xWp c54822xWp = this.RcXXUw;
        if (c54822xWp != null) {
            return c54822xWp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C37854pDd AubY() {
        C37854pDd c37854pDd = this.QKVWgx;
        if (c37854pDd != null) {
            return c37854pDd;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C39263pox gEmmrt() {
        C39263pox c39263pox = this.DbNXlk;
        if (c39263pox != null) {
            return c39263pox;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final pCW AkhnZx() {
        pCW pcw = this.uzCIH;
        if (pcw != null) {
            return pcw;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final pGZ djBIcL() {
        pGZ pgz = this.AkhnZx;
        if (pgz != null) {
            return pgz;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void copydefault(MarketCoinInfo marketCoinInfo) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        this.AwvSrB = marketCoinInfo;
        this.djBIcL = (marketCoinInfo == null || (interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault()) == null) ? null : InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null);
    }

    public static final boolean AhwBna(KlineQuoteDataComponent klineQuoteDataComponent) {
        pEH.copydefault.EZpvd(klineQuoteDataComponent.AkhnZx().OLrzqt(), false);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC40387qTz fFgQHt() {
        return ((qTB) C43251rlk.copydefault(qTB.class)).copydefault();
    }

    public final ArrayList<TradeMenuItemBean> getFieldNames() {
        return (ArrayList) this.sSMYrx.getValue();
    }

    public static final ArrayList AYXKKw(KlineQuoteDataComponent klineQuoteDataComponent) {
        String string = klineQuoteDataComponent.OLrzqt().getResources().getString(C35964oKf.Fragment.zOIQXb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TradeMenuItemBean tradeMenuItemBean = new TradeMenuItemBean(string, Intrinsics.EZpvd((Object) klineQuoteDataComponent.zuBGHE, (Object) "TYPE_KLINE"), Integer.valueOf(klineQuoteDataComponent.AEQbTJ), null, false, null, 56, null);
        String string2 = klineQuoteDataComponent.OLrzqt().getResources().getString(C35964oKf.Fragment.hlkKmr);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TradeMenuItemBean tradeMenuItemBean2 = new TradeMenuItemBean(string2, Intrinsics.EZpvd((Object) klineQuoteDataComponent.zuBGHE, (Object) "TYPE_MARK_PRICE_KLINE"), Integer.valueOf(klineQuoteDataComponent.KWHzl), null, false, null, 56, null);
        String string3 = klineQuoteDataComponent.OLrzqt().getResources().getString(C35964oKf.Fragment.DGUQLIhJrIAr);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return yDY.copydefault(tradeMenuItemBean, tradeMenuItemBean2, new TradeMenuItemBean(string3, Intrinsics.EZpvd((Object) klineQuoteDataComponent.zuBGHE, (Object) "TYPE_INDEX_KLINE"), Integer.valueOf(klineQuoteDataComponent.OLrzqt), null, false, null, 56, null));
    }

    public static /* synthetic */ void bizObserver$default(KlineQuoteDataComponent klineQuoteDataComponent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        klineQuoteDataComponent.EZpvd(z);
    }

    public final void EZpvd(final boolean z) {
        AbstractC54531xLw abstractC54531xLw;
        copydefault(this.gEmmrt, z);
        String str = this.AubY;
        if (str != null) {
            AbstractC54531xLw abstractC54531xLw2 = this.gEmmrt;
            if ((abstractC54531xLw2 != null ? abstractC54531xLw2.valueOf(str) : null) != null || (abstractC54531xLw = this.gEmmrt) == null) {
                return;
            }
            abstractC54531xLw.AEQbTJ(str, new Function1() { // from class: o.pln
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return KlineQuoteDataComponent.AEQbTJ(this.AEQbTJ, z, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(KlineQuoteDataComponent klineQuoteDataComponent, boolean z, boolean z2) {
        if (z2) {
            klineQuoteDataComponent.copydefault(klineQuoteDataComponent.gEmmrt, z);
        }
        pUU.copydefault("BaseKlineFragment", "重新拉取新币信息: " + z2);
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        InterfaceC39499ptW interfaceC39499ptW;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onStart(lifecycleOwner);
        if (!(OLrzqt().getActivity() instanceof ActivityC38834pgs)) {
            KeyEventDispatcher.Component activity = OLrzqt().getActivity();
            Intrinsics.copydefault(activity, "");
            interfaceC39499ptW = (InterfaceC39499ptW) activity;
        } else {
            AbstractC39028pka abstractC39028pkaOLrzqt = OLrzqt();
            boolean z = abstractC39028pkaOLrzqt instanceof InterfaceC39499ptW;
            Object obj = abstractC39028pkaOLrzqt;
            if (!z) {
                Fragment parentFragment = abstractC39028pkaOLrzqt.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof InterfaceC39499ptW)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                boolean z2 = parentFragment instanceof InterfaceC39499ptW;
                Object obj2 = parentFragment;
                if (!z2) {
                    obj2 = null;
                }
                obj = (InterfaceC39499ptW) obj2;
            }
            interfaceC39499ptW = (InterfaceC39499ptW) obj;
        }
        this.AYXKKw = interfaceC39499ptW;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Bundle arguments = OLrzqt().getArguments();
        this.AubY = arguments != null ? arguments.getString(oLT.gEmmrt()) : null;
        Bundle arguments2 = OLrzqt().getArguments();
        this.wlaJM = arguments2 != null ? arguments2.getString(oLT.valueOf()) : null;
        Bundle arguments3 = OLrzqt().getArguments();
        this.fJNWhG = arguments3 != null ? arguments3.getBoolean(oLT.AhwBna(), false) : false;
        Bundle arguments4 = OLrzqt().getArguments();
        this.AuCTel = arguments4 != null ? arguments4.getString("tag") : null;
        Bundle arguments5 = OLrzqt().getArguments();
        this.fARcdN = arguments5 != null ? arguments5.getBoolean(oLT.values(), true) : true;
        String str = this.AubY;
        if (str != null && this.wlaJM != null) {
            Intrinsics.copydefault((Object) str);
            String str2 = this.wlaJM;
            Intrinsics.copydefault((Object) str2);
            copydefault(new MarketCoinInfo(str, str2, (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null));
        }
        this.AxsJAY = new C39562pug(this, this.AwvSrB, false, false, 12, null);
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        this.fetchVPNInfo = false;
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.AxsJAY;
        if (stateListAnimator != null) {
            stateListAnimator.AYXKKw();
        }
        pUU.KWHzl("KlinePageInit", "quote component resume, coin is " + this.AwvSrB);
        MarketCoinInfo marketCoinInfo = this.AwvSrB;
        if (marketCoinInfo != null) {
            if (!Intrinsics.EZpvd((Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (Object) "INDEX")) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(OLrzqt()), null, null, new AnonymousClass1(null), 3, null);
            } else {
                initData$default(this, null, false, 2, null);
            }
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("app_kline_page_view", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.plm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KlineQuoteDataComponent.copydefault(this.copydefault, (EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent$onResume$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KlineQuoteDataComponent.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM8790ensureInitialize0E7RQCE$default;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                this.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
                KlineQuoteDataComponent.loadBiz$default(KlineQuoteDataComponent.this, objM8790ensureInitialize0E7RQCE$default, false, 2, null);
                pUU.KWHzl("KlinePageInit", "component ensureInitialize success");
            } else {
                KlineQuoteDataComponent.this.gwTjWJ();
                pUU.copydefault("KlinePageInit", "component ensureInitialize failed");
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit copydefault(KlineQuoteDataComponent klineQuoteDataComponent, EventParamsList eventParamsList) {
        String instrumentType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        MarketCoinInfo marketCoinInfo = klineQuoteDataComponent.AwvSrB;
        if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
            instrumentType = "-";
        }
        eventParamsList.put("biztype", instrumentType, true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadBiz$default(KlineQuoteDataComponent klineQuoteDataComponent, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        klineQuoteDataComponent.EZpvd(obj, z);
    }

    public final void EZpvd(@NotNull Object obj, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineQuoteDataComponent$loadBiz$1(this, obj, z, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onPause(lifecycleOwner);
        this.fetchVPNInfo = true;
        pUU.copydefault("BaseKline------", EopTrackEvent.ONPAUSE);
        finit();
        dvKsVJ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onDestroy(lifecycleOwner);
        pUU.copydefault("BaseKline------", "onDestroy");
        boolean z = this.fetchVPNInfo;
        if (!z) {
            pUU.copydefault("BaseKline------", "hasPause = " + z);
            finit();
        }
        Looper.myQueue().removeIdleHandler(this.isConnected);
    }

    private final void dvKsVJ() {
        this.QVAiDq.setNeedRelevanceCost(false);
        this.QVAiDq.setCost(false);
        this.QVAiDq.setTP(true);
    }

    private final void finit() {
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.AxsJAY;
        if (stateListAnimator != null) {
            stateListAnimator.gEmmrt();
        }
        InterfaceC39499ptW interfaceC39499ptW = this.AYXKKw;
        if (interfaceC39499ptW != null) {
            interfaceC39499ptW.copydefault(null);
        }
    }

    public static /* synthetic */ void initData$default(KlineQuoteDataComponent klineQuoteDataComponent, AbstractC54531xLw abstractC54531xLw, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        klineQuoteDataComponent.copydefault(abstractC54531xLw, z);
    }

    public final void copydefault(AbstractC54531xLw abstractC54531xLw, boolean z) {
        String instFamily;
        pUU.KWHzl("KlinePageInit", "coin is " + this.AwvSrB + ", call initDataAllSit");
        MarketCoinInfo marketCoinInfo = this.AwvSrB;
        if (marketCoinInfo != null) {
            if (abstractC54531xLw != null) {
                String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                Intrinsics.copydefault((Object) instrumentId);
                BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
                    this.zsXlph = instFamily;
                }
                if (bizInstrumentValueOf != null) {
                    values().EZpvd(bizInstrumentValueOf);
                }
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator = this.AxsJAY;
            if (stateListAnimator != null) {
                stateListAnimator.AEQbTJ(abstractC54531xLw);
            }
            InterfaceC39563puh.StateListAnimator stateListAnimator2 = this.AxsJAY;
            if (stateListAnimator2 != null) {
                MarketCoinInfo marketCoinInfo2 = this.AwvSrB;
                Intrinsics.copydefault(marketCoinInfo2);
                stateListAnimator2.AEQbTJ(marketCoinInfo2);
            }
            values().OLrzqt(true, z);
        }
    }

    public final void EZpvd(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "0";
            AbstractC58260yxt<List<DrawingDataEntity>> abstractC58260yxtCopydefault = new C31947mJv().copydefault(str);
            if (abstractC58260yxtCopydefault != null) {
                final Function1 function1 = new Function1() { // from class: o.plj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return KlineQuoteDataComponent.KWHzl(objectRef, this, str, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.plk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        KlineQuoteDataComponent.AYXKKw(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.pll
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return KlineQuoteDataComponent.OLrzqt(objectRef, this, str, (java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.plq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        KlineQuoteDataComponent.AhwBna(function12, obj);
                    }
                });
                return;
            }
            return;
        }
        ODXsMY();
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final Unit KWHzl(Ref.ObjectRef objectRef, KlineQuoteDataComponent klineQuoteDataComponent, String str, List list) {
        String str2 = "0";
        if (C33129mqd.KWHzl((Collection) list)) {
            objectRef.element = ((DrawingDataEntity) list.get(0)).getTimeVersion();
        } else {
            objectRef.element = "0";
        }
        InterfaceC39563puh.StateListAnimator stateListAnimator = klineQuoteDataComponent.AxsJAY;
        if (stateListAnimator != null) {
            AbstractC39028pka abstractC39028pkaOLrzqt = klineQuoteDataComponent.OLrzqt();
            CharSequence charSequence = (CharSequence) objectRef.element;
            if (charSequence != null && charSequence.length() != 0) {
                str2 = (String) objectRef.element;
            }
            stateListAnimator.EZpvd(abstractC39028pkaOLrzqt, str, str2);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, KlineQuoteDataComponent klineQuoteDataComponent, String str, Throwable th) {
        objectRef.element = "0";
        InterfaceC39563puh.StateListAnimator stateListAnimator = klineQuoteDataComponent.AxsJAY;
        if (stateListAnimator != null) {
            stateListAnimator.EZpvd(klineQuoteDataComponent.OLrzqt(), str, (String) objectRef.element);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        this.dvKsVJ = marketTopInfo;
        ejfBZ().AEQbTJ(marketTopInfo);
        AxsJAY().djBIcL().setValue(marketTopInfo.getOriginPrice());
        AxsJAY().copydefault(marketTopInfo.getOriginPrice(), marketTopInfo.getTIncrease());
        values().OLrzqt(marketTopInfo);
        InterfaceC39502ptZ interfaceC39502ptZ = this.copydefault;
        if (interfaceC39502ptZ != null) {
            interfaceC39502ptZ.AEQbTJ(marketTopInfo);
            interfaceC39502ptZ.dUDNAs();
        }
        MutableLiveData<Boolean> mutableLiveDataFZBcTu = values().fZBcTu();
        Boolean bool = Boolean.TRUE;
        mutableLiveDataFZBcTu.setValue(bool);
        if (Intrinsics.EZpvd(values().finit().getValue(), bool)) {
            pUU.KWHzl("KlinePageInit", "showTopInfo, dismiss loading");
            values().EZpvd(false);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    @Override // o.InterfaceC39563puh.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AYXKKw(@NotNull List<? extends oLY> list) {
        BizInstrument bizInstrumentValueOf;
        AbstractC54531xLw abstractC54531xLw;
        Intrinsics.checkNotNullParameter(list, "");
        if (C36246oUr.copydefault().spnCvw() && C36246oUr.copydefault().zLjUOn().isFastKLineMode()) {
            this.fIwbmz = true;
        }
        values().AEQbTJ(list);
        if (C36246oUr.copydefault().zLjUOn().isCeFiMCapMode()) {
            return;
        }
        oLY oly = (oLY) CollectionsKt___CollectionsKt.wlaJM(list);
        if (oly != null) {
            AbstractC54531xLw abstractC54531xLw2 = this.gEmmrt;
            if (abstractC54531xLw2 != null) {
                MarketCoinInfo marketCoinInfo = this.AwvSrB;
                String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                Intrinsics.copydefault((Object) instrumentId);
                bizInstrumentValueOf = abstractC54531xLw2.valueOf(instrumentId);
            } else {
                bizInstrumentValueOf = null;
            }
            String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
            Intrinsics.copydefault((Object) instFamily);
            MarketTopInfo marketTopInfo = this.dvKsVJ;
            if (marketTopInfo != null && (abstractC54531xLw = this.gEmmrt) != null && Intrinsics.EZpvd((Object) this.zuBGHE, (Object) "TYPE_KLINE")) {
                MarketCoinInfo marketCoinInfo2 = this.AwvSrB;
                String instrumentType = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
                if (instrumentType != null) {
                    switch (instrumentType.hashCode()) {
                        case -2027980370:
                            if (instrumentType.equals("MARGIN")) {
                                marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(C33129mqd.gEmmrt(Double.valueOf(oly.AEQbTJ))).djBIcL().AEQbTJ(true), false, 1, null));
                            }
                            break;
                        case 2552066:
                            if (instrumentType.equals("SPOT")) {
                            }
                            break;
                        case 2558355:
                            if (instrumentType.equals("SWAP")) {
                                marketTopInfo.setTPrice(C54536xML.toSafeString$default(abstractC54531xLw.gEmmrt(instFamily).AYXKKw(C33129mqd.gEmmrt(Double.valueOf(oly.AEQbTJ))).AkhnZx().isConnected().AEQbTJ(true).djBIcL(), false, 1, null));
                            }
                            break;
                        case 214415088:
                            if (instrumentType.equals("FUTURES")) {
                            }
                            break;
                    }
                }
                AEQbTJ(marketTopInfo);
            }
        }
        if (C33129mqd.KWHzl((Collection) list) && this.fIwbmz) {
            getSubIndicator$default(this, null, 1, null);
            this.fIwbmz = false;
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        values().copydefault(list);
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && (!list.isEmpty())) {
            AkhnZx(C56405yEd.hDKMBd(list));
        }
        getSubIndicator$default(this, null, 1, null);
    }

    @Override // o.InterfaceC39563puh.Application
    public void valueOf(@NotNull List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        values().AYXKKw(list);
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && (!list.isEmpty())) {
            AkhnZx(C56405yEd.hDKMBd(list));
        }
        getSubIndicator$default(this, null, 1, null);
    }

    @Override // o.InterfaceC39563puh.Application
    public void gwTjWJ() {
        values().OLrzqt("notNet");
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull KlineSpotAverageBean klineSpotAverageBean) {
        Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
        if (this.finit) {
            return;
        }
        values().copydefault(klineSpotAverageBean);
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull ArrayList<OkxTradePositionBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (this.finit) {
            return;
        }
        MarketCoinInfo marketCoinInfo = this.AwvSrB;
        if (Intrinsics.EZpvd((Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null), (Object) "SPOT")) {
            return;
        }
        values().copydefault(arrayList);
    }

    @Override // o.InterfaceC39563puh.Application
    public void gEmmrt(@NotNull List<? extends TradePositionManager.PositionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.finit) {
            return;
        }
        this.giSNqX = list;
        ejfBZ().copydefault(list);
    }

    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull List<KlineOpenOrderBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.QfsBiF = (ArrayList) list;
        if (this.finit) {
            return;
        }
        values().EZpvd(list);
        if (this.QVAiDq.isNeedRelevanceCost()) {
            if (this.QVAiDq.isCost()) {
                C37932pGa.AEQbTJ.AEQbTJ(this.fFgQHt.AEQbTJ(this.QVAiDq.getOrdId()));
            } else {
                C37932pGa.AEQbTJ.EZpvd(this.fFgQHt.copydefault(this.QVAiDq.getOrdId()));
            }
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull List<? extends TradeAllOrderApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.QbewEr = (ArrayList) list;
        if (this.finit) {
            return;
        }
        this.RJOkX = list;
        ejfBZ().OLrzqt(list);
    }

    @Override // o.InterfaceC39563puh.Application
    public void values(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        values().KWHzl(str);
    }

    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull ArrayList<HistoryOrderData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        values().KWHzl(arrayList);
    }

    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.dvKsVJ != null) {
            values().EZpvd(false);
            pUU.KWHzl("KlinePageInit", "setCandleData, dismiss loading");
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && (!list.isEmpty())) {
            AkhnZx(list);
            final DrawLineBean drawLineBeanAEQbTJ = oUJ.KWHzl.AEQbTJ();
            if (drawLineBeanAEQbTJ != null) {
                DrawLineData.copydefault.OLrzqt(new Function1() { // from class: o.pld
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return KlineQuoteDataComponent.copydefault(drawLineBeanAEQbTJ, (java.util.ArrayList) obj);
                    }
                });
            }
        }
        getSubIndicator$default(this, null, 1, null);
        values(list);
        AkhnZx().EZpvd(C33129mqd.divS$default(Long.valueOf(System.currentTimeMillis()), 1000, null, null, null, 14, null));
        View view = OLrzqt().getView();
        if (view != null) {
            view.post(this.values);
        }
    }

    public static final Unit KWHzl(DrawLineData.DrawLineItem drawLineItem, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("app_drawing_tool_type", C33129mqd.gEmmrt(drawLineItem.getLineType().getStrName()), true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        return Unit.INSTANCE;
    }

    private final void values(List<? extends oLY> list) {
        if (C36246oUr.copydefault().DcqEDu() || C36246oUr.copydefault().DNMMPQ()) {
            ArrayList<KLineEventBean> value = values().fARcdN().getValue();
            if ((value == null || value.isEmpty()) && (!list.isEmpty())) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineQuoteDataComponent$getKlineEventList$1(this, list, null), 3, null);
            }
        }
    }

    private final void AkhnZx(List<? extends oLY> list) {
        Integer value = values().QVAiDq().getValue();
        if (value != null) {
            int iIntValue = value.intValue();
            String strGEmmrt = C33129mqd.gEmmrt(Long.valueOf(((oLY) CollectionsKt___CollectionsKt.AubY(list)).EZpvd));
            String strAddS$default = C33129mqd.addS$default(strGEmmrt, Long.valueOf(pEW.EZpvd.AEQbTJ(iIntValue)), null, null, null, 14, null);
            InterfaceC39563puh.StateListAnimator stateListAnimator = this.AxsJAY;
            if (stateListAnimator != null) {
                pEF pef = pEF.OLrzqt;
                stateListAnimator.KWHzl(this, pef.copydefault(iIntValue), pef.KWHzl(), strGEmmrt, strAddS$default);
            }
        }
    }

    public static final void djBIcL(KlineQuoteDataComponent klineQuoteDataComponent) {
        Looper.myQueue().removeIdleHandler(klineQuoteDataComponent.isConnected);
        Looper.myQueue().addIdleHandler(klineQuoteDataComponent.isConnected);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getSubIndicator$default(KlineQuoteDataComponent klineQuoteDataComponent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        klineQuoteDataComponent.KWHzl((List<String>) list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [740=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void KWHzl(List<String> list) {
        String str = this.AubY;
        if (str != null) {
            C39263pox c39263poxGEmmrt = gEmmrt();
            String str2 = this.wlaJM;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = this.AubY;
            if (str4 == null) {
                str4 = "";
            }
            Integer numKWHzl = c39263poxGEmmrt.KWHzl(str2, str4);
            if (numKWHzl != null) {
                int iIntValue = numKWHzl.intValue();
                if (list == null) {
                    list = values().RJOkX().getValue();
                }
                if (list != null) {
                    for (String str5 : list) {
                        switch (str5.hashCode()) {
                            case -2040464843:
                                if (str5.equals("LSAcco")) {
                                    str3 = ((Object) str3) + "eliteLSAccountRatio,";
                                }
                                break;
                            case 2522:
                                if (str5.equals("OI")) {
                                    str3 = ((Object) str3) + "oi,";
                                }
                                break;
                            case 63511234:
                                if (str5.equals("BSVol")) {
                                    str3 = ((Object) str3) + "takerBuySellVol,";
                                }
                                break;
                            case 72740685:
                                if (str5.equals("LSPos")) {
                                    str3 = ((Object) str3) + "eliteLSOIRatio,";
                                }
                                break;
                            case 1185755844:
                                if (str5.equals("LSRatio")) {
                                    str3 = ((Object) str3) + "LSAccountRatio,";
                                }
                                break;
                        }
                    }
                    if (str3.length() == 0) {
                        return;
                    }
                    C39263pox c39263poxGEmmrt2 = gEmmrt();
                    AbstractC39028pka abstractC39028pkaOLrzqt = OLrzqt();
                    C37980pHv c37980pHv = C37980pHv.OLrzqt;
                    Integer value = values().QVAiDq().getValue();
                    c39263poxGEmmrt2.KWHzl(abstractC39028pkaOLrzqt, str, str3, iIntValue, 1440, c37980pHv.AEQbTJ(value != null ? value.intValue() : 0));
                }
            }
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void RKDWNf() {
        values().OLrzqt("empty");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.ArrayList] */
    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull final DrawingDataBean drawingDataBean) {
        Intrinsics.checkNotNullParameter(drawingDataBean, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = C37897pEt.KWHzl.copydefault(drawingDataBean, true);
        this.UeEOUB.clear();
        this.aKErDB.clear();
        DrawLineData.copydefault.AEQbTJ(new Function1() { // from class: o.plo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KlineQuoteDataComponent.OLrzqt(this.AEQbTJ, objectRef, drawingDataBean, (java.util.ArrayList) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.util.ArrayList] */
    public static final Unit OLrzqt(KlineQuoteDataComponent klineQuoteDataComponent, Ref.ObjectRef objectRef, DrawingDataBean drawingDataBean, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        klineQuoteDataComponent.valueOf = arrayList;
        if (C33129mqd.KWHzl((Collection) arrayList)) {
            int i = 0;
            for (Object obj : klineQuoteDataComponent.valueOf) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
                if (drawLineItem.getIndexId().length() == 0) {
                    drawLineItem.setIndexId(C37897pEt.KWHzl.copydefault(System.currentTimeMillis() + ((long) i)));
                }
                i++;
            }
            C37895pEr c37895pEr = C37895pEr.copydefault;
            ?? AEQbTJ = c37895pEr.AEQbTJ((ArrayList<DrawLineData.DrawLineItem>) objectRef.element, klineQuoteDataComponent.valueOf);
            objectRef.element = AEQbTJ;
            AEQbTJ.addAll(klineQuoteDataComponent.valueOf);
            if (((ArrayList) objectRef.element).size() > c37895pEr.EZpvd()) {
                if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                    List list = (List) objectRef.element;
                    if (list.size() > 1) {
                        C56407yEf.copydefault(list, new TaskDescription());
                    }
                    int size = ((ArrayList) objectRef.element).size();
                    int iEZpvd = c37895pEr.EZpvd();
                    for (int i2 = 0; i2 < size - iEZpvd; i2++) {
                        ((DrawLineData.DrawLineItem) ((ArrayList) objectRef.element).get(i2)).setDelete(true);
                    }
                    uploadDrawingData$default(klineQuoteDataComponent, (ArrayList) objectRef.element, false, false, 6, null);
                }
            } else {
                uploadDrawingData$default(klineQuoteDataComponent, (ArrayList) objectRef.element, false, false, 6, null);
            }
        }
        C37895pEr c37895pEr2 = C37895pEr.copydefault;
        ArrayList<DrawLineData.DrawLineItem> arrayList2 = (ArrayList) objectRef.element;
        String timeVersion = drawingDataBean.getTimeVersion();
        String str = klineQuoteDataComponent.AubY;
        c37895pEr2.AEQbTJ(arrayList2, timeVersion, str == null ? "" : str, klineQuoteDataComponent.UeEOUB, klineQuoteDataComponent.aKErDB);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(klineQuoteDataComponent), null, null, new KlineQuoteDataComponent$setDrawgingData$1$3(objectRef, klineQuoteDataComponent, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.Application
    public void ODXsMY() {
        final String str = this.AubY;
        if (str != null) {
            DrawLineData.copydefault.AEQbTJ(new Function1() { // from class: o.pkX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return KlineQuoteDataComponent.KWHzl(this.EZpvd, str, (java.util.ArrayList) obj);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    public static final Unit KWHzl(final KlineQuoteDataComponent klineQuoteDataComponent, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        klineQuoteDataComponent.valueOf = arrayList;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new ArrayList();
        klineQuoteDataComponent.UeEOUB.clear();
        klineQuoteDataComponent.aKErDB.clear();
        if (C33129mqd.KWHzl((Collection) klineQuoteDataComponent.valueOf)) {
            AbstractC58260yxt<List<DrawingDataEntity>> abstractC58260yxtCopydefault = new C31947mJv().copydefault(str);
            if (abstractC58260yxtCopydefault != null) {
                final Function1 function1 = new Function1() { // from class: o.plr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return KlineQuoteDataComponent.EZpvd(objectRef, klineQuoteDataComponent, objectRef2, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.plu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        KlineQuoteDataComponent.gEmmrt(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.pls
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return KlineQuoteDataComponent.OLrzqt(this.EZpvd, (java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.plv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        KlineQuoteDataComponent.djBIcL(function12, obj);
                    }
                });
            }
        } else {
            AbstractC58260yxt<List<DrawingDataEntity>> abstractC58260yxtCopydefault2 = new C31947mJv().copydefault(str);
            if (abstractC58260yxtCopydefault2 != null) {
                final Function1 function13 = new Function1() { // from class: o.plt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return KlineQuoteDataComponent.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super List<DrawingDataEntity>> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.plc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        KlineQuoteDataComponent.DbNXlk(function13, obj);
                    }
                };
                final Function1 function14 = new Function1() { // from class: o.plg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return KlineQuoteDataComponent.KWHzl((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.ple
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        KlineQuoteDataComponent.fetchVPNInfo(function14, obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.util.ArrayList] */
    public static final Unit EZpvd(Ref.ObjectRef objectRef, KlineQuoteDataComponent klineQuoteDataComponent, Ref.ObjectRef objectRef2, List list) {
        if (C33129mqd.KWHzl((Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new Activity().getType()));
            ?? Copydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            objectRef.element = Copydefault;
            Copydefault.removeAll(klineQuoteDataComponent.valueOf);
            ((ArrayList) objectRef2.element).addAll((Collection) objectRef.element);
            ((ArrayList) objectRef2.element).addAll(klineQuoteDataComponent.valueOf);
            int size = ((ArrayList) objectRef2.element).size();
            C37895pEr c37895pEr = C37895pEr.copydefault;
            if (size > c37895pEr.EZpvd()) {
                if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                    List list2 = (List) objectRef2.element;
                    if (list2.size() > 1) {
                        C56407yEf.copydefault(list2, new StateListAnimator());
                    }
                    int size2 = ((ArrayList) objectRef2.element).size();
                    int iEZpvd = c37895pEr.EZpvd();
                    for (int i = 0; i < size2 - iEZpvd; i++) {
                        Object obj = ((ArrayList) objectRef2.element).get(i);
                        Intrinsics.checkNotNullExpressionValue(obj, "");
                        DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
                        drawLineItem.setDelete(true);
                        DrawLineData drawLineData = DrawLineData.copydefault;
                        drawLineData.EZpvd().remove(drawLineItem);
                        drawLineData.EZpvd().add(drawLineItem);
                        klineQuoteDataComponent.valueOf.remove(drawLineItem);
                    }
                    DrawLineData drawLineData2 = DrawLineData.copydefault;
                    drawLineData2.EZpvd(drawLineData2.EZpvd());
                } else {
                    klineQuoteDataComponent.values().OLrzqt((ArrayList<DrawLineData.DrawLineItem>) objectRef2.element);
                    return Unit.INSTANCE;
                }
            }
            if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null) || !SPUtils.getBoolean("kline_drawing_data", true)) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(klineQuoteDataComponent), null, null, new KlineQuoteDataComponent$useLocalDrawgingData$1$1$1$3(objectRef2, klineQuoteDataComponent, null), 3, null);
            } else {
                uploadDrawingData$default(klineQuoteDataComponent, klineQuoteDataComponent.valueOf, false, false, 6, null);
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                ArrayList<DrawLineData.DrawLineItem> arrayList = (ArrayList) objectRef2.element;
                String timeVersion = drawingDataBean.getTimeVersion();
                String str = klineQuoteDataComponent.AubY;
                c37895pEr2.AEQbTJ(arrayList, timeVersion, str == null ? "" : str, klineQuoteDataComponent.UeEOUB, klineQuoteDataComponent.aKErDB);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(klineQuoteDataComponent), null, null, new KlineQuoteDataComponent$useLocalDrawgingData$1$1$1$2(objectRef2, klineQuoteDataComponent, null), 3, null);
            }
        } else {
            klineQuoteDataComponent.fZBcTu();
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(KlineQuoteDataComponent klineQuoteDataComponent, Throwable th) {
        klineQuoteDataComponent.fZBcTu();
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(KlineQuoteDataComponent klineQuoteDataComponent, List list) {
        if (C33129mqd.KWHzl((Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new ActionBar().getType()));
            ArrayList<DrawLineData.DrawLineItem> arrayListCopydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            int size = arrayListCopydefault.size();
            C37895pEr c37895pEr = C37895pEr.copydefault;
            if (size > c37895pEr.EZpvd() && SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                if (arrayListCopydefault.size() > 1) {
                    C56407yEf.copydefault(arrayListCopydefault, new Application());
                }
                int size2 = arrayListCopydefault.size();
                int iEZpvd = c37895pEr.EZpvd();
                for (int i = 0; i < size2 - iEZpvd; i++) {
                    arrayListCopydefault.get(i).setDelete(true);
                }
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                String str = klineQuoteDataComponent.AubY;
                if (str == null) {
                    str = "";
                }
                c37895pEr2.AEQbTJ(arrayListCopydefault, "0", str, klineQuoteDataComponent.UeEOUB, klineQuoteDataComponent.aKErDB);
                uploadDrawingData$default(klineQuoteDataComponent, arrayListCopydefault, false, false, 6, null);
            }
            klineQuoteDataComponent.values().OLrzqt(arrayListCopydefault);
            pUU.copydefault("KlineDrawLine", "KlineQuoteDataComponent:getDrawingData size = " + arrayListCopydefault.size());
        } else {
            pUU.copydefault("KlineDrawLine", "KlineQuoteDataComponent:getDrawingData null");
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Throwable th) {
        pUU.copydefault("KlineDrawLine", "KlineQuoteDataComponent:getDrawingData error: " + th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(boolean z, boolean z2, boolean z3, @NotNull String str) {
        DrawLineData.DrawLineItem drawLineItemIsConnected;
        DrawLineData drawLineData;
        DrawLineData.DrawLineItem drawLineItemIsConnected2;
        Intrinsics.checkNotNullParameter(str, "");
        if (z && C33129mqd.KWHzl((Collection) this.valueOf) && !z2) {
            dxcTrN();
        }
        if (!z && (drawLineItemIsConnected2 = (drawLineData = DrawLineData.copydefault).isConnected()) != null) {
            drawLineData.EZpvd().remove(drawLineItemIsConnected2);
            drawLineData.EZpvd().add(drawLineItemIsConnected2);
            drawLineData.EZpvd(drawLineData.EZpvd());
        }
        if (z && z3 && (drawLineItemIsConnected = DrawLineData.copydefault.isConnected()) != null) {
            uploadDrawingData$default(this, yDY.copydefault(drawLineItemIsConnected), false, false, 6, null);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull ArrayList<PriceWarningItemBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        values().KWHzl(arrayList);
        values().copydefault(true);
        InterfaceC39502ptZ interfaceC39502ptZ = this.copydefault;
        if (interfaceC39502ptZ == null || interfaceC39502ptZ == null) {
            return;
        }
        interfaceC39502ptZ.isConnected(!arrayList.isEmpty());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = OLrzqt().getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        return lifecycle;
    }

    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        values().AEQbTJ(arrayList);
    }

    public static /* synthetic */ void uploadDrawingData$default(KlineQuoteDataComponent klineQuoteDataComponent, ArrayList arrayList, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        klineQuoteDataComponent.AEQbTJ((ArrayList<DrawLineData.DrawLineItem>) arrayList, z, z2);
    }

    public final void AEQbTJ(@NotNull ArrayList<DrawLineData.DrawLineItem> arrayList, boolean z, boolean z2) {
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        String indexId;
        String json;
        Intrinsics.checkNotNullParameter(arrayList, "");
        JsonObject jsonObject = new JsonObject();
        int i = 0;
        for (Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
            LineDataBean lineDataBean = new LineDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
            LineFibDataBean lineFibDataBean = new LineFibDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
            if (drawLineItem.getIndexId().length() == 0) {
                indexId = C37897pEt.KWHzl.copydefault(System.currentTimeMillis() + ((long) i));
            } else {
                indexId = drawLineItem.getIndexId();
            }
            OLrzqt().getTAG();
            Objects.toString(indexId);
            if (z || drawLineItem.isDelete()) {
                json = "";
            } else if (drawLineItem.getLineType() == DrawLineData.LineType.FIBONACCI) {
                lineFibDataBean.setId(indexId);
                C37895pEr c37895pEr = C37895pEr.copydefault;
                lineFibDataBean.setType(c37895pEr.OLrzqt(drawLineItem.getLineType()));
                String str = this.AubY;
                if (str == null) {
                    str = "";
                }
                lineFibDataBean.setState(c37895pEr.KWHzl(drawLineItem, str, true));
                lineFibDataBean.setPoints(c37895pEr.OLrzqt(drawLineItem));
                c37895pEr.EZpvd(lineFibDataBean, drawLineItem);
                json = new Gson().toJson(lineDataBean);
                if (C33129mqd.KWHzl((Collection) this.valueOf)) {
                    this.aKErDB.add(lineFibDataBean);
                }
            } else {
                lineDataBean.setId(indexId);
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                lineDataBean.setType(c37895pEr2.OLrzqt(drawLineItem.getLineType()));
                String str2 = this.AubY;
                if (str2 == null) {
                    str2 = "";
                }
                lineDataBean.setState(c37895pEr2.EZpvd(drawLineItem, str2, true));
                lineDataBean.setPoints(c37895pEr2.OLrzqt(drawLineItem));
                json = new Gson().toJson(lineDataBean);
                if (C33129mqd.KWHzl((Collection) this.valueOf)) {
                    this.UeEOUB.add(lineDataBean);
                }
            }
            jsonObject.addProperty(indexId, json);
            i++;
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true) && (stateListAnimator = this.AxsJAY) != null) {
            String str3 = this.AubY;
            if (str3 == null) {
                str3 = "";
            }
            stateListAnimator.AEQbTJ(this, str3, jsonObject, z, z2);
        }
    }

    private final void fZBcTu() {
        int size = this.valueOf.size();
        C37895pEr c37895pEr = C37895pEr.copydefault;
        if (size > c37895pEr.EZpvd()) {
            if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                int size2 = this.valueOf.size();
                int iEZpvd = c37895pEr.EZpvd();
                for (int i = 0; i < size2 - iEZpvd; i++) {
                    DrawLineData.DrawLineItem drawLineItem = this.valueOf.get(0);
                    Intrinsics.checkNotNullExpressionValue(drawLineItem, "");
                    DrawLineData.copydefault.EZpvd().remove(drawLineItem);
                    this.valueOf.remove(0);
                }
                DrawLineData drawLineData = DrawLineData.copydefault;
                drawLineData.EZpvd(drawLineData.EZpvd());
            } else {
                values().OLrzqt(this.valueOf);
                return;
            }
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
            uploadDrawingData$default(this, this.valueOf, false, false, 6, null);
            String str = this.AubY;
            if (str != null) {
                DrawingDataBean drawingDataBean = new DrawingDataBean("0", str, null, 4, null);
                C37895pEr.copydefault.OLrzqt(drawingDataBean, this.UeEOUB, this.aKErDB);
                values().OLrzqt(C37897pEt.KWHzl.copydefault(drawingDataBean));
                return;
            }
            return;
        }
        values().OLrzqt(this.valueOf);
    }

    public final void copydefault(InterfaceC43034rhf interfaceC43034rhf) {
        String str;
        String str2;
        String str3 = this.AubY;
        List listSplit$default = str3 != null ? StringsKt__StringsKt.split$default((CharSequence) str3, new String[]{"-"}, false, 0, 6, (Object) null) : null;
        if (listSplit$default == null || listSplit$default.size() <= 0 || (str = this.wlaJM) == null || (str2 = this.AubY) == null || interfaceC43034rhf == null) {
            return;
        }
        interfaceC43034rhf.KWHzl((String) listSplit$default.get(0), str, str2, new Function0() { // from class: o.pkZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KlineQuoteDataComponent.gEmmrt(this.copydefault);
            }
        });
    }

    public static final Unit gEmmrt(KlineQuoteDataComponent klineQuoteDataComponent) {
        klineQuoteDataComponent.values().giSNqX();
        return Unit.INSTANCE;
    }

    public final void dNCPSb() {
        InterfaceC39499ptW interfaceC39499ptW = this.AYXKKw;
        if (interfaceC39499ptW != null) {
            if (interfaceC39499ptW != null) {
                interfaceC39499ptW.OLrzqt(true);
            }
            this.ORxRYg = true;
        }
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KlineQuoteDataComponent$checkIsWatched$1(this, null), 3, null);
    }

    public final void djSkpj() {
        EZpvd(this.QfsBiF);
        OLrzqt(this.QbewEr);
    }

    public final void OLrzqt(@NotNull PriceWarningItemBean priceWarningItemBean, @NotNull String str) {
        Intrinsics.checkNotNullParameter(priceWarningItemBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) "change")) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(OLrzqt()), null, null, new KlineQuoteDataComponent$handleDragChangeAlertPrice$1(priceWarningItemBean, null), 3, null);
        } else if (Intrinsics.EZpvd((Object) str, (Object) RequestParameters.SUBRESOURCE_DELETE)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(OLrzqt()), null, null, new KlineQuoteDataComponent$handleDragChangeAlertPrice$2(priceWarningItemBean, this, null), 3, null);
        }
    }

    private final void dxcTrN() {
        Iterator<T> it = this.valueOf.iterator();
        while (it.hasNext()) {
            DrawLineData.copydefault.EZpvd().remove((DrawLineData.DrawLineItem) it.next());
        }
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(drawLineData.EZpvd());
    }

    public static final Unit copydefault(DrawLineBean drawLineBean, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) it.next();
            if (Intrinsics.EZpvd((Object) drawLineItem.getContract(), (Object) drawLineBean.getCoinId())) {
                int klineType = drawLineItem.getKlineType();
                Integer type = drawLineBean.getType();
                if (type != null && klineType == type.intValue()) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KLine_Mid_DrawingTool_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.plp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return KlineQuoteDataComponent.KWHzl(drawLineItem, (EventParamsList) obj);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }
}
