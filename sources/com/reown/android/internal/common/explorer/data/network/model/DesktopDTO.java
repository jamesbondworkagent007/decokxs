package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class DesktopDTO {

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final String f91native;
    public final String universal;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DesktopDTO copy$default(DesktopDTO desktopDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = desktopDTO.f91native;
        }
        if ((i & 2) != 0) {
            str2 = desktopDTO.universal;
        }
        return desktopDTO.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.f91native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DesktopDTO copy(@Json(name = "native") @NotNull String str, @Json(name = "universal") String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DesktopDTO(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DesktopDTO)) {
            return false;
        }
        DesktopDTO desktopDTO = (DesktopDTO) obj;
        return Intrinsics.EZpvd((Object) this.f91native, (Object) desktopDTO.f91native) && Intrinsics.EZpvd((Object) this.universal, (Object) desktopDTO.universal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNative() {
        return this.f91native;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniversal() {
        return this.universal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.f91native.hashCode();
        String str = this.universal;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DesktopDTO(native=" + this.f91native + ", universal=" + this.universal + ")";
    }

    public DesktopDTO(@Json(name = "native") @NotNull String str, @Json(name = "universal") String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f91native = str;
        this.universal = str2;
    }
}
