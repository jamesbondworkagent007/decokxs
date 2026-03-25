package com.okinc.wallet.core.encrypt;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class EncryptBean {
    public static final int $stable = 0;
    private final String encryptedData;
    private final String iv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EncryptBean copy$default(EncryptBean encryptBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = encryptBean.encryptedData;
        }
        if ((i & 2) != 0) {
            str2 = encryptBean.iv;
        }
        return encryptBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.encryptedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.iv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EncryptBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EncryptBean(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptBean)) {
            return false;
        }
        EncryptBean encryptBean = (EncryptBean) obj;
        return Intrinsics.EZpvd((Object) this.encryptedData, (Object) encryptBean.encryptedData) && Intrinsics.EZpvd((Object) this.iv, (Object) encryptBean.iv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptedData() {
        return this.encryptedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIv() {
        return this.iv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.encryptedData.hashCode() * 31) + this.iv.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EncryptBean(encryptedData=" + this.encryptedData + ", iv=" + this.iv + ")";
    }

    public EncryptBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.encryptedData = str;
        this.iv = str2;
    }
}
