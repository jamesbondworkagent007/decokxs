package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C40239qOm;
import o.InterfaceC40231qOe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40245qOs implements InterfaceC40231qOe {
    public final C40239qOm.ActionBar.Application EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C40245qOs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40245qOs copy$default(C40245qOs c40245qOs, C40239qOm.ActionBar.Application application, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            application = c40245qOs.EZpvd;
        }
        return c40245qOs.copydefault(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40239qOm.ActionBar.Application AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40245qOs copydefault(C40239qOm.ActionBar.Application application) {
        return new C40245qOs(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40245qOs) && Intrinsics.EZpvd(this.EZpvd, ((C40245qOs) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C40239qOm.ActionBar.Application application = this.EZpvd;
        if (application == null) {
            return 0;
        }
        return application.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavSearchOptionsSectionVo(optionsTabVo=" + this.EZpvd + ")";
    }

    public C40245qOs(C40239qOm.ActionBar.Application application) {
        this.EZpvd = application;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.qOm$ActionBar$Application:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.qOm$ActionBar$Application) : (r1v0 o.qOm$ActionBar$Application))
 A[MD:(o.qOm$ActionBar$Application):void (m)] (LINE:29) call: o.qOs.<init>(o.qOm$ActionBar$Application):void type: THIS */
    public /* synthetic */ C40245qOs(C40239qOm.ActionBar.Application application, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : application);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC40231qOe.StateListAnimator.copydefault(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return interfaceC40516qYt instanceof C40245qOs;
    }
}
