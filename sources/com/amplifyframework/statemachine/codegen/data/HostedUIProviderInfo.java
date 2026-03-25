package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.auth.AuthProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class HostedUIProviderInfo {
    private final AuthProvider authProvider;
    private final String idpIdentifier;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HostedUIProviderInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HostedUIProviderInfo copy$default(HostedUIProviderInfo hostedUIProviderInfo, AuthProvider authProvider, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            authProvider = hostedUIProviderInfo.authProvider;
        }
        if ((i & 2) != 0) {
            str = hostedUIProviderInfo.idpIdentifier;
        }
        return hostedUIProviderInfo.copy(authProvider, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthProvider component1() {
        return this.authProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.idpIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HostedUIProviderInfo copy(AuthProvider authProvider, String str) {
        return new HostedUIProviderInfo(authProvider, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostedUIProviderInfo)) {
            return false;
        }
        HostedUIProviderInfo hostedUIProviderInfo = (HostedUIProviderInfo) obj;
        return Intrinsics.EZpvd(this.authProvider, hostedUIProviderInfo.authProvider) && Intrinsics.EZpvd((Object) this.idpIdentifier, (Object) hostedUIProviderInfo.idpIdentifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthProvider getAuthProvider() {
        return this.authProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdpIdentifier() {
        return this.idpIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AuthProvider authProvider = this.authProvider;
        int iHashCode = authProvider == null ? 0 : authProvider.hashCode();
        String str = this.idpIdentifier;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HostedUIProviderInfo(authProvider=" + this.authProvider + ", idpIdentifier=" + this.idpIdentifier + ")";
    }

    public HostedUIProviderInfo(AuthProvider authProvider, String str) {
        this.authProvider = authProvider;
        this.idpIdentifier = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.amplifyframework.auth.AuthProvider:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.auth.AuthProvider) : (r2v0 com.amplifyframework.auth.AuthProvider))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.amplifyframework.auth.AuthProvider, java.lang.String):void (m)] (LINE:20) call: com.amplifyframework.statemachine.codegen.data.HostedUIProviderInfo.<init>(com.amplifyframework.auth.AuthProvider, java.lang.String):void type: THIS */
    public /* synthetic */ HostedUIProviderInfo(AuthProvider authProvider, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : authProvider, (i & 2) != 0 ? null : str);
    }
}
