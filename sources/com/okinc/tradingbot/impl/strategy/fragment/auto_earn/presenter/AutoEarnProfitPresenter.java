package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistoryOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoTypeProfit;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.HomeStrategyFilterCoin;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33129mqd;
import o.C54132wyb;
import o.C54138wyh;
import o.C54143wym;
import o.C54146wyp;
import o.C54151wyu;
import o.C54589xNz;
import o.C54799xVt;
import o.C56033xvF;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.vNB;
import o.xKK;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class AutoEarnProfitPresenter extends AbsPresenter {
    public final MutableStateFlow<vNB<StateListAnimator>> AEQbTJ;
    public final C54143wym AYXKKw;
    public TaskDescription AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final StateFlow<vNB<StateListAnimator>> AuCTel;
    public String DbNXlk;
    public final MutableStateFlow<TaskDescription> EZpvd;
    public String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public int copydefault;
    public final C54146wyp djBIcL;
    public final C54151wyu ejfBZ;
    public final StateFlow<TaskDescription> fARcdN;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final int gEmmrt;
    public final CoroutineDispatcher isConnected;
    public final InterfaceC56387yDm valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.values > this.copydefault * this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<StateListAnimator>> AYXKKw() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(TaskDescription taskDescription) {
        this.AhwBna = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> djBIcL() {
        return this.fARcdN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public AutoEarnProfitPresenter(@NotNull android.app.Application application, @NotNull C54143wym c54143wym, @NotNull C54146wyp c54146wyp, @NotNull C54151wyu c54151wyu, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull final SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c54143wym, "");
        Intrinsics.checkNotNullParameter(c54146wyp, "");
        Intrinsics.checkNotNullParameter(c54151wyu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AYXKKw = c54143wym;
        this.djBIcL = c54146wyp;
        this.ejfBZ = c54151wyu;
        this.isConnected = coroutineDispatcher;
        this.copydefault = 1;
        this.gEmmrt = 40;
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.wyt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AutoEarnProfitPresenter.KWHzl(savedStateHandle);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.wyr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AutoEarnProfitPresenter.djBIcL(savedStateHandle);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AutoEarnProfitPresenter.OLrzqt(savedStateHandle);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wyw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AutoEarnProfitPresenter.values(this.copydefault);
            }
        });
        this.KWHzl = "";
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        StateFlow<TaskDescription> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.fARcdN = stateFlowAsStateFlow;
        this.AhwBna = stateFlowAsStateFlow.getValue();
        MutableStateFlow<vNB<StateListAnimator>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(vNB.Activity.copydefault);
        this.AEQbTJ = MutableStateFlow2;
        this.AuCTel = MutableStateFlow2;
        String strCopydefault = copydefault();
        if (strCopydefault != null) {
            c54151wyu.copydefault(strCopydefault);
        }
    }

    public static final Boolean KWHzl(SavedStateHandle savedStateHandle) {
        return (Boolean) savedStateHandle.get(C54132wyb.Companion.EZpvd());
    }

    public final TacticsData valueOf() {
        return (TacticsData) this.AkhnZx.getValue();
    }

    public static final TacticsData djBIcL(SavedStateHandle savedStateHandle) {
        return (TacticsData) savedStateHandle.get(C54132wyb.Companion.KWHzl());
    }

    public final String copydefault() {
        return (String) this.OLrzqt.getValue();
    }

    public static final String OLrzqt(SavedStateHandle savedStateHandle) {
        return (String) savedStateHandle.get(C54132wyb.Companion.copydefault());
    }

    private final BizInstrument fetchVPNInfo() {
        return (BizInstrument) this.valueOf.getValue();
    }

    public static final BizInstrument values(AutoEarnProfitPresenter autoEarnProfitPresenter) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        TacticsData tacticsDataValueOf = autoEarnProfitPresenter.valueOf();
        String instType = tacticsDataValueOf != null ? tacticsDataValueOf.getInstType() : null;
        if (instType == null) {
            instType = "";
        }
        TacticsData tacticsDataValueOf2 = autoEarnProfitPresenter.valueOf();
        String instId = tacticsDataValueOf2 != null ? tacticsDataValueOf2.getInstId() : null;
        return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType, instId != null ? instId : "", null, null, 12, null);
    }

    public final boolean AhwBna() {
        return Intrinsics.EZpvd((Object) copydefault(), (Object) "auto_education_single_earn");
    }

    private final void values() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.isConnected, null, new AutoEarnProfitPresenter$init$1(this, null), 2, null);
    }

    public final void AEQbTJ(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (application instanceof Application.StateListAnimator) {
            values();
            return;
        }
        if (application instanceof Application.C0671Application) {
            this.KWHzl = ((Application.C0671Application) application).AEQbTJ();
            refresh$default(this, null, 1, null);
        } else {
            if (!(application instanceof Application.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            String strCopydefault = ((Application.Activity) application).copydefault();
            this.DbNXlk = strCopydefault;
            OLrzqt(strCopydefault);
        }
    }

    public static /* synthetic */ void refresh$default(AutoEarnProfitPresenter autoEarnProfitPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        autoEarnProfitPresenter.OLrzqt(str);
    }

    public final void OLrzqt(String str) {
        this.copydefault = 1;
        this.AEQbTJ.setValue(vNB.Activity.copydefault);
        AEQbTJ(true, this.KWHzl, str);
    }

    public final void gEmmrt() {
        if ((this.AEQbTJ.getValue() instanceof vNB.Activity) || !AEQbTJ()) {
            return;
        }
        this.copydefault++;
        AEQbTJ(false, this.KWHzl, this.DbNXlk);
    }

    public static /* synthetic */ void fetchHistory$default(AutoEarnProfitPresenter autoEarnProfitPresenter, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        autoEarnProfitPresenter.AEQbTJ(z, str, str2);
    }

    public final void AEQbTJ(boolean z, String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.isConnected, null, new AutoEarnProfitPresenter$fetchHistory$1(this, str, z, null), 2, null);
    }

    public final List<String> AEQbTJ(AutoEarnStakingProfitHistoryOverView autoEarnStakingProfitHistoryOverView) {
        List<String> listCopydefault;
        ArrayList<AutoTypeProfit> arrayList = new ArrayList();
        TaskDescription value = this.fARcdN.getValue();
        if (C33129mqd.KWHzl((Collection) (value != null ? value.copydefault() : null))) {
            TaskDescription value2 = this.fARcdN.getValue();
            if (value2 != null && (listCopydefault = value2.copydefault()) != null) {
                for (String str : listCopydefault) {
                    BizInstrument bizInstrumentFetchVPNInfo = fetchVPNInfo();
                    String tradeSymbol = bizInstrumentFetchVPNInfo != null ? bizInstrumentFetchVPNInfo.getTradeSymbol() : null;
                    if (tradeSymbol == null) {
                        tradeSymbol = "";
                    }
                    if (Intrinsics.EZpvd((Object) str, (Object) tradeSymbol)) {
                        arrayList.add(new AutoTypeProfit(autoEarnStakingProfitHistoryOverView.getBaseTotalProfit(), str));
                    } else {
                        BizInstrument bizInstrumentFetchVPNInfo2 = fetchVPNInfo();
                        String quoteSymbol = bizInstrumentFetchVPNInfo2 != null ? bizInstrumentFetchVPNInfo2.getQuoteSymbol() : null;
                        if (quoteSymbol == null) {
                            quoteSymbol = "";
                        }
                        if (Intrinsics.EZpvd((Object) str, (Object) quoteSymbol)) {
                            arrayList.add(new AutoTypeProfit(autoEarnStakingProfitHistoryOverView.getQuoteTotalProfit(), str));
                        } else {
                            arrayList.add(new AutoTypeProfit("", str));
                        }
                    }
                }
            }
        } else {
            String baseTotalProfit = autoEarnStakingProfitHistoryOverView.getBaseTotalProfit();
            BizInstrument bizInstrumentFetchVPNInfo3 = fetchVPNInfo();
            String tradeSymbol2 = bizInstrumentFetchVPNInfo3 != null ? bizInstrumentFetchVPNInfo3.getTradeSymbol() : null;
            if (tradeSymbol2 == null) {
                tradeSymbol2 = "";
            }
            arrayList.add(new AutoTypeProfit(baseTotalProfit, tradeSymbol2));
            String quoteTotalProfit = autoEarnStakingProfitHistoryOverView.getQuoteTotalProfit();
            BizInstrument bizInstrumentFetchVPNInfo4 = fetchVPNInfo();
            String quoteSymbol2 = bizInstrumentFetchVPNInfo4 != null ? bizInstrumentFetchVPNInfo4.getQuoteSymbol() : null;
            if (quoteSymbol2 == null) {
                quoteSymbol2 = "";
            }
            arrayList.add(new AutoTypeProfit(quoteTotalProfit, quoteSymbol2));
        }
        ArrayList arrayList2 = new ArrayList();
        if (autoEarnStakingProfitHistoryOverView.getTotalEarn().isEmpty()) {
            for (AutoTypeProfit autoTypeProfit : arrayList) {
                if (C33129mqd.AEQbTJ(autoTypeProfit.getProfit(), "0")) {
                    String ccy = autoTypeProfit.getCcy();
                    String str2 = ccy == null ? "" : ccy;
                    String profit = autoTypeProfit.getProfit();
                    arrayList2.add(C56033xvF.fmtBotValueBySymbol$default(str2, profit == null ? "" : profit, RoundingMode.DOWN, true, "8", false, null, null, null, null, DisplaySign.EXCEPT_ZERO, 992, null));
                }
            }
        } else {
            for (AutoTypeProfit autoTypeProfit2 : arrayList) {
                String profit2 = autoTypeProfit2.getProfit();
                for (AutoTypeProfit autoTypeProfit3 : autoEarnStakingProfitHistoryOverView.getTotalEarn()) {
                    if (Intrinsics.EZpvd((Object) autoTypeProfit2.getCcy(), (Object) autoTypeProfit3.getCcy())) {
                        profit2 = C33129mqd.addS$default(autoTypeProfit2.getProfit(), autoTypeProfit3.getProfit(), null, null, null, 14, null);
                    }
                }
                if (C33129mqd.AEQbTJ(profit2, "0")) {
                    String ccy2 = autoTypeProfit2.getCcy();
                    arrayList2.add(C56033xvF.fmtBotValueBySymbol$default(ccy2 == null ? "" : ccy2, profit2 == null ? "" : profit2, RoundingMode.DOWN, true, "8", false, null, null, null, null, DisplaySign.EXCEPT_ZERO, 992, null));
                }
            }
        }
        return arrayList2;
    }

    public final List<String> OLrzqt(AutoEarnStakingProfitHistoryOverView autoEarnStakingProfitHistoryOverView) {
        List<String> listCopydefault;
        ArrayList arrayList = new ArrayList();
        TaskDescription value = this.fARcdN.getValue();
        if (value != null && (listCopydefault = value.copydefault()) != null) {
            for (String str : listCopydefault) {
                for (AutoTypeProfit autoTypeProfit : autoEarnStakingProfitHistoryOverView.getTotalEarn()) {
                    if (Intrinsics.EZpvd((Object) str, (Object) autoTypeProfit.getCcy())) {
                        String profit = autoTypeProfit.getProfit();
                        String strFmtBotValueBySymbol$default = "";
                        if (profit != null && profit.length() != 0) {
                            String ccy = autoTypeProfit.getCcy();
                            String str2 = ccy == null ? "" : ccy;
                            String profit2 = autoTypeProfit.getProfit();
                            strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(str2, profit2 == null ? "" : profit2, RoundingMode.DOWN, true, "8", false, null, null, null, null, null, 2016, null);
                        }
                        arrayList.add(strFmtBotValueBySymbol$default);
                    }
                }
            }
        }
        return arrayList;
    }

    public final String copydefault(String str) {
        TaskDescription value;
        List<AutoEarnOverView> listKWHzl;
        AutoEarnOverView autoEarnOverView;
        String ccy;
        String strGEmmrt;
        if (str != null && str.length() != 0) {
            return C33129mqd.gEmmrt(str);
        }
        MutableStateFlow<TaskDescription> mutableStateFlow = this.EZpvd;
        return (mutableStateFlow == null || (value = mutableStateFlow.getValue()) == null || (listKWHzl = value.KWHzl()) == null || (autoEarnOverView = (AutoEarnOverView) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || (ccy = autoEarnOverView.getCcy()) == null || (strGEmmrt = C33129mqd.gEmmrt(ccy)) == null) ? "" : strGEmmrt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String DbNXlk() {
        return Intrinsics.EZpvd((Object) copydefault(), (Object) "auto_education_single_earn") ? "autoEarn" : "autoStaking";
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    public static final class TaskDescription {
        public List<AutoEarnOverView> KWHzl;
        public final List<String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                list2 = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull List<AutoEarnOverView> list, @NotNull List<String> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new TaskDescription(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<AutoEarnOverView> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AutoEarnStakingProfitUiModel(autoOverView=" + this.KWHzl + ", autoStakingAndEarnCoins=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull List<AutoEarnOverView> list, @NotNull List<String> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.KWHzl = list;
            this.copydefault = list2;
        }
    }

    public interface Application {

        public static final class StateListAnimator implements Application {
            public static final StateListAnimator AEQbTJ = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter$Application$Application, reason: collision with other inner class name */
        public static final class C0671Application implements Application {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0671Application copy$default(C0671Application c0671Application, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0671Application.OLrzqt;
                }
                return c0671Application.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0671Application EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0671Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0671Application) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((C0671Application) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SwitchProfitQuota(content=" + this.OLrzqt + ")";
            }

            public C0671Application(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        public static final class Activity implements Application {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.AEQbTJ;
                }
                return activity.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((Activity) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SwitchProfitcalculateUnit(content=" + this.AEQbTJ + ")";
            }

            public Activity(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }
    }

    public static final class StateListAnimator {
        public final List<String> AEQbTJ;
        public final List<AutoTypeProfit> AhwBna;
        public final String EZpvd;
        public final boolean KWHzl;
        public final List<String> OLrzqt;
        public final List<C54138wyh> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, List list, boolean z, List list2, List list3, List list4, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.KWHzl;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                list2 = stateListAnimator.AEQbTJ;
            }
            List list5 = list2;
            if ((i & 8) != 0) {
                list3 = stateListAnimator.OLrzqt;
            }
            List list6 = list3;
            if ((i & 16) != 0) {
                list4 = stateListAnimator.AhwBna;
            }
            List list7 = list4;
            if ((i & 32) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.AEQbTJ(list, z2, list5, list6, list7, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull List<C54138wyh> list, boolean z, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<AutoTypeProfit> list4, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(list, z, list2, list3, list4, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<C54138wyh> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, stateListAnimator.AhwBna) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.copydefault.hashCode() * 31) + Boolean.hashCode(this.KWHzl)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "State(profitList=" + this.copydefault + ", canLoadMore=" + this.KWHzl + ", stakingTotalProfit=" + this.AEQbTJ + ", earnTotalProfit=" + this.OLrzqt + ", totalEarnOrStakingAmount=" + this.AhwBna + ", autoEarnProfitUsdt=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull List<C54138wyh> list, boolean z, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<AutoTypeProfit> list4, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = list;
            this.KWHzl = z;
            this.AEQbTJ = list2;
            this.OLrzqt = list3;
            this.AhwBna = list4;
            this.EZpvd = str;
        }
    }

    public final List<HomeStrategyFilterCoin> copydefault(List<String> list, List<String> list2) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (String str : list) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(str) : null;
            boolean z = list2 != null && list2.contains(str);
            TradeCoinInfo tradeCoinInfoOLrzqt = C54799xVt.AEQbTJ.OLrzqt(str);
            arrayList.add(new HomeStrategyFilterCoin(str, str, z, strValueOf, null, str, AudioStats.AUDIO_AMPLITUDE_NONE, tradeCoinInfoOLrzqt != null ? tradeCoinInfoOLrzqt.getName() : null, AudioStats.AUDIO_AMPLITUDE_NONE, 336, null));
        }
        return CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList);
    }
}
