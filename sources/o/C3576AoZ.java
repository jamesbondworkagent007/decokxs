package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.BuySellTokenType;

/* JADX INFO: renamed from: o.AoZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3576AoZ {
    public static final int $stable = 8;
    public C3795Asg AEQbTJ;
    public C3610ApG EZpvd;
    public BuySellTokenType KWHzl;
    public C3794Asf OLrzqt;
    public C3611ApH copydefault;
    public C3803Aso valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3576AoZ copy$default(C3576AoZ c3576AoZ, C3611ApH c3611ApH, C3610ApG c3610ApG, C3794Asf c3794Asf, BuySellTokenType buySellTokenType, C3803Aso c3803Aso, C3795Asg c3795Asg, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3611ApH = c3576AoZ.copydefault;
        }
        if ((i & 2) != 0) {
            c3610ApG = c3576AoZ.EZpvd;
        }
        C3610ApG c3610ApG2 = c3610ApG;
        if ((i & 4) != 0) {
            c3794Asf = c3576AoZ.OLrzqt;
        }
        C3794Asf c3794Asf2 = c3794Asf;
        if ((i & 8) != 0) {
            buySellTokenType = c3576AoZ.KWHzl;
        }
        BuySellTokenType buySellTokenType2 = buySellTokenType;
        if ((i & 16) != 0) {
            c3803Aso = c3576AoZ.valueOf;
        }
        C3803Aso c3803Aso2 = c3803Aso;
        if ((i & 32) != 0) {
            c3795Asg = c3576AoZ.AEQbTJ;
        }
        return c3576AoZ.EZpvd(c3611ApH, c3610ApG2, c3794Asf2, buySellTokenType2, c3803Aso2, c3795Asg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellTokenType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3576AoZ EZpvd(@NotNull C3611ApH c3611ApH, @NotNull C3610ApG c3610ApG, @NotNull C3794Asf c3794Asf, @NotNull BuySellTokenType buySellTokenType, @NotNull C3803Aso c3803Aso, @NotNull C3795Asg c3795Asg) {
        Intrinsics.checkNotNullParameter(c3611ApH, "");
        Intrinsics.checkNotNullParameter(c3610ApG, "");
        Intrinsics.checkNotNullParameter(c3794Asf, "");
        Intrinsics.checkNotNullParameter(buySellTokenType, "");
        Intrinsics.checkNotNullParameter(c3803Aso, "");
        Intrinsics.checkNotNullParameter(c3795Asg, "");
        return new C3576AoZ(c3611ApH, c3610ApG, c3794Asf, buySellTokenType, c3803Aso, c3795Asg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3795Asg EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3610ApG KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3794Asf OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3611ApH copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3803Aso djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3576AoZ)) {
            return false;
        }
        C3576AoZ c3576AoZ = (C3576AoZ) obj;
        return Intrinsics.EZpvd(this.copydefault, c3576AoZ.copydefault) && Intrinsics.EZpvd(this.EZpvd, c3576AoZ.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c3576AoZ.OLrzqt) && this.KWHzl == c3576AoZ.KWHzl && Intrinsics.EZpvd(this.valueOf, c3576AoZ.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, c3576AoZ.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BasicValidationData(amounts=" + this.copydefault + ", ranges=" + this.EZpvd + ", dexLimit=" + this.OLrzqt + ", tokenType=" + this.KWHzl + ", uiState=" + this.valueOf + ", formatter=" + this.AEQbTJ + ")";
    }

    public C3576AoZ(@NotNull C3611ApH c3611ApH, @NotNull C3610ApG c3610ApG, @NotNull C3794Asf c3794Asf, @NotNull BuySellTokenType buySellTokenType, @NotNull C3803Aso c3803Aso, @NotNull C3795Asg c3795Asg) {
        Intrinsics.checkNotNullParameter(c3611ApH, "");
        Intrinsics.checkNotNullParameter(c3610ApG, "");
        Intrinsics.checkNotNullParameter(c3794Asf, "");
        Intrinsics.checkNotNullParameter(buySellTokenType, "");
        Intrinsics.checkNotNullParameter(c3803Aso, "");
        Intrinsics.checkNotNullParameter(c3795Asg, "");
        this.copydefault = c3611ApH;
        this.EZpvd = c3610ApG;
        this.OLrzqt = c3794Asf;
        this.KWHzl = buySellTokenType;
        this.valueOf = c3803Aso;
        this.AEQbTJ = c3795Asg;
    }
}
