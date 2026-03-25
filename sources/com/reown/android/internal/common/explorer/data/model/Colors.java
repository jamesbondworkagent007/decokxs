package com.reown.android.internal.common.explorer.data.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class Colors {
    public final String primary;
    public final String secondary;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Colors copy$default(Colors colors, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = colors.primary;
        }
        if ((i & 2) != 0) {
            str2 = colors.secondary;
        }
        return colors.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.secondary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Colors copy(String str, String str2) {
        return new Colors(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Colors)) {
            return false;
        }
        Colors colors = (Colors) obj;
        return Intrinsics.EZpvd((Object) this.primary, (Object) colors.primary) && Intrinsics.EZpvd((Object) this.secondary, (Object) colors.secondary);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrimary() {
        return this.primary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondary() {
        return this.secondary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.primary;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.secondary;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Colors(primary=" + this.primary + ", secondary=" + this.secondary + ")";
    }

    public Colors(String str, String str2) {
        this.primary = str;
        this.secondary = str2;
    }
}
