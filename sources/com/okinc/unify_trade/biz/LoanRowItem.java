package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class LoanRowItem {
    public static final int $stable = 8;
    private final String ccy;
    private final ArrayList<LoanColumnItem> dataList;
    private boolean showStgyTitle;
    private String stgyType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.LoanRowItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoanRowItem copy$default(LoanRowItem loanRowItem, String str, ArrayList arrayList, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loanRowItem.ccy;
        }
        if ((i & 2) != 0) {
            arrayList = loanRowItem.dataList;
        }
        if ((i & 4) != 0) {
            str2 = loanRowItem.stgyType;
        }
        if ((i & 8) != 0) {
            z = loanRowItem.showStgyTitle;
        }
        return loanRowItem.copy(str, arrayList, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanColumnItem> component2() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.stgyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.showStgyTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoanRowItem copy(String str, @NotNull ArrayList<LoanColumnItem> arrayList, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LoanRowItem(str, arrayList, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanRowItem)) {
            return false;
        }
        LoanRowItem loanRowItem = (LoanRowItem) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) loanRowItem.ccy) && Intrinsics.EZpvd(this.dataList, loanRowItem.dataList) && Intrinsics.EZpvd((Object) this.stgyType, (Object) loanRowItem.stgyType) && this.showStgyTitle == loanRowItem.showStgyTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LoanColumnItem> getDataList() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowStgyTitle() {
        return this.showStgyTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyType() {
        return this.stgyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ccy;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.dataList.hashCode()) * 31) + this.stgyType.hashCode()) * 31) + Boolean.hashCode(this.showStgyTitle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowStgyTitle(boolean z) {
        this.showStgyTitle = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoanRowItem(ccy=" + this.ccy + ", dataList=" + this.dataList + ", stgyType=" + this.stgyType + ", showStgyTitle=" + this.showStgyTitle + ")";
    }

    public LoanRowItem(String str, @NotNull ArrayList<LoanColumnItem> arrayList, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ccy = str;
        this.dataList = arrayList;
        this.stgyType = str2;
        this.showStgyTitle = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (r3v0 java.util.ArrayList)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.LoanColumnItem>, java.lang.String, boolean):void (m)] (LINE:3521) call: com.okinc.unify_trade.biz.LoanRowItem.<init>(java.lang.String, java.util.ArrayList, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ LoanRowItem(String str, ArrayList arrayList, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, arrayList, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }
}
