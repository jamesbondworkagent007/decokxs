package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class LoanColumnItem {
    public static final int $stable = 0;
    private final String apr;
    private final String level;
    private final String quote;
    private final String rate;
    private final String rateType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoanColumnItem() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LoanColumnItem copy$default(LoanColumnItem loanColumnItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loanColumnItem.level;
        }
        if ((i & 2) != 0) {
            str2 = loanColumnItem.rate;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = loanColumnItem.quote;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = loanColumnItem.apr;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = loanColumnItem.rateType;
        }
        return loanColumnItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoanColumnItem copy(String str, String str2, String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        return new LoanColumnItem(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanColumnItem)) {
            return false;
        }
        LoanColumnItem loanColumnItem = (LoanColumnItem) obj;
        return Intrinsics.EZpvd((Object) this.level, (Object) loanColumnItem.level) && Intrinsics.EZpvd((Object) this.rate, (Object) loanColumnItem.rate) && Intrinsics.EZpvd((Object) this.quote, (Object) loanColumnItem.quote) && Intrinsics.EZpvd((Object) this.apr, (Object) loanColumnItem.apr) && Intrinsics.EZpvd((Object) this.rateType, (Object) loanColumnItem.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApr() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuote() {
        return this.quote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.level;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.rate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.quote;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.apr;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.rateType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoanColumnItem(level=" + this.level + ", rate=" + this.rate + ", quote=" + this.quote + ", apr=" + this.apr + ", rateType=" + this.rateType + ")";
    }

    public LoanColumnItem(String str, String str2, String str3, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        this.level = str;
        this.rate = str2;
        this.quote = str3;
        this.apr = str4;
        this.rateType = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("year") : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3529) call: com.okinc.unify_trade.biz.LoanColumnItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LoanColumnItem(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? "year" : str5);
    }
}
