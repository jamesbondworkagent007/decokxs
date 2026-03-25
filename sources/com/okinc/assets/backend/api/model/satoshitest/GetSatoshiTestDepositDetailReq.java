package com.okinc.assets.backend.api.model.satoshitest;

/* JADX INFO: loaded from: classes22.dex */
public final class GetSatoshiTestDepositDetailReq {
    public static final int $stable = 0;
    private final int subCurrencyId;
    private final long travelRuleId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetSatoshiTestDepositDetailReq copy$default(GetSatoshiTestDepositDetailReq getSatoshiTestDepositDetailReq, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = getSatoshiTestDepositDetailReq.travelRuleId;
        }
        if ((i2 & 2) != 0) {
            i = getSatoshiTestDepositDetailReq.subCurrencyId;
        }
        return getSatoshiTestDepositDetailReq.copy(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetSatoshiTestDepositDetailReq copy(long j, int i) {
        return new GetSatoshiTestDepositDetailReq(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSatoshiTestDepositDetailReq)) {
            return false;
        }
        GetSatoshiTestDepositDetailReq getSatoshiTestDepositDetailReq = (GetSatoshiTestDepositDetailReq) obj;
        return this.travelRuleId == getSatoshiTestDepositDetailReq.travelRuleId && this.subCurrencyId == getSatoshiTestDepositDetailReq.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.travelRuleId) * 31) + Integer.hashCode(this.subCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetSatoshiTestDepositDetailReq(travelRuleId=" + this.travelRuleId + ", subCurrencyId=" + this.subCurrencyId + ")";
    }

    public GetSatoshiTestDepositDetailReq(long j, int i) {
        this.travelRuleId = j;
        this.subCurrencyId = i;
    }
}
