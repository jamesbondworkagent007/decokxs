package o;

import com.okinc.components.security.scanner.EnsecureAppInfo;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32764mjj implements RxBus.Application {
    public final int AEQbTJ;
    public final java.util.List<EnsecureAppInfo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mjj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32764mjj copy$default(C32764mjj c32764mjj, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = c32764mjj.copydefault;
        }
        if ((i2 & 2) != 0) {
            i = c32764mjj.AEQbTJ;
        }
        return c32764mjj.KWHzl(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32764mjj KWHzl(@NotNull java.util.List<EnsecureAppInfo> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C32764mjj(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<EnsecureAppInfo> OLrzqt() {
        return this.copydefault;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32764mjj)) {
            return false;
        }
        C32764mjj c32764mjj = (C32764mjj) obj;
        return Intrinsics.EZpvd(this.copydefault, c32764mjj.copydefault) && this.AEQbTJ == c32764mjj.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ScanResultEvent(appList=" + this.copydefault + ", type=" + this.AEQbTJ + ")";
    }

    public C32764mjj(@NotNull java.util.List<EnsecureAppInfo> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.util.List<com.okinc.components.security.scanner.EnsecureAppInfo>, int):void (m)] (LINE:38) call: o.mjj.<init>(java.util.List, int):void type: THIS */
    public /* synthetic */ C32764mjj(java.util.List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0 : i);
    }
}
