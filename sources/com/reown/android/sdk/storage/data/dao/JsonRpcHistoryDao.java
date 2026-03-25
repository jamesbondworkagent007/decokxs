package com.reown.android.sdk.storage.data.dao;

import com.reown.android.internal.common.model.TransportType;
import kotlin.jvm.internal.Intrinsics;
import o.LoaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class JsonRpcHistoryDao {
    public final String body;
    public final long id;
    public final String method;
    public final long request_id;
    public final String response;
    public final String topic;
    public final TransportType transport_type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.request_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransportType component7() {
        return this.transport_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonRpcHistoryDao copy(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new JsonRpcHistoryDao(j, j2, str, str2, str3, str4, transportType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcHistoryDao)) {
            return false;
        }
        JsonRpcHistoryDao jsonRpcHistoryDao = (JsonRpcHistoryDao) obj;
        return this.id == jsonRpcHistoryDao.id && this.request_id == jsonRpcHistoryDao.request_id && Intrinsics.EZpvd((Object) this.topic, (Object) jsonRpcHistoryDao.topic) && Intrinsics.EZpvd((Object) this.method, (Object) jsonRpcHistoryDao.method) && Intrinsics.EZpvd((Object) this.body, (Object) jsonRpcHistoryDao.body) && Intrinsics.EZpvd((Object) this.response, (Object) jsonRpcHistoryDao.response) && this.transport_type == jsonRpcHistoryDao.transport_type;
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
    public final long getRequest_id() {
        return this.request_id;
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
    public final TransportType getTransport_type() {
        return this.transport_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = Long.hashCode(this.request_id);
        int iHashCode3 = this.topic.hashCode();
        int iHashCode4 = this.method.hashCode();
        int iHashCode5 = this.body.hashCode();
        String str = this.response;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        TransportType transportType = this.transport_type;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (transportType != null ? transportType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JsonRpcHistoryDao(id=" + this.id + ", request_id=" + this.request_id + ", topic=" + this.topic + ", method=" + this.method + ", body=" + this.body + ", response=" + this.response + ", transport_type=" + this.transport_type + ")";
    }

    public JsonRpcHistoryDao(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = j;
        this.request_id = j2;
        this.topic = str;
        this.method = str2;
        this.body = str3;
        this.response = str4;
        this.transport_type = transportType;
    }

    public static final class Adapter {
        public final LoaderManager<TransportType, String> transport_typeAdapter;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<TransportType, String> getTransport_typeAdapter() {
            return this.transport_typeAdapter;
        }

        public Adapter(@NotNull LoaderManager<TransportType, String> loaderManager) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            this.transport_typeAdapter = loaderManager;
        }
    }
}
