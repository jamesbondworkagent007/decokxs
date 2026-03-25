package com.reown.sign.storage.data.dao.session;

import com.reown.android.internal.common.model.TransportType;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class GetSessionByTopic {
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
    public final String component10() {
        return this.pairingTopic;
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
    public final long component3() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.relay_protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.relay_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.controller_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.self_participant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.peer_participant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.is_acknowledged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSessionByTopic copy(long j, @NotNull String str, long j2, @NotNull String str2, String str3, String str4, @NotNull String str5, String str6, boolean z, @NotNull String str7, Map<String, String> map, TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new GetSessionByTopic(j, str, j2, str2, str3, str4, str5, str6, z, str7, map, transportType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSessionByTopic)) {
            return false;
        }
        GetSessionByTopic getSessionByTopic = (GetSessionByTopic) obj;
        return this.id == getSessionByTopic.id && Intrinsics.EZpvd((Object) this.topic, (Object) getSessionByTopic.topic) && this.expiry == getSessionByTopic.expiry && Intrinsics.EZpvd((Object) this.relay_protocol, (Object) getSessionByTopic.relay_protocol) && Intrinsics.EZpvd((Object) this.relay_data, (Object) getSessionByTopic.relay_data) && Intrinsics.EZpvd((Object) this.controller_key, (Object) getSessionByTopic.controller_key) && Intrinsics.EZpvd((Object) this.self_participant, (Object) getSessionByTopic.self_participant) && Intrinsics.EZpvd((Object) this.peer_participant, (Object) getSessionByTopic.peer_participant) && this.is_acknowledged == getSessionByTopic.is_acknowledged && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) getSessionByTopic.pairingTopic) && Intrinsics.EZpvd(this.properties, getSessionByTopic.properties) && this.transport_type == getSessionByTopic.transport_type;
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
        int iHashCode3 = Long.hashCode(this.expiry);
        int iHashCode4 = this.relay_protocol.hashCode();
        String str = this.relay_data;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.controller_key;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        int iHashCode7 = this.self_participant.hashCode();
        String str3 = this.peer_participant;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        int iHashCode9 = Boolean.hashCode(this.is_acknowledged);
        int iHashCode10 = this.pairingTopic.hashCode();
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
        return "GetSessionByTopic(id=" + this.id + ", topic=" + this.topic + ", expiry=" + this.expiry + ", relay_protocol=" + this.relay_protocol + ", relay_data=" + this.relay_data + ", controller_key=" + this.controller_key + ", self_participant=" + this.self_participant + ", peer_participant=" + this.peer_participant + ", is_acknowledged=" + this.is_acknowledged + ", pairingTopic=" + this.pairingTopic + ", properties=" + this.properties + ", transport_type=" + this.transport_type + ")";
    }

    public GetSessionByTopic(long j, @NotNull String str, long j2, @NotNull String str2, String str3, String str4, @NotNull String str5, String str6, boolean z, @NotNull String str7, Map<String, String> map, TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.id = j;
        this.topic = str;
        this.expiry = j2;
        this.relay_protocol = str2;
        this.relay_data = str3;
        this.controller_key = str4;
        this.self_participant = str5;
        this.peer_participant = str6;
        this.is_acknowledged = z;
        this.pairingTopic = str7;
        this.properties = map;
        this.transport_type = transportType;
    }
}
