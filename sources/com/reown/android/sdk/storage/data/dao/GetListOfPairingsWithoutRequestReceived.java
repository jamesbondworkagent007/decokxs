package com.reown.android.sdk.storage.data.dao;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class GetListOfPairingsWithoutRequestReceived {
    public final String description;
    public final long expiry;
    public final List<String> icons;
    public final Boolean is_proposal_received;
    public final String methods;
    public final String name;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String f95native;
    public final String relay_data;
    public final String relay_protocol;
    public final String topic;
    public final String uri;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component11() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.f95native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.relay_protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.relay_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.is_proposal_received;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetListOfPairingsWithoutRequestReceived copy(@NotNull String str, long j, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, Boolean bool, String str6, String str7, String str8, List<String> list, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new GetListOfPairingsWithoutRequestReceived(str, j, str2, str3, str4, str5, bool, str6, str7, str8, list, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetListOfPairingsWithoutRequestReceived)) {
            return false;
        }
        GetListOfPairingsWithoutRequestReceived getListOfPairingsWithoutRequestReceived = (GetListOfPairingsWithoutRequestReceived) obj;
        return Intrinsics.EZpvd((Object) this.topic, (Object) getListOfPairingsWithoutRequestReceived.topic) && this.expiry == getListOfPairingsWithoutRequestReceived.expiry && Intrinsics.EZpvd((Object) this.relay_protocol, (Object) getListOfPairingsWithoutRequestReceived.relay_protocol) && Intrinsics.EZpvd((Object) this.relay_data, (Object) getListOfPairingsWithoutRequestReceived.relay_data) && Intrinsics.EZpvd((Object) this.uri, (Object) getListOfPairingsWithoutRequestReceived.uri) && Intrinsics.EZpvd((Object) this.methods, (Object) getListOfPairingsWithoutRequestReceived.methods) && Intrinsics.EZpvd(this.is_proposal_received, getListOfPairingsWithoutRequestReceived.is_proposal_received) && Intrinsics.EZpvd((Object) this.name, (Object) getListOfPairingsWithoutRequestReceived.name) && Intrinsics.EZpvd((Object) this.description, (Object) getListOfPairingsWithoutRequestReceived.description) && Intrinsics.EZpvd((Object) this.url, (Object) getListOfPairingsWithoutRequestReceived.url) && Intrinsics.EZpvd(this.icons, getListOfPairingsWithoutRequestReceived.icons) && Intrinsics.EZpvd((Object) this.f95native, (Object) getListOfPairingsWithoutRequestReceived.f95native);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIcons() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethods() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNative() {
        return this.f95native;
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
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.topic.hashCode();
        int iHashCode2 = Long.hashCode(this.expiry);
        int iHashCode3 = this.relay_protocol.hashCode();
        String str = this.relay_data;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.uri.hashCode();
        int iHashCode6 = this.methods.hashCode();
        Boolean bool = this.is_proposal_received;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        String str2 = this.name;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.description;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.url;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        List<String> list = this.icons;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        String str5 = this.f95native;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean is_proposal_received() {
        return this.is_proposal_received;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetListOfPairingsWithoutRequestReceived(topic=" + this.topic + ", expiry=" + this.expiry + ", relay_protocol=" + this.relay_protocol + ", relay_data=" + this.relay_data + ", uri=" + this.uri + ", methods=" + this.methods + ", is_proposal_received=" + this.is_proposal_received + ", name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", native=" + this.f95native + ")";
    }

    public GetListOfPairingsWithoutRequestReceived(@NotNull String str, long j, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, Boolean bool, String str6, String str7, String str8, List<String> list, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.topic = str;
        this.expiry = j;
        this.relay_protocol = str2;
        this.relay_data = str3;
        this.uri = str4;
        this.methods = str5;
        this.is_proposal_received = bool;
        this.name = str6;
        this.description = str7;
        this.url = str8;
        this.icons = list;
        this.f95native = str9;
    }
}
