package com.reown.android.internal.common.explorer.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class Project {
    public final String dappUrl;
    public final String description;
    public final String homepage;
    public final String id;
    public final String imageId;
    public final ImageUrl imageUrl;
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
    public final ImageUrl component6() {
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
    public final Project copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ImageUrl imageUrl, @NotNull String str6, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(imageUrl, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new Project(str, str2, str3, str4, str5, imageUrl, str6, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Project)) {
            return false;
        }
        Project project = (Project) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) project.id) && Intrinsics.EZpvd((Object) this.name, (Object) project.name) && Intrinsics.EZpvd((Object) this.homepage, (Object) project.homepage) && Intrinsics.EZpvd((Object) this.imageId, (Object) project.imageId) && Intrinsics.EZpvd((Object) this.description, (Object) project.description) && Intrinsics.EZpvd(this.imageUrl, project.imageUrl) && Intrinsics.EZpvd((Object) this.dappUrl, (Object) project.dappUrl) && Intrinsics.EZpvd(this.order, project.order);
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
    public final ImageUrl getImageUrl() {
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
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.homepage.hashCode();
        int iHashCode4 = this.imageId.hashCode();
        int iHashCode5 = this.description.hashCode();
        int iHashCode6 = this.imageUrl.hashCode();
        int iHashCode7 = this.dappUrl.hashCode();
        Long l = this.order;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Project(id=" + this.id + ", name=" + this.name + ", homepage=" + this.homepage + ", imageId=" + this.imageId + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", dappUrl=" + this.dappUrl + ", order=" + this.order + ")";
    }

    public Project(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ImageUrl imageUrl, @NotNull String str6, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(imageUrl, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = str;
        this.name = str2;
        this.homepage = str3;
        this.imageId = str4;
        this.description = str5;
        this.imageUrl = imageUrl;
        this.dappUrl = str6;
        this.order = l;
    }
}
