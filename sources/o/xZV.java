package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xZV implements InterfaceC43233rlS {
    public final DeeplinkMode EZpvd;
    public final boolean KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ xZV copy$default(xZV xzv, java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = xzv.copydefault;
        }
        if ((i & 2) != 0) {
            deeplinkMode = xzv.EZpvd;
        }
        if ((i & 4) != 0) {
            z = xzv.KWHzl;
        }
        return xzv.KWHzl(str, deeplinkMode, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xZV KWHzl(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        return new xZV(str, deeplinkMode, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xZV)) {
            return false;
        }
        xZV xzv = (xZV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) xzv.copydefault) && this.EZpvd == xzv.EZpvd && this.KWHzl == xzv.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PasskeyWalletDeeplinkMetaData(path=" + this.copydefault + ", mode=" + this.EZpvd + ", requireAuth=" + this.KWHzl + ")";
    }

    public xZV(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        this.copydefault = str;
        this.EZpvd = deeplinkMode;
        this.KWHzl = z;
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
  (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:0x0004: SGET  A[WRAPPED] (LINE:171) com.okinc.modular.deeplinkv2.DeeplinkMode.APP com.okinc.modular.deeplinkv2.DeeplinkMode) : (r2v0 com.okinc.modular.deeplinkv2.DeeplinkMode))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void (m)] (LINE:169) call: o.xZV.<init>(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void type: THIS */
    public /* synthetic */ xZV(java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? DeeplinkMode.APP : deeplinkMode, (i & 4) != 0 ? true : z);
    }
}
