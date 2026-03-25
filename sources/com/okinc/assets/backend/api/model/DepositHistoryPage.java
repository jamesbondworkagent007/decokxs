package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositHistoryPage {
    public static final int $stable = 8;
    private final int currentPage;
    private final int pageLength;
    private final List<HistoryItem> rechargeHistory;
    private final int total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.DepositHistoryPage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DepositHistoryPage copy$default(DepositHistoryPage depositHistoryPage, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = depositHistoryPage.currentPage;
        }
        if ((i4 & 2) != 0) {
            i2 = depositHistoryPage.pageLength;
        }
        if ((i4 & 4) != 0) {
            i3 = depositHistoryPage.total;
        }
        if ((i4 & 8) != 0) {
            list = depositHistoryPage.rechargeHistory;
        }
        return depositHistoryPage.copy(i, i2, i3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryItem> component4() {
        return this.rechargeHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositHistoryPage copy(int i, int i2, int i3, @NotNull List<HistoryItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DepositHistoryPage(i, i2, i3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositHistoryPage)) {
            return false;
        }
        DepositHistoryPage depositHistoryPage = (DepositHistoryPage) obj;
        return this.currentPage == depositHistoryPage.currentPage && this.pageLength == depositHistoryPage.pageLength && this.total == depositHistoryPage.total && Intrinsics.EZpvd(this.rechargeHistory, depositHistoryPage.rechargeHistory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageLength() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryItem> getRechargeHistory() {
        return this.rechargeHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.currentPage) * 31) + Integer.hashCode(this.pageLength)) * 31) + Integer.hashCode(this.total)) * 31) + this.rechargeHistory.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositHistoryPage(currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ", total=" + this.total + ", rechargeHistory=" + this.rechargeHistory + ")";
    }

    public DepositHistoryPage(int i, int i2, int i3, @NotNull List<HistoryItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.currentPage = i;
        this.pageLength = i2;
        this.total = i3;
        this.rechargeHistory = list;
    }
}
