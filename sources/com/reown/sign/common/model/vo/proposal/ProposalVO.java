package com.reown.sign.common.model.vo.proposal;

import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Redirect;
import com.reown.foundation.common.model.Topic;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProposalVO {
    public final String description;
    public final Expiry expiry;
    public final List<String> icons;
    public final String name;
    public final Map<String, Namespace.Proposal> optionalNamespaces;
    public final Topic pairingTopic;
    public final Map<String, String> properties;
    public final String proposerPublicKey;
    public final String redirect;
    public final String relayData;
    public final String relayProtocol;
    public final long requestId;
    public final Map<String, Namespace.Proposal> requiredNamespaces;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component10() {
        return this.properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.proposerPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.relayProtocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.relayData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Expiry component14() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic component2() {
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
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Namespace.Proposal> component8() {
        return this.requiredNamespaces;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Namespace.Proposal> component9() {
        return this.optionalNamespaces;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProposalVO copy(long j, @NotNull Topic topic, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull String str4, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str5, @NotNull String str6, String str7, Expiry expiry) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new ProposalVO(j, topic, str, str2, str3, list, str4, map, map2, map3, str5, str6, str7, expiry);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProposalVO)) {
            return false;
        }
        ProposalVO proposalVO = (ProposalVO) obj;
        return this.requestId == proposalVO.requestId && Intrinsics.EZpvd(this.pairingTopic, proposalVO.pairingTopic) && Intrinsics.EZpvd((Object) this.name, (Object) proposalVO.name) && Intrinsics.EZpvd((Object) this.description, (Object) proposalVO.description) && Intrinsics.EZpvd((Object) this.url, (Object) proposalVO.url) && Intrinsics.EZpvd(this.icons, proposalVO.icons) && Intrinsics.EZpvd((Object) this.redirect, (Object) proposalVO.redirect) && Intrinsics.EZpvd(this.requiredNamespaces, proposalVO.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, proposalVO.optionalNamespaces) && Intrinsics.EZpvd(this.properties, proposalVO.properties) && Intrinsics.EZpvd((Object) this.proposerPublicKey, (Object) proposalVO.proposerPublicKey) && Intrinsics.EZpvd((Object) this.relayProtocol, (Object) proposalVO.relayProtocol) && Intrinsics.EZpvd((Object) this.relayData, (Object) proposalVO.relayData) && Intrinsics.EZpvd(this.expiry, proposalVO.expiry);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Expiry getExpiry() {
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
    public final Map<String, Namespace.Proposal> getOptionalNamespaces() {
        return this.optionalNamespaces;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic getPairingTopic() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getProperties() {
        return this.properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposerPublicKey() {
        return this.proposerPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedirect() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelayData() {
        return this.relayData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelayProtocol() {
        return this.relayProtocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Namespace.Proposal> getRequiredNamespaces() {
        return this.requiredNamespaces;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.requestId);
        int iHashCode2 = this.pairingTopic.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.description.hashCode();
        int iHashCode5 = this.url.hashCode();
        int iHashCode6 = this.icons.hashCode();
        int iHashCode7 = this.redirect.hashCode();
        int iHashCode8 = this.requiredNamespaces.hashCode();
        int iHashCode9 = this.optionalNamespaces.hashCode();
        Map<String, String> map = this.properties;
        int iHashCode10 = map == null ? 0 : map.hashCode();
        int iHashCode11 = this.proposerPublicKey.hashCode();
        int iHashCode12 = this.relayProtocol.hashCode();
        String str = this.relayData;
        int iHashCode13 = str == null ? 0 : str.hashCode();
        Expiry expiry = this.expiry;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (expiry != null ? expiry.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProposalVO(requestId=" + this.requestId + ", pairingTopic=" + this.pairingTopic + ", name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", redirect=" + this.redirect + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", properties=" + this.properties + ", proposerPublicKey=" + this.proposerPublicKey + ", relayProtocol=" + this.relayProtocol + ", relayData=" + this.relayData + ", expiry=" + this.expiry + ")";
    }

    public ProposalVO(long j, @NotNull Topic topic, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull String str4, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str5, @NotNull String str6, String str7, Expiry expiry) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.requestId = j;
        this.pairingTopic = topic;
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.icons = list;
        this.redirect = str4;
        this.requiredNamespaces = map;
        this.optionalNamespaces = map2;
        this.properties = map3;
        this.proposerPublicKey = str5;
        this.relayProtocol = str6;
        this.relayData = str7;
        this.expiry = expiry;
    }

    public final AppMetaData getAppMetaData() {
        return new AppMetaData(this.description, this.url, this.icons, this.name, new Redirect(this.redirect, null, false, 6, null), null, 32, null);
    }
}
