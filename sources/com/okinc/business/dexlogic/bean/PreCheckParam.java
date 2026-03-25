package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class PreCheckParam {
    public static final int $stable = 0;
    private final String chainId;
    private final String userWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component2() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreCheckParam copy$default(PreCheckParam preCheckParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preCheckParam.chainId;
        }
        if ((i & 2) != 0) {
            str2 = preCheckParam.userWalletAddress;
        }
        return preCheckParam.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckParam copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PreCheckParam(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCheckParam)) {
            return false;
        }
        PreCheckParam preCheckParam = (PreCheckParam) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) preCheckParam.chainId) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) preCheckParam.userWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chainId.hashCode() * 31) + this.userWalletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreCheckParam(chainId=" + this.chainId + ", userWalletAddress=" + this.userWalletAddress + ")";
    }

    public PreCheckParam(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = str;
        this.userWalletAddress = str2;
    }
}
