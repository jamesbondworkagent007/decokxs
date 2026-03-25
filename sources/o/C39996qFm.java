package o;

import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39996qFm implements InterfaceC40516qYt {
    public final java.lang.CharSequence AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final Product OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39996qFm copy$default(C39996qFm c39996qFm, Product product, java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            product = c39996qFm.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c39996qFm.KWHzl;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            charSequence = c39996qFm.AEQbTJ;
        }
        java.lang.CharSequence charSequence2 = charSequence;
        if ((i & 8) != 0) {
            str2 = c39996qFm.EZpvd;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = c39996qFm.copydefault;
        }
        return c39996qFm.KWHzl(product, str4, charSequence2, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Product EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39996qFm KWHzl(@NotNull Product product, @NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(product, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C39996qFm(product, str, charSequence, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39996qFm)) {
            return false;
        }
        C39996qFm c39996qFm = (C39996qFm) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c39996qFm.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c39996qFm.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c39996qFm.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c39996qFm.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c39996qFm.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        Product product = this.OLrzqt;
        java.lang.String str = this.KWHzl;
        java.lang.CharSequence charSequence = this.AEQbTJ;
        return "SearchResultEarnVo(po=" + product + ", iconUrl=" + str + ", coinName=" + ((java.lang.Object) charSequence) + ", earnType=" + this.EZpvd + ", annualYield=" + this.copydefault + ")";
    }

    public C39996qFm(@NotNull Product product, @NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(product, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = product;
        this.KWHzl = str;
        this.AEQbTJ = charSequence;
        this.EZpvd = str2;
        this.copydefault = str3;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39996qFm) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39996qFm) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
