package com.okinc.websocket.v5config;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57576yky;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class WsArgV5 extends WsSubscribeArgV5 {
    public static final int $stable = 8;
    private String algoId;
    private String ccy;
    private String grouping;
    private String instFamily;
    private String instId;
    private String instType;

    @Expose(serialize = false)
    private String uniqueKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGrouping() {
        return this.grouping;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    public WsArgV5() {
        this.uniqueKey = "";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 com.google.gson.JsonObject) : (null com.google.gson.JsonObject))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void (m)] (LINE:35) call: com.okinc.websocket.v5config.WsArgV5.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void type: THIS */
    public /* synthetic */ WsArgV5(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? jsonObject : null);
    }

    public WsArgV5(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uniqueKey = "";
        setChannel(str);
        this.instId = str2;
        this.instFamily = str3;
        this.instType = str4;
        this.ccy = str5;
        this.algoId = str6;
        this.grouping = str7;
        if (jsonObject != null) {
            setExtraParams(jsonObject.toString());
        }
    }

    public WsArgV5(HashMap<String, String> map) {
        this.uniqueKey = "";
        if (map != null) {
            String str = map.get(AppsFlyerProperties.CHANNEL);
            setChannel(str != null ? str : "");
            this.instId = map.get("instId");
            this.instFamily = map.get("instFamily");
            this.instType = map.get("instType");
            this.ccy = map.get("ccy");
            this.algoId = map.get("algoId");
            this.grouping = map.get("grouping");
            setExtraParams(map.get("extraParams"));
        }
    }

    @Override // o.InterfaceC57559ykh
    public String getUniqueKey() {
        if (this.uniqueKey.length() == 0) {
            this.uniqueKey = C57576yky.AEQbTJ.copydefault(getChannel(), this.instId, this.instFamily, this.instType, this.ccy, this.algoId, this.grouping);
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
        return c57576yky.copydefault(str != null ? str : "", map.get("instId"), map.get("instFamily"), map.get("instType"), map.get("ccy"), map.get("algoId"), map.get("grouping"));
    }
}
