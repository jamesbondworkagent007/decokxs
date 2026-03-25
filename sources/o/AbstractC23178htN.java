package o;

import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23178htN extends AbstractC23180htP {
    public AbstractC57556yke EZpvd;
    public final java.lang.String KWHzl;
    public final LinkedBlockingDeque<java.lang.String> OLrzqt;
    public final java.lang.String copydefault;

    public abstract void KWHzl(@NotNull java.util.List<CandlesticksBean> list);

    public AbstractC23178htN(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.OLrzqt = new LinkedBlockingDeque<>();
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC57556yke abstractC57556ykeEZpvd = EZpvd(KWHzl(str), new WsArgV5ForWeb3(KWHzl(str), null, this.KWHzl, this.copydefault, null, 18, null));
        this.EZpvd = abstractC57556ykeEZpvd;
        abstractC57556ykeEZpvd.AhwBna();
        AEQbTJ(200L);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return "dex-token-" + str;
    }

    public void OLrzqt() {
        this.OLrzqt.clear();
        InterfaceC58217yxC interfaceC58217yxCValueOf = valueOf();
        if (interfaceC58217yxCValueOf != null) {
            interfaceC58217yxCValueOf.dispose();
        }
        AbstractC57556yke abstractC57556yke = this.EZpvd;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
            C23252hui.Companion.KWHzl(KWHzl(abstractC57556yke.valueOf()), abstractC57556yke);
            this.EZpvd = null;
        }
    }

    @Override // o.InterfaceC23182htR
    public void copydefault(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(true);
        this.OLrzqt.put(str);
    }

    @Override // o.InterfaceC23182htR
    public void copydefault() {
        AEQbTJ();
    }

    public final void AEQbTJ() {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (!this.OLrzqt.isEmpty()) {
                C21950hSi c21950hSi = C21950hSi.OLrzqt;
                java.lang.String strTake = this.OLrzqt.take();
                Intrinsics.checkNotNullExpressionValue(strTake, "");
                CandlesticksBean candlesticksBeanEZpvd = c21950hSi.EZpvd(strTake);
                if (candlesticksBeanEZpvd != null) {
                    java.util.Iterator it = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (Intrinsics.EZpvd((java.lang.Object) ((CandlesticksBean) it.next()).getTs(), (java.lang.Object) candlesticksBeanEZpvd.getTs())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        arrayList.set(i, candlesticksBeanEZpvd);
                    } else {
                        arrayList.add(candlesticksBeanEZpvd);
                    }
                }
            }
            KWHzl(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList));
        }
    }
}
