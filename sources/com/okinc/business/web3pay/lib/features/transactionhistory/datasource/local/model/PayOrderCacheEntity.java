package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.local.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PayOrderCacheEntity {
    public static final int $stable = 0;
    private final String key;
    private final String nextCursor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PayOrderCacheEntity copy$default(PayOrderCacheEntity payOrderCacheEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payOrderCacheEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = payOrderCacheEntity.nextCursor;
        }
        return payOrderCacheEntity.copy(str, str2);
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
    public final PayOrderCacheEntity copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PayOrderCacheEntity(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayOrderCacheEntity)) {
            return false;
        }
        PayOrderCacheEntity payOrderCacheEntity = (PayOrderCacheEntity) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) payOrderCacheEntity.key) && Intrinsics.EZpvd((Object) this.nextCursor, (Object) payOrderCacheEntity.nextCursor);
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
        return "PayOrderCacheEntity(key=" + this.key + ", nextCursor=" + this.nextCursor + ")";
    }

    public PayOrderCacheEntity(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.nextCursor = str2;
    }
}
