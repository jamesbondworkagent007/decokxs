package com.okinc.assets.backend.api.model.tax;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxSummary {
    public static final int $stable = 0;
    private final String longTermGain;
    private final String miscIncome;
    private final String shortTermGain;
    private final Integer startYear;
    private final String totalGain;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TaxSummary() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TaxSummary copy$default(TaxSummary taxSummary, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxSummary.totalGain;
        }
        if ((i & 2) != 0) {
            str2 = taxSummary.longTermGain;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = taxSummary.shortTermGain;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = taxSummary.miscIncome;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            num = taxSummary.startYear;
        }
        return taxSummary.copy(str, str5, str6, str7, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalGain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.longTermGain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.shortTermGain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.miscIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.startYear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxSummary copy(String str, String str2, String str3, String str4, Integer num) {
        return new TaxSummary(str, str2, str3, str4, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxSummary)) {
            return false;
        }
        TaxSummary taxSummary = (TaxSummary) obj;
        return Intrinsics.EZpvd((Object) this.totalGain, (Object) taxSummary.totalGain) && Intrinsics.EZpvd((Object) this.longTermGain, (Object) taxSummary.longTermGain) && Intrinsics.EZpvd((Object) this.shortTermGain, (Object) taxSummary.shortTermGain) && Intrinsics.EZpvd((Object) this.miscIncome, (Object) taxSummary.miscIncome) && Intrinsics.EZpvd(this.startYear, taxSummary.startYear);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongTermGain() {
        return this.longTermGain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMiscIncome() {
        return this.miscIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortTermGain() {
        return this.shortTermGain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStartYear() {
        return this.startYear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalGain() {
        return this.totalGain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalGain;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.longTermGain;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.shortTermGain;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.miscIncome;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.startYear;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxSummary(totalGain=" + this.totalGain + ", longTermGain=" + this.longTermGain + ", shortTermGain=" + this.shortTermGain + ", miscIncome=" + this.miscIncome + ", startYear=" + this.startYear + ")";
    }

    public TaxSummary(String str, String str2, String str3, String str4, Integer num) {
        this.totalGain = str;
        this.longTermGain = str2;
        this.shortTermGain = str3;
        this.miscIncome = str4;
        this.startYear = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.tax.TaxSummary.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ TaxSummary(String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num);
    }
}
