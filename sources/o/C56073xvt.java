package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.bot.data.BotNoticeData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56073xvt extends DiffUtil.Callback {
    public final java.util.List<java.lang.Object> AEQbTJ;
    public final java.util.List<java.lang.Object> EZpvd;

    public C56073xvt(@NotNull java.util.List<? extends java.lang.Object> list, @NotNull java.util.List<? extends java.lang.Object> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = list;
        this.AEQbTJ = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.EZpvd.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i, int i2) {
        return Intrinsics.EZpvd((java.lang.Object) copydefault(this.AEQbTJ.get(i)), (java.lang.Object) copydefault(this.EZpvd.get(i2)));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i, int i2) {
        java.util.List<StrategyProfitResponse> profitList;
        java.util.List<StrategyProfitResponse> profitList2;
        java.lang.Object obj = this.AEQbTJ.get(i);
        java.lang.Object obj2 = this.EZpvd.get(i2);
        if ((obj instanceof TacticsData) && (obj2 instanceof TacticsData) && Intrinsics.EZpvd(obj, obj2)) {
            TacticsData tacticsData = (TacticsData) obj;
            TacticsData tacticsData2 = (TacticsData) obj2;
            if (tacticsData.getProfitData() == tacticsData2.getProfitData()) {
                MpStgyCopyProfitChangeData profitData = tacticsData.getProfitData();
                StrategyProfitResponse strategyProfitResponse = (profitData == null || (profitList2 = profitData.getProfitList()) == null) ? null : (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(profitList2);
                MpStgyCopyProfitChangeData profitData2 = tacticsData2.getProfitData();
                if (Intrinsics.EZpvd(strategyProfitResponse, (profitData2 == null || (profitList = profitData2.getProfitList()) == null) ? null : (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(profitList)) && tacticsData.getProfitSnapshots() == tacticsData2.getProfitSnapshots()) {
                    java.util.List<StrategyProfitResponse> profitSnapshots = tacticsData.getProfitSnapshots();
                    StrategyProfitResponse strategyProfitResponse2 = profitSnapshots != null ? (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(profitSnapshots) : null;
                    java.util.List<StrategyProfitResponse> profitSnapshots2 = tacticsData2.getProfitSnapshots();
                    if (Intrinsics.EZpvd(strategyProfitResponse2, profitSnapshots2 != null ? (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(profitSnapshots2) : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final java.lang.String copydefault(java.lang.Object obj) {
        return obj instanceof TacticsData ? ((TacticsData) obj).getAlgoId() : obj instanceof BotNoticeData ? ((BotNoticeData) obj).getText() : obj instanceof CommonEmptyData ? ((CommonEmptyData) obj).getMsg() : "";
    }
}
