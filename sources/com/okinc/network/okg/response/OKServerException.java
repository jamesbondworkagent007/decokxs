package com.okinc.network.okg.response;

import com.google.gson.JsonObject;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class OKServerException extends IOException {
    public static final int $stable = 8;
    private final int code;
    private Integer httpCode;
    private final Throwable origin;
    private String requestUrl;
    private final JsonObject response;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKServerException() {
        this(0, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHttpCode() {
        return this.httpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestUrl() {
        return this.requestUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getResponse() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHttpCode(Integer num) {
        this.httpCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonObject) : (r4v0 com.google.gson.JsonObject))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r5v0 java.lang.Throwable))
 A[MD:(int, java.lang.String, com.google.gson.JsonObject, java.lang.Throwable):void (m)] (LINE:21) call: com.okinc.network.okg.response.OKServerException.<init>(int, java.lang.String, com.google.gson.JsonObject, java.lang.Throwable):void type: THIS */
    public /* synthetic */ OKServerException(int i, String str, JsonObject jsonObject, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : jsonObject, (i2 & 8) != 0 ? null : th);
    }

    public OKServerException(int i, String str, JsonObject jsonObject, Throwable th) {
        super(str);
        this.code = i;
        this.response = jsonObject;
        this.origin = th;
    }
}
