package com.okinc.tradingbot.impl.strategy.guide.presenter;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard;
import com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter;
import com.okinc.unify_trade.biz.BannerOrderDetails;
import com.okinc.unify_trade.biz.BotGuideCoinItem;
import com.okinc.unify_trade.biz.GridStatistics;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C53812wsZ;
import o.C53866wta;
import o.C54245xBg;
import o.C54258xBt;
import o.C54507xKz;
import o.C55887xsS;
import o.C56111xwe;
import o.C56202xyP;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotGuideSmartPortfolioDetailPresenter extends AbsPresenter implements IBotGuidePresenter {
    public final C56111xwe<List<BotGuideCoinItem>> AEQbTJ;
    public final C56111xwe<Pair<Boolean, Exception>> AYXKKw;
    public final C53812wsZ AhwBna;
    public final C56111xwe<List<StrategyResponse>> AkhnZx;
    public final MutableLiveData<BannerOrderDetails> DbNXlk;
    public final C56111xwe<IBotGuidePresenter.ButtonState> EZpvd;
    public final C56111xwe<Unit> KWHzl;
    public final C56202xyP OLrzqt;
    public final MutableLiveData<List<GridStatistics>> copydefault;
    public final SmartPortfolioReq djBIcL;
    public String gEmmrt;
    public final C54258xBt isConnected;
    public String valueOf;
    public final C54245xBg values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<StrategyResponse>> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54245xBg AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56202xyP KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<GridStatistics>> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<List<BotGuideCoinItem>> ejfBZ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<IBotGuidePresenter.ButtonState> fARcdN() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<Unit> fJNWhG() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<BannerOrderDetails> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public C56111xwe<Pair<Boolean, Exception>> iwGUEr() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54258xBt valueOf() {
        return this.isConnected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideSmartPortfolioDetailPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = new SmartPortfolioReq((String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "simple", "USDT", "cash", (String) null, (String) null, 12799, (DefaultConstructorMarker) null);
        this.gEmmrt = "";
        this.valueOf = "";
        this.AhwBna = new C53812wsZ();
        this.isConnected = new C54258xBt();
        this.DbNXlk = new MutableLiveData<>();
        this.OLrzqt = new C56202xyP();
        this.copydefault = new MutableLiveData<>();
        this.values = new C54245xBg();
        this.AkhnZx = new C56111xwe<>();
        this.AYXKKw = new C56111xwe<>();
        this.AEQbTJ = new C56111xwe<>();
        this.EZpvd = new C56111xwe<>();
        this.KWHzl = new C56111xwe<>();
    }

    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public void OLrzqt(@NotNull String str, @NotNull C55887xsS c55887xsS, String str2, Bundle bundle) {
        String string;
        String string2;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        if (bundle == null || (string = bundle.getString("title")) == null) {
            string = "";
        }
        this.gEmmrt = string;
        if (bundle != null && (string2 = bundle.getString("algoIndexId")) != null) {
            str3 = string2;
        }
        this.valueOf = str3;
    }

    @Override // com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter
    public Pair<String, String> uzCIH() {
        return new Pair<>(this.gEmmrt, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideSmartPortfolioDetailPresenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuideHeaderCard getGuideHeaderCard$default(BotGuideSmartPortfolioDetailPresenter botGuideSmartPortfolioDetailPresenter, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        return botGuideSmartPortfolioDetailPresenter.KWHzl(list);
    }

    public final GuideHeaderCard KWHzl(@NotNull List<GridStatistics> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C53812wsZ c53812wsZ = this.AhwBna;
        c53812wsZ.copydefault(this.gEmmrt);
        return c53812wsZ.copydefault(list);
    }

    public final void djBIcL() {
        C56202xyP c56202xyP = this.OLrzqt;
        c56202xyP.copydefault("smart_portfolio");
        c56202xyP.AEQbTJ(this.copydefault);
        c56202xyP.OLrzqt(200L);
    }

    public final void AhwBna() {
        C54258xBt c54258xBt = this.isConnected;
        c54258xBt.KWHzl("smart_portfolio");
        c54258xBt.AEQbTJ(this.valueOf);
        c54258xBt.OLrzqt(this.DbNXlk, new C54507xKz());
        xKK.Activity.execute$default(c54258xBt, 0L, 1, null);
    }

    public final ArrayList<TacticsInsideItemData> EZpvd() {
        C53866wta c53866wta = new C53866wta(this.DbNXlk.getValue());
        List<GridStatistics> value = this.copydefault.getValue();
        return c53866wta.KWHzl(value != null ? (GridStatistics) CollectionsKt___CollectionsKt.firstOrNull(value) : null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.values, this.OLrzqt, this.isConnected);
    }
}
