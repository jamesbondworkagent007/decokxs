package com.okinc.planet.domain.remote.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LinkInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String activityKey;
    public final CampaignData campaignData;
    public final String deepLink;
    public final boolean isCampaignLink;
    public final boolean isWhite;
    public final String link;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LinkInfo copy$default(LinkInfo linkInfo, String str, String str2, boolean z, boolean z2, String str3, CampaignData campaignData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkInfo.link;
        }
        if ((i & 2) != 0) {
            str2 = linkInfo.deepLink;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = linkInfo.isWhite;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = linkInfo.isCampaignLink;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str3 = linkInfo.activityKey;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            campaignData = linkInfo.campaignData;
        }
        return linkInfo.copydefault(str, str4, z3, z4, str5, campaignData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.isCampaignLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CampaignData EZpvd() {
        return this.campaignData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkInfo copydefault(@NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, CampaignData campaignData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LinkInfo(str, str2, z, z2, str3, campaignData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.activityKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.isWhite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkInfo)) {
            return false;
        }
        LinkInfo linkInfo = (LinkInfo) obj;
        return Intrinsics.EZpvd((Object) this.link, (Object) linkInfo.link) && Intrinsics.EZpvd((Object) this.deepLink, (Object) linkInfo.deepLink) && this.isWhite == linkInfo.isWhite && this.isCampaignLink == linkInfo.isCampaignLink && Intrinsics.EZpvd((Object) this.activityKey, (Object) linkInfo.activityKey) && Intrinsics.EZpvd(this.campaignData, linkInfo.campaignData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.link.hashCode();
        int iHashCode2 = this.deepLink.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isWhite);
        int iHashCode4 = Boolean.hashCode(this.isCampaignLink);
        int iHashCode5 = this.activityKey.hashCode();
        CampaignData campaignData = this.campaignData;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (campaignData == null ? 0 : campaignData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LinkInfo(link=" + this.link + ", deepLink=" + this.deepLink + ", isWhite=" + this.isWhite + ", isCampaignLink=" + this.isCampaignLink + ", activityKey=" + this.activityKey + ", campaignData=" + this.campaignData + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.LinkInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkInfo> serializer() {
            return LinkInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LinkInfo(int i, String str, String str2, boolean z, boolean z2, String str3, CampaignData campaignData, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, LinkInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.link = str;
        if ((i & 2) == 0) {
            this.deepLink = "";
        } else {
            this.deepLink = str2;
        }
        if ((i & 4) == 0) {
            this.isWhite = false;
        } else {
            this.isWhite = z;
        }
        if ((i & 8) == 0) {
            this.isCampaignLink = false;
        } else {
            this.isCampaignLink = z2;
        }
        if ((i & 16) == 0) {
            this.activityKey = "";
        } else {
            this.activityKey = str3;
        }
        if ((i & 32) == 0) {
            this.campaignData = null;
        } else {
            this.campaignData = campaignData;
        }
    }

    public static final /* synthetic */ void OLrzqt(LinkInfo linkInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, linkInfo.link);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) linkInfo.deepLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, linkInfo.deepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || linkInfo.isWhite) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, linkInfo.isWhite);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || linkInfo.isCampaignLink) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, linkInfo.isCampaignLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) linkInfo.activityKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, linkInfo.activityKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && linkInfo.campaignData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, CampaignData$$serializer.INSTANCE, linkInfo.campaignData);
    }

    public LinkInfo(@NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, CampaignData campaignData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.link = str;
        this.deepLink = str2;
        this.isWhite = z;
        this.isCampaignLink = z2;
        this.activityKey = str3;
        this.campaignData = campaignData;
    }
}
