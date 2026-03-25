package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class RecordingTokenTag {
    public static final int $stable = 0;

    @SerializedName("cedefiToken")
    private final RecordingCedefiToken cedefiToken;

    @SerializedName("cefiToken")
    private final RecordingCefiToken cefiToken;

    @SerializedName("tokenType")
    private final Integer tokenType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecordingTokenTag() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecordingTokenTag copy$default(RecordingTokenTag recordingTokenTag, Integer num, RecordingCedefiToken recordingCedefiToken, RecordingCefiToken recordingCefiToken, int i, Object obj) {
        if ((i & 1) != 0) {
            num = recordingTokenTag.tokenType;
        }
        if ((i & 2) != 0) {
            recordingCedefiToken = recordingTokenTag.cedefiToken;
        }
        if ((i & 4) != 0) {
            recordingCefiToken = recordingTokenTag.cefiToken;
        }
        return recordingTokenTag.copy(num, recordingCedefiToken, recordingCefiToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingCedefiToken component2() {
        return this.cedefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingCefiToken component3() {
        return this.cefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingTokenTag copy(Integer num, RecordingCedefiToken recordingCedefiToken, RecordingCefiToken recordingCefiToken) {
        return new RecordingTokenTag(num, recordingCedefiToken, recordingCefiToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordingTokenTag)) {
            return false;
        }
        RecordingTokenTag recordingTokenTag = (RecordingTokenTag) obj;
        return Intrinsics.EZpvd(this.tokenType, recordingTokenTag.tokenType) && Intrinsics.EZpvd(this.cedefiToken, recordingTokenTag.cedefiToken) && Intrinsics.EZpvd(this.cefiToken, recordingTokenTag.cefiToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingCedefiToken getCedefiToken() {
        return this.cedefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingCefiToken getCefiToken() {
        return this.cefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.tokenType;
        int iHashCode = num == null ? 0 : num.hashCode();
        RecordingCedefiToken recordingCedefiToken = this.cedefiToken;
        int iHashCode2 = recordingCedefiToken == null ? 0 : recordingCedefiToken.hashCode();
        RecordingCefiToken recordingCefiToken = this.cefiToken;
        return (((iHashCode * 31) + iHashCode2) * 31) + (recordingCefiToken != null ? recordingCefiToken.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecordingTokenTag(tokenType=" + this.tokenType + ", cedefiToken=" + this.cedefiToken + ", cefiToken=" + this.cefiToken + ")";
    }

    public RecordingTokenTag(Integer num, RecordingCedefiToken recordingCedefiToken, RecordingCefiToken recordingCefiToken) {
        this.tokenType = num;
        this.cedefiToken = recordingCedefiToken;
        this.cefiToken = recordingCefiToken;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:com.okinc.oklive.app.data.repository.remote.RecordingCedefiToken:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.repository.remote.RecordingCedefiToken) : (r3v0 com.okinc.oklive.app.data.repository.remote.RecordingCedefiToken))
  (wrap:com.okinc.oklive.app.data.repository.remote.RecordingCefiToken:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.repository.remote.RecordingCefiToken) : (r4v0 com.okinc.oklive.app.data.repository.remote.RecordingCefiToken))
 A[MD:(java.lang.Integer, com.okinc.oklive.app.data.repository.remote.RecordingCedefiToken, com.okinc.oklive.app.data.repository.remote.RecordingCefiToken):void (m)] (LINE:92) call: com.okinc.oklive.app.data.repository.remote.RecordingTokenTag.<init>(java.lang.Integer, com.okinc.oklive.app.data.repository.remote.RecordingCedefiToken, com.okinc.oklive.app.data.repository.remote.RecordingCefiToken):void type: THIS */
    public /* synthetic */ RecordingTokenTag(Integer num, RecordingCedefiToken recordingCedefiToken, RecordingCefiToken recordingCefiToken, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : recordingCedefiToken, (i & 4) != 0 ? null : recordingCefiToken);
    }
}
