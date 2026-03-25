package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RecordingCefiToken {
    public static final int $stable = 0;

    @SerializedName("instId")
    private final String instId;

    @SerializedName("instType")
    private final String instType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecordingCefiToken copy$default(RecordingCefiToken recordingCefiToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordingCefiToken.instId;
        }
        if ((i & 2) != 0) {
            str2 = recordingCefiToken.instType;
        }
        return recordingCefiToken.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingCefiToken copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new RecordingCefiToken(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordingCefiToken)) {
            return false;
        }
        RecordingCefiToken recordingCefiToken = (RecordingCefiToken) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) recordingCefiToken.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) recordingCefiToken.instType);
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
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        String str = this.instType;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecordingCefiToken(instId=" + this.instId + ", instType=" + this.instType + ")";
    }

    public RecordingCefiToken(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
        this.instType = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:113) call: com.okinc.oklive.app.data.repository.remote.RecordingCefiToken.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecordingCefiToken(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
