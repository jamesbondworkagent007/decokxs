package com.reown.android.internal.common.explorer.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ImageUrl {
    public final String lg;
    public final String md;
    public final String sm;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ImageUrl copy$default(ImageUrl imageUrl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageUrl.sm;
        }
        if ((i & 2) != 0) {
            str2 = imageUrl.md;
        }
        if ((i & 4) != 0) {
            str3 = imageUrl.lg;
        }
        return imageUrl.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.md;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageUrl copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ImageUrl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrl)) {
            return false;
        }
        ImageUrl imageUrl = (ImageUrl) obj;
        return Intrinsics.EZpvd((Object) this.sm, (Object) imageUrl.sm) && Intrinsics.EZpvd((Object) this.md, (Object) imageUrl.md) && Intrinsics.EZpvd((Object) this.lg, (Object) imageUrl.lg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLg() {
        return this.lg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMd() {
        return this.md;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSm() {
        return this.sm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.sm.hashCode() * 31) + this.md.hashCode()) * 31) + this.lg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageUrl(sm=" + this.sm + ", md=" + this.md + ", lg=" + this.lg + ")";
    }

    public ImageUrl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.sm = str;
        this.md = str2;
        this.lg = str3;
    }
}
