package com.okinc.liveness.lca.debugtool.data;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugInfo {
    public static final int $stable = 8;
    private String qcScoreResultJson;
    private String requestRawJson;
    private String responseRawJson;
    private File videoTempFile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LcaDebugInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaDebugInfo copy$default(LcaDebugInfo lcaDebugInfo, String str, String str2, File file, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaDebugInfo.requestRawJson;
        }
        if ((i & 2) != 0) {
            str2 = lcaDebugInfo.responseRawJson;
        }
        if ((i & 4) != 0) {
            file = lcaDebugInfo.videoTempFile;
        }
        if ((i & 8) != 0) {
            str3 = lcaDebugInfo.qcScoreResultJson;
        }
        return lcaDebugInfo.copy(str, str2, file, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestRawJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.responseRawJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final File component3() {
        return this.videoTempFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.qcScoreResultJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaDebugInfo copy(String str, String str2, File file, String str3) {
        return new LcaDebugInfo(str, str2, file, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaDebugInfo)) {
            return false;
        }
        LcaDebugInfo lcaDebugInfo = (LcaDebugInfo) obj;
        return Intrinsics.EZpvd((Object) this.requestRawJson, (Object) lcaDebugInfo.requestRawJson) && Intrinsics.EZpvd((Object) this.responseRawJson, (Object) lcaDebugInfo.responseRawJson) && Intrinsics.EZpvd(this.videoTempFile, lcaDebugInfo.videoTempFile) && Intrinsics.EZpvd((Object) this.qcScoreResultJson, (Object) lcaDebugInfo.qcScoreResultJson);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQcScoreResultJson() {
        return this.qcScoreResultJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestRawJson() {
        return this.requestRawJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResponseRawJson() {
        return this.responseRawJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final File getVideoTempFile() {
        return this.videoTempFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.requestRawJson;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.responseRawJson;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        File file = this.videoTempFile;
        int iHashCode3 = file == null ? 0 : file.hashCode();
        String str3 = this.qcScoreResultJson;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQcScoreResultJson(String str) {
        this.qcScoreResultJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestRawJson(String str) {
        this.requestRawJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResponseRawJson(String str) {
        this.responseRawJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoTempFile(File file) {
        this.videoTempFile = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaDebugInfo(requestRawJson=" + this.requestRawJson + ", responseRawJson=" + this.responseRawJson + ", videoTempFile=" + this.videoTempFile + ", qcScoreResultJson=" + this.qcScoreResultJson + ")";
    }

    public LcaDebugInfo(String str, String str2, File file, String str3) {
        this.requestRawJson = str;
        this.responseRawJson = str2;
        this.videoTempFile = file;
        this.qcScoreResultJson = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.io.File:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.io.File) : (r4v0 java.io.File))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.io.File, java.lang.String):void (m)] (LINE:7) call: com.okinc.liveness.lca.debugtool.data.LcaDebugInfo.<init>(java.lang.String, java.lang.String, java.io.File, java.lang.String):void type: THIS */
    public /* synthetic */ LcaDebugInfo(String str, String str2, File file, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : file, (i & 8) != 0 ? null : str3);
    }
}
