package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TransactionOrderForTokenCacheEntity {
    public static final int $stable = 0;
    private final String chainIndex;
    private final String key;
    private final String nextCursor;
    private final String tokenCoinTypeNo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransactionOrderForTokenCacheEntity copy$default(TransactionOrderForTokenCacheEntity transactionOrderForTokenCacheEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionOrderForTokenCacheEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = transactionOrderForTokenCacheEntity.chainIndex;
        }
        if ((i & 4) != 0) {
            str3 = transactionOrderForTokenCacheEntity.tokenCoinTypeNo;
        }
        if ((i & 8) != 0) {
            str4 = transactionOrderForTokenCacheEntity.nextCursor;
        }
        return transactionOrderForTokenCacheEntity.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionOrderForTokenCacheEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TransactionOrderForTokenCacheEntity(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionOrderForTokenCacheEntity)) {
            return false;
        }
        TransactionOrderForTokenCacheEntity transactionOrderForTokenCacheEntity = (TransactionOrderForTokenCacheEntity) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) transactionOrderForTokenCacheEntity.key) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) transactionOrderForTokenCacheEntity.chainIndex) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) transactionOrderForTokenCacheEntity.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.nextCursor, (Object) transactionOrderForTokenCacheEntity.nextCursor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.key.hashCode() * 31) + this.chainIndex.hashCode()) * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + this.nextCursor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionOrderForTokenCacheEntity(key=" + this.key + ", chainIndex=" + this.chainIndex + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", nextCursor=" + this.nextCursor + ")";
    }

    public TransactionOrderForTokenCacheEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.key = str;
        this.chainIndex = str2;
        this.tokenCoinTypeNo = str3;
        this.nextCursor = str4;
    }
}
