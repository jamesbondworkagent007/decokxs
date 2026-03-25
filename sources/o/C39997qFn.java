package o;

import com.okinc.search.bean.SearchResultContentPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39997qFn implements InterfaceC40516qYt {
    public static final int KWHzl = SearchResultContentPo.SearchResultContentKolPo.$stable;
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final SearchResultContentPo.SearchResultContentKolPo gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39997qFn copy$default(C39997qFn c39997qFn, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c39997qFn.AYXKKw;
        }
        if ((i & 2) != 0) {
            str2 = c39997qFn.AhwBna;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c39997qFn.AEQbTJ;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c39997qFn.OLrzqt;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = c39997qFn.EZpvd;
        }
        java.lang.String str9 = str5;
        if ((i & 32) != 0) {
            z = c39997qFn.copydefault;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            searchResultContentKolPo = c39997qFn.gEmmrt;
        }
        return c39997qFn.EZpvd(str, str6, str7, str8, str9, z2, searchResultContentKolPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultContentPo.SearchResultContentKolPo AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39997qFn EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C39997qFn(str, str2, str3, str4, str5, z, searchResultContentKolPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39997qFn)) {
            return false;
        }
        C39997qFn c39997qFn = (C39997qFn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c39997qFn.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c39997qFn.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c39997qFn.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c39997qFn.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c39997qFn.EZpvd) && this.copydefault == c39997qFn.copydefault && Intrinsics.EZpvd(this.gEmmrt, c39997qFn.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        java.lang.String str = this.AhwBna;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        int iHashCode5 = this.EZpvd.hashCode();
        int iHashCode6 = java.lang.Boolean.hashCode(this.copydefault);
        SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (searchResultContentKolPo != null ? searchResultContentKolPo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultContentKolVo(kolId=" + this.AYXKKw + ", kolName=" + this.AhwBna + ", kolAvatarUrl=" + this.AEQbTJ + ", formatedFollowersCount=" + this.OLrzqt + ", bio=" + this.EZpvd + ", isOfficial=" + this.copydefault + ", rawPo=" + this.gEmmrt + ")";
    }

    public C39997qFn(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AYXKKw = str;
        this.AhwBna = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = str4;
        this.EZpvd = str5;
        this.copydefault = z;
        this.gEmmrt = searchResultContentKolPo;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39997qFn) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) ((C39997qFn) interfaceC40516qYt).AYXKKw);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39997qFn) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
