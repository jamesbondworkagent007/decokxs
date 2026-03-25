package o;

import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.core.wsnew.EntityWsArg;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xFt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54366xFt extends xGQ<java.util.List<? extends CountDownInfo>> {
    public final java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public final java.util.List<AbstractC55758xpw> KWHzl;
    public final AbstractC55758xpw OLrzqt;
    public AbstractC57556yke copydefault;

    @Override // o.xGQ
    public boolean bC_() {
        return false;
    }

    public C54366xFt(@NotNull java.lang.String str, @NotNull AbstractC55758xpw abstractC55758xpw) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55758xpw, "");
        this.AEQbTJ = str;
        this.OLrzqt = abstractC55758xpw;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.KWHzl = arrayList;
        arrayList.add(abstractC55758xpw);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* bridge */ /* synthetic */ void AEQbTJ(java.util.List<? extends CountDownInfo> list) {
        AEQbTJ2((java.util.List<CountDownInfo>) list);
    }

    public final void EZpvd(@NotNull AbstractC55758xpw abstractC55758xpw) {
        Intrinsics.checkNotNullParameter(abstractC55758xpw, "");
        this.KWHzl.add(abstractC55758xpw);
    }

    public AbstractC57556yke KWHzl() {
        WsArgV5 wsArgV5;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt.copydefault()) && C33129mqd.AEQbTJ(this.OLrzqt.copydefault(), 0)) {
            wsArgV5 = new EntityWsArg(C56121xwo.copydefault.EZpvd(this.OLrzqt.EZpvd()), null, null, this.OLrzqt.KWHzl(), null, null, null, null, this.OLrzqt.copydefault(), 246, null);
        } else {
            wsArgV5 = new WsArgV5(C56121xwo.copydefault.EZpvd(this.OLrzqt.EZpvd()), null, null, null, null, null, null, null, 254, null);
        }
        C56121xwo c56121xwo = C56121xwo.copydefault;
        this.copydefault = xGQ.getWsListener$default(this, c56121xwo.EZpvd(this.OLrzqt.EZpvd()), wsArgV5, (Function1) null, 4, (java.lang.Object) null);
        pUU.KWHzl("TradeInstrumentTask", "----->> subscribe channel --- " + c56121xwo.EZpvd(this.OLrzqt.EZpvd()));
        KWHzl(2500L);
        return this.copydefault;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        OLrzqt(true);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<CountDownInfo> bD_() {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd)) {
            return null;
        }
        CountDownInfo.Companion companion = CountDownInfo.Companion;
        java.lang.String str = this.EZpvd;
        Intrinsics.copydefault((java.lang.Object) str);
        return companion.EZpvd(str);
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public void AEQbTJ2(@NotNull java.util.List<CountDownInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<AbstractC55758xpw> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            it.next().EZpvd(list == null ? yDY.AhwBna() : list, "WebSocket");
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55758xpw) {
            java.util.Iterator<AbstractC55758xpw> it = this.KWHzl.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().AhwBna(), (java.lang.Object) ((AbstractC55758xpw) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.KWHzl.remove(i);
            }
        }
        if (this.KWHzl.size() == 0) {
            EZpvd();
        }
        return this.KWHzl.size() == 0;
    }

    public void EZpvd() {
        AbstractC57556yke abstractC57556yke = this.copydefault;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        AbstractC55758xpw abstractC55758xpw = this.OLrzqt;
        if (abstractC55758xpw instanceof AbstractC55758xpw) {
            C54407xHg.Companion.EZpvd(C56121xwo.copydefault.EZpvd(abstractC55758xpw.EZpvd()), this.copydefault);
        }
    }
}
