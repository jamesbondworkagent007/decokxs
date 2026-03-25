package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xZZ implements InterfaceC43233rlS {
    public final java.lang.String EZpvd;
    public final DeeplinkMode OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ xZZ copy$default(xZZ xzz, java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = xzz.EZpvd;
        }
        if ((i & 2) != 0) {
            deeplinkMode = xzz.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = xzz.copydefault;
        }
        return xzz.EZpvd(str, deeplinkMode, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xZZ EZpvd(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        return new xZZ(str, deeplinkMode, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xZZ)) {
            return false;
        }
        xZZ xzz = (xZZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) xzz.EZpvd) && this.OLrzqt == xzz.OLrzqt && this.copydefault == xzz.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Web3RedirectDeeplinkMetaData(path=" + this.EZpvd + ", mode=" + this.OLrzqt + ", requireAuth=" + this.copydefault + ")";
    }

    public xZZ(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        this.EZpvd = str;
        this.OLrzqt = deeplinkMode;
        this.copydefault = z;
    }

    @Override // o.InterfaceC43233rlS
    public java.util.List<C43240rlZ> AEQbTJ() {
        return InterfaceC43233rlS.Application.copydefault(this);
    }

    @Override // o.InterfaceC43233rlS
    public boolean AYXKKw() {
        return InterfaceC43233rlS.Application.AEQbTJ(this);
    }

    @Override // o.InterfaceC43233rlS
    public boolean EZpvd() {
        return InterfaceC43233rlS.Application.OLrzqt(this);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:0x0004: SGET  A[WRAPPED] (LINE:181) com.okinc.modular.deeplinkv2.DeeplinkMode.APP com.okinc.modular.deeplinkv2.DeeplinkMode) : (r2v0 com.okinc.modular.deeplinkv2.DeeplinkMode))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void (m)] (LINE:179) call: o.xZZ.<init>(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void type: THIS */
    public /* synthetic */ xZZ(java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? DeeplinkMode.APP : deeplinkMode, (i & 4) != 0 ? true : z);
    }
}
