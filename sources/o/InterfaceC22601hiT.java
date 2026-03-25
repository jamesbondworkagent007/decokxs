package o;

import com.okinc.business.dexlogic.bean.BridgeRedeemBroadcastReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemBroadcastResponse;
import com.okinc.business.dexlogic.bean.BridgeRedeemCallDataReq;
import com.okinc.business.dexlogic.bean.BridgeRedeemCallDataResponse;
import com.okinc.business.dexlogic.bean.SwapBridgeDAppInfo;
import com.okinc.business.dexlogic.bean.TokenCheckInfo;
import com.okinc.network.okg.response.ResponseData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22601hiT {
    AbstractC58185ywX<BridgeRedeemBroadcastResponse> AEQbTJ(@NotNull BridgeRedeemBroadcastReq bridgeRedeemBroadcastReq);

    AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    AbstractC58185ywX<BridgeRedeemCallDataResponse> OLrzqt(@NotNull BridgeRedeemCallDataReq bridgeRedeemCallDataReq);

    AbstractC58185ywX<TokenCheckInfo> OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6);
}
