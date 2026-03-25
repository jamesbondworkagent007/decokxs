package com.okinc.assets.backend.api.model.tax;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxDocumentYear {
    public static final int $stable = 8;
    private final List<Integer> yearList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.tax.TaxDocumentYear */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxDocumentYear copy$default(TaxDocumentYear taxDocumentYear, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taxDocumentYear.yearList;
        }
        return taxDocumentYear.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.yearList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxDocumentYear copy(List<Integer> list) {
        return new TaxDocumentYear(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaxDocumentYear) && Intrinsics.EZpvd(this.yearList, ((TaxDocumentYear) obj).yearList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getYearList() {
        return this.yearList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Integer> list = this.yearList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxDocumentYear(yearList=" + this.yearList + ")";
    }

    public TaxDocumentYear(List<Integer> list) {
        this.yearList = list;
    }
}
