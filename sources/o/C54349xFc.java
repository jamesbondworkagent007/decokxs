package o;

import com.okinc.unify_trade.biz.subscribe.BizTradeAggregatedData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xFc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54349xFc extends xGQ<java.util.ArrayList<java.util.List<? extends BizTradeAggregatedData>>> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final java.lang.String AEQbTJ;
    public final java.util.ArrayList<BizTradeAggregatedData> AYXKKw;
    public final java.util.List<AbstractC55739xpd> AhwBna;
    public final LinkedBlockingDeque<java.lang.String> EZpvd;
    public final AbstractC55739xpd KWHzl;
    public AbstractC57556yke OLrzqt;
    public final java.lang.String gEmmrt;

    @Override // o.xGQ
    public boolean AhwBna() {
        return false;
    }

    /* JADX INFO: renamed from: o.xFc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xFc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public C54349xFc(@NotNull java.lang.String str, @NotNull AbstractC55739xpd abstractC55739xpd) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55739xpd, "");
        this.gEmmrt = str;
        this.KWHzl = abstractC55739xpd;
        this.AEQbTJ = "TradeAggregatedTask";
        this.AYXKKw = new java.util.ArrayList<>();
        this.AhwBna = new java.util.ArrayList();
        this.EZpvd = new LinkedBlockingDeque<>();
        EZpvd(abstractC55739xpd);
        KWHzl();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* synthetic */ void AEQbTJ(java.util.ArrayList<java.util.List<? extends BizTradeAggregatedData>> arrayList) {
        KWHzl((java.util.ArrayList<java.util.List<BizTradeAggregatedData>>) arrayList);
    }

    public AbstractC57556yke KWHzl() {
        pUU.KWHzl(this.AEQbTJ, " taskKey:" + this.gEmmrt + " CHANNEL_AGGREGATED_TRADE: aggregated-trades subscribe");
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "aggregated-trades", new WsArgV5("aggregated-trades", this.KWHzl.OLrzqt(), null, null, null, null, null, null, 252, null), (Function1) null, 4, (java.lang.Object) null);
        this.OLrzqt = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(500L);
        return this.OLrzqt;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.EZpvd.put(str);
        pUU.KWHzl(this.AEQbTJ, " taskKey:" + this.gEmmrt + " CHANNEL_AGGREGATED_TRADE data: " + str + " -- ");
        pUU.KWHzl("trade_aggregated_task_performance_tag", "onMessage");
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<java.util.List<BizTradeAggregatedData>> bD_() throws java.lang.InterruptedException {
        pUU.KWHzl("trade_aggregated_task_performance_tag", "copyDataAndConvert start");
        java.util.ArrayList<java.util.List<BizTradeAggregatedData>> arrayList = new java.util.ArrayList<>();
        while (!this.EZpvd.isEmpty()) {
            BizTradeAggregatedData.Companion companion = BizTradeAggregatedData.Companion;
            java.lang.String strTake = this.EZpvd.take();
            Intrinsics.checkNotNullExpressionValue(strTake, "");
            java.util.List<BizTradeAggregatedData> listKWHzl = companion.KWHzl(strTake);
            if (listKWHzl != null) {
                arrayList.add(listKWHzl);
            }
        }
        return arrayList;
    }

    public void KWHzl(@NotNull java.util.ArrayList<java.util.List<BizTradeAggregatedData>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator<java.util.List<BizTradeAggregatedData>> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.util.List<BizTradeAggregatedData> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            OLrzqt(next);
            KWHzl(this.AYXKKw, "WebSocket");
            this.AYXKKw.clear();
        }
        pUU.KWHzl("trade_aggregated_task_performance_tag", "copyDataAndConvert end");
    }

    public final void OLrzqt(java.util.List<BizTradeAggregatedData> list) {
        this.AYXKKw.addAll(list);
    }

    public final void EZpvd(@NotNull AbstractC55739xpd abstractC55739xpd) {
        Intrinsics.checkNotNullParameter(abstractC55739xpd, "");
        if (Intrinsics.EZpvd((java.lang.Object) abstractC55739xpd.AEQbTJ(), (java.lang.Object) this.gEmmrt)) {
            abstractC55739xpd.EZpvd(this.AYXKKw, "WebSocket");
            this.AhwBna.add(abstractC55739xpd);
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55739xpd) {
            java.util.Iterator<AbstractC55739xpd> it = this.AhwBna.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().KWHzl(), (java.lang.Object) ((AbstractC55739xpd) obj).KWHzl())) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return false;
            }
            this.AhwBna.remove(i);
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = this.gEmmrt;
            pUU.KWHzl(str, "taskKey:" + str2 + " removeListener taskKey:" + str2 + " ");
            if (this.AhwBna.size() == 0) {
                copydefault();
                return true;
            }
        }
        return false;
    }

    public final void copydefault() {
        AbstractC57556yke abstractC57556yke = this.OLrzqt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        C54407xHg.Companion.EZpvd("aggregated-trades", this.OLrzqt);
        pUU.KWHzl(this.AEQbTJ, "taskKey:" + this.gEmmrt + " CHANNEL_AGGREGATED_TRADE release ");
    }

    public final void KWHzl(@NotNull java.util.ArrayList<BizTradeAggregatedData> arrayList, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.AhwBna.iterator();
        while (it.hasNext()) {
            ((AbstractC55739xpd) it.next()).EZpvd(arrayList, str);
        }
    }
}
