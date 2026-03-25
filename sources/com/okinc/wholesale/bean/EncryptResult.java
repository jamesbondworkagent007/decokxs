package com.okinc.wholesale.bean;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class EncryptResult {
    public static final int $stable = 8;
    private final byte[] encryptedData;
    private final String seed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EncryptResult copy$default(EncryptResult encryptResult, byte[] bArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = encryptResult.encryptedData;
        }
        if ((i & 2) != 0) {
            str = encryptResult.seed;
        }
        return encryptResult.copy(bArr, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] component1() {
        return this.encryptedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.seed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EncryptResult copy(@NotNull byte[] bArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new EncryptResult(bArr, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] getEncryptedData() {
        return this.encryptedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeed() {
        return this.seed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EncryptResult(encryptedData=" + Arrays.toString(this.encryptedData) + ", seed=" + this.seed + ")";
    }

    public EncryptResult(@NotNull byte[] bArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.encryptedData = bArr;
        this.seed = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(EncryptResult.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        EncryptResult encryptResult = (EncryptResult) obj;
        return Arrays.equals(this.encryptedData, encryptResult.encryptedData) && Intrinsics.EZpvd((Object) this.seed, (Object) encryptResult.seed);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.encryptedData) * 31) + this.seed.hashCode();
    }
}
