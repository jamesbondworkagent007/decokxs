package com.okinc.okex.campaign.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class Campaign {
    private final long campaignEndTime;
    private final String campaignTitle;
    private final List<RedirectTarget> redirectList;
    private final String slug;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(RedirectTarget$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okex.campaign.bean.Campaign */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Campaign copy$default(Campaign campaign, String str, long j, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaign.campaignTitle;
        }
        if ((i & 2) != 0) {
            j = campaign.campaignEndTime;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = campaign.slug;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            list = campaign.redirectList;
        }
        return campaign.copy(str, j2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.campaignTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.campaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RedirectTarget> component4() {
        return this.redirectList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Campaign copy(@NotNull String str, long j, @NotNull String str2, @NotNull List<RedirectTarget> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new Campaign(str, j, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Campaign)) {
            return false;
        }
        Campaign campaign = (Campaign) obj;
        return Intrinsics.EZpvd((Object) this.campaignTitle, (Object) campaign.campaignTitle) && this.campaignEndTime == campaign.campaignEndTime && Intrinsics.EZpvd((Object) this.slug, (Object) campaign.slug) && Intrinsics.EZpvd(this.redirectList, campaign.redirectList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCampaignEndTime() {
        return this.campaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignTitle() {
        return this.campaignTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RedirectTarget> getRedirectList() {
        return this.redirectList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.campaignTitle.hashCode() * 31) + Long.hashCode(this.campaignEndTime)) * 31) + this.slug.hashCode()) * 31) + this.redirectList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Campaign(campaignTitle=" + this.campaignTitle + ", campaignEndTime=" + this.campaignEndTime + ", slug=" + this.slug + ", redirectList=" + this.redirectList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.campaign.bean.Campaign.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Campaign> serializer() {
            return Campaign$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Campaign(int i, String str, long j, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, Campaign$$serializer.INSTANCE.getDescriptor());
        }
        this.campaignTitle = str;
        this.campaignEndTime = j;
        this.slug = str2;
        this.redirectList = list;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(Campaign campaign, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, campaign.campaignTitle);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, campaign.campaignEndTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, campaign.slug);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], campaign.redirectList);
    }

    public Campaign(@NotNull String str, long j, @NotNull String str2, @NotNull List<RedirectTarget> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.campaignTitle = str;
        this.campaignEndTime = j;
        this.slug = str2;
        this.redirectList = list;
    }
}
