package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class WalletJwtException extends Exception {
    public static final int $stable = 8;
    private final JsonObject originResponseBody;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletJwtException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getOriginResponseBody() {
        return this.originResponseBody;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r1v0 kotlinx.serialization.json.JsonObject))
 A[MD:(kotlinx.serialization.json.JsonObject):void (m)] (LINE:17) call: com.okinc.business.defi.api.bean.WalletJwtException.<init>(kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ WalletJwtException(JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jsonObject);
    }

    public WalletJwtException(JsonObject jsonObject) {
        this.originResponseBody = jsonObject;
    }
}
