package com.okinc.assets.backend.api.model.tax.receivedasset;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ApplyCostBasisEstimatesResponse {
    public static final int $stable = 0;
    private final Integer appliedCount;
    private final Integer needReviewCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ApplyCostBasisEstimatesResponse copy$default(ApplyCostBasisEstimatesResponse applyCostBasisEstimatesResponse, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = applyCostBasisEstimatesResponse.appliedCount;
        }
        if ((i & 2) != 0) {
            num2 = applyCostBasisEstimatesResponse.needReviewCount;
        }
        return applyCostBasisEstimatesResponse.copy(num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.appliedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.needReviewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApplyCostBasisEstimatesResponse copy(Integer num, Integer num2) {
        return new ApplyCostBasisEstimatesResponse(num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyCostBasisEstimatesResponse)) {
            return false;
        }
        ApplyCostBasisEstimatesResponse applyCostBasisEstimatesResponse = (ApplyCostBasisEstimatesResponse) obj;
        return Intrinsics.EZpvd(this.appliedCount, applyCostBasisEstimatesResponse.appliedCount) && Intrinsics.EZpvd(this.needReviewCount, applyCostBasisEstimatesResponse.needReviewCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAppliedCount() {
        return this.appliedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNeedReviewCount() {
        return this.needReviewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.appliedCount;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.needReviewCount;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApplyCostBasisEstimatesResponse(appliedCount=" + this.appliedCount + ", needReviewCount=" + this.needReviewCount + ")";
    }

    public ApplyCostBasisEstimatesResponse(Integer num, Integer num2) {
        this.appliedCount = num;
        this.needReviewCount = num2;
    }
}
