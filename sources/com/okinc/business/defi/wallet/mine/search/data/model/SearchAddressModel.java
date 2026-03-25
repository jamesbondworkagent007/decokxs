package com.okinc.business.defi.wallet.mine.search.data.model;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchAddressModel {
    public static final int $stable = 8;
    private final String address;
    private final ArrayList<Long> chainIndexes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchAddressModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchAddressModel copy$default(SearchAddressModel searchAddressModel, ArrayList arrayList, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = searchAddressModel.chainIndexes;
        }
        if ((i & 2) != 0) {
            str = searchAddressModel.address;
        }
        return searchAddressModel.copy(arrayList, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> component1() {
        return this.chainIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchAddressModel copy(ArrayList<Long> arrayList, String str) {
        return new SearchAddressModel(arrayList, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAddressModel)) {
            return false;
        }
        SearchAddressModel searchAddressModel = (SearchAddressModel) obj;
        return Intrinsics.EZpvd(this.chainIndexes, searchAddressModel.chainIndexes) && Intrinsics.EZpvd((Object) this.address, (Object) searchAddressModel.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> getChainIndexes() {
        return this.chainIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<Long> arrayList = this.chainIndexes;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.address;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchAddressModel(chainIndexes=" + this.chainIndexes + ", address=" + this.address + ")";
    }

    public SearchAddressModel(ArrayList<Long> arrayList, String str) {
        this.chainIndexes = arrayList;
        this.address = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.util.ArrayList<java.lang.Long>, java.lang.String):void (m)] (LINE:85) call: com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressModel.<init>(java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ SearchAddressModel(ArrayList arrayList, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : str);
    }
}
