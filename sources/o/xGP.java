package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.unify_trade.biz.subscribe.BizDepthData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C54401xHa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xGP extends xGQ<BizDepthData> {
    public final java.util.List<AbstractC55663xoG> AEQbTJ;
    public java.lang.String EZpvd;
    public AbstractC57556yke KWHzl;
    public final java.lang.String OLrzqt;
    public BizDepthData copydefault;

    public xGP(@NotNull java.lang.String str, @NotNull AbstractC55663xoG abstractC55663xoG) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55663xoG, "");
        this.OLrzqt = str;
        this.copydefault = new BizDepthData(null, null, null, 7, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.AEQbTJ = arrayList;
        pUU.KWHzl("WS-TASK-SUB", "WsDepthTask-init");
        arrayList.add(abstractC55663xoG);
        this.KWHzl = C54407xHg.Companion.KWHzl("books-grouped", C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, true, null, 47, null), yDY.copydefault(new WsArgV5("books-grouped", abstractC55663xoG.KWHzl(), null, null, null, null, abstractC55663xoG.copydefault(), null, 188, null)), new Function2() { // from class: o.xGM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xGP.AEQbTJ(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
        KWHzl();
    }

    public static final Unit AEQbTJ(xGP xgp, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        xgp.EZpvd = oKIncomingData.getPayload().toString();
        xgp.OLrzqt(true);
        return Unit.INSTANCE;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("WsDepthTask", " taskKey:" + this.OLrzqt + " CHANNEL_BOOKS_GROUPED data: " + str + " -- ");
    }

    public final void copydefault(@NotNull AbstractC55663xoG abstractC55663xoG) {
        Intrinsics.checkNotNullParameter(abstractC55663xoG, "");
        if (C33129mqd.KWHzl((java.util.Collection) this.copydefault.getAsks()) || C33129mqd.KWHzl((java.util.Collection) this.copydefault.getBids())) {
            abstractC55663xoG.EZpvd(this.copydefault, "WebSocket");
        }
        this.AEQbTJ.add(abstractC55663xoG);
    }

    public final void KWHzl() {
        if (this.KWHzl != null) {
            KWHzl(700L);
        }
        AbstractC57556yke abstractC57556yke = this.KWHzl;
        if (abstractC57556yke != null) {
            abstractC57556yke.AhwBna();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public BizDepthData bD_() {
        return EZpvd();
    }

    public final BizDepthData EZpvd() {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd)) {
            return null;
        }
        BizDepthData.ActionBar actionBar = BizDepthData.Companion;
        java.lang.String str = this.EZpvd;
        Intrinsics.copydefault((java.lang.Object) str);
        return actionBar.KWHzl(str);
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj != null && (obj instanceof AbstractC55663xoG)) {
            java.util.Iterator<AbstractC55663xoG> it = this.AEQbTJ.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().AhwBna(), (java.lang.Object) ((AbstractC55663xoG) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.AEQbTJ.remove(i);
            }
            if (this.AEQbTJ.size() == 0) {
                valueOf();
                return true;
            }
        }
        return false;
    }

    private final void valueOf() {
        pUU.KWHzl("WS-TASK-SUB", "WsDepthTask-release");
        AbstractC57556yke abstractC57556yke = this.KWHzl;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("books-grouped", this.KWHzl);
        this.KWHzl = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    public void AEQbTJ(@NotNull BizDepthData bizDepthData) {
        Intrinsics.checkNotNullParameter(bizDepthData, "");
        this.copydefault = bizDepthData;
        this.EZpvd = "";
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            AbstractC55755xpt.onResult$default((AbstractC55663xoG) it.next(), bizDepthData, null, 2, null);
        }
    }
}
