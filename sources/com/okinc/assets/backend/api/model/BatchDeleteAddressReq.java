package com.okinc.assets.backend.api.model;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class BatchDeleteAddressReq {
    public static final int $stable = 8;
    private final long[] addressIds;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BatchDeleteAddressReq copy$default(BatchDeleteAddressReq batchDeleteAddressReq, long[] jArr, int i, Object obj) {
        if ((i & 1) != 0) {
            jArr = batchDeleteAddressReq.addressIds;
        }
        return batchDeleteAddressReq.copy(jArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long[] component1() {
        return this.addressIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchDeleteAddressReq copy(long[] jArr) {
        return new BatchDeleteAddressReq(jArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BatchDeleteAddressReq) && Intrinsics.EZpvd(this.addressIds, ((BatchDeleteAddressReq) obj).addressIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long[] getAddressIds() {
        return this.addressIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        long[] jArr = this.addressIds;
        if (jArr == null) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchDeleteAddressReq(addressIds=" + Arrays.toString(this.addressIds) + ")";
    }

    public BatchDeleteAddressReq(long[] jArr) {
        this.addressIds = jArr;
    }
}
