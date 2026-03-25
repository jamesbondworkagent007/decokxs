package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawVerifyAddressResponse {
    public static final int $stable = 0;
    private final Boolean isRBACApproval;
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawVerifyAddressResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawVerifyAddressResponse copy$default(WithdrawVerifyAddressResponse withdrawVerifyAddressResponse, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawVerifyAddressResponse.sessionId;
        }
        if ((i & 2) != 0) {
            bool = withdrawVerifyAddressResponse.isRBACApproval;
        }
        return withdrawVerifyAddressResponse.copy(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isRBACApproval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawVerifyAddressResponse copy(String str, Boolean bool) {
        return new WithdrawVerifyAddressResponse(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawVerifyAddressResponse)) {
            return false;
        }
        WithdrawVerifyAddressResponse withdrawVerifyAddressResponse = (WithdrawVerifyAddressResponse) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) withdrawVerifyAddressResponse.sessionId) && Intrinsics.EZpvd(this.isRBACApproval, withdrawVerifyAddressResponse.isRBACApproval);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sessionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.isRBACApproval;
        return (iHashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isRBACApproval() {
        return this.isRBACApproval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawVerifyAddressResponse(sessionId=" + this.sessionId + ", isRBACApproval=" + this.isRBACApproval + ")";
    }

    public WithdrawVerifyAddressResponse(String str, Boolean bool) {
        this.sessionId = str;
        this.isRBACApproval = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Boolean):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.WithdrawVerifyAddressResponse.<init>(java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ WithdrawVerifyAddressResponse(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
