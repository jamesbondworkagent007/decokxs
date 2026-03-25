package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TeeReqAndResultData {
    public static final int $stable = 0;
    private final Long expireTimestamp;
    private final String payload;
    private final String signature;
    private final String teeId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeReqAndResultData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeReqAndResultData copy$default(TeeReqAndResultData teeReqAndResultData, String str, Long l, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teeReqAndResultData.teeId;
        }
        if ((i & 2) != 0) {
            l = teeReqAndResultData.expireTimestamp;
        }
        if ((i & 4) != 0) {
            str2 = teeReqAndResultData.payload;
        }
        if ((i & 8) != 0) {
            str3 = teeReqAndResultData.signature;
        }
        return teeReqAndResultData.copy(str, l, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeReqAndResultData copy(String str, Long l, String str2, String str3) {
        return new TeeReqAndResultData(str, l, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeReqAndResultData)) {
            return false;
        }
        TeeReqAndResultData teeReqAndResultData = (TeeReqAndResultData) obj;
        return Intrinsics.EZpvd((Object) this.teeId, (Object) teeReqAndResultData.teeId) && Intrinsics.EZpvd(this.expireTimestamp, teeReqAndResultData.expireTimestamp) && Intrinsics.EZpvd((Object) this.payload, (Object) teeReqAndResultData.payload) && Intrinsics.EZpvd((Object) this.signature, (Object) teeReqAndResultData.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.teeId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.expireTimestamp;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.payload;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.signature;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeReqAndResultData(teeId=" + this.teeId + ", expireTimestamp=" + this.expireTimestamp + ", payload=" + this.payload + ", signature=" + this.signature + ")";
    }

    public TeeReqAndResultData(String str, Long l, String str2, String str3) {
        this.teeId = str;
        this.expireTimestamp = l;
        this.payload = str2;
        this.signature = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:173) call: com.okinc.business.defi.wallet.tee.common.model.TeeReqAndResultData.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TeeReqAndResultData(String str, Long l, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
