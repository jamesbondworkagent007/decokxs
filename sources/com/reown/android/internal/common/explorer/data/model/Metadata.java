package com.reown.android.internal.common.explorer.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class Metadata {
    public final Colors colors;
    public final String shortName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, Colors colors, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metadata.shortName;
        }
        if ((i & 2) != 0) {
            colors = metadata.colors;
        }
        return metadata.copy(str, colors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.shortName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Colors component2() {
        return this.colors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Metadata copy(String str, @NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "");
        return new Metadata(str, colors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Intrinsics.EZpvd((Object) this.shortName, (Object) metadata.shortName) && Intrinsics.EZpvd(this.colors, metadata.colors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Colors getColors() {
        return this.colors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortName() {
        return this.shortName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.shortName;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.colors.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Metadata(shortName=" + this.shortName + ", colors=" + this.colors + ")";
    }

    public Metadata(String str, @NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "");
        this.shortName = str;
        this.colors = colors;
    }
}
