package com.reown.android.internal.common.explorer.data.network.model;

import com.okinc.p2p.api.OtcExtraKeys;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class ProjectDTO {
    public final String dappUrl;
    public final String description;
    public final String homepage;
    public final String id;
    public final String imageId;
    public final ImageUrlDTO imageUrl;
    public final String name;
    public final Long order;

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
        return this.homepage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUrlDTO component6() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dappUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectDTO copy(@Json(name = "id") @NotNull String str, @Json(name = "name") String str2, @Json(name = "homepage") String str3, @Json(name = "image_id") String str4, @Json(name = "description") String str5, @Json(name = "image_url") ImageUrlDTO imageUrlDTO, @Json(name = "dapp_url") String str6, @Json(name = OtcExtraKeys.ORDER) Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ProjectDTO(str, str2, str3, str4, str5, imageUrlDTO, str6, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectDTO)) {
            return false;
        }
        ProjectDTO projectDTO = (ProjectDTO) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) projectDTO.id) && Intrinsics.EZpvd((Object) this.name, (Object) projectDTO.name) && Intrinsics.EZpvd((Object) this.homepage, (Object) projectDTO.homepage) && Intrinsics.EZpvd((Object) this.imageId, (Object) projectDTO.imageId) && Intrinsics.EZpvd((Object) this.description, (Object) projectDTO.description) && Intrinsics.EZpvd(this.imageUrl, projectDTO.imageUrl) && Intrinsics.EZpvd((Object) this.dappUrl, (Object) projectDTO.dappUrl) && Intrinsics.EZpvd(this.order, projectDTO.order);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDappUrl() {
        return this.dappUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
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
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOrder() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.homepage;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imageId;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.description;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        ImageUrlDTO imageUrlDTO = this.imageUrl;
        int iHashCode6 = imageUrlDTO == null ? 0 : imageUrlDTO.hashCode();
        String str5 = this.dappUrl;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        Long l = this.order;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProjectDTO(id=" + this.id + ", name=" + this.name + ", homepage=" + this.homepage + ", imageId=" + this.imageId + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", dappUrl=" + this.dappUrl + ", order=" + this.order + ")";
    }

    public ProjectDTO(@Json(name = "id") @NotNull String str, @Json(name = "name") String str2, @Json(name = "homepage") String str3, @Json(name = "image_id") String str4, @Json(name = "description") String str5, @Json(name = "image_url") ImageUrlDTO imageUrlDTO, @Json(name = "dapp_url") String str6, @Json(name = OtcExtraKeys.ORDER) Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.name = str2;
        this.homepage = str3;
        this.imageId = str4;
        this.description = str5;
        this.imageUrl = imageUrlDTO;
        this.dappUrl = str6;
        this.order = l;
    }
}
