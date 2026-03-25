package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.settings.DayNightMode;

/* JADX INFO: loaded from: classes17.dex */
public final class BnD {
    public static final int $stable = 8;
    public DayNightMode EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BnD copy$default(BnD bnD, DayNightMode dayNightMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dayNightMode = bnD.EZpvd;
        }
        return bnD.KWHzl(dayNightMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BnD KWHzl(@NotNull DayNightMode dayNightMode) {
        Intrinsics.checkNotNullParameter(dayNightMode, "");
        return new BnD(dayNightMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DayNightMode copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BnD) && this.EZpvd == ((BnD) obj).EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DayNightState(currentMode=" + this.EZpvd + ")";
    }

    public BnD(@NotNull DayNightMode dayNightMode) {
        Intrinsics.checkNotNullParameter(dayNightMode, "");
        this.EZpvd = dayNightMode;
    }
}
