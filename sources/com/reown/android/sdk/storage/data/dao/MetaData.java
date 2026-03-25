package com.reown.android.sdk.storage.data.dao;

import com.reown.android.internal.common.model.AppMetaDataType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.LoaderManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class MetaData {
    public final String app_link;
    public final String description;
    public final List<String> icons;
    public final long id;
    public final Boolean link_mode;
    public final String name;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String f98native;
    public final String sequence_topic;
    public final AppMetaDataType type;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.link_mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sequence_topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.f98native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaDataType component8() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.app_link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MetaData copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, String str5, @NotNull AppMetaDataType appMetaDataType, String str6, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        return new MetaData(j, str, str2, str3, str4, list, str5, appMetaDataType, str6, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaData)) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        return this.id == metaData.id && Intrinsics.EZpvd((Object) this.sequence_topic, (Object) metaData.sequence_topic) && Intrinsics.EZpvd((Object) this.name, (Object) metaData.name) && Intrinsics.EZpvd((Object) this.description, (Object) metaData.description) && Intrinsics.EZpvd((Object) this.url, (Object) metaData.url) && Intrinsics.EZpvd(this.icons, metaData.icons) && Intrinsics.EZpvd((Object) this.f98native, (Object) metaData.f98native) && this.type == metaData.type && Intrinsics.EZpvd((Object) this.app_link, (Object) metaData.app_link) && Intrinsics.EZpvd(this.link_mode, metaData.link_mode);
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
    public final long getId() {
        return this.id;
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
        return this.f98native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSequence_topic() {
        return this.sequence_topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaDataType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.sequence_topic.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.description.hashCode();
        int iHashCode5 = this.url.hashCode();
        int iHashCode6 = this.icons.hashCode();
        String str = this.f98native;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        int iHashCode8 = this.type.hashCode();
        String str2 = this.app_link;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.link_mode;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MetaData(id=" + this.id + ", sequence_topic=" + this.sequence_topic + ", name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", native=" + this.f98native + ", type=" + this.type + ", app_link=" + this.app_link + ", link_mode=" + this.link_mode + ")";
    }

    public MetaData(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, String str5, @NotNull AppMetaDataType appMetaDataType, String str6, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(appMetaDataType, "");
        this.id = j;
        this.sequence_topic = str;
        this.name = str2;
        this.description = str3;
        this.url = str4;
        this.icons = list;
        this.f98native = str5;
        this.type = appMetaDataType;
        this.app_link = str6;
        this.link_mode = bool;
    }

    public static final class Adapter {
        public final LoaderManager<List<String>, String> iconsAdapter;
        public final LoaderManager<AppMetaDataType, String> typeAdapter;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<List<String>, String> getIconsAdapter() {
            return this.iconsAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager<AppMetaDataType, String> getTypeAdapter() {
            return this.typeAdapter;
        }

        public Adapter(@NotNull LoaderManager<List<String>, String> loaderManager, @NotNull LoaderManager<AppMetaDataType, String> loaderManager2) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            Intrinsics.checkNotNullParameter(loaderManager2, "");
            this.iconsAdapter = loaderManager;
            this.typeAdapter = loaderManager2;
        }
    }
}
