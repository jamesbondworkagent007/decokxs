package com.okinc.assets.backend.api.model.tax.receivedasset;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class UpdateCostBasisTransactionDetailsResponse {
    public static final int $stable = 0;
    private final Integer needReviewCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdateCostBasisTransactionDetailsResponse copy$default(UpdateCostBasisTransactionDetailsResponse updateCostBasisTransactionDetailsResponse, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = updateCostBasisTransactionDetailsResponse.needReviewCount;
        }
        return updateCostBasisTransactionDetailsResponse.copy(num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.needReviewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateCostBasisTransactionDetailsResponse copy(Integer num) {
        return new UpdateCostBasisTransactionDetailsResponse(num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCostBasisTransactionDetailsResponse) && Intrinsics.EZpvd(this.needReviewCount, ((UpdateCostBasisTransactionDetailsResponse) obj).needReviewCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNeedReviewCount() {
        return this.needReviewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.needReviewCount;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateCostBasisTransactionDetailsResponse(needReviewCount=" + this.needReviewCount + ")";
    }

    public UpdateCostBasisTransactionDetailsResponse(Integer num) {
        this.needReviewCount = num;
    }
}
