package com.okinc.business.defi.wallet.mine.search.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchDAppInfo {
    public static final int $stable = 8;
    private final List<SearchDAppChainInfo> chains;
    private final Long id;
    private final String logo;
    private final String name;
    private final List<String> tagsNameList;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchDAppInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchDAppInfo copy$default(SearchDAppInfo searchDAppInfo, Long l, String str, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = searchDAppInfo.id;
        }
        if ((i & 2) != 0) {
            str = searchDAppInfo.logo;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = searchDAppInfo.name;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = searchDAppInfo.url;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list = searchDAppInfo.tagsNameList;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = searchDAppInfo.chains;
        }
        return searchDAppInfo.copy(l, str4, str5, str6, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.tagsNameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchDAppChainInfo> component6() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchDAppInfo copy(Long l, String str, String str2, String str3, List<String> list, List<SearchDAppChainInfo> list2) {
        return new SearchDAppInfo(l, str, str2, str3, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchDAppInfo)) {
            return false;
        }
        SearchDAppInfo searchDAppInfo = (SearchDAppInfo) obj;
        return Intrinsics.EZpvd(this.id, searchDAppInfo.id) && Intrinsics.EZpvd((Object) this.logo, (Object) searchDAppInfo.logo) && Intrinsics.EZpvd((Object) this.name, (Object) searchDAppInfo.name) && Intrinsics.EZpvd((Object) this.url, (Object) searchDAppInfo.url) && Intrinsics.EZpvd(this.tagsNameList, searchDAppInfo.tagsNameList) && Intrinsics.EZpvd(this.chains, searchDAppInfo.chains);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchDAppChainInfo> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTagsNameList() {
        return this.tagsNameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.id;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.logo;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.url;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        List<String> list = this.tagsNameList;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        List<SearchDAppChainInfo> list2 = this.chains;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchDAppInfo(id=" + this.id + ", logo=" + this.logo + ", name=" + this.name + ", url=" + this.url + ", tagsNameList=" + this.tagsNameList + ", chains=" + this.chains + ")";
    }

    public SearchDAppInfo(Long l, String str, String str2, String str3, List<String> list, List<SearchDAppChainInfo> list2) {
        this.id = l;
        this.logo = str;
        this.name = str2;
        this.url = str3;
        this.tagsNameList = list;
        this.chains = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppChainInfo>):void (m)] (LINE:96) call: com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppInfo.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SearchDAppInfo(Long l, String str, String str2, String str3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2);
    }
}
