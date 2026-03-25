package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TransactionOrderCacheEntity {
    public static final int $stable = 0;
    private final String key;
    private final String nextCursor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransactionOrderCacheEntity copy$default(TransactionOrderCacheEntity transactionOrderCacheEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionOrderCacheEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = transactionOrderCacheEntity.nextCursor;
        }
        return transactionOrderCacheEntity.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionOrderCacheEntity copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransactionOrderCacheEntity(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionOrderCacheEntity)) {
            return false;
        }
        TransactionOrderCacheEntity transactionOrderCacheEntity = (TransactionOrderCacheEntity) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) transactionOrderCacheEntity.key) && Intrinsics.EZpvd((Object) this.nextCursor, (Object) transactionOrderCacheEntity.nextCursor);
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
    public int hashCode() {
        return (this.key.hashCode() * 31) + this.nextCursor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionOrderCacheEntity(key=" + this.key + ", nextCursor=" + this.nextCursor + ")";
    }

    public TransactionOrderCacheEntity(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.nextCursor = str2;
    }
}
