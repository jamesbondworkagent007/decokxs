package com.okinc.liveness.lca.debugtool.data;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaAiAlgoLivenessPredictionResponse implements LivenessResponse, Serializable {
    public static final int $stable = 8;
    private final Integer code;
    private final LcaAiAlgoLivenessData data;
    private final String message;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LcaAiAlgoLivenessPredictionResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaAiAlgoLivenessPredictionResponse copy$default(LcaAiAlgoLivenessPredictionResponse lcaAiAlgoLivenessPredictionResponse, String str, Integer num, String str2, LcaAiAlgoLivenessData lcaAiAlgoLivenessData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaAiAlgoLivenessPredictionResponse.status;
        }
        if ((i & 2) != 0) {
            num = lcaAiAlgoLivenessPredictionResponse.code;
        }
        if ((i & 4) != 0) {
            str2 = lcaAiAlgoLivenessPredictionResponse.message;
        }
        if ((i & 8) != 0) {
            lcaAiAlgoLivenessData = lcaAiAlgoLivenessPredictionResponse.data;
        }
        return lcaAiAlgoLivenessPredictionResponse.copy(str, num, str2, lcaAiAlgoLivenessData);
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
    public final LcaAiAlgoLivenessData component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaAiAlgoLivenessPredictionResponse copy(String str, Integer num, String str2, LcaAiAlgoLivenessData lcaAiAlgoLivenessData) {
        return new LcaAiAlgoLivenessPredictionResponse(str, num, str2, lcaAiAlgoLivenessData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaAiAlgoLivenessPredictionResponse)) {
            return false;
        }
        LcaAiAlgoLivenessPredictionResponse lcaAiAlgoLivenessPredictionResponse = (LcaAiAlgoLivenessPredictionResponse) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) lcaAiAlgoLivenessPredictionResponse.status) && Intrinsics.EZpvd(this.code, lcaAiAlgoLivenessPredictionResponse.code) && Intrinsics.EZpvd((Object) this.message, (Object) lcaAiAlgoLivenessPredictionResponse.message) && Intrinsics.EZpvd(this.data, lcaAiAlgoLivenessPredictionResponse.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaAiAlgoLivenessData getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
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
        LcaAiAlgoLivenessData lcaAiAlgoLivenessData = this.data;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (lcaAiAlgoLivenessData != null ? lcaAiAlgoLivenessData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaAiAlgoLivenessPredictionResponse(status=" + this.status + ", code=" + this.code + ", message=" + this.message + ", data=" + this.data + ")";
    }

    public LcaAiAlgoLivenessPredictionResponse(String str, Integer num, String str2, LcaAiAlgoLivenessData lcaAiAlgoLivenessData) {
        this.status = str;
        this.code = num;
        this.message = str2;
        this.data = lcaAiAlgoLivenessData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessData:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessData) : (r5v0 com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessData))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessData):void (m)] (LINE:31) call: com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessPredictionResponse.<init>(java.lang.String, java.lang.Integer, java.lang.String, com.okinc.liveness.lca.debugtool.data.LcaAiAlgoLivenessData):void type: THIS */
    public /* synthetic */ LcaAiAlgoLivenessPredictionResponse(String str, Integer num, String str2, LcaAiAlgoLivenessData lcaAiAlgoLivenessData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : lcaAiAlgoLivenessData);
    }
}
