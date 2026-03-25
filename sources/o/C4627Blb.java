package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.retail_trading.OptionsDirection;

/* JADX INFO: renamed from: o.Blb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4627Blb {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.Double EZpvd;
    public BkP KWHzl;
    public OptionsDirection OLrzqt;
    public java.lang.Double copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4627Blb copy$default(C4627Blb c4627Blb, BkP bkP, java.lang.Double d, OptionsDirection optionsDirection, java.lang.Double d2, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bkP = c4627Blb.KWHzl;
        }
        if ((i & 2) != 0) {
            d = c4627Blb.copydefault;
        }
        java.lang.Double d3 = d;
        if ((i & 4) != 0) {
            optionsDirection = c4627Blb.OLrzqt;
        }
        OptionsDirection optionsDirection2 = optionsDirection;
        if ((i & 8) != 0) {
            d2 = c4627Blb.EZpvd;
        }
        java.lang.Double d4 = d2;
        if ((i & 16) != 0) {
            str = c4627Blb.djBIcL;
        }
        java.lang.String str3 = str;
        if ((i & 32) != 0) {
            z = c4627Blb.AEQbTJ;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            str2 = c4627Blb.gEmmrt;
        }
        return c4627Blb.KWHzl(bkP, d3, optionsDirection2, d4, str3, z2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionsDirection EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4627Blb KWHzl(@NotNull BkP bkP, java.lang.Double d, @NotNull OptionsDirection optionsDirection, java.lang.Double d2, java.lang.String str, boolean z, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(bkP, "");
        Intrinsics.checkNotNullParameter(optionsDirection, "");
        return new C4627Blb(bkP, d, optionsDirection, d2, str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BkP copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4627Blb)) {
            return false;
        }
        C4627Blb c4627Blb = (C4627Blb) obj;
        return Intrinsics.EZpvd(this.KWHzl, c4627Blb.KWHzl) && Intrinsics.EZpvd(this.copydefault, c4627Blb.copydefault) && this.OLrzqt == c4627Blb.OLrzqt && Intrinsics.EZpvd(this.EZpvd, c4627Blb.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c4627Blb.djBIcL) && this.AEQbTJ == c4627Blb.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c4627Blb.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.Double d = this.copydefault;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        java.lang.Double d2 = this.EZpvd;
        int iHashCode4 = d2 == null ? 0 : d2.hashCode();
        java.lang.String str = this.djBIcL;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.String str2 = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QuotationOptionsItemVo(rawInstrument=" + this.KWHzl + ", markPriceValue=" + this.copydefault + ", direction=" + this.OLrzqt + ", changeRatioValue=" + this.EZpvd + ", sortTag=" + this.djBIcL + ", isWatching=" + this.AEQbTJ + ", searchKeyword=" + this.gEmmrt + ")";
    }

    public C4627Blb(@NotNull BkP bkP, java.lang.Double d, @NotNull OptionsDirection optionsDirection, java.lang.Double d2, java.lang.String str, boolean z, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(bkP, "");
        Intrinsics.checkNotNullParameter(optionsDirection, "");
        this.KWHzl = bkP;
        this.copydefault = d;
        this.OLrzqt = optionsDirection;
        this.EZpvd = d2;
        this.djBIcL = str;
        this.AEQbTJ = z;
        this.gEmmrt = str2;
    }
}
