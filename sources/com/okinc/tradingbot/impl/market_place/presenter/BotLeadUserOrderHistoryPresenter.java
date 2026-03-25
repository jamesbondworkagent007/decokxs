package com.okinc.tradingbot.impl.market_place.presenter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TacticsType;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadUserOrderHistoryPresenter;
import com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel;
import com.okinc.unify_trade.biz.BotLeadUserOrderHistorySummaryModel;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadUserOrderHistoryContentShowData;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadUserOrderHistoryShowData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54214xAc;
import o.C54282xCq;
import o.C54799xVt;
import o.C55688xof;
import o.C55947xtZ;
import o.C55951xtd;
import o.C56033xvF;
import o.C56111xwe;
import o.C56270xze;
import o.C56390yDp;
import o.C56423yEv;
import o.InterfaceC54501xKt;
import o.pTA;
import o.pTB;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BotLeadUserOrderHistoryPresenter extends AbsPresenter {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final TradeLiveData<Boolean> AEQbTJ;
    public int AYXKKw;
    public final ArrayList<BotLeadUserOrderHistoryModel> AhwBna;
    public final C56111xwe<TacticsData> KWHzl;
    public final TradeLiveData<List<BotLeadUserOrderHistoryShowData>> OLrzqt;
    public final C54282xCq copydefault;
    public final C54214xAc djBIcL;
    public String gEmmrt;
    public final C56270xze valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<BotLeadUserOrderHistoryShowData>> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<TacticsData> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56270xze copydefault() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotLeadUserOrderHistoryPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.valueOf = new C56270xze();
        this.OLrzqt = new TradeLiveData<>();
        this.AEQbTJ = new TradeLiveData<>();
        this.AhwBna = new ArrayList<>();
        this.AYXKKw = BotLeadHistoryStrategyPresenter.Companion.KWHzl();
        this.gEmmrt = "";
        this.copydefault = new C54282xCq();
        this.KWHzl = new C56111xwe<>();
        this.djBIcL = new C54214xAc();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.presenter.BotLeadUserOrderHistoryPresenter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.market_place.presenter.BotLeadUserOrderHistoryPresenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestChartProfitData$default(BotLeadUserOrderHistoryPresenter botLeadUserOrderHistoryPresenter, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        botLeadUserOrderHistoryPresenter.AEQbTJ(str, (Function1<? super List<StrategyProfitResponse>, Unit>) function1);
    }

    public final void AEQbTJ(@NotNull String str, final Function1<? super List<StrategyProfitResponse>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        C54214xAc c54214xAc = this.djBIcL;
        c54214xAc.copydefault(str);
        c54214xAc.KWHzl(new Function1() { // from class: o.vte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotLeadUserOrderHistoryPresenter.KWHzl(function1, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54214xAc, 0L, 1, null);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = BotLeadHistoryStrategyPresenter.Companion.KWHzl();
        this.gEmmrt = str;
        this.AhwBna.clear();
        gEmmrt();
    }

    public final void KWHzl() {
        this.AYXKKw++;
        gEmmrt();
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends TickersData>, TacticsData> {
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ BotLeadUserOrderHistoryPresenter OLrzqt;
        public final /* synthetic */ BotLeadUserOrderHistoryShowData copydefault;

        public StateListAnimator(BotLeadUserOrderHistoryShowData botLeadUserOrderHistoryShowData, BotLeadUserOrderHistoryPresenter botLeadUserOrderHistoryPresenter, String str, String str2) {
            this.copydefault = botLeadUserOrderHistoryShowData;
            this.OLrzqt = botLeadUserOrderHistoryPresenter;
            this.EZpvd = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.InterfaceC54501xKt
        public /* bridge */ /* synthetic */ TacticsData KWHzl(List<? extends TickersData> list) {
            return KWHzl2((List<TickersData>) list);
        }

        /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
        public TacticsData KWHzl2(List<TickersData> list) {
            String algoOrdType;
            String strSubS$default;
            String instId;
            String instType;
            String last;
            String direction;
            String uTime;
            String leverage;
            String instId2;
            String instType2;
            String algoId;
            String algoOrdType2;
            Intrinsics.checkNotNullParameter(list, "");
            BotLeadUserOrderHistoryModel originData = this.copydefault.getOriginData();
            String str = (originData == null || (algoOrdType2 = originData.getAlgoOrdType()) == null) ? "" : algoOrdType2;
            BotLeadUserOrderHistoryModel originData2 = this.copydefault.getOriginData();
            String str2 = (originData2 == null || (algoId = originData2.getAlgoId()) == null) ? "" : algoId;
            BotLeadUserOrderHistoryModel originData3 = this.copydefault.getOriginData();
            String str3 = (originData3 == null || (instType2 = originData3.getInstType()) == null) ? "" : instType2;
            BotLeadUserOrderHistoryModel originData4 = this.copydefault.getOriginData();
            String str4 = (originData4 == null || (instId2 = originData4.getInstId()) == null) ? "" : instId2;
            String title = this.copydefault.getTitle();
            String str5 = title == null ? "" : title;
            TacticsType.TaskDescription taskDescription = TacticsType.Companion;
            BotLeadUserOrderHistoryModel originData5 = this.copydefault.getOriginData();
            if (originData5 == null || (algoOrdType = originData5.getAlgoOrdType()) == null) {
                algoOrdType = "";
            }
            TacticsType tacticsTypeAEQbTJ = taskDescription.AEQbTJ(algoOrdType);
            if (tacticsTypeAEQbTJ == null) {
                tacticsTypeAEQbTJ = TacticsType.TACTICS_GRDE;
            }
            TacticsType tacticsType = tacticsTypeAEQbTJ;
            BotLeadUserOrderHistoryModel originData6 = this.copydefault.getOriginData();
            String str6 = (originData6 == null || (leverage = originData6.getLeverage()) == null) ? "" : leverage;
            BotLeadUserOrderHistoryModel originData7 = this.copydefault.getOriginData();
            if (originData7 == null || (uTime = originData7.getUTime()) == null) {
                strSubS$default = null;
            } else {
                BotLeadUserOrderHistoryModel originData8 = this.copydefault.getOriginData();
                strSubS$default = C33129mqd.subS$default(uTime, originData8 != null ? originData8.getCTime() : null, null, null, null, 14, null);
            }
            String str7 = strSubS$default == null ? "" : strSubS$default;
            BotLeadUserOrderHistoryModel originData9 = this.copydefault.getOriginData();
            String str8 = (originData9 == null || (direction = originData9.getDirection()) == null) ? "" : direction;
            ShareData shareDataOLrzqt = this.OLrzqt.OLrzqt(this.copydefault.getOriginData(), this.EZpvd, this.KWHzl);
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
            String str9 = (tickersData == null || (last = tickersData.getLast()) == null) ? "" : last;
            BotLeadUserOrderHistoryModel originData10 = this.copydefault.getOriginData();
            String str10 = (originData10 == null || (instType = originData10.getInstType()) == null) ? "" : instType;
            BotLeadUserOrderHistoryModel originData11 = this.copydefault.getOriginData();
            String coinTitle$default = C56033xvF.getCoinTitle$default(str10, (originData11 == null || (instId = originData11.getInstId()) == null) ? "" : instId, false, null, null, 28, null);
            BotLeadUserOrderHistoryModel originData12 = this.copydefault.getOriginData();
            return new TacticsData(str, str2, str3, str4, null, null, true, str5, tacticsType, 0, str6, null, 0L, null, null, null, null, null, shareDataOLrzqt, null, null, coinTitle$default + " " + C56033xvF.iwGUEr(originData12 != null ? originData12.getAlgoOrdType() : null), str8, null, null, null, null, null, null, null, null, str9, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "3", null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, str7, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 2140928560, Integer.MAX_VALUE, -1, -1, -33, 3, null);
        }
    }

    public final void EZpvd(@NotNull BotLeadUserOrderHistoryShowData botLeadUserOrderHistoryShowData, @NotNull String str, @NotNull String str2, boolean z) {
        String instId;
        String str3 = "";
        Intrinsics.checkNotNullParameter(botLeadUserOrderHistoryShowData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54282xCq c54282xCq = this.copydefault;
        c54282xCq.OLrzqt(this.KWHzl, new StateListAnimator(botLeadUserOrderHistoryShowData, this, str, str2));
        BotLeadUserOrderHistoryModel originData = botLeadUserOrderHistoryShowData.getOriginData();
        if (originData != null && (instId = originData.getInstId()) != null) {
            str3 = instId;
        }
        c54282xCq.AEQbTJ(str3);
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
    }

    public final ShareData OLrzqt(BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel, String str, String str2) {
        if (Intrinsics.EZpvd((Object) (botLeadUserOrderHistoryModel != null ? botLeadUserOrderHistoryModel.getAlgoOrdType() : null), (Object) "contract_dca")) {
            Pair<String, String> pairEZpvd = C55951xtd.Companion.EZpvd(botLeadUserOrderHistoryModel.getCompletedCycles());
            String strComponent1 = pairEZpvd.component1();
            String strComponent2 = pairEZpvd.component2();
            String pnlRatio = botLeadUserOrderHistoryModel.getPnlRatio();
            String str3 = pnlRatio == null ? "" : pnlRatio;
            String totalPnl = botLeadUserOrderHistoryModel.getTotalPnl();
            return new ShareData(null, str3, null, totalPnl == null ? "" : totalPnl, null, strComponent1, strComponent2, null, null, str, str2, null, null, null, null, 31125, null);
        }
        String pnlRatio2 = botLeadUserOrderHistoryModel != null ? botLeadUserOrderHistoryModel.getPnlRatio() : null;
        String str4 = pnlRatio2 == null ? "" : pnlRatio2;
        String totalPnl2 = botLeadUserOrderHistoryModel != null ? botLeadUserOrderHistoryModel.getTotalPnl() : null;
        String str5 = totalPnl2 == null ? "" : totalPnl2;
        String profitSharingCcy = botLeadUserOrderHistoryModel != null ? botLeadUserOrderHistoryModel.getProfitSharingCcy() : null;
        return new ShareData(null, str4, null, str5, profitSharingCcy == null ? "" : profitSharingCcy, null, null, null, null, str, str2, null, null, null, null, 31205, null);
    }

    private final void gEmmrt() {
        C56270xze c56270xze = this.valueOf;
        c56270xze.OLrzqt(String.valueOf(this.AYXKKw));
        c56270xze.copydefault(C33129mqd.gEmmrt(20));
        c56270xze.AEQbTJ(this.gEmmrt);
        c56270xze.OLrzqt(this.OLrzqt, new Activity());
        xKK.Activity.execute$default(c56270xze, 0L, 1, null);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends BotLeadUserOrderHistorySummaryModel>, List<? extends BotLeadUserOrderHistoryShowData>> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public List<BotLeadUserOrderHistoryShowData> KWHzl(List<BotLeadUserOrderHistorySummaryModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BotLeadUserOrderHistorySummaryModel botLeadUserOrderHistorySummaryModel = (BotLeadUserOrderHistorySummaryModel) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
            List<BotLeadUserOrderHistoryModel> strategies = botLeadUserOrderHistorySummaryModel.getStrategies();
            if (strategies != null) {
                BotLeadUserOrderHistoryPresenter.this.AhwBna.addAll(strategies);
            }
            BotLeadUserOrderHistoryPresenter.this.OLrzqt().postValue(Boolean.valueOf(C33129mqd.AEQbTJ(botLeadUserOrderHistorySummaryModel.getTotalCount(), Integer.valueOf(BotLeadUserOrderHistoryPresenter.this.AhwBna.size()))));
            BotLeadUserOrderHistoryPresenter botLeadUserOrderHistoryPresenter = BotLeadUserOrderHistoryPresenter.this;
            return botLeadUserOrderHistoryPresenter.copydefault(botLeadUserOrderHistoryPresenter.AhwBna);
        }
    }

    public final List<BotLeadUserOrderHistoryShowData> copydefault(List<BotLeadUserOrderHistoryModel> list) {
        ArrayList arrayList = new ArrayList();
        for (BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel : list) {
            String direction = botLeadUserOrderHistoryModel.getDirection();
            String str = "";
            if (direction == null) {
                direction = "";
            }
            copydefault(direction);
            String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, botLeadUserOrderHistoryModel.getInstId(), botLeadUserOrderHistoryModel.getInstType(), false, false, 12, null);
            boolean zKWHzl = KWHzl(botLeadUserOrderHistoryModel);
            String direction2 = botLeadUserOrderHistoryModel.getDirection();
            if (direction2 == null) {
                direction2 = "";
            }
            String strAhwBna = C56033xvF.AhwBna(direction2);
            String leverage = botLeadUserOrderHistoryModel.getLeverage();
            if (leverage == null) {
                leverage = "";
            }
            String botLever$default = C56033xvF.getBotLever$default(leverage, false, 2, null);
            String direction3 = botLeadUserOrderHistoryModel.getDirection();
            if (direction3 != null) {
                str = direction3;
            }
            int contractGridSideColor$default = C56033xvF.getContractGridSideColor$default(str, false, 2, null);
            arrayList.add(new BotLeadUserOrderHistoryShowData(titleByIdAndType$default, Boolean.valueOf(zKWHzl), strAhwBna, botLever$default, null, Integer.valueOf(contractGridSideColor$default), OLrzqt(botLeadUserOrderHistoryModel), copydefault(botLeadUserOrderHistoryModel), botLeadUserOrderHistoryModel, 16, null));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList<TacticsListLabelData> copydefault(BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel) {
        ArrayList<TacticsListLabelData> arrayList;
        String algoOrdType = botLeadUserOrderHistoryModel.getAlgoOrdType();
        if (algoOrdType == null) {
            arrayList = new ArrayList<>();
        } else {
            int iHashCode = algoOrdType.hashCode();
            if (iHashCode != -1402017003) {
                if (iHashCode != -512749997) {
                    if (iHashCode == 3181382 && algoOrdType.equals("grid")) {
                        Pair<Boolean, String> pairEZpvd = EZpvd(botLeadUserOrderHistoryModel);
                        if (pairEZpvd.getFirst().booleanValue()) {
                            arrayList = yDY.copydefault(new TacticsListLabelData(pairEZpvd.getSecond(), false, 0, 0, 0, 30, null));
                        } else {
                            arrayList = new ArrayList<>();
                        }
                    }
                } else if (algoOrdType.equals("contract_grid")) {
                    String direction = botLeadUserOrderHistoryModel.getDirection();
                    if (direction == null) {
                        direction = "";
                    }
                    int iValueOf = C56033xvF.valueOf(direction);
                    TacticsListLabelData[] tacticsListLabelDataArr = new TacticsListLabelData[2];
                    String direction2 = botLeadUserOrderHistoryModel.getDirection();
                    if (direction2 == null) {
                        direction2 = "";
                    }
                    tacticsListLabelDataArr[0] = new TacticsListLabelData(C56033xvF.AhwBna(direction2), false, iValueOf, 0, 0, 26, null);
                    String leverage = botLeadUserOrderHistoryModel.getLeverage();
                    if (leverage == null) {
                        leverage = "";
                    }
                    tacticsListLabelDataArr[1] = new TacticsListLabelData(C56033xvF.getBotLever$default(leverage, false, 2, null), false, iValueOf, 0, 0, 26, null);
                    arrayList = yDY.copydefault(tacticsListLabelDataArr);
                }
                arrayList = new ArrayList<>();
            } else if (!algoOrdType.equals("contract_dca")) {
            }
        }
        String algoOrdType2 = botLeadUserOrderHistoryModel.getAlgoOrdType();
        arrayList.add(0, new TacticsListLabelData(C56033xvF.iwGUEr(algoOrdType2 != null ? algoOrdType2 : ""), false, 0, 0, 0, 30, null));
        return arrayList;
    }

    public final Pair<Boolean, String> EZpvd(BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel) {
        TrailingConfig trailingUpConfig = botLeadUserOrderHistoryModel.getTrailingUpConfig();
        TrailingConfig trailingDownConfig = botLeadUserOrderHistoryModel.getTrailingDownConfig();
        if (trailingUpConfig != null && trailingUpConfig.getEnabled() && trailingDownConfig != null && trailingDownConfig.getEnabled()) {
            return C56390yDp.OLrzqt(Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.max));
        }
        if (trailingUpConfig != null && trailingUpConfig.getEnabled() && (trailingDownConfig == null || !trailingDownConfig.getEnabled())) {
            return C56390yDp.OLrzqt(Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.StringDef));
        }
        if (trailingDownConfig != null && trailingDownConfig.getEnabled() && (trailingUpConfig == null || !trailingUpConfig.getEnabled())) {
            return C56390yDp.OLrzqt(Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.Size));
        }
        return C56390yDp.OLrzqt(Boolean.FALSE, "");
    }

    public final boolean KWHzl(BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel) {
        return Intrinsics.EZpvd((Object) botLeadUserOrderHistoryModel.getAlgoOrdType(), (Object) "contract_grid");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [296=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Pair<String, Boolean> copydefault(String str) {
        switch (str.hashCode()) {
            case -1048962135:
                if (str.equals("netBuy")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getMaxVolume), Boolean.TRUE);
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.UeEOUB), Boolean.TRUE);
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.fFgQHt), Boolean.FALSE);
                }
                break;
            case 1842402959:
                if (str.equals("netSell")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getVolumeControl), Boolean.FALSE);
                }
                break;
        }
        return C56390yDp.OLrzqt("", Boolean.FALSE);
    }

    public final List<BotLeadUserOrderHistoryContentShowData> OLrzqt(BotLeadUserOrderHistoryModel botLeadUserOrderHistoryModel) {
        String percent$default;
        ArrayList arrayList = new ArrayList();
        String str = C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + botLeadUserOrderHistoryModel.getProfitSharingCcy() + ")";
        String totalPnl = botLeadUserOrderHistoryModel.getTotalPnl();
        String str2 = totalPnl == null ? "" : totalPnl;
        String profitSharingCcy = botLeadUserOrderHistoryModel.getProfitSharingCcy();
        String botPnl$default = C56033xvF.getBotPnl$default("", "", str2, profitSharingCcy == null ? "" : profitSharingCcy, false, false, null, false, null, null, null, 2032, null);
        int i = C32113mPz.Dialog.OcIXYQ;
        String instId = botLeadUserOrderHistoryModel.getInstId();
        String str3 = instId == null ? "" : instId;
        String instType = botLeadUserOrderHistoryModel.getInstType();
        String str4 = instType == null ? "" : instType;
        String totalPnl2 = botLeadUserOrderHistoryModel.getTotalPnl();
        arrayList.add(new BotLeadUserOrderHistoryContentShowData(str, botPnl$default, i, Integer.valueOf(C56033xvF.OLrzqt((Object) C56033xvF.getDigitPnl$default(str3, str4, totalPnl2 == null ? "" : totalPnl2, null, 8, null)))));
        String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes);
        C55947xtZ c55947xtZ = C55947xtZ.EZpvd;
        String pnlRatio = botLeadUserOrderHistoryModel.getPnlRatio();
        if (pnlRatio == null) {
            pnlRatio = "";
        }
        String orderRatioStr$default = C55947xtZ.getOrderRatioStr$default(c55947xtZ, pnlRatio, false, 2, null);
        int i2 = C32113mPz.Dialog.OcIXYQ;
        String instId2 = botLeadUserOrderHistoryModel.getInstId();
        String str5 = instId2 == null ? "" : instId2;
        String instType2 = botLeadUserOrderHistoryModel.getInstType();
        String str6 = instType2 == null ? "" : instType2;
        String totalPnl3 = botLeadUserOrderHistoryModel.getTotalPnl();
        arrayList.add(new BotLeadUserOrderHistoryContentShowData(strAYXKKw, orderRatioStr$default, i2, Integer.valueOf(C56033xvF.OLrzqt((Object) C56033xvF.getDigitPnl$default(str5, str6, totalPnl3 == null ? "" : totalPnl3, null, 8, null)))));
        String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.gvFztT);
        if (C33129mqd.OLrzqt((CharSequence) botLeadUserOrderHistoryModel.getMaxDrawdown())) {
            xMR xmr = xMR.copydefault;
            String maxDrawdown = botLeadUserOrderHistoryModel.getMaxDrawdown();
            percent$default = xMR.formatPercent$default(xmr, maxDrawdown == null ? "" : maxDrawdown, 0, RoundingMode.DOWN, 2, null);
        } else {
            percent$default = "--";
        }
        arrayList.add(new BotLeadUserOrderHistoryContentShowData(strAYXKKw2, percent$default, 0, null, 12, null));
        String str7 = C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda0) + "(" + botLeadUserOrderHistoryModel.getProfitSharingCcy() + ")";
        String investmentAmt = botLeadUserOrderHistoryModel.getInvestmentAmt();
        arrayList.add(new BotLeadUserOrderHistoryContentShowData(str7, investmentAmt != null ? c55947xtZ.copydefault(investmentAmt, botLeadUserOrderHistoryModel.getProfitSharingCcy(), false) : null, 0, null, 12, null));
        String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.onPrepareFromUri);
        String followerCount = botLeadUserOrderHistoryModel.getFollowerCount();
        arrayList.add(new BotLeadUserOrderHistoryContentShowData(strAYXKKw3, followerCount != null ? pTB.formatLocalized$default(followerCount, null, 1, null) : null, 0, null, 12, null));
        String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatCallbackStubApi21);
        String profitSharingCcy2 = botLeadUserOrderHistoryModel.getProfitSharingCcy();
        if (profitSharingCcy2 == null) {
            profitSharingCcy2 = "USDT";
        }
        String strOLrzqt = C33069mpW.OLrzqt(strAYXKKw4, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy2)));
        String followerAssets = botLeadUserOrderHistoryModel.getFollowerAssets();
        arrayList.add(new BotLeadUserOrderHistoryContentShowData(strOLrzqt, followerAssets != null ? c55947xtZ.copydefault(followerAssets, botLeadUserOrderHistoryModel.getProfitSharingCcy(), false) : null, 0, null, 12, null));
        String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.isShowing);
        Date date = new Date(C33129mqd.valueOf(botLeadUserOrderHistoryModel.getCTime()));
        OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_SIMPLE;
        OKTimeEnum oKTimeEnum = OKTimeEnum.TIME_FORMAT_SIMPLE;
        arrayList.add(new BotLeadUserOrderHistoryContentShowData(strAYXKKw5, pTA.format$default(date, oKDateEnum, oKTimeEnum, null, null, false, 28, null), 0, null, 12, null));
        arrayList.add(new BotLeadUserOrderHistoryContentShowData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), pTA.format$default(new Date(C33129mqd.valueOf(botLeadUserOrderHistoryModel.getUTime())), oKDateEnum, oKTimeEnum, null, null, false, 28, null), 0, null, 12, null));
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.valueOf, this.copydefault, this.djBIcL);
    }

    public static final Unit KWHzl(Function1 function1, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            if (function1 != null) {
                function1.invoke(yDY.AhwBna());
            }
        } else if (function1 != null) {
            List listAhwBna = (List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            function1.invoke(listAhwBna);
        }
        return Unit.INSTANCE;
    }
}
