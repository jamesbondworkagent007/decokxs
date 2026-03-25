package o;

import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC23182htR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23179htO extends AbstractC23180htP {
    public final java.lang.String AEQbTJ;
    public final LinkedBlockingDeque<java.lang.String> EZpvd;
    public AbstractC57556yke KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    public abstract void AEQbTJ(@NotNull MarketTxWsInfoItemBean marketTxWsInfoItemBean);

    public AbstractC23179htO(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
        this.EZpvd = new LinkedBlockingDeque<>();
    }

    public void EZpvd() {
        AbstractC57556yke abstractC57556ykeEZpvd = EZpvd(this.copydefault, new WsArgV5ForWeb3(this.copydefault, null, this.OLrzqt, this.AEQbTJ, null, 18, null));
        this.KWHzl = abstractC57556ykeEZpvd;
        abstractC57556ykeEZpvd.AhwBna();
        InterfaceC23182htR.Application.startCheckCacheValid$default(this, 0L, 1, null);
    }

    public void AEQbTJ() {
        AbstractC57556yke abstractC57556yke = this.KWHzl;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCValueOf = valueOf();
        if (interfaceC58217yxCValueOf != null) {
            interfaceC58217yxCValueOf.dispose();
        }
        AbstractC57556yke abstractC57556yke2 = this.KWHzl;
        if (abstractC57556yke2 != null) {
            C23252hui.Companion.KWHzl(this.copydefault, abstractC57556yke2);
            this.KWHzl = null;
        }
    }

    @Override // o.InterfaceC23182htR
    public void copydefault(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(true);
        this.EZpvd.put(str);
    }

    @Override // o.InterfaceC23182htR
    public void copydefault() {
        OLrzqt();
    }

    private final void OLrzqt() {
        synchronized (this) {
            while (!this.EZpvd.isEmpty()) {
                C21950hSi c21950hSi = C21950hSi.OLrzqt;
                java.lang.String strTake = this.EZpvd.take();
                Intrinsics.checkNotNullExpressionValue(strTake, "");
                java.util.List<MarketTxWsInfoItemBean> listOLrzqt = c21950hSi.OLrzqt(strTake);
                if (listOLrzqt != null && (!listOLrzqt.isEmpty())) {
                    AEQbTJ((MarketTxWsInfoItemBean) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt));
                }
            }
        }
    }
}
