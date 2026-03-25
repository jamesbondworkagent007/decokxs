package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressModel;
import com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fse, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18980fse {
    public final boolean AEQbTJ;
    public final java.util.List<C18982fsg> AYXKKw;
    public final java.util.List<SearchCompletionUiModel> AhwBna;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.util.List<SearchAddressModel> OLrzqt;
    public final SearchCompletionUiModel copydefault;
    public final java.lang.String gEmmrt;
    public final java.util.List<C18977fsb> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18980fse() {
        this(false, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SearchCompletionUiModel> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C18982fsg> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SearchAddressModel> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C18977fsb> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18980fse OLrzqt(boolean z, java.util.List<C18982fsg> list, java.util.List<SearchCompletionUiModel> list2, java.util.List<SearchAddressModel> list3, java.util.List<C18977fsb> list4, @NotNull java.lang.String str, SearchCompletionUiModel searchCompletionUiModel, @NotNull java.lang.String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C18980fse(z, list, list2, list3, list4, str, searchCompletionUiModel, str2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchCompletionUiModel copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18980fse)) {
            return false;
        }
        C18980fse c18980fse = (C18980fse) obj;
        return this.KWHzl == c18980fse.KWHzl && Intrinsics.EZpvd(this.AYXKKw, c18980fse.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, c18980fse.AhwBna) && Intrinsics.EZpvd(this.OLrzqt, c18980fse.OLrzqt) && Intrinsics.EZpvd(this.valueOf, c18980fse.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c18980fse.EZpvd) && Intrinsics.EZpvd(this.copydefault, c18980fse.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c18980fse.gEmmrt) && this.AEQbTJ == c18980fse.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
        java.util.List<C18982fsg> list = this.AYXKKw;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        java.util.List<SearchCompletionUiModel> list2 = this.AhwBna;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        java.util.List<SearchAddressModel> list3 = this.OLrzqt;
        int iHashCode4 = list3 == null ? 0 : list3.hashCode();
        java.util.List<C18977fsb> list4 = this.valueOf;
        int iHashCode5 = list4 == null ? 0 : list4.hashCode();
        int iHashCode6 = this.EZpvd.hashCode();
        SearchCompletionUiModel searchCompletionUiModel = this.copydefault;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (searchCompletionUiModel != null ? searchCompletionUiModel.hashCode() : 0)) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ResultSearchUiState(isLoading=" + this.KWHzl + ", listToken=" + this.AYXKKw + ", listCompletion=" + this.AhwBna + ", listAddress=" + this.OLrzqt + ", listDApp=" + this.valueOf + ", dAppUrl=" + this.EZpvd + ", correction=" + this.copydefault + ", searchKeyword=" + this.gEmmrt + ", isError=" + this.AEQbTJ + ")";
    }

    public C18980fse(boolean z, java.util.List<C18982fsg> list, java.util.List<SearchCompletionUiModel> list2, java.util.List<SearchAddressModel> list3, java.util.List<C18977fsb> list4, @NotNull java.lang.String str, SearchCompletionUiModel searchCompletionUiModel, @NotNull java.lang.String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = z;
        this.AYXKKw = list;
        this.AhwBna = list2;
        this.OLrzqt = list3;
        this.valueOf = list4;
        this.EZpvd = str;
        this.copydefault = searchCompletionUiModel;
        this.gEmmrt = str2;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r13v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel:?: TERNARY null = ((wrap:int:0x0032: ARITH (r21v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r18v0 com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel) : (null com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r21v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 boolean) : false)
 A[MD:(boolean, java.util.List<o.fsg>, java.util.List<com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel>, java.util.List<com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressModel>, java.util.List<o.fsb>, java.lang.String, com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel, java.lang.String, boolean):void (m)] (LINE:5) call: o.fse.<init>(boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C18980fse(boolean z, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.lang.String str, SearchCompletionUiModel searchCompletionUiModel, java.lang.String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? "" : str, (i & 64) == 0 ? searchCompletionUiModel : null, (i & 128) == 0 ? str2 : "", (i & 256) == 0 ? z2 : false);
    }
}
