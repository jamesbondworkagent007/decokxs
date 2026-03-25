package o;

import com.okinc.tradeapi.bean.IndexTickersData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qun, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41650qun implements InterfaceC40516qYt {
    public final java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final IndexTickersData OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41650qun copy$default(C41650qun c41650qun, java.lang.String str, java.lang.String str2, java.lang.String str3, IndexTickersData indexTickersData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c41650qun.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c41650qun.EZpvd;
        }
        if ((i & 4) != 0) {
            str3 = c41650qun.KWHzl;
        }
        if ((i & 8) != 0) {
            indexTickersData = c41650qun.OLrzqt;
        }
        return c41650qun.OLrzqt(str, str2, str3, indexTickersData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IndexTickersData KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41650qun OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull IndexTickersData indexTickersData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(indexTickersData, "");
        return new C41650qun(str, str2, str3, indexTickersData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41650qun)) {
            return false;
        }
        C41650qun c41650qun = (C41650qun) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c41650qun.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c41650qun.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c41650qun.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c41650qun.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.lang.String str = this.EZpvd;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OptionsChainSimpleItemVo(name=" + this.AEQbTJ + ", iconUrl=" + this.EZpvd + ", price=" + this.KWHzl + ", rawIndexTickersData=" + this.OLrzqt + ")";
    }

    public C41650qun(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull IndexTickersData indexTickersData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(indexTickersData, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.OLrzqt = indexTickersData;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
