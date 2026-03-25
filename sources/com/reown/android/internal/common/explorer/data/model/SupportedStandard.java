package com.reown.android.internal.common.explorer.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SupportedStandard {
    public final String id;
    public final int standardId;
    public final String standardPrefix;
    public final String title;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportedStandard copy$default(SupportedStandard supportedStandard, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = supportedStandard.id;
        }
        if ((i2 & 2) != 0) {
            str2 = supportedStandard.url;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = supportedStandard.title;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = supportedStandard.standardId;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = supportedStandard.standardPrefix;
        }
        return supportedStandard.copy(str, str5, str6, i3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.standardId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.standardPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportedStandard copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SupportedStandard(str, str2, str3, i, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportedStandard)) {
            return false;
        }
        SupportedStandard supportedStandard = (SupportedStandard) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) supportedStandard.id) && Intrinsics.EZpvd((Object) this.url, (Object) supportedStandard.url) && Intrinsics.EZpvd((Object) this.title, (Object) supportedStandard.title) && this.standardId == supportedStandard.standardId && Intrinsics.EZpvd((Object) this.standardPrefix, (Object) supportedStandard.standardPrefix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStandardId() {
        return this.standardId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStandardPrefix() {
        return this.standardPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.url.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.standardId)) * 31) + this.standardPrefix.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportedStandard(id=" + this.id + ", url=" + this.url + ", title=" + this.title + ", standardId=" + this.standardId + ", standardPrefix=" + this.standardPrefix + ")";
    }

    public SupportedStandard(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.url = str2;
        this.title = str3;
        this.standardId = i;
        this.standardPrefix = str4;
    }
}
