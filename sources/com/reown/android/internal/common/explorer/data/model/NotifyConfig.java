package com.reown.android.internal.common.explorer.data.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class NotifyConfig {
    public final String dappUrl;
    public final String description;
    public final String homepage;
    public final ImageUrl imageUrl;
    public final boolean isVerified;
    public final String name;
    public final List<NotificationType> types;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.reown.android.internal.common.explorer.data.model.NotifyConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotifyConfig copy$default(NotifyConfig notifyConfig, String str, String str2, String str3, String str4, List list, ImageUrl imageUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notifyConfig.dappUrl;
        }
        if ((i & 2) != 0) {
            str2 = notifyConfig.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = notifyConfig.homepage;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = notifyConfig.description;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = notifyConfig.types;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            imageUrl = notifyConfig.imageUrl;
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 64) != 0) {
            z = notifyConfig.isVerified;
        }
        return notifyConfig.copy(str, str5, str6, str7, list2, imageUrl2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dappUrl;
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
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationType> component5() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUrl component6() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotifyConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<NotificationType> list, ImageUrl imageUrl, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new NotifyConfig(str, str2, str3, str4, list, imageUrl, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyConfig)) {
            return false;
        }
        NotifyConfig notifyConfig = (NotifyConfig) obj;
        return Intrinsics.EZpvd((Object) this.dappUrl, (Object) notifyConfig.dappUrl) && Intrinsics.EZpvd((Object) this.name, (Object) notifyConfig.name) && Intrinsics.EZpvd((Object) this.homepage, (Object) notifyConfig.homepage) && Intrinsics.EZpvd((Object) this.description, (Object) notifyConfig.description) && Intrinsics.EZpvd(this.types, notifyConfig.types) && Intrinsics.EZpvd(this.imageUrl, notifyConfig.imageUrl) && this.isVerified == notifyConfig.isVerified;
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
    public final ImageUrl getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationType> getTypes() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.dappUrl.hashCode();
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.homepage.hashCode();
        int iHashCode4 = this.description.hashCode();
        int iHashCode5 = this.types.hashCode();
        ImageUrl imageUrl = this.imageUrl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31) + Boolean.hashCode(this.isVerified);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVerified() {
        return this.isVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotifyConfig(dappUrl=" + this.dappUrl + ", name=" + this.name + ", homepage=" + this.homepage + ", description=" + this.description + ", types=" + this.types + ", imageUrl=" + this.imageUrl + ", isVerified=" + this.isVerified + ")";
    }

    public NotifyConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<NotificationType> list, ImageUrl imageUrl, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.dappUrl = str;
        this.name = str2;
        this.homepage = str3;
        this.description = str4;
        this.types = list;
        this.imageUrl = imageUrl;
        this.isVerified = z;
    }
}
