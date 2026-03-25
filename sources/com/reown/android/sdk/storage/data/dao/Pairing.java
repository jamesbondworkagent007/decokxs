package com.reown.android.sdk.storage.data.dao;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class Pairing {
    public final long expiry;
    public final long id;
    public final boolean is_active;
    public final Boolean is_proposal_received;
    public final String methods;
    public final String relay_data;
    public final String relay_protocol;
    public final String topic;
    public final String uri;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
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
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.is_active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.is_proposal_received;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pairing copy(long j, @NotNull String str, long j2, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new Pairing(j, str, j2, str2, str3, str4, str5, z, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pairing)) {
            return false;
        }
        Pairing pairing = (Pairing) obj;
        return this.id == pairing.id && Intrinsics.EZpvd((Object) this.topic, (Object) pairing.topic) && this.expiry == pairing.expiry && Intrinsics.EZpvd((Object) this.relay_protocol, (Object) pairing.relay_protocol) && Intrinsics.EZpvd((Object) this.relay_data, (Object) pairing.relay_data) && Intrinsics.EZpvd((Object) this.uri, (Object) pairing.uri) && Intrinsics.EZpvd((Object) this.methods, (Object) pairing.methods) && this.is_active == pairing.is_active && Intrinsics.EZpvd(this.is_proposal_received, pairing.is_proposal_received);
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
    public final String getMethods() {
        return this.methods;
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
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUri() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.topic.hashCode();
        int iHashCode3 = Long.hashCode(this.expiry);
        int iHashCode4 = this.relay_protocol.hashCode();
        String str = this.relay_data;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.uri.hashCode();
        int iHashCode7 = this.methods.hashCode();
        int iHashCode8 = Boolean.hashCode(this.is_active);
        Boolean bool = this.is_proposal_received;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean is_active() {
        return this.is_active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean is_proposal_received() {
        return this.is_proposal_received;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Pairing(id=" + this.id + ", topic=" + this.topic + ", expiry=" + this.expiry + ", relay_protocol=" + this.relay_protocol + ", relay_data=" + this.relay_data + ", uri=" + this.uri + ", methods=" + this.methods + ", is_active=" + this.is_active + ", is_proposal_received=" + this.is_proposal_received + ")";
    }

    public Pairing(long j, @NotNull String str, long j2, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = j;
        this.topic = str;
        this.expiry = j2;
        this.relay_protocol = str2;
        this.relay_data = str3;
        this.uri = str4;
        this.methods = str5;
        this.is_active = z;
        this.is_proposal_received = bool;
    }
}
