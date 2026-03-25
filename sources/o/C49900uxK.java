package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49900uxK implements InterfaceC49899uxJ {
    public final yHO<android.content.Context, java.lang.String, java.lang.String, Unit> AEQbTJ;
    public final Function0<java.lang.Boolean> EZpvd;
    public final Function2<androidx.fragment.app.FragmentManager, Function0<Unit>, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uxK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C49900uxK copy$default(C49900uxK c49900uxK, Function0 function0, Function2 function2, yHO yho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = c49900uxK.EZpvd;
        }
        if ((i & 2) != 0) {
            function2 = c49900uxK.OLrzqt;
        }
        if ((i & 4) != 0) {
            yho = c49900uxK.AEQbTJ;
        }
        return c49900uxK.AEQbTJ(function0, function2, yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<androidx.fragment.app.FragmentManager, Function0<Unit>, Unit> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49900uxK AEQbTJ(@NotNull Function0<java.lang.Boolean> function0, Function2<? super androidx.fragment.app.FragmentManager, ? super Function0<Unit>, Unit> function2, yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(function0, "");
        return new C49900uxK(function0, function2, yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49899uxJ
    public Function0<java.lang.Boolean> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<android.content.Context, java.lang.String, java.lang.String, Unit> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49900uxK)) {
            return false;
        }
        C49900uxK c49900uxK = (C49900uxK) obj;
        return Intrinsics.EZpvd(this.EZpvd, c49900uxK.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c49900uxK.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c49900uxK.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        Function2<androidx.fragment.app.FragmentManager, Function0<Unit>, Unit> function2 = this.OLrzqt;
        int iHashCode2 = function2 == null ? 0 : function2.hashCode();
        yHO<android.content.Context, java.lang.String, java.lang.String, Unit> yho = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (yho != null ? yho.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarginSwitchInitParamsTradingAccount(isSupportMargin=" + this.EZpvd + ", jumpToOpenBorrow=" + this.OLrzqt + ", startBorrowManagement=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super androidx.fragment.app.FragmentManager, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C49900uxK(@NotNull Function0<java.lang.Boolean> function0, Function2<? super androidx.fragment.app.FragmentManager, ? super Function0<Unit>, Unit> function2, yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
        this.OLrzqt = function2;
        this.AEQbTJ = yho;
    }
}
