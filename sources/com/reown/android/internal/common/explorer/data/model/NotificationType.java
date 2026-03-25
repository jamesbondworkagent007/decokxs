package com.reown.android.internal.common.explorer.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class NotificationType {
    public final String description;
    public final String id;
    public final ImageUrl imageUrl;
    public final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NotificationType copy$default(NotificationType notificationType, String str, String str2, String str3, ImageUrl imageUrl, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationType.name;
        }
        if ((i & 2) != 0) {
            str2 = notificationType.id;
        }
        if ((i & 4) != 0) {
            str3 = notificationType.description;
        }
        if ((i & 8) != 0) {
            imageUrl = notificationType.imageUrl;
        }
        return notificationType.copy(str, str2, str3, imageUrl);
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
    public final ImageUrl component4() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationType copy(@NotNull String str, @NotNull String str2, @NotNull String str3, ImageUrl imageUrl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new NotificationType(str, str2, str3, imageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationType)) {
            return false;
        }
        NotificationType notificationType = (NotificationType) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) notificationType.name) && Intrinsics.EZpvd((Object) this.id, (Object) notificationType.id) && Intrinsics.EZpvd((Object) this.description, (Object) notificationType.description) && Intrinsics.EZpvd(this.imageUrl, notificationType.imageUrl);
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
    public final ImageUrl getImageUrl() {
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
        ImageUrl imageUrl = this.imageUrl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (imageUrl == null ? 0 : imageUrl.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationType(name=" + this.name + ", id=" + this.id + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ")";
    }

    public NotificationType(@NotNull String str, @NotNull String str2, @NotNull String str3, ImageUrl imageUrl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.id = str2;
        this.description = str3;
        this.imageUrl = imageUrl;
    }
}
