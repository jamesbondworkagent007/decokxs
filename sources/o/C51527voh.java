package o;

import com.okinc.biz.TacticsType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C51632vqg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51527voh implements InterfaceC47982uAp {
    public final java.lang.String AEQbTJ;
    public final TacticsType EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C51527voh() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsType KWHzl() {
        return this.EZpvd;
    }

    public C51527voh(TacticsType tacticsType, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = tacticsType;
        this.copydefault = str;
        this.AEQbTJ = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C51527voh(TacticsType tacticsType, java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        tacticsType = (i & 1) != 0 ? null : tacticsType;
        if ((i & 2) != 0 && (tacticsType == null || (str = C33070mpX.AYXKKw(tacticsType.getStgyName())) == null)) {
            str = "";
        }
        this(tacticsType, str, (i & 4) != 0 ? null : str2);
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        C51632vqg.Activity activity = C51632vqg.Companion;
        TacticsType tacticsType = this.EZpvd;
        return activity.copydefault(tacticsType != null ? tacticsType.getConstant() : null, this.AEQbTJ);
    }
}
