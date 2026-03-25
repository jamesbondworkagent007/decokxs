package com.reown.android.internal.common.explorer.data.network.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.reown.android.pulse.model.ConnectionMethod;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class ListingDTO {

    /* JADX INFO: renamed from: app, reason: collision with root package name */
    public final AppDTO f1050app;
    public final String appType;
    public final List<String> chains;
    public final String description;
    public final DesktopDTO desktop;
    public final String homepage;
    public final String id;
    public final String imageId;
    public final ImageUrlDTO imageUrl;
    public final List<InjectedDTO> injected;
    public final MetadataDTO metadata;
    public final MobileDTO mobile;
    public final String name;
    public final List<String> sdks;
    public final List<SupportedStandardDTO> supportedStandards;
    public final String updatedAt;
    public final List<String> versions;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUrlDTO component10() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppDTO component11() {
        return this.f1050app;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InjectedDTO> component12() {
        return this.injected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MobileDTO component13() {
        return this.mobile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DesktopDTO component14() {
        return this.desktop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedStandardDTO> component15() {
        return this.supportedStandards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MetadataDTO component16() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.homepage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.versions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.sdks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.appType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ListingDTO copy(@Json(name = "id") @NotNull String str, @Json(name = "name") @NotNull String str2, @Json(name = "description") String str3, @Json(name = "homepage") @NotNull String str4, @Json(name = "chains") @NotNull List<String> list, @Json(name = "versions") @NotNull List<String> list2, @Json(name = "sdks") @NotNull List<String> list3, @Json(name = "app_type") @NotNull String str5, @Json(name = "image_id") @NotNull String str6, @Json(name = "image_url") @NotNull ImageUrlDTO imageUrlDTO, @Json(name = "app") @NotNull AppDTO appDTO, @Json(name = "injected") List<InjectedDTO> list4, @Json(name = ConnectionMethod.MOBILE) @NotNull MobileDTO mobileDTO, @Json(name = "desktop") @NotNull DesktopDTO desktopDTO, @Json(name = "supported_standards") @NotNull List<SupportedStandardDTO> list5, @Json(name = TtmlNode.TAG_METADATA) @NotNull MetadataDTO metadataDTO, @Json(name = "updatedAt") @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(imageUrlDTO, "");
        Intrinsics.checkNotNullParameter(appDTO, "");
        Intrinsics.checkNotNullParameter(mobileDTO, "");
        Intrinsics.checkNotNullParameter(desktopDTO, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(metadataDTO, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ListingDTO(str, str2, str3, str4, list, list2, list3, str5, str6, imageUrlDTO, appDTO, list4, mobileDTO, desktopDTO, list5, metadataDTO, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingDTO)) {
            return false;
        }
        ListingDTO listingDTO = (ListingDTO) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) listingDTO.id) && Intrinsics.EZpvd((Object) this.name, (Object) listingDTO.name) && Intrinsics.EZpvd((Object) this.description, (Object) listingDTO.description) && Intrinsics.EZpvd((Object) this.homepage, (Object) listingDTO.homepage) && Intrinsics.EZpvd(this.chains, listingDTO.chains) && Intrinsics.EZpvd(this.versions, listingDTO.versions) && Intrinsics.EZpvd(this.sdks, listingDTO.sdks) && Intrinsics.EZpvd((Object) this.appType, (Object) listingDTO.appType) && Intrinsics.EZpvd((Object) this.imageId, (Object) listingDTO.imageId) && Intrinsics.EZpvd(this.imageUrl, listingDTO.imageUrl) && Intrinsics.EZpvd(this.f1050app, listingDTO.f1050app) && Intrinsics.EZpvd(this.injected, listingDTO.injected) && Intrinsics.EZpvd(this.mobile, listingDTO.mobile) && Intrinsics.EZpvd(this.desktop, listingDTO.desktop) && Intrinsics.EZpvd(this.supportedStandards, listingDTO.supportedStandards) && Intrinsics.EZpvd(this.metadata, listingDTO.metadata) && Intrinsics.EZpvd((Object) this.updatedAt, (Object) listingDTO.updatedAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppDTO getApp() {
        return this.f1050app;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppType() {
        return this.appType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DesktopDTO getDesktop() {
        return this.desktop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHomepage() {
        return this.homepage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageId() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUrlDTO getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InjectedDTO> getInjected() {
        return this.injected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MetadataDTO getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MobileDTO getMobile() {
        return this.mobile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSdks() {
        return this.sdks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedStandardDTO> getSupportedStandards() {
        return this.supportedStandards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getVersions() {
        return this.versions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.name.hashCode();
        String str = this.description;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.homepage.hashCode();
        int iHashCode5 = this.chains.hashCode();
        int iHashCode6 = this.versions.hashCode();
        int iHashCode7 = this.sdks.hashCode();
        int iHashCode8 = this.appType.hashCode();
        int iHashCode9 = this.imageId.hashCode();
        int iHashCode10 = this.imageUrl.hashCode();
        int iHashCode11 = this.f1050app.hashCode();
        List<InjectedDTO> list = this.injected;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.mobile.hashCode()) * 31) + this.desktop.hashCode()) * 31) + this.supportedStandards.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ListingDTO(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", homepage=" + this.homepage + ", chains=" + this.chains + ", versions=" + this.versions + ", sdks=" + this.sdks + ", appType=" + this.appType + ", imageId=" + this.imageId + ", imageUrl=" + this.imageUrl + ", app=" + this.f1050app + ", injected=" + this.injected + ", mobile=" + this.mobile + ", desktop=" + this.desktop + ", supportedStandards=" + this.supportedStandards + ", metadata=" + this.metadata + ", updatedAt=" + this.updatedAt + ")";
    }

    public ListingDTO(@Json(name = "id") @NotNull String str, @Json(name = "name") @NotNull String str2, @Json(name = "description") String str3, @Json(name = "homepage") @NotNull String str4, @Json(name = "chains") @NotNull List<String> list, @Json(name = "versions") @NotNull List<String> list2, @Json(name = "sdks") @NotNull List<String> list3, @Json(name = "app_type") @NotNull String str5, @Json(name = "image_id") @NotNull String str6, @Json(name = "image_url") @NotNull ImageUrlDTO imageUrlDTO, @Json(name = "app") @NotNull AppDTO appDTO, @Json(name = "injected") List<InjectedDTO> list4, @Json(name = ConnectionMethod.MOBILE) @NotNull MobileDTO mobileDTO, @Json(name = "desktop") @NotNull DesktopDTO desktopDTO, @Json(name = "supported_standards") @NotNull List<SupportedStandardDTO> list5, @Json(name = TtmlNode.TAG_METADATA) @NotNull MetadataDTO metadataDTO, @Json(name = "updatedAt") @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(imageUrlDTO, "");
        Intrinsics.checkNotNullParameter(appDTO, "");
        Intrinsics.checkNotNullParameter(mobileDTO, "");
        Intrinsics.checkNotNullParameter(desktopDTO, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(metadataDTO, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.homepage = str4;
        this.chains = list;
        this.versions = list2;
        this.sdks = list3;
        this.appType = str5;
        this.imageId = str6;
        this.imageUrl = imageUrlDTO;
        this.f1050app = appDTO;
        this.injected = list4;
        this.mobile = mobileDTO;
        this.desktop = desktopDTO;
        this.supportedStandards = list5;
        this.metadata = metadataDTO;
        this.updatedAt = str7;
    }
}
