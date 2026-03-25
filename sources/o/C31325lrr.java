package o;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31325lrr {
    public final java.lang.String AEQbTJ;
    public final int AYXKKw;
    public final GasPayType AhwBna;
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public final GasLimit OLrzqt;
    public final java.lang.String copydefault;
    public final int djBIcL;
    public final java.lang.String gEmmrt;
    public final GasPrice valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31325lrr EZpvd(GasPayType gasPayType, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, int i2, @NotNull java.lang.String str4, int i3, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        return new C31325lrr(gasPayType, str, str2, i, str3, i2, str4, i3, gasLimit, gasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31325lrr)) {
            return false;
        }
        C31325lrr c31325lrr = (C31325lrr) obj;
        return this.AhwBna == c31325lrr.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31325lrr.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31325lrr.copydefault) && this.djBIcL == c31325lrr.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c31325lrr.EZpvd) && this.KWHzl == c31325lrr.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c31325lrr.gEmmrt) && this.AYXKKw == c31325lrr.AYXKKw && Intrinsics.EZpvd(this.OLrzqt, c31325lrr.OLrzqt) && Intrinsics.EZpvd(this.valueOf, c31325lrr.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        GasPayType gasPayType = this.AhwBna;
        return ((((((((((((((((((gasPayType == null ? 0 : gasPayType.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Integer.hashCode(this.djBIcL)) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UpdateAccountGasInfo(gasPayType=" + this.AhwBna + ", feeTokenAddress=" + this.AEQbTJ + ", feeTokenSymbol=" + this.copydefault + ", paymasterName=" + this.djBIcL + ", feeCoinTypeNo=" + this.EZpvd + ", feeTokenDecimal=" + this.KWHzl + ", nativeTokenCoinTypeNo=" + this.gEmmrt + ", nativeTokenDecimal=" + this.AYXKKw + ", gasLimit=" + this.OLrzqt + ", gasPrice=" + this.valueOf + ")";
    }

    public C31325lrr(GasPayType gasPayType, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, int i2, @NotNull java.lang.String str4, int i3, @NotNull GasLimit gasLimit, @NotNull GasPrice gasPrice) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(gasLimit, "");
        Intrinsics.checkNotNullParameter(gasPrice, "");
        this.AhwBna = gasPayType;
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.djBIcL = i;
        this.EZpvd = str3;
        this.KWHzl = i2;
        this.gEmmrt = str4;
        this.AYXKKw = i3;
        this.OLrzqt = gasLimit;
        this.valueOf = gasPrice;
    }
}
