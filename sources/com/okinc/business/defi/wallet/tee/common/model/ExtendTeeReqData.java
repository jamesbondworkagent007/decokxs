package com.okinc.business.defi.wallet.tee.common.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ExtendTeeReqData {
    public static final int $stable = 8;
    private final List<TeeExtendReqItemData> requestList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.tee.common.model.ExtendTeeReqData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendTeeReqData copy$default(ExtendTeeReqData extendTeeReqData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = extendTeeReqData.requestList;
        }
        return extendTeeReqData.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TeeExtendReqItemData> component1() {
        return this.requestList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendTeeReqData copy(@NotNull List<TeeExtendReqItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ExtendTeeReqData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtendTeeReqData) && Intrinsics.EZpvd(this.requestList, ((ExtendTeeReqData) obj).requestList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TeeExtendReqItemData> getRequestList() {
        return this.requestList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.requestList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExtendTeeReqData(requestList=" + this.requestList + ")";
    }

    public ExtendTeeReqData(@NotNull List<TeeExtendReqItemData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.requestList = list;
    }
}
