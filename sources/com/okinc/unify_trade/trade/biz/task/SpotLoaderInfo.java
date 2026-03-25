package com.okinc.unify_trade.trade.biz.task;

import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SpotLoaderInfo {
    public static final int $stable = 8;
    private final List<InstrumentInfo> bizList;
    private final TradeConfigData config;
    private final List<CountDownInfo> countDownList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.trade.biz.task.SpotLoaderInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotLoaderInfo copy$default(SpotLoaderInfo spotLoaderInfo, List list, TradeConfigData tradeConfigData, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = spotLoaderInfo.bizList;
        }
        if ((i & 2) != 0) {
            tradeConfigData = spotLoaderInfo.config;
        }
        if ((i & 4) != 0) {
            list2 = spotLoaderInfo.countDownList;
        }
        return spotLoaderInfo.copy(list, tradeConfigData, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> component1() {
        return this.bizList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeConfigData component2() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CountDownInfo> component3() {
        return this.countDownList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotLoaderInfo copy(@NotNull List<InstrumentInfo> list, TradeConfigData tradeConfigData, List<CountDownInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SpotLoaderInfo(list, tradeConfigData, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotLoaderInfo)) {
            return false;
        }
        SpotLoaderInfo spotLoaderInfo = (SpotLoaderInfo) obj;
        return Intrinsics.EZpvd(this.bizList, spotLoaderInfo.bizList) && Intrinsics.EZpvd(this.config, spotLoaderInfo.config) && Intrinsics.EZpvd(this.countDownList, spotLoaderInfo.countDownList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentInfo> getBizList() {
        return this.bizList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeConfigData getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CountDownInfo> getCountDownList() {
        return this.countDownList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.bizList.hashCode();
        TradeConfigData tradeConfigData = this.config;
        int iHashCode2 = tradeConfigData == null ? 0 : tradeConfigData.hashCode();
        List<CountDownInfo> list = this.countDownList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotLoaderInfo(bizList=" + this.bizList + ", config=" + this.config + ", countDownList=" + this.countDownList + ")";
    }

    public SpotLoaderInfo(@NotNull List<InstrumentInfo> list, TradeConfigData tradeConfigData, List<CountDownInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.bizList = list;
        this.config = tradeConfigData;
        this.countDownList = list2;
    }
}
