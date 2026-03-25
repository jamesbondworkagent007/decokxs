package com.okinc.websocket.v5config.web3;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57576yky;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WsArgV5ForWeb3 extends WsSubscribeArgV5 {
    public static final int $stable = 8;
    private String chainIndex;
    private String instId;
    private String tokenContractAddress;

    @Expose(serialize = false)
    private String uniqueKey;

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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 com.google.gson.JsonObject) : (null com.google.gson.JsonObject))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void (m)] (LINE:26) call: com.okinc.websocket.v5config.web3.WsArgV5ForWeb3.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void type: THIS */
    public /* synthetic */ WsArgV5ForWeb3(String str, String str2, String str3, String str4, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? jsonObject : null);
    }

    public WsArgV5ForWeb3(@NotNull String str, String str2, String str3, String str4, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uniqueKey = "";
        setChannel(str);
        this.instId = str2;
        this.chainIndex = str3;
        this.tokenContractAddress = str4;
        if (jsonObject != null) {
            setExtraParams(jsonObject.toString());
        }
    }

    public WsArgV5ForWeb3(HashMap<String, String> map) {
        this.uniqueKey = "";
        if (map != null) {
            String str = map.get(AppsFlyerProperties.CHANNEL);
            setChannel(str != null ? str : "");
            this.instId = map.get("instId");
            this.chainIndex = map.get("chainIndex");
            this.tokenContractAddress = map.get("tokenContractAddress");
            setExtraParams(map.get("extraParams"));
        }
    }

    @Override // o.InterfaceC57559ykh
    public String getUniqueKey() {
        if (this.uniqueKey.length() == 0) {
            this.uniqueKey = C57576yky.AEQbTJ.copydefault(getChannel(), this.instId, this.chainIndex, this.tokenContractAddress);
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
        return c57576yky.copydefault(str != null ? str : "", map.get("instId"), map.get("chainIndex"), map.get("tokenContractAddress"));
    }
}
