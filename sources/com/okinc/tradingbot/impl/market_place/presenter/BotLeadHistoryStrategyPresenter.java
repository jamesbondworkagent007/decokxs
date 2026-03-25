package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel;
import com.okinc.unify_trade.biz.BotLeadUserOrderHistorySummaryModel;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56270xze;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC54501xKt;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotLeadHistoryStrategyPresenter extends AbsPresenter {
    public final TradeLiveData<List<BotLeadStrateShowData>> EZpvd;
    public final TradeLiveData<Boolean> KWHzl;
    public final C56270xze copydefault;
    public final ArrayList<BotLeadUserOrderHistoryModel> djBIcL;
    public int gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final int AEQbTJ = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<BotLeadStrateShowData>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56270xze OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadHistoryStrategyPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C56270xze();
        this.EZpvd = new TradeLiveData<>();
        this.KWHzl = new TradeLiveData<>();
        this.djBIcL = new ArrayList<>();
        this.gEmmrt = AEQbTJ;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.presenter.BotLeadHistoryStrategyPresenter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final int KWHzl() {
            return BotLeadHistoryStrategyPresenter.AEQbTJ;
        }
    }

    public final void AhwBna() {
        this.gEmmrt = AEQbTJ;
        this.djBIcL.clear();
        djBIcL();
    }

    public final void KWHzl() {
        this.gEmmrt++;
        djBIcL();
    }

    public final void djBIcL() {
        C56270xze c56270xze = this.copydefault;
        c56270xze.OLrzqt(String.valueOf(this.gEmmrt));
        c56270xze.copydefault(C33129mqd.gEmmrt(20));
        c56270xze.AEQbTJ("");
        c56270xze.OLrzqt(this.EZpvd, new TaskDescription());
        xKK.Activity.execute$default(c56270xze, 0L, 1, null);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends BotLeadUserOrderHistorySummaryModel>, List<? extends BotLeadStrateShowData>> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public List<BotLeadStrateShowData> KWHzl(List<BotLeadUserOrderHistorySummaryModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BotLeadUserOrderHistorySummaryModel botLeadUserOrderHistorySummaryModel = (BotLeadUserOrderHistorySummaryModel) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
            List<BotLeadUserOrderHistoryModel> strategies = botLeadUserOrderHistorySummaryModel.getStrategies();
            if (strategies != null) {
                BotLeadHistoryStrategyPresenter.this.djBIcL.addAll(strategies);
            }
            BotLeadHistoryStrategyPresenter.this.copydefault().postValue(Boolean.valueOf(C33129mqd.AEQbTJ(botLeadUserOrderHistorySummaryModel.getTotalCount(), Integer.valueOf(BotLeadHistoryStrategyPresenter.this.djBIcL.size()))));
            BotLeadHistoryStrategyPresenter botLeadHistoryStrategyPresenter = BotLeadHistoryStrategyPresenter.this;
            return botLeadHistoryStrategyPresenter.KWHzl(botLeadHistoryStrategyPresenter.djBIcL);
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.copydefault);
    }

    public final List<BotLeadStrateShowData> KWHzl(ArrayList<BotLeadUserOrderHistoryModel> arrayList) {
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel : arrayList) {
            arrayList2.add(new BotLeadStrateShowData(botLeadUserOrderHistoryModel.getInstId(), botLeadUserOrderHistoryModel.getInstType(), botLeadUserOrderHistoryModel.getAlgoOrdType(), botLeadUserOrderHistoryModel.getDirection(), botLeadUserOrderHistoryModel.getLeverage(), botLeadUserOrderHistoryModel.getFollowerCount(), botLeadUserOrderHistoryModel.getAccumulatedProfitSharing(), botLeadUserOrderHistoryModel.getProfitSharingCcy(), botLeadUserOrderHistoryModel.getAlgoId()));
        }
        return arrayList2;
    }
}
