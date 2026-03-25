package o;

import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.TradeGreeksData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xGL extends xGQ<java.util.List<? extends TradeGreeksData>> {
    public AbstractC55746xpk AEQbTJ;
    public InterfaceC58217yxC AhwBna;
    public volatile boolean EZpvd;
    public final LinkedBlockingDeque<java.lang.String> KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public java.util.ArrayList<TradeGreeksData> copydefault;
    public AbstractC57556yke djBIcL;
    public final C54452xIy gEmmrt;
    public final java.lang.String valueOf;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public xGL(@NotNull java.lang.String str, AbstractC55746xpk abstractC55746xpk) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        this.AEQbTJ = abstractC55746xpk;
        this.copydefault = new java.util.ArrayList<>();
        this.KWHzl = new LinkedBlockingDeque<>();
        this.gEmmrt = new C54452xIy();
        EZpvd();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* synthetic */ void AEQbTJ(java.util.List<? extends TradeGreeksData> list) {
        copydefault((java.util.List<TradeGreeksData>) list);
    }

    public static final class StateListAnimator implements InterfaceC55701xos<java.util.List<? extends TradeGreeksData>> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends TradeGreeksData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<TradeGreeksData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<TradeGreeksData> list, java.lang.Exception exc) {
            java.lang.String message;
            xGL.this.EZpvd = true;
            if (z) {
                xGL xgl = xGL.this;
                if (list == null) {
                    list = yDY.AhwBna();
                }
                xgl.AEQbTJ2(list);
                xGL.this.copydefault();
                return;
            }
            if (exc instanceof BizApiException) {
                AbstractC55746xpk abstractC55746xpk = xGL.this.AEQbTJ;
                if (abstractC55746xpk != null) {
                    abstractC55746xpk.OLrzqt(((BizApiException) exc).getMsg());
                    return;
                }
                return;
            }
            AbstractC55746xpk abstractC55746xpk2 = xGL.this.AEQbTJ;
            if (abstractC55746xpk2 != null) {
                if (exc == null || (message = exc.getMessage()) == null) {
                    message = "";
                }
                abstractC55746xpk2.OLrzqt(message);
            }
        }
    }

    public final void EZpvd() {
        this.EZpvd = false;
        C54452xIy c54452xIy = this.gEmmrt;
        AbstractC55746xpk abstractC55746xpk = this.AEQbTJ;
        this.OLrzqt = c54452xIy.KWHzl(abstractC55746xpk != null ? abstractC55746xpk.copydefault() : null, new StateListAnimator());
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final void AEQbTJ2(java.util.List<TradeGreeksData> list) {
        this.copydefault.addAll(list);
        AbstractC55746xpk abstractC55746xpk = this.AEQbTJ;
        if (abstractC55746xpk != null) {
            abstractC55746xpk.EZpvd(this.copydefault, "http");
        }
    }

    public final AbstractC57556yke copydefault() {
        AbstractC55746xpk abstractC55746xpk = this.AEQbTJ;
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "account-greeks", new WsArgV5("account-greeks", null, null, null, abstractC55746xpk != null ? abstractC55746xpk.copydefault() : null, null, null, null, 238, null), (Function1) null, 4, (java.lang.Object) null);
        this.djBIcL = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
        return this.djBIcL;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.KWHzl.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public java.util.List<TradeGreeksData> bD_() {
        if (!this.EZpvd) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.KWHzl.isEmpty()) {
            arrayList.add(this.KWHzl.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            OLrzqt(TradeGreeksData.Companion.OLrzqt((java.lang.String) next));
        }
        return this.copydefault;
    }

    public void copydefault(@NotNull java.util.List<TradeGreeksData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC55746xpk abstractC55746xpk = this.AEQbTJ;
        if (abstractC55746xpk != null) {
            abstractC55746xpk.EZpvd(this.copydefault, "http");
        }
    }

    public final void OLrzqt(java.util.List<TradeGreeksData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (TradeGreeksData tradeGreeksData : list) {
            int iOLrzqt = OLrzqt(tradeGreeksData);
            if (iOLrzqt == -1) {
                this.copydefault.add(0, tradeGreeksData);
            } else {
                this.copydefault.set(iOLrzqt, tradeGreeksData);
            }
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55746xpk) {
            java.lang.String strAhwBna = ((AbstractC55746xpk) obj).AhwBna();
            AbstractC55746xpk abstractC55746xpk = this.AEQbTJ;
            if (!Intrinsics.EZpvd((java.lang.Object) strAhwBna, (java.lang.Object) (abstractC55746xpk != null ? abstractC55746xpk.AhwBna() : null))) {
                return false;
            }
        }
        KWHzl();
        return true;
    }

    public final void KWHzl() {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AhwBna;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        C54407xHg.Companion.EZpvd("account-greeks", this.djBIcL);
        AbstractC57556yke abstractC57556yke = this.djBIcL;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.djBIcL = null;
    }

    public final int OLrzqt(TradeGreeksData tradeGreeksData) {
        java.util.Iterator<TradeGreeksData> it = this.copydefault.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeGreeksData.getCcy(), (java.lang.Object) it.next().getCcy())) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
