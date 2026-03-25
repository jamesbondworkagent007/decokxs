package com.reown.android.sdk.storage.data.dao;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyPublicKey {
    public final long expires_at;
    public final String key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyPublicKey copy$default(VerifyPublicKey verifyPublicKey, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyPublicKey.key;
        }
        if ((i & 2) != 0) {
            j = verifyPublicKey.expires_at;
        }
        return verifyPublicKey.copy(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.expires_at;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyPublicKey copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new VerifyPublicKey(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPublicKey)) {
            return false;
        }
        VerifyPublicKey verifyPublicKey = (VerifyPublicKey) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) verifyPublicKey.key) && this.expires_at == verifyPublicKey.expires_at;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpires_at() {
        return this.expires_at;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.key.hashCode() * 31) + Long.hashCode(this.expires_at);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyPublicKey(key=" + this.key + ", expires_at=" + this.expires_at + ")";
    }

    public VerifyPublicKey(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
        this.expires_at = j;
    }
}
