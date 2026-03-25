package com.okinc.tradingbot.impl.market_place.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BotLeadUserOrderPendingModel;
import com.okinc.unify_trade.biz.BotLeadUserOrderPendingSummaryModel;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56271xzf;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC54501xKt;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BotLeadUserOrderPendingPresenter extends AbsPresenter {
    public String AYXKKw;
    public final TradeLiveData<Boolean> EZpvd;
    public final ArrayList<BotLeadUserOrderPendingModel> KWHzl;
    public final C56271xzf OLrzqt;
    public final TradeLiveData<List<HomeStrategyCardInfo>> copydefault;
    public int valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56271xzf KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<HomeStrategyCardInfo>> copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadUserOrderPendingPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new C56271xzf();
        this.copydefault = new TradeLiveData<>();
        this.EZpvd = new TradeLiveData<>();
        this.KWHzl = new ArrayList<>();
        this.valueOf = BotLeadHistoryStrategyPresenter.Companion.KWHzl();
        this.AYXKKw = "";
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.presenter.BotLeadUserOrderPendingPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = BotLeadHistoryStrategyPresenter.Companion.KWHzl();
        this.AYXKKw = str;
        this.KWHzl.clear();
        OLrzqt();
    }

    public final void AEQbTJ() {
        this.valueOf++;
        OLrzqt();
    }

    private final void OLrzqt() {
        C56271xzf c56271xzf = this.OLrzqt;
        c56271xzf.KWHzl(String.valueOf(this.valueOf));
        c56271xzf.copydefault(C33129mqd.gEmmrt(20));
        c56271xzf.OLrzqt(this.AYXKKw);
        c56271xzf.OLrzqt(this.copydefault, new ActionBar());
        xKK.Activity.execute$default(c56271xzf, 0L, 1, null);
    }

    public static final class ActionBar implements InterfaceC54501xKt<List<? extends BotLeadUserOrderPendingSummaryModel>, List<? extends HomeStrategyCardInfo>> {
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ List<? extends HomeStrategyCardInfo> KWHzl(List<? extends BotLeadUserOrderPendingSummaryModel> list) {
            return KWHzl2((List<BotLeadUserOrderPendingSummaryModel>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public List<HomeStrategyCardInfo> KWHzl2(List<BotLeadUserOrderPendingSummaryModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BotLeadUserOrderPendingSummaryModel botLeadUserOrderPendingSummaryModel = (BotLeadUserOrderPendingSummaryModel) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
            List<BotLeadUserOrderPendingModel> strategies = botLeadUserOrderPendingSummaryModel.getStrategies();
            if (strategies != null) {
                BotLeadUserOrderPendingPresenter.this.KWHzl.addAll(strategies);
            }
            BotLeadUserOrderPendingPresenter.this.EZpvd().postValue(Boolean.valueOf(C33129mqd.AEQbTJ(botLeadUserOrderPendingSummaryModel.getTotalCount(), Integer.valueOf(BotLeadUserOrderPendingPresenter.this.KWHzl.size()))));
            BotLeadUserOrderPendingPresenter botLeadUserOrderPendingPresenter = BotLeadUserOrderPendingPresenter.this;
            return botLeadUserOrderPendingPresenter.copydefault(botLeadUserOrderPendingPresenter.KWHzl);
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.OLrzqt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HomeStrategyCardInfo> copydefault(List<BotLeadUserOrderPendingModel> list) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (BotLeadUserOrderPendingModel botLeadUserOrderPendingModel : list) {
            arrayList.add(new HomeStrategyCardInfo(botLeadUserOrderPendingModel.getCTime(), botLeadUserOrderPendingModel.getPnlRatio(), botLeadUserOrderPendingModel.getCurAmt(), botLeadUserOrderPendingModel.getMaxDrawdown(), botLeadUserOrderPendingModel.getUsername(), botLeadUserOrderPendingModel.getFollowerCount(), botLeadUserOrderPendingModel.getAlgoId(), botLeadUserOrderPendingModel.getInstId(), null, botLeadUserOrderPendingModel.getInstType(), botLeadUserOrderPendingModel.getStatus(), Boolean.FALSE, botLeadUserOrderPendingModel.getAlgoOrdType(), botLeadUserOrderPendingModel.getPTime(), botLeadUserOrderPendingModel.getProfitHistory(), botLeadUserOrderPendingModel.getLeverage(), botLeadUserOrderPendingModel.getDirection(), botLeadUserOrderPendingModel.getAvatar(), null, "3", botLeadUserOrderPendingModel.getProfitSharingRatio(), false, botLeadUserOrderPendingModel.getFollowerAssets(), null, null, null, null, 128188672, null));
        }
        return arrayList;
    }
}
