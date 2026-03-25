package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class NotificationTypeDTO {
    public final String description;
    public final String id;
    public final ImageUrlDTO imageUrl;
    public final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NotificationTypeDTO copy$default(NotificationTypeDTO notificationTypeDTO, String str, String str2, String str3, ImageUrlDTO imageUrlDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationTypeDTO.name;
        }
        if ((i & 2) != 0) {
            str2 = notificationTypeDTO.id;
        }
        if ((i & 4) != 0) {
            str3 = notificationTypeDTO.description;
        }
        if ((i & 8) != 0) {
            imageUrlDTO = notificationTypeDTO.imageUrl;
        }
        return notificationTypeDTO.copy(str, str2, str3, imageUrlDTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUrlDTO component4() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationTypeDTO copy(@Json(name = "name") @NotNull String str, @Json(name = "id") @NotNull String str2, @Json(name = "description") @NotNull String str3, @Json(name = "imageUrls") ImageUrlDTO imageUrlDTO) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new NotificationTypeDTO(str, str2, str3, imageUrlDTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationTypeDTO)) {
            return false;
        }
        NotificationTypeDTO notificationTypeDTO = (NotificationTypeDTO) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) notificationTypeDTO.name) && Intrinsics.EZpvd((Object) this.id, (Object) notificationTypeDTO.id) && Intrinsics.EZpvd((Object) this.description, (Object) notificationTypeDTO.description) && Intrinsics.EZpvd(this.imageUrl, notificationTypeDTO.imageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
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
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = this.description.hashCode();
        ImageUrlDTO imageUrlDTO = this.imageUrl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (imageUrlDTO == null ? 0 : imageUrlDTO.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationTypeDTO(name=" + this.name + ", id=" + this.id + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ")";
    }

    public NotificationTypeDTO(@Json(name = "name") @NotNull String str, @Json(name = "id") @NotNull String str2, @Json(name = "description") @NotNull String str3, @Json(name = "imageUrls") ImageUrlDTO imageUrlDTO) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.id = str2;
        this.description = str3;
        this.imageUrl = imageUrlDTO;
    }
}
