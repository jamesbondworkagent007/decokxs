package o;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46493tWj implements InterfaceC46504tWu {
    public final java.lang.String AEQbTJ;
    public final BigDecimal EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46493tWj copy$default(C46493tWj c46493tWj, BigDecimal bigDecimal, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = c46493tWj.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c46493tWj.AEQbTJ;
        }
        return c46493tWj.OLrzqt(bigDecimal, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46504tWu
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46504tWu
    public BigDecimal OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46493tWj OLrzqt(@NotNull BigDecimal bigDecimal, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C46493tWj(bigDecimal, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46493tWj)) {
            return false;
        }
        C46493tWj c46493tWj = (C46493tWj) obj;
        return Intrinsics.EZpvd(this.EZpvd, c46493tWj.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46493tWj.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Data(value=" + this.EZpvd + ", label=" + this.AEQbTJ + ")";
    }

    public C46493tWj(@NotNull BigDecimal bigDecimal, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = bigDecimal;
        this.AEQbTJ = str;
    }
}
