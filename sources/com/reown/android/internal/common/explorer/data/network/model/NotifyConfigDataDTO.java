package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class NotifyConfigDataDTO {
    public final String dappUrl;
    public final String description;
    public final String homepage;
    public final ImageUrlDTO imageUrl;
    public final boolean isVerified;
    public final String name;
    public final List<NotificationTypeDTO> notificationTypes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.reown.android.internal.common.explorer.data.network.model.NotifyConfigDataDTO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotifyConfigDataDTO copy$default(NotifyConfigDataDTO notifyConfigDataDTO, String str, String str2, String str3, String str4, ImageUrlDTO imageUrlDTO, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notifyConfigDataDTO.name;
        }
        if ((i & 2) != 0) {
            str2 = notifyConfigDataDTO.homepage;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = notifyConfigDataDTO.description;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = notifyConfigDataDTO.dappUrl;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            imageUrlDTO = notifyConfigDataDTO.imageUrl;
        }
        ImageUrlDTO imageUrlDTO2 = imageUrlDTO;
        if ((i & 32) != 0) {
            list = notifyConfigDataDTO.notificationTypes;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            z = notifyConfigDataDTO.isVerified;
        }
        return notifyConfigDataDTO.copy(str, str5, str6, str7, imageUrlDTO2, list2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.homepage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dappUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUrlDTO component5() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationTypeDTO> component6() {
        return this.notificationTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotifyConfigDataDTO copy(@Json(name = "name") @NotNull String str, @Json(name = "homepage") String str2, @Json(name = "description") @NotNull String str3, @Json(name = "dapp_url") @NotNull String str4, @Json(name = "image_url") ImageUrlDTO imageUrlDTO, @Json(name = "notificationTypes") @NotNull List<NotificationTypeDTO> list, @Json(name = "isVerified") boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new NotifyConfigDataDTO(str, str2, str3, str4, imageUrlDTO, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyConfigDataDTO)) {
            return false;
        }
        NotifyConfigDataDTO notifyConfigDataDTO = (NotifyConfigDataDTO) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) notifyConfigDataDTO.name) && Intrinsics.EZpvd((Object) this.homepage, (Object) notifyConfigDataDTO.homepage) && Intrinsics.EZpvd((Object) this.description, (Object) notifyConfigDataDTO.description) && Intrinsics.EZpvd((Object) this.dappUrl, (Object) notifyConfigDataDTO.dappUrl) && Intrinsics.EZpvd(this.imageUrl, notifyConfigDataDTO.imageUrl) && Intrinsics.EZpvd(this.notificationTypes, notifyConfigDataDTO.notificationTypes) && this.isVerified == notifyConfigDataDTO.isVerified;
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
    public final ImageUrlDTO getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationTypeDTO> getNotificationTypes() {
        return this.notificationTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        String str = this.homepage;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.description.hashCode();
        int iHashCode4 = this.dappUrl.hashCode();
        ImageUrlDTO imageUrlDTO = this.imageUrl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (imageUrlDTO != null ? imageUrlDTO.hashCode() : 0)) * 31) + this.notificationTypes.hashCode()) * 31) + Boolean.hashCode(this.isVerified);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVerified() {
        return this.isVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotifyConfigDataDTO(name=" + this.name + ", homepage=" + this.homepage + ", description=" + this.description + ", dappUrl=" + this.dappUrl + ", imageUrl=" + this.imageUrl + ", notificationTypes=" + this.notificationTypes + ", isVerified=" + this.isVerified + ")";
    }

    public NotifyConfigDataDTO(@Json(name = "name") @NotNull String str, @Json(name = "homepage") String str2, @Json(name = "description") @NotNull String str3, @Json(name = "dapp_url") @NotNull String str4, @Json(name = "image_url") ImageUrlDTO imageUrlDTO, @Json(name = "notificationTypes") @NotNull List<NotificationTypeDTO> list, @Json(name = "isVerified") boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.homepage = str2;
        this.description = str3;
        this.dappUrl = str4;
        this.imageUrl = imageUrlDTO;
        this.notificationTypes = list;
        this.isVerified = z;
    }
}
