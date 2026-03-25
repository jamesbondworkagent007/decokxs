package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xZS implements InterfaceC43233rlS {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final DeeplinkMode OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ xZS copy$default(xZS xzs, java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = xzs.AEQbTJ;
        }
        if ((i & 2) != 0) {
            deeplinkMode = xzs.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = xzs.EZpvd;
        }
        return xzs.copydefault(str, deeplinkMode, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xZS copydefault(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        return new xZS(str, deeplinkMode, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xZS)) {
            return false;
        }
        xZS xzs = (xZS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) xzs.AEQbTJ) && this.OLrzqt == xzs.OLrzqt && this.EZpvd == xzs.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletDeeplinkMetaData(path=" + this.AEQbTJ + ", mode=" + this.OLrzqt + ", requireAuth=" + this.EZpvd + ")";
    }

    public xZS(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        this.AEQbTJ = str;
        this.OLrzqt = deeplinkMode;
        this.EZpvd = z;
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
  (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:0x0004: SGET  A[WRAPPED] (LINE:161) com.okinc.modular.deeplinkv2.DeeplinkMode.WALLET com.okinc.modular.deeplinkv2.DeeplinkMode) : (r2v0 com.okinc.modular.deeplinkv2.DeeplinkMode))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void (m)] (LINE:159) call: o.xZS.<init>(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void type: THIS */
    public /* synthetic */ xZS(java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? DeeplinkMode.WALLET : deeplinkMode, (i & 4) != 0 ? false : z);
    }
}
