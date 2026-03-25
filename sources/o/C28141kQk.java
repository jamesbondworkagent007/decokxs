package o;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28141kQk {
    public final Function0<java.lang.Boolean> EZpvd;
    public final Function0<java.lang.String> KWHzl;
    public final AdvancedTradeType OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kQk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C28141kQk copy$default(C28141kQk c28141kQk, AdvancedTradeType advancedTradeType, Function0 function0, Function0 function02, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            advancedTradeType = c28141kQk.OLrzqt;
        }
        if ((i & 2) != 0) {
            function0 = c28141kQk.KWHzl;
        }
        if ((i & 4) != 0) {
            function02 = c28141kQk.EZpvd;
        }
        if ((i & 8) != 0) {
            z = c28141kQk.copydefault;
        }
        return c28141kQk.copydefault(advancedTradeType, function0, function02, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.String> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedTradeType KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.Boolean> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28141kQk copydefault(@NotNull AdvancedTradeType advancedTradeType, @NotNull Function0<java.lang.String> function0, @NotNull Function0<java.lang.Boolean> function02, boolean z) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        return new C28141kQk(advancedTradeType, function0, function02, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28141kQk)) {
            return false;
        }
        C28141kQk c28141kQk = (C28141kQk) obj;
        return this.OLrzqt == c28141kQk.OLrzqt && Intrinsics.EZpvd(this.KWHzl, c28141kQk.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c28141kQk.EZpvd) && this.copydefault == c28141kQk.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QuotePollParams(tradeType=" + this.OLrzqt + ", selectedPlatformIdProvider=" + this.KWHzl + ", canUseSmartAccount=" + this.EZpvd + ", shouldBatchApprove=" + this.copydefault + ")";
    }

    public C28141kQk(@NotNull AdvancedTradeType advancedTradeType, @NotNull Function0<java.lang.String> function0, @NotNull Function0<java.lang.Boolean> function02, boolean z) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.OLrzqt = advancedTradeType;
        this.KWHzl = function0;
        this.EZpvd = function02;
        this.copydefault = z;
    }
}
