package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RecordingCedefiToken {
    public static final int $stable = 0;

    @SerializedName("chainId")
    private final String chainId;

    @SerializedName("contractAddress")
    private final String contractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecordingCedefiToken copy$default(RecordingCedefiToken recordingCedefiToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordingCedefiToken.chainId;
        }
        if ((i & 2) != 0) {
            str2 = recordingCedefiToken.contractAddress;
        }
        return recordingCedefiToken.copy(str, str2);
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
    public final RecordingCedefiToken copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RecordingCedefiToken(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordingCedefiToken)) {
            return false;
        }
        RecordingCedefiToken recordingCedefiToken = (RecordingCedefiToken) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) recordingCedefiToken.chainId) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) recordingCedefiToken.contractAddress);
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
        return "RecordingCedefiToken(chainId=" + this.chainId + ", contractAddress=" + this.contractAddress + ")";
    }

    public RecordingCedefiToken(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = str;
        this.contractAddress = str2;
    }
}
