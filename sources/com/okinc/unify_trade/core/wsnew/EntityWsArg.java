package com.okinc.unify_trade.core.wsnew;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57576yky;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class EntityWsArg extends WsArgV5 {
    public static final int $stable = 8;
    private String entityId;

    @Expose(serialize = false)
    private String entityUniqueKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntityId() {
        return this.entityId;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonObject) : (r18v0 com.google.gson.JsonObject))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject, java.lang.String):void (m)] (LINE:19) call: com.okinc.unify_trade.core.wsnew.EntityWsArg.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject, java.lang.String):void type: THIS */
    public /* synthetic */ EntityWsArg(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : jsonObject, (i & 256) == 0 ? str8 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityWsArg(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8) {
        super(str, str2, str3, str4, str5, str6, str7, jsonObject);
        Intrinsics.checkNotNullParameter(str, "");
        this.entityUniqueKey = "";
        this.entityId = str8;
    }

    public EntityWsArg(HashMap<String, String> map) {
        super(map);
        this.entityUniqueKey = "";
        if (map != null) {
            String str = map.get("entityId");
            this.entityId = str != null ? str : "";
        }
    }

    @Override // com.okinc.websocket.v5config.WsArgV5, o.InterfaceC57559ykh
    public String getUniqueKey() {
        if (this.entityUniqueKey.length() == 0) {
            this.entityUniqueKey = C57576yky.AEQbTJ.copydefault(getChannel(), getInstId(), getInstFamily(), getInstType(), getCcy(), getAlgoId(), getGrouping(), this.entityId);
        }
        return this.entityUniqueKey;
    }

    @Override // com.okinc.websocket.v5config.WsArgV5, o.InterfaceC57559ykh
    public String getUniqueKeyByResponse(HashMap<String, String> map) {
        if (map == null) {
            return "";
        }
        C57576yky c57576yky = C57576yky.AEQbTJ;
        String str = map.get(AppsFlyerProperties.CHANNEL);
        return c57576yky.copydefault(str != null ? str : "", map.get("instId"), map.get("instFamily"), map.get("instType"), map.get("ccy"), map.get("algoId"), map.get("grouping"), map.get("entityId"));
    }
}
