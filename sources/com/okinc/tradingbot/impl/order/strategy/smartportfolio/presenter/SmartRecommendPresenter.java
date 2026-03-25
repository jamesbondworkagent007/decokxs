package com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.data.IntroItemData;
import com.okinc.unify_trade.bot.data.RecommendCardData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C53190wgn;
import o.C53193wgq;
import o.C53194wgr;
import o.C56280xzo;
import o.C56402yEa;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SmartRecommendPresenter extends AbsPresenter {
    public static final int copydefault = TradeLiveData.$stable | C56280xzo.KWHzl;
    public final C56280xzo EZpvd;
    public final TradeLiveData<List<SmartRecommendResp>> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<SmartRecommendResp>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56280xzo copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartRecommendPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C56280xzo();
        this.KWHzl = new TradeLiveData<>();
    }

    public static /* synthetic */ void queryRecommendList$default(SmartRecommendPresenter smartRecommendPresenter, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        smartRecommendPresenter.copydefault(str, str2);
    }

    public final void copydefault(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        C56280xzo c56280xzo = this.EZpvd;
        c56280xzo.EZpvd(str2, "official", "smart_portfolio", (56 & 8) != 0 ? null : str, (56 & 16) != 0 ? null : null, (56 & 32) != 0 ? null : null);
        c56280xzo.AEQbTJ(this.KWHzl);
        xKK.Activity.execute$default(c56280xzo, 0L, 1, null);
    }

    public final List<RecommendCardData> AEQbTJ(@NotNull List<SmartRecommendResp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C53194wgr().KWHzl(list);
    }

    public final IntroItemData KWHzl(int i) {
        C53190wgn c53190wgn = new C53190wgn();
        List<SmartRecommendResp> value = this.KWHzl.getValue();
        return c53190wgn.KWHzl(value != null ? (SmartRecommendResp) CollectionsKt___CollectionsKt.AkhnZx(value, i) : null);
    }

    public final SmartPortfolioReq AEQbTJ(int i) {
        C53193wgq c53193wgq = new C53193wgq();
        List<SmartRecommendResp> value = this.KWHzl.getValue();
        return c53193wgq.KWHzl(value != null ? (SmartRecommendResp) CollectionsKt___CollectionsKt.AkhnZx(value, i) : null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.EZpvd);
    }
}
