package o;

import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40006qFw implements InterfaceC40516qYt {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final SearchTrader OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.CharSequence djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40006qFw copy$default(C40006qFw c40006qFw, SearchTrader searchTrader, java.lang.String str, java.lang.String str2, java.lang.CharSequence charSequence, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            searchTrader = c40006qFw.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c40006qFw.KWHzl;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = c40006qFw.copydefault;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            charSequence = c40006qFw.djBIcL;
        }
        java.lang.CharSequence charSequence2 = charSequence;
        if ((i & 16) != 0) {
            str3 = c40006qFw.AEQbTJ;
        }
        java.lang.String str6 = str3;
        if ((i & 32) != 0) {
            z = c40006qFw.EZpvd;
        }
        return c40006qFw.KWHzl(searchTrader, str4, str5, charSequence2, str6, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchTrader EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40006qFw KWHzl(@NotNull SearchTrader searchTrader, java.lang.String str, java.lang.String str2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(searchTrader, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C40006qFw(searchTrader, str, str2, charSequence, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40006qFw)) {
            return false;
        }
        C40006qFw c40006qFw = (C40006qFw) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c40006qFw.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c40006qFw.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c40006qFw.copydefault) && Intrinsics.EZpvd(this.djBIcL, c40006qFw.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c40006qFw.AEQbTJ) && this.EZpvd == c40006qFw.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.djBIcL.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        SearchTrader searchTrader = this.OLrzqt;
        java.lang.String str = this.KWHzl;
        java.lang.String str2 = this.copydefault;
        java.lang.CharSequence charSequence = this.djBIcL;
        return "SearchResultTraderVo(po=" + searchTrader + ", avatarUrl=" + str + ", avatarId=" + str2 + ", traderName=" + ((java.lang.Object) charSequence) + ", takeValue=" + this.AEQbTJ + ", isTrader=" + this.EZpvd + ")";
    }

    public C40006qFw(@NotNull SearchTrader searchTrader, java.lang.String str, java.lang.String str2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(searchTrader, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = searchTrader;
        this.KWHzl = str;
        this.copydefault = str2;
        this.djBIcL = charSequence;
        this.AEQbTJ = str3;
        this.EZpvd = z;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40006qFw) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40006qFw) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
