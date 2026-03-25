package com.okinc.tradingbot.impl.strategy.fragment.detail;

import android.app.Application;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.biz.TacticsType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradingbot.impl.botList.domain.model.LLMBotType;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.EditStrategyNameReq;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LossInsurance;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SmartArbHisOrderItem;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.VoucherStatus;
import com.okinc.unify_trade.biz.bot.AiBotDto;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BacktestDto;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.BotStatus;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.bot.data.ContractDcaSpecialData;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.data.TacticsListLabelLeverPrincipalData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import com.okinc.unify_trade.bot.mapper.SignalBotShareDataMapper;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C38303pTu;
import o.C43251rlk;
import o.C48235uJz;
import o.C51056vfn;
import o.C54212xAa;
import o.C54222xAk;
import o.C54301xDi;
import o.C54507xKz;
import o.C54589xNz;
import o.C55688xof;
import o.C55765xqC;
import o.C55794xqf;
import o.C55804xqp;
import o.C55887xsS;
import o.C55924xtC;
import o.C55927xtF;
import o.C55955xth;
import o.C55961xtn;
import o.C55962xto;
import o.C56033xvF;
import o.C56051xvX;
import o.C56059xvf;
import o.C56111xwe;
import o.C56205xyS;
import o.C56235xyw;
import o.C56250xzK;
import o.C56273xzh;
import o.C56283xzr;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56424yEw;
import o.InterfaceC49425uoM;
import o.InterfaceC49429uoQ;
import o.InterfaceC54581xNr;
import o.pTA;
import o.wUL;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsDetailPresenter extends AbsPresenter {
    public String AEQbTJ;
    public StrategyDetailsResponse AYXKKw;
    public C55887xsS AhwBna;
    public String AkhnZx;
    public final TradeLiveData<ArrayList<Object>> AuCTel;
    public final C56273xzh AuCTelauCTel;
    public final C56111xwe<List<StgySourceInfo>> AubY;
    public final List<String> AwvSrB;
    public final SharedFlow<Activity> AxsJAY;
    public final C56283xzr DbNXlk;
    public String EZpvd;
    public Long KWHzl;
    public final TradeLiveData<List<Object>> OLrzqt;
    public final MutableSharedFlow<Activity> copydefault;
    public final C56250xzK djBIcL;
    public final C54222xAk ejfBZ;
    public final TradeLiveData<String> fARcdN;
    public final C56235xyw fIwbmz;
    public String fJNWhG;
    public int fetchVPNInfo;
    public final List<String> gEmmrt;
    public final SavedStateHandle getFieldNames;
    public final TradeLiveData<List<SmartArbHisOrderItem>> getNewProxyInstance;
    public List<StrategyProfitResponse> hDKMBd;
    public final C56205xyS isConnected;
    public final TradeLiveData<BotLeadProfitProfitOrderDetails> iwGUEr;
    public final TradeLiveData<TacticsData> uzCIH;
    public final TradeLiveData<StrategyConfigInfo> valueOf;
    public final C56111xwe<List<ContractGridClosePositionData>> values;
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> wlaJM;
    public final C54301xDi zLjUOn;
    public final C54212xAa zsXlph;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsVoucherType.values().length];
            try {
                iArr[TacticsVoucherType.INTEREST_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsVoucherType.STRATEGY_COMPENSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TacticsVoucherType.AIRDROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDetailsResponse AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> AuCTel() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull List<StrategyProfitResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hDKMBd = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56250xzK djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<SmartArbHisOrderItem>> fARcdN() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<Object>> fJNWhG() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<Object>> gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BotLeadProfitProfitOrderDetails> getFieldNames() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> getNewProxyInstance() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TacticsData> hDKMBd() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<ContractGridClosePositionData>> isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<StgySourceInfo>> iwGUEr() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54301xDi uzCIH() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56283xzr values() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> wlaJM() {
        return this.AxsJAY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsDetailPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.getFieldNames = savedStateHandle;
        this.EZpvd = "";
        this.djBIcL = new C56250xzK();
        this.OLrzqt = new TradeLiveData<>();
        this.zsXlph = new C54212xAa();
        this.AubY = new C56111xwe<>();
        this.AEQbTJ = "";
        this.uzCIH = new TradeLiveData<>();
        this.AkhnZx = "USDT";
        this.zLjUOn = new C54301xDi(true);
        this.wlaJM = new TradeLiveData<>();
        this.AYXKKw = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
        this.isConnected = new C56205xyS();
        this.iwGUEr = new TradeLiveData<>();
        this.AuCTelauCTel = new C56273xzh();
        this.DbNXlk = new C56283xzr();
        this.values = new C56111xwe<>();
        this.fIwbmz = new C56235xyw();
        this.valueOf = new TradeLiveData<>();
        this.AuCTel = new TradeLiveData<>();
        this.fARcdN = new TradeLiveData<>();
        this.hDKMBd = yDY.AhwBna();
        MutableSharedFlow<Activity> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.AxsJAY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AwvSrB = yDY.gEmmrt("smart_portfolio", "recurring");
        this.ejfBZ = new C54222xAk();
        this.getNewProxyInstance = new TradeLiveData<>();
        this.gEmmrt = yDY.gEmmrt("signal_bot", "grid", "spot_dca", "contract_grid", "contract_dca", "smart_portfolio", "smart_arbitrage");
    }

    public final void copydefault(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.AYXKKw = strategyDetailsResponse;
        C55887xsS c55887xsS = new C55887xsS(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId());
        c55887xsS.gEmmrt(strategyDetailsResponse.getTradeQuoteCcy());
        this.AhwBna = c55887xsS;
        this.AuCTel.setValue(yDY.copydefault(zLjUOn()));
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56250xzK c56250xzK = this.djBIcL;
        c56250xzK.AEQbTJ(this.OLrzqt);
        c56250xzK.AEQbTJ(EditStrategyNameReq.Companion.EZpvd(this.EZpvd, str));
        xKK.Activity.execute$default(c56250xzK, 0L, 1, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.unify_trade.biz.bot.BotCommon.copy$default(com.okinc.unify_trade.biz.bot.BotCommon, com.okinc.unify_trade.biz.bot.AutoEarnStakingParam, com.okinc.unify_trade.biz.bot.AutoEarnStakingParam, java.lang.Boolean, java.lang.String, boolean, java.lang.String, int, java.lang.Object):com.okinc.unify_trade.biz.bot.BotCommon */
    public final void valueOf(@NotNull String str) {
        BotCommon botCommon;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = str.length() == 0 ? null : str;
        BotVo bot = this.AYXKKw.getBot();
        if (bot == null || (botCommon = bot.getCommon()) == null) {
            botCommon = new BotCommon((AutoEarnStakingParam) null, (AutoEarnStakingParam) null, (Boolean) null, (String) null, false, (String) null, 63, (DefaultConstructorMarker) null);
        }
        BotCommon botCommonCopy$default = BotCommon.copy$default(botCommon, null, null, null, null, false, str2, 31, null);
        BotVo bot2 = this.AYXKKw.getBot();
        BotVo botVoCopy = bot2 != null ? bot2.copy((PointerIconCompat.TYPE_GRABBING & 1) != 0 ? bot2.smartArbitrage : null, (PointerIconCompat.TYPE_GRABBING & 2) != 0 ? bot2.common : botCommonCopy$default, (PointerIconCompat.TYPE_GRABBING & 4) != 0 ? bot2.userInfo : null, (PointerIconCompat.TYPE_GRABBING & 8) != 0 ? bot2.compliancePauseDisplayType : null, (PointerIconCompat.TYPE_GRABBING & 16) != 0 ? bot2.spotGrid : null, (PointerIconCompat.TYPE_GRABBING & 32) != 0 ? bot2.ai : null, (PointerIconCompat.TYPE_GRABBING & 64) != 0 ? bot2.backtest : null, (PointerIconCompat.TYPE_GRABBING & 128) != 0 ? bot2.contractGrid : null, (PointerIconCompat.TYPE_GRABBING & 256) != 0 ? bot2.spotDca : null, (PointerIconCompat.TYPE_GRABBING & 512) != 0 ? bot2.recurring : null) : null;
        StrategyDetailsResponse strategyDetailsResponse = this.AYXKKw;
        copydefault(strategyDetailsResponse.copy(((-1) & 1) != 0 ? strategyDetailsResponse.instType : null, ((-1) & 2) != 0 ? strategyDetailsResponse.instId : null, ((-1) & 4) != 0 ? strategyDetailsResponse.uly : null, ((-1) & 8) != 0 ? strategyDetailsResponse.ccy : null, ((-1) & 16) != 0 ? strategyDetailsResponse.ctVal : null, ((-1) & 32) != 0 ? strategyDetailsResponse.ordId : null, ((-1) & 64) != 0 ? strategyDetailsResponse.algoId : null, ((-1) & 128) != 0 ? strategyDetailsResponse.cTime : null, ((-1) & 256) != 0 ? strategyDetailsResponse.ordType : null, ((-1) & 512) != 0 ? strategyDetailsResponse.tdMode : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.triggerTime : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.state : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.pxVar : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.pxSpread : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.szLimit : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.pxLimit : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.actualSz : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.sz : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.side : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.posSide : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.timeInterval : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.maxPx : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.minPx : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.gridNum : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.runType : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.quoteSz : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.baseSz : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.tpslTriggerParamResp : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.tpTriggerPx : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.slTriggerPx : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.tpRatio : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.slRatio : null, ((-1) & 1) != 0 ? strategyDetailsResponse.tradeNum : null, ((-1) & 2) != 0 ? strategyDetailsResponse.totalPnl : null, ((-1) & 4) != 0 ? strategyDetailsResponse.pnlRatio : null, ((-1) & 8) != 0 ? strategyDetailsResponse.arbApy : null, ((-1) & 16) != 0 ? strategyDetailsResponse.profitNum : null, ((-1) & 32) != 0 ? strategyDetailsResponse.runTime : null, ((-1) & 64) != 0 ? strategyDetailsResponse.perMinProfitRate : null, ((-1) & 128) != 0 ? strategyDetailsResponse.perMaxProfitRate : null, ((-1) & 256) != 0 ? strategyDetailsResponse.gridProfit : null, ((-1) & 512) != 0 ? strategyDetailsResponse.gridProfitRate : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.totalCycleProfitRate : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.arbitrageProfitRate : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.floatProfit : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.totalAnnualizedRate : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.annualizedRate : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.curQuoteSz : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.curBaseSz : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.cancelType : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.investment : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.lever : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.pTime : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.arbitrageNum : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.avgDailyArbitrageNum : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.singleAmt : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.stopResult : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.runPx : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.stgyName : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.mktCap : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.investAmt : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.uTime : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.cycles : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.amt : null, ((-1) & 1) != 0 ? strategyDetailsResponse.recurringList : null, ((-1) & 2) != 0 ? strategyDetailsResponse.period : null, ((-1) & 4) != 0 ? strategyDetailsResponse.recurringDay : null, ((-1) & 8) != 0 ? strategyDetailsResponse.recurringHour : null, ((-1) & 16) != 0 ? strategyDetailsResponse.nextInvestTime : null, ((-1) & 32) != 0 ? strategyDetailsResponse.investCcy : null, ((-1) & 64) != 0 ? strategyDetailsResponse.recurringTime : null, ((-1) & 128) != 0 ? strategyDetailsResponse.direction : null, ((-1) & 256) != 0 ? strategyDetailsResponse.actualLever : null, ((-1) & 512) != 0 ? strategyDetailsResponse.eq : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.algoOrdType : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.duration : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.investType : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.basePos : false, ((-1) & 16384) != 0 ? strategyDetailsResponse.balType : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.interval : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.deltaRatio : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.balNum : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.portfolioList : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.apy : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.maturedApy : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.avgPx : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.investmentAmt : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.investmentCcy : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.maxSafetyOrds : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.fillSafetyOrds : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.fillManualAddOrds : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.tpPx : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.slPx : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.tpPriceRange : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.completedCycles : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.initOrdAmt : null, ((-1) & 1) != 0 ? strategyDetailsResponse.safetyOrdAmt : null, ((-1) & 2) != 0 ? strategyDetailsResponse.pxSteps : null, ((-1) & 4) != 0 ? strategyDetailsResponse.tpPct : null, ((-1) & 8) != 0 ? strategyDetailsResponse.slPct : null, ((-1) & 16) != 0 ? strategyDetailsResponse.slMode : null, ((-1) & 32) != 0 ? strategyDetailsResponse.pxStepsMult : null, ((-1) & 64) != 0 ? strategyDetailsResponse.volMult : null, ((-1) & 128) != 0 ? strategyDetailsResponse.sourceAlgoId : null, ((-1) & 256) != 0 ? strategyDetailsResponse.stopType : null, ((-1) & 512) != 0 ? strategyDetailsResponse.profit : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.signParams : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.rebateTrans : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.reserveFunds : false, ((-1) & 8192) != 0 ? strategyDetailsResponse.totalCycleProfit : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.arbitragePnl : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.additionalFundNeeded : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.maxBotUsage : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.cycleBaseAmt : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.triggerParams : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.reserveFundingFee : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.transferInMargin : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.ordFrozen : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.availEq : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.initPx : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.perGridProfitRatio : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.activeOrderCount : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.trailingUpConfig : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.trailingDownConfig : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.trailingDownFund : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.gridStatus : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.lmtOrderNumber : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.aggressiveness : null, ((-1) & 1) != 0 ? strategyDetailsResponse.profitSharingRatio : null, ((-1) & 2) != 0 ? strategyDetailsResponse.copyType : null, ((-1) & 4) != 0 ? strategyDetailsResponse.instIds : null, ((-1) & 8) != 0 ? strategyDetailsResponse.totalEquity : null, ((-1) & 16) != 0 ? strategyDetailsResponse.floatingPnl : null, ((-1) & 32) != 0 ? strategyDetailsResponse.actualMarginSz : null, ((-1) & 64) != 0 ? strategyDetailsResponse.extraMarginSz : null, ((-1) & 128) != 0 ? strategyDetailsResponse.usedMargin : null, ((-1) & 256) != 0 ? strategyDetailsResponse.availableMargin : null, ((-1) & 512) != 0 ? strategyDetailsResponse.totalAmt : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.totalPnlRatio : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.realizedPnl : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.signalChanName : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.signalChanId : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.signalCount : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.allowMultipleEntry : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.subOrdType : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.ratio : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.signalOrderAmtParam : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.signalBotOrderStopParam : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.signalSourceType : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.symbolsNumber : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.isHistory : false, ((-1) & 8388608) != 0 ? strategyDetailsResponse.sourceCcy : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.sourceCcySz : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.trackingMode : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.netMarginTransfer : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.feeCcy : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.fundingFee : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.reduce_only : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.outOfRange : false, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.autoMarginReloadSwitch : false, ((-1) & 1) != 0 ? strategyDetailsResponse.autoMarginReloadMaxAmount : null, ((-1) & 2) != 0 ? strategyDetailsResponse.extendedBusinessInfo : null, ((-1) & 4) != 0 ? strategyDetailsResponse.arbPnl : null, ((-1) & 8) != 0 ? strategyDetailsResponse.spreadPnl : null, ((-1) & 16) != 0 ? strategyDetailsResponse.arbList : null, ((-1) & 32) != 0 ? strategyDetailsResponse.preFundingFee : null, ((-1) & 64) != 0 ? strategyDetailsResponse.preAnnualized : null, ((-1) & 128) != 0 ? strategyDetailsResponse.instFamily : null, ((-1) & 256) != 0 ? strategyDetailsResponse.fundingFeeTime : null, ((-1) & 512) != 0 ? strategyDetailsResponse.fundingFeeRatio : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.pnlRatioInSourceCcy : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.totalPnlInSourceCcy : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.floatProfitInSourceCcy : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.gridProfitInSourceCcy : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.arbitrageApy : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.floatProfitRate : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.profitInSourceCcy : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.ruleType : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.isTradeBorrowMode : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.strategyTags : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.voucherInfo : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.stakingPnl : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.stakingPnlUSDT : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.stakingPosCcy : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.stakingPnlApy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.subArbTypes : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.totalInterestAmt : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.debtCcy : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.accountId : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.forbidden : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.hiddenFeatures : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.dcdState : null, ((-1) & 1) != 0 ? strategyDetailsResponse.coinPnl : null, ((-1) & 2) != 0 ? strategyDetailsResponse.notional : null, ((-1) & 4) != 0 ? strategyDetailsResponse.notionalCcy : null, ((-1) & 8) != 0 ? strategyDetailsResponse.settlementAmount : null, ((-1) & 16) != 0 ? strategyDetailsResponse.settlementCcy : null, ((-1) & 32) != 0 ? strategyDetailsResponse.currencyBal : null, ((-1) & 64) != 0 ? strategyDetailsResponse.currency : null, ((-1) & 128) != 0 ? strategyDetailsResponse.avgCost : null, ((-1) & 256) != 0 ? strategyDetailsResponse.cycle : null, ((-1) & 512) != 0 ? strategyDetailsResponse.term : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.alternateCurrency : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.strike : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.strikePercentage : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.stopPrice : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.stopPercentage : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.curStrike : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.dcdOptionType : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.curSettlementTime : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.minAnnualYieldPercentage : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.maxSettlementDay : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.reinvestment : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.lastPrice : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.lastTradeExpireTime : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.lastSettlementSettledTime : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.absYieldPercentage : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.estimatedSettleTime : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.simpleEarn : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.arbitrageTotalPnlInfo : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.leveragePrincipal : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.highestApyPeriod : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.displayMinPaybackDays : false, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.fundingFeeApyList : null, (131067 & 1) != 0 ? strategyDetailsResponse.displayId : null, (131067 & 2) != 0 ? strategyDetailsResponse.tradeQuoteCcy : null, (131067 & 4) != 0 ? strategyDetailsResponse.profitAutoReinvest : null, (131067 & 8) != 0 ? strategyDetailsResponse.profitSnapshots : null, (131067 & 16) != 0 ? strategyDetailsResponse.latestProfit : null, (131067 & 32) != 0 ? strategyDetailsResponse.totalSpreadProfit : null, (131067 & 64) != 0 ? strategyDetailsResponse.totalApy : null, (131067 & 128) != 0 ? strategyDetailsResponse.fee : null, (131067 & 256) != 0 ? strategyDetailsResponse.arbitrageProfit : null, (131067 & 512) != 0 ? strategyDetailsResponse.stakingProfit : null, (131067 & 1024) != 0 ? strategyDetailsResponse.balanceDetails : null, (131067 & 2048) != 0 ? strategyDetailsResponse.liqPx : null, (131067 & 4096) != 0 ? strategyDetailsResponse.bot : botVoCopy, (131067 & 8192) != 0 ? strategyDetailsResponse.effectiveEditParametersDetails : null, (131067 & 16384) != 0 ? strategyDetailsResponse.safetyOrdRatio : null, (131067 & 32768) != 0 ? strategyDetailsResponse.cycleStartTime : null, (131067 & 65536) != 0 ? strategyDetailsResponse.noClosePositionId : null));
        C55804xqp<StrategyDetailsResponse> value = this.wlaJM.getValue();
        if (value != null) {
            this.wlaJM.postValue(new C55804xqp<>(value.OLrzqt(), this.AYXKKw, null, null, 12, null));
        }
    }

    public final void KWHzl(String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            this.getNewProxyInstance.setValue(yDY.AhwBna());
            return;
        }
        C54222xAk c54222xAk = this.ejfBZ;
        c54222xAk.AEQbTJ(this.getNewProxyInstance);
        c54222xAk.KWHzl(str);
        xKK.Activity.execute$default(c54222xAk, 0L, 1, null);
    }

    public final boolean OLrzqt(String str) {
        return this.valueOf.getValue() == null && this.gEmmrt.contains(str);
    }

    public static final CharSequence AEQbTJ(SmartPortfolioListItem smartPortfolioListItem) {
        Intrinsics.checkNotNullParameter(smartPortfolioListItem, "");
        return smartPortfolioListItem.getCcy();
    }

    public final String OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        return CollectionsKt___CollectionsKt.joinToString$default(strategyDetailsResponse.getPortfolioList(), ",", null, null, 0, null, new Function1() { // from class: o.wFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TacticsDetailPresenter.AEQbTJ((SmartPortfolioListItem) obj);
            }
        }, 30, null);
    }

    public final void KWHzl(@NotNull ContractGridClosePositionReq contractGridClosePositionReq) {
        Intrinsics.checkNotNullParameter(contractGridClosePositionReq, "");
        C56283xzr c56283xzr = this.DbNXlk;
        c56283xzr.AEQbTJ(this.values);
        c56283xzr.copydefault(contractGridClosePositionReq);
        xKK.Activity.execute$default(c56283xzr, 0L, 1, null);
    }

    private final String QKVWgx() {
        return (String) this.getFieldNames.get("bot_ord_type");
    }

    public final Boolean zsXlph() {
        return (Boolean) this.getFieldNames.get("backtest");
    }

    public static /* synthetic */ void queryBotDetails$default(TacticsDetailPresenter tacticsDetailPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        tacticsDetailPresenter.copydefault(z);
    }

    public final void copydefault(boolean z) {
        if (Intrinsics.EZpvd(zsXlph(), Boolean.TRUE) && Intrinsics.EZpvd((Object) QKVWgx(), (Object) "ai_bot")) {
            if (z) {
                wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new TacticsDetailPresenter$queryBotDetails$1(this, null), 2, null);
                return;
            } else {
                AxsJAY();
                return;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TacticsDetailPresenter$queryBotDetails$2(this, null), 3, null);
        C54301xDi c54301xDi = this.zLjUOn;
        c54301xDi.AEQbTJ(this.wlaJM);
        c54301xDi.AEQbTJ(this.EZpvd);
        xKK.Activity.execute$default(c54301xDi, 0L, 1, null);
    }

    public final void AxsJAY() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TacticsDetailPresenter$queryBacktestBotDetails$1(this, null), 3, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54212xAa c54212xAa = this.zsXlph;
        c54212xAa.AEQbTJ(this.AubY);
        xKK.Activity.execute$default(c54212xAa.OLrzqt(str), 0L, 1, null);
    }

    public final void EZpvd() {
        if (Intrinsics.EZpvd((Object) this.AYXKKw.getCopyType(), (Object) "3")) {
            C56205xyS c56205xyS = this.isConnected;
            c56205xyS.copydefault(this.EZpvd);
            c56205xyS.djBIcL();
            c56205xyS.OLrzqt(this.iwGUEr, new C54507xKz());
            xKK.Activity.execute$default(c56205xyS, 0L, 1, null);
        }
    }

    public final void gHZMYf() {
        if (Intrinsics.EZpvd((Object) this.AYXKKw.getOrderType(), (Object) "signal_bot")) {
            C56273xzh c56273xzh = this.AuCTelauCTel;
            c56273xzh.EZpvd(this.AYXKKw.getSignalChanId());
            c56273xzh.OLrzqt(this.uzCIH, new SignalBotShareDataMapper(zLjUOn(), SignalBotShareDataMapper.SignalSharePath.BOT_DETAIL));
            xKK.Activity.execute$default(c56273xzh, 0L, 1, null);
            return;
        }
        this.uzCIH.postValue(zLjUOn());
    }

    public final String AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        xMR xmr = xMR.copydefault;
        String strCopydefault = xmr.copydefault(C33129mqd.divS$default(str, "86400000", 0, null, null, 12, null));
        String strRemS$default = C33129mqd.remS$default(str, "86400000", null, null, null, 14, null);
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getCurrentVolume), C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda3), C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, strCopydefault), C56390yDp.OLrzqt("hour", xmr.copydefault(C33129mqd.divS$default(strRemS$default, "3600000", 0, null, null, 12, null))), C56390yDp.OLrzqt("minute", xmr.copydefault(C33129mqd.divS$default(C33129mqd.remS$default(strRemS$default, "3600000", null, null, null, 14, null), "60000", 0, null, null, 12, null)))))), C56390yDp.OLrzqt("unit", copydefault(C33129mqd.valueOf(str2)))));
    }

    public static /* synthetic */ ArrayList getTagList$default(TacticsDetailPresenter tacticsDetailPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return tacticsDetailPresenter.OLrzqt(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [432=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList<TacticsListLabelUiData> OLrzqt(boolean z) {
        LossInsurance lossInsuranceVoucherParam;
        SmartArbListItem smartArbListItem;
        ArrayList<TacticsListLabelUiData> arrayList = new ArrayList<>();
        String ordType = this.AYXKKw.getOrdType();
        if (StringsKt__StringsKt.fARcdN((CharSequence) ordType)) {
            ordType = this.AYXKKw.getAlgoOrdType();
        }
        arrayList.add(new TacticsListLabelData(C56033xvF.iwGUEr(ordType), true, 0, 0, 0, 28, null));
        String orderType = this.AYXKKw.getOrderType();
        String strAYXKKw = "";
        switch (orderType.hashCode()) {
            case -1831183611:
                if (orderType.equals("spot_dca")) {
                    arrayList.add(new TacticsListLabelData(this.AYXKKw.getReserveFunds() ? C33070mpX.AYXKKw(C55688xof.Application.DCUTEI) : C33070mpX.AYXKKw(C55688xof.Application.QHmsKR), false, 0, 0, 0, 30, null));
                }
                break;
            case -1402017003:
                if (orderType.equals("contract_dca")) {
                    String botLever$default = C56033xvF.getBotLever$default(this.AYXKKw.getLever(), false, 2, null);
                    int iValueOf = C56033xvF.valueOf(this.AYXKKw.getDirection());
                    arrayList.add(new TacticsListLabelData(C56033xvF.AhwBna(this.AYXKKw.getDirection()), false, iValueOf, 0, 0, 26, null));
                    arrayList.add(new TacticsListLabelData(botLever$default, false, iValueOf, 0, 0, 26, null));
                }
                break;
            case -1148661171:
                if (orderType.equals("smart_iceberg")) {
                    if (C33129mqd.OLrzqt((CharSequence) C56033xvF.fJNWhG(this.AYXKKw.getTdMode()))) {
                        arrayList.add(new TacticsListLabelData(C56033xvF.fJNWhG(this.AYXKKw.getTdMode()), false, 0, 0, 0, 30, null));
                    }
                    Pair<String, Boolean> pairAYXKKw = C56033xvF.AYXKKw(this.AYXKKw.getInstType(), this.AYXKKw.getSide(), this.AYXKKw.getPosSide());
                    String strComponent1 = pairAYXKKw.component1();
                    int i = pairAYXKKw.component2().booleanValue() ? 14 : 13;
                    arrayList.add(new TacticsListLabelData(strComponent1, false, i, 0, 0, 26, null));
                    if ((!StringsKt__StringsKt.fARcdN((CharSequence) C56033xvF.getBotLever$default(this.AYXKKw.getLever(), false, 2, null))) && !Intrinsics.EZpvd((Object) this.AYXKKw.getInstType(), (Object) "SPOT")) {
                        arrayList.add(new TacticsListLabelData(C56033xvF.getBotLever$default(this.AYXKKw.getLever(), false, 2, null), false, i, 0, 0, 26, null));
                    }
                }
                break;
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    arrayList.add(new TacticsListLabelData(C56033xvF.getBotLever$default(this.AYXKKw.getLever(), false, 2, null), false, 0, 0, 0, 30, null));
                }
                break;
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    Float leverPrincipal = this.AYXKKw.getLeverPrincipal();
                    if (leverPrincipal != null) {
                        float fFloatValue = leverPrincipal.floatValue();
                        String leverPrincipal$default = C56033xvF.formatLeverPrincipal$default(Float.valueOf(fFloatValue), null, 2, null);
                        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(Float.valueOf(fFloatValue));
                        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(this.AYXKKw.getTotalAmt());
                        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
                        ArrayList<SmartArbListItem> arbList = this.AYXKKw.getArbList();
                        String instFamily = (arbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null) ? null : smartArbListItem.getInstFamily();
                        if (instFamily == null) {
                            instFamily = "";
                        }
                        BizInstrument bizInstrumentCopydefault = c56051xvX.copydefault(instFamily, "SWAP");
                        String quoteSymbol = bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getQuoteSymbol() : null;
                        arrayList.add(new TacticsListLabelLeverPrincipalData(leverPrincipal$default, bigDecimalEZpvd, bigDecimalEZpvd2, quoteSymbol == null ? "" : quoteSymbol, false, 0, 0, 0, PsExtractor.VIDEO_STREAM_MASK, null));
                    }
                    if (this.AYXKKw.isArbitrageWithStaking() && !this.AYXKKw.isHistory()) {
                        arrayList.add(new TacticsListLabelData(C33070mpX.AYXKKw(C55688xof.Application.cancelNotification), false, 8, -5, 0, 18, null));
                    }
                }
                break;
            case -512749997:
                if (orderType.equals("contract_grid")) {
                }
                break;
            case 3181382:
                if (orderType.equals("grid")) {
                    TrailingConfig trailingUpConfig = this.AYXKKw.getTrailingUpConfig();
                    TrailingConfig trailingDownConfig = this.AYXKKw.getTrailingDownConfig();
                    if ((trailingUpConfig != null && trailingUpConfig.getEnabled()) || (trailingDownConfig != null && trailingDownConfig.getEnabled())) {
                        arrayList.add(new TacticsListLabelData((trailingUpConfig == null || !trailingUpConfig.getEnabled() || trailingDownConfig == null || !trailingDownConfig.getEnabled()) ? (trailingDownConfig == null || !trailingDownConfig.getEnabled()) ? C33070mpX.AYXKKw(C55688xof.Application.StringDef) : C33070mpX.AYXKKw(C55688xof.Application.Size) : C33070mpX.AYXKKw(C55688xof.Application.max), false, 0, 0, 0, 30, null));
                    }
                }
                break;
            case 3573234:
                if (orderType.equals("twap")) {
                }
                break;
        }
        if (Intrinsics.EZpvd((Object) this.AYXKKw.getCopyType(), (Object) "3")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onPlayFromMediaId);
        } else if (Intrinsics.EZpvd((Object) this.AYXKKw.getCopyType(), (Object) "2")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.izFvvl);
        } else if (C33129mqd.OLrzqt((CharSequence) this.AYXKKw.getSourceAlgoId())) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.sanrWj);
        }
        String str = strAYXKKw;
        if (str.length() > 0 && z) {
            arrayList.add(new TacticsListLabelData(str, false, 10, 0, 0, 26, null));
        }
        TacticsVoucherInfo voucherInfo = this.AYXKKw.getVoucherInfo();
        if (voucherInfo != null) {
            arrayList.add(AEQbTJ(voucherInfo));
        } else {
            ExtendedBusinessInfo extendedBusinessInfo = this.AYXKKw.getExtendedBusinessInfo();
            if (extendedBusinessInfo != null && (lossInsuranceVoucherParam = extendedBusinessInfo.getLossInsuranceVoucherParam()) != null && lossInsuranceVoucherParam.getEligible()) {
                arrayList.add(AEQbTJ(C55794xqf.EZpvd.OLrzqt(lossInsuranceVoucherParam)));
            }
        }
        return arrayList;
    }

    public final TacticsListLabelVoucherData AEQbTJ(TacticsVoucherInfo tacticsVoucherInfo) {
        String strOLrzqt;
        Integer label;
        Integer label2;
        Integer label3;
        TacticsVoucherType voucherType = tacticsVoucherInfo.getVoucherType();
        int i = voucherType == null ? -1 : ActionBar.KWHzl[voucherType.ordinal()];
        String strAYXKKw = null;
        strOLrzqt = "";
        if (i != 1) {
            if (i == 2) {
                String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.HJWChPiaHEvk);
                Pair[] pairArr = new Pair[3];
                xMR xmr = xMR.copydefault;
                String amount = tacticsVoucherInfo.getAmount();
                pairArr[0] = C56390yDp.OLrzqt("num", xmr.copydefault(amount.length() != 0 ? amount : "--"));
                String unit = tacticsVoucherInfo.getUnit();
                pairArr[1] = C56390yDp.OLrzqt("ccy", unit.length() != 0 ? unit : "USDT");
                VoucherStatus voucherStatus = tacticsVoucherInfo.getVoucherStatus();
                if (voucherStatus != null && (label2 = voucherStatus.getLabel()) != null) {
                    strAYXKKw = C33070mpX.AYXKKw(label2.intValue());
                }
                pairArr[2] = C56390yDp.OLrzqt("status", strAYXKKw != null ? strAYXKKw : "");
                strOLrzqt = C33069mpW.OLrzqt(strAYXKKw2, C56424yEw.gEmmrt(pairArr));
            } else if (i == 3) {
                String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.ilfrrN);
                Pair[] pairArr2 = new Pair[3];
                xMR xmr2 = xMR.copydefault;
                String amount2 = tacticsVoucherInfo.getAmount();
                pairArr2[0] = C56390yDp.OLrzqt("num", xmr2.copydefault(amount2.length() != 0 ? amount2 : "--"));
                String unit2 = tacticsVoucherInfo.getUnit();
                pairArr2[1] = C56390yDp.OLrzqt("ccy", unit2.length() != 0 ? unit2 : "USDT");
                VoucherStatus voucherStatus2 = tacticsVoucherInfo.getVoucherStatus();
                if (voucherStatus2 != null && (label3 = voucherStatus2.getLabel()) != null) {
                    strAYXKKw = C33070mpX.AYXKKw(label3.intValue());
                }
                pairArr2[2] = C56390yDp.OLrzqt("status", strAYXKKw != null ? strAYXKKw : "");
                strOLrzqt = C33069mpW.OLrzqt(strAYXKKw3, C56424yEw.gEmmrt(pairArr2));
            }
        } else {
            String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.read);
            Pair[] pairArr3 = new Pair[2];
            pairArr3[0] = C56390yDp.OLrzqt("percent", C56033xvF.fmtBotPnlPercent$default(tacticsVoucherInfo.getVoucherPnlRatio(), false, 0, 6, null));
            VoucherStatus voucherStatus3 = tacticsVoucherInfo.getVoucherStatus();
            if (voucherStatus3 != null && (label = voucherStatus3.getLabel()) != null) {
                strAYXKKw = C33070mpX.AYXKKw(label.intValue());
            }
            pairArr3[1] = C56390yDp.OLrzqt("status", strAYXKKw != null ? strAYXKKw : "");
            strOLrzqt = C33069mpW.OLrzqt(strAYXKKw4, C56424yEw.gEmmrt(pairArr3));
        }
        return new TacticsListLabelVoucherData(strOLrzqt, false, 0, 0, 0, tacticsVoucherInfo, 30, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TacticsData zLjUOn() {
        String instFamily;
        boolean z;
        List<AutoEarnStakingConfig> autoEarn;
        String vipLevel;
        SmartPortfolioConfig smartPortfolioConfig;
        SmartPortfolioConfig smartPortfolioConfig2;
        Boolean boolZLjUOn;
        BacktestDto backtest;
        BacktestDto backtest2;
        BizInstrument suggestedInstrument$default;
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        String orderType = this.AYXKKw.getOrderType();
        ArrayList<SmartArbListItem> arbList = this.AYXKKw.getArbList();
        String strKWHzl = c56059xvf.KWHzl(orderType, arbList != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList) : null, this.AYXKKw.getInstType());
        String orderType2 = this.AYXKKw.getOrderType();
        ArrayList<SmartArbListItem> arbList2 = this.AYXKKw.getArbList();
        String strEZpvd = c56059xvf.EZpvd(orderType2, arbList2 != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList2) : null, this.AYXKKw.getInstId());
        String instFamily2 = this.AYXKKw.getInstFamily();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strKWHzl, strEZpvd, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        String str = (instFamily2 == null || instFamily2.length() == 0) ? instFamily : instFamily2;
        ContractDcaSpecialData contractDcaSpecialData = new ContractDcaSpecialData((String) null, 1, (DefaultConstructorMarker) null);
        if (Intrinsics.EZpvd((Object) this.AYXKKw.getOrderType(), (Object) "contract_dca")) {
            contractDcaSpecialData.setAvgPx(C33129mqd.valueOf(this.AYXKKw.getAvgPx(), 0) ? "--" : this.AYXKKw.getAvgPx());
        }
        ArrayList<RecurringListItem> recurringList = this.AYXKKw.getRecurringList();
        if (this.AYXKKw.isHistory()) {
            z = true;
        } else {
            BotVo bot = this.AYXKKw.getBot();
            if (((bot == null || (backtest2 = bot.getBacktest()) == null) ? null : backtest2.getStatus()) != BotStatus.Completed) {
                BotVo bot2 = this.AYXKKw.getBot();
                if (((bot2 == null || (backtest = bot2.getBacktest()) == null) ? null : backtest.getStatus()) != BotStatus.Failed) {
                    z = false;
                }
            }
        }
        String orderType3 = this.AYXKKw.getOrderType();
        String stgyName = this.AYXKKw.getStgyName();
        String algoId = this.AYXKKw.getAlgoId();
        String minPx = this.AYXKKw.getMinPx();
        String maxPx = this.AYXKKw.getMaxPx();
        String runType = this.AYXKKw.getRunType();
        String strSubS$default = C33129mqd.subS$default(this.AYXKKw.getPTime(), this.AYXKKw.getCTime(), null, null, null, 14, null);
        String gridNum = this.AYXKKw.getGridNum();
        TrailingConfig trailingUpConfig = this.AYXKKw.getTrailingUpConfig();
        TrailingConfig trailingDownConfig = this.AYXKKw.getTrailingDownConfig();
        String trailingDownFund = this.AYXKKw.getTrailingDownFund();
        boolean reserveFunds = this.AYXKKw.getReserveFunds();
        String perGridProfitRatio = this.AYXKKw.getPerGridProfitRatio();
        String perMinProfitRate = this.AYXKKw.getPerMinProfitRate();
        String perMaxProfitRate = this.AYXKKw.getPerMaxProfitRate();
        boolean basePos = this.AYXKKw.getBasePos();
        String botLever$default = C56033xvF.getBotLever$default(this.AYXKKw.getLever(), false, 2, null);
        String direction = this.AYXKKw.getDirection();
        TacticsType tacticsTypeUzCIH = C56033xvF.uzCIH(this.AYXKKw.getAlgoOrdType());
        String tpTriggerPx = this.AYXKKw.getTpTriggerPx();
        String slTriggerPx = this.AYXKKw.getSlTriggerPx();
        TpSlTriggerParam tpSlTriggerParamOLrzqt = C55765xqC.OLrzqt(this.AYXKKw.getTpslTriggerParamResp());
        String tpRatio = this.AYXKKw.getTpRatio();
        String slRatio = this.AYXKKw.getSlRatio();
        String state = this.AYXKKw.getState();
        ArrayList<SignParamItem> signParams = this.AYXKKw.getSignParams();
        ArrayList<SmartPortfolioListItem> portfolioList = this.AYXKKw.getPortfolioList();
        String strAddS$default = C33129mqd.addS$default(this.AYXKKw.getCompletedCycles(), 1, null, null, null, 14, null);
        List<DcaTriggerParam> triggerParams = this.AYXKKw.getTriggerParams();
        String gridStatus = this.AYXKKw.getGridStatus();
        String stopType = this.AYXKKw.getStopType();
        String copyType = this.AYXKKw.getCopyType();
        String profitSharingRatio = this.AYXKKw.getProfitSharingRatio();
        List<String> instIds = this.AYXKKw.getInstIds();
        String profit = this.AYXKKw.getProfit();
        String lever = this.AYXKKw.getLever();
        String symbolsNumber = this.AYXKKw.getSymbolsNumber();
        String balType = this.AYXKKw.getBalType();
        String interval = this.AYXKKw.getInterval();
        String deltaRatio = this.AYXKKw.getDeltaRatio();
        String maxSafetyOrds = this.AYXKKw.getMaxSafetyOrds();
        String pxSteps = this.AYXKKw.getPxSteps();
        String pxStepsMult = this.AYXKKw.getPxStepsMult();
        String volMult = this.AYXKKw.getVolMult();
        String tpPct = this.AYXKKw.getTpPct();
        String slPct = this.AYXKKw.getSlPct();
        String slMode = this.AYXKKw.getSlMode();
        String strFetchVPNInfo = fetchVPNInfo();
        String tpPx = this.AYXKKw.getTpPx();
        String slPx = this.AYXKKw.getSlPx();
        String tpPriceRange = this.AYXKKw.getTpPriceRange();
        String botAmountUnit$default = C56033xvF.getBotAmountUnit$default(this.AYXKKw.getInstType(), this.AYXKKw.getInstId(), "", null, 8, null);
        String signalChanId = this.AYXKKw.getSignalChanId();
        String signalChanName = this.AYXKKw.getSignalChanName();
        String totalPnlRatio = this.AYXKKw.getTotalPnlRatio();
        String signalCount = this.AYXKKw.getSignalCount();
        String pxSpread = this.AYXKKw.getPxSpread();
        String pxVar = this.AYXKKw.getPxVar();
        String pxLimit = this.AYXKKw.getPxLimit();
        String timeInterval = this.AYXKKw.getTimeInterval();
        String szLimit = this.AYXKKw.getSzLimit();
        String sz = this.AYXKKw.getSz();
        String side = this.AYXKKw.getSide();
        String posSide = this.AYXKKw.getPosSide();
        String tdMode = this.AYXKKw.getTdMode();
        String reduce_only = this.AYXKKw.getReduce_only();
        String ccy = this.AYXKKw.getCcy();
        ArrayList tagList$default = getTagList$default(this, false, 1, null);
        boolean autoMarginReloadSwitch = this.AYXKKw.getAutoMarginReloadSwitch();
        String autoMarginReloadMaxAmount = this.AYXKKw.getAutoMarginReloadMaxAmount();
        ArrayList<SmartArbListItem> arbList3 = this.AYXKKw.getArbList();
        boolean outOfRange = this.AYXKKw.getOutOfRange();
        String curBaseSz = this.AYXKKw.getCurBaseSz();
        String curQuoteSz = this.AYXKKw.getCurQuoteSz();
        String sourceCcy = this.AYXKKw.getSourceCcy();
        String str2 = sourceCcy == null ? "" : sourceCcy;
        String sourceCcySz = this.AYXKKw.getSourceCcySz();
        String str3 = sourceCcySz == null ? "" : sourceCcySz;
        String ruleType = this.AYXKKw.getRuleType();
        Boolean boolIsTradeBorrowMode = this.AYXKKw.isTradeBorrowMode();
        ExtendedBusinessInfo extendedBusinessInfo = this.AYXKKw.getExtendedBusinessInfo();
        String totalPnl = this.AYXKKw.getTotalPnl();
        List<Integer> strategyTags = this.AYXKKw.getStrategyTags();
        EntrySignalOrderAmtParam signalOrderAmtParam = this.AYXKKw.getSignalOrderAmtParam();
        ExitSignalOrderAmtParam signalBotOrderStopParam = this.AYXKKw.getSignalBotOrderStopParam();
        boolean zIsArbitrageWithStaking = this.AYXKKw.isArbitrageWithStaking();
        TacticsVoucherInfo voucherInfo = this.AYXKKw.getVoucherInfo();
        ArrayList<String> forbidden = this.AYXKKw.getForbidden();
        if (forbidden == null) {
            forbidden = new ArrayList<>();
        }
        ArrayList<String> arrayList = forbidden;
        String investment = this.AYXKKw.getInvestment();
        String reinvestment = this.AYXKKw.getReinvestment();
        boolean zBooleanValue = (reinvestment == null || (boolZLjUOn = StringsKt__StringsKt.zLjUOn(reinvestment)) == null) ? false : boolZLjUOn.booleanValue();
        ArrayList<String> hiddenFeatures = this.AYXKKw.getHiddenFeatures();
        if (hiddenFeatures == null) {
            hiddenFeatures = new ArrayList<>();
        }
        ArrayList<String> arrayList2 = hiddenFeatures;
        SmartEarnParam simpleEarn = this.AYXKKw.getSimpleEarn();
        String totalAmt = this.AYXKKw.getTotalAmt();
        Float leveragePrincipal = this.AYXKKw.getLeveragePrincipal();
        ShareData shareDataEjfBZ = ejfBZ();
        String tradeQuoteCcy = this.AYXKKw.getTradeQuoteCcy();
        SmartArbProfitsInfo smartArbProfitsInfo = new SmartArbProfitsInfo(this.AYXKKw.getTotalSpreadProfit(), this.AYXKKw.getTotalApy(), this.AYXKKw.getFee(), this.AYXKKw.getTotalInterestAmt(), this.AYXKKw.getDebtCcy(), this.AYXKKw.getArbitrageProfit(), this.AYXKKw.getStakingProfit(), null, null, null, null, 1920, null);
        BalanceDetailInfoDto balanceDetails = this.AYXKKw.getBalanceDetails();
        String liqPx = this.AYXKKw.getLiqPx();
        if (Intrinsics.EZpvd((Object) this.AYXKKw.getOrderType(), (Object) "smart_portfolio")) {
            StrategyConfigInfo value = this.valueOf.getValue();
            autoEarn = (value == null || (smartPortfolioConfig2 = value.getSmartPortfolioConfig()) == null) ? null : smartPortfolioConfig2.getAutoEarn();
            if (autoEarn == null) {
                autoEarn = yDY.AhwBna();
            }
        } else {
            StrategyConfigInfo value2 = this.valueOf.getValue();
            autoEarn = value2 != null ? value2.getAutoEarn() : null;
            if (autoEarn == null) {
                autoEarn = yDY.AhwBna();
            }
        }
        List<AutoEarnStakingConfig> list = autoEarn;
        if (Intrinsics.EZpvd((Object) this.AYXKKw.getOrderType(), (Object) "smart_portfolio")) {
            StrategyConfigInfo value3 = this.valueOf.getValue();
            if (value3 != null && (smartPortfolioConfig = value3.getSmartPortfolioConfig()) != null) {
                autoStaking = smartPortfolioConfig.getAutoStaking();
            }
            if (autoStaking == null) {
                autoStaking = yDY.AhwBna();
            }
        } else {
            StrategyConfigInfo value4 = this.valueOf.getValue();
            autoStaking = value4 != null ? value4.getAutoStaking() : null;
            if (autoStaking == null) {
                autoStaking = yDY.AhwBna();
            }
        }
        List<AutoEarnStakingConfig> list2 = autoStaking;
        StrategyConfigInfo value5 = this.valueOf.getValue();
        return new TacticsData(orderType3, algoId, strKWHzl, strEZpvd, state, null, z, strFetchVPNInfo, tacticsTypeUzCIH, 0, botLever$default, null, 0L, null, null, botAmountUnit$default, null, null, shareDataEjfBZ, null, null, stgyName, direction, tpTriggerPx, slTriggerPx, tpRatio, slRatio, null, recurringList, portfolioList, null, null, null, null, tagList$default, signParams, null, triggerParams, strAddS$default, stopType, tpPx, slPx, tpSlTriggerParamOLrzqt, tpPriceRange, gridStatus, lever, null, null, liqPx, null, null, null, pxSpread, pxVar, pxLimit, timeInterval, szLimit, sz, side, posSide, tdMode, reduce_only, ccy, copyType, profitSharingRatio, null, null, instIds, totalAmt, signalChanId, signalChanName, null, null, totalPnlRatio, signalCount, false, null, null, null, null, profit, symbolsNumber, 1, maxPx, minPx, runType, gridNum, trailingUpConfig, trailingDownConfig, trailingDownFund, Boolean.valueOf(reserveFunds), basePos, perGridProfitRatio, perMinProfitRate, perMaxProfitRate, balType, interval, deltaRatio, maxSafetyOrds, pxSteps, pxStepsMult, volMult, tpPct, slPct, slMode, null, null, autoMarginReloadSwitch, autoMarginReloadMaxAmount, extendedBusinessInfo, str, arbList3, outOfRange, str2, str3, curQuoteSz, curBaseSz, null, ruleType, boolIsTradeBorrowMode, totalPnl, false, strategyTags, signalOrderAmtParam, signalBotOrderStopParam, voucherInfo, arrayList, arrayList2, null, zBooleanValue, null, null, null, strSubS$default, null, zIsArbitrageWithStaking, null, null, null, simpleEarn, null, null, investment, null, null, leveragePrincipal, contractDcaSpecialData, null, false, null, null, null, tradeQuoteCcy, smartArbProfitsInfo, balanceDetails, this.AYXKKw.getBot(), new AutoVipProfitInfo((List) list, (List) list2, (value5 == null || (vipLevel = value5.getVipLevel()) == null) ? "" : vipLevel, false, false, 24, (DefaultConstructorMarker) null), this.AYXKKw.getInitOrdAmt(), this.AYXKKw.getSafetyOrdAmt(), this.AYXKKw.getEffectiveEditParametersDetails(), null, null, -937723360, 966675, 63878, 35653120, 16365405, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [770=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r1.equals("grid") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r1.equals("contract_grid") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r1.equals("contract_dca") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r1.equals("spot_dca") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return new o.C55959xtl().EZpvd(r20.AYXKKw);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return new o.C55951xtd().OLrzqt(r20.AYXKKw);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ShareData ejfBZ() {
        String orderType = this.AYXKKw.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                break;
            case -1402017003:
                break;
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    return new C55924xtC().KWHzl(this.AYXKKw);
                }
                return new ShareData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    return new C55927xtF().KWHzl(this.AYXKKw);
                }
                return new ShareData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            case -512749997:
                break;
            case 3181382:
                break;
            case 1165749981:
                if (orderType.equals("recurring")) {
                    return new C55961xtn().KWHzl(this.AYXKKw);
                }
                return new ShareData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            case 1485620813:
                if (orderType.equals("dcd_bot")) {
                    return new C55955xth().KWHzl(this.AYXKKw);
                }
                return new ShareData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            default:
                return new ShareData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    }

    public final boolean AubY() {
        return this.AYXKKw.isHistory() || Intrinsics.EZpvd((Object) this.AYXKKw.getState(), (Object) "stopped") || Intrinsics.EZpvd((Object) this.AYXKKw.getState(), (Object) "canceled");
    }

    public final boolean AwvSrB() {
        return Intrinsics.EZpvd((Object) this.AYXKKw.getState(), (Object) "stopping");
    }

    public final boolean AuCTelauCTel() {
        if (AubY()) {
            C55804xqp<StrategyDetailsResponse> value = this.wlaJM.getValue();
            if (Intrinsics.EZpvd((Object) (value != null ? value.OLrzqt() : null), (Object) "WebSocket")) {
                return true;
            }
        }
        return false;
    }

    public final boolean sSMYrx() {
        return (!this.AwvSrB.contains(this.AYXKKw.getOrderType()) || this.AYXKKw.isHistory() || Intrinsics.EZpvd((Object) this.AYXKKw.getState(), (Object) "stopping")) ? false : true;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uJz.resolveDisplayName$default(o.uJz, java.util.List, java.lang.String, com.okinc.tradingbot.impl.botList.domain.model.LLMBotType, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [801=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String fetchVPNInfo() {
        AiBotDto ai;
        BotCommon common;
        String stgyName;
        BotCommon common2;
        SmartArbListItem smartArbListItem;
        BotCommon common3;
        BotCommon common4;
        String instId = this.AYXKKw.getInstId();
        final String instType = this.AYXKKw.getInstType();
        final boolean zIsHistory = this.AYXKKw.isHistory();
        String orderType = this.AYXKKw.getOrderType();
        stgyName = null;
        String stgyName2 = null;
        instFamily = null;
        String instFamily = null;
        stgyName = null;
        String stgyName3 = null;
        switch (orderType.hashCode()) {
            case -1418042064:
                if (orderType.equals("ai_bot")) {
                    C48235uJz c48235uJz = C48235uJz.EZpvd;
                    BotVo bot = this.AYXKKw.getBot();
                    List<String> instIds = (bot == null || (ai = bot.getAi()) == null) ? null : ai.getInstIds();
                    if (instIds == null) {
                        instIds = yDY.AhwBna();
                    }
                    List<String> list = instIds;
                    BotVo bot2 = this.AYXKKw.getBot();
                    return C48235uJz.resolveDisplayName$default(c48235uJz, list, null, (bot2 != null ? bot2.getBacktest() : null) != null ? LLMBotType.Backtest : LLMBotType.LLM, 2, null);
                }
                return C56033xvF.copydefault(instType, instId, zIsHistory, this.AYXKKw.getRuleType(), this.AYXKKw.getDisplayId());
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    BotVo bot3 = this.AYXKKw.getBot();
                    if (bot3 != null && (common2 = bot3.getCommon()) != null) {
                        stgyName3 = common2.getStgyName();
                    }
                    if (!C33129mqd.OLrzqt((CharSequence) stgyName3)) {
                        ArrayList<SmartPortfolioListItem> portfolioList = this.AYXKKw.getPortfolioList();
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(portfolioList, 10));
                        Iterator<T> it = portfolioList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((SmartPortfolioListItem) it.next()).getCcy());
                        }
                        return C55962xto.KWHzl(arrayList, C33070mpX.AYXKKw(C55688xof.Application.to));
                    }
                    BotVo bot4 = this.AYXKKw.getBot();
                    if (bot4 == null || (common = bot4.getCommon()) == null || (stgyName = common.getStgyName()) == null) {
                        return "";
                    }
                }
                return C56033xvF.copydefault(instType, instId, zIsHistory, this.AYXKKw.getRuleType(), this.AYXKKw.getDisplayId());
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    List<String> instIds2 = this.AYXKKw.getInstIds();
                    if (instIds2 != null) {
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(instIds2, C38303pTu.KWHzl(locale) ? "、" : ", ", null, null, 0, null, new Function1() { // from class: o.wEZ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return TacticsDetailPresenter.AEQbTJ(instType, zIsHistory, (java.lang.String) obj);
                            }
                        }, 30, null);
                        if (strJoinToString$default != null) {
                            return strJoinToString$default;
                        }
                    }
                    return C56033xvF.getCoinTitle$default(instType, instId, zIsHistory, null, null, 24, null);
                }
                return C56033xvF.copydefault(instType, instId, zIsHistory, this.AYXKKw.getRuleType(), this.AYXKKw.getDisplayId());
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    C56051xvX c56051xvX = C56051xvX.AEQbTJ;
                    ArrayList<SmartArbListItem> arbList = this.AYXKKw.getArbList();
                    if (arbList != null && (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) != null) {
                        instFamily = smartArbListItem.getInstFamily();
                    }
                    return c56051xvX.KWHzl(instFamily != null ? instFamily : "") + " " + C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21);
                }
                return C56033xvF.copydefault(instType, instId, zIsHistory, this.AYXKKw.getRuleType(), this.AYXKKw.getDisplayId());
            case 1165749981:
                if (orderType.equals("recurring")) {
                    BotVo bot5 = this.AYXKKw.getBot();
                    if (bot5 != null && (common4 = bot5.getCommon()) != null) {
                        stgyName2 = common4.getStgyName();
                    }
                    if (!C33129mqd.OLrzqt((CharSequence) stgyName2)) {
                        ArrayList<RecurringListItem> recurringList = this.AYXKKw.getRecurringList();
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(recurringList, 10));
                        Iterator<T> it2 = recurringList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((RecurringListItem) it2.next()).getCcy());
                        }
                        return C55962xto.KWHzl(arrayList2, C33070mpX.AYXKKw(C55688xof.Application.addCustomAction));
                    }
                    BotVo bot6 = this.AYXKKw.getBot();
                    if (bot6 == null || (common3 = bot6.getCommon()) == null || (stgyName = common3.getStgyName()) == null) {
                        return "";
                    }
                }
                return C56033xvF.copydefault(instType, instId, zIsHistory, this.AYXKKw.getRuleType(), this.AYXKKw.getDisplayId());
            default:
                return C56033xvF.copydefault(instType, instId, zIsHistory, this.AYXKKw.getRuleType(), this.AYXKKw.getDisplayId());
        }
        return stgyName;
    }

    public static final CharSequence AEQbTJ(String str, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return C56033xvF.getCoinTitle$default(str, str2, z, null, null, 24, null);
    }

    public final void AEQbTJ(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        SmartArbListItem smartArbListItem;
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        if (Intrinsics.EZpvd((Object) strategyDetailsResponse.getOrdType(), (Object) "smart_arbitrage")) {
            ArrayList<SmartArbListItem> arbList = strategyDetailsResponse.getArbList();
            String totalFundingFeeRatio = (arbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null) ? null : smartArbListItem.getTotalFundingFeeRatio();
            if (totalFundingFeeRatio == null || StringsKt__StringsKt.fARcdN((CharSequence) totalFundingFeeRatio)) {
                totalFundingFeeRatio = this.fJNWhG;
            }
            this.fJNWhG = totalFundingFeeRatio;
        }
    }

    public final void OLrzqt() {
        ((InterfaceC49429uoQ) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_SWITCH)).EZpvd();
    }

    public final <T> T KWHzl(@NotNull Function1<? super C55887xsS, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C55887xsS c55887xsS = this.AhwBna;
        if (c55887xsS != null) {
            if (c55887xsS == null) {
                Intrinsics.gEmmrt("");
                c55887xsS = null;
            }
            return function1.invoke(c55887xsS);
        }
        C55887xsS c55887xsS2 = new C55887xsS(this.AYXKKw.getInstType(), this.AYXKKw.getInstId());
        c55887xsS2.gEmmrt(this.AYXKKw.getTradeQuoteCcy());
        this.AhwBna = c55887xsS2;
        return function1.invoke(c55887xsS2);
    }

    public final void zuBGHE() {
        this.copydefault.tryEmit(Activity.Application.OLrzqt);
    }

    public static final void EZpvd(TacticsDetailPresenter tacticsDetailPresenter, boolean z) {
        C55804xqp<StrategyDetailsResponse> value = tacticsDetailPresenter.wlaJM.getValue();
        if (value != null) {
            TradeLiveData<C55804xqp<StrategyDetailsResponse>> tradeLiveData = tacticsDetailPresenter.wlaJM;
            String strOLrzqt = value.OLrzqt();
            StrategyDetailsResponse strategyDetailsResponseCopydefault = value.copydefault();
            GridProfitAutoReinvestResponse profitAutoReinvest = value.copydefault().getProfitAutoReinvest();
            tradeLiveData.postValue(new C55804xqp<>(strOLrzqt, strategyDetailsResponseCopydefault.copy(((-1) & 1) != 0 ? strategyDetailsResponseCopydefault.instType : null, ((-1) & 2) != 0 ? strategyDetailsResponseCopydefault.instId : null, ((-1) & 4) != 0 ? strategyDetailsResponseCopydefault.uly : null, ((-1) & 8) != 0 ? strategyDetailsResponseCopydefault.ccy : null, ((-1) & 16) != 0 ? strategyDetailsResponseCopydefault.ctVal : null, ((-1) & 32) != 0 ? strategyDetailsResponseCopydefault.ordId : null, ((-1) & 64) != 0 ? strategyDetailsResponseCopydefault.algoId : null, ((-1) & 128) != 0 ? strategyDetailsResponseCopydefault.cTime : null, ((-1) & 256) != 0 ? strategyDetailsResponseCopydefault.ordType : null, ((-1) & 512) != 0 ? strategyDetailsResponseCopydefault.tdMode : null, ((-1) & 1024) != 0 ? strategyDetailsResponseCopydefault.triggerTime : null, ((-1) & 2048) != 0 ? strategyDetailsResponseCopydefault.state : null, ((-1) & 4096) != 0 ? strategyDetailsResponseCopydefault.pxVar : null, ((-1) & 8192) != 0 ? strategyDetailsResponseCopydefault.pxSpread : null, ((-1) & 16384) != 0 ? strategyDetailsResponseCopydefault.szLimit : null, ((-1) & 32768) != 0 ? strategyDetailsResponseCopydefault.pxLimit : null, ((-1) & 65536) != 0 ? strategyDetailsResponseCopydefault.actualSz : null, ((-1) & 131072) != 0 ? strategyDetailsResponseCopydefault.sz : null, ((-1) & 262144) != 0 ? strategyDetailsResponseCopydefault.side : null, ((-1) & 524288) != 0 ? strategyDetailsResponseCopydefault.posSide : null, ((-1) & 1048576) != 0 ? strategyDetailsResponseCopydefault.timeInterval : null, ((-1) & 2097152) != 0 ? strategyDetailsResponseCopydefault.maxPx : null, ((-1) & 4194304) != 0 ? strategyDetailsResponseCopydefault.minPx : null, ((-1) & 8388608) != 0 ? strategyDetailsResponseCopydefault.gridNum : null, ((-1) & 16777216) != 0 ? strategyDetailsResponseCopydefault.runType : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponseCopydefault.quoteSz : null, ((-1) & 67108864) != 0 ? strategyDetailsResponseCopydefault.baseSz : null, ((-1) & 134217728) != 0 ? strategyDetailsResponseCopydefault.tpslTriggerParamResp : null, ((-1) & 268435456) != 0 ? strategyDetailsResponseCopydefault.tpTriggerPx : null, ((-1) & 536870912) != 0 ? strategyDetailsResponseCopydefault.slTriggerPx : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponseCopydefault.tpRatio : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponseCopydefault.slRatio : null, ((-1) & 1) != 0 ? strategyDetailsResponseCopydefault.tradeNum : null, ((-1) & 2) != 0 ? strategyDetailsResponseCopydefault.totalPnl : null, ((-1) & 4) != 0 ? strategyDetailsResponseCopydefault.pnlRatio : null, ((-1) & 8) != 0 ? strategyDetailsResponseCopydefault.arbApy : null, ((-1) & 16) != 0 ? strategyDetailsResponseCopydefault.profitNum : null, ((-1) & 32) != 0 ? strategyDetailsResponseCopydefault.runTime : null, ((-1) & 64) != 0 ? strategyDetailsResponseCopydefault.perMinProfitRate : null, ((-1) & 128) != 0 ? strategyDetailsResponseCopydefault.perMaxProfitRate : null, ((-1) & 256) != 0 ? strategyDetailsResponseCopydefault.gridProfit : null, ((-1) & 512) != 0 ? strategyDetailsResponseCopydefault.gridProfitRate : null, ((-1) & 1024) != 0 ? strategyDetailsResponseCopydefault.totalCycleProfitRate : null, ((-1) & 2048) != 0 ? strategyDetailsResponseCopydefault.arbitrageProfitRate : null, ((-1) & 4096) != 0 ? strategyDetailsResponseCopydefault.floatProfit : null, ((-1) & 8192) != 0 ? strategyDetailsResponseCopydefault.totalAnnualizedRate : null, ((-1) & 16384) != 0 ? strategyDetailsResponseCopydefault.annualizedRate : null, ((-1) & 32768) != 0 ? strategyDetailsResponseCopydefault.curQuoteSz : null, ((-1) & 65536) != 0 ? strategyDetailsResponseCopydefault.curBaseSz : null, ((-1) & 131072) != 0 ? strategyDetailsResponseCopydefault.cancelType : null, ((-1) & 262144) != 0 ? strategyDetailsResponseCopydefault.investment : null, ((-1) & 524288) != 0 ? strategyDetailsResponseCopydefault.lever : null, ((-1) & 1048576) != 0 ? strategyDetailsResponseCopydefault.pTime : null, ((-1) & 2097152) != 0 ? strategyDetailsResponseCopydefault.arbitrageNum : null, ((-1) & 4194304) != 0 ? strategyDetailsResponseCopydefault.avgDailyArbitrageNum : null, ((-1) & 8388608) != 0 ? strategyDetailsResponseCopydefault.singleAmt : null, ((-1) & 16777216) != 0 ? strategyDetailsResponseCopydefault.stopResult : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponseCopydefault.runPx : null, ((-1) & 67108864) != 0 ? strategyDetailsResponseCopydefault.stgyName : null, ((-1) & 134217728) != 0 ? strategyDetailsResponseCopydefault.mktCap : null, ((-1) & 268435456) != 0 ? strategyDetailsResponseCopydefault.investAmt : null, ((-1) & 536870912) != 0 ? strategyDetailsResponseCopydefault.uTime : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponseCopydefault.cycles : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponseCopydefault.amt : null, ((-1) & 1) != 0 ? strategyDetailsResponseCopydefault.recurringList : null, ((-1) & 2) != 0 ? strategyDetailsResponseCopydefault.period : null, ((-1) & 4) != 0 ? strategyDetailsResponseCopydefault.recurringDay : null, ((-1) & 8) != 0 ? strategyDetailsResponseCopydefault.recurringHour : null, ((-1) & 16) != 0 ? strategyDetailsResponseCopydefault.nextInvestTime : null, ((-1) & 32) != 0 ? strategyDetailsResponseCopydefault.investCcy : null, ((-1) & 64) != 0 ? strategyDetailsResponseCopydefault.recurringTime : null, ((-1) & 128) != 0 ? strategyDetailsResponseCopydefault.direction : null, ((-1) & 256) != 0 ? strategyDetailsResponseCopydefault.actualLever : null, ((-1) & 512) != 0 ? strategyDetailsResponseCopydefault.eq : null, ((-1) & 1024) != 0 ? strategyDetailsResponseCopydefault.algoOrdType : null, ((-1) & 2048) != 0 ? strategyDetailsResponseCopydefault.duration : null, ((-1) & 4096) != 0 ? strategyDetailsResponseCopydefault.investType : null, ((-1) & 8192) != 0 ? strategyDetailsResponseCopydefault.basePos : false, ((-1) & 16384) != 0 ? strategyDetailsResponseCopydefault.balType : null, ((-1) & 32768) != 0 ? strategyDetailsResponseCopydefault.interval : null, ((-1) & 65536) != 0 ? strategyDetailsResponseCopydefault.deltaRatio : null, ((-1) & 131072) != 0 ? strategyDetailsResponseCopydefault.balNum : null, ((-1) & 262144) != 0 ? strategyDetailsResponseCopydefault.portfolioList : null, ((-1) & 524288) != 0 ? strategyDetailsResponseCopydefault.apy : null, ((-1) & 1048576) != 0 ? strategyDetailsResponseCopydefault.maturedApy : null, ((-1) & 2097152) != 0 ? strategyDetailsResponseCopydefault.avgPx : null, ((-1) & 4194304) != 0 ? strategyDetailsResponseCopydefault.investmentAmt : null, ((-1) & 8388608) != 0 ? strategyDetailsResponseCopydefault.investmentCcy : null, ((-1) & 16777216) != 0 ? strategyDetailsResponseCopydefault.maxSafetyOrds : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponseCopydefault.fillSafetyOrds : null, ((-1) & 67108864) != 0 ? strategyDetailsResponseCopydefault.fillManualAddOrds : null, ((-1) & 134217728) != 0 ? strategyDetailsResponseCopydefault.tpPx : null, ((-1) & 268435456) != 0 ? strategyDetailsResponseCopydefault.slPx : null, ((-1) & 536870912) != 0 ? strategyDetailsResponseCopydefault.tpPriceRange : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponseCopydefault.completedCycles : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponseCopydefault.initOrdAmt : null, ((-1) & 1) != 0 ? strategyDetailsResponseCopydefault.safetyOrdAmt : null, ((-1) & 2) != 0 ? strategyDetailsResponseCopydefault.pxSteps : null, ((-1) & 4) != 0 ? strategyDetailsResponseCopydefault.tpPct : null, ((-1) & 8) != 0 ? strategyDetailsResponseCopydefault.slPct : null, ((-1) & 16) != 0 ? strategyDetailsResponseCopydefault.slMode : null, ((-1) & 32) != 0 ? strategyDetailsResponseCopydefault.pxStepsMult : null, ((-1) & 64) != 0 ? strategyDetailsResponseCopydefault.volMult : null, ((-1) & 128) != 0 ? strategyDetailsResponseCopydefault.sourceAlgoId : null, ((-1) & 256) != 0 ? strategyDetailsResponseCopydefault.stopType : null, ((-1) & 512) != 0 ? strategyDetailsResponseCopydefault.profit : null, ((-1) & 1024) != 0 ? strategyDetailsResponseCopydefault.signParams : null, ((-1) & 2048) != 0 ? strategyDetailsResponseCopydefault.rebateTrans : null, ((-1) & 4096) != 0 ? strategyDetailsResponseCopydefault.reserveFunds : false, ((-1) & 8192) != 0 ? strategyDetailsResponseCopydefault.totalCycleProfit : null, ((-1) & 16384) != 0 ? strategyDetailsResponseCopydefault.arbitragePnl : null, ((-1) & 32768) != 0 ? strategyDetailsResponseCopydefault.additionalFundNeeded : null, ((-1) & 65536) != 0 ? strategyDetailsResponseCopydefault.maxBotUsage : null, ((-1) & 131072) != 0 ? strategyDetailsResponseCopydefault.cycleBaseAmt : null, ((-1) & 262144) != 0 ? strategyDetailsResponseCopydefault.triggerParams : null, ((-1) & 524288) != 0 ? strategyDetailsResponseCopydefault.reserveFundingFee : null, ((-1) & 1048576) != 0 ? strategyDetailsResponseCopydefault.transferInMargin : null, ((-1) & 2097152) != 0 ? strategyDetailsResponseCopydefault.ordFrozen : null, ((-1) & 4194304) != 0 ? strategyDetailsResponseCopydefault.availEq : null, ((-1) & 8388608) != 0 ? strategyDetailsResponseCopydefault.initPx : null, ((-1) & 16777216) != 0 ? strategyDetailsResponseCopydefault.perGridProfitRatio : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponseCopydefault.activeOrderCount : null, ((-1) & 67108864) != 0 ? strategyDetailsResponseCopydefault.trailingUpConfig : null, ((-1) & 134217728) != 0 ? strategyDetailsResponseCopydefault.trailingDownConfig : null, ((-1) & 268435456) != 0 ? strategyDetailsResponseCopydefault.trailingDownFund : null, ((-1) & 536870912) != 0 ? strategyDetailsResponseCopydefault.gridStatus : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponseCopydefault.lmtOrderNumber : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponseCopydefault.aggressiveness : null, ((-1) & 1) != 0 ? strategyDetailsResponseCopydefault.profitSharingRatio : null, ((-1) & 2) != 0 ? strategyDetailsResponseCopydefault.copyType : null, ((-1) & 4) != 0 ? strategyDetailsResponseCopydefault.instIds : null, ((-1) & 8) != 0 ? strategyDetailsResponseCopydefault.totalEquity : null, ((-1) & 16) != 0 ? strategyDetailsResponseCopydefault.floatingPnl : null, ((-1) & 32) != 0 ? strategyDetailsResponseCopydefault.actualMarginSz : null, ((-1) & 64) != 0 ? strategyDetailsResponseCopydefault.extraMarginSz : null, ((-1) & 128) != 0 ? strategyDetailsResponseCopydefault.usedMargin : null, ((-1) & 256) != 0 ? strategyDetailsResponseCopydefault.availableMargin : null, ((-1) & 512) != 0 ? strategyDetailsResponseCopydefault.totalAmt : null, ((-1) & 1024) != 0 ? strategyDetailsResponseCopydefault.totalPnlRatio : null, ((-1) & 2048) != 0 ? strategyDetailsResponseCopydefault.realizedPnl : null, ((-1) & 4096) != 0 ? strategyDetailsResponseCopydefault.signalChanName : null, ((-1) & 8192) != 0 ? strategyDetailsResponseCopydefault.signalChanId : null, ((-1) & 16384) != 0 ? strategyDetailsResponseCopydefault.signalCount : null, ((-1) & 32768) != 0 ? strategyDetailsResponseCopydefault.allowMultipleEntry : null, ((-1) & 65536) != 0 ? strategyDetailsResponseCopydefault.subOrdType : null, ((-1) & 131072) != 0 ? strategyDetailsResponseCopydefault.ratio : null, ((-1) & 262144) != 0 ? strategyDetailsResponseCopydefault.signalOrderAmtParam : null, ((-1) & 524288) != 0 ? strategyDetailsResponseCopydefault.signalBotOrderStopParam : null, ((-1) & 1048576) != 0 ? strategyDetailsResponseCopydefault.signalSourceType : null, ((-1) & 2097152) != 0 ? strategyDetailsResponseCopydefault.symbolsNumber : null, ((-1) & 4194304) != 0 ? strategyDetailsResponseCopydefault.isHistory : false, ((-1) & 8388608) != 0 ? strategyDetailsResponseCopydefault.sourceCcy : null, ((-1) & 16777216) != 0 ? strategyDetailsResponseCopydefault.sourceCcySz : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponseCopydefault.trackingMode : null, ((-1) & 67108864) != 0 ? strategyDetailsResponseCopydefault.netMarginTransfer : null, ((-1) & 134217728) != 0 ? strategyDetailsResponseCopydefault.feeCcy : null, ((-1) & 268435456) != 0 ? strategyDetailsResponseCopydefault.fundingFee : null, ((-1) & 536870912) != 0 ? strategyDetailsResponseCopydefault.reduce_only : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponseCopydefault.outOfRange : false, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponseCopydefault.autoMarginReloadSwitch : false, ((-1) & 1) != 0 ? strategyDetailsResponseCopydefault.autoMarginReloadMaxAmount : null, ((-1) & 2) != 0 ? strategyDetailsResponseCopydefault.extendedBusinessInfo : null, ((-1) & 4) != 0 ? strategyDetailsResponseCopydefault.arbPnl : null, ((-1) & 8) != 0 ? strategyDetailsResponseCopydefault.spreadPnl : null, ((-1) & 16) != 0 ? strategyDetailsResponseCopydefault.arbList : null, ((-1) & 32) != 0 ? strategyDetailsResponseCopydefault.preFundingFee : null, ((-1) & 64) != 0 ? strategyDetailsResponseCopydefault.preAnnualized : null, ((-1) & 128) != 0 ? strategyDetailsResponseCopydefault.instFamily : null, ((-1) & 256) != 0 ? strategyDetailsResponseCopydefault.fundingFeeTime : null, ((-1) & 512) != 0 ? strategyDetailsResponseCopydefault.fundingFeeRatio : null, ((-1) & 1024) != 0 ? strategyDetailsResponseCopydefault.pnlRatioInSourceCcy : null, ((-1) & 2048) != 0 ? strategyDetailsResponseCopydefault.totalPnlInSourceCcy : null, ((-1) & 4096) != 0 ? strategyDetailsResponseCopydefault.floatProfitInSourceCcy : null, ((-1) & 8192) != 0 ? strategyDetailsResponseCopydefault.gridProfitInSourceCcy : null, ((-1) & 16384) != 0 ? strategyDetailsResponseCopydefault.arbitrageApy : null, ((-1) & 32768) != 0 ? strategyDetailsResponseCopydefault.floatProfitRate : null, ((-1) & 65536) != 0 ? strategyDetailsResponseCopydefault.profitInSourceCcy : null, ((-1) & 131072) != 0 ? strategyDetailsResponseCopydefault.ruleType : null, ((-1) & 262144) != 0 ? strategyDetailsResponseCopydefault.isTradeBorrowMode : null, ((-1) & 524288) != 0 ? strategyDetailsResponseCopydefault.strategyTags : null, ((-1) & 1048576) != 0 ? strategyDetailsResponseCopydefault.voucherInfo : null, ((-1) & 2097152) != 0 ? strategyDetailsResponseCopydefault.stakingPnl : null, ((-1) & 4194304) != 0 ? strategyDetailsResponseCopydefault.stakingPnlUSDT : null, ((-1) & 8388608) != 0 ? strategyDetailsResponseCopydefault.stakingPosCcy : null, ((-1) & 16777216) != 0 ? strategyDetailsResponseCopydefault.stakingPnlApy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponseCopydefault.subArbTypes : null, ((-1) & 67108864) != 0 ? strategyDetailsResponseCopydefault.totalInterestAmt : null, ((-1) & 134217728) != 0 ? strategyDetailsResponseCopydefault.debtCcy : null, ((-1) & 268435456) != 0 ? strategyDetailsResponseCopydefault.accountId : null, ((-1) & 536870912) != 0 ? strategyDetailsResponseCopydefault.forbidden : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponseCopydefault.hiddenFeatures : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponseCopydefault.dcdState : null, ((-1) & 1) != 0 ? strategyDetailsResponseCopydefault.coinPnl : null, ((-1) & 2) != 0 ? strategyDetailsResponseCopydefault.notional : null, ((-1) & 4) != 0 ? strategyDetailsResponseCopydefault.notionalCcy : null, ((-1) & 8) != 0 ? strategyDetailsResponseCopydefault.settlementAmount : null, ((-1) & 16) != 0 ? strategyDetailsResponseCopydefault.settlementCcy : null, ((-1) & 32) != 0 ? strategyDetailsResponseCopydefault.currencyBal : null, ((-1) & 64) != 0 ? strategyDetailsResponseCopydefault.currency : null, ((-1) & 128) != 0 ? strategyDetailsResponseCopydefault.avgCost : null, ((-1) & 256) != 0 ? strategyDetailsResponseCopydefault.cycle : null, ((-1) & 512) != 0 ? strategyDetailsResponseCopydefault.term : null, ((-1) & 1024) != 0 ? strategyDetailsResponseCopydefault.alternateCurrency : null, ((-1) & 2048) != 0 ? strategyDetailsResponseCopydefault.strike : null, ((-1) & 4096) != 0 ? strategyDetailsResponseCopydefault.strikePercentage : null, ((-1) & 8192) != 0 ? strategyDetailsResponseCopydefault.stopPrice : null, ((-1) & 16384) != 0 ? strategyDetailsResponseCopydefault.stopPercentage : null, ((-1) & 32768) != 0 ? strategyDetailsResponseCopydefault.curStrike : null, ((-1) & 65536) != 0 ? strategyDetailsResponseCopydefault.dcdOptionType : null, ((-1) & 131072) != 0 ? strategyDetailsResponseCopydefault.curSettlementTime : null, ((-1) & 262144) != 0 ? strategyDetailsResponseCopydefault.minAnnualYieldPercentage : null, ((-1) & 524288) != 0 ? strategyDetailsResponseCopydefault.maxSettlementDay : null, ((-1) & 1048576) != 0 ? strategyDetailsResponseCopydefault.reinvestment : null, ((-1) & 2097152) != 0 ? strategyDetailsResponseCopydefault.lastPrice : null, ((-1) & 4194304) != 0 ? strategyDetailsResponseCopydefault.lastTradeExpireTime : null, ((-1) & 8388608) != 0 ? strategyDetailsResponseCopydefault.lastSettlementSettledTime : null, ((-1) & 16777216) != 0 ? strategyDetailsResponseCopydefault.absYieldPercentage : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponseCopydefault.estimatedSettleTime : null, ((-1) & 67108864) != 0 ? strategyDetailsResponseCopydefault.simpleEarn : null, ((-1) & 134217728) != 0 ? strategyDetailsResponseCopydefault.arbitrageTotalPnlInfo : null, ((-1) & 268435456) != 0 ? strategyDetailsResponseCopydefault.leveragePrincipal : null, ((-1) & 536870912) != 0 ? strategyDetailsResponseCopydefault.highestApyPeriod : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponseCopydefault.displayMinPaybackDays : false, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponseCopydefault.fundingFeeApyList : null, (131067 & 1) != 0 ? strategyDetailsResponseCopydefault.displayId : null, (131067 & 2) != 0 ? strategyDetailsResponseCopydefault.tradeQuoteCcy : null, (131067 & 4) != 0 ? strategyDetailsResponseCopydefault.profitAutoReinvest : profitAutoReinvest != null ? GridProfitAutoReinvestResponse.copy$default(profitAutoReinvest, false, !z, null, 5, null) : null, (131067 & 8) != 0 ? strategyDetailsResponseCopydefault.profitSnapshots : null, (131067 & 16) != 0 ? strategyDetailsResponseCopydefault.latestProfit : null, (131067 & 32) != 0 ? strategyDetailsResponseCopydefault.totalSpreadProfit : null, (131067 & 64) != 0 ? strategyDetailsResponseCopydefault.totalApy : null, (131067 & 128) != 0 ? strategyDetailsResponseCopydefault.fee : null, (131067 & 256) != 0 ? strategyDetailsResponseCopydefault.arbitrageProfit : null, (131067 & 512) != 0 ? strategyDetailsResponseCopydefault.stakingProfit : null, (131067 & 1024) != 0 ? strategyDetailsResponseCopydefault.balanceDetails : null, (131067 & 2048) != 0 ? strategyDetailsResponseCopydefault.liqPx : null, (131067 & 4096) != 0 ? strategyDetailsResponseCopydefault.bot : null, (131067 & 8192) != 0 ? strategyDetailsResponseCopydefault.effectiveEditParametersDetails : null, (131067 & 16384) != 0 ? strategyDetailsResponseCopydefault.safetyOrdRatio : null, (131067 & 32768) != 0 ? strategyDetailsResponseCopydefault.cycleStartTime : null, (131067 & 65536) != 0 ? strategyDetailsResponseCopydefault.noClosePositionId : null), value.KWHzl(), value.AEQbTJ()));
        }
    }

    public final void AEQbTJ(final boolean z) {
        Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            C51056vfn c51056vfn = new C51056vfn();
            c51056vfn.EZpvd(new C51056vfn.StateListAnimator(this.AYXKKw.getAlgoId(), z));
            c51056vfn.KWHzl(new Function1() { // from class: o.wEY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TacticsDetailPresenter.copydefault(z, this, this, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c51056vfn, 0L, 1, null);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableSharedFlow<Activity> mutableSharedFlow = this.copydefault;
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mutableSharedFlow.tryEmit(new Activity.ActionBar(message));
            EZpvd(this, z);
        }
    }

    public final String copydefault(long j) {
        return pTA.formatSimpleDateTime$default(new Date(j), null, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.djBIcL, this.zLjUOn, this.isConnected, this.AuCTelauCTel, this.fIwbmz, this.zsXlph, this.DbNXlk);
    }

    public final boolean copydefault() {
        String sourceAlgoId = this.AYXKKw.getSourceAlgoId();
        return sourceAlgoId != null && C33129mqd.OLrzqt((CharSequence) sourceAlgoId);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface Activity {

        public static final class Application implements Activity {
            public static final Application OLrzqt = new Application();

            private Application() {
            }
        }

        public static final class StateListAnimator implements Activity {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        public static final class TaskDescription implements Activity {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
            }
        }

        public static final class ActionBar implements Activity {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.copydefault;
                }
                return actionBar.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((ActionBar) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowErrorToast(errorMessage=" + this.copydefault + ")";
            }

            public ActionBar(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class C0673Activity implements Activity {
            public static final C0673Activity OLrzqt = new C0673Activity();

            private C0673Activity() {
            }
        }
    }

    public static final Unit copydefault(boolean z, TacticsDetailPresenter tacticsDetailPresenter, TacticsDetailPresenter tacticsDetailPresenter2, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0) {
            tacticsDetailPresenter.copydefault.tryEmit(new Activity.ActionBar(responseData.getMsg()));
            EZpvd(tacticsDetailPresenter2, z);
        } else if (z) {
            tacticsDetailPresenter.copydefault.tryEmit(Activity.StateListAnimator.OLrzqt);
        } else {
            tacticsDetailPresenter.copydefault.tryEmit(Activity.TaskDescription.copydefault);
        }
        return Unit.INSTANCE;
    }
}
