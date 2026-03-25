package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class CedefiToken {
    public static final int $stable = 0;

    @SerializedName("chainId")
    private final String chainId;

    @SerializedName("contractAddress")
    private final String contractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CedefiToken copy$default(CedefiToken cedefiToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cedefiToken.chainId;
        }
        if ((i & 2) != 0) {
            str2 = cedefiToken.contractAddress;
        }
        return cedefiToken.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiToken copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CedefiToken(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CedefiToken)) {
            return false;
        }
        CedefiToken cedefiToken = (CedefiToken) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) cedefiToken.chainId) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) cedefiToken.contractAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chainId.hashCode() * 31) + this.contractAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CedefiToken(chainId=" + this.chainId + ", contractAddress=" + this.contractAddress + ")";
    }

    public CedefiToken(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = str;
        this.contractAddress = str2;
    }
}
