package com.reown.android.sdk.storage.data.dao;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.LoaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class EventDao {
    public final String bundle_id;
    public final String client_id;
    public final Long correlation_id;
    public final String direction;
    public final long event_id;
    public final String event_name;
    public final long timestamp;
    public final String topic;
    public final List<String> trace;
    public final String type;
    public final String user_agent;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.event_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.user_agent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bundle_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.event_name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.trace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.correlation_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.client_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EventDao copy(long j, @NotNull String str, long j2, @NotNull String str2, @NotNull String str3, String str4, List<String> list, Long l, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EventDao(j, str, j2, str2, str3, str4, list, l, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventDao)) {
            return false;
        }
        EventDao eventDao = (EventDao) obj;
        return this.event_id == eventDao.event_id && Intrinsics.EZpvd((Object) this.bundle_id, (Object) eventDao.bundle_id) && this.timestamp == eventDao.timestamp && Intrinsics.EZpvd((Object) this.event_name, (Object) eventDao.event_name) && Intrinsics.EZpvd((Object) this.type, (Object) eventDao.type) && Intrinsics.EZpvd((Object) this.topic, (Object) eventDao.topic) && Intrinsics.EZpvd(this.trace, eventDao.trace) && Intrinsics.EZpvd(this.correlation_id, eventDao.correlation_id) && Intrinsics.EZpvd((Object) this.client_id, (Object) eventDao.client_id) && Intrinsics.EZpvd((Object) this.direction, (Object) eventDao.direction) && Intrinsics.EZpvd((Object) this.user_agent, (Object) eventDao.user_agent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundle_id() {
        return this.bundle_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClient_id() {
        return this.client_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCorrelation_id() {
        return this.correlation_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEvent_id() {
        return this.event_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEvent_name() {
        return this.event_name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTrace() {
        return this.trace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUser_agent() {
        return this.user_agent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.event_id);
        int iHashCode2 = this.bundle_id.hashCode();
        int iHashCode3 = Long.hashCode(this.timestamp);
        int iHashCode4 = this.event_name.hashCode();
        int iHashCode5 = this.type.hashCode();
        String str = this.topic;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        List<String> list = this.trace;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        Long l = this.correlation_id;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        String str2 = this.client_id;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.direction;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.user_agent;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EventDao(event_id=" + this.event_id + ", bundle_id=" + this.bundle_id + ", timestamp=" + this.timestamp + ", event_name=" + this.event_name + ", type=" + this.type + ", topic=" + this.topic + ", trace=" + this.trace + ", correlation_id=" + this.correlation_id + ", client_id=" + this.client_id + ", direction=" + this.direction + ", user_agent=" + this.user_agent + ")";
    }

    public EventDao(long j, @NotNull String str, long j2, @NotNull String str2, @NotNull String str3, String str4, List<String> list, Long l, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.event_id = j;
        this.bundle_id = str;
        this.timestamp = j2;
        this.event_name = str2;
        this.type = str3;
        this.topic = str4;
        this.trace = list;
        this.correlation_id = l;
        this.client_id = str5;
        this.direction = str6;
        this.user_agent = str7;
    }

    public static final class Adapter {
        public final LoaderManager<List<String>, String> traceAdapter;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<List<String>, String> getTraceAdapter() {
            return this.traceAdapter;
        }

        public Adapter(@NotNull LoaderManager<List<String>, String> loaderManager) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            this.traceAdapter = loaderManager;
        }
    }
}
