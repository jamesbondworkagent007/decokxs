package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.BscQuickConvertStateVariant;

/* JADX INFO: renamed from: o.Apa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3630Apa {
    public static final int $stable = 8;
    public C3631Apb EZpvd;
    public BscQuickConvertStateVariant OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3630Apa copy$default(C3630Apa c3630Apa, BscQuickConvertStateVariant bscQuickConvertStateVariant, C3631Apb c3631Apb, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bscQuickConvertStateVariant = c3630Apa.OLrzqt;
        }
        if ((i & 2) != 0) {
            c3631Apb = c3630Apa.EZpvd;
        }
        return c3630Apa.AEQbTJ(bscQuickConvertStateVariant, c3631Apb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3630Apa AEQbTJ(@NotNull BscQuickConvertStateVariant bscQuickConvertStateVariant, C3631Apb c3631Apb) {
        Intrinsics.checkNotNullParameter(bscQuickConvertStateVariant, "");
        return new C3630Apa(bscQuickConvertStateVariant, c3631Apb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3631Apb EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BscQuickConvertStateVariant KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3630Apa)) {
            return false;
        }
        C3630Apa c3630Apa = (C3630Apa) obj;
        return this.OLrzqt == c3630Apa.OLrzqt && Intrinsics.EZpvd(this.EZpvd, c3630Apa.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        C3631Apb c3631Apb = this.EZpvd;
        return (iHashCode * 31) + (c3631Apb == null ? 0 : c3631Apb.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BscQuickConvertContentState(variant=" + this.OLrzqt + ", data=" + this.EZpvd + ")";
    }

    public C3630Apa(@NotNull BscQuickConvertStateVariant bscQuickConvertStateVariant, C3631Apb c3631Apb) {
        Intrinsics.checkNotNullParameter(bscQuickConvertStateVariant, "");
        this.OLrzqt = bscQuickConvertStateVariant;
        this.EZpvd = c3631Apb;
    }
}
