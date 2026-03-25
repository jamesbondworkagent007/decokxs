package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AGg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C2295AGg {
    public static final int $stable = 8;
    public C2305AGq EZpvd;
    public ABG KWHzl;
    public AGC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2295AGg copy$default(C2295AGg c2295AGg, ABG abg, AGC agc, C2305AGq c2305AGq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abg = c2295AGg.KWHzl;
        }
        if ((i & 2) != 0) {
            agc = c2295AGg.copydefault;
        }
        if ((i & 4) != 0) {
            c2305AGq = c2295AGg.EZpvd;
        }
        return c2295AGg.AEQbTJ(abg, agc, c2305AGq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2295AGg AEQbTJ(@NotNull ABG abg, @NotNull AGC agc, @NotNull C2305AGq c2305AGq) {
        Intrinsics.checkNotNullParameter(abg, "");
        Intrinsics.checkNotNullParameter(agc, "");
        Intrinsics.checkNotNullParameter(c2305AGq, "");
        return new C2295AGg(abg, agc, c2305AGq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABG EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2305AGq KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGC OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2295AGg)) {
            return false;
        }
        C2295AGg c2295AGg = (C2295AGg) obj;
        return Intrinsics.EZpvd(this.KWHzl, c2295AGg.KWHzl) && Intrinsics.EZpvd(this.copydefault, c2295AGg.copydefault) && Intrinsics.EZpvd(this.EZpvd, c2295AGg.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PresetData(feeConfig=" + this.KWHzl + ", slippageConfig=" + this.copydefault + ", routeConfig=" + this.EZpvd + ")";
    }

    public C2295AGg(@NotNull ABG abg, @NotNull AGC agc, @NotNull C2305AGq c2305AGq) {
        Intrinsics.checkNotNullParameter(abg, "");
        Intrinsics.checkNotNullParameter(agc, "");
        Intrinsics.checkNotNullParameter(c2305AGq, "");
        this.KWHzl = abg;
        this.copydefault = agc;
        this.EZpvd = c2305AGq;
    }
}
