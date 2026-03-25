package com.reown.android.sdk.storage.data.dao;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class GetMetadataByTopicAndType {
    public final String app_link;
    public final String description;
    public final List<String> icons;
    public final Boolean link_mode;
    public final String name;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String f96native;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.reown.android.sdk.storage.data.dao.GetMetadataByTopicAndType */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetMetadataByTopicAndType copy$default(GetMetadataByTopicAndType getMetadataByTopicAndType, String str, String str2, String str3, List list, String str4, String str5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getMetadataByTopicAndType.name;
        }
        if ((i & 2) != 0) {
            str2 = getMetadataByTopicAndType.description;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = getMetadataByTopicAndType.url;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            list = getMetadataByTopicAndType.icons;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str4 = getMetadataByTopicAndType.f96native;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = getMetadataByTopicAndType.app_link;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            bool = getMetadataByTopicAndType.link_mode;
        }
        return getMetadataByTopicAndType.copy(str, str6, str7, list2, str8, str9, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.f96native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.app_link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.link_mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetMetadataByTopicAndType copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, String str4, String str5, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new GetMetadataByTopicAndType(str, str2, str3, list, str4, str5, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMetadataByTopicAndType)) {
            return false;
        }
        GetMetadataByTopicAndType getMetadataByTopicAndType = (GetMetadataByTopicAndType) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) getMetadataByTopicAndType.name) && Intrinsics.EZpvd((Object) this.description, (Object) getMetadataByTopicAndType.description) && Intrinsics.EZpvd((Object) this.url, (Object) getMetadataByTopicAndType.url) && Intrinsics.EZpvd(this.icons, getMetadataByTopicAndType.icons) && Intrinsics.EZpvd((Object) this.f96native, (Object) getMetadataByTopicAndType.f96native) && Intrinsics.EZpvd((Object) this.app_link, (Object) getMetadataByTopicAndType.app_link) && Intrinsics.EZpvd(this.link_mode, getMetadataByTopicAndType.link_mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApp_link() {
        return this.app_link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIcons() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getLink_mode() {
        return this.link_mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNative() {
        return this.f96native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.description.hashCode();
        int iHashCode3 = this.url.hashCode();
        int iHashCode4 = this.icons.hashCode();
        String str = this.f96native;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.app_link;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.link_mode;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetMetadataByTopicAndType(name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", native=" + this.f96native + ", app_link=" + this.app_link + ", link_mode=" + this.link_mode + ")";
    }

    public GetMetadataByTopicAndType(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, String str4, String str5, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.icons = list;
        this.f96native = str4;
        this.app_link = str5;
        this.link_mode = bool;
    }
}
