package com.keystone.module;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class NearSignRequest {
    private final String account;
    private final String origin;
    private final String path;
    private final String requestId;
    private final ArrayList<String> signData;
    private final String xfp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.keystone.module.NearSignRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NearSignRequest copy$default(NearSignRequest nearSignRequest, String str, ArrayList arrayList, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nearSignRequest.requestId;
        }
        if ((i & 2) != 0) {
            arrayList = nearSignRequest.signData;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            str2 = nearSignRequest.path;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = nearSignRequest.xfp;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = nearSignRequest.account;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = nearSignRequest.origin;
        }
        return nearSignRequest.copy(str, arrayList2, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component2() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NearSignRequest copy(@NotNull String str, @NotNull ArrayList<String> arrayList, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new NearSignRequest(str, arrayList, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearSignRequest)) {
            return false;
        }
        NearSignRequest nearSignRequest = (NearSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) nearSignRequest.requestId) && Intrinsics.EZpvd(this.signData, nearSignRequest.signData) && Intrinsics.EZpvd((Object) this.path, (Object) nearSignRequest.path) && Intrinsics.EZpvd((Object) this.xfp, (Object) nearSignRequest.xfp) && Intrinsics.EZpvd((Object) this.account, (Object) nearSignRequest.account) && Intrinsics.EZpvd((Object) this.origin, (Object) nearSignRequest.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXfp() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.requestId.hashCode() * 31) + this.signData.hashCode()) * 31) + this.path.hashCode()) * 31) + this.xfp.hashCode()) * 31) + this.account.hashCode()) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NearSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", path=" + this.path + ", xfp=" + this.xfp + ", account=" + this.account + ", origin=" + this.origin + ')';
    }

    public NearSignRequest(@NotNull String str, @NotNull ArrayList<String> arrayList, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.requestId = str;
        this.signData = arrayList;
        this.path = str2;
        this.xfp = str3;
        this.account = str4;
        this.origin = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.util.ArrayList)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.util.ArrayList<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3) call: com.keystone.module.NearSignRequest.<init>(java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NearSignRequest(String str, ArrayList arrayList, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, arrayList, str2, str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}
