package o;

import com.okinc.unify_trade.biz.subscribe.FundingRateData;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49419uoG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54086wxi implements InterfaceC54501xKt<FundingRateData, AbstractC49419uoG.ActionBar> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public AbstractC49419uoG.ActionBar KWHzl(@NotNull FundingRateData fundingRateData) {
        Intrinsics.checkNotNullParameter(fundingRateData, "");
        AbstractC49419uoG.ActionBar actionBar = new AbstractC49419uoG.ActionBar();
        actionBar.KWHzl(fundingRateData.getInstType());
        actionBar.OLrzqt(fundingRateData.getInstId());
        actionBar.AEQbTJ(fundingRateData.getFundingRate());
        actionBar.valueOf(fundingRateData.getNextFundingRate());
        actionBar.AhwBna(fundingRateData.getRealizedRate());
        actionBar.copydefault(fundingRateData.getFundingTime());
        actionBar.djBIcL(fundingRateData.getMinFundingRate());
        actionBar.EZpvd(fundingRateData.getMaxFundingRate());
        actionBar.isConnected(fundingRateData.getSettState());
        actionBar.DbNXlk(fundingRateData.getSettFundingRate());
        actionBar.AYXKKw(fundingRateData.getMethod());
        return actionBar;
    }
}
