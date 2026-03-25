package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BotLeadProfitSummaryModel;
import com.okinc.unify_trade.biz.BotLeadUserOrderPendingModel;
import com.okinc.unify_trade.biz.BotLeadUserOrderPendingSummaryModel;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54507xKz;
import o.C56268xzc;
import o.C56271xzf;
import o.C56403yEb;
import o.InterfaceC54501xKt;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotLeadPendingStrategyPresenter extends AbsPresenter {
    public final C56268xzc AEQbTJ;
    public final TradeLiveData<String> AhwBna;
    public final C56271xzf EZpvd;
    public final TradeLiveData<List<BotLeadStrateShowData>> KWHzl;
    public final TradeLiveData<BotLeadProfitSummaryModel> OLrzqt;
    public final TradeLiveData<Boolean> copydefault;
    public final ArrayList<BotLeadUserOrderPendingModel> djBIcL;
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw() {
        int i = this.gEmmrt;
        if (i > 1) {
            this.gEmmrt = i - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56271xzf EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56268xzc KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotLeadProfitSummaryModel> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<BotLeadStrateShowData>> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadPendingStrategyPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = new C56268xzc();
        this.OLrzqt = new TradeLiveData<>();
        this.EZpvd = new C56271xzf();
        this.KWHzl = new TradeLiveData<>();
        this.copydefault = new TradeLiveData<>();
        this.AhwBna = new TradeLiveData<>();
        this.djBIcL = new ArrayList<>();
        this.gEmmrt = BotLeadHistoryStrategyPresenter.Companion.KWHzl();
    }

    public final void AhwBna() {
        this.gEmmrt = BotLeadHistoryStrategyPresenter.Companion.KWHzl();
        this.djBIcL.clear();
        values();
        valueOf();
    }

    public final void djBIcL() {
        this.gEmmrt++;
        values();
    }

    private final void values() {
        C56271xzf c56271xzf = this.EZpvd;
        c56271xzf.KWHzl(String.valueOf(this.gEmmrt));
        c56271xzf.copydefault(C33129mqd.gEmmrt(20));
        c56271xzf.OLrzqt("");
        c56271xzf.OLrzqt(this.KWHzl, new StateListAnimator());
        xKK.Activity.execute$default(c56271xzf, 0L, 1, null);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends BotLeadUserOrderPendingSummaryModel>, List<? extends BotLeadStrateShowData>> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public List<BotLeadStrateShowData> KWHzl(List<BotLeadUserOrderPendingSummaryModel> list) {
            String totalCount;
            List<BotLeadUserOrderPendingModel> strategies;
            String str = "";
            Intrinsics.checkNotNullParameter(list, "");
            BotLeadUserOrderPendingSummaryModel botLeadUserOrderPendingSummaryModel = (BotLeadUserOrderPendingSummaryModel) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (botLeadUserOrderPendingSummaryModel != null && (strategies = botLeadUserOrderPendingSummaryModel.getStrategies()) != null) {
                BotLeadPendingStrategyPresenter.this.djBIcL.addAll(strategies);
            }
            TradeLiveData<String> tradeLiveDataGEmmrt = BotLeadPendingStrategyPresenter.this.gEmmrt();
            if (botLeadUserOrderPendingSummaryModel != null && (totalCount = botLeadUserOrderPendingSummaryModel.getTotalCount()) != null) {
                str = totalCount;
            }
            tradeLiveDataGEmmrt.postValue(str);
            BotLeadPendingStrategyPresenter.this.AEQbTJ().postValue(Boolean.valueOf(C33129mqd.AEQbTJ(botLeadUserOrderPendingSummaryModel != null ? botLeadUserOrderPendingSummaryModel.getTotalCount() : null, Integer.valueOf(BotLeadPendingStrategyPresenter.this.djBIcL.size()))));
            BotLeadPendingStrategyPresenter botLeadPendingStrategyPresenter = BotLeadPendingStrategyPresenter.this;
            return botLeadPendingStrategyPresenter.EZpvd(botLeadPendingStrategyPresenter.djBIcL);
        }
    }

    public final void valueOf() {
        C56268xzc c56268xzc = this.AEQbTJ;
        c56268xzc.OLrzqt(this.OLrzqt, new C54507xKz());
        xKK.Activity.execute$default(c56268xzc, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AEQbTJ, this.EZpvd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BotLeadStrateShowData> EZpvd(ArrayList<BotLeadUserOrderPendingModel> arrayList) {
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (BotLeadUserOrderPendingModel botLeadUserOrderPendingModel : arrayList) {
            arrayList2.add(new BotLeadStrateShowData(botLeadUserOrderPendingModel.getInstId(), botLeadUserOrderPendingModel.getInstType(), botLeadUserOrderPendingModel.getAlgoOrdType(), botLeadUserOrderPendingModel.getDirection(), botLeadUserOrderPendingModel.getLeverage(), botLeadUserOrderPendingModel.getFollowerCount(), botLeadUserOrderPendingModel.getEstimatedProfitSharing(), botLeadUserOrderPendingModel.getProfitSharingCcy(), botLeadUserOrderPendingModel.getAlgoId()));
        }
        return arrayList2;
    }
}
