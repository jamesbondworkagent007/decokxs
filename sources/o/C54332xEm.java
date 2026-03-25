package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.gson.JsonObject;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.biz.ProductItemWsResp;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xEm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54332xEm extends xGQ<java.util.ArrayList<ProductItemResp>> {
    public final java.util.ArrayList<ProductItemResp> AEQbTJ;
    public final java.lang.String AYXKKw;
    public AbstractC55659xoC EZpvd;
    public final LinkedBlockingDeque<java.lang.String> KWHzl;
    public AbstractC57556yke OLrzqt;
    public final xAA copydefault;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public java.lang.String bJ_() {
        return "algo-dcd-bot-product-list";
    }

    public C54332xEm(@NotNull java.lang.String str, AbstractC55659xoC abstractC55659xoC) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        this.EZpvd = abstractC55659xoC;
        this.AEQbTJ = new java.util.ArrayList<>();
        this.KWHzl = new LinkedBlockingDeque<>();
        this.copydefault = new xAA();
        EZpvd();
    }

    public final void EZpvd() {
        DcdProductListReq dcdProductListReqEZpvd;
        xAA xaa = this.copydefault;
        AbstractC55659xoC abstractC55659xoC = this.EZpvd;
        if (abstractC55659xoC == null || (dcdProductListReqEZpvd = abstractC55659xoC.EZpvd()) == null) {
            return;
        }
        xaa.copydefault(dcdProductListReqEZpvd);
        xaa.KWHzl(new Function1() { // from class: o.xEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54332xEm.EZpvd(this.KWHzl, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xaa, 0L, 1, null);
    }

    public AbstractC57556yke KWHzl() {
        DcdProductListReq dcdProductListReqEZpvd;
        DcdProductListReq dcdProductListReqEZpvd2;
        DcdProductListReq dcdProductListReqEZpvd3;
        DcdProductListReq dcdProductListReqEZpvd4;
        DcdProductListReq dcdProductListReqEZpvd5;
        java.lang.String strBJ_ = bJ_();
        AbstractC55659xoC abstractC55659xoC = this.EZpvd;
        java.lang.String instType = (abstractC55659xoC == null || (dcdProductListReqEZpvd5 = abstractC55659xoC.EZpvd()) == null) ? null : dcdProductListReqEZpvd5.getInstType();
        AbstractC55659xoC abstractC55659xoC2 = this.EZpvd;
        java.lang.String instId = (abstractC55659xoC2 == null || (dcdProductListReqEZpvd4 = abstractC55659xoC2.EZpvd()) == null) ? null : dcdProductListReqEZpvd4.getInstId();
        JsonObject jsonObject = new JsonObject();
        AbstractC55659xoC abstractC55659xoC3 = this.EZpvd;
        jsonObject.addProperty("strike", (abstractC55659xoC3 == null || (dcdProductListReqEZpvd3 = abstractC55659xoC3.EZpvd()) == null) ? null : dcdProductListReqEZpvd3.getStrike());
        AbstractC55659xoC abstractC55659xoC4 = this.EZpvd;
        jsonObject.addProperty("minAnnualYieldPercentage", (abstractC55659xoC4 == null || (dcdProductListReqEZpvd2 = abstractC55659xoC4.EZpvd()) == null) ? null : dcdProductListReqEZpvd2.getMinAnnualYieldPercentage());
        AbstractC55659xoC abstractC55659xoC5 = this.EZpvd;
        jsonObject.addProperty("maxSettlementDay", (abstractC55659xoC5 == null || (dcdProductListReqEZpvd = abstractC55659xoC5.EZpvd()) == null) ? null : dcdProductListReqEZpvd.getMaxSettlementDay());
        AbstractC55659xoC abstractC55659xoC6 = this.EZpvd;
        jsonObject.addProperty("countryCode", abstractC55659xoC6 != null ? abstractC55659xoC6.copydefault() : null);
        AbstractC55659xoC abstractC55659xoC7 = this.EZpvd;
        jsonObject.addProperty("entityId", abstractC55659xoC7 != null ? abstractC55659xoC7.KWHzl() : null);
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strBJ_, new WsArgV5(strBJ_, instId, null, instType, null, null, null, jsonObject, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), (Function1) null, 4, (java.lang.Object) null);
        this.OLrzqt = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
        return this.OLrzqt;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.KWHzl.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<ProductItemResp> bD_() {
        AEQbTJ();
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.ArrayList<ProductItemResp> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC55659xoC abstractC55659xoC = this.EZpvd;
        if (abstractC55659xoC != null) {
            abstractC55659xoC.OLrzqt("WebSocket", new java.util.ArrayList(this.AEQbTJ));
        }
    }

    public final void AEQbTJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.KWHzl.isEmpty()) {
            arrayList.add(this.KWHzl.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<ProductItemResp> listCopydefault = copydefault((java.lang.String) next);
            this.AEQbTJ.clear();
            if (listCopydefault != null) {
                this.AEQbTJ.addAll(listCopydefault);
            }
        }
    }

    private final java.util.List<ProductItemResp> copydefault(java.lang.String str) {
        ProductItemWsResp productItemWsResp;
        java.util.List<ProductItemResp> products;
        try {
            java.util.List list = (java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(ProductItemWsResp.Companion.serializer()), str);
            if (!list.isEmpty() && (productItemWsResp = (ProductItemWsResp) CollectionsKt___CollectionsKt.firstOrNull(list)) != null && (products = productItemWsResp.getProducts()) != null) {
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(products);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return null;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55659xoC) {
            java.lang.String strOLrzqt = ((AbstractC55659xoC) obj).OLrzqt();
            AbstractC55659xoC abstractC55659xoC = this.EZpvd;
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) (abstractC55659xoC != null ? abstractC55659xoC.OLrzqt() : null))) {
                return false;
            }
        }
        copydefault();
        return true;
    }

    public final void copydefault() {
        C54407xHg.Companion.EZpvd(bJ_(), this.OLrzqt);
        AbstractC57556yke abstractC57556yke = this.OLrzqt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.OLrzqt = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
    }

    public static final Unit EZpvd(C54332xEm c54332xEm, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            AbstractC55659xoC abstractC55659xoC = c54332xEm.EZpvd;
            if (abstractC55659xoC != null) {
                java.util.List<ProductItemResp> arrayList = (java.util.List) responseData.getData();
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                abstractC55659xoC.OLrzqt("WebSocket", arrayList);
            }
            c54332xEm.KWHzl();
        } else {
            AbstractC55659xoC abstractC55659xoC2 = c54332xEm.EZpvd;
            if (abstractC55659xoC2 != null) {
                abstractC55659xoC2.OLrzqt(responseData.getMsg());
            }
        }
        return Unit.INSTANCE;
    }
}
