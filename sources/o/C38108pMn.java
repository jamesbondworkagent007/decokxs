package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.pMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38108pMn {
    public static final int $stable = 0;

    @SerializedName("deeplink")
    private final java.lang.String deeplink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C38108pMn() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C38108pMn copy$default(C38108pMn c38108pMn, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c38108pMn.deeplink;
        }
        return c38108pMn.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38108pMn copydefault(java.lang.String str) {
        return new C38108pMn(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38108pMn) && Intrinsics.EZpvd((java.lang.Object) this.deeplink, (java.lang.Object) ((C38108pMn) obj).deeplink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.deeplink;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShortLinkMeta(deeplink=" + this.deeplink + ")";
    }

    public C38108pMn(java.lang.String str) {
        this.deeplink = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:5) call: o.pMn.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C38108pMn(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
