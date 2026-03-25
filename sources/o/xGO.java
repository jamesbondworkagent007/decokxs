package o;

import com.okinc.base.uploadlog.UpLoadLogException;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.subscribe.BizKLineData;
import com.okinc.unify_trade.biz.subscribe.BizTradeData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C54407xHg;
import o.InterfaceC55702xot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xGO extends xGQ<java.util.List<? extends BizKLineData>> {
    public boolean AEQbTJ;
    public InterfaceC58217yxC AYXKKw;
    public AbstractC57556yke AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public final LinkedBlockingDeque<java.lang.String> copydefault;
    public C56131xwy djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public java.lang.String isConnected;
    public final AbstractC55755xpt<java.util.List<BizKLineData>> valueOf;
    public AbstractC57556yke values;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* synthetic */ void AEQbTJ(java.util.List<? extends BizKLineData> list) {
        KWHzl((java.util.List<BizKLineData>) list);
    }

    public xGO(@NotNull AbstractC55755xpt<java.util.List<BizKLineData>> abstractC55755xpt, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC55755xpt, "");
        this.valueOf = abstractC55755xpt;
        this.KWHzl = "51000";
        this.copydefault = new LinkedBlockingDeque<>();
        this.djBIcL = new C56131xwy();
        this.EZpvd = "";
        if (z) {
            EZpvd();
        } else {
            values();
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("KLINE_WS_STATUS");
        final Function1 function1 = new Function1() { // from class: o.xGN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xGO.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        };
        this.AYXKKw = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xGO.KWHzl(function1, obj);
            }
        });
        this.AkhnZx = "";
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(xGO xgo, java.lang.String str) {
        AbstractC57556yke abstractC57556yke = xgo.AhwBna;
        if (abstractC57556yke != null) {
            pUU.copydefault("ChartView", "subkline: connId = " + abstractC57556yke.AEQbTJ() + " ConnectionState = " + abstractC57556yke.EZpvd() + " LastPongTimes = " + abstractC57556yke.copydefault());
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        AbstractC55755xpt<java.util.List<BizKLineData>> abstractC55755xpt = this.valueOf;
        if (abstractC55755xpt instanceof AbstractC55677xoU) {
            this.EZpvd = "kline";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String strSubstring = ((AbstractC55677xoU) this.valueOf).OLrzqt().substring(6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            this.OLrzqt = InterfaceC55702xot.StateListAnimator.getMarketCandles$default(this.djBIcL, ((AbstractC55677xoU) this.valueOf).copydefault(), strSubstring, null, null, new Application(arrayList, this, strSubstring), 12, null);
            return;
        }
        if (abstractC55755xpt instanceof AbstractC55673xoQ) {
            this.EZpvd = "index_kline";
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String strSubstring2 = ((AbstractC55673xoQ) this.valueOf).copydefault().substring(12);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            this.OLrzqt = InterfaceC55702xot.StateListAnimator.getMarketIndexCandles$default(this.djBIcL, ((AbstractC55673xoQ) this.valueOf).KWHzl(), strSubstring2, null, null, new ActionBar(arrayList2, this), 12, null);
            return;
        }
        if (abstractC55755xpt instanceof AbstractC55675xoS) {
            this.EZpvd = "mark_price_kline";
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.String strSubstring3 = ((AbstractC55675xoS) this.valueOf).KWHzl().substring(17);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            this.OLrzqt = this.djBIcL.AEQbTJ(((AbstractC55675xoS) this.valueOf).OLrzqt(), strSubstring3, new TaskDescription(arrayList3, this));
        }
    }

    public static final class Application implements InterfaceC55701xos<java.util.List<? extends BizKLineData>> {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.util.ArrayList<BizKLineData> KWHzl;
        public final /* synthetic */ xGO OLrzqt;

        public Application(java.util.ArrayList<BizKLineData> arrayList, xGO xgo, java.lang.String str) {
            this.KWHzl = arrayList;
            this.OLrzqt = xgo;
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<BizKLineData> list, java.lang.Exception exc) {
            if (list != null) {
                this.KWHzl.addAll(list);
                C56404yEc.zsXlph(this.KWHzl);
            }
            if (exc != null) {
                xGO xgo = this.OLrzqt;
                if (exc instanceof BizApiException) {
                    z = Intrinsics.EZpvd((java.lang.Object) ((BizApiException) exc).getCode(), (java.lang.Object) xgo.KWHzl);
                }
            }
            ((AbstractC55677xoU) this.OLrzqt.valueOf).AEQbTJ(this.KWHzl, "http", java.lang.Boolean.valueOf(z));
            if (C33129mqd.KWHzl((java.util.Collection) this.KWHzl)) {
                if (this.KWHzl.size() < 3) {
                    java.lang.String strCopydefault = ((AbstractC55677xoU) this.OLrzqt.valueOf).copydefault();
                    java.util.Locale locale = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase = strCopydefault.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) upperCase, (java.lang.CharSequence) "SWAP", false, 2, (java.lang.Object) null)) {
                        C6777aVl.Companion.EZpvd(new UpLoadLogException("KlineAPITetException:http:instid:" + ((AbstractC55677xoU) this.OLrzqt.valueOf).copydefault() + " bar:" + this.EZpvd));
                    }
                }
                this.OLrzqt.values();
            }
        }
    }

    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends BizKLineData>> {
        public final /* synthetic */ xGO AEQbTJ;
        public final /* synthetic */ java.util.ArrayList<BizKLineData> OLrzqt;

        public ActionBar(java.util.ArrayList<BizKLineData> arrayList, xGO xgo) {
            this.OLrzqt = arrayList;
            this.AEQbTJ = xgo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends BizKLineData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<BizKLineData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<BizKLineData> list, java.lang.Exception exc) {
            if (list != null) {
                this.OLrzqt.addAll(list);
                C56404yEc.zsXlph(this.OLrzqt);
            }
            if (exc != null) {
                xGO xgo = this.AEQbTJ;
                if (exc instanceof BizApiException) {
                    z = Intrinsics.EZpvd((java.lang.Object) ((BizApiException) exc).getCode(), (java.lang.Object) xgo.KWHzl);
                }
            }
            ((AbstractC55673xoQ) this.AEQbTJ.valueOf).AEQbTJ(this.OLrzqt, "http", java.lang.Boolean.valueOf(z));
            if (C33129mqd.KWHzl((java.util.Collection) this.OLrzqt)) {
                this.AEQbTJ.values();
            }
        }
    }

    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends BizKLineData>> {
        public final /* synthetic */ xGO AEQbTJ;
        public final /* synthetic */ java.util.ArrayList<BizKLineData> OLrzqt;

        public TaskDescription(java.util.ArrayList<BizKLineData> arrayList, xGO xgo) {
            this.OLrzqt = arrayList;
            this.AEQbTJ = xgo;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<BizKLineData> list, java.lang.Exception exc) {
            if (list != null) {
                this.OLrzqt.addAll(list);
                C56404yEc.zsXlph(this.OLrzqt);
            }
            if (exc != null) {
                xGO xgo = this.AEQbTJ;
                if (exc instanceof BizApiException) {
                    z = Intrinsics.EZpvd((java.lang.Object) ((BizApiException) exc).getCode(), (java.lang.Object) xgo.KWHzl);
                }
            }
            ((AbstractC55675xoS) this.AEQbTJ.valueOf).AEQbTJ(this.OLrzqt, "http", java.lang.Boolean.valueOf(z));
            if (C33129mqd.KWHzl((java.util.Collection) this.OLrzqt)) {
                this.AEQbTJ.values();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void values() {
        AbstractC57556yke abstractC57556ykeKWHzl = KWHzl();
        if (abstractC57556ykeKWHzl != null) {
            abstractC57556ykeKWHzl.AhwBna();
        }
        if (this.valueOf instanceof AbstractC55677xoU) {
            AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
            this.values = abstractC57556ykeCopydefault;
            if (abstractC57556ykeCopydefault != null) {
                abstractC57556ykeCopydefault.AhwBna();
            }
        }
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.gEmmrt = KWHzl(200L);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public java.util.List<BizKLineData> bD_() {
        return gEmmrt();
    }

    public void KWHzl(@NotNull java.util.List<BizKLineData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf.AEQbTJ(list, "WebSocket", java.lang.Boolean.TRUE);
    }

    private final java.util.List<BizKLineData> gEmmrt() throws java.lang.InterruptedException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.copydefault.isEmpty()) {
            java.lang.String strTake = this.copydefault.take();
            BizKLineData.Companion companion = BizKLineData.Companion;
            Intrinsics.copydefault((java.lang.Object) strTake);
            java.util.List<BizKLineData> listKWHzl = companion.KWHzl(strTake);
            if (listKWHzl != null) {
                for (BizKLineData bizKLineData : listKWHzl) {
                    if (C33129mqd.KWHzl((java.util.Collection) arrayList) && Intrinsics.EZpvd((java.lang.Object) ((BizKLineData) arrayList.get(arrayList.size() - 1)).getTs(), (java.lang.Object) bizKLineData.getTs())) {
                        arrayList.set(arrayList.size() - 1, bizKLineData);
                    } else {
                        arrayList.add(bizKLineData);
                    }
                }
            }
        }
        BizTradeData bizTradeData = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.isConnected)) {
            BizTradeData.Companion companion2 = BizTradeData.Companion;
            java.lang.String str = this.isConnected;
            Intrinsics.copydefault((java.lang.Object) str);
            java.util.List<BizTradeData> listOLrzqt = companion2.OLrzqt(str);
            BizTradeData bizTradeData2 = listOLrzqt != null ? listOLrzqt.get(0) : null;
            this.isConnected = null;
            bizTradeData = bizTradeData2;
        }
        if (bizTradeData != null) {
            if (arrayList.isEmpty()) {
                arrayList.add(new BizKLineData(bizTradeData.getTs(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, bizTradeData.getPx(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 238, (DefaultConstructorMarker) null));
            } else {
                BizKLineData bizKLineData2 = (BizKLineData) arrayList.get(yDY.AuCTel(arrayList));
                if (!Intrinsics.EZpvd((java.lang.Object) bizKLineData2.getC(), (java.lang.Object) bizTradeData.getPx())) {
                    bizKLineData2.setC(bizTradeData.getPx());
                    arrayList.set(arrayList.size() - 1, bizKLineData2);
                }
            }
        }
        return arrayList;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if ((obj instanceof AbstractC55755xpt) && !Intrinsics.EZpvd((java.lang.Object) ((AbstractC55755xpt) obj).AhwBna(), (java.lang.Object) this.valueOf.AhwBna())) {
            return false;
        }
        djBIcL();
        return true;
    }

    public final void djBIcL() {
        C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
        stateListAnimator.EZpvd(this.valueOf.gEmmrt(), this.AhwBna);
        stateListAnimator.EZpvd("aggregated-trades", this.values);
        AbstractC57556yke abstractC57556yke = this.AhwBna;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        AbstractC57556yke abstractC57556yke2 = this.values;
        if (abstractC57556yke2 != null) {
            abstractC57556yke2.djBIcL();
        }
        this.AhwBna = null;
        this.values = null;
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.gEmmrt;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        this.AEQbTJ = false;
        InterfaceC58217yxC interfaceC58217yxC3 = this.AYXKKw;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
    }

    public final AbstractC57556yke copydefault() {
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "aggregated-trades", new WsArgV5("aggregated-trades", this.valueOf.fetchVPNInfo(), null, null, null, null, null, null, 252, null), (Function1) null, 4, (java.lang.Object) null);
        this.values = wsListener$default;
        return wsListener$default;
    }

    public AbstractC57556yke KWHzl() {
        java.lang.String strGEmmrt = this.valueOf.gEmmrt();
        if (strGEmmrt == null || strGEmmrt.length() == 0) {
            return null;
        }
        java.lang.String strGEmmrt2 = this.valueOf.gEmmrt();
        Intrinsics.copydefault((java.lang.Object) strGEmmrt2);
        WsArgV5 wsArgV5 = new WsArgV5(strGEmmrt2, this.valueOf.fetchVPNInfo(), null, null, null, null, null, null, 252, null);
        java.lang.String strGEmmrt3 = this.valueOf.gEmmrt();
        Intrinsics.copydefault((java.lang.Object) strGEmmrt3);
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strGEmmrt3, wsArgV5, (Function1) null, 4, (java.lang.Object) null);
        this.AhwBna = wsListener$default;
        return wsListener$default;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "px", false, 2, (java.lang.Object) null)) {
            this.isConnected = str;
        } else {
            this.copydefault.put(str);
            if (!this.AEQbTJ) {
                AbstractC57556yke abstractC57556yke = this.AhwBna;
                pUU.copydefault("ChartView", "subkline: connId = " + (abstractC57556yke != null ? abstractC57556yke.AEQbTJ() : null));
                this.AEQbTJ = true;
            }
        }
        OLrzqt(true);
    }
}
