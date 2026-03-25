package com.okinc.assets.backend.api.model.tax.receivedasset;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ApplyCostBasisEstimatesRequest {
    public static final int $stable = 0;
    private final String currency;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApplyCostBasisEstimatesRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ApplyCostBasisEstimatesRequest copy$default(ApplyCostBasisEstimatesRequest applyCostBasisEstimatesRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applyCostBasisEstimatesRequest.currency;
        }
        return applyCostBasisEstimatesRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApplyCostBasisEstimatesRequest copy(String str) {
        return new ApplyCostBasisEstimatesRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplyCostBasisEstimatesRequest) && Intrinsics.EZpvd((Object) this.currency, (Object) ((ApplyCostBasisEstimatesRequest) obj).currency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currency;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApplyCostBasisEstimatesRequest(currency=" + this.currency + ")";
    }

    public ApplyCostBasisEstimatesRequest(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.tax.receivedasset.ApplyCostBasisEstimatesRequest.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ ApplyCostBasisEstimatesRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
