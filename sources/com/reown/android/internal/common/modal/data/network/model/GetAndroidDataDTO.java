package com.reown.android.internal.common.modal.data.network.model;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class GetAndroidDataDTO {
    public final int count;
    public final List<WalletDataDTO> data;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletDataDTO> getData() {
        return this.data;
    }

    public GetAndroidDataDTO(@Json(name = "count") int i, @Json(name = "data") @NotNull List<WalletDataDTO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.count = i;
        this.data = list;
    }
}
