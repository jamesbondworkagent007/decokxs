package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PendingClaimOrderCacheEntity {
    public static final int $stable = 0;
    private final String key;
    private final String nextCursor;
    private final String total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PendingClaimOrderCacheEntity copy$default(PendingClaimOrderCacheEntity pendingClaimOrderCacheEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingClaimOrderCacheEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = pendingClaimOrderCacheEntity.nextCursor;
        }
        if ((i & 4) != 0) {
            str3 = pendingClaimOrderCacheEntity.total;
        }
        return pendingClaimOrderCacheEntity.copy(str, str2, str3);
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
    public final String component3() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingClaimOrderCacheEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PendingClaimOrderCacheEntity(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingClaimOrderCacheEntity)) {
            return false;
        }
        PendingClaimOrderCacheEntity pendingClaimOrderCacheEntity = (PendingClaimOrderCacheEntity) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) pendingClaimOrderCacheEntity.key) && Intrinsics.EZpvd((Object) this.nextCursor, (Object) pendingClaimOrderCacheEntity.nextCursor) && Intrinsics.EZpvd((Object) this.total, (Object) pendingClaimOrderCacheEntity.total);
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
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.nextCursor.hashCode()) * 31) + this.total.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PendingClaimOrderCacheEntity(key=" + this.key + ", nextCursor=" + this.nextCursor + ", total=" + this.total + ")";
    }

    public PendingClaimOrderCacheEntity(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.key = str;
        this.nextCursor = str2;
        this.total = str3;
    }
}
