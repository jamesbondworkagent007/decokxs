package com.okinc.business.trade.features.home.ui.uistate;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchMemeUiState {
    public static final int $stable = 8;
    private final DexMultiTokenInfoBean currencyTokenInfo;
    private final String errorMessage;
    private final boolean isError;
    private final boolean isLoading;
    private final DexMultiTokenInfoBean tokenInfo;
    private final List<DexMultiTokenInfoBean> tokensList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchMemeUiState() {
        this(false, null, null, null, false, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.trade.features.home.ui.uistate.SearchMemeUiState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMemeUiState copy$default(SearchMemeUiState searchMemeUiState, boolean z, DexMultiTokenInfoBean dexMultiTokenInfoBean, List list, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchMemeUiState.isLoading;
        }
        if ((i & 2) != 0) {
            dexMultiTokenInfoBean = searchMemeUiState.tokenInfo;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean;
        if ((i & 4) != 0) {
            list = searchMemeUiState.tokensList;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            dexMultiTokenInfoBean2 = searchMemeUiState.currencyTokenInfo;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean4 = dexMultiTokenInfoBean2;
        if ((i & 16) != 0) {
            z2 = searchMemeUiState.isError;
        }
        boolean z3 = z2;
        if ((i & 32) != 0) {
            str = searchMemeUiState.errorMessage;
        }
        return searchMemeUiState.copy(z, dexMultiTokenInfoBean3, list2, dexMultiTokenInfoBean4, z3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenInfoBean> component3() {
        return this.tokensList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component4() {
        return this.currencyTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchMemeUiState copy(boolean z, DexMultiTokenInfoBean dexMultiTokenInfoBean, List<DexMultiTokenInfoBean> list, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SearchMemeUiState(z, dexMultiTokenInfoBean, list, dexMultiTokenInfoBean2, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMemeUiState)) {
            return false;
        }
        SearchMemeUiState searchMemeUiState = (SearchMemeUiState) obj;
        return this.isLoading == searchMemeUiState.isLoading && Intrinsics.EZpvd(this.tokenInfo, searchMemeUiState.tokenInfo) && Intrinsics.EZpvd(this.tokensList, searchMemeUiState.tokensList) && Intrinsics.EZpvd(this.currencyTokenInfo, searchMemeUiState.currencyTokenInfo) && this.isError == searchMemeUiState.isError && Intrinsics.EZpvd((Object) this.errorMessage, (Object) searchMemeUiState.errorMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getCurrencyTokenInfo() {
        return this.currencyTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getTokenInfo() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenInfoBean> getTokensList() {
        return this.tokensList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading);
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.tokenInfo;
        int iHashCode2 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        List<DexMultiTokenInfoBean> list = this.tokensList;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.currencyTokenInfo;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isError)) * 31) + this.errorMessage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isError() {
        return this.isError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLoading() {
        return this.isLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchMemeUiState(isLoading=" + this.isLoading + ", tokenInfo=" + this.tokenInfo + ", tokensList=" + this.tokensList + ", currencyTokenInfo=" + this.currencyTokenInfo + ", isError=" + this.isError + ", errorMessage=" + this.errorMessage + ")";
    }

    public SearchMemeUiState(boolean z, DexMultiTokenInfoBean dexMultiTokenInfoBean, List<DexMultiTokenInfoBean> list, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isLoading = z;
        this.tokenInfo = dexMultiTokenInfoBean;
        this.tokensList = list;
        this.currencyTokenInfo = dexMultiTokenInfoBean2;
        this.isError = z2;
        this.errorMessage = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (r6v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.util.List:0x0018: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r7v0 java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) : (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(boolean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.util.List<com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean>, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, boolean, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.trade.features.home.ui.uistate.SearchMemeUiState.<init>(boolean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.util.List, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SearchMemeUiState(boolean z, DexMultiTokenInfoBean dexMultiTokenInfoBean, List list, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : dexMultiTokenInfoBean, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) == 0 ? dexMultiTokenInfoBean2 : null, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? "" : str);
    }
}
