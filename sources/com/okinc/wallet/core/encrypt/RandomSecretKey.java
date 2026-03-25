package com.okinc.wallet.core.encrypt;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RandomSecretKey {
    public static final int $stable = 0;
    private final String key;
    private final String keyEncrypt;
    private final String keyHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RandomSecretKey copy$default(RandomSecretKey randomSecretKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = randomSecretKey.key;
        }
        if ((i & 2) != 0) {
            str2 = randomSecretKey.keyHash;
        }
        if ((i & 4) != 0) {
            str3 = randomSecretKey.keyEncrypt;
        }
        return randomSecretKey.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.keyHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.keyEncrypt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RandomSecretKey copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RandomSecretKey(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RandomSecretKey)) {
            return false;
        }
        RandomSecretKey randomSecretKey = (RandomSecretKey) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) randomSecretKey.key) && Intrinsics.EZpvd((Object) this.keyHash, (Object) randomSecretKey.keyHash) && Intrinsics.EZpvd((Object) this.keyEncrypt, (Object) randomSecretKey.keyEncrypt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeyEncrypt() {
        return this.keyEncrypt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeyHash() {
        return this.keyHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.keyHash.hashCode()) * 31) + this.keyEncrypt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RandomSecretKey(key=" + this.key + ", keyHash=" + this.keyHash + ", keyEncrypt=" + this.keyEncrypt + ")";
    }

    public RandomSecretKey(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.key = str;
        this.keyHash = str2;
        this.keyEncrypt = str3;
    }
}
