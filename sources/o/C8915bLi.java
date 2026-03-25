package o;

import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EtcSignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bLi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8915bLi extends C8998bNL {
    public boolean KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8998bNL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8998bNL
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8998bNL, o.InterfaceC8931bLy
    public java.lang.String V_() {
        java.lang.String str = this.OLrzqt;
        return str == null ? "" : str;
    }

    @Override // o.C8998bNL, o.InterfaceC8931bLy
    public java.lang.String QKVWgx() {
        java.lang.String chainId = uzCIH().getChainId();
        if (chainId == null || chainId.length() == 0) {
            return C33129mqd.gEmmrt(java.lang.Long.valueOf(dHguZz().fetchVPNInfo()));
        }
        java.lang.String chainId2 = uzCIH().getChainId();
        Intrinsics.copydefault((java.lang.Object) chainId2);
        return chainId2;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.C8998bNL
    public AbstractC58185ywX<ResponseData<SignInfo>> OcIXYQ() {
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXOcIXYQ = super.OcIXYQ();
        final Function1 function1 = new Function1() { // from class: o.bLk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8915bLi.copydefault(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXKWHzl = abstractC58185ywXOcIXYQ.KWHzl(new InterfaceC58227yxM() { // from class: o.bLj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8915bLi.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8998bNL, o.AbstractC8664bGw, o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        java.util.ArrayList<java.lang.Integer> arrayListAuCTelauCTel = super.AuCTelauCTel();
        java.util.Iterator<java.lang.Integer> it = arrayListAuCTelauCTel.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Integer next = it.next();
            if (next != null && next.intValue() == 5) {
                it.remove();
            }
        }
        return arrayListAuCTelauCTel;
    }

    public static final Unit copydefault(C8915bLi c8915bLi, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            if (((SignInfo) data).getInfo() != null) {
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<EtcSignInfo> kSerializerSerializer = EtcSignInfo.Companion.serializer();
                java.lang.Object data2 = responseData.getData();
                Intrinsics.copydefault(data2);
                JsonObject info = ((SignInfo) data2).getInfo();
                Intrinsics.copydefault(info);
                c8915bLi.OLrzqt = ((EtcSignInfo) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, info.toString())).getNonce();
            }
        }
        return Unit.INSTANCE;
    }
}
