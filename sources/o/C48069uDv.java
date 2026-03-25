package o;

import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48069uDv {
    public final Indicator AEQbTJ;
    public final int KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48069uDv copy$default(C48069uDv c48069uDv, Indicator indicator, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            indicator = c48069uDv.AEQbTJ;
        }
        if ((i3 & 2) != 0) {
            i = c48069uDv.KWHzl;
        }
        if ((i3 & 4) != 0) {
            i2 = c48069uDv.OLrzqt;
        }
        return c48069uDv.AEQbTJ(indicator, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48069uDv AEQbTJ(@NotNull Indicator indicator, int i, int i2) {
        Intrinsics.checkNotNullParameter(indicator, "");
        return new C48069uDv(indicator, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Indicator EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48069uDv)) {
            return false;
        }
        C48069uDv c48069uDv = (C48069uDv) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c48069uDv.AEQbTJ) && this.KWHzl == c48069uDv.KWHzl && this.OLrzqt == c48069uDv.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "IndicatorSettingsInput(indicator=" + this.AEQbTJ + ", remainingSlots=" + this.KWHzl + ", maxIndicators=" + this.OLrzqt + ")";
    }

    public C48069uDv(@NotNull Indicator indicator, int i, int i2) {
        Intrinsics.checkNotNullParameter(indicator, "");
        this.AEQbTJ = indicator;
        this.KWHzl = i;
        this.OLrzqt = i2;
    }
}
