package com.reown.android.internal.common.modal.data.network.model;

import com.squareup.moshi.Json;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class WalletDataDTO {
    public final String appId;
    public final String id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    public WalletDataDTO(@Json(name = "id") @NotNull String str, @Json(name = "android_app_id") String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.appId = str2;
    }
}
