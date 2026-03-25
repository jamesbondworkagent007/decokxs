package com.okinc.ok_kyc_core.data.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LivenessSessionInfoLcaEncryptionData {
    public static final int $stable = 8;
    private String pubKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LivenessSessionInfoLcaEncryptionData copy$default(LivenessSessionInfoLcaEncryptionData livenessSessionInfoLcaEncryptionData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livenessSessionInfoLcaEncryptionData.pubKey;
        }
        return livenessSessionInfoLcaEncryptionData.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessSessionInfoLcaEncryptionData copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LivenessSessionInfoLcaEncryptionData(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LivenessSessionInfoLcaEncryptionData) && Intrinsics.EZpvd((Object) this.pubKey, (Object) ((LivenessSessionInfoLcaEncryptionData) obj).pubKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.pubKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPubKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessSessionInfoLcaEncryptionData(pubKey=" + this.pubKey + ")";
    }

    public LivenessSessionInfoLcaEncryptionData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pubKey = str;
    }
}
