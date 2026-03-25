package o;

import com.okinc.nft.ui.kline.bean.CandlesticksBean;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rsX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC43609rsX extends AbstractC43610rsY {
    public final LinkedBlockingDeque<java.lang.String> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public AbstractC57556yke copydefault;

    public abstract void AEQbTJ(@NotNull java.util.List<CandlesticksBean> list);

    public AbstractC43609rsX(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.OLrzqt = "";
        this.AEQbTJ = new LinkedBlockingDeque<>();
    }

    public static /* synthetic */ void startSubscribe$default(AbstractC43609rsX abstractC43609rsX, java.lang.String str, WsArgV5ForWeb3 wsArgV5ForWeb3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSubscribe");
        }
        if ((i & 2) != 0) {
            wsArgV5ForWeb3 = null;
        }
        abstractC43609rsX.OLrzqt(str, wsArgV5ForWeb3);
    }

    public final void OLrzqt(@NotNull java.lang.String str, WsArgV5ForWeb3 wsArgV5ForWeb3) {
        Intrinsics.checkNotNullParameter(str, "");
        if (wsArgV5ForWeb3 == null) {
            wsArgV5ForWeb3 = new WsArgV5ForWeb3(str, null, this.KWHzl, this.EZpvd, null, 18, null);
        }
        this.OLrzqt = str;
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault(str, wsArgV5ForWeb3);
        this.copydefault = abstractC57556ykeCopydefault;
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
        EZpvd(200L);
    }

    public void copydefault() {
        this.AEQbTJ.clear();
        InterfaceC58217yxC interfaceC58217yxCOLrzqt = OLrzqt();
        if (interfaceC58217yxCOLrzqt != null) {
            interfaceC58217yxCOLrzqt.dispose();
        }
        AbstractC57556yke abstractC57556yke = this.copydefault;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
            C43675rtk.Companion.EZpvd(this.OLrzqt, abstractC57556yke);
            this.copydefault = null;
        }
    }

    @Override // o.AbstractC43610rsY
    public void copydefault(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(true);
        this.AEQbTJ.put(str);
    }

    @Override // o.AbstractC43610rsY
    public void EZpvd() {
        AEQbTJ();
    }

    public final void AEQbTJ() {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (!this.AEQbTJ.isEmpty()) {
                C43599rsN c43599rsN = C43599rsN.copydefault;
                java.lang.String strTake = this.AEQbTJ.take();
                Intrinsics.checkNotNullExpressionValue(strTake, "");
                CandlesticksBean candlesticksBeanEZpvd = c43599rsN.EZpvd(strTake);
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
            AEQbTJ(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList));
        }
    }
}
