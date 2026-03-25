package com.reown.sign.common.model.vo.clientsync.session.payload;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = false)
public final class SessionRequestVO {
    public final Long expiryTimestamp;
    public final String method;
    public final String params;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SessionRequestVO copy$default(SessionRequestVO sessionRequestVO, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionRequestVO.method;
        }
        if ((i & 2) != 0) {
            str2 = sessionRequestVO.params;
        }
        if ((i & 4) != 0) {
            l = sessionRequestVO.expiryTimestamp;
        }
        return sessionRequestVO.copy(str, str2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.expiryTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionRequestVO copy(@Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull String str2, @Json(name = "expiryTimestamp") Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SessionRequestVO(str, str2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionRequestVO)) {
            return false;
        }
        SessionRequestVO sessionRequestVO = (SessionRequestVO) obj;
        return Intrinsics.EZpvd((Object) this.method, (Object) sessionRequestVO.method) && Intrinsics.EZpvd((Object) this.params, (Object) sessionRequestVO.params) && Intrinsics.EZpvd(this.expiryTimestamp, sessionRequestVO.expiryTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiryTimestamp() {
        return this.expiryTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.method.hashCode();
        int iHashCode2 = this.params.hashCode();
        Long l = this.expiryTimestamp;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SessionRequestVO(method=" + this.method + ", params=" + this.params + ", expiryTimestamp=" + this.expiryTimestamp + ")";
    }

    public SessionRequestVO(@Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull String str2, @Json(name = "expiryTimestamp") Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.method = str;
        this.params = str2;
        this.expiryTimestamp = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:9) call: com.reown.sign.common.model.vo.clientsync.session.payload.SessionRequestVO.<init>(java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ SessionRequestVO(String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : l);
    }
}
