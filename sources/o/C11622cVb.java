package o;

import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.biz.net.bean.WalletTxJavaReq;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11622cVb extends AbstractC43215rlA implements InterfaceC9848bdN {
    public final C13934dbu AEQbTJ = new C13934dbu();
    public final java.util.HashMap<java.lang.String, java.lang.Long> OLrzqt = new java.util.HashMap<>();

    @Override // o.InterfaceC9848bdN
    public AbstractC58185ywX<java.lang.Long> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Long l = this.OLrzqt.get(str);
        if (l != null) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l.longValue());
            AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Long.valueOf(c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : -1L));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(this.AEQbTJ.AYXKKw(), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cUZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11622cVb.AEQbTJ(this.AEQbTJ, str, (JsonObject) obj);
            }
        };
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cVa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11622cVb.OLrzqt(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Long OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Long) function1.invoke(obj);
    }

    public static final java.lang.Long AEQbTJ(C11622cVb c11622cVb, java.lang.String str, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        java.util.Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c11622cVb.OLrzqt.put((java.lang.String) entry.getKey(), java.lang.Long.valueOf(JsonElementKt.getLong(JsonElementKt.getJsonPrimitive((JsonElement) entry.getValue()))));
        }
        java.lang.Long l = c11622cVb.OLrzqt.get(str);
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l != null ? l.longValue() : 0L);
        return java.lang.Long.valueOf(c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : -1L);
    }

    @Override // o.InterfaceC9848bdN
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYW.AEQbTJ.AEQbTJ(str);
    }

    @Override // o.InterfaceC9848bdN
    public AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) interfaceC9738bbJ;
        WalletTxJavaReq walletTxJavaReq = (WalletTxJavaReq) new Gson().fromJson((com.google.gson.JsonElement) newCallbackBean.getBody().getAsJsonObject("walletTxData"), WalletTxJavaReq.class);
        C13934dbu c13934dbu = this.AEQbTJ;
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
        java.lang.String strAUsmxb = abstractC12782ctV.aUsmxb();
        Intrinsics.copydefault(walletTxJavaReq);
        return c13934dbu.EZpvd(strDbNXlk, strUSBtdM, strAUsmxb, walletTxJavaReq);
    }
}
