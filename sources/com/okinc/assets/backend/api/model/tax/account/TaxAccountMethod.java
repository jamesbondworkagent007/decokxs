package com.okinc.assets.backend.api.model.tax.account;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxAccountMethod {
    public static final int $stable = 0;
    private final Boolean allowUpdate;
    private final Long lastUpdated;
    private final Integer method;
    private final Long nextDayStart;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TaxAccountMethod() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TaxAccountMethod copy$default(TaxAccountMethod taxAccountMethod, Integer num, Long l, Boolean bool, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = taxAccountMethod.method;
        }
        if ((i & 2) != 0) {
            l = taxAccountMethod.lastUpdated;
        }
        if ((i & 4) != 0) {
            bool = taxAccountMethod.allowUpdate;
        }
        if ((i & 8) != 0) {
            l2 = taxAccountMethod.nextDayStart;
        }
        return taxAccountMethod.copy(num, l, bool, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.lastUpdated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.allowUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.nextDayStart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxAccountMethod copy(Integer num, Long l, Boolean bool, Long l2) {
        return new TaxAccountMethod(num, l, bool, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxAccountMethod)) {
            return false;
        }
        TaxAccountMethod taxAccountMethod = (TaxAccountMethod) obj;
        return Intrinsics.EZpvd(this.method, taxAccountMethod.method) && Intrinsics.EZpvd(this.lastUpdated, taxAccountMethod.lastUpdated) && Intrinsics.EZpvd(this.allowUpdate, taxAccountMethod.allowUpdate) && Intrinsics.EZpvd(this.nextDayStart, taxAccountMethod.nextDayStart);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowUpdate() {
        return this.allowUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getNextDayStart() {
        return this.nextDayStart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.method;
        int iHashCode = num == null ? 0 : num.hashCode();
        Long l = this.lastUpdated;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Boolean bool = this.allowUpdate;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Long l2 = this.nextDayStart;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxAccountMethod(method=" + this.method + ", lastUpdated=" + this.lastUpdated + ", allowUpdate=" + this.allowUpdate + ", nextDayStart=" + this.nextDayStart + ")";
    }

    public TaxAccountMethod(Integer num, Long l, Boolean bool, Long l2) {
        this.method = num;
        this.lastUpdated = l;
        this.allowUpdate = bool;
        this.nextDayStart = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
 A[MD:(java.lang.Integer, java.lang.Long, java.lang.Boolean, java.lang.Long):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.tax.account.TaxAccountMethod.<init>(java.lang.Integer, java.lang.Long, java.lang.Boolean, java.lang.Long):void type: THIS */
    public /* synthetic */ TaxAccountMethod(Integer num, Long l, Boolean bool, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l2);
    }
}
