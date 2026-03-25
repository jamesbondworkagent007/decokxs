package o;

import com.okinc.im.bean.SearchResultData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40004qFu implements InterfaceC40516qYt {
    public final java.lang.String AEQbTJ;
    public final SearchResultData EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40004qFu copy$default(C40004qFu c40004qFu, java.lang.String str, java.lang.String str2, SearchResultData searchResultData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c40004qFu.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c40004qFu.KWHzl;
        }
        if ((i & 4) != 0) {
            searchResultData = c40004qFu.EZpvd;
        }
        return c40004qFu.KWHzl(str, str2, searchResultData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40004qFu KWHzl(java.lang.String str, java.lang.String str2, @NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        return new C40004qFu(str, str2, searchResultData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultData OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40004qFu)) {
            return false;
        }
        C40004qFu c40004qFu = (C40004qFu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c40004qFu.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c40004qFu.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c40004qFu.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultIMChatItemVo(title=" + this.AEQbTJ + ", subTitle=" + this.KWHzl + ", rawPo=" + this.EZpvd + ")";
    }

    public C40004qFu(java.lang.String str, java.lang.String str2, @NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.EZpvd = searchResultData;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39997qFn) && Intrinsics.EZpvd(interfaceC40516qYt, this);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C39997qFn) && Intrinsics.EZpvd(interfaceC40516qYt, this);
    }
}
