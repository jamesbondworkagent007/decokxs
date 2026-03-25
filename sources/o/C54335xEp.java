package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ConceptRankData;
import com.okinc.unify_trade.biz.ConceptUpDown;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xEp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54335xEp extends xGQ<java.util.ArrayList<ConceptUpDown>> {
    public final java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public AbstractC55667xoK KWHzl;
    public AbstractC57556yke OLrzqt;
    public final xCD copydefault;

    /* JADX INFO: renamed from: o.xEp$Application */
    public static final class Application extends TypeToken<java.util.List<? extends ConceptRankData>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public java.lang.String bJ_() {
        return "plate-rank";
    }

    public C54335xEp(@NotNull java.lang.String str, AbstractC55667xoK abstractC55667xoK) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.KWHzl = abstractC55667xoK;
        this.EZpvd = "";
        this.copydefault = new xCD();
        KWHzl();
    }

    public final void KWHzl() {
        xCD xcd = this.copydefault;
        xcd.KWHzl(new Function1() { // from class: o.xEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54335xEp.OLrzqt(this.KWHzl, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xcd, 0L, 1, null);
        AbstractC57556yke abstractC57556ykeCopydefault = copydefault();
        this.OLrzqt = abstractC57556ykeCopydefault;
        if (abstractC57556ykeCopydefault != null) {
            abstractC57556ykeCopydefault.AhwBna();
        }
    }

    public AbstractC57556yke copydefault() {
        this.OLrzqt = xGQ.getWsListener$default(this, bJ_(), new WsArgV5(bJ_(), null, null, null, null, null, null, null, 254, null), (Function1) null, 4, (java.lang.Object) null);
        KWHzl(700L);
        return this.OLrzqt;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.EZpvd = str;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<ConceptUpDown> bD_() {
        return KWHzl(KWHzl(this.EZpvd));
    }

    public final java.util.ArrayList<ConceptUpDown> KWHzl(java.util.ArrayList<ConceptRankData> arrayList) {
        if (arrayList != null && C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            ConceptRankData conceptRankData = arrayList.get(0);
            Intrinsics.copydefault(conceptRankData);
            if (C33129mqd.KWHzl((java.util.Collection) conceptRankData.getUpDown())) {
                ConceptRankData conceptRankData2 = arrayList.get(0);
                Intrinsics.copydefault(conceptRankData2);
                return conceptRankData2.getUpDown();
            }
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.ArrayList<ConceptUpDown> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC55667xoK abstractC55667xoK = this.KWHzl;
        if (abstractC55667xoK != null) {
            abstractC55667xoK.copydefault(arrayList);
        }
    }

    public final java.util.ArrayList<ConceptRankData> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.util.ArrayList<ConceptRankData> arrayList = (java.util.ArrayList) new Gson().fromJson(str, new Application().getType());
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
            }
        } catch (java.lang.Exception e) {
            pUU.KWHzl("JSON PARSE", "FindConceptDownTask-ConceptRankData-jsonConvert" + e.getMessage());
        }
        return null;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55667xoK) {
            java.lang.String strCopydefault = ((AbstractC55667xoK) obj).copydefault();
            AbstractC55667xoK abstractC55667xoK = this.KWHzl;
            if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (abstractC55667xoK != null ? abstractC55667xoK.copydefault() : null))) {
                return false;
            }
        }
        AEQbTJ();
        return true;
    }

    public final void AEQbTJ() {
        AbstractC57556yke abstractC57556yke = this.OLrzqt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.copydefault.AYXKKw();
        C54407xHg.Companion.EZpvd(bJ_(), this.OLrzqt);
    }

    public static final Unit OLrzqt(C54335xEp c54335xEp, ResponseData responseData) {
        java.util.ArrayList arrayList;
        ConceptRankData conceptRankData;
        java.util.ArrayList<ConceptUpDown> upDown;
        AbstractC55667xoK abstractC55667xoK;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && (arrayList = (java.util.ArrayList) responseData.getData()) != null && (!arrayList.isEmpty())) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
            if (arrayList2 != null && (conceptRankData = (ConceptRankData) arrayList2.get(0)) != null && (upDown = conceptRankData.getUpDown()) != null && (abstractC55667xoK = c54335xEp.KWHzl) != null) {
                abstractC55667xoK.copydefault(upDown);
            }
        } else {
            java.lang.String msg = responseData.getMsg();
            if (msg.length() == 0) {
                msg = C33070mpX.AYXKKw(C55688xof.Application.putInt);
            }
            java.lang.Exception exc = new java.lang.Exception(msg);
            AbstractC55667xoK abstractC55667xoK2 = c54335xEp.KWHzl;
            if (abstractC55667xoK2 != null) {
                abstractC55667xoK2.KWHzl(exc);
            }
        }
        return Unit.INSTANCE;
    }
}
