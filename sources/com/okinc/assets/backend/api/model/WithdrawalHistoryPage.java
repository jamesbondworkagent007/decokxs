package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawalHistoryPage {
    public static final int $stable = 8;
    private final int currentPage;
    private final int pageLength;
    private final int total;
    private final List<WithdrawHis> withdrawHistory;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.WithdrawalHistoryPage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawalHistoryPage copy$default(WithdrawalHistoryPage withdrawalHistoryPage, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = withdrawalHistoryPage.currentPage;
        }
        if ((i4 & 2) != 0) {
            i2 = withdrawalHistoryPage.pageLength;
        }
        if ((i4 & 4) != 0) {
            i3 = withdrawalHistoryPage.total;
        }
        if ((i4 & 8) != 0) {
            list = withdrawalHistoryPage.withdrawHistory;
        }
        return withdrawalHistoryPage.copy(i, i2, i3, list);
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
    public final List<WithdrawHis> component4() {
        return this.withdrawHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawalHistoryPage copy(int i, int i2, int i3, @NotNull List<WithdrawHis> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WithdrawalHistoryPage(i, i2, i3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawalHistoryPage)) {
            return false;
        }
        WithdrawalHistoryPage withdrawalHistoryPage = (WithdrawalHistoryPage) obj;
        return this.currentPage == withdrawalHistoryPage.currentPage && this.pageLength == withdrawalHistoryPage.pageLength && this.total == withdrawalHistoryPage.total && Intrinsics.EZpvd(this.withdrawHistory, withdrawalHistoryPage.withdrawHistory);
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
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawHis> getWithdrawHistory() {
        return this.withdrawHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.currentPage) * 31) + Integer.hashCode(this.pageLength)) * 31) + Integer.hashCode(this.total)) * 31) + this.withdrawHistory.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawalHistoryPage(currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ", total=" + this.total + ", withdrawHistory=" + this.withdrawHistory + ")";
    }

    public WithdrawalHistoryPage(int i, int i2, int i3, @NotNull List<WithdrawHis> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.currentPage = i;
        this.pageLength = i2;
        this.total = i3;
        this.withdrawHistory = list;
    }
}
