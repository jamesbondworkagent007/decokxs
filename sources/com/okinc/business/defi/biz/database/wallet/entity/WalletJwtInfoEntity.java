package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletJwtInfoEntity {
    public static final int $stable = 0;
    private final String accountId;
    private final String encryptedJwt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletJwtInfoEntity copy$default(WalletJwtInfoEntity walletJwtInfoEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletJwtInfoEntity.accountId;
        }
        if ((i & 2) != 0) {
            str2 = walletJwtInfoEntity.encryptedJwt;
        }
        return walletJwtInfoEntity.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.encryptedJwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletJwtInfoEntity copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WalletJwtInfoEntity(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletJwtInfoEntity)) {
            return false;
        }
        WalletJwtInfoEntity walletJwtInfoEntity = (WalletJwtInfoEntity) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) walletJwtInfoEntity.accountId) && Intrinsics.EZpvd((Object) this.encryptedJwt, (Object) walletJwtInfoEntity.encryptedJwt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptedJwt() {
        return this.encryptedJwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.accountId.hashCode() * 31) + this.encryptedJwt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletJwtInfoEntity(accountId=" + this.accountId + ", encryptedJwt=" + this.encryptedJwt + ")";
    }

    public WalletJwtInfoEntity(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountId = str;
        this.encryptedJwt = str2;
    }
}
