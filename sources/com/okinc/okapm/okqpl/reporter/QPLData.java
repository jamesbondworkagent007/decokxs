package com.okinc.okapm.okqpl.reporter;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class QPLData {
    public static final int $stable = 8;

    @SerializedName(MTAnalysisConstants.EVENT_ATTRIBUTES)
    private final Map<String, String> attributes;

    @SerializedName("act")
    private final String qplMarker;

    @SerializedName("event")
    private final String qplType;

    @SerializedName("source")
    private final String source;

    @SerializedName("timestamp")
    private final long timestamp;

    @SerializedName("trace_id")
    private final String traceId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okapm.okqpl.reporter.QPLData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QPLData copy$default(QPLData qPLData, String str, String str2, String str3, String str4, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qPLData.traceId;
        }
        if ((i & 2) != 0) {
            str2 = qPLData.qplType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = qPLData.qplMarker;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = qPLData.source;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            j = qPLData.timestamp;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            map = qPLData.attributes;
        }
        return qPLData.copy(str, str5, str6, str7, j2, map);
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
    public final QPLData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new QPLData(str, str2, str3, str4, j, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QPLData)) {
            return false;
        }
        QPLData qPLData = (QPLData) obj;
        return Intrinsics.EZpvd((Object) this.traceId, (Object) qPLData.traceId) && Intrinsics.EZpvd((Object) this.qplType, (Object) qPLData.qplType) && Intrinsics.EZpvd((Object) this.qplMarker, (Object) qPLData.qplMarker) && Intrinsics.EZpvd((Object) this.source, (Object) qPLData.source) && this.timestamp == qPLData.timestamp && Intrinsics.EZpvd(this.attributes, qPLData.attributes);
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
        return (((((((((this.traceId.hashCode() * 31) + this.qplType.hashCode()) * 31) + this.qplMarker.hashCode()) * 31) + this.source.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.attributes.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QPLData(traceId=" + this.traceId + ", qplType=" + this.qplType + ", qplMarker=" + this.qplMarker + ", source=" + this.source + ", timestamp=" + this.timestamp + ", attributes=" + this.attributes + ")";
    }

    public QPLData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.traceId = str;
        this.qplType = str2;
        this.qplMarker = str3;
        this.source = str4;
        this.timestamp = j;
        this.attributes = map;
    }
}
