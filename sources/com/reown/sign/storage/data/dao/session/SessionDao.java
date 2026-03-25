package com.reown.sign.storage.data.dao.session;

import com.reown.android.internal.common.model.TransportType;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.LoaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionDao {
    public final String controller_key;
    public final long expiry;
    public final long id;
    public final boolean is_acknowledged;
    public final String pairingTopic;
    public final String peer_participant;
    public final Map<String, String> properties;
    public final String relay_data;
    public final String relay_protocol;
    public final String self_participant;
    public final String topic;
    public final TransportType transport_type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.is_acknowledged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component11() {
        return this.properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransportType component12() {
        return this.transport_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.relay_protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.relay_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.controller_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.self_participant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.peer_participant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionDao copy(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull String str3, String str4, String str5, @NotNull String str6, String str7, boolean z, Map<String, String> map, TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new SessionDao(j, str, str2, j2, str3, str4, str5, str6, str7, z, map, transportType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDao)) {
            return false;
        }
        SessionDao sessionDao = (SessionDao) obj;
        return this.id == sessionDao.id && Intrinsics.EZpvd((Object) this.topic, (Object) sessionDao.topic) && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) sessionDao.pairingTopic) && this.expiry == sessionDao.expiry && Intrinsics.EZpvd((Object) this.relay_protocol, (Object) sessionDao.relay_protocol) && Intrinsics.EZpvd((Object) this.relay_data, (Object) sessionDao.relay_data) && Intrinsics.EZpvd((Object) this.controller_key, (Object) sessionDao.controller_key) && Intrinsics.EZpvd((Object) this.self_participant, (Object) sessionDao.self_participant) && Intrinsics.EZpvd((Object) this.peer_participant, (Object) sessionDao.peer_participant) && this.is_acknowledged == sessionDao.is_acknowledged && Intrinsics.EZpvd(this.properties, sessionDao.properties) && this.transport_type == sessionDao.transport_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getController_key() {
        return this.controller_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPairingTopic() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeer_participant() {
        return this.peer_participant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getProperties() {
        return this.properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelay_data() {
        return this.relay_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelay_protocol() {
        return this.relay_protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelf_participant() {
        return this.self_participant;
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
        int iHashCode2 = this.topic.hashCode();
        int iHashCode3 = this.pairingTopic.hashCode();
        int iHashCode4 = Long.hashCode(this.expiry);
        int iHashCode5 = this.relay_protocol.hashCode();
        String str = this.relay_data;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.controller_key;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.self_participant.hashCode();
        String str3 = this.peer_participant;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        int iHashCode10 = Boolean.hashCode(this.is_acknowledged);
        Map<String, String> map = this.properties;
        int iHashCode11 = map == null ? 0 : map.hashCode();
        TransportType transportType = this.transport_type;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (transportType != null ? transportType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean is_acknowledged() {
        return this.is_acknowledged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SessionDao(id=" + this.id + ", topic=" + this.topic + ", pairingTopic=" + this.pairingTopic + ", expiry=" + this.expiry + ", relay_protocol=" + this.relay_protocol + ", relay_data=" + this.relay_data + ", controller_key=" + this.controller_key + ", self_participant=" + this.self_participant + ", peer_participant=" + this.peer_participant + ", is_acknowledged=" + this.is_acknowledged + ", properties=" + this.properties + ", transport_type=" + this.transport_type + ")";
    }

    public SessionDao(long j, @NotNull String str, @NotNull String str2, long j2, @NotNull String str3, String str4, String str5, @NotNull String str6, String str7, boolean z, Map<String, String> map, TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = j;
        this.topic = str;
        this.pairingTopic = str2;
        this.expiry = j2;
        this.relay_protocol = str3;
        this.relay_data = str4;
        this.controller_key = str5;
        this.self_participant = str6;
        this.peer_participant = str7;
        this.is_acknowledged = z;
        this.properties = map;
        this.transport_type = transportType;
    }

    public static final class Adapter {
        public final LoaderManager<Map<String, String>, String> propertiesAdapter;
        public final LoaderManager<TransportType, String> transport_typeAdapter;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<Map<String, String>, String> getPropertiesAdapter() {
            return this.propertiesAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<TransportType, String> getTransport_typeAdapter() {
            return this.transport_typeAdapter;
        }

        public Adapter(@NotNull LoaderManager<Map<String, String>, String> loaderManager, @NotNull LoaderManager<TransportType, String> loaderManager2) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            Intrinsics.checkNotNullParameter(loaderManager2, "");
            this.propertiesAdapter = loaderManager;
            this.transport_typeAdapter = loaderManager2;
        }
    }
}
