package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class TeeRemoveRequest {
    public static final int $stable = 0;
    private final String accountId;
    private final TeeRemoveReqItemData teeRequest;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeRemoveRequest copy$default(TeeRemoveRequest teeRemoveRequest, String str, TeeRemoveReqItemData teeRemoveReqItemData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teeRemoveRequest.accountId;
        }
        if ((i & 2) != 0) {
            teeRemoveReqItemData = teeRemoveRequest.teeRequest;
        }
        return teeRemoveRequest.copy(str, teeRemoveReqItemData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeRemoveReqItemData component2() {
        return this.teeRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeRemoveRequest copy(@NotNull String str, @NotNull TeeRemoveReqItemData teeRemoveReqItemData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(teeRemoveReqItemData, "");
        return new TeeRemoveRequest(str, teeRemoveReqItemData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeRemoveRequest)) {
            return false;
        }
        TeeRemoveRequest teeRemoveRequest = (TeeRemoveRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) teeRemoveRequest.accountId) && Intrinsics.EZpvd(this.teeRequest, teeRemoveRequest.teeRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeRemoveReqItemData getTeeRequest() {
        return this.teeRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.accountId.hashCode() * 31) + this.teeRequest.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeRemoveRequest(accountId=" + this.accountId + ", teeRequest=" + this.teeRequest + ")";
    }

    public TeeRemoveRequest(@NotNull String str, @NotNull TeeRemoveReqItemData teeRemoveReqItemData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(teeRemoveReqItemData, "");
        this.accountId = str;
        this.teeRequest = teeRemoveReqItemData;
    }
}
