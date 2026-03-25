package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class ColorsDTO {
    public final String primary;
    public final String secondary;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ColorsDTO copy$default(ColorsDTO colorsDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = colorsDTO.primary;
        }
        if ((i & 2) != 0) {
            str2 = colorsDTO.secondary;
        }
        return colorsDTO.copy(str, str2);
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
    public final ColorsDTO copy(@Json(name = "primary") String str, @Json(name = "secondary") String str2) {
        return new ColorsDTO(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorsDTO)) {
            return false;
        }
        ColorsDTO colorsDTO = (ColorsDTO) obj;
        return Intrinsics.EZpvd((Object) this.primary, (Object) colorsDTO.primary) && Intrinsics.EZpvd((Object) this.secondary, (Object) colorsDTO.secondary);
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
        return "ColorsDTO(primary=" + this.primary + ", secondary=" + this.secondary + ")";
    }

    public ColorsDTO(@Json(name = "primary") String str, @Json(name = "secondary") String str2) {
        this.primary = str;
        this.secondary = str2;
    }
}
