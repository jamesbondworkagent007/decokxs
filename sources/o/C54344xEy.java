package o;

import com.okinc.unify_trade.biz.subscribe.BizKLineData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55702xot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xEy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54344xEy extends xGQ<java.util.List<? extends BizKLineData>> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final AbstractC55755xpt<java.util.List<BizKLineData>> AEQbTJ;
    public AbstractC57556yke AhwBna;
    public C56131xwy EZpvd;
    public final LinkedBlockingDeque<java.lang.String> KWHzl;
    public InterfaceC58217yxC OLrzqt;

    public C54344xEy(@NotNull AbstractC55755xpt<java.util.List<BizKLineData>> abstractC55755xpt) {
        Intrinsics.checkNotNullParameter(abstractC55755xpt, "");
        this.AEQbTJ = abstractC55755xpt;
        this.KWHzl = new LinkedBlockingDeque<>();
        this.EZpvd = new C56131xwy();
        KWHzl();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* synthetic */ void AEQbTJ(java.util.List<? extends BizKLineData> list) {
        KWHzl((java.util.List<BizKLineData>) list);
    }

    /* JADX INFO: renamed from: o.xEy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xEy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void KWHzl() {
        AbstractC55755xpt<java.util.List<BizKLineData>> abstractC55755xpt = this.AEQbTJ;
        Intrinsics.copydefault(abstractC55755xpt, "");
        java.lang.String strValueOf = ((AbstractC55672xoP) this.AEQbTJ).valueOf();
        if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "TYPE_KLINE")) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String strSubstring = ((AbstractC55672xoP) this.AEQbTJ).OLrzqt().substring(6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            this.OLrzqt = InterfaceC55702xot.StateListAnimator.getMarketCandles$default(this.EZpvd, ((AbstractC55672xoP) this.AEQbTJ).KWHzl(), strSubstring, ((AbstractC55672xoP) this.AEQbTJ).copydefault(), null, new ActionBar(arrayList, this), 8, null);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "TYPE_INDEX_KLINE")) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String strSubstring2 = ((AbstractC55672xoP) this.AEQbTJ).OLrzqt().substring(12);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            this.OLrzqt = InterfaceC55702xot.StateListAnimator.getMarketIndexCandles$default(this.EZpvd, ((AbstractC55672xoP) this.AEQbTJ).KWHzl(), strSubstring2, ((AbstractC55672xoP) this.AEQbTJ).copydefault(), null, new Application(arrayList2, this), 8, null);
        }
    }

    /* JADX INFO: renamed from: o.xEy$ActionBar */
    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends BizKLineData>> {
        public final /* synthetic */ java.util.ArrayList<BizKLineData> EZpvd;
        public final /* synthetic */ C54344xEy copydefault;

        public ActionBar(java.util.ArrayList<BizKLineData> arrayList, C54344xEy c54344xEy) {
            this.EZpvd = arrayList;
            this.copydefault = c54344xEy;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<BizKLineData> list, java.lang.Exception exc) {
            AbstractC57556yke abstractC57556ykeAEQbTJ;
            if (list != null) {
                this.EZpvd.addAll(list);
                C56404yEc.zsXlph(this.EZpvd);
            }
            ((AbstractC55672xoP) this.copydefault.AEQbTJ).EZpvd(this.EZpvd, "http");
            if (!C33129mqd.KWHzl((java.util.Collection) this.EZpvd) || (abstractC57556ykeAEQbTJ = this.copydefault.AEQbTJ()) == null) {
                return;
            }
            abstractC57556ykeAEQbTJ.AhwBna();
        }
    }

    /* JADX INFO: renamed from: o.xEy$Application */
    public static final class Application implements InterfaceC55701xos<java.util.List<? extends BizKLineData>> {
        public final /* synthetic */ java.util.ArrayList<BizKLineData> AEQbTJ;
        public final /* synthetic */ C54344xEy EZpvd;

        public Application(java.util.ArrayList<BizKLineData> arrayList, C54344xEy c54344xEy) {
            this.AEQbTJ = arrayList;
            this.EZpvd = c54344xEy;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<BizKLineData> list, java.lang.Exception exc) {
            AbstractC57556yke abstractC57556ykeAEQbTJ;
            if (list != null) {
                this.AEQbTJ.addAll(list);
                C56404yEc.zsXlph(this.AEQbTJ);
            }
            ((AbstractC55672xoP) this.EZpvd.AEQbTJ).EZpvd(this.AEQbTJ, "http");
            if (!C33129mqd.KWHzl((java.util.Collection) this.AEQbTJ) || (abstractC57556ykeAEQbTJ = this.EZpvd.AEQbTJ()) == null) {
                return;
            }
            abstractC57556ykeAEQbTJ.AhwBna();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public java.util.List<BizKLineData> bD_() {
        return copydefault();
    }

    public void KWHzl(@NotNull java.util.List<BizKLineData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.EZpvd(list, "WebSocket");
    }

    public final java.util.List<BizKLineData> copydefault() {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList();
            while (!this.KWHzl.isEmpty()) {
                BizKLineData.Companion companion = BizKLineData.Companion;
                java.lang.String strTake = this.KWHzl.take();
                Intrinsics.checkNotNullExpressionValue(strTake, "");
                java.util.List<BizKLineData> listKWHzl = companion.KWHzl(strTake);
                if (C33129mqd.KWHzl((java.util.Collection) listKWHzl)) {
                    Intrinsics.copydefault(listKWHzl);
                    arrayList.addAll(listKWHzl);
                }
            }
        }
        return arrayList;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if ((obj instanceof AbstractC55755xpt) && !Intrinsics.EZpvd((java.lang.Object) ((AbstractC55755xpt) obj).AhwBna(), (java.lang.Object) this.AEQbTJ.AhwBna())) {
            return false;
        }
        EZpvd();
        return true;
    }

    public final void EZpvd() {
        AbstractC57556yke abstractC57556yke = this.AhwBna;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd(this.AEQbTJ.gEmmrt(), this.AhwBna);
        this.AhwBna = null;
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
    }

    public AbstractC57556yke AEQbTJ() {
        java.lang.String strGEmmrt = this.AEQbTJ.gEmmrt();
        if (strGEmmrt == null || strGEmmrt.length() == 0) {
            return null;
        }
        java.lang.String strGEmmrt2 = this.AEQbTJ.gEmmrt();
        Intrinsics.copydefault((java.lang.Object) strGEmmrt2);
        WsArgV5 wsArgV5 = new WsArgV5(strGEmmrt2, this.AEQbTJ.fetchVPNInfo(), null, null, null, null, null, null, 252, null);
        java.lang.String strGEmmrt3 = this.AEQbTJ.gEmmrt();
        Intrinsics.copydefault((java.lang.Object) strGEmmrt3);
        this.AhwBna = xGQ.getWsListener$default(this, strGEmmrt3, wsArgV5, (Function1) null, 4, (java.lang.Object) null);
        KWHzl(700L);
        return this.AhwBna;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.put(str);
        OLrzqt(true);
    }
}
