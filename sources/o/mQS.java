package o;

import com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mQS extends mQV {
    public final LinkedBlockingDeque<java.lang.String> AEQbTJ;
    public AbstractC57556yke EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    public abstract void OLrzqt(@NotNull java.util.List<CandlesticksBean> list);

    public mQS(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.AEQbTJ = new LinkedBlockingDeque<>();
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC57556yke abstractC57556ykeAEQbTJ = AEQbTJ(EZpvd(str), new WsArgV5ForWeb3(EZpvd(str), null, this.copydefault, this.KWHzl, null, 18, null));
        this.EZpvd = abstractC57556ykeAEQbTJ;
        abstractC57556ykeAEQbTJ.AhwBna();
        AEQbTJ(200L);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return "dex-token-" + str;
    }

    public void EZpvd() {
        this.AEQbTJ.clear();
        InterfaceC58217yxC interfaceC58217yxCAhwBna = AhwBna();
        if (interfaceC58217yxCAhwBna != null) {
            interfaceC58217yxCAhwBna.dispose();
        }
        AbstractC57556yke abstractC57556yke = this.EZpvd;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
            C32152mRk.Companion.EZpvd(EZpvd(abstractC57556yke.valueOf()), abstractC57556yke);
            this.EZpvd = null;
        }
    }

    @Override // o.mQP
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(true);
        this.AEQbTJ.put(str);
    }

    @Override // o.mQP
    public void copydefault() {
        AEQbTJ();
    }

    public final void AEQbTJ() {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (!this.AEQbTJ.isEmpty()) {
                mTT mtt = mTT.EZpvd;
                java.lang.String strTake = this.AEQbTJ.take();
                Intrinsics.checkNotNullExpressionValue(strTake, "");
                CandlesticksBean candlesticksBeanAEQbTJ = mtt.AEQbTJ(strTake);
                if (candlesticksBeanAEQbTJ != null) {
                    java.util.Iterator it = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (Intrinsics.EZpvd((java.lang.Object) ((CandlesticksBean) it.next()).getTs(), (java.lang.Object) candlesticksBeanAEQbTJ.getTs())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        arrayList.set(i, candlesticksBeanAEQbTJ);
                    } else {
                        arrayList.add(candlesticksBeanAEQbTJ);
                    }
                }
            }
            OLrzqt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList));
        }
    }
}
