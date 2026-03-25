package com.okinc.business.defi.share.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class Web3ShareBaseInfo {
    public static final int $stable = 8;
    private Web3ShareFooterInfo footerInfo;
    private Web3SharePreviewInfo previewInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3ShareFooterInfo getFooterInfo() {
        return this.footerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3SharePreviewInfo getPreviewInfo() {
        return this.previewInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFooterInfo(Web3ShareFooterInfo web3ShareFooterInfo) {
        this.footerInfo = web3ShareFooterInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewInfo(Web3SharePreviewInfo web3SharePreviewInfo) {
        this.previewInfo = web3SharePreviewInfo;
    }

    public static /* synthetic */ void setupPreviewInfo$default(Web3ShareBaseInfo web3ShareBaseInfo, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupPreviewInfo");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        web3ShareBaseInfo.setupPreviewInfo(str, str2);
    }

    public final void setupPreviewInfo(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.previewInfo = new Web3SharePreviewInfo(str, str2);
    }

    public final void setupFootInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.footerInfo = Web3ShareFooterInfo.Companion.copydefault(str, str2);
    }
}
