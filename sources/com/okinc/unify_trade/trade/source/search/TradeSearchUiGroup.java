package com.okinc.unify_trade.trade.source.search;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class TradeSearchUiGroup {
    public static final int $stable = 8;
    private final ArrayList<OkBizSearchInfo> bizInstList;
    private String bizType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<OkBizSearchInfo> getBizInstList() {
        return this.bizInstList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizType = str;
    }

    public TradeSearchUiGroup(@NotNull String str, @NotNull ArrayList<OkBizSearchInfo> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.bizType = str;
        this.bizInstList = arrayList;
    }
}
