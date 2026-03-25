package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43444rpR implements InterfaceC43233rlS {
    public final boolean KWHzl;
    public final DeeplinkMode OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C43444rpR copy$default(C43444rpR c43444rpR, java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c43444rpR.copydefault;
        }
        if ((i & 2) != 0) {
            deeplinkMode = c43444rpR.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = c43444rpR.KWHzl;
        }
        return c43444rpR.KWHzl(str, deeplinkMode, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43444rpR KWHzl(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        return new C43444rpR(str, deeplinkMode, z);
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
        if (!(obj instanceof C43444rpR)) {
            return false;
        }
        C43444rpR c43444rpR = (C43444rpR) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c43444rpR.copydefault) && this.OLrzqt == c43444rpR.OLrzqt && this.KWHzl == c43444rpR.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NFTDeeplinkMetaData(path=" + this.copydefault + ", mode=" + this.OLrzqt + ", requireAuth=" + this.KWHzl + ")";
    }

    public C43444rpR(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        this.copydefault = str;
        this.OLrzqt = deeplinkMode;
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
  (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:0x0004: SGET  A[WRAPPED] (LINE:23) com.okinc.modular.deeplinkv2.DeeplinkMode.WALLET com.okinc.modular.deeplinkv2.DeeplinkMode) : (r2v0 com.okinc.modular.deeplinkv2.DeeplinkMode))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void (m)] (LINE:21) call: o.rpR.<init>(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void type: THIS */
    public /* synthetic */ C43444rpR(java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? DeeplinkMode.WALLET : deeplinkMode, (i & 4) != 0 ? false : z);
    }
}
