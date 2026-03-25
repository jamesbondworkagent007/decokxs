package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class LoanHeaderItem {
    public static final int $stable = 8;
    private final String aprTitle;
    private final Object extraData;
    private final Boolean isCurrent;
    private final String loanQuotaCoef;
    private final String quoteTitle;
    private final String title;
    private final String uniqueKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoanHeaderItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LoanHeaderItem copy$default(LoanHeaderItem loanHeaderItem, String str, String str2, String str3, String str4, String str5, Object obj, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = loanHeaderItem.title;
        }
        if ((i & 2) != 0) {
            str2 = loanHeaderItem.quoteTitle;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = loanHeaderItem.aprTitle;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = loanHeaderItem.loanQuotaCoef;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = loanHeaderItem.uniqueKey;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            obj = loanHeaderItem.extraData;
        }
        Object obj3 = obj;
        if ((i & 64) != 0) {
            bool = loanHeaderItem.isCurrent;
        }
        return loanHeaderItem.copy(str, str6, str7, str8, str9, obj3, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.aprTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.loanQuotaCoef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.uniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component6() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoanHeaderItem copy(String str, String str2, String str3, String str4, String str5, Object obj, Boolean bool) {
        return new LoanHeaderItem(str, str2, str3, str4, str5, obj, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanHeaderItem)) {
            return false;
        }
        LoanHeaderItem loanHeaderItem = (LoanHeaderItem) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) loanHeaderItem.title) && Intrinsics.EZpvd((Object) this.quoteTitle, (Object) loanHeaderItem.quoteTitle) && Intrinsics.EZpvd((Object) this.aprTitle, (Object) loanHeaderItem.aprTitle) && Intrinsics.EZpvd((Object) this.loanQuotaCoef, (Object) loanHeaderItem.loanQuotaCoef) && Intrinsics.EZpvd((Object) this.uniqueKey, (Object) loanHeaderItem.uniqueKey) && Intrinsics.EZpvd(this.extraData, loanHeaderItem.extraData) && Intrinsics.EZpvd(this.isCurrent, loanHeaderItem.isCurrent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAprTitle() {
        return this.aprTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getExtraData() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoanQuotaCoef() {
        return this.loanQuotaCoef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteTitle() {
        return this.quoteTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueKey() {
        return this.uniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.quoteTitle;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.aprTitle;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.loanQuotaCoef;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.uniqueKey;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Object obj = this.extraData;
        int iHashCode6 = obj == null ? 0 : obj.hashCode();
        Boolean bool = this.isCurrent;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isCurrent() {
        return this.isCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoanHeaderItem(title=" + this.title + ", quoteTitle=" + this.quoteTitle + ", aprTitle=" + this.aprTitle + ", loanQuotaCoef=" + this.loanQuotaCoef + ", uniqueKey=" + this.uniqueKey + ", extraData=" + this.extraData + ", isCurrent=" + this.isCurrent + ")";
    }

    public LoanHeaderItem(String str, String str2, String str3, String str4, String str5, Object obj, Boolean bool) {
        this.title = str;
        this.quoteTitle = str2;
        this.aprTitle = str3;
        this.loanQuotaCoef = str4;
        this.uniqueKey = str5;
        this.extraData = obj;
        this.isCurrent = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:java.lang.Object:0x0029: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r11v0 java.lang.Object))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x002e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r12v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Boolean):void (m)] (LINE:3509) call: com.okinc.unify_trade.biz.LoanHeaderItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Boolean):void type: THIS */
    public /* synthetic */ LoanHeaderItem(String str, String str2, String str3, String str4, String str5, Object obj, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : obj, (i & 64) != 0 ? Boolean.FALSE : bool);
    }
}
