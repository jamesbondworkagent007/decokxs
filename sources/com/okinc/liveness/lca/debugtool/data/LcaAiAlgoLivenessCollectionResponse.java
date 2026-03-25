package com.okinc.liveness.lca.debugtool.data;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaAiAlgoLivenessCollectionResponse implements LivenessResponse, Serializable {
    public static final int $stable = 0;
    private final Integer code;
    private final String message;
    private final Integer size;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LcaAiAlgoLivenessCollectionResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaAiAlgoLivenessCollectionResponse copy$default(LcaAiAlgoLivenessCollectionResponse lcaAiAlgoLivenessCollectionResponse, String str, Integer num, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaAiAlgoLivenessCollectionResponse.status;
        }
        if ((i & 2) != 0) {
            num = lcaAiAlgoLivenessCollectionResponse.code;
        }
        if ((i & 4) != 0) {
            str2 = lcaAiAlgoLivenessCollectionResponse.message;
        }
        if ((i & 8) != 0) {
            num2 = lcaAiAlgoLivenessCollectionResponse.size;
        }
        return lcaAiAlgoLivenessCollectionResponse.copy(str, num, str2, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaAiAlgoLivenessCollectionResponse copy(String str, Integer num, String str2, Integer num2) {
        return new LcaAiAlgoLivenessCollectionResponse(str, num, str2, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaAiAlgoLivenessCollectionResponse)) {
            return false;
        }
        LcaAiAlgoLivenessCollectionResponse lcaAiAlgoLivenessCollectionResponse = (LcaAiAlgoLivenessCollectionResponse) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) lcaAiAlgoLivenessCollectionResponse.status) && Intrinsics.EZpvd(this.code, lcaAiAlgoLivenessCollectionResponse.code) && Intrinsics.EZpvd((Object) this.message, (Object) lcaAiAlgoLivenessCollectionResponse.message) && Intrinsics.EZpvd(this.size, lcaAiAlgoLivenessCollectionResponse.size);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.status;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.code;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.message;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.size;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaAiAlgoLivenessCollectionResponse(status=" + this.status + ", code=" + this.code + ", message=" + this.message + ", size=" + this.size + ")";
    }

    public LcaAiAlgoLivenessCollectionResponse(String str, Integer num, String str2, Integer num2) {
        this.status = str;
        this.code = num;
        this.message = str2;
        this.size = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer):void (m)] (LINE:39) call: com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessCollectionResponse.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ LcaAiAlgoLivenessCollectionResponse(String str, Integer num, String str2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2);
    }
}
