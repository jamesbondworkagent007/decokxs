package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SignOutData {
    private final String browserPackage;
    private final boolean bypassCancel;
    private final boolean globalSignOut;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignOutData() {
        this(false, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignOutData copy$default(SignOutData signOutData, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = signOutData.globalSignOut;
        }
        if ((i & 2) != 0) {
            str = signOutData.browserPackage;
        }
        if ((i & 4) != 0) {
            z2 = signOutData.bypassCancel;
        }
        return signOutData.copy(z, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.globalSignOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.browserPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.bypassCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignOutData copy(boolean z, String str, boolean z2) {
        return new SignOutData(z, str, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignOutData)) {
            return false;
        }
        SignOutData signOutData = (SignOutData) obj;
        return this.globalSignOut == signOutData.globalSignOut && Intrinsics.EZpvd((Object) this.browserPackage, (Object) signOutData.browserPackage) && this.bypassCancel == signOutData.bypassCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBypassCancel() {
        return this.bypassCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getGlobalSignOut() {
        return this.globalSignOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.globalSignOut;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        String str = this.browserPackage;
        int iHashCode = str == null ? 0 : str.hashCode();
        boolean z2 = this.bypassCancel;
        return (((r0 * 31) + iHashCode) * 31) + (z2 ? 1 : z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignOutData(globalSignOut=" + this.globalSignOut + ", browserPackage=" + this.browserPackage + ", bypassCancel=" + this.bypassCancel + ")";
    }

    public SignOutData(boolean z, String str, boolean z2) {
        this.globalSignOut = z;
        this.browserPackage = str;
        this.bypassCancel = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, java.lang.String, boolean):void (m)] (LINE:18) call: com.amplifyframework.statemachine.codegen.data.SignOutData.<init>(boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ SignOutData(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2);
    }
}
