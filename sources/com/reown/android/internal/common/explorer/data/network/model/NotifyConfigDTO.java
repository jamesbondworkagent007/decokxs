package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class NotifyConfigDTO {
    public final NotifyConfigDataDTO data;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NotifyConfigDTO copy$default(NotifyConfigDTO notifyConfigDTO, NotifyConfigDataDTO notifyConfigDataDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            notifyConfigDataDTO = notifyConfigDTO.data;
        }
        return notifyConfigDTO.copy(notifyConfigDataDTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotifyConfigDataDTO component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotifyConfigDTO copy(@Json(name = "data") @NotNull NotifyConfigDataDTO notifyConfigDataDTO) {
        Intrinsics.checkNotNullParameter(notifyConfigDataDTO, "");
        return new NotifyConfigDTO(notifyConfigDataDTO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotifyConfigDTO) && Intrinsics.EZpvd(this.data, ((NotifyConfigDTO) obj).data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotifyConfigDataDTO getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotifyConfigDTO(data=" + this.data + ")";
    }

    public NotifyConfigDTO(@Json(name = "data") @NotNull NotifyConfigDataDTO notifyConfigDataDTO) {
        Intrinsics.checkNotNullParameter(notifyConfigDataDTO, "");
        this.data = notifyConfigDataDTO;
    }
}
