package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xES extends xGQ<LimitPriceData> {
    public java.lang.String AEQbTJ;
    public AbstractC55678xoV EZpvd;
    public final xBC KWHzl;
    public AbstractC57556yke OLrzqt;
    public final java.lang.String copydefault;

    public xES(@NotNull java.lang.String str, AbstractC55678xoV abstractC55678xoV) {
        java.lang.String strOLrzqt;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.EZpvd = abstractC55678xoV;
        xBC xbc = new xBC();
        this.KWHzl = xbc;
        xbc.AYXKKw();
        AbstractC55678xoV abstractC55678xoV2 = this.EZpvd;
        if (abstractC55678xoV2 != null && (strOLrzqt = abstractC55678xoV2.OLrzqt()) != null) {
            str2 = strOLrzqt;
        }
        xbc.AEQbTJ(str2);
        xbc.KWHzl(new Function1() { // from class: o.xEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xES.OLrzqt(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbc, 0L, 1, null);
    }

    public static final Unit OLrzqt(xES xes, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xes.EZpvd(responseData);
        return Unit.INSTANCE;
    }

    public AbstractC57556yke copydefault() {
        AbstractC55678xoV abstractC55678xoV = this.EZpvd;
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "price-limit", new WsArgV5("price-limit", abstractC55678xoV != null ? abstractC55678xoV.OLrzqt() : null, null, null, null, null, null, null, 252, null), (Function1) null, 4, (java.lang.Object) null);
        this.OLrzqt = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
        return this.OLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public LimitPriceData bD_() {
        LimitPriceData.Companion companion = LimitPriceData.Companion;
        java.lang.String str = this.AEQbTJ;
        if (str == null) {
            str = "";
        }
        LimitPriceData limitPriceDataOLrzqt = companion.OLrzqt(str);
        return limitPriceDataOLrzqt == null ? new LimitPriceData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null) : limitPriceDataOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull LimitPriceData limitPriceData) {
        AbstractC55678xoV abstractC55678xoV;
        Intrinsics.checkNotNullParameter(limitPriceData, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ) || (abstractC55678xoV = this.EZpvd) == null) {
            return;
        }
        AbstractC55755xpt.onResult$default(abstractC55678xoV, limitPriceData, null, 2, null);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.AEQbTJ = str;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        KWHzl();
        return true;
    }

    public final void EZpvd() {
        AbstractC57556yke abstractC57556yke = this.OLrzqt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
            C54407xHg.Companion.EZpvd("price-limit", abstractC57556yke);
        }
        this.OLrzqt = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.KWHzl.AYXKKw();
    }

    public void KWHzl() {
        this.EZpvd = null;
        EZpvd();
    }

    public final void EZpvd(ResponseData<java.util.List<LimitPriceData>> responseData) {
        AbstractC55678xoV abstractC55678xoV;
        LimitPriceData limitPriceData;
        if (responseData.getCode() == 0 && responseData.getData() != null && (abstractC55678xoV = this.EZpvd) != null) {
            java.util.List<LimitPriceData> data = responseData.getData();
            if (data == null || (limitPriceData = (LimitPriceData) CollectionsKt___CollectionsKt.firstOrNull(data)) == null) {
                limitPriceData = new LimitPriceData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
            }
            AbstractC55755xpt.onResult$default(abstractC55678xoV, limitPriceData, null, 2, null);
        }
        copydefault();
    }
}
