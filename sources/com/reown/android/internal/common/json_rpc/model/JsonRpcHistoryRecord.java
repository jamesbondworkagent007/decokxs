package com.reown.android.internal.common.json_rpc.model;

import com.reown.android.internal.common.model.TransportType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class JsonRpcHistoryRecord {
    public final String body;
    public final long id;
    public final String method;
    public final String response;
    public final String topic;
    public final TransportType transportType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransportType component6() {
        return this.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonRpcHistoryRecord copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new JsonRpcHistoryRecord(j, str, str2, str3, str4, transportType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcHistoryRecord)) {
            return false;
        }
        JsonRpcHistoryRecord jsonRpcHistoryRecord = (JsonRpcHistoryRecord) obj;
        return this.id == jsonRpcHistoryRecord.id && Intrinsics.EZpvd((Object) this.topic, (Object) jsonRpcHistoryRecord.topic) && Intrinsics.EZpvd((Object) this.method, (Object) jsonRpcHistoryRecord.method) && Intrinsics.EZpvd((Object) this.body, (Object) jsonRpcHistoryRecord.body) && Intrinsics.EZpvd((Object) this.response, (Object) jsonRpcHistoryRecord.response) && this.transportType == jsonRpcHistoryRecord.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResponse() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransportType getTransportType() {
        return this.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.topic.hashCode();
        int iHashCode3 = this.method.hashCode();
        int iHashCode4 = this.body.hashCode();
        String str = this.response;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        TransportType transportType = this.transportType;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (transportType != null ? transportType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JsonRpcHistoryRecord(id=" + this.id + ", topic=" + this.topic + ", method=" + this.method + ", body=" + this.body + ", response=" + this.response + ", transportType=" + this.transportType + ")";
    }

    public JsonRpcHistoryRecord(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = j;
        this.topic = str;
        this.method = str2;
        this.body = str3;
        this.response = str4;
        this.transportType = transportType;
    }
}
