package com.keystone.module;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KeystoneSignRequest<T> {
    private final String origin;
    private final String requestId;
    private final T signData;
    private final String xfp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.keystone.module.KeystoneSignRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeystoneSignRequest copy$default(KeystoneSignRequest keystoneSignRequest, String str, Object obj, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = keystoneSignRequest.requestId;
        }
        if ((i & 2) != 0) {
            obj = keystoneSignRequest.signData;
        }
        if ((i & 4) != 0) {
            str2 = keystoneSignRequest.xfp;
        }
        if ((i & 8) != 0) {
            str3 = keystoneSignRequest.origin;
        }
        return keystoneSignRequest.copy(str, obj, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T component2() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneSignRequest<T> copy(@NotNull String str, T t, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new KeystoneSignRequest<>(str, t, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeystoneSignRequest)) {
            return false;
        }
        KeystoneSignRequest keystoneSignRequest = (KeystoneSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) keystoneSignRequest.requestId) && Intrinsics.EZpvd(this.signData, keystoneSignRequest.signData) && Intrinsics.EZpvd((Object) this.xfp, (Object) keystoneSignRequest.xfp) && Intrinsics.EZpvd((Object) this.origin, (Object) keystoneSignRequest.origin);
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
    public final T getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXfp() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.requestId.hashCode();
        T t = this.signData;
        return (((((iHashCode * 31) + (t == null ? 0 : t.hashCode())) * 31) + this.xfp.hashCode()) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KeystoneSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", xfp=" + this.xfp + ", origin=" + this.origin + ')';
    }

    public KeystoneSignRequest(@NotNull String str, T t, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = str;
        this.signData = t;
        this.xfp = str2;
        this.origin = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.Object)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, T, java.lang.String, java.lang.String):void (m)] (LINE:3) call: com.keystone.module.KeystoneSignRequest.<init>(java.lang.String, java.lang.Object, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KeystoneSignRequest(String str, Object obj, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, str2, (i & 8) != 0 ? "" : str3);
    }
}
