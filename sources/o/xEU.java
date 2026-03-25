package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xEU extends xGQ<java.util.ArrayList<SpreadArbitrageData>> {
    public final LinkedBlockingDeque<java.lang.String> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final C54291xCz EZpvd;
    public java.lang.String KWHzl;
    public final java.util.ArrayList<SpreadArbitrageData> OLrzqt;
    public final AbstractC55741xpf copydefault;
    public AbstractC57556yke djBIcL;
    public final java.util.ArrayList<AbstractC55741xpf> gEmmrt;
    public final xCA valueOf;

    public xEU(@NotNull java.lang.String str, @NotNull AbstractC55741xpf abstractC55741xpf) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55741xpf, "");
        this.AYXKKw = str;
        this.copydefault = abstractC55741xpf;
        this.valueOf = new xCA();
        this.EZpvd = new C54291xCz();
        this.OLrzqt = new java.util.ArrayList<>();
        this.AEQbTJ = new LinkedBlockingDeque<>();
        java.util.ArrayList<AbstractC55741xpf> arrayList = new java.util.ArrayList<>();
        this.gEmmrt = arrayList;
        arrayList.add(abstractC55741xpf);
        if (abstractC55741xpf.copydefault() == null) {
            copydefault();
        } else {
            copydefault(abstractC55741xpf.copydefault());
        }
    }

    public final void copydefault() {
        xCA xca = this.valueOf;
        xca.EZpvd(this.copydefault.EZpvd());
        xca.copydefault(this.copydefault.KWHzl());
        xca.KWHzl(this.copydefault.OLrzqt());
        xca.KWHzl(new Function1() { // from class: o.xEX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEU.KWHzl(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xca, 0L, 1, null);
    }

    public final void copydefault(java.lang.String str) {
        C54291xCz c54291xCz = this.EZpvd;
        c54291xCz.AEQbTJ(str);
        c54291xCz.KWHzl(new Function1() { // from class: o.xEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEU.OLrzqt(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54291xCz, 0L, 1, null);
    }

    public AbstractC57556yke EZpvd() {
        this.djBIcL = xGQ.getWsListener$default(this, this.copydefault.AEQbTJ(), new WsArgV5(this.copydefault.AEQbTJ(), null, null, null, this.KWHzl, null, null, null, 238, null), (Function1) null, 4, (java.lang.Object) null);
        KWHzl(700L);
        return this.djBIcL;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.AEQbTJ.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<SpreadArbitrageData> bD_() throws java.lang.InterruptedException {
        while (!this.AEQbTJ.isEmpty()) {
            SpreadArbitrageData.Companion companion = SpreadArbitrageData.Companion;
            java.lang.String strTake = this.AEQbTJ.take();
            Intrinsics.checkNotNullExpressionValue(strTake, "");
            java.util.List<SpreadArbitrageData> listEZpvd = companion.EZpvd(strTake);
            if (listEZpvd != null) {
                KWHzl(listEZpvd);
            }
        }
        return this.OLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.ArrayList<SpreadArbitrageData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        EZpvd("WebSocket");
    }

    public final void AEQbTJ(@NotNull AbstractC55741xpf abstractC55741xpf) {
        Intrinsics.checkNotNullParameter(abstractC55741xpf, "");
        java.util.ArrayList<SpreadArbitrageData> arrayList = this.OLrzqt;
        if (arrayList != null) {
            AbstractC55741xpf.onResult$default(abstractC55741xpf, arrayList, null, 2, null);
        }
        this.gEmmrt.add(abstractC55741xpf);
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55741xpf) {
            java.util.Iterator<AbstractC55741xpf> it = this.gEmmrt.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().valueOf(), (java.lang.Object) ((AbstractC55741xpf) obj).valueOf())) {
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
        this.valueOf.AYXKKw();
        this.EZpvd.AYXKKw();
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        AbstractC57556yke abstractC57556yke = this.djBIcL;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd(this.copydefault.AEQbTJ(), this.djBIcL);
    }

    private final void EZpvd(java.lang.String str) {
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            ((AbstractC55741xpf) it.next()).AEQbTJ(this.OLrzqt, str);
        }
    }

    private final void KWHzl(java.lang.String str, java.lang.Exception exc) {
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            ((AbstractC55741xpf) it.next()).EZpvd(str, exc);
        }
    }

    public final void KWHzl(@NotNull java.util.List<SpreadArbitrageData> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        for (SpreadArbitrageData spreadArbitrageData : list) {
            java.util.Iterator<T> it = this.OLrzqt.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((SpreadArbitrageData) next).getArbitrageId(), (java.lang.Object) spreadArbitrageData.getArbitrageId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SpreadArbitrageData spreadArbitrageData2 = (SpreadArbitrageData) next;
            if (spreadArbitrageData2 != null) {
                this.OLrzqt.remove(spreadArbitrageData2);
            }
            this.OLrzqt.add(spreadArbitrageData);
        }
    }

    public static final Unit KWHzl(xEU xeu, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            xeu.OLrzqt.clear();
            java.util.Collection collection = (java.util.Collection) responseData.getData();
            if (collection != null && !collection.isEmpty()) {
                java.util.ArrayList<SpreadArbitrageData> arrayList = xeu.OLrzqt;
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                arrayList.addAll((java.util.Collection) data);
            }
            xeu.EZpvd("http");
            AbstractC57556yke abstractC57556ykeEZpvd = xeu.EZpvd();
            if (abstractC57556ykeEZpvd != null) {
                abstractC57556ykeEZpvd.AhwBna();
            }
        } else {
            xeu.KWHzl("http", new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(xEU xeu, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            xeu.OLrzqt.clear();
            java.util.Collection collection = (java.util.Collection) responseData.getData();
            if (collection != null && !collection.isEmpty()) {
                java.util.ArrayList<SpreadArbitrageData> arrayList = xeu.OLrzqt;
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                arrayList.addAll((java.util.Collection) data);
            }
            if (!xeu.OLrzqt.isEmpty()) {
                xeu.KWHzl = xeu.OLrzqt.get(0).getCcy();
            }
            xeu.EZpvd("http");
            AbstractC57556yke abstractC57556ykeEZpvd = xeu.EZpvd();
            if (abstractC57556ykeEZpvd != null) {
                abstractC57556ykeEZpvd.AhwBna();
            }
        } else {
            xeu.KWHzl("http", new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
        }
        return Unit.INSTANCE;
    }
}
