package com.keystone.module;

import com.keystone.sdk.KeystoneAptosSDK;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AptosSignRequest {
    private final List<AptosAccount> accounts;
    private final String origin;
    private final String requestId;
    private final String signData;
    private final KeystoneAptosSDK.SignType signType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.keystone.module.AptosSignRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AptosSignRequest copy$default(AptosSignRequest aptosSignRequest, String str, String str2, KeystoneAptosSDK.SignType signType, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aptosSignRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = aptosSignRequest.signData;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            signType = aptosSignRequest.signType;
        }
        KeystoneAptosSDK.SignType signType2 = signType;
        if ((i & 8) != 0) {
            list = aptosSignRequest.accounts;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str3 = aptosSignRequest.origin;
        }
        return aptosSignRequest.copy(str, str4, signType2, list2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneAptosSDK.SignType component3() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AptosAccount> component4() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosSignRequest copy(@NotNull String str, @NotNull String str2, @NotNull KeystoneAptosSDK.SignType signType, @NotNull List<AptosAccount> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(signType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AptosSignRequest(str, str2, signType, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosSignRequest)) {
            return false;
        }
        AptosSignRequest aptosSignRequest = (AptosSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) aptosSignRequest.requestId) && Intrinsics.EZpvd((Object) this.signData, (Object) aptosSignRequest.signData) && this.signType == aptosSignRequest.signType && Intrinsics.EZpvd(this.accounts, aptosSignRequest.accounts) && Intrinsics.EZpvd((Object) this.origin, (Object) aptosSignRequest.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AptosAccount> getAccounts() {
        return this.accounts;
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
    public final String getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneAptosSDK.SignType getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.requestId.hashCode() * 31) + this.signData.hashCode()) * 31) + this.signType.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", signType=" + this.signType + ", accounts=" + this.accounts + ", origin=" + this.origin + ')';
    }

    public AptosSignRequest(@NotNull String str, @NotNull String str2, @NotNull KeystoneAptosSDK.SignType signType, @NotNull List<AptosAccount> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(signType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = str;
        this.signData = str2;
        this.signType = signType;
        this.accounts = list;
        this.origin = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 com.keystone.sdk.KeystoneAptosSDK$SignType)
  (r10v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneAptosSDK$SignType, java.util.List<com.keystone.module.AptosAccount>, java.lang.String):void (m)] (LINE:11) call: com.keystone.module.AptosSignRequest.<init>(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneAptosSDK$SignType, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AptosSignRequest(String str, String str2, KeystoneAptosSDK.SignType signType, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, signType, list, (i & 16) != 0 ? "" : str3);
    }
}
