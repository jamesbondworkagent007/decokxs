package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39995qFl implements InterfaceC40516qYt {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final UpDownColor OLrzqt;
    public final java.lang.CharSequence copydefault;
    public final TradingStrategy gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39995qFl copy$default(C39995qFl c39995qFl, TradingStrategy tradingStrategy, java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.lang.String str3, UpDownColor upDownColor, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradingStrategy = c39995qFl.gEmmrt;
        }
        if ((i & 2) != 0) {
            str = c39995qFl.KWHzl;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            charSequence = c39995qFl.copydefault;
        }
        java.lang.CharSequence charSequence2 = charSequence;
        if ((i & 8) != 0) {
            str2 = c39995qFl.valueOf;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = c39995qFl.AEQbTJ;
        }
        java.lang.String str6 = str3;
        if ((i & 32) != 0) {
            upDownColor = c39995qFl.OLrzqt;
        }
        UpDownColor upDownColor2 = upDownColor;
        if ((i & 64) != 0) {
            z = c39995qFl.EZpvd;
        }
        return c39995qFl.OLrzqt(tradingStrategy, str4, charSequence2, str5, str6, upDownColor2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39995qFl OLrzqt(@NotNull TradingStrategy tradingStrategy, @NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull UpDownColor upDownColor, boolean z) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        return new C39995qFl(tradingStrategy, str, charSequence, str2, str3, upDownColor, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingStrategy copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39995qFl)) {
            return false;
        }
        C39995qFl c39995qFl = (C39995qFl) obj;
        return Intrinsics.EZpvd(this.gEmmrt, c39995qFl.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c39995qFl.KWHzl) && Intrinsics.EZpvd(this.copydefault, c39995qFl.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c39995qFl.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c39995qFl.AEQbTJ) && this.OLrzqt == c39995qFl.OLrzqt && this.EZpvd == c39995qFl.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.gEmmrt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        TradingStrategy tradingStrategy = this.gEmmrt;
        java.lang.String str = this.KWHzl;
        java.lang.CharSequence charSequence = this.copydefault;
        return "SearchResultBotVo(po=" + tradingStrategy + ", icon=" + str + ", coinName=" + ((java.lang.Object) charSequence) + ", strategyType=" + this.valueOf + ", annualizedYieldValue=" + this.AEQbTJ + ", annualizedYieldColor=" + this.OLrzqt + ", isShowAnnualizedYieldValue=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.EZpvd;
    }

    public C39995qFl(@NotNull TradingStrategy tradingStrategy, @NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull UpDownColor upDownColor, boolean z) {
        Intrinsics.checkNotNullParameter(tradingStrategy, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        this.gEmmrt = tradingStrategy;
        this.KWHzl = str;
        this.copydefault = charSequence;
        this.valueOf = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = upDownColor;
        this.EZpvd = z;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39995qFl) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39995qFl) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
