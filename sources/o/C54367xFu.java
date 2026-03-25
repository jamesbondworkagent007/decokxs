package o;

import com.okinc.unify_trade.biz.CallAuctionInfoData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xFu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54367xFu extends xGQ<CallAuctionInfoData> {
    public final AbstractC55757xpv AEQbTJ;
    public java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public AbstractC57556yke OLrzqt;
    public final java.util.List<AbstractC55757xpv> copydefault;

    @Override // o.xGQ
    public boolean bC_() {
        return false;
    }

    public C54367xFu(@NotNull java.lang.String str, @NotNull AbstractC55757xpv abstractC55757xpv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55757xpv, "");
        this.KWHzl = str;
        this.AEQbTJ = abstractC55757xpv;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.copydefault = arrayList;
        arrayList.add(abstractC55757xpv);
    }

    public final void AEQbTJ(@NotNull AbstractC55757xpv abstractC55757xpv) {
        Intrinsics.checkNotNullParameter(abstractC55757xpv, "");
        this.copydefault.add(abstractC55757xpv);
    }

    public AbstractC57556yke copydefault() {
        C56121xwo c56121xwo = C56121xwo.copydefault;
        this.OLrzqt = xGQ.getWsListener$default(this, c56121xwo.EZpvd(this.AEQbTJ.EZpvd()), new WsArgV5(c56121xwo.EZpvd(this.AEQbTJ.EZpvd()), this.AEQbTJ.KWHzl(), null, null, null, null, null, null, 252, null), (Function1) null, 4, (java.lang.Object) null);
        pUU.KWHzl("TradeCallAuctionTask", "----->> subscribe channel --- " + c56121xwo.EZpvd(this.AEQbTJ.EZpvd()));
        KWHzl(2500L);
        return this.OLrzqt;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        OLrzqt(true);
        pUU.KWHzl("TradeCallAuctionTask", "----->> subscribe onMessage --- " + str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public CallAuctionInfoData bD_() {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd)) {
            return null;
        }
        CallAuctionInfoData.Companion companion = CallAuctionInfoData.Companion;
        java.lang.String str = this.EZpvd;
        Intrinsics.copydefault((java.lang.Object) str);
        return companion.AEQbTJ(str);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull CallAuctionInfoData callAuctionInfoData) {
        Intrinsics.checkNotNullParameter(callAuctionInfoData, "");
        java.util.Iterator<AbstractC55757xpv> it = this.copydefault.iterator();
        while (it.hasNext()) {
            it.next().EZpvd(callAuctionInfoData, "WebSocket");
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55757xpv) {
            java.util.Iterator<AbstractC55757xpv> it = this.copydefault.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().AhwBna(), (java.lang.Object) ((AbstractC55757xpv) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.copydefault.remove(i);
            }
        }
        if (this.copydefault.size() == 0) {
            EZpvd();
        }
        return this.copydefault.size() == 0;
    }

    public void EZpvd() {
        AbstractC57556yke abstractC57556yke = this.OLrzqt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        C54407xHg.Companion.EZpvd(C56121xwo.copydefault.EZpvd(this.AEQbTJ.EZpvd()), this.OLrzqt);
    }
}
