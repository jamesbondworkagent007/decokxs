package o;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18989fsn {
    public final java.lang.String AEQbTJ;
    public final long EZpvd;
    public final SearchHistoryItem KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18989fsn copy$default(C18989fsn c18989fsn, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, SearchHistoryItem searchHistoryItem, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18989fsn.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c18989fsn.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c18989fsn.copydefault;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            j = c18989fsn.EZpvd;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            searchHistoryItem = c18989fsn.KWHzl;
        }
        return c18989fsn.OLrzqt(str, str4, str5, j2, searchHistoryItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchHistoryItem AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18989fsn OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, @NotNull SearchHistoryItem searchHistoryItem) {
        Intrinsics.checkNotNullParameter(searchHistoryItem, "");
        return new C18989fsn(str, str2, str3, j, searchHistoryItem);
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
        if (!(obj instanceof C18989fsn)) {
            return false;
        }
        C18989fsn c18989fsn = (C18989fsn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c18989fsn.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c18989fsn.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c18989fsn.copydefault) && this.EZpvd == c18989fsn.EZpvd && Intrinsics.EZpvd(this.KWHzl, c18989fsn.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.EZpvd)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchHistoryDisplayItem(title=" + this.AEQbTJ + ", info=" + this.OLrzqt + ", iconUrl=" + this.copydefault + ", timestamp=" + this.EZpvd + ", originalItem=" + this.KWHzl + ")";
    }

    public C18989fsn(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, @NotNull SearchHistoryItem searchHistoryItem) {
        Intrinsics.checkNotNullParameter(searchHistoryItem, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.EZpvd = j;
        this.KWHzl = searchHistoryItem;
    }
}
