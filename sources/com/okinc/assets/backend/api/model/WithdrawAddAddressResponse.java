package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawAddAddressResponse {
    public static final int $stable = 8;
    private final List<Object> addresses;
    private final Boolean isRBACApproval;
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawAddAddressResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.WithdrawAddAddressResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawAddAddressResponse copy$default(WithdrawAddAddressResponse withdrawAddAddressResponse, String str, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawAddAddressResponse.sessionId;
        }
        if ((i & 2) != 0) {
            bool = withdrawAddAddressResponse.isRBACApproval;
        }
        if ((i & 4) != 0) {
            list = withdrawAddAddressResponse.addresses;
        }
        return withdrawAddAddressResponse.copy(str, bool, list);
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
    public final List<Object> component3() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawAddAddressResponse copy(String str, Boolean bool, List<Object> list) {
        return new WithdrawAddAddressResponse(str, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawAddAddressResponse)) {
            return false;
        }
        WithdrawAddAddressResponse withdrawAddAddressResponse = (WithdrawAddAddressResponse) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) withdrawAddAddressResponse.sessionId) && Intrinsics.EZpvd(this.isRBACApproval, withdrawAddAddressResponse.isRBACApproval) && Intrinsics.EZpvd(this.addresses, withdrawAddAddressResponse.addresses);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getAddresses() {
        return this.addresses;
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
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        List<Object> list = this.addresses;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isRBACApproval() {
        return this.isRBACApproval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawAddAddressResponse(sessionId=" + this.sessionId + ", isRBACApproval=" + this.isRBACApproval + ", addresses=" + this.addresses + ")";
    }

    public WithdrawAddAddressResponse(String str, Boolean bool, List<Object> list) {
        this.sessionId = str;
        this.isRBACApproval = bool;
        this.addresses = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.Boolean, java.util.List<java.lang.Object>):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.WithdrawAddAddressResponse.<init>(java.lang.String, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ WithdrawAddAddressResponse(String str, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list);
    }
}
