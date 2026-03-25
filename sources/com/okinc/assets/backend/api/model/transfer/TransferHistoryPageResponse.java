package com.okinc.assets.backend.api.model.transfer;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class TransferHistoryPageResponse {
    public static final int $stable = 8;
    private final int currentPage;
    private final List<TransferHistory> list;
    private final int pageLength;
    private final int total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.transfer.TransferHistoryPageResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferHistoryPageResponse copy$default(TransferHistoryPageResponse transferHistoryPageResponse, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = transferHistoryPageResponse.currentPage;
        }
        if ((i4 & 2) != 0) {
            i2 = transferHistoryPageResponse.pageLength;
        }
        if ((i4 & 4) != 0) {
            i3 = transferHistoryPageResponse.total;
        }
        if ((i4 & 8) != 0) {
            list = transferHistoryPageResponse.list;
        }
        return transferHistoryPageResponse.copy(i, i2, i3, list);
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
    public final List<TransferHistory> component4() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferHistoryPageResponse copy(int i, int i2, int i3, @NotNull List<TransferHistory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TransferHistoryPageResponse(i, i2, i3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferHistoryPageResponse)) {
            return false;
        }
        TransferHistoryPageResponse transferHistoryPageResponse = (TransferHistoryPageResponse) obj;
        return this.currentPage == transferHistoryPageResponse.currentPage && this.pageLength == transferHistoryPageResponse.pageLength && this.total == transferHistoryPageResponse.total && Intrinsics.EZpvd(this.list, transferHistoryPageResponse.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransferHistory> getList() {
        return this.list;
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
    public int hashCode() {
        return (((((Integer.hashCode(this.currentPage) * 31) + Integer.hashCode(this.pageLength)) * 31) + Integer.hashCode(this.total)) * 31) + this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferHistoryPageResponse(currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ", total=" + this.total + ", list=" + this.list + ")";
    }

    public TransferHistoryPageResponse(int i, int i2, int i3, @NotNull List<TransferHistory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.currentPage = i;
        this.pageLength = i2;
        this.total = i3;
        this.list = list;
    }
}
