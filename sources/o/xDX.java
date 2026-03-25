package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.biz.TacticsType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.biz.StrtagyOrders;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xDX extends xGQ<java.lang.Object> {
    public final java.util.ArrayList<StrtagyOrders> AEQbTJ;
    public final OrderPositionData AYXKKw;
    public final java.lang.String AhwBna;
    public final LinkedBlockingDeque<java.lang.String> EZpvd;
    public AbstractC55662xoF KWHzl;
    public final C54248xBj OLrzqt;
    public AbstractC57556yke copydefault;
    public volatile boolean gEmmrt;
    public InterfaceC58217yxC valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public xDX(@NotNull java.lang.String str, AbstractC55662xoF abstractC55662xoF) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.KWHzl = abstractC55662xoF;
        this.OLrzqt = new C54248xBj();
        this.EZpvd = new LinkedBlockingDeque<>();
        this.AYXKKw = new OrderPositionData(null, null, null, null, null, null, null, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
        this.AEQbTJ = new java.util.ArrayList<>();
        AEQbTJ();
    }

    public final void AEQbTJ() {
        final C54248xBj c54248xBj = this.OLrzqt;
        c54248xBj.KWHzl(new Function1() { // from class: o.xDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDX.AEQbTJ(c54248xBj, this, (kotlin.Pair) obj);
            }
        });
        c54248xBj.OLrzqt(new Function1() { // from class: o.xDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDX.KWHzl(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c54248xBj.fIwbmz();
    }

    public static final Unit AEQbTJ(C54248xBj c54248xBj, xDX xdx, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (Intrinsics.EZpvd(pair.getFirst(), (java.lang.Object) c54248xBj.EZpvd())) {
            ResponseData responseData = (ResponseData) pair.getSecond();
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                xdx.AEQbTJ.clear();
                java.lang.Object data = ((ResponseData) pair.getSecond()).getData();
                if (data != null) {
                    xdx.AEQbTJ.addAll((java.util.Collection) data);
                }
                xdx.KWHzl();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(xDX xdx, boolean z) {
        AbstractC55662xoF abstractC55662xoF = xdx.KWHzl;
        if (abstractC55662xoF != null) {
            abstractC55662xoF.KWHzl(xdx.AYXKKw);
        }
        AbstractC57556yke abstractC57556ykeCopydefault = xdx.copydefault();
        xdx.copydefault = abstractC57556ykeCopydefault;
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.String orderAmt;
        java.lang.String pinCnt;
        for (java.lang.String str : TacticsType.Companion.OLrzqt()) {
            java.util.Iterator<T> it = this.AEQbTJ.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next).getOrdType(), (java.lang.Object) str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            StrtagyOrders strtagyOrders = (StrtagyOrders) next;
            java.lang.String str2 = "0";
            if (strtagyOrders == null || (orderAmt = strtagyOrders.getOrderAmt()) == null) {
                orderAmt = "0";
            }
            java.util.Iterator<T> it2 = this.AEQbTJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((StrtagyOrders) next2).getOrdType(), (java.lang.Object) str)) {
                    obj = next2;
                    break;
                }
            }
            StrtagyOrders strtagyOrders2 = (StrtagyOrders) obj;
            if (strtagyOrders2 != null && (pinCnt = strtagyOrders2.getPinCnt()) != null) {
                str2 = pinCnt;
            }
            this.AYXKKw.getBotAmtData().getCountMap().put(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(orderAmt)));
            this.AYXKKw.getBotAmtData().getPinCountMap().put(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(str2)));
        }
        java.util.Iterator<T> it3 = this.AEQbTJ.iterator();
        while (it3.hasNext()) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : ((StrtagyOrders) it3.next()).getBaseCoins().entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                java.lang.Integer orDefault = this.AYXKKw.getBotAmtData().getCoinsMap().getOrDefault(key, 0);
                Intrinsics.checkNotNullExpressionValue(orDefault, "");
                this.AYXKKw.getBotAmtData().getCoinsMap().put(key, java.lang.Integer.valueOf(orDefault.intValue() + C33129mqd.AhwBna(value)));
            }
        }
    }

    private final void valueOf() {
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 700L, java.util.concurrent.TimeUnit.MILLISECONDS, yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xEf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDX.OLrzqt(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        this.valueOf = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xDX.copydefault(function1, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xDX xdx, java.lang.Long l) {
        if (xdx.gEmmrt) {
            xdx.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.EZpvd.isEmpty()) {
            arrayList.add(this.EZpvd.take());
        }
        this.gEmmrt = false;
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<StrtagyOrders> listEZpvd = StrtagyOrders.Companion.EZpvd((java.lang.String) next);
            this.AEQbTJ.clear();
            if (listEZpvd != null) {
                this.AEQbTJ.addAll(listEZpvd);
            }
            KWHzl();
            AbstractC55662xoF abstractC55662xoF = this.KWHzl;
            if (abstractC55662xoF != null) {
                abstractC55662xoF.KWHzl(this.AYXKKw);
            }
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55662xoF) {
            java.lang.String strAEQbTJ = ((AbstractC55662xoF) obj).AEQbTJ();
            AbstractC55662xoF abstractC55662xoF = this.KWHzl;
            if (!Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) (abstractC55662xoF != null ? abstractC55662xoF.AEQbTJ() : null))) {
                return false;
            }
        }
        djBIcL();
        return true;
    }

    public AbstractC57556yke copydefault() {
        this.copydefault = KWHzl("algo-private-summary", new WsArgV5("algo-private-summary", null, null, "ANY", null, null, null, null, 246, null), new Function1() { // from class: o.xEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDX.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        });
        if (this.valueOf == null) {
            valueOf();
        }
        return this.copydefault;
    }

    public static final Unit copydefault(xDX xdx, java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        xdx.EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = true;
        this.EZpvd.put(str);
    }

    public final void djBIcL() {
        AbstractC57556yke abstractC57556yke = this.copydefault;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("algo-private-summary", this.copydefault);
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.OLrzqt.fetchVPNInfo();
    }
}
