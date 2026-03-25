package com.reown.android.internal.common.explorer.data.network.model;

import com.reown.android.pulse.model.ConnectionMethod;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@JsonClass(generateAdapter = true)
public final class WalletDTO {

    /* JADX INFO: renamed from: app, reason: collision with root package name */
    public final AppDTO f1051app;
    public final String description;
    public final String homePage;
    public final String id;
    public final String imageId;
    public final MobileDTO mobile;
    public final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletDTO copy$default(WalletDTO walletDTO, String str, String str2, String str3, String str4, String str5, MobileDTO mobileDTO, AppDTO appDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletDTO.id;
        }
        if ((i & 2) != 0) {
            str2 = walletDTO.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = walletDTO.description;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = walletDTO.homePage;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = walletDTO.imageId;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            mobileDTO = walletDTO.mobile;
        }
        MobileDTO mobileDTO2 = mobileDTO;
        if ((i & 64) != 0) {
            appDTO = walletDTO.f1051app;
        }
        return walletDTO.copy(str, str6, str7, str8, str9, mobileDTO2, appDTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
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
        return this.homePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MobileDTO component6() {
        return this.mobile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppDTO component7() {
        return this.f1051app;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletDTO copy(@Json(name = "id") @NotNull String str, @Json(name = "name") @NotNull String str2, @Json(name = "description") String str3, @Json(name = "homepage") @NotNull String str4, @Json(name = "image_id") @NotNull String str5, @Json(name = ConnectionMethod.MOBILE) @NotNull MobileDTO mobileDTO, @Json(name = "app") @NotNull AppDTO appDTO) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(mobileDTO, "");
        Intrinsics.checkNotNullParameter(appDTO, "");
        return new WalletDTO(str, str2, str3, str4, str5, mobileDTO, appDTO);
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
        return Intrinsics.EZpvd((Object) this.id, (Object) walletDTO.id) && Intrinsics.EZpvd((Object) this.name, (Object) walletDTO.name) && Intrinsics.EZpvd((Object) this.description, (Object) walletDTO.description) && Intrinsics.EZpvd((Object) this.homePage, (Object) walletDTO.homePage) && Intrinsics.EZpvd((Object) this.imageId, (Object) walletDTO.imageId) && Intrinsics.EZpvd(this.mobile, walletDTO.mobile) && Intrinsics.EZpvd(this.f1051app, walletDTO.f1051app);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppDTO getApp() {
        return this.f1051app;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
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
    public final MobileDTO getMobile() {
        return this.mobile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.name.hashCode();
        String str = this.description;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.homePage.hashCode()) * 31) + this.imageId.hashCode()) * 31) + this.mobile.hashCode()) * 31) + this.f1051app.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletDTO(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", homePage=" + this.homePage + ", imageId=" + this.imageId + ", mobile=" + this.mobile + ", app=" + this.f1051app + ")";
    }

    public WalletDTO(@Json(name = "id") @NotNull String str, @Json(name = "name") @NotNull String str2, @Json(name = "description") String str3, @Json(name = "homepage") @NotNull String str4, @Json(name = "image_id") @NotNull String str5, @Json(name = ConnectionMethod.MOBILE) @NotNull MobileDTO mobileDTO, @Json(name = "app") @NotNull AppDTO appDTO) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(mobileDTO, "");
        Intrinsics.checkNotNullParameter(appDTO, "");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.homePage = str4;
        this.imageId = str5;
        this.mobile = mobileDTO;
        this.f1051app = appDTO;
    }
}
