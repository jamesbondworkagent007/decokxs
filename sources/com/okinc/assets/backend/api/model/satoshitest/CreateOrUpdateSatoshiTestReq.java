package com.okinc.assets.backend.api.model.satoshitest;

/* JADX INFO: loaded from: classes22.dex */
public final class CreateOrUpdateSatoshiTestReq {
    public static final int $stable = 0;
    private final long travelRuleId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateOrUpdateSatoshiTestReq copy$default(CreateOrUpdateSatoshiTestReq createOrUpdateSatoshiTestReq, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = createOrUpdateSatoshiTestReq.travelRuleId;
        }
        return createOrUpdateSatoshiTestReq.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateOrUpdateSatoshiTestReq copy(long j) {
        return new CreateOrUpdateSatoshiTestReq(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrUpdateSatoshiTestReq) && this.travelRuleId == ((CreateOrUpdateSatoshiTestReq) obj).travelRuleId;
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
        return "CreateOrUpdateSatoshiTestReq(travelRuleId=" + this.travelRuleId + ")";
    }

    public CreateOrUpdateSatoshiTestReq(long j) {
        this.travelRuleId = j;
    }
}
