package o;

import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.net.bean.BrcJsonRes;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.cjq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12275cjq extends C12266cjh {
    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.C12266cjh
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> Ufzxmz() {
        AbstractC58185ywX<ResponseData<BrcJsonRes>> abstractC58185ywXOLrzqt = OFhtUX().OLrzqt(fHqPtx().fJNWhG(), AbstractC8664bGw.getTransferCoinAmount$default(this, false, false, 3, null), ExtJson.BRC20TYPE_TRANSFER, "brc20-s", C14079deg.EZpvd.AEQbTJ(fHqPtx()));
        final Function1 function1 = new Function1() { // from class: o.cjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12275cjq.EZpvd(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cjw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12275cjq.OJuSTm(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair OJuSTm(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(C12275cjq c12275cjq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            BrcJsonRes brcJsonRes = (BrcJsonRes) responseData.getData();
            java.lang.String brcJson = brcJsonRes != null ? brcJsonRes.getBrcJson() : null;
            if (brcJson == null) {
                brcJson = "";
            }
            c12275cjq.EZpvd(brcJson);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
