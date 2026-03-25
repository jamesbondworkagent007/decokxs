package o;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hdW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22339hdW {
    public final Function0<ServiceFeeInfo> EZpvd;
    public final Function0<java.lang.String> KWHzl;
    public final Function0<java.lang.String> OLrzqt;
    public final Function0<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hdW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C22339hdW copy$default(C22339hdW c22339hdW, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = c22339hdW.OLrzqt;
        }
        if ((i & 2) != 0) {
            function02 = c22339hdW.copydefault;
        }
        if ((i & 4) != 0) {
            function03 = c22339hdW.KWHzl;
        }
        if ((i & 8) != 0) {
            function04 = c22339hdW.EZpvd;
        }
        return c22339hdW.AEQbTJ(function0, function02, function03, function04);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<ServiceFeeInfo> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22339hdW AEQbTJ(@NotNull Function0<java.lang.String> function0, @NotNull Function0<java.lang.String> function02, @NotNull Function0<java.lang.String> function03, @NotNull Function0<ServiceFeeInfo> function04) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        return new C22339hdW(function0, function02, function03, function04);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.String> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.String> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22339hdW)) {
            return false;
        }
        C22339hdW c22339hdW = (C22339hdW) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c22339hdW.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c22339hdW.copydefault) && Intrinsics.EZpvd(this.KWHzl, c22339hdW.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c22339hdW.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReferralConfig(dexModeProvider=" + this.OLrzqt + ", chainIdProvider=" + this.copydefault + ", tokenPairProvider=" + this.KWHzl + ", serviceFeeInfoProvider=" + this.EZpvd + ")";
    }

    public C22339hdW(@NotNull Function0<java.lang.String> function0, @NotNull Function0<java.lang.String> function02, @NotNull Function0<java.lang.String> function03, @NotNull Function0<ServiceFeeInfo> function04) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        this.OLrzqt = function0;
        this.copydefault = function02;
        this.KWHzl = function03;
        this.EZpvd = function04;
    }
}
