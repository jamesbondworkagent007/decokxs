package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AttestationFileResult {
    public static final int $stable = 0;
    private final String backendSignature;
    private final String frontendPubkeyVersionSelected;
    private final String signData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AttestationFileResult() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AttestationFileResult copy$default(AttestationFileResult attestationFileResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attestationFileResult.signData;
        }
        if ((i & 2) != 0) {
            str2 = attestationFileResult.backendSignature;
        }
        if ((i & 4) != 0) {
            str3 = attestationFileResult.frontendPubkeyVersionSelected;
        }
        return attestationFileResult.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.backendSignature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.frontendPubkeyVersionSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AttestationFileResult copy(String str, String str2, String str3) {
        return new AttestationFileResult(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttestationFileResult)) {
            return false;
        }
        AttestationFileResult attestationFileResult = (AttestationFileResult) obj;
        return Intrinsics.EZpvd((Object) this.signData, (Object) attestationFileResult.signData) && Intrinsics.EZpvd((Object) this.backendSignature, (Object) attestationFileResult.backendSignature) && Intrinsics.EZpvd((Object) this.frontendPubkeyVersionSelected, (Object) attestationFileResult.frontendPubkeyVersionSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackendSignature() {
        return this.backendSignature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrontendPubkeyVersionSelected() {
        return this.frontendPubkeyVersionSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.signData;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.backendSignature;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.frontendPubkeyVersionSelected;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AttestationFileResult(signData=" + this.signData + ", backendSignature=" + this.backendSignature + ", frontendPubkeyVersionSelected=" + this.frontendPubkeyVersionSelected + ")";
    }

    public AttestationFileResult(String str, String str2, String str3) {
        this.signData = str;
        this.backendSignature = str2;
        this.frontendPubkeyVersionSelected = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.defi.wallet.tee.common.model.AttestationFileResult.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AttestationFileResult(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
