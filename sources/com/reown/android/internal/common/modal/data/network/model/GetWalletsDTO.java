package com.reown.android.internal.common.modal.data.network.model;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class GetWalletsDTO {
    public final int count;
    public final List<WalletDTO> data;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.modal.data.network.model.GetWalletsDTO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetWalletsDTO copy$default(GetWalletsDTO getWalletsDTO, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getWalletsDTO.count;
        }
        if ((i2 & 2) != 0) {
            list = getWalletsDTO.data;
        }
        return getWalletsDTO.copy(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletDTO> component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetWalletsDTO copy(@Json(name = "count") int i, @Json(name = "data") @NotNull List<WalletDTO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new GetWalletsDTO(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetWalletsDTO)) {
            return false;
        }
        GetWalletsDTO getWalletsDTO = (GetWalletsDTO) obj;
        return this.count == getWalletsDTO.count && Intrinsics.EZpvd(this.data, getWalletsDTO.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletDTO> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.count) * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetWalletsDTO(count=" + this.count + ", data=" + this.data + ")";
    }

    public GetWalletsDTO(@Json(name = "count") int i, @Json(name = "data") @NotNull List<WalletDTO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.count = i;
        this.data = list;
    }
}
