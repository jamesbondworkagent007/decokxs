package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ConceptHot;
import com.okinc.unify_trade.biz.ConceptRankData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xEu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54340xEu extends xGQ<java.util.ArrayList<ConceptHot>> {
    public AbstractC55666xoJ AEQbTJ;
    public final xCD EZpvd;
    public java.lang.String KWHzl;
    public AbstractC57556yke OLrzqt;
    public final java.lang.String copydefault;

    /* JADX INFO: renamed from: o.xEu$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.List<? extends ConceptRankData>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public java.lang.String bJ_() {
        return "plate-rank";
    }

    public C54340xEu(@NotNull java.lang.String str, AbstractC55666xoJ abstractC55666xoJ) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.AEQbTJ = abstractC55666xoJ;
        this.KWHzl = "";
        this.EZpvd = new xCD();
        AEQbTJ();
    }

    public final void AEQbTJ() {
        xCD xcd = this.EZpvd;
        xcd.KWHzl(new Function1() { // from class: o.xEs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54340xEu.EZpvd(this.copydefault, (ResponseData) obj);
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
        this.KWHzl = str;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<ConceptHot> bD_() {
        return AEQbTJ2(OLrzqt(this.KWHzl));
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final java.util.ArrayList<ConceptHot> AEQbTJ2(java.util.ArrayList<ConceptRankData> arrayList) {
        if (arrayList != null && C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            ConceptRankData conceptRankData = arrayList.get(0);
            Intrinsics.copydefault(conceptRankData);
            if (C33129mqd.KWHzl((java.util.Collection) conceptRankData.getHot())) {
                ConceptRankData conceptRankData2 = arrayList.get(0);
                Intrinsics.copydefault(conceptRankData2);
                return conceptRankData2.getHot();
            }
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.ArrayList<ConceptHot> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC55666xoJ abstractC55666xoJ = this.AEQbTJ;
        if (abstractC55666xoJ != null) {
            abstractC55666xoJ.AEQbTJ(arrayList);
        }
    }

    private final java.util.ArrayList<ConceptRankData> OLrzqt(java.lang.String str) {
        try {
            return (java.util.ArrayList) new Gson().fromJson(str, new StateListAnimator().getType());
        } catch (java.lang.Exception e) {
            pUU.KWHzl("JSON PARSE", "FindConceptUpTask-jsonConvert" + e.getMessage());
            return null;
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55666xoJ) {
            java.lang.String strEZpvd = ((AbstractC55666xoJ) obj).EZpvd();
            AbstractC55666xoJ abstractC55666xoJ = this.AEQbTJ;
            if (!Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) (abstractC55666xoJ != null ? abstractC55666xoJ.EZpvd() : null))) {
                return false;
            }
        }
        EZpvd();
        return true;
    }

    public final void EZpvd() {
        AbstractC57556yke abstractC57556yke = this.OLrzqt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        xCD xcd = this.EZpvd;
        if (xcd != null) {
            xcd.AYXKKw();
        }
        C54407xHg.Companion.EZpvd(bJ_(), this.OLrzqt);
    }

    public static final Unit EZpvd(C54340xEu c54340xEu, ResponseData responseData) {
        java.util.ArrayList arrayList;
        ConceptRankData conceptRankData;
        java.util.ArrayList<ConceptHot> hot;
        AbstractC55666xoJ abstractC55666xoJ;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && (arrayList = (java.util.ArrayList) responseData.getData()) != null && (!arrayList.isEmpty())) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
            if (arrayList2 != null && (conceptRankData = (ConceptRankData) arrayList2.get(0)) != null && (hot = conceptRankData.getHot()) != null && (abstractC55666xoJ = c54340xEu.AEQbTJ) != null) {
                abstractC55666xoJ.AEQbTJ(hot);
            }
        } else {
            java.lang.String msg = responseData.getMsg();
            if (msg.length() == 0) {
                msg = C33070mpX.AYXKKw(C55688xof.Application.putInt);
            }
            java.lang.Exception exc = new java.lang.Exception(msg);
            AbstractC55666xoJ abstractC55666xoJ2 = c54340xEu.AEQbTJ;
            if (abstractC55666xoJ2 != null) {
                abstractC55666xoJ2.OLrzqt(exc);
            }
        }
        return Unit.INSTANCE;
    }
}
