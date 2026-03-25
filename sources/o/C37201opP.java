package o;

import com.okinc.im.imui.privacy.SecurityType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37201opP extends C37200opO {
    public java.lang.String EZpvd;
    public SecurityType KWHzl;
    public boolean copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37201opP copy$default(C37201opP c37201opP, SecurityType securityType, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            securityType = c37201opP.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c37201opP.djBIcL;
        }
        if ((i & 4) != 0) {
            str2 = c37201opP.EZpvd;
        }
        if ((i & 8) != 0) {
            z = c37201opP.copydefault;
        }
        return c37201opP.AEQbTJ(securityType, str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37201opP AEQbTJ(@NotNull SecurityType securityType, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(securityType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C37201opP(securityType, str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C37200opO
    public SecurityType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C37200opO
    public java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37201opP)) {
            return false;
        }
        C37201opP c37201opP = (C37201opP) obj;
        return this.KWHzl == c37201opP.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c37201opP.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c37201opP.EZpvd) && this.copydefault == c37201opP.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SettingSwitchItem(itemType=" + this.KWHzl + ", title=" + this.djBIcL + ", desc=" + this.EZpvd + ", switchStatus=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r2v0 com.okinc.im.imui.privacy.SecurityType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(com.okinc.im.imui.privacy.SecurityType, java.lang.String, java.lang.String, boolean):void (m)] (LINE:24) call: o.opP.<init>(com.okinc.im.imui.privacy.SecurityType, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C37201opP(SecurityType securityType, java.lang.String str, java.lang.String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(securityType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37201opP(@NotNull SecurityType securityType, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        super(securityType, str);
        Intrinsics.checkNotNullParameter(securityType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = securityType;
        this.djBIcL = str;
        this.EZpvd = str2;
        this.copydefault = z;
    }
}
