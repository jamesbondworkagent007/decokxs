package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class MetadataDTO {
    public final ColorsDTO colors;
    public final String shortName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MetadataDTO copy$default(MetadataDTO metadataDTO, String str, ColorsDTO colorsDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metadataDTO.shortName;
        }
        if ((i & 2) != 0) {
            colorsDTO = metadataDTO.colors;
        }
        return metadataDTO.copy(str, colorsDTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.shortName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorsDTO component2() {
        return this.colors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MetadataDTO copy(@Json(name = "shortName") String str, @Json(name = "colors") @NotNull ColorsDTO colorsDTO) {
        Intrinsics.checkNotNullParameter(colorsDTO, "");
        return new MetadataDTO(str, colorsDTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataDTO)) {
            return false;
        }
        MetadataDTO metadataDTO = (MetadataDTO) obj;
        return Intrinsics.EZpvd((Object) this.shortName, (Object) metadataDTO.shortName) && Intrinsics.EZpvd(this.colors, metadataDTO.colors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorsDTO getColors() {
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
        return "MetadataDTO(shortName=" + this.shortName + ", colors=" + this.colors + ")";
    }

    public MetadataDTO(@Json(name = "shortName") String str, @Json(name = "colors") @NotNull ColorsDTO colorsDTO) {
        Intrinsics.checkNotNullParameter(colorsDTO, "");
        this.shortName = str;
        this.colors = colorsDTO;
    }
}
