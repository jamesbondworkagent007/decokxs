package com.okinc.unify_trade.manager;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class PlaceOrderResult {
    public static final int $stable = 0;
    private final String code;
    private final String id;
    private final String instId;
    private final String instType;
    private final String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlaceOrderResult() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlaceOrderResult copy$default(PlaceOrderResult placeOrderResult, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placeOrderResult.id;
        }
        if ((i & 2) != 0) {
            str2 = placeOrderResult.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = placeOrderResult.msg;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = placeOrderResult.instType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = placeOrderResult.instId;
        }
        return placeOrderResult.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderResult copy(String str, String str2, String str3, @NotNull String str4, String str5) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new PlaceOrderResult(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceOrderResult)) {
            return false;
        }
        PlaceOrderResult placeOrderResult = (PlaceOrderResult) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) placeOrderResult.id) && Intrinsics.EZpvd((Object) this.code, (Object) placeOrderResult.code) && Intrinsics.EZpvd((Object) this.msg, (Object) placeOrderResult.msg) && Intrinsics.EZpvd((Object) this.instType, (Object) placeOrderResult.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) placeOrderResult.instId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.code;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.msg;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.instType.hashCode();
        String str4 = this.instId;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlaceOrderResult(id=" + this.id + ", code=" + this.code + ", msg=" + this.msg + ", instType=" + this.instType + ", instId=" + this.instId + ")";
    }

    public PlaceOrderResult(String str, String str2, String str3, @NotNull String str4, String str5) {
        Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.code = str2;
        this.msg = str3;
        this.instType = str4;
        this.instId = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:720) call: com.okinc.unify_trade.manager.PlaceOrderResult.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PlaceOrderResult(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5);
    }
}
