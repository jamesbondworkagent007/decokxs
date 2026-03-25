package com.reown.android.internal.common.modal.data.network.model;

import com.okinc.p2p.api.OtcExtraKeys;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class WalletDTO {
    public final String appStore;
    public final String desktopLink;
    public final String homePage;
    public final String id;
    public final String imageId;
    public final String linkMode;
    public final String mobileLink;
    public final String name;
    public final String order;
    public final String playStore;
    public final String webappLink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.playStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.linkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.homePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mobileLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.desktopLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.webappLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.appStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletDTO copy(@Json(name = "id") @NotNull String str, @Json(name = "name") @NotNull String str2, @Json(name = "homepage") @NotNull String str3, @Json(name = "image_id") @NotNull String str4, @Json(name = OtcExtraKeys.ORDER) @NotNull String str5, @Json(name = "mobile_link") String str6, @Json(name = "desktop_link") String str7, @Json(name = "webapp_link") String str8, @Json(name = "app_store") String str9, @Json(name = "play_store") String str10, @Json(name = "link_mode") String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new WalletDTO(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletDTO)) {
            return false;
        }
        WalletDTO walletDTO = (WalletDTO) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) walletDTO.id) && Intrinsics.EZpvd((Object) this.name, (Object) walletDTO.name) && Intrinsics.EZpvd((Object) this.homePage, (Object) walletDTO.homePage) && Intrinsics.EZpvd((Object) this.imageId, (Object) walletDTO.imageId) && Intrinsics.EZpvd((Object) this.order, (Object) walletDTO.order) && Intrinsics.EZpvd((Object) this.mobileLink, (Object) walletDTO.mobileLink) && Intrinsics.EZpvd((Object) this.desktopLink, (Object) walletDTO.desktopLink) && Intrinsics.EZpvd((Object) this.webappLink, (Object) walletDTO.webappLink) && Intrinsics.EZpvd((Object) this.appStore, (Object) walletDTO.appStore) && Intrinsics.EZpvd((Object) this.playStore, (Object) walletDTO.playStore) && Intrinsics.EZpvd((Object) this.linkMode, (Object) walletDTO.linkMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppStore() {
        return this.appStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesktopLink() {
        return this.desktopLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHomePage() {
        return this.homePage;
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
    public final String getLinkMode() {
        return this.linkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMobileLink() {
        return this.mobileLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrder() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlayStore() {
        return this.playStore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebappLink() {
        return this.webappLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.homePage.hashCode();
        int iHashCode4 = this.imageId.hashCode();
        int iHashCode5 = this.order.hashCode();
        String str = this.mobileLink;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.desktopLink;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.webappLink;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.appStore;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.playStore;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.linkMode;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletDTO(id=" + this.id + ", name=" + this.name + ", homePage=" + this.homePage + ", imageId=" + this.imageId + ", order=" + this.order + ", mobileLink=" + this.mobileLink + ", desktopLink=" + this.desktopLink + ", webappLink=" + this.webappLink + ", appStore=" + this.appStore + ", playStore=" + this.playStore + ", linkMode=" + this.linkMode + ")";
    }

    public WalletDTO(@Json(name = "id") @NotNull String str, @Json(name = "name") @NotNull String str2, @Json(name = "homepage") @NotNull String str3, @Json(name = "image_id") @NotNull String str4, @Json(name = OtcExtraKeys.ORDER) @NotNull String str5, @Json(name = "mobile_link") String str6, @Json(name = "desktop_link") String str7, @Json(name = "webapp_link") String str8, @Json(name = "app_store") String str9, @Json(name = "play_store") String str10, @Json(name = "link_mode") String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = str;
        this.name = str2;
        this.homePage = str3;
        this.imageId = str4;
        this.order = str5;
        this.mobileLink = str6;
        this.desktopLink = str7;
        this.webappLink = str8;
        this.appStore = str9;
        this.playStore = str10;
        this.linkMode = str11;
    }
}
