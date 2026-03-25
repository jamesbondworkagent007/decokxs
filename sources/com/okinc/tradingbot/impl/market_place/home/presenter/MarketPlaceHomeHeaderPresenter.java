package com.okinc.tradingbot.impl.market_place.home.presenter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.social_trade_api.data.NmpBannerDto;
import com.okinc.tradingbot.impl.strategy.bean.BotAssetsChartData;
import com.okinc.unify_trade.biz.BotAssetsHistoryData;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.biz.MPBotBannerData;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.biz.bot.LockVoucherResponse;
import com.okinc.unify_trade.core.usecase.algo.ipublic.FetchTradeBotBannerUseCase;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C43251rlk;
import o.C51714vsI;
import o.C55697xoo;
import o.C56071xvr;
import o.C56111xwe;
import o.C56192xyF;
import o.C56203xyQ;
import o.C56405yEd;
import o.InterfaceC54501xKt;
import o.InterfaceC8218ayb;
import o.xAL;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class MarketPlaceHomeHeaderPresenter extends AbsPresenter {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final TradeLiveData<List<MPBotBannerData>> AEQbTJ;
    public final C56192xyF AYXKKw;
    public final C56203xyQ AhwBna;
    public final TradeLiveData<BotUserSummaryData> DbNXlk;
    public final FetchTradeBotBannerUseCase EZpvd;
    public final C56111xwe<List<MpCategory>> KWHzl;
    public MutableStateFlow<List<NmpBannerDto>> copydefault;
    public final xAL djBIcL;
    public final TradeLiveData<BotAssetsChartData> gEmmrt;
    public final C56111xwe<Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotAssetsChartData> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<MpCategory>> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56203xyQ copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xAL djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotUserSummaryData> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<Boolean> valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketPlaceHomeHeaderPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new FetchTradeBotBannerUseCase();
        this.AEQbTJ = new TradeLiveData<>();
        this.copydefault = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.djBIcL = new xAL();
        this.DbNXlk = new TradeLiveData<>();
        this.AhwBna = new C56203xyQ();
        this.gEmmrt = new TradeLiveData<>();
        this.KWHzl = new C56111xwe<>();
        this.valueOf = new C56111xwe<>();
        this.AYXKKw = new C56192xyF();
    }

    public final StateFlow<List<NmpBannerDto>> AhwBna() {
        return FlowKt.asStateFlow(this.copydefault);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.home.presenter.MarketPlaceHomeHeaderPresenter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static /* synthetic */ void fetchHeaderInfo$default(MarketPlaceHomeHeaderPresenter marketPlaceHomeHeaderPresenter, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        marketPlaceHomeHeaderPresenter.OLrzqt(z, z2);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        KWHzl();
        if (z2 && C56071xvr.gEmmrt.getNewProxyInstance()) {
            EZpvd();
        }
        if (z) {
            AEQbTJ();
        }
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new MarketPlaceHomeHeaderPresenter$fetchBanner$1(this, null), 2, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xAL.setReq$default(o.xAL, com.okinc.unify_trade.biz.BotUserSummaryReq, java.lang.Boolean, int, java.lang.Object):void */
    public final void KWHzl() {
        if (!C55697xoo.OLrzqt.isConnected()) {
            this.DbNXlk.postValue(null);
            return;
        }
        xAL xal = this.djBIcL;
        xAL.setReq$default(xal, new BotUserSummaryReq(true, ((InterfaceC8218ayb) C43251rlk.copydefault(InterfaceC8218ayb.class)).OLrzqt().getValue().getUnit(), null, 4, null), null, 2, null);
        xal.AEQbTJ(this.DbNXlk);
        xKK.Activity.execute$default(xal, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull String str, @NotNull Function1<? super ResponseData<List<LockVoucherResponse>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C56192xyF c56192xyF = this.AYXKKw;
        c56192xyF.KWHzl(str);
        c56192xyF.KWHzl(function1);
        xKK.Activity.execute$default(c56192xyF, 0L, 1, null);
    }

    public final void AEQbTJ() {
        if (!C55697xoo.OLrzqt.isConnected()) {
            this.gEmmrt.postValue(null);
            return;
        }
        C56203xyQ c56203xyQ = this.AhwBna;
        c56203xyQ.copydefault("1d");
        c56203xyQ.OLrzqt(this.gEmmrt, new Activity());
        xKK.Activity.execute$default(c56203xyQ, 0L, 1, null);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends BotAssetsHistoryData>, BotAssetsChartData> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public BotAssetsChartData KWHzl(List<BotAssetsHistoryData> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new C51714vsI().KWHzl(C56405yEd.hDKMBd(list));
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.EZpvd, this.djBIcL, this.AhwBna, this.AYXKKw);
    }
}
