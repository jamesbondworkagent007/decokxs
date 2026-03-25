package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uCl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48032uCl {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final java.lang.Number AEQbTJ;
    public final java.lang.Number KWHzl;
    public final long OLrzqt;
    public final java.lang.Number copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48032uCl copy$default(C48032uCl c48032uCl, long j, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c48032uCl.OLrzqt;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            number = c48032uCl.AEQbTJ;
        }
        java.lang.Number number4 = number;
        if ((i & 4) != 0) {
            number2 = c48032uCl.KWHzl;
        }
        java.lang.Number number5 = number2;
        if ((i & 8) != 0) {
            number3 = c48032uCl.copydefault;
        }
        return c48032uCl.EZpvd(j2, number4, number5, number3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Number AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48032uCl EZpvd(long j, @NotNull java.lang.Number number, @NotNull java.lang.Number number2, @NotNull java.lang.Number number3) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(number2, "");
        Intrinsics.checkNotNullParameter(number3, "");
        return new C48032uCl(j, number, number2, number3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Number OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Number copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48032uCl)) {
            return false;
        }
        C48032uCl c48032uCl = (C48032uCl) obj;
        return this.OLrzqt == c48032uCl.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, c48032uCl.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c48032uCl.KWHzl) && Intrinsics.EZpvd(this.copydefault, c48032uCl.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PnlChartDataPoint(timestamp=" + this.OLrzqt + ", pnl=" + this.AEQbTJ + ", pnlRatio=" + this.KWHzl + ", value=" + this.copydefault + ")";
    }

    public C48032uCl(long j, @NotNull java.lang.Number number, @NotNull java.lang.Number number2, @NotNull java.lang.Number number3) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(number2, "");
        Intrinsics.checkNotNullParameter(number3, "");
        this.OLrzqt = j;
        this.AEQbTJ = number;
        this.KWHzl = number2;
        this.copydefault = number3;
    }

    /* JADX INFO: renamed from: o.uCl$TaskDescription */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
