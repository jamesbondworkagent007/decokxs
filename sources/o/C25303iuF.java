package o;

import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25303iuF implements kMU {
    public final java.lang.String AEQbTJ;
    public final SlippageMode KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25303iuF copy$default(C25303iuF c25303iuF, boolean z, java.lang.String str, SlippageMode slippageMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25303iuF.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c25303iuF.AEQbTJ;
        }
        if ((i & 4) != 0) {
            slippageMode = c25303iuF.KWHzl;
        }
        return c25303iuF.KWHzl(z, str, slippageMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25303iuF KWHzl(boolean z, @NotNull java.lang.String str, @NotNull SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        return new C25303iuF(z, str, slippageMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25303iuF)) {
            return false;
        }
        C25303iuF c25303iuF = (C25303iuF) obj;
        return this.OLrzqt == c25303iuF.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25303iuF.AEQbTJ) && this.KWHzl == c25303iuF.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SlippageModeItemUiModel(select=" + this.OLrzqt + ", title=" + this.AEQbTJ + ", slippageMode=" + this.KWHzl + ")";
    }

    public C25303iuF(boolean z, @NotNull java.lang.String str, @NotNull SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        this.OLrzqt = z;
        this.AEQbTJ = str;
        this.KWHzl = slippageMode;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}
