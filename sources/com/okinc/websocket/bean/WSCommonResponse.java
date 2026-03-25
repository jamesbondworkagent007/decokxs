package com.okinc.websocket.bean;

import com.google.gson.JsonElement;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WSCommonResponse extends WSBaseResponse {
    public static final int $stable = 8;
    private String action = "";
    private JsonElement data;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.action = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(JsonElement jsonElement) {
        this.data = jsonElement;
    }
}
