package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.model.IndexSourceData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C54401xHa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class xRH {
    public AbstractC57556yke AEQbTJ;
    public final android.util.ArrayMap<java.lang.String, IndexTickersData> AhwBna;
    public final C56131xwy EZpvd;
    public AbstractC57556yke KWHzl;
    public C58216yxB OLrzqt;
    public final java.util.ArrayList<IndexSourceData> copydefault;
    public TickersData djBIcL;
    public final java.lang.String gEmmrt;
    public Function1<? super java.util.ArrayList<IndexSourceData>, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TickersData AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super java.util.ArrayList<IndexSourceData>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<IndexSourceData> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.util.ArrayMap<java.lang.String, IndexTickersData> valueOf() {
        return this.AhwBna;
    }

    public xRH(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        this.AhwBna = new android.util.ArrayMap<>();
        this.EZpvd = new C56131xwy();
        this.OLrzqt = new C58216yxB();
        this.copydefault = new java.util.ArrayList<>();
    }

    public void gEmmrt() {
        this.valueOf = null;
        this.OLrzqt.dispose();
        AYXKKw();
        AhwBna();
    }

    public final java.util.List<java.lang.String> KWHzl() {
        if (this.copydefault.size() <= 0) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(((IndexSourceData) it.next()).getInstId());
        }
        return arrayList;
    }

    public final void copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new WsArgV5("index-tickers-3s", it.next(), null, null, null, null, null, null, 252, null));
        }
        C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
        if (v5Connection$default != null) {
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ("index-tickers-3s", v5Connection$default, arrayList, new Function2() { // from class: o.xRF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return xRH.OLrzqt(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            this.AEQbTJ = abstractC57556ykeAEQbTJ;
            if (abstractC57556ykeAEQbTJ != null) {
                abstractC57556ykeAEQbTJ.AhwBna();
            }
            C43296rmc.AEQbTJ("WS-DATA", "----------Index TICKER>add market Index ticker");
        }
    }

    public static final Unit OLrzqt(xRH xrh, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        C43296rmc.AEQbTJ("WS-DATA", "----------Index TICKER> " + oKIncomingData);
        xrh.KWHzl(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
        if (v5Connection$default != null) {
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ("cup-tickers-3s", v5Connection$default, yDY.copydefault(new WsArgV5("cup-tickers-3s", null, null, null, this.gEmmrt, null, null, null, 238, null)), new Function2() { // from class: o.xRG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return xRH.AEQbTJ(this.AEQbTJ, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            this.KWHzl = abstractC57556ykeAEQbTJ;
            if (abstractC57556ykeAEQbTJ != null) {
                abstractC57556ykeAEQbTJ.AhwBna();
            }
        }
    }

    public static final Unit AEQbTJ(xRH xrh, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        C43296rmc.AEQbTJ("WS-DATA", "----------CUP TICKER> " + oKIncomingData);
        xrh.OLrzqt(oKIncomingData.getPayload().toString());
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str) {
        IndexTickersData indexTickersDataCopydefault = IndexTickersData.Companion.copydefault(str);
        if (indexTickersDataCopydefault != null) {
            this.AhwBna.put(indexTickersDataCopydefault.getInstId(), indexTickersDataCopydefault);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(str);
        if (tickersDataOLrzqt != null) {
            this.djBIcL = tickersDataOLrzqt;
        }
    }

    public final void AYXKKw() {
        AbstractC57556yke abstractC57556yke = this.AEQbTJ;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        pUU.KWHzl("WS-DATA", "----------Index TICKER>remove market Index ticker");
        C33495mxY.OLrzqt("WS-DATA", "----------Index TICKER>remove market Index ticker");
    }

    public final void AhwBna() {
        AbstractC57556yke abstractC57556yke = this.KWHzl;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        pUU.KWHzl("WS-DATA", "----------Index TICKER>remove market Index ticker");
        C33495mxY.OLrzqt("WS-DATA", "----------Index TICKER>remove market Index ticker");
    }

    public final void djBIcL() {
        java.lang.String strMulS$default;
        int i = 0;
        for (java.lang.Object obj : this.copydefault) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            IndexTickersData indexTickersData = this.AhwBna.get(((IndexSourceData) obj).getInstId());
            if (indexTickersData != null) {
                java.util.ArrayList<IndexSourceData> arrayList = this.copydefault;
                java.lang.String instId = indexTickersData.getInstId();
                java.lang.String idxPx = indexTickersData.getIdxPx();
                kotlin.Pair pairCalApplies$default = C55692xoj.calApplies$default(C55692xoj.KWHzl, indexTickersData.getIdxPx(), indexTickersData.getOpen24h(), indexTickersData.getSodUtc0(), indexTickersData.getSodUtc8(), false, 16, null);
                if (Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) "USD")) {
                    strMulS$default = indexTickersData.getIdxPx();
                } else if (this.djBIcL != null) {
                    java.lang.String idxPx2 = indexTickersData.getIdxPx();
                    TickersData tickersData = this.djBIcL;
                    strMulS$default = C33129mqd.mulS$default(idxPx2, tickersData != null ? tickersData.getLast() : null, null, null, null, 14, null);
                } else {
                    strMulS$default = "";
                }
                arrayList.set(i, new IndexSourceData(instId, idxPx, pairCalApplies$default, strMulS$default));
            }
            i++;
        }
        Function1<? super java.util.ArrayList<IndexSourceData>, Unit> function1 = this.valueOf;
        if (function1 != null) {
            function1.invoke(this.copydefault);
        }
    }
}
