package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FY extends AbstractC56429yFa {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final FZ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FY copy$default(FY fy, FZ fz, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fz = fy.OLrzqt;
        }
        return fy.OLrzqt(fz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FZ AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FY OLrzqt(@NotNull FZ fz) {
        Intrinsics.checkNotNullParameter(fz, "");
        return new FY(fz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FY) && Intrinsics.EZpvd(this.OLrzqt, ((FY) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public static final class ActionBar implements CoroutineContext.TaskDescription<FY> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FY(@NotNull FZ fz) {
        super(KWHzl);
        Intrinsics.checkNotNullParameter(fz, "");
        this.OLrzqt = fz;
    }

    public java.lang.String toString() {
        return "TelemetryContext(" + this.OLrzqt + ')';
    }
}
