package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KeystoneSignResult {
    private final String rawData;
    private final String requestId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KeystoneSignResult copy$default(KeystoneSignResult keystoneSignResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keystoneSignResult.requestId;
        }
        if ((i & 2) != 0) {
            str2 = keystoneSignResult.rawData;
        }
        return keystoneSignResult.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rawData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneSignResult copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new KeystoneSignResult(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeystoneSignResult)) {
            return false;
        }
        KeystoneSignResult keystoneSignResult = (KeystoneSignResult) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) keystoneSignResult.requestId) && Intrinsics.EZpvd((Object) this.rawData, (Object) keystoneSignResult.rawData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawData() {
        return this.rawData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.requestId.hashCode() * 31) + this.rawData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KeystoneSignResult(requestId=" + this.requestId + ", rawData=" + this.rawData + ')';
    }

    public KeystoneSignResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.requestId = str;
        this.rawData = str2;
    }
}
