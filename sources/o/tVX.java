package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tVX implements InterfaceC46484tWa {
    public final long AEQbTJ;
    public final java.lang.Number KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ tVX copy$default(tVX tvx, long j, java.lang.Number number, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = tvx.AEQbTJ;
        }
        if ((i & 2) != 0) {
            number = tvx.KWHzl;
        }
        return tvx.EZpvd(j, number);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final tVX EZpvd(long j, @NotNull java.lang.Number number) {
        Intrinsics.checkNotNullParameter(number, "");
        return new tVX(j, number);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46484tWa
    public java.lang.Number KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46484tWa
    public long OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tVX)) {
            return false;
        }
        tVX tvx = (tVX) obj;
        return this.AEQbTJ == tvx.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, tvx.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChartDataDto(timestamp=" + this.AEQbTJ + ", value=" + this.KWHzl + ")";
    }

    public tVX(long j, @NotNull java.lang.Number number) {
        Intrinsics.checkNotNullParameter(number, "");
        this.AEQbTJ = j;
        this.KWHzl = number;
    }
}
