package com.okinc.business.market.common.websocket;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57576yky;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexWsParam extends WsSubscribeArgV5 {
    public static final int $stable = 8;
    private String chainIndex;
    private String instId;
    private String tokenContractAddress;

    @Expose(serialize = false)
    private String uniqueKey;
    private String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 com.google.gson.JsonObject) : (null com.google.gson.JsonObject))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void (m)] (LINE:26) call: com.okinc.business.market.common.websocket.DexWsParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void type: THIS */
    public /* synthetic */ DexWsParam(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? jsonObject : null);
    }

    public DexWsParam(@NotNull String str, String str2, String str3, String str4, String str5, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uniqueKey = "";
        setChannel(str);
        this.instId = str2;
        this.chainIndex = str3;
        this.tokenContractAddress = str4;
        this.walletAddress = str5;
        if (jsonObject != null) {
            setExtraParams(jsonObject.toString());
        }
    }

    @Override // o.InterfaceC57559ykh
    public String getUniqueKey() {
        if (this.uniqueKey.length() == 0) {
            this.uniqueKey = C57576yky.AEQbTJ.copydefault(getChannel(), this.instId, this.chainIndex, this.tokenContractAddress, this.walletAddress);
        }
        return this.uniqueKey;
    }

    @Override // o.InterfaceC57559ykh
    public String getUniqueKeyByResponse(HashMap<String, String> map) {
        if (map == null) {
            return "";
        }
        C57576yky c57576yky = C57576yky.AEQbTJ;
        String str = map.get(AppsFlyerProperties.CHANNEL);
        return c57576yky.copydefault(str != null ? str : "", map.get("instId"), map.get("chainIndex"), map.get("tokenContractAddress"), map.get("walletAddress"));
    }
}
