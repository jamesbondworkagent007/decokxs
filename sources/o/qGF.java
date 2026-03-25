package o;

import com.okinc.im.bean.SearchResultData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGF {
    public final SearchResultData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ qGF copy$default(qGF qgf, SearchResultData searchResultData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            searchResultData = qgf.copydefault;
        }
        return qgf.EZpvd(searchResultData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultData AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qGF EZpvd(@NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        return new qGF(searchResultData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qGF) && Intrinsics.EZpvd(this.copydefault, ((qGF) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultIMChatPo(rawPo=" + this.copydefault + ")";
    }

    public qGF(@NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        this.copydefault = searchResultData;
    }
}
