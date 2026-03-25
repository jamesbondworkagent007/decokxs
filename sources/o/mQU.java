package o;

import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.mQP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mQU extends mQV {
    public final LinkedBlockingDeque<java.lang.String> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public AbstractC57556yke OLrzqt;
    public final java.lang.String copydefault;

    public abstract void KWHzl(@NotNull MarketTxWsInfoItemBean marketTxWsInfoItemBean);

    public mQU(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
        this.AEQbTJ = new LinkedBlockingDeque<>();
    }

    public void EZpvd() {
        AbstractC57556yke abstractC57556ykeAEQbTJ = AEQbTJ(this.copydefault, new WsArgV5ForWeb3(this.copydefault, null, this.KWHzl, this.EZpvd, null, 18, null));
        this.OLrzqt = abstractC57556ykeAEQbTJ;
        abstractC57556ykeAEQbTJ.AhwBna();
        mQP.StateListAnimator.startCheckCacheValid$default(this, 0L, 1, null);
    }

    public void OLrzqt() {
        AbstractC57556yke abstractC57556yke = this.OLrzqt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCAhwBna = AhwBna();
        if (interfaceC58217yxCAhwBna != null) {
            interfaceC58217yxCAhwBna.dispose();
        }
        AbstractC57556yke abstractC57556yke2 = this.OLrzqt;
        if (abstractC57556yke2 != null) {
            C32152mRk.Companion.EZpvd(this.copydefault, abstractC57556yke2);
            this.OLrzqt = null;
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

    private final void AEQbTJ() {
        synchronized (this) {
            while (!this.AEQbTJ.isEmpty()) {
                mTT mtt = mTT.EZpvd;
                java.lang.String strTake = this.AEQbTJ.take();
                Intrinsics.checkNotNullExpressionValue(strTake, "");
                java.util.List<MarketTxWsInfoItemBean> listEZpvd = mtt.EZpvd(strTake);
                if (listEZpvd != null && (!listEZpvd.isEmpty())) {
                    KWHzl((MarketTxWsInfoItemBean) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd));
                }
            }
        }
    }
}
