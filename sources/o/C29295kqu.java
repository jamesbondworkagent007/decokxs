package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagUiModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29295kqu implements kMU {
    public static final int KWHzl = TokenBase.$stable;
    public final SignalMultiplierTagUiModel AEQbTJ;
    public final java.lang.String AYXKKw;
    public final TokenBase AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMultiplierTagUiModel AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29295kqu KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull SignalMultiplierTagUiModel signalMultiplierTagUiModel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(signalMultiplierTagUiModel, "");
        return new C29295kqu(str, str2, str3, str4, str5, str6, str7, signalMultiplierTagUiModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29295kqu)) {
            return false;
        }
        C29295kqu c29295kqu = (C29295kqu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c29295kqu.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c29295kqu.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c29295kqu.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c29295kqu.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c29295kqu.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c29295kqu.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c29295kqu.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c29295kqu.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.djBIcL.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalGemUiModel(tokenSymbol=" + this.djBIcL + ", tokenLogoUrl=" + this.valueOf + ", tokenContractAddress=" + this.AYXKKw + ", tokenChainId=" + this.gEmmrt + ", timestamp=" + this.EZpvd + ", maxIncreasePercentage=" + this.OLrzqt + ", firstSignalTime=" + this.copydefault + ", multiplierTag=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public C29295kqu(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull SignalMultiplierTagUiModel signalMultiplierTagUiModel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(signalMultiplierTagUiModel, "");
        this.djBIcL = str;
        this.valueOf = str2;
        this.AYXKKw = str3;
        this.gEmmrt = str4;
        this.EZpvd = str5;
        this.OLrzqt = str6;
        this.copydefault = str7;
        this.AEQbTJ = signalMultiplierTagUiModel;
        java.lang.String str8 = null;
        this.AhwBna = new TokenBase(str4, str3, str2, null, null, str, null, 0, 0, 0, 0, null, "default_trade", str8, str8, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4136, null);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        C29295kqu c29295kqu = kmu instanceof C29295kqu ? (C29295kqu) kmu : null;
        return c29295kqu != null && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c29295kqu.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c29295kqu.EZpvd);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        C29295kqu c29295kqu = kmu instanceof C29295kqu ? (C29295kqu) kmu : null;
        return c29295kqu != null && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c29295kqu.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c29295kqu.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c29295kqu.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c29295kqu.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c29295kqu.AEQbTJ);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        C29295kqu c29295kqu = kmu instanceof C29295kqu ? (C29295kqu) kmu : null;
        if (c29295kqu == null || compareContent(c29295kqu)) {
            return null;
        }
        return Unit.INSTANCE;
    }
}
