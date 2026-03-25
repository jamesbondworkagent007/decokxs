package com.okinc.okapm.okqpl;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class QPLEvent {
    public static final int $stable = 8;
    private final Map<String, String> attributes;
    private final String qplMarker;
    private final String qplType;
    private final String source;
    private final long timestamp;
    private final String traceId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okapm.okqpl.QPLEvent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QPLEvent copy$default(QPLEvent qPLEvent, String str, String str2, String str3, String str4, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qPLEvent.traceId;
        }
        if ((i & 2) != 0) {
            str2 = qPLEvent.qplType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = qPLEvent.qplMarker;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = qPLEvent.source;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            j = qPLEvent.timestamp;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            map = qPLEvent.attributes;
        }
        return qPLEvent.copy(str, str5, str6, str7, j2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.traceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.qplType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.qplMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component6() {
        return this.attributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QPLEvent copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new QPLEvent(str, str2, str3, str4, j, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QPLEvent)) {
            return false;
        }
        QPLEvent qPLEvent = (QPLEvent) obj;
        return Intrinsics.EZpvd((Object) this.traceId, (Object) qPLEvent.traceId) && Intrinsics.EZpvd((Object) this.qplType, (Object) qPLEvent.qplType) && Intrinsics.EZpvd((Object) this.qplMarker, (Object) qPLEvent.qplMarker) && Intrinsics.EZpvd((Object) this.source, (Object) qPLEvent.source) && this.timestamp == qPLEvent.timestamp && Intrinsics.EZpvd(this.attributes, qPLEvent.attributes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQplMarker() {
        return this.qplMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQplType() {
        return this.qplType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTraceId() {
        return this.traceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.traceId.hashCode();
        int iHashCode2 = this.qplType.hashCode();
        int iHashCode3 = this.qplMarker.hashCode();
        int iHashCode4 = this.source.hashCode();
        int iHashCode5 = Long.hashCode(this.timestamp);
        Map<String, String> map = this.attributes;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map == null ? 0 : map.hashCode());
    }

    public QPLEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.traceId = str;
        this.qplType = str2;
        this.qplMarker = str3;
        this.source = str4;
        this.timestamp = j;
        this.attributes = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:11)) : (r15v0 long))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r17v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:6) call: com.okinc.okapm.okqpl.QPLEvent.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.Map):void type: THIS */
    public /* synthetic */ QPLEvent(String str, String str2, String str3, String str4, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? System.currentTimeMillis() : j, (i & 32) != 0 ? null : map);
    }

    public String toString() {
        return "traceId='" + this.traceId + "', qplMarker='" + this.qplMarker + "', source='" + this.source + "', timestamp=" + this.timestamp + " \n";
    }
}
