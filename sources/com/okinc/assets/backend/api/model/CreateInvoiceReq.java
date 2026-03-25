package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CreateInvoiceReq {
    public static final int $stable = 8;
    private String amount;
    private String currencyId;
    private String valuationUnit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateInvoiceReq() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateInvoiceReq copy$default(CreateInvoiceReq createInvoiceReq, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createInvoiceReq.amount;
        }
        if ((i & 2) != 0) {
            str2 = createInvoiceReq.currencyId;
        }
        if ((i & 4) != 0) {
            str3 = createInvoiceReq.valuationUnit;
        }
        return createInvoiceReq.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateInvoiceReq copy(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CreateInvoiceReq(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateInvoiceReq)) {
            return false;
        }
        CreateInvoiceReq createInvoiceReq = (CreateInvoiceReq) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) createInvoiceReq.amount) && Intrinsics.EZpvd((Object) this.currencyId, (Object) createInvoiceReq.currencyId) && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) createInvoiceReq.valuationUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.amount.hashCode();
        int iHashCode2 = this.currencyId.hashCode();
        String str = this.valuationUnit;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuationUnit(String str) {
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateInvoiceReq(amount=" + this.amount + ", currencyId=" + this.currencyId + ", valuationUnit=" + this.valuationUnit + ")";
    }

    public CreateInvoiceReq(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.currencyId = str2;
        this.valuationUnit = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:41) call: com.okinc.assets.backend.api.model.CreateInvoiceReq.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CreateInvoiceReq(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
