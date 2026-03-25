package com.okinc.unify_trade.trade.source.search;

import com.okinc.unify_trade.biz.BizInstrument;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeSearchGroup {
    public static final int $stable = 8;
    private final ArrayList<BizInstrument> bizInstList;
    private final String bizType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BizInstrument> getBizInstList() {
        return this.bizInstList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    public TradeSearchGroup(@NotNull String str, @NotNull ArrayList<BizInstrument> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.bizType = str;
        this.bizInstList = arrayList;
    }
}
