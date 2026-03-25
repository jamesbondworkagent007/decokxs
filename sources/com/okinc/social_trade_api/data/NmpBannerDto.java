package com.okinc.social_trade_api.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class NmpBannerDto {
    private final String activityName;
    private final BannerLinkType appLinkType;
    private final String apr;
    private final MarketplaceBannerType bannerType;
    private final String category;
    private final String cta;
    private final String href;
    private final String iconDark;
    private final String iconLight;
    private final String iconLottieDark;
    private final String iconLottieLight;
    private final String id;
    private final String isShowApr;
    private final String labels;
    private final BannerLayoutType layoutType;
    private final String mlTags;
    private final String subtitle;
    private final String title;
    private final NmpBannerUserVoucherDto userVoucher;
    private final NmpBannerVoucherInfoDto voucherInfo;
    private final String weight;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, BannerLinkType.Companion.serializer(), null, null, null, null, null, null, null, null, BannerLayoutType.Companion.serializer(), MarketplaceBannerType.Companion.serializer(), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NmpBannerDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BannerLinkType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BannerLayoutType) null, (MarketplaceBannerType) null, (NmpBannerVoucherInfoDto) null, (NmpBannerUserVoucherDto) null, (String) null, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.weight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.mlTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.iconLottieLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.iconLottieDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerLayoutType component16() {
        return this.layoutType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketplaceBannerType component17() {
        return this.bannerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NmpBannerVoucherInfoDto component18() {
        return this.voucherInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NmpBannerUserVoucherDto component19() {
        return this.userVoucher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.isShowApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.href;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.activityName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerLinkType component7() {
        return this.appLinkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.iconLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NmpBannerDto copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull BannerLinkType bannerLinkType, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull BannerLayoutType bannerLayoutType, @NotNull MarketplaceBannerType marketplaceBannerType, NmpBannerVoucherInfoDto nmpBannerVoucherInfoDto, NmpBannerUserVoucherDto nmpBannerUserVoucherDto, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(bannerLinkType, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(bannerLayoutType, "");
        Intrinsics.checkNotNullParameter(marketplaceBannerType, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new NmpBannerDto(str, str2, str3, str4, str5, str6, bannerLinkType, str7, str8, str9, str10, str11, str12, str13, str14, bannerLayoutType, marketplaceBannerType, nmpBannerVoucherInfoDto, nmpBannerUserVoucherDto, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NmpBannerDto)) {
            return false;
        }
        NmpBannerDto nmpBannerDto = (NmpBannerDto) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) nmpBannerDto.id) && Intrinsics.EZpvd((Object) this.title, (Object) nmpBannerDto.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) nmpBannerDto.subtitle) && Intrinsics.EZpvd((Object) this.cta, (Object) nmpBannerDto.cta) && Intrinsics.EZpvd((Object) this.href, (Object) nmpBannerDto.href) && Intrinsics.EZpvd((Object) this.activityName, (Object) nmpBannerDto.activityName) && this.appLinkType == nmpBannerDto.appLinkType && Intrinsics.EZpvd((Object) this.iconLight, (Object) nmpBannerDto.iconLight) && Intrinsics.EZpvd((Object) this.iconDark, (Object) nmpBannerDto.iconDark) && Intrinsics.EZpvd((Object) this.category, (Object) nmpBannerDto.category) && Intrinsics.EZpvd((Object) this.labels, (Object) nmpBannerDto.labels) && Intrinsics.EZpvd((Object) this.weight, (Object) nmpBannerDto.weight) && Intrinsics.EZpvd((Object) this.mlTags, (Object) nmpBannerDto.mlTags) && Intrinsics.EZpvd((Object) this.iconLottieLight, (Object) nmpBannerDto.iconLottieLight) && Intrinsics.EZpvd((Object) this.iconLottieDark, (Object) nmpBannerDto.iconLottieDark) && this.layoutType == nmpBannerDto.layoutType && this.bannerType == nmpBannerDto.bannerType && Intrinsics.EZpvd(this.voucherInfo, nmpBannerDto.voucherInfo) && Intrinsics.EZpvd(this.userVoucher, nmpBannerDto.userVoucher) && Intrinsics.EZpvd((Object) this.isShowApr, (Object) nmpBannerDto.isShowApr) && Intrinsics.EZpvd((Object) this.apr, (Object) nmpBannerDto.apr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerLinkType getAppLinkType() {
        return this.appLinkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApr() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketplaceBannerType getBannerType() {
        return this.bannerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHref() {
        return this.href;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconDark() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconLight() {
        return this.iconLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconLottieDark() {
        return this.iconLottieDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconLottieLight() {
        return this.iconLottieLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabels() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerLayoutType getLayoutType() {
        return this.layoutType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMlTags() {
        return this.mlTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NmpBannerUserVoucherDto getUserVoucher() {
        return this.userVoucher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NmpBannerVoucherInfoDto getVoucherInfo() {
        return this.voucherInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeight() {
        return this.weight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.subtitle.hashCode();
        String str = this.cta;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.href.hashCode();
        int iHashCode6 = this.activityName.hashCode();
        int iHashCode7 = this.appLinkType.hashCode();
        int iHashCode8 = this.iconLight.hashCode();
        int iHashCode9 = this.iconDark.hashCode();
        int iHashCode10 = this.category.hashCode();
        int iHashCode11 = this.labels.hashCode();
        int iHashCode12 = this.weight.hashCode();
        int iHashCode13 = this.mlTags.hashCode();
        int iHashCode14 = this.iconLottieLight.hashCode();
        int iHashCode15 = this.iconLottieDark.hashCode();
        int iHashCode16 = this.layoutType.hashCode();
        int iHashCode17 = this.bannerType.hashCode();
        NmpBannerVoucherInfoDto nmpBannerVoucherInfoDto = this.voucherInfo;
        int iHashCode18 = nmpBannerVoucherInfoDto == null ? 0 : nmpBannerVoucherInfoDto.hashCode();
        NmpBannerUserVoucherDto nmpBannerUserVoucherDto = this.userVoucher;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (nmpBannerUserVoucherDto == null ? 0 : nmpBannerUserVoucherDto.hashCode())) * 31) + this.isShowApr.hashCode()) * 31) + this.apr.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isShowApr() {
        return this.isShowApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NmpBannerDto(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", cta=" + this.cta + ", href=" + this.href + ", activityName=" + this.activityName + ", appLinkType=" + this.appLinkType + ", iconLight=" + this.iconLight + ", iconDark=" + this.iconDark + ", category=" + this.category + ", labels=" + this.labels + ", weight=" + this.weight + ", mlTags=" + this.mlTags + ", iconLottieLight=" + this.iconLottieLight + ", iconLottieDark=" + this.iconLottieDark + ", layoutType=" + this.layoutType + ", bannerType=" + this.bannerType + ", voucherInfo=" + this.voucherInfo + ", userVoucher=" + this.userVoucher + ", isShowApr=" + this.isShowApr + ", apr=" + this.apr + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.NmpBannerDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NmpBannerDto> serializer() {
            return NmpBannerDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NmpBannerDto(int i, String str, String str2, String str3, String str4, String str5, String str6, BannerLinkType bannerLinkType, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, BannerLayoutType bannerLayoutType, MarketplaceBannerType marketplaceBannerType, NmpBannerVoucherInfoDto nmpBannerVoucherInfoDto, NmpBannerUserVoucherDto nmpBannerUserVoucherDto, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str3;
        }
        if ((i & 8) == 0) {
            this.cta = null;
        } else {
            this.cta = str4;
        }
        if ((i & 16) == 0) {
            this.href = "";
        } else {
            this.href = str5;
        }
        if ((i & 32) == 0) {
            this.activityName = "";
        } else {
            this.activityName = str6;
        }
        this.appLinkType = (i & 64) == 0 ? BannerLinkType.Internal : bannerLinkType;
        if ((i & 128) == 0) {
            this.iconLight = "";
        } else {
            this.iconLight = str7;
        }
        if ((i & 256) == 0) {
            this.iconDark = "";
        } else {
            this.iconDark = str8;
        }
        if ((i & 512) == 0) {
            this.category = "";
        } else {
            this.category = str9;
        }
        if ((i & 1024) == 0) {
            this.labels = "";
        } else {
            this.labels = str10;
        }
        if ((i & 2048) == 0) {
            this.weight = "";
        } else {
            this.weight = str11;
        }
        if ((i & 4096) == 0) {
            this.mlTags = "";
        } else {
            this.mlTags = str12;
        }
        if ((i & 8192) == 0) {
            this.iconLottieLight = "";
        } else {
            this.iconLottieLight = str13;
        }
        if ((i & 16384) == 0) {
            this.iconLottieDark = "";
        } else {
            this.iconLottieDark = str14;
        }
        this.layoutType = (32768 & i) == 0 ? BannerLayoutType.Normal : bannerLayoutType;
        this.bannerType = (65536 & i) == 0 ? MarketplaceBannerType.Normal : marketplaceBannerType;
        if ((131072 & i) == 0) {
            this.voucherInfo = null;
        } else {
            this.voucherInfo = nmpBannerVoucherInfoDto;
        }
        if ((262144 & i) == 0) {
            this.userVoucher = null;
        } else {
            this.userVoucher = nmpBannerUserVoucherDto;
        }
        if ((524288 & i) == 0) {
            this.isShowApr = "";
        } else {
            this.isShowApr = str15;
        }
        if ((i & 1048576) == 0) {
            this.apr = "";
        } else {
            this.apr = str16;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [8=4] */
    public static final /* synthetic */ void write$Self$OKSocialTrading_trading_eco_api(NmpBannerDto nmpBannerDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) nmpBannerDto.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, nmpBannerDto.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) nmpBannerDto.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, nmpBannerDto.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) nmpBannerDto.subtitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, nmpBannerDto.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || nmpBannerDto.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, nmpBannerDto.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) nmpBannerDto.href, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, nmpBannerDto.href);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) nmpBannerDto.activityName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, nmpBannerDto.activityName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || nmpBannerDto.appLinkType != BannerLinkType.Internal) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], nmpBannerDto.appLinkType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) nmpBannerDto.iconLight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, nmpBannerDto.iconLight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) nmpBannerDto.iconDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, nmpBannerDto.iconDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) nmpBannerDto.category, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, nmpBannerDto.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) nmpBannerDto.labels, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, nmpBannerDto.labels);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) nmpBannerDto.weight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, nmpBannerDto.weight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) nmpBannerDto.mlTags, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, nmpBannerDto.mlTags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) nmpBannerDto.iconLottieLight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, nmpBannerDto.iconLottieLight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) nmpBannerDto.iconLottieDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, nmpBannerDto.iconLottieDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || nmpBannerDto.layoutType != BannerLayoutType.Normal) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], nmpBannerDto.layoutType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || nmpBannerDto.bannerType != MarketplaceBannerType.Normal) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], nmpBannerDto.bannerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || nmpBannerDto.voucherInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, NmpBannerVoucherInfoDto$$serializer.INSTANCE, nmpBannerDto.voucherInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || nmpBannerDto.userVoucher != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, NmpBannerUserVoucherDto$$serializer.INSTANCE, nmpBannerDto.userVoucher);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) nmpBannerDto.isShowApr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, nmpBannerDto.isShowApr);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && Intrinsics.EZpvd((Object) nmpBannerDto.apr, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 20, nmpBannerDto.apr);
    }

    public NmpBannerDto(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull BannerLinkType bannerLinkType, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull BannerLayoutType bannerLayoutType, @NotNull MarketplaceBannerType marketplaceBannerType, NmpBannerVoucherInfoDto nmpBannerVoucherInfoDto, NmpBannerUserVoucherDto nmpBannerUserVoucherDto, @NotNull String str15, @NotNull String str16) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(bannerLinkType, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(bannerLayoutType, "");
        Intrinsics.checkNotNullParameter(marketplaceBannerType, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.cta = str4;
        this.href = str5;
        this.activityName = str6;
        this.appLinkType = bannerLinkType;
        this.iconLight = str7;
        this.iconDark = str8;
        this.category = str9;
        this.labels = str10;
        this.weight = str11;
        this.mlTags = str12;
        this.iconLottieLight = str13;
        this.iconLottieDark = str14;
        this.layoutType = bannerLayoutType;
        this.bannerType = marketplaceBannerType;
        this.voucherInfo = nmpBannerVoucherInfoDto;
        this.userVoucher = nmpBannerUserVoucherDto;
        this.isShowApr = str15;
        this.apr = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ef: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:com.okinc.social_trade_api.data.BannerLinkType:?: TERNARY null = ((wrap:int:0x0034: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: SGET  A[WRAPPED] (LINE:17) com.okinc.social_trade_api.data.BannerLinkType.Internal com.okinc.social_trade_api.data.BannerLinkType) : (r29v0 com.okinc.social_trade_api.data.BannerLinkType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:com.okinc.social_trade_api.data.BannerLayoutType:?: TERNARY null = ((wrap:int:0x0083: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0087: SGET  A[WRAPPED] (LINE:26) com.okinc.social_trade_api.data.BannerLayoutType.Normal com.okinc.social_trade_api.data.BannerLayoutType) : (r38v0 com.okinc.social_trade_api.data.BannerLayoutType))
  (wrap:com.okinc.social_trade_api.data.MarketplaceBannerType:?: TERNARY null = ((wrap:int:0x008e: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0092: SGET  A[WRAPPED] (LINE:27) com.okinc.social_trade_api.data.MarketplaceBannerType.Normal com.okinc.social_trade_api.data.MarketplaceBannerType) : (r39v0 com.okinc.social_trade_api.data.MarketplaceBannerType))
  (wrap:com.okinc.social_trade_api.data.NmpBannerVoucherInfoDto:?: TERNARY null = ((wrap:int:0x0099: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.social_trade_api.data.NmpBannerVoucherInfoDto) : (r40v0 com.okinc.social_trade_api.data.NmpBannerVoucherInfoDto))
  (wrap:com.okinc.social_trade_api.data.NmpBannerUserVoucherDto:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.social_trade_api.data.NmpBannerUserVoucherDto) : (r41v0 com.okinc.social_trade_api.data.NmpBannerUserVoucherDto))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.social_trade_api.data.BannerLinkType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.social_trade_api.data.BannerLayoutType, com.okinc.social_trade_api.data.MarketplaceBannerType, com.okinc.social_trade_api.data.NmpBannerVoucherInfoDto, com.okinc.social_trade_api.data.NmpBannerUserVoucherDto, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.social_trade_api.data.NmpBannerDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.social_trade_api.data.BannerLinkType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.social_trade_api.data.BannerLayoutType, com.okinc.social_trade_api.data.MarketplaceBannerType, com.okinc.social_trade_api.data.NmpBannerVoucherInfoDto, com.okinc.social_trade_api.data.NmpBannerUserVoucherDto, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NmpBannerDto(String str, String str2, String str3, String str4, String str5, String str6, BannerLinkType bannerLinkType, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, BannerLayoutType bannerLayoutType, MarketplaceBannerType marketplaceBannerType, NmpBannerVoucherInfoDto nmpBannerVoucherInfoDto, NmpBannerUserVoucherDto nmpBannerUserVoucherDto, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? BannerLinkType.Internal : bannerLinkType, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? BannerLayoutType.Normal : bannerLayoutType, (i & 65536) != 0 ? MarketplaceBannerType.Normal : marketplaceBannerType, (i & 131072) != 0 ? null : nmpBannerVoucherInfoDto, (i & 262144) != 0 ? null : nmpBannerUserVoucherDto, (i & 524288) != 0 ? "" : str15, (i & 1048576) != 0 ? "" : str16);
    }
}
