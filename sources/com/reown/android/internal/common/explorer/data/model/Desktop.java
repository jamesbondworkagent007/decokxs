package com.reown.android.internal.common.explorer.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class Desktop {

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String f89native;
    public final String universal;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Desktop copy$default(Desktop desktop, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = desktop.f89native;
        }
        if ((i & 2) != 0) {
            str2 = desktop.universal;
        }
        return desktop.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.f89native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Desktop copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Desktop(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Desktop)) {
            return false;
        }
        Desktop desktop = (Desktop) obj;
        return Intrinsics.EZpvd((Object) this.f89native, (Object) desktop.f89native) && Intrinsics.EZpvd((Object) this.universal, (Object) desktop.universal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNative() {
        return this.f89native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniversal() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.f89native.hashCode();
        String str = this.universal;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Desktop(native=" + this.f89native + ", universal=" + this.universal + ")";
    }

    public Desktop(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f89native = str;
        this.universal = str2;
    }
}
