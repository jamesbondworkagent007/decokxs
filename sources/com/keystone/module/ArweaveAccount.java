package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ArweaveAccount {
    private final String device;
    private final String keyData;
    private final String masterFingerprint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ArweaveAccount copy$default(ArweaveAccount arweaveAccount, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = arweaveAccount.masterFingerprint;
        }
        if ((i & 2) != 0) {
            str2 = arweaveAccount.keyData;
        }
        if ((i & 4) != 0) {
            str3 = arweaveAccount.device;
        }
        return arweaveAccount.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.keyData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.device;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArweaveAccount copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ArweaveAccount(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArweaveAccount)) {
            return false;
        }
        ArweaveAccount arweaveAccount = (ArweaveAccount) obj;
        return Intrinsics.EZpvd((Object) this.masterFingerprint, (Object) arweaveAccount.masterFingerprint) && Intrinsics.EZpvd((Object) this.keyData, (Object) arweaveAccount.keyData) && Intrinsics.EZpvd((Object) this.device, (Object) arweaveAccount.device);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevice() {
        return this.device;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeyData() {
        return this.keyData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterFingerprint() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.masterFingerprint.hashCode() * 31) + this.keyData.hashCode()) * 31) + this.device.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArweaveAccount(masterFingerprint=" + this.masterFingerprint + ", keyData=" + this.keyData + ", device=" + this.device + ')';
    }

    public ArweaveAccount(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.masterFingerprint = str;
        this.keyData = str2;
        this.device = str3;
    }
}
