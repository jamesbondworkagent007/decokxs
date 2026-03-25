package o;

import com.okinc.business.defi.biz.walletconnect.OKXAuthPayloadParams;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dZS {
    public final java.util.HashMap<java.lang.Long, OKXAuthPayloadParams> AEQbTJ;
    public final KSerializer<java.util.Map<java.lang.String, java.util.List<WalletConnectUtils.SessionTopicInfo>>> EZpvd;
    public java.util.List<WalletConnectUtils.OriginFromInfo> KWHzl;
    public final KSerializer<java.util.List<WalletConnectUtils.OriginFromInfo>> OLrzqt;
    public java.util.Map<java.lang.String, ? extends java.util.List<WalletConnectUtils.SessionTopicInfo>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WalletConnectUtils.OriginFromInfo> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.Long, OKXAuthPayloadParams> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.wallet.common.WalletConnectUtils$SessionTopicInfo>>, java.util.Map<java.lang.String, java.util.List<com.okinc.business.defi.wallet.common.WalletConnectUtils$SessionTopicInfo>> */
    public final java.util.Map<java.lang.String, java.util.List<WalletConnectUtils.SessionTopicInfo>> copydefault() {
        return this.copydefault;
    }

    public dZS() {
        java.util.Map<java.lang.String, ? extends java.util.List<WalletConnectUtils.SessionTopicInfo>> mapKWHzl;
        java.util.List<WalletConnectUtils.OriginFromInfo> listAhwBna;
        KSerializer<java.util.Map<java.lang.String, java.util.List<WalletConnectUtils.SessionTopicInfo>>> kSerializerMapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl), BuiltinSerializersKt.ListSerializer(WalletConnectUtils.SessionTopicInfo.Companion.serializer()));
        this.EZpvd = kSerializerMapSerializer;
        this.OLrzqt = BuiltinSerializersKt.ListSerializer(WalletConnectUtils.OriginFromInfo.Companion.serializer());
        try {
            C33489mxS c33489mxS = C33489mxS.KWHzl;
            java.lang.String string = SPUtils.getString("KEY_WC_SESSION_LIST", "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            mapKWHzl = (java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerMapSerializer, string);
        } catch (java.lang.Exception unused) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        this.copydefault = mapKWHzl;
        try {
            C33489mxS c33489mxS2 = C33489mxS.KWHzl;
            KSerializer<java.util.List<WalletConnectUtils.OriginFromInfo>> kSerializer = this.OLrzqt;
            java.lang.String string2 = SPUtils.getString("KEY_WC_SESSION_ORIGIN_LIST", "");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            listAhwBna = (java.util.List) c33489mxS2.OLrzqt((DeserializationStrategy) kSerializer, string2);
        } catch (java.lang.Exception unused2) {
            listAhwBna = yDY.AhwBna();
        }
        this.KWHzl = listAhwBna;
        this.AEQbTJ = new java.util.HashMap<>();
    }

    public final void AEQbTJ(@NotNull java.util.Map<java.lang.String, ? extends java.util.List<WalletConnectUtils.SessionTopicInfo>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault = map;
        SPUtils.put("KEY_WC_SESSION_LIST", C33489mxS.KWHzl.KWHzl(this.EZpvd, map));
    }

    public final void copydefault(@NotNull java.util.List<WalletConnectUtils.OriginFromInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        SPUtils.put("KEY_WC_SESSION_ORIGIN_LIST", C33489mxS.KWHzl.KWHzl(this.OLrzqt, list));
    }
}
