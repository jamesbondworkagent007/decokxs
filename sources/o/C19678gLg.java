package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gLg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19678gLg implements InterfaceC43233rlS {
    public final boolean AEQbTJ;
    public final java.lang.String KWHzl;
    public final DeeplinkMode copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C19678gLg copy$default(C19678gLg c19678gLg, java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c19678gLg.KWHzl;
        }
        if ((i & 2) != 0) {
            deeplinkMode = c19678gLg.copydefault;
        }
        if ((i & 4) != 0) {
            z = c19678gLg.AEQbTJ;
        }
        return c19678gLg.EZpvd(str, deeplinkMode, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19678gLg EZpvd(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        return new C19678gLg(str, deeplinkMode, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public DeeplinkMode KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43233rlS
    public boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19678gLg)) {
            return false;
        }
        C19678gLg c19678gLg = (C19678gLg) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c19678gLg.KWHzl) && this.copydefault == c19678gLg.copydefault && this.AEQbTJ == c19678gLg.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexDeeplinkMetaData(path=" + this.KWHzl + ", mode=" + this.copydefault + ", requireAuth=" + this.AEQbTJ + ")";
    }

    public C19678gLg(@NotNull java.lang.String str, @NotNull DeeplinkMode deeplinkMode, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        this.KWHzl = str;
        this.copydefault = deeplinkMode;
        this.AEQbTJ = z;
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
  (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.modular.deeplinkv2.DeeplinkMode:0x0004: SGET  A[WRAPPED] (LINE:133) com.okinc.modular.deeplinkv2.DeeplinkMode.WALLET com.okinc.modular.deeplinkv2.DeeplinkMode) : (r2v0 com.okinc.modular.deeplinkv2.DeeplinkMode))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void (m)] (LINE:131) call: o.gLg.<init>(java.lang.String, com.okinc.modular.deeplinkv2.DeeplinkMode, boolean):void type: THIS */
    public /* synthetic */ C19678gLg(java.lang.String str, DeeplinkMode deeplinkMode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? DeeplinkMode.WALLET : deeplinkMode, (i & 4) != 0 ? false : z);
    }
}
