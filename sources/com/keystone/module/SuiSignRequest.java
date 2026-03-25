package com.keystone.module;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SuiSignRequest {
    private final List<SuiAccount> accounts;
    private final String intentMessage;
    private final String origin;
    private final String requestId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.keystone.module.SuiSignRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuiSignRequest copy$default(SuiSignRequest suiSignRequest, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suiSignRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = suiSignRequest.intentMessage;
        }
        if ((i & 4) != 0) {
            list = suiSignRequest.accounts;
        }
        if ((i & 8) != 0) {
            str3 = suiSignRequest.origin;
        }
        return suiSignRequest.copy(str, str2, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.intentMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiAccount> component3() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuiSignRequest copy(@NotNull String str, @NotNull String str2, @NotNull List<SuiAccount> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SuiSignRequest(str, str2, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuiSignRequest)) {
            return false;
        }
        SuiSignRequest suiSignRequest = (SuiSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) suiSignRequest.requestId) && Intrinsics.EZpvd((Object) this.intentMessage, (Object) suiSignRequest.intentMessage) && Intrinsics.EZpvd(this.accounts, suiSignRequest.accounts) && Intrinsics.EZpvd((Object) this.origin, (Object) suiSignRequest.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiAccount> getAccounts() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntentMessage() {
        return this.intentMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.requestId.hashCode() * 31) + this.intentMessage.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiSignRequest(requestId=" + this.requestId + ", intentMessage=" + this.intentMessage + ", accounts=" + this.accounts + ", origin=" + this.origin + ')';
    }

    public SuiSignRequest(@NotNull String str, @NotNull String str2, @NotNull List<SuiAccount> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = str;
        this.intentMessage = str2;
        this.accounts = list;
        this.origin = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.keystone.module.SuiAccount>, java.lang.String):void (m)] (LINE:9) call: com.keystone.module.SuiSignRequest.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SuiSignRequest(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? "" : str3);
    }
}
