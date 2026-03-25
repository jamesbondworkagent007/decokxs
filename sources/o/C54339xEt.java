package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.MovementBean;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xEt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54339xEt extends xGQ<java.util.ArrayList<MovementBean>> {
    public final java.lang.String AEQbTJ;
    public AbstractC55665xoI EZpvd;
    public AbstractC57556yke KWHzl;
    public java.lang.String OLrzqt;
    public final xCI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public java.lang.String bJ_() {
        return "notable-market-changes";
    }

    public C54339xEt(@NotNull java.lang.String str, AbstractC55665xoI abstractC55665xoI) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.EZpvd = abstractC55665xoI;
        this.OLrzqt = "";
        this.copydefault = new xCI();
        copydefault();
    }

    public final void copydefault() {
        java.lang.String strOLrzqt;
        java.lang.String strAEQbTJ;
        java.lang.String strCopydefault;
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        AbstractC55665xoI abstractC55665xoI = this.EZpvd;
        java.lang.String str = "";
        if (abstractC55665xoI == null || (strOLrzqt = abstractC55665xoI.OLrzqt()) == null) {
            strOLrzqt = "";
        }
        map.put("maxId", strOLrzqt);
        AbstractC55665xoI abstractC55665xoI2 = this.EZpvd;
        if (abstractC55665xoI2 == null || (strAEQbTJ = abstractC55665xoI2.AEQbTJ()) == null) {
            strAEQbTJ = "";
        }
        map.put("size", strAEQbTJ);
        AbstractC55665xoI abstractC55665xoI3 = this.EZpvd;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (abstractC55665xoI3 != null ? abstractC55665xoI3.copydefault() : null))) {
            AbstractC55665xoI abstractC55665xoI4 = this.EZpvd;
            if (abstractC55665xoI4 != null && (strCopydefault = abstractC55665xoI4.copydefault()) != null) {
                str = strCopydefault;
            }
            map.put("eventType", str);
        }
        xCI xci = this.copydefault;
        xci.KWHzl(map);
        xci.KWHzl(new Function1() { // from class: o.xEr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54339xEt.EZpvd(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xci, 0L, 1, null);
    }

    public AbstractC57556yke AEQbTJ() {
        this.KWHzl = xGQ.getWsListener$default(this, bJ_(), new WsArgV5(bJ_(), null, null, null, null, null, null, null, 254, null), (Function1) null, 4, (java.lang.Object) null);
        KWHzl(700L);
        return this.KWHzl;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<MovementBean> bD_() {
        java.util.List<MovementBean> listKWHzl = MovementBean.Companion.KWHzl(this.OLrzqt);
        if (listKWHzl != null) {
            return xRI.KWHzl.OLrzqt((java.util.ArrayList) listKWHzl);
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.ArrayList<MovementBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC55665xoI abstractC55665xoI = this.EZpvd;
        if (abstractC55665xoI != null) {
            abstractC55665xoI.EZpvd(arrayList);
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55665xoI) {
            java.lang.String strEZpvd = ((AbstractC55665xoI) obj).EZpvd();
            AbstractC55665xoI abstractC55665xoI = this.EZpvd;
            if (!Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) (abstractC55665xoI != null ? abstractC55665xoI.EZpvd() : null))) {
                return false;
            }
        }
        KWHzl();
        return true;
    }

    public final void KWHzl() {
        AbstractC57556yke abstractC57556yke = this.KWHzl;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        C54407xHg.Companion.EZpvd(bJ_(), this.KWHzl);
    }

    public static final Unit EZpvd(C54339xEt c54339xEt, ResponseData responseData) {
        java.util.ArrayList arrayList;
        java.util.ArrayList<MovementBean> arrayListOLrzqt;
        AbstractC55665xoI abstractC55665xoI;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && (arrayList = (java.util.ArrayList) responseData.getData()) != null && (!arrayList.isEmpty())) {
            java.util.ArrayList<MovementBean> arrayList2 = (java.util.ArrayList) responseData.getData();
            if (arrayList2 != null && (arrayListOLrzqt = xRI.KWHzl.OLrzqt(arrayList2)) != null && (abstractC55665xoI = c54339xEt.EZpvd) != null) {
                abstractC55665xoI.KWHzl(arrayListOLrzqt);
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ = c54339xEt.AEQbTJ();
            c54339xEt.KWHzl = abstractC57556ykeAEQbTJ;
            if (abstractC57556ykeAEQbTJ != null) {
                abstractC57556ykeAEQbTJ.AhwBna();
            }
        } else {
            java.lang.String msg = responseData.getMsg();
            if (msg.length() == 0) {
                msg = C33070mpX.AYXKKw(C55688xof.Application.putInt);
            }
            java.lang.Exception exc = new java.lang.Exception(msg);
            AbstractC55665xoI abstractC55665xoI2 = c54339xEt.EZpvd;
            if (abstractC55665xoI2 != null) {
                abstractC55665xoI2.copydefault(exc);
            }
        }
        return Unit.INSTANCE;
    }
}
