package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xEx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54343xEx extends xGQ<java.util.ArrayList<FundingRateArbitrageData>> {
    public final LinkedBlockingDeque<java.lang.String> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final C54288xCw EZpvd;
    public final java.util.ArrayList<FundingRateArbitrageData> KWHzl;
    public java.lang.String OLrzqt;
    public final xCC copydefault;
    public final AbstractC55669xoM djBIcL;
    public final java.util.ArrayList<AbstractC55669xoM> gEmmrt;
    public AbstractC57556yke valueOf;

    public C54343xEx(@NotNull java.lang.String str, @NotNull AbstractC55669xoM abstractC55669xoM) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55669xoM, "");
        this.AYXKKw = str;
        this.djBIcL = abstractC55669xoM;
        this.copydefault = new xCC();
        this.EZpvd = new C54288xCw();
        this.KWHzl = new java.util.ArrayList<>();
        this.AEQbTJ = new LinkedBlockingDeque<>();
        java.util.ArrayList<AbstractC55669xoM> arrayList = new java.util.ArrayList<>();
        this.gEmmrt = arrayList;
        arrayList.add(abstractC55669xoM);
        if (abstractC55669xoM.EZpvd() == null) {
            AEQbTJ();
        } else {
            copydefault(abstractC55669xoM.EZpvd());
        }
    }

    public final void AEQbTJ() {
        xCC xcc = this.copydefault;
        xcc.EZpvd(this.djBIcL.OLrzqt());
        xcc.OLrzqt(this.djBIcL.AEQbTJ());
        xcc.KWHzl(new Function1() { // from class: o.xEv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54343xEx.copydefault(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xcc, 0L, 1, null);
    }

    public final void copydefault(java.lang.String str) {
        C54288xCw c54288xCw = this.EZpvd;
        c54288xCw.KWHzl(str);
        c54288xCw.KWHzl(new Function1() { // from class: o.xEw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54343xEx.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54288xCw, 0L, 1, null);
    }

    public AbstractC57556yke copydefault() {
        this.valueOf = xGQ.getWsListener$default(this, this.djBIcL.KWHzl(), new WsArgV5(this.djBIcL.KWHzl(), null, null, null, this.OLrzqt, null, null, null, 238, null), (Function1) null, 4, (java.lang.Object) null);
        KWHzl(700L);
        return this.valueOf;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.AEQbTJ.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<FundingRateArbitrageData> bD_() throws java.lang.InterruptedException {
        while (!this.AEQbTJ.isEmpty()) {
            FundingRateArbitrageData.Companion companion = FundingRateArbitrageData.Companion;
            java.lang.String strTake = this.AEQbTJ.take();
            Intrinsics.checkNotNullExpressionValue(strTake, "");
            java.util.List<FundingRateArbitrageData> listEZpvd = companion.EZpvd(strTake);
            if (listEZpvd != null) {
                OLrzqt(listEZpvd);
            }
        }
        return this.KWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.ArrayList<FundingRateArbitrageData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        EZpvd("WebSocket");
    }

    public final void EZpvd(@NotNull AbstractC55669xoM abstractC55669xoM) {
        Intrinsics.checkNotNullParameter(abstractC55669xoM, "");
        java.util.ArrayList<FundingRateArbitrageData> arrayList = this.KWHzl;
        if (arrayList != null) {
            AbstractC55669xoM.onResult$default(abstractC55669xoM, arrayList, null, 2, null);
        }
        this.gEmmrt.add(abstractC55669xoM);
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55669xoM) {
            java.util.Iterator<AbstractC55669xoM> it = this.gEmmrt.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().copydefault(), (java.lang.Object) ((AbstractC55669xoM) obj).copydefault())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.gEmmrt.remove(i);
            }
        }
        if (this.gEmmrt.size() != 0) {
            return false;
        }
        KWHzl();
        return true;
    }

    public final void KWHzl() {
        this.copydefault.AYXKKw();
        this.EZpvd.AYXKKw();
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        AbstractC57556yke abstractC57556yke = this.valueOf;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd(this.djBIcL.KWHzl(), this.valueOf);
    }

    public final void EZpvd(java.lang.String str) {
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            ((AbstractC55669xoM) it.next()).AEQbTJ(this.KWHzl, str);
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.Exception exc) {
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            ((AbstractC55669xoM) it.next()).EZpvd(str, exc);
        }
    }

    public final void OLrzqt(@NotNull java.util.List<FundingRateArbitrageData> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        for (FundingRateArbitrageData fundingRateArbitrageData : list) {
            java.util.Iterator<T> it = this.KWHzl.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((FundingRateArbitrageData) next).getArbitrageId(), (java.lang.Object) fundingRateArbitrageData.getArbitrageId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            FundingRateArbitrageData fundingRateArbitrageData2 = (FundingRateArbitrageData) next;
            if (fundingRateArbitrageData2 != null) {
                this.KWHzl.remove(fundingRateArbitrageData2);
            }
            this.KWHzl.add(fundingRateArbitrageData);
        }
    }

    public static final Unit copydefault(C54343xEx c54343xEx, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            c54343xEx.KWHzl.clear();
            java.util.Collection collection = (java.util.Collection) responseData.getData();
            if (collection != null && !collection.isEmpty()) {
                java.util.ArrayList<FundingRateArbitrageData> arrayList = c54343xEx.KWHzl;
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                arrayList.addAll((java.util.Collection) data);
            }
            c54343xEx.EZpvd("http");
            AbstractC57556yke abstractC57556ykeCopydefault = c54343xEx.copydefault();
            if (abstractC57556ykeCopydefault != null) {
                abstractC57556ykeCopydefault.AhwBna();
            }
        } else {
            c54343xEx.AEQbTJ("http", new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C54343xEx c54343xEx, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            c54343xEx.KWHzl.clear();
            java.util.Collection collection = (java.util.Collection) responseData.getData();
            if (collection != null && !collection.isEmpty()) {
                java.util.ArrayList<FundingRateArbitrageData> arrayList = c54343xEx.KWHzl;
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                arrayList.addAll((java.util.Collection) data);
            }
            if (!c54343xEx.KWHzl.isEmpty()) {
                c54343xEx.OLrzqt = c54343xEx.KWHzl.get(0).getCcy();
            }
            c54343xEx.EZpvd("http");
            AbstractC57556yke abstractC57556ykeCopydefault = c54343xEx.copydefault();
            if (abstractC57556ykeCopydefault != null) {
                abstractC57556ykeCopydefault.AhwBna();
            }
        } else {
            c54343xEx.AEQbTJ("http", new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
        }
        return Unit.INSTANCE;
    }
}
