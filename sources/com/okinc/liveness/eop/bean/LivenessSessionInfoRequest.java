package com.okinc.liveness.eop.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LivenessSessionInfoRequest {
    public static final int $stable = 0;
    private final String metaInfo;
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LivenessSessionInfoRequest copy$default(LivenessSessionInfoRequest livenessSessionInfoRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livenessSessionInfoRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = livenessSessionInfoRequest.metaInfo;
        }
        return livenessSessionInfoRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.metaInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessSessionInfoRequest copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LivenessSessionInfoRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivenessSessionInfoRequest)) {
            return false;
        }
        LivenessSessionInfoRequest livenessSessionInfoRequest = (LivenessSessionInfoRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) livenessSessionInfoRequest.sessionId) && Intrinsics.EZpvd((Object) this.metaInfo, (Object) livenessSessionInfoRequest.metaInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMetaInfo() {
        return this.metaInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sessionId.hashCode();
        String str = this.metaInfo;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessSessionInfoRequest(sessionId=" + this.sessionId + ", metaInfo=" + this.metaInfo + ")";
    }

    public LivenessSessionInfoRequest(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
        this.metaInfo = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.liveness.eop.bean.LivenessSessionInfoRequest.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LivenessSessionInfoRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
