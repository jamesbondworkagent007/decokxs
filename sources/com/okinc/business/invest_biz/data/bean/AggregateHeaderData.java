package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.bean.response.RewardCryptos;
import com.okinc.business.invest_biz.data.bean.response.RewardCryptos$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class AggregateHeaderData {
    public final BackgroundImage backgroundImage;
    public final String bonusEndTime;
    public final String bonusSponsor;
    public final String bonusStartTime;
    public final String certikScore;
    public final String description;
    public final String descriptionTitle;
    public final boolean displaySafeTag;
    public final String logo;
    public final String platformLink;
    public final String protocolRank;
    public final String protocolRuntime;
    public final String ratingName;
    public final int ratingTypeId;
    public final RewardCryptos rewardCryptos;
    public final String seoType;
    public final HeaderSubData subTabVo;
    public final String subTitle;
    public final String title;
    public final String tvl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AggregateHeaderData() {
        this((BackgroundImage) null, (String) null, (String) null, (String) null, (String) null, (HeaderSubData) null, (String) null, (RewardCryptos) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AggregateHeaderData AEQbTJ(@NotNull BackgroundImage backgroundImage, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull HeaderSubData headerSubData, @NotNull String str5, RewardCryptos rewardCryptos, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i, @NotNull String str14, @NotNull String str15) {
        Intrinsics.checkNotNullParameter(backgroundImage, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(headerSubData, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        return new AggregateHeaderData(backgroundImage, str, str2, str3, str4, headerSubData, str5, rewardCryptos, str6, str7, str8, str9, str10, z, str11, str12, str13, i, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.bonusSponsor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.descriptionTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.ratingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.ratingTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.bonusEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackgroundImage KWHzl() {
        return this.backgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.bonusStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.certikScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeaderSubData ejfBZ() {
        return this.subTabVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregateHeaderData)) {
            return false;
        }
        AggregateHeaderData aggregateHeaderData = (AggregateHeaderData) obj;
        return Intrinsics.EZpvd(this.backgroundImage, aggregateHeaderData.backgroundImage) && Intrinsics.EZpvd((Object) this.title, (Object) aggregateHeaderData.title) && Intrinsics.EZpvd((Object) this.descriptionTitle, (Object) aggregateHeaderData.descriptionTitle) && Intrinsics.EZpvd((Object) this.subTitle, (Object) aggregateHeaderData.subTitle) && Intrinsics.EZpvd((Object) this.logo, (Object) aggregateHeaderData.logo) && Intrinsics.EZpvd(this.subTabVo, aggregateHeaderData.subTabVo) && Intrinsics.EZpvd((Object) this.description, (Object) aggregateHeaderData.description) && Intrinsics.EZpvd(this.rewardCryptos, aggregateHeaderData.rewardCryptos) && Intrinsics.EZpvd((Object) this.bonusSponsor, (Object) aggregateHeaderData.bonusSponsor) && Intrinsics.EZpvd((Object) this.bonusStartTime, (Object) aggregateHeaderData.bonusStartTime) && Intrinsics.EZpvd((Object) this.bonusEndTime, (Object) aggregateHeaderData.bonusEndTime) && Intrinsics.EZpvd((Object) this.platformLink, (Object) aggregateHeaderData.platformLink) && Intrinsics.EZpvd((Object) this.seoType, (Object) aggregateHeaderData.seoType) && this.displaySafeTag == aggregateHeaderData.displaySafeTag && Intrinsics.EZpvd((Object) this.tvl, (Object) aggregateHeaderData.tvl) && Intrinsics.EZpvd((Object) this.certikScore, (Object) aggregateHeaderData.certikScore) && Intrinsics.EZpvd((Object) this.ratingName, (Object) aggregateHeaderData.ratingName) && this.ratingTypeId == aggregateHeaderData.ratingTypeId && Intrinsics.EZpvd((Object) this.protocolRank, (Object) aggregateHeaderData.protocolRank) && Intrinsics.EZpvd((Object) this.protocolRuntime, (Object) aggregateHeaderData.protocolRuntime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.seoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardCryptos fetchVPNInfo() {
        return this.rewardCryptos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.platformLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.backgroundImage.hashCode();
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.descriptionTitle.hashCode();
        int iHashCode4 = this.subTitle.hashCode();
        int iHashCode5 = this.logo.hashCode();
        int iHashCode6 = this.subTabVo.hashCode();
        int iHashCode7 = this.description.hashCode();
        RewardCryptos rewardCryptos = this.rewardCryptos;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (rewardCryptos == null ? 0 : rewardCryptos.hashCode())) * 31) + this.bonusSponsor.hashCode()) * 31) + this.bonusStartTime.hashCode()) * 31) + this.bonusEndTime.hashCode()) * 31) + this.platformLink.hashCode()) * 31) + this.seoType.hashCode()) * 31) + Boolean.hashCode(this.displaySafeTag)) * 31) + this.tvl.hashCode()) * 31) + this.certikScore.hashCode()) * 31) + this.ratingName.hashCode()) * 31) + Integer.hashCode(this.ratingTypeId)) * 31) + this.protocolRank.hashCode()) * 31) + this.protocolRuntime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.protocolRuntime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AggregateHeaderData(backgroundImage=" + this.backgroundImage + ", title=" + this.title + ", descriptionTitle=" + this.descriptionTitle + ", subTitle=" + this.subTitle + ", logo=" + this.logo + ", subTabVo=" + this.subTabVo + ", description=" + this.description + ", rewardCryptos=" + this.rewardCryptos + ", bonusSponsor=" + this.bonusSponsor + ", bonusStartTime=" + this.bonusStartTime + ", bonusEndTime=" + this.bonusEndTime + ", platformLink=" + this.platformLink + ", seoType=" + this.seoType + ", displaySafeTag=" + this.displaySafeTag + ", tvl=" + this.tvl + ", certikScore=" + this.certikScore + ", ratingName=" + this.ratingName + ", ratingTypeId=" + this.ratingTypeId + ", protocolRank=" + this.protocolRank + ", protocolRuntime=" + this.protocolRuntime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.displaySafeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.protocolRank;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.AggregateHeaderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AggregateHeaderData> serializer() {
            return AggregateHeaderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AggregateHeaderData(int i, BackgroundImage backgroundImage, String str, String str2, String str3, String str4, HeaderSubData headerSubData, String str5, RewardCryptos rewardCryptos, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, int i2, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        HeaderSubData headerSubData2;
        int i3 = 3;
        List list = null;
        byte b = 0;
        this.backgroundImage = (i & 1) == 0 ? new BackgroundImage((String) null, (String) null, 3, (DefaultConstructorMarker) null) : backgroundImage;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.descriptionTitle = "";
        } else {
            this.descriptionTitle = str2;
        }
        if ((i & 8) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str3;
        }
        if ((i & 16) == 0) {
            this.logo = "";
        } else {
            this.logo = str4;
        }
        boolean z2 = false;
        if ((i & 32) == 0) {
            headerSubData2 = new HeaderSubData(z2, list, i3, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            headerSubData2 = headerSubData;
        }
        this.subTabVo = headerSubData2;
        if ((i & 64) == 0) {
            this.description = "";
        } else {
            this.description = str5;
        }
        if ((i & 128) == 0) {
            this.rewardCryptos = null;
        } else {
            this.rewardCryptos = rewardCryptos;
        }
        if ((i & 256) == 0) {
            this.bonusSponsor = "";
        } else {
            this.bonusSponsor = str6;
        }
        if ((i & 512) == 0) {
            this.bonusStartTime = "";
        } else {
            this.bonusStartTime = str7;
        }
        if ((i & 1024) == 0) {
            this.bonusEndTime = "";
        } else {
            this.bonusEndTime = str8;
        }
        if ((i & 2048) == 0) {
            this.platformLink = "";
        } else {
            this.platformLink = str9;
        }
        if ((i & 4096) == 0) {
            this.seoType = "";
        } else {
            this.seoType = str10;
        }
        if ((i & 8192) == 0) {
            this.displaySafeTag = false;
        } else {
            this.displaySafeTag = z;
        }
        if ((i & 16384) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str11;
        }
        if ((32768 & i) == 0) {
            this.certikScore = "";
        } else {
            this.certikScore = str12;
        }
        if ((65536 & i) == 0) {
            this.ratingName = "";
        } else {
            this.ratingName = str13;
        }
        this.ratingTypeId = (131072 & i) == 0 ? -1 : i2;
        if ((262144 & i) == 0) {
            this.protocolRank = "";
        } else {
            this.protocolRank = str14;
        }
        if ((i & 524288) == 0) {
            this.protocolRuntime = "";
        } else {
            this.protocolRuntime = str15;
        }
    }

    public static final /* synthetic */ void EZpvd(AggregateHeaderData aggregateHeaderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        boolean z = false;
        int i = 3;
        List list = null;
        byte b = 0;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(aggregateHeaderData.backgroundImage, new BackgroundImage((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BackgroundImage$$serializer.INSTANCE, aggregateHeaderData.backgroundImage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) aggregateHeaderData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, aggregateHeaderData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) aggregateHeaderData.descriptionTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, aggregateHeaderData.descriptionTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) aggregateHeaderData.subTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, aggregateHeaderData.subTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) aggregateHeaderData.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, aggregateHeaderData.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(aggregateHeaderData.subTabVo, new HeaderSubData(z, list, i, (DefaultConstructorMarker) (b == true ? 1 : 0)))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, HeaderSubData$$serializer.INSTANCE, aggregateHeaderData.subTabVo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) aggregateHeaderData.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, aggregateHeaderData.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || aggregateHeaderData.rewardCryptos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, RewardCryptos$$serializer.INSTANCE, aggregateHeaderData.rewardCryptos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) aggregateHeaderData.bonusSponsor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, aggregateHeaderData.bonusSponsor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) aggregateHeaderData.bonusStartTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, aggregateHeaderData.bonusStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) aggregateHeaderData.bonusEndTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, aggregateHeaderData.bonusEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) aggregateHeaderData.platformLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, aggregateHeaderData.platformLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) aggregateHeaderData.seoType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, aggregateHeaderData.seoType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || aggregateHeaderData.displaySafeTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, aggregateHeaderData.displaySafeTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) aggregateHeaderData.tvl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, aggregateHeaderData.tvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) aggregateHeaderData.certikScore, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, aggregateHeaderData.certikScore);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) aggregateHeaderData.ratingName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, aggregateHeaderData.ratingName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || aggregateHeaderData.ratingTypeId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 17, aggregateHeaderData.ratingTypeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) aggregateHeaderData.protocolRank, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, aggregateHeaderData.protocolRank);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && Intrinsics.EZpvd((Object) aggregateHeaderData.protocolRuntime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 19, aggregateHeaderData.protocolRuntime);
    }

    public AggregateHeaderData(@NotNull BackgroundImage backgroundImage, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull HeaderSubData headerSubData, @NotNull String str5, RewardCryptos rewardCryptos, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i, @NotNull String str14, @NotNull String str15) {
        Intrinsics.checkNotNullParameter(backgroundImage, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(headerSubData, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.backgroundImage = backgroundImage;
        this.title = str;
        this.descriptionTitle = str2;
        this.subTitle = str3;
        this.logo = str4;
        this.subTabVo = headerSubData;
        this.description = str5;
        this.rewardCryptos = rewardCryptos;
        this.bonusSponsor = str6;
        this.bonusStartTime = str7;
        this.bonusEndTime = str8;
        this.platformLink = str9;
        this.seoType = str10;
        this.displaySafeTag = z;
        this.tvl = str11;
        this.certikScore = str12;
        this.ratingName = str13;
        this.ratingTypeId = i;
        this.protocolRank = str14;
        this.protocolRuntime = str15;
    }

    public /* synthetic */ AggregateHeaderData(BackgroundImage backgroundImage, String str, String str2, String str3, String str4, HeaderSubData headerSubData, String str5, RewardCryptos rewardCryptos, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, int i, String str14, String str15, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        HeaderSubData headerSubData2;
        int i3 = 3;
        byte b = 0;
        byte b2 = 0;
        BackgroundImage backgroundImage2 = (i2 & 1) != 0 ? new BackgroundImage((String) null, (String) null, 3, (DefaultConstructorMarker) null) : backgroundImage;
        String str16 = (i2 & 2) != 0 ? "" : str;
        String str17 = (i2 & 4) != 0 ? "" : str2;
        String str18 = (i2 & 8) != 0 ? "" : str3;
        String str19 = (i2 & 16) != 0 ? "" : str4;
        boolean z2 = false;
        if ((i2 & 32) != 0) {
            headerSubData2 = new HeaderSubData(z2, (List) (b2 == true ? 1 : 0), i3, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            headerSubData2 = headerSubData;
        }
        this(backgroundImage2, str16, str17, str18, str19, headerSubData2, (i2 & 64) != 0 ? "" : str5, (i2 & 128) == 0 ? rewardCryptos : null, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? false : z, (i2 & 16384) != 0 ? "" : str11, (i2 & 32768) != 0 ? "" : str12, (i2 & 65536) != 0 ? "" : str13, (i2 & 131072) != 0 ? -1 : i, (i2 & 262144) != 0 ? "" : str14, (i2 & 524288) != 0 ? "" : str15);
    }
}
