package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordingPlayInfo {
    public static final int $stable = 0;

    @SerializedName("duration")
    private final String duration;

    @SerializedName("format")
    private final String format;

    @SerializedName("mainPlayUrl")
    private final String mainPlayUrl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecordingPlayInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecordingPlayInfo copy$default(RecordingPlayInfo recordingPlayInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordingPlayInfo.duration;
        }
        if ((i & 2) != 0) {
            str2 = recordingPlayInfo.mainPlayUrl;
        }
        if ((i & 4) != 0) {
            str3 = recordingPlayInfo.format;
        }
        return recordingPlayInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mainPlayUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingPlayInfo copy(String str, String str2, String str3) {
        return new RecordingPlayInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordingPlayInfo)) {
            return false;
        }
        RecordingPlayInfo recordingPlayInfo = (RecordingPlayInfo) obj;
        return Intrinsics.EZpvd((Object) this.duration, (Object) recordingPlayInfo.duration) && Intrinsics.EZpvd((Object) this.mainPlayUrl, (Object) recordingPlayInfo.mainPlayUrl) && Intrinsics.EZpvd((Object) this.format, (Object) recordingPlayInfo.format);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormat() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainPlayUrl() {
        return this.mainPlayUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.duration;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mainPlayUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.format;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecordingPlayInfo(duration=" + this.duration + ", mainPlayUrl=" + this.mainPlayUrl + ", format=" + this.format + ")";
    }

    public RecordingPlayInfo(String str, String str2, String str3) {
        this.duration = str;
        this.mainPlayUrl = str2;
        this.format = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:122) call: com.okinc.oklive.app.data.repository.remote.RecordingPlayInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecordingPlayInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
