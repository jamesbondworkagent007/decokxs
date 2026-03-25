package com.okinc.assets.backend.api.model.satoshitest;

/* JADX INFO: loaded from: classes22.dex */
public final class ConfirmSatoshiTestReq {
    public static final int $stable = 0;
    private final long travelRuleId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConfirmSatoshiTestReq copy$default(ConfirmSatoshiTestReq confirmSatoshiTestReq, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = confirmSatoshiTestReq.travelRuleId;
        }
        return confirmSatoshiTestReq.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfirmSatoshiTestReq copy(long j) {
        return new ConfirmSatoshiTestReq(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmSatoshiTestReq) && this.travelRuleId == ((ConfirmSatoshiTestReq) obj).travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.travelRuleId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConfirmSatoshiTestReq(travelRuleId=" + this.travelRuleId + ")";
    }

    public ConfirmSatoshiTestReq(long j) {
        this.travelRuleId = j;
    }
}
