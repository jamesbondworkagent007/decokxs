package com.okinc.kline.data;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineDrawingDataReq {
    public static final int $stable = 8;
    private String instId;
    private JsonObject lines;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineDrawingDataReq() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KlineDrawingDataReq copy$default(KlineDrawingDataReq klineDrawingDataReq, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = klineDrawingDataReq.instId;
        }
        if ((i & 2) != 0) {
            jsonObject = klineDrawingDataReq.lines;
        }
        return klineDrawingDataReq.copy(str, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component2() {
        return this.lines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineDrawingDataReq copy(@NotNull String str, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new KlineDrawingDataReq(str, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KlineDrawingDataReq)) {
            return false;
        }
        KlineDrawingDataReq klineDrawingDataReq = (KlineDrawingDataReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) klineDrawingDataReq.instId) && Intrinsics.EZpvd(this.lines, klineDrawingDataReq.lines);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getLines() {
        return this.lines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.instId.hashCode() * 31) + this.lines.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLines(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.lines = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineDrawingDataReq(instId=" + this.instId + ", lines=" + this.lines + ")";
    }

    public KlineDrawingDataReq(@NotNull String str, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.instId = str;
        this.lines = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.google.gson.JsonObject:0x000c: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:15) call: com.google.gson.JsonObject.<init>():void type: CONSTRUCTOR) : (r2v0 com.google.gson.JsonObject))
 A[MD:(java.lang.String, com.google.gson.JsonObject):void (m)] (LINE:15) call: com.okinc.kline.data.KlineDrawingDataReq.<init>(java.lang.String, com.google.gson.JsonObject):void type: THIS */
    public /* synthetic */ KlineDrawingDataReq(String str, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new JsonObject() : jsonObject);
    }
}
