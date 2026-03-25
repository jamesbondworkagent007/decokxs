package com.reown.sign.storage.data.dao.proposal;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.LoaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProposalDao {
    public final String description;
    public final Long expiry;
    public final List<String> icons;
    public final String name;
    public final String pairingTopic;
    public final Map<String, String> properties;
    public final String proposer_key;
    public final String redirect;
    public final String relay_data;
    public final String relay_protocol;
    public final long request_id;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.request_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component10() {
        return this.properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component12() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.relay_protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.relay_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.proposer_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProposalDao copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull String str5, String str6, @NotNull String str7, Map<String, String> map, @NotNull String str8, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new ProposalDao(j, str, str2, str3, str4, list, str5, str6, str7, map, str8, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProposalDao)) {
            return false;
        }
        ProposalDao proposalDao = (ProposalDao) obj;
        return this.request_id == proposalDao.request_id && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) proposalDao.pairingTopic) && Intrinsics.EZpvd((Object) this.name, (Object) proposalDao.name) && Intrinsics.EZpvd((Object) this.description, (Object) proposalDao.description) && Intrinsics.EZpvd((Object) this.url, (Object) proposalDao.url) && Intrinsics.EZpvd(this.icons, proposalDao.icons) && Intrinsics.EZpvd((Object) this.relay_protocol, (Object) proposalDao.relay_protocol) && Intrinsics.EZpvd((Object) this.relay_data, (Object) proposalDao.relay_data) && Intrinsics.EZpvd((Object) this.proposer_key, (Object) proposalDao.proposer_key) && Intrinsics.EZpvd(this.properties, proposalDao.properties) && Intrinsics.EZpvd((Object) this.redirect, (Object) proposalDao.redirect) && Intrinsics.EZpvd(this.expiry, proposalDao.expiry);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIcons() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPairingTopic() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getProperties() {
        return this.properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposer_key() {
        return this.proposer_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedirect() {
        return this.redirect;
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
    public final long getRequest_id() {
        return this.request_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.request_id);
        int iHashCode2 = this.pairingTopic.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.description.hashCode();
        int iHashCode5 = this.url.hashCode();
        int iHashCode6 = this.icons.hashCode();
        int iHashCode7 = this.relay_protocol.hashCode();
        String str = this.relay_data;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        int iHashCode9 = this.proposer_key.hashCode();
        Map<String, String> map = this.properties;
        int iHashCode10 = map == null ? 0 : map.hashCode();
        int iHashCode11 = this.redirect.hashCode();
        Long l = this.expiry;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProposalDao(request_id=" + this.request_id + ", pairingTopic=" + this.pairingTopic + ", name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", relay_protocol=" + this.relay_protocol + ", relay_data=" + this.relay_data + ", proposer_key=" + this.proposer_key + ", properties=" + this.properties + ", redirect=" + this.redirect + ", expiry=" + this.expiry + ")";
    }

    public ProposalDao(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull String str5, String str6, @NotNull String str7, Map<String, String> map, @NotNull String str8, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.request_id = j;
        this.pairingTopic = str;
        this.name = str2;
        this.description = str3;
        this.url = str4;
        this.icons = list;
        this.relay_protocol = str5;
        this.relay_data = str6;
        this.proposer_key = str7;
        this.properties = map;
        this.redirect = str8;
        this.expiry = l;
    }

    public static final class Adapter {
        public final LoaderManager<List<String>, String> iconsAdapter;
        public final LoaderManager<Map<String, String>, String> propertiesAdapter;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<List<String>, String> getIconsAdapter() {
            return this.iconsAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<Map<String, String>, String> getPropertiesAdapter() {
            return this.propertiesAdapter;
        }

        public Adapter(@NotNull LoaderManager<List<String>, String> loaderManager, @NotNull LoaderManager<Map<String, String>, String> loaderManager2) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            Intrinsics.checkNotNullParameter(loaderManager2, "");
            this.iconsAdapter = loaderManager;
            this.propertiesAdapter = loaderManager2;
        }
    }
}
