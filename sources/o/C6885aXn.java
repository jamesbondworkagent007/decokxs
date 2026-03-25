package o;

import java.security.PrivateKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6885aXn {
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final PrivateKey copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C6885aXn copy$default(C6885aXn c6885aXn, java.lang.String str, PrivateKey privateKey, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c6885aXn.OLrzqt;
        }
        if ((i & 2) != 0) {
            privateKey = c6885aXn.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c6885aXn.KWHzl;
        }
        return c6885aXn.OLrzqt(str, privateKey, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrivateKey KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6885aXn OLrzqt(@NotNull java.lang.String str, PrivateKey privateKey, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C6885aXn(str, privateKey, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6885aXn)) {
            return false;
        }
        C6885aXn c6885aXn = (C6885aXn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c6885aXn.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c6885aXn.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c6885aXn.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        PrivateKey privateKey = this.copydefault;
        int iHashCode2 = privateKey == null ? 0 : privateKey.hashCode();
        java.lang.String str = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KeyBean(publicKey=" + this.OLrzqt + ", privateKey=" + this.copydefault + ", privateKeyString=" + this.KWHzl + ")";
    }

    public C6885aXn(@NotNull java.lang.String str, PrivateKey privateKey, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.copydefault = privateKey;
        this.KWHzl = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.security.PrivateKey:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.security.PrivateKey) : (r3v0 java.security.PrivateKey))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.security.PrivateKey, java.lang.String):void (m)] (LINE:110) call: o.aXn.<init>(java.lang.String, java.security.PrivateKey, java.lang.String):void type: THIS */
    public /* synthetic */ C6885aXn(java.lang.String str, PrivateKey privateKey, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : privateKey, (i & 4) != 0 ? null : str2);
    }
}
