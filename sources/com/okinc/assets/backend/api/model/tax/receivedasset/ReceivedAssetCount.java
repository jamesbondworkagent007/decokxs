package com.okinc.assets.backend.api.model.tax.receivedasset;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ReceivedAssetCount {
    public static final int $stable = 0;
    private final Integer count;
    private final Long deadline;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReceivedAssetCount() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReceivedAssetCount copy$default(ReceivedAssetCount receivedAssetCount, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = receivedAssetCount.count;
        }
        if ((i & 2) != 0) {
            l = receivedAssetCount.deadline;
        }
        return receivedAssetCount.copy(num, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReceivedAssetCount copy(Integer num, Long l) {
        return new ReceivedAssetCount(num, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceivedAssetCount)) {
            return false;
        }
        ReceivedAssetCount receivedAssetCount = (ReceivedAssetCount) obj;
        return Intrinsics.EZpvd(this.count, receivedAssetCount.count) && Intrinsics.EZpvd(this.deadline, receivedAssetCount.deadline);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDeadline() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.count;
        int iHashCode = num == null ? 0 : num.hashCode();
        Long l = this.deadline;
        return (iHashCode * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReceivedAssetCount(count=" + this.count + ", deadline=" + this.deadline + ")";
    }

    public ReceivedAssetCount(Integer num, Long l) {
        this.count = num;
        this.deadline = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 java.lang.Long))
 A[MD:(java.lang.Integer, java.lang.Long):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.tax.receivedasset.ReceivedAssetCount.<init>(java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ ReceivedAssetCount(Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0L : l);
    }
}
