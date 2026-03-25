package com.okinc.debugbox.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OssUploadResp {
    public static final int $stable = 8;
    private String imgPath = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImgPath() {
        return this.imgPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImgPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imgPath = str;
    }
}
