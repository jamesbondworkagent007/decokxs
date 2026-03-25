package o;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fst, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18995fst {
    public final C18980fse AEQbTJ;
    public final SearchRecommendResponse KWHzl;
    public final C19000fsy copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18995fst copy$default(C18995fst c18995fst, C18980fse c18980fse, C19000fsy c19000fsy, SearchRecommendResponse searchRecommendResponse, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c18980fse = c18995fst.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c19000fsy = c18995fst.copydefault;
        }
        if ((i & 4) != 0) {
            searchRecommendResponse = c18995fst.KWHzl;
        }
        return c18995fst.copydefault(c18980fse, c19000fsy, searchRecommendResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18980fse AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchRecommendResponse EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19000fsy KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18995fst copydefault(@NotNull C18980fse c18980fse, @NotNull C19000fsy c19000fsy, SearchRecommendResponse searchRecommendResponse) {
        Intrinsics.checkNotNullParameter(c18980fse, "");
        Intrinsics.checkNotNullParameter(c19000fsy, "");
        return new C18995fst(c18980fse, c19000fsy, searchRecommendResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18995fst)) {
            return false;
        }
        C18995fst c18995fst = (C18995fst) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c18995fst.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c18995fst.copydefault) && Intrinsics.EZpvd(this.KWHzl, c18995fst.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        SearchRecommendResponse searchRecommendResponse = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (searchRecommendResponse == null ? 0 : searchRecommendResponse.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletResultSearchAllUiModel(tokenSearchResult=" + this.AEQbTJ + ", walletSearchResultUiState=" + this.copydefault + ", walletSearchRecommend=" + this.KWHzl + ")";
    }

    public C18995fst(@NotNull C18980fse c18980fse, @NotNull C19000fsy c19000fsy, SearchRecommendResponse searchRecommendResponse) {
        Intrinsics.checkNotNullParameter(c18980fse, "");
        Intrinsics.checkNotNullParameter(c19000fsy, "");
        this.AEQbTJ = c18980fse;
        this.copydefault = c19000fsy;
        this.KWHzl = searchRecommendResponse;
    }
}
