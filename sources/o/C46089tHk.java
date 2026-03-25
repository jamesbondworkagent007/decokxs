package o;

import com.okinc.search.bean.SearchResultContentPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46089tHk implements InterfaceC47828txV {
    public static final int OLrzqt = SearchResultContentPo.SearchResultContentKolPo.$stable;
    public final java.lang.String AEQbTJ;
    public final SearchResultContentPo.SearchResultContentKolPo AYXKKw;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46089tHk copy$default(C46089tHk c46089tHk, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46089tHk.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c46089tHk.djBIcL;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c46089tHk.AEQbTJ;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c46089tHk.EZpvd;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = c46089tHk.KWHzl;
        }
        java.lang.String str9 = str5;
        if ((i & 32) != 0) {
            searchResultContentKolPo = c46089tHk.AYXKKw;
        }
        return c46089tHk.EZpvd(str, str6, str7, str8, str9, searchResultContentKolPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultContentPo.SearchResultContentKolPo AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46089tHk EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C46089tHk(str, str2, str3, str4, str5, searchResultContentKolPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46089tHk)) {
            return false;
        }
        C46089tHk c46089tHk = (C46089tHk) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46089tHk.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c46089tHk.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46089tHk.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46089tHk.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46089tHk.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, c46089tHk.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.String str = this.djBIcL;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        int iHashCode5 = this.KWHzl.hashCode();
        SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (searchResultContentKolPo != null ? searchResultContentKolPo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultContentKolVo(kolId=" + this.copydefault + ", kolName=" + this.djBIcL + ", kolAvatarUrl=" + this.AEQbTJ + ", formatedFollowersCount=" + this.EZpvd + ", bio=" + this.KWHzl + ", rawPo=" + this.AYXKKw + ")";
    }

    public C46089tHk(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, SearchResultContentPo.SearchResultContentKolPo searchResultContentKolPo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.copydefault = str;
        this.djBIcL = str2;
        this.AEQbTJ = str3;
        this.EZpvd = str4;
        this.KWHzl = str5;
        this.AYXKKw = searchResultContentKolPo;
    }

    @Override // o.InterfaceC47828txV
    public boolean copydefault(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        return (interfaceC47828txV instanceof C46089tHk) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C46089tHk) interfaceC47828txV).copydefault);
    }

    @Override // o.InterfaceC47828txV
    public boolean KWHzl(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        return (interfaceC47828txV instanceof C46089tHk) && Intrinsics.EZpvd(this, interfaceC47828txV);
    }
}
