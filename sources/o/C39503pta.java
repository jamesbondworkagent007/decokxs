package o;

import com.okinc.kline.ui.formula.data.KlineFormulaData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39503pta {
    public final KlineFormulaData AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39503pta copy$default(C39503pta c39503pta, java.lang.String str, KlineFormulaData klineFormulaData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c39503pta.KWHzl;
        }
        if ((i & 2) != 0) {
            klineFormulaData = c39503pta.AEQbTJ;
        }
        return c39503pta.AEQbTJ(str, klineFormulaData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39503pta AEQbTJ(@NotNull java.lang.String str, @NotNull KlineFormulaData klineFormulaData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(klineFormulaData, "");
        return new C39503pta(str, klineFormulaData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFormulaData OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39503pta)) {
            return false;
        }
        C39503pta c39503pta = (C39503pta) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c39503pta.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c39503pta.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineFormulaInfo(formulaName=" + this.KWHzl + ", formulaData=" + this.AEQbTJ + ")";
    }

    public C39503pta(@NotNull java.lang.String str, @NotNull KlineFormulaData klineFormulaData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(klineFormulaData, "");
        this.KWHzl = str;
        this.AEQbTJ = klineFormulaData;
    }
}
