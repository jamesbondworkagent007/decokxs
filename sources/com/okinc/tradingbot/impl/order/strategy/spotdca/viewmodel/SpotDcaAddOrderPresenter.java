package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import androidx.annotation.StringRes;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.order.strategy.data.StrategyOrderType;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC54531xLw;
import o.AbstractC55678xoV;
import o.AbstractC55737xpb;
import o.C33070mpX;
import o.C33129mqd;
import o.C53152wgB;
import o.C53200wgx;
import o.C53201wgy;
import o.C53202wgz;
import o.C53873wth;
import o.C54589xNz;
import o.C54793xVn;
import o.C55688xof;
import o.C55887xsS;
import o.C56120xwn;
import o.C56392yDr;
import o.C56402yEa;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.uLP;
import o.xKK;
import o.xMR;
import o.xMS;
import o.yCM;
import o.yDY;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaAddOrderPresenter extends AbsPresenter {
    public MutableLiveData<TickersData> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final MutableSharedFlow<TaskDescription> EZpvd;
    public final MutableStateFlow<Fragment> KWHzl;
    public MutableLiveData<LimitPriceData> OLrzqt;
    public MutableLiveData<StrategyConfigInfo> copydefault;
    public final C53202wgz djBIcL;
    public final SharedFlow<TaskDescription> fARcdN;
    public final StateFlow<Fragment> fIwbmz;
    public final C53152wgB fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final C53201wgy gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final C53200wgx values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Fragment> AYXKKw() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<TaskDescription> valueOf() {
        return this.fARcdN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SpotDcaAddOrderPresenter(@NotNull android.app.Application application, @NotNull C53201wgy c53201wgy, @NotNull C53202wgz c53202wgz, @NotNull C53200wgx c53200wgx, @NotNull C53152wgB c53152wgB, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull final SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c53201wgy, "");
        Intrinsics.checkNotNullParameter(c53202wgz, "");
        Intrinsics.checkNotNullParameter(c53200wgx, "");
        Intrinsics.checkNotNullParameter(c53152wgB, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.gEmmrt = c53201wgy;
        this.djBIcL = c53202wgz;
        this.values = c53200wgx;
        this.fJNWhG = c53152wgB;
        this.AhwBna = coroutineDispatcher;
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.wjT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SpotDcaAddOrderPresenter.copydefault(savedStateHandle);
            }
        });
        MutableStateFlow<Fragment> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.fIwbmz = FlowKt.stateIn(FlowKt.combine(FlowKt.filterNotNull(MutableStateFlow), FlowLiveDataConversions.asFlow(this.AEQbTJ), new SpotDcaAddOrderPresenter$uiModelFlow$1(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), MutableStateFlow.getValue());
        MutableSharedFlow<TaskDescription> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SpotDcaAddOrderPresenter.fARcdN(this.KWHzl);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SpotDcaAddOrderPresenter.AuCTel(this.EZpvd);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.wjS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SpotDcaAddOrderPresenter.getNewProxyInstance(this.KWHzl);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.wjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SpotDcaAddOrderPresenter.hDKMBd(this.KWHzl);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.wjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SpotDcaAddOrderPresenter.iwGUEr(this.copydefault);
            }
        });
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.wjY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SpotDcaAddOrderPresenter.uzCIH(this.OLrzqt);
            }
        });
        c53152wgB.OLrzqt(gEmmrt(), copydefault(), isConnected(), new AnonymousClass1(this), new AnonymousClass2(this));
    }

    public final TacticsData gEmmrt() {
        return (TacticsData) this.DbNXlk.getValue();
    }

    public static final TacticsData copydefault(SavedStateHandle savedStateHandle) {
        return (TacticsData) savedStateHandle.get("tactics_data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C55887xsS isConnected() {
        return (C55887xsS) this.AYXKKw.getValue();
    }

    public static final C55887xsS fARcdN(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter) {
        TacticsData tacticsDataGEmmrt = spotDcaAddOrderPresenter.gEmmrt();
        String instId = tacticsDataGEmmrt != null ? tacticsDataGEmmrt.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        C55887xsS c55887xsS = new C55887xsS("SPOT", instId);
        TacticsData tacticsDataGEmmrt2 = spotDcaAddOrderPresenter.gEmmrt();
        c55887xsS.gEmmrt(tacticsDataGEmmrt2 != null ? tacticsDataGEmmrt2.getTradeQuoteCcy() : null);
        return c55887xsS;
    }

    public final SpotInstrument copydefault() {
        return (SpotInstrument) this.valueOf.getValue();
    }

    public static final SpotInstrument AuCTel(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter) {
        BizInstrument suggestedInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsDataGEmmrt = spotDcaAddOrderPresenter.gEmmrt();
            String instType = tacticsDataGEmmrt != null ? tacticsDataGEmmrt.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            TacticsData tacticsDataGEmmrt2 = spotDcaAddOrderPresenter.gEmmrt();
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType, tacticsDataGEmmrt2 != null ? tacticsDataGEmmrt2.getInstId() : null, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (suggestedInstrument$default instanceof SpotInstrument) {
            return (SpotInstrument) suggestedInstrument$default;
        }
        return null;
    }

    public final xMS OLrzqt() {
        return (xMS) this.fetchVPNInfo.getValue();
    }

    public static final xMS getNewProxyInstance(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(spotDcaAddOrderPresenter.isConnected().djBIcL())) == null) {
            return null;
        }
        BizInstrument bizInstrumentAhwBna = spotDcaAddOrderPresenter.isConnected().AhwBna();
        String instFamily = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getInstFamily() : null;
        if (instFamily == null) {
            instFamily = "";
        }
        return abstractC54531xLwOLrzqt.gEmmrt(instFamily);
    }

    public final Application AhwBna() {
        return (Application) this.AkhnZx.getValue();
    }

    public static final Application hDKMBd(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter) {
        TacticsData tacticsDataGEmmrt = spotDcaAddOrderPresenter.gEmmrt();
        if (tacticsDataGEmmrt != null) {
            return new Application(spotDcaAddOrderPresenter, tacticsDataGEmmrt.getInstId(), C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis())), false, 4, null);
        }
        return null;
    }

    public final StateListAnimator EZpvd() {
        return (StateListAnimator) this.isConnected.getValue();
    }

    public static final StateListAnimator iwGUEr(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter) {
        TacticsData tacticsDataGEmmrt = spotDcaAddOrderPresenter.gEmmrt();
        if (tacticsDataGEmmrt != null) {
            return new StateListAnimator(spotDcaAddOrderPresenter, tacticsDataGEmmrt.getInstId(), C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis())));
        }
        return null;
    }

    public final ArrayList<Object> djBIcL() {
        return (ArrayList) this.AuCTel.getValue();
    }

    public static final ArrayList uzCIH(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter) {
        ArrayList arrayList = new ArrayList();
        Application applicationAhwBna = spotDcaAddOrderPresenter.AhwBna();
        if (applicationAhwBna != null) {
            arrayList.add(applicationAhwBna);
        }
        StateListAnimator stateListAnimatorEZpvd = spotDcaAddOrderPresenter.EZpvd();
        if (stateListAnimatorEZpvd != null) {
            arrayList.add(stateListAnimatorEZpvd);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<String, String> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Object obj) {
            super(1, obj, SpotDcaAddOrderPresenter.class, "formatPrice", "formatPrice(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return ((SpotDcaAddOrderPresenter) this.receiver).AEQbTJ(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements yHT<Boolean, String, TickersData, StrategyConfigInfo, String> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Object obj) {
            super(4, obj, SpotDcaAddOrderPresenter.class, "calculateMinAmount", "calculateMinAmount(ZLjava/lang/String;Lcom/okinc/unify_trade/biz/subscribe/TickersData;Lcom/okinc/unify_trade/biz/StrategyConfigInfo;)Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* synthetic */ String invoke(Boolean bool, String str, TickersData tickersData, StrategyConfigInfo strategyConfigInfo) {
            return invoke(bool.booleanValue(), str, tickersData, strategyConfigInfo);
        }

        public final String invoke(boolean z, String str, TickersData tickersData, StrategyConfigInfo strategyConfigInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tickersData, "");
            Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
            return ((SpotDcaAddOrderPresenter) this.receiver).OLrzqt(z, str, tickersData, strategyConfigInfo);
        }
    }

    private final void values() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AhwBna, null, new SpotDcaAddOrderPresenter$init$1(this, null), 2, null);
    }

    public final void copydefault(@NotNull Activity activity) {
        Fragment value;
        Fragment fragment;
        Fragment value2;
        Fragment fragment2;
        Fragment value3;
        Fragment fragment3;
        Fragment value4;
        Fragment fragment4;
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof Activity.LoaderManager) {
            values();
            return;
        }
        if (!(activity instanceof Activity.C0656Activity)) {
            if (!(activity instanceof Activity.TaskDescription)) {
                if (!(activity instanceof Activity.PendingIntent)) {
                    if (!(activity instanceof Activity.ActionBar)) {
                        if (activity instanceof Activity.StateListAnimator) {
                            DbNXlk();
                            return;
                        } else if (activity instanceof Activity.Application) {
                            AkhnZx();
                            return;
                        } else {
                            if (!(activity instanceof Activity.Fragment)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fetchVPNInfo();
                            return;
                        }
                    }
                    MutableStateFlow<Fragment> mutableStateFlow = this.KWHzl;
                    do {
                        value = mutableStateFlow.getValue();
                        fragment = value;
                    } while (!mutableStateFlow.compareAndSet(value, fragment != null ? Fragment.m7101copypoI0buE$default(fragment, null, null, 0, null, true, null, null, null, null, null, null, null, null, null, null, 32751, null) : null));
                    return;
                }
                MutableStateFlow<Fragment> mutableStateFlow2 = this.KWHzl;
                do {
                    value2 = mutableStateFlow2.getValue();
                    fragment2 = value2;
                } while (!mutableStateFlow2.compareAndSet(value2, fragment2 != null ? Fragment.m7101copypoI0buE$default(fragment2, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, 32751, null) : null));
                return;
            }
            MutableStateFlow<Fragment> mutableStateFlow3 = this.KWHzl;
            do {
                value3 = mutableStateFlow3.getValue();
                fragment3 = value3;
            } while (!mutableStateFlow3.compareAndSet(value3, fragment3 != null ? Fragment.m7101copypoI0buE$default(fragment3, null, null, 0, null, false, null, null, null, null, null, ((Activity.TaskDescription) activity).OLrzqt(), null, null, null, null, 27647, null) : null));
            return;
        }
        MutableStateFlow<Fragment> mutableStateFlow4 = this.KWHzl;
        do {
            value4 = mutableStateFlow4.getValue();
            fragment4 = value4;
        } while (!mutableStateFlow4.compareAndSet(value4, fragment4 != null ? Fragment.m7101copypoI0buE$default(fragment4, null, null, 0, null, false, null, null, null, null, ((Activity.C0656Activity) activity).AEQbTJ(), null, null, null, null, null, 30207, null) : null));
    }

    public final void DbNXlk() {
        String buyLmt;
        Fragment value = this.fIwbmz.getValue();
        if (value != null) {
            String strComponent2 = AEQbTJ(value).component2();
            LimitPriceData value2 = this.OLrzqt.getValue();
            if (value2 != null && (buyLmt = value2.getBuyLmt()) != null) {
                if (C33129mqd.AEQbTJ(C33129mqd.EZpvd(strComponent2), buyLmt)) {
                    this.EZpvd.tryEmit(TaskDescription.C0657TaskDescription.EZpvd);
                    return;
                } else {
                    AkhnZx();
                    return;
                }
            }
            AkhnZx();
        }
    }

    public final void AkhnZx() {
        TacticsData tacticsDataGEmmrt;
        Fragment value = this.fIwbmz.getValue();
        if (value == null || (tacticsDataGEmmrt = gEmmrt()) == null) {
            return;
        }
        Triple<StrategyOrderType, String, String> tripleAEQbTJ = AEQbTJ(value);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AhwBna, null, new SpotDcaAddOrderPresenter$handlePlaceOrderPreCheck$1$1$1(this, tacticsDataGEmmrt, tripleAEQbTJ.component2(), tripleAEQbTJ.component3(), tripleAEQbTJ.component1(), null), 2, null);
    }

    private final void fetchVPNInfo() {
        TacticsData tacticsDataGEmmrt;
        Fragment value = this.fIwbmz.getValue();
        if (value == null || (tacticsDataGEmmrt = gEmmrt()) == null) {
            return;
        }
        Triple<StrategyOrderType, String, String> tripleAEQbTJ = AEQbTJ(value);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AhwBna, null, new SpotDcaAddOrderPresenter$placeOrder$1$1$1(this, tacticsDataGEmmrt, tripleAEQbTJ.component2(), tripleAEQbTJ.component3(), tripleAEQbTJ.component1(), null), 2, null);
    }

    public final Triple<StrategyOrderType, String, String> AEQbTJ(Fragment fragment) {
        if (fragment.isConnected()) {
            StrategyOrderType strategyOrderType = StrategyOrderType.MARKET;
            String strAYXKKw = fragment.AYXKKw();
            return new Triple<>(strategyOrderType, null, strAYXKKw != null ? strAYXKKw : "");
        }
        StrategyOrderType strategyOrderType2 = StrategyOrderType.LIMIT;
        String strAhwBna = fragment.AhwBna();
        String strAYXKKw2 = fragment.AYXKKw();
        return new Triple<>(strategyOrderType2, strAhwBna, strAYXKKw2 != null ? strAYXKKw2 : "");
    }

    public final String AEQbTJ(float f) {
        Fragment value = this.KWHzl.getValue();
        String strKWHzl = value != null ? uLP.KWHzl(value.values()) : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        return AEQbTJ(C33129mqd.mulS$default(Float.valueOf(f), strKWHzl, null, null, null, 14, null));
    }

    public final ActionBar.InterfaceC0653ActionBar OLrzqt(String str) {
        String str2 = null;
        byte b = 0;
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            return null;
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        TacticsData tacticsDataGEmmrt = gEmmrt();
        if (C33129mqd.gEmmrt(bigDecimalEZpvd, C33129mqd.EZpvd(tacticsDataGEmmrt != null ? tacticsDataGEmmrt.getSlPx() : null))) {
            return new ActionBar.InterfaceC0653ActionBar.Activity(str2, 1, b == true ? 1 : 0);
        }
        return null;
    }

    public final ActionBar.Activity OLrzqt(String str, String str2, String str3) {
        String strDbNXlk;
        ActionBar.Activity stateListAnimator;
        if (C33129mqd.OLrzqt((CharSequence) str) && C33129mqd.gEmmrt(C33129mqd.EZpvd(str), str2)) {
            Fragment value = this.KWHzl.getValue();
            strDbNXlk = value != null ? value.DbNXlk() : null;
            stateListAnimator = new ActionBar.Activity.TaskDescription(null, 0, str2, strDbNXlk == null ? "" : strDbNXlk, 3, null);
        } else {
            if (!C33129mqd.OLrzqt((CharSequence) str) || !C33129mqd.AEQbTJ(C33129mqd.EZpvd(str), str3)) {
                return null;
            }
            String strAEQbTJ = AEQbTJ(str3);
            Fragment value2 = this.KWHzl.getValue();
            strDbNXlk = value2 != null ? value2.DbNXlk() : null;
            stateListAnimator = new ActionBar.Activity.StateListAnimator(null, 0, strAEQbTJ, strDbNXlk == null ? "" : strDbNXlk, 3, null);
        }
        return stateListAnimator;
    }

    public final String AEQbTJ(String str) {
        xMR xmr = xMR.copydefault;
        xMS xmsOLrzqt = OLrzqt();
        String strAhwBna = xmsOLrzqt != null ? xmsOLrzqt.AhwBna(str) : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        xMS xmsOLrzqt2 = OLrzqt();
        return xmr.AEQbTJ(strAhwBna, C33129mqd.AhwBna(xmsOLrzqt2 != null ? xmsOLrzqt2.AEQbTJ() : null));
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SpotDcaAddOrderPresenter$clearWsTasks$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SpotDcaAddOrderPresenter$connectWsTasks$1(this, null), 3, null);
    }

    public final String OLrzqt(boolean z, String str, TickersData tickersData, StrategyConfigInfo strategyConfigInfo) {
        String strMulS$default;
        if (z) {
            String strCopydefault = new C53873wth(C54793xVn.OLrzqt.copydefault(tickersData)).KWHzl(strategyConfigInfo);
            double dAEQbTJ = C33129mqd.AEQbTJ(strCopydefault);
            TacticsData tacticsDataGEmmrt = gEmmrt();
            strMulS$default = C33129mqd.gEmmrt(Double.valueOf(Math.max(dAEQbTJ, C33129mqd.AEQbTJ(C33129mqd.divS$default(strCopydefault, Double.valueOf(Math.pow(C33129mqd.AEQbTJ(tacticsDataGEmmrt != null ? tacticsDataGEmmrt.getVolMult() : null), C33129mqd.AhwBna(gEmmrt() != null ? r2.getMaxSafetyOrds() : null) - 1)), null, null, null, 14, null)))));
        } else {
            StrategyConfigInfo value = this.copydefault.getValue();
            strMulS$default = C33129mqd.mulS$default(value != null ? value.getSzMin() : null, C33129mqd.EZpvd(str), null, null, null, 14, null);
        }
        return AEQbTJ(strMulS$default);
    }

    public final class Application extends AbstractC55737xpb {
        public final /* synthetic */ SpotDcaAddOrderPresenter KWHzl;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* bridge */ /* synthetic */ void EZpvd(List<? extends TickersData> list, String str) {
            EZpvd2((List<TickersData>) list, str);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter, java.lang.String, java.lang.String, boolean):void (m)] (LINE:449) call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.Application.<init>(com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Application(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(spotDcaAddOrderPresenter, str, str2, (i & 4) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull SpotDcaAddOrderPresenter spotDcaAddOrderPresenter, @NotNull String str, String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = spotDcaAddOrderPresenter;
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(@NotNull List<TickersData> list, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (tickersData != null) {
                this.KWHzl.AEQbTJ.postValue(tickersData);
            } else {
                this.KWHzl.AEQbTJ.postValue(null);
            }
        }
    }

    public final class StateListAnimator extends AbstractC55678xoV {
        public final /* synthetic */ SpotDcaAddOrderPresenter OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull SpotDcaAddOrderPresenter spotDcaAddOrderPresenter, @NotNull String str, String str2) {
            super(str, str2);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = spotDcaAddOrderPresenter;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(@NotNull LimitPriceData limitPriceData, @NotNull String str, Boolean bool) {
            Intrinsics.checkNotNullParameter(limitPriceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt.OLrzqt.postValue(limitPriceData);
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    public static final class Fragment {
        public final String AEQbTJ;
        public final String AYXKKw;
        public final ActionBar.Activity AhwBna;
        public final boolean AkhnZx;
        public final Pair<? extends String, ? extends String> DbNXlk;
        public final ActionBar.Application EZpvd;
        public final Pair<? extends String, ? extends String> KWHzl;
        public final Pair<? extends String, ? extends String> OLrzqt;
        public final String copydefault;
        public final String djBIcL;
        public final int fetchVPNInfo;
        public final ActionBar.InterfaceC0653ActionBar gEmmrt;
        public final String isConnected;
        public final String valueOf;
        public final String values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 int)
  (r4v0 java.lang.String)
  (r5v0 boolean)
  (r6v0 kotlin.Pair)
  (r7v0 kotlin.Pair)
  (r8v0 kotlin.Pair)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar)
  (r13v0 com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity)
  (r14v0 com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Application)
  (r15v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, boolean, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Application, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.Fragment.<init>(java.lang.String, java.lang.String, int, java.lang.String, boolean, kotlin.Pair, kotlin.Pair, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Application, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Fragment(String str, String str2, int i, String str3, boolean z, Pair pair, Pair pair2, Pair pair3, String str4, String str5, String str6, ActionBar.InterfaceC0653ActionBar interfaceC0653ActionBar, ActionBar.Activity activity, ActionBar.Application application, String str7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, str3, z, pair, pair2, pair3, str4, str5, str6, interfaceC0653ActionBar, activity, application, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-poI0buE$default, reason: not valid java name */
        public static /* synthetic */ Fragment m7101copypoI0buE$default(Fragment fragment, String str, String str2, int i, String str3, boolean z, Pair pair, Pair pair2, Pair pair3, String str4, String str5, String str6, ActionBar.InterfaceC0653ActionBar interfaceC0653ActionBar, ActionBar.Activity activity, ActionBar.Application application, String str7, int i2, Object obj) {
            return fragment.EZpvd((i2 & 1) != 0 ? fragment.valueOf : str, (i2 & 2) != 0 ? fragment.values : str2, (i2 & 4) != 0 ? fragment.fetchVPNInfo : i, (i2 & 8) != 0 ? fragment.copydefault : str3, (i2 & 16) != 0 ? fragment.AkhnZx : z, (i2 & 32) != 0 ? fragment.OLrzqt : pair, (i2 & 64) != 0 ? fragment.KWHzl : pair2, (i2 & 128) != 0 ? fragment.DbNXlk : pair3, (i2 & 256) != 0 ? fragment.isConnected : str4, (i2 & 512) != 0 ? fragment.djBIcL : str5, (i2 & 1024) != 0 ? fragment.AYXKKw : str6, (i2 & 2048) != 0 ? fragment.gEmmrt : interfaceC0653ActionBar, (i2 & 4096) != 0 ? fragment.AhwBna : activity, (i2 & 8192) != 0 ? fragment.EZpvd : application, (i2 & 16384) != 0 ? fragment.AEQbTJ : str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment EZpvd(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, boolean z, @NotNull Pair<? extends String, ? extends String> pair, @NotNull Pair<? extends String, ? extends String> pair2, @NotNull Pair<? extends String, ? extends String> pair3, @NotNull String str4, String str5, String str6, ActionBar.InterfaceC0653ActionBar interfaceC0653ActionBar, ActionBar.Activity activity, ActionBar.Application application, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            Intrinsics.checkNotNullParameter(pair3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new Fragment(str, str2, i, str3, z, pair, pair2, pair3, str4, str5, str6, interfaceC0653ActionBar, activity, application, str7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar.Application KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return Intrinsics.EZpvd((Object) this.valueOf, (Object) fragment.valueOf) && Intrinsics.EZpvd((Object) this.values, (Object) fragment.values) && this.fetchVPNInfo == fragment.fetchVPNInfo && Intrinsics.EZpvd((Object) this.copydefault, (Object) fragment.copydefault) && this.AkhnZx == fragment.AkhnZx && uLP.EZpvd(this.OLrzqt, fragment.OLrzqt) && uLP.EZpvd(this.KWHzl, fragment.KWHzl) && uLP.EZpvd(this.DbNXlk, fragment.DbNXlk) && Intrinsics.EZpvd((Object) this.isConnected, (Object) fragment.isConnected) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) fragment.djBIcL) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) fragment.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, fragment.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, fragment.AhwBna) && Intrinsics.EZpvd(this.EZpvd, fragment.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) fragment.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int fetchVPNInfo() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar.InterfaceC0653ActionBar gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.valueOf.hashCode();
            int iHashCode2 = this.values.hashCode();
            int iHashCode3 = Integer.hashCode(this.fetchVPNInfo);
            int iHashCode4 = this.copydefault.hashCode();
            int iHashCode5 = Boolean.hashCode(this.AkhnZx);
            int iEZpvd = uLP.EZpvd(this.OLrzqt);
            int iEZpvd2 = uLP.EZpvd(this.KWHzl);
            int iEZpvd3 = uLP.EZpvd(this.DbNXlk);
            int iHashCode6 = this.isConnected.hashCode();
            String str = this.djBIcL;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            String str2 = this.AYXKKw;
            int iHashCode8 = str2 == null ? 0 : str2.hashCode();
            ActionBar.InterfaceC0653ActionBar interfaceC0653ActionBar = this.gEmmrt;
            int iHashCode9 = interfaceC0653ActionBar == null ? 0 : interfaceC0653ActionBar.hashCode();
            ActionBar.Activity activity = this.AhwBna;
            int iHashCode10 = activity == null ? 0 : activity.hashCode();
            ActionBar.Application application = this.EZpvd;
            return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iEZpvd) * 31) + iEZpvd2) * 31) + iEZpvd3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (application != null ? application.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SpotDcaAddOrderUiModel(instTitle=" + this.valueOf + ", symbol=" + this.values + ", pricePrecision=" + this.fetchVPNInfo + ", currentMarketPrice=" + this.copydefault + ", isUseMarketPrice=" + this.AkhnZx + ", availableVirtualFund=" + uLP.gEmmrt(this.OLrzqt) + ", availableMaxTradingFund=" + uLP.gEmmrt(this.KWHzl) + ", maxAvailableAmount=" + uLP.gEmmrt(this.DbNXlk) + ", minAmount=" + this.isConnected + ", inputPriceString=" + this.djBIcL + ", inputAmountString=" + this.AYXKKw + ", inputPriceError=" + this.gEmmrt + ", inputAmountError=" + this.AhwBna + ", error=" + this.EZpvd + ", displaySymbol=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar.Activity valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> values() {
            return this.DbNXlk;
        }

        public Fragment(String str, String str2, int i, String str3, boolean z, Pair<? extends String, ? extends String> pair, Pair<? extends String, ? extends String> pair2, Pair<? extends String, ? extends String> pair3, String str4, String str5, String str6, ActionBar.InterfaceC0653ActionBar interfaceC0653ActionBar, ActionBar.Activity activity, ActionBar.Application application, String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            Intrinsics.checkNotNullParameter(pair3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.valueOf = str;
            this.values = str2;
            this.fetchVPNInfo = i;
            this.copydefault = str3;
            this.AkhnZx = z;
            this.OLrzqt = pair;
            this.KWHzl = pair2;
            this.DbNXlk = pair3;
            this.isConnected = str4;
            this.djBIcL = str5;
            this.AYXKKw = str6;
            this.gEmmrt = interfaceC0653ActionBar;
            this.AhwBna = activity;
            this.EZpvd = application;
            this.AEQbTJ = str7;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0045: CONSTRUCTOR 
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 int)
  (r24v0 java.lang.String)
  (r25v0 boolean)
  (r26v0 kotlin.Pair)
  (r27v0 kotlin.Pair)
  (r28v0 kotlin.Pair)
  (r29v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar:?: TERNARY null = ((wrap:int:0x0013: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar) : (r32v0 com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar))
  (wrap:com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity:?: TERNARY null = ((wrap:int:0x001b: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity) : (r33v0 com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity))
  (wrap:com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Application:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Application) : (r34v0 com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Application))
  (r35v0 java.lang.String)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, boolean, kotlin.Pair, kotlin.Pair, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Application, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:477) call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.Fragment.<init>(java.lang.String, java.lang.String, int, java.lang.String, boolean, kotlin.Pair, kotlin.Pair, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity, com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Application, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
        public /* synthetic */ Fragment(String str, String str2, int i, String str3, boolean z, Pair pair, Pair pair2, Pair pair3, String str4, String str5, String str6, ActionBar.InterfaceC0653ActionBar interfaceC0653ActionBar, ActionBar.Activity activity, ActionBar.Application application, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, str3, z, pair, pair2, pair3, str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : interfaceC0653ActionBar, (i2 & 4096) != 0 ? null : activity, (i2 & 8192) != 0 ? null : application, str7, null);
        }
    }

    public interface Activity {

        public static final class LoaderManager implements Activity {
            public static final LoaderManager AEQbTJ = new LoaderManager();

            private LoaderManager() {
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$Activity$Activity, reason: collision with other inner class name */
        public static final class C0656Activity implements Activity {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0656Activity copy$default(C0656Activity c0656Activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0656Activity.OLrzqt;
                }
                return c0656Activity.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0656Activity copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0656Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0656Activity) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((C0656Activity) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InputPriceChange(content=" + this.OLrzqt + ")";
            }

            public C0656Activity(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        public static final class TaskDescription implements Activity {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.OLrzqt;
                }
                return taskDescription.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InputAmountChange(content=" + this.OLrzqt + ")";
            }

            public TaskDescription(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        public static final class ActionBar implements Activity {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
            }
        }

        public static final class PendingIntent implements Activity {
            public static final PendingIntent OLrzqt = new PendingIntent();

            private PendingIntent() {
            }
        }

        public static final class StateListAnimator implements Activity {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        public static final class Application implements Activity {
            public static final Application AEQbTJ = new Application();

            private Application() {
            }
        }

        public static final class Fragment implements Activity {
            public static final Fragment OLrzqt = new Fragment();

            private Fragment() {
            }
        }
    }

    public interface TaskDescription {

        public static final class Application implements TaskDescription {
            public final String EZpvd;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.EZpvd;
                }
                if ((i & 2) != 0) {
                    str2 = application.copydefault;
                }
                return application.AEQbTJ(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Application(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((Object) this.EZpvd, (Object) application.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowConfirmManuallyAddFundsDialog(amount=" + this.EZpvd + ", symbol=" + this.copydefault + ")";
            }

            public Application(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.EZpvd = str;
                this.copydefault = str2;
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0657TaskDescription implements TaskDescription {
            public static final C0657TaskDescription EZpvd = new C0657TaskDescription();

            private C0657TaskDescription() {
            }
        }

        public static final class ActionBar implements TaskDescription {
            public static final ActionBar EZpvd = new ActionBar();

            private ActionBar() {
            }
        }

        public static final class StateListAnimator implements TaskDescription {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowErrorToast(message=" + this.OLrzqt + ")";
            }

            public StateListAnimator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        public static final class Activity implements TaskDescription {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.copydefault;
                }
                return activity.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SetPriceInputOnFirstLoad(priceInput=" + this.copydefault + ")";
            }

            public Activity(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }
    }

    public interface ActionBar {
        String KWHzl();

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar, reason: collision with other inner class name */
        public interface InterfaceC0653ActionBar extends ActionBar {

            /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar$Activity */
            public static final class Activity implements InterfaceC0653ActionBar {
                public final String AEQbTJ;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public Activity() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Activity copy$default(Activity activity, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = activity.AEQbTJ;
                    }
                    return activity.AEQbTJ(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Activity AEQbTJ(String str) {
                    return new Activity(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar
                public String KWHzl() {
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
                    String str = this.AEQbTJ;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "LimitPriceLowerThanSL(errorMessage=" + this.AEQbTJ + ")";
                }

                public Activity(String str) {
                    this.AEQbTJ = str;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.xof.Application.fZBcTu int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:523)) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:523) call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar.ActionBar.Activity.<init>(java.lang.String):void type: THIS */
                public /* synthetic */ Activity(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? C33070mpX.AYXKKw(C55688xof.Application.fZBcTu) : str);
                }
            }

            /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar$Application */
            public static final class Application implements InterfaceC0653ActionBar {
                public static final C0654Application Companion = new C0654Application(null);
                public static final List<String> KWHzl = C56402yEa.EZpvd(C56120xwn.valueOf.isConnected());
                public final String EZpvd;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = application.EZpvd;
                    }
                    return application.EZpvd(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Application EZpvd(String str) {
                    return new Application(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar
                public String KWHzl() {
                    return this.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Application) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((Application) obj).EZpvd);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    String str = this.EZpvd;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "PlaceOrderError(errorMessage=" + this.EZpvd + ")";
                }

                /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$ActionBar$Application$Application, reason: collision with other inner class name */
                public static final class C0654Application {
                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar.ActionBar.Application.Application.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ C0654Application(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private C0654Application() {
                    }

                    public final List<String> KWHzl() {
                        return Application.KWHzl;
                    }
                }

                public Application(String str) {
                    this.EZpvd = str;
                }
            }
        }

        public interface Activity extends ActionBar {

            public static final class TaskDescription implements Activity {
                public final String AEQbTJ;
                public final int EZpvd;
                public final String KWHzl;
                public final String OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, int i, String str2, String str3, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = taskDescription.OLrzqt;
                    }
                    if ((i2 & 2) != 0) {
                        i = taskDescription.EZpvd;
                    }
                    if ((i2 & 4) != 0) {
                        str2 = taskDescription.AEQbTJ;
                    }
                    if ((i2 & 8) != 0) {
                        str3 = taskDescription.KWHzl;
                    }
                    return taskDescription.EZpvd(str, i, str2, str3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String AEQbTJ() {
                    return this.KWHzl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final TaskDescription EZpvd(String str, @StringRes int i, @NotNull String str2, @NotNull String str3) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    return new TaskDescription(str, i, str2, str3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String EZpvd() {
                    return this.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar
                public String KWHzl() {
                    return this.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int OLrzqt() {
                    return this.EZpvd;
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
                    return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) taskDescription.OLrzqt) && this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) taskDescription.KWHzl);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    String str = this.OLrzqt;
                    return ((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "AmountLowerThanMinAmount(errorMessage=" + this.OLrzqt + ", errorMessageRes=" + this.EZpvd + ", minAmount=" + this.AEQbTJ + ", symbol=" + this.KWHzl + ")";
                }

                public TaskDescription(String str, @StringRes int i, @NotNull String str2, @NotNull String str3) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    this.OLrzqt = str;
                    this.EZpvd = i;
                    this.AEQbTJ = str2;
                    this.KWHzl = str3;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.xof.Application.UlJrfe int) : (r2v0 int))
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:534) call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar.Activity.TaskDescription.<init>(java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
                public /* synthetic */ TaskDescription(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? C55688xof.Application.UlJrfe : i, str2, str3);
                }
            }

            public static final class StateListAnimator implements Activity {
                public final int AEQbTJ;
                public final String KWHzl;
                public final String OLrzqt;
                public final String copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, String str2, String str3, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        str = stateListAnimator.copydefault;
                    }
                    if ((i2 & 2) != 0) {
                        i = stateListAnimator.AEQbTJ;
                    }
                    if ((i2 & 4) != 0) {
                        str2 = stateListAnimator.KWHzl;
                    }
                    if ((i2 & 8) != 0) {
                        str3 = stateListAnimator.OLrzqt;
                    }
                    return stateListAnimator.EZpvd(str, i, str2, str3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int AEQbTJ() {
                    return this.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final StateListAnimator EZpvd(String str, @StringRes int i, @NotNull String str2, @NotNull String str3) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    return new StateListAnimator(str, i, str2, str3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String EZpvd() {
                    return this.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar
                public String KWHzl() {
                    return this.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String OLrzqt() {
                    return this.KWHzl;
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
                    return Intrinsics.EZpvd((Object) this.copydefault, (Object) stateListAnimator.copydefault) && this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd((Object) this.KWHzl, (Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    String str = this.copydefault;
                    return ((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "AmountGreaterThanMaxAmount(errorMessage=" + this.copydefault + ", errorMessageRes=" + this.AEQbTJ + ", maxAmount=" + this.KWHzl + ", symbol=" + this.OLrzqt + ")";
                }

                public StateListAnimator(String str, @StringRes int i, @NotNull String str2, @NotNull String str3) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    this.copydefault = str;
                    this.AEQbTJ = i;
                    this.KWHzl = str2;
                    this.OLrzqt = str3;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.xof.Application.OJuSTm int) : (r2v0 int))
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:541) call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar.Activity.StateListAnimator.<init>(java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
                public /* synthetic */ StateListAnimator(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? C55688xof.Application.OJuSTm : i, str2, str3);
                }
            }

            /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity$Activity, reason: collision with other inner class name */
            public static final class C0655Activity implements Activity {
                public static final TaskDescription Companion = new TaskDescription(null);
                public static final List<String> KWHzl = yDY.gEmmrt("51008", C56120xwn.valueOf.fetchVPNInfo());
                public final String OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ C0655Activity copy$default(C0655Activity c0655Activity, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = c0655Activity.OLrzqt;
                    }
                    return c0655Activity.EZpvd(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final C0655Activity EZpvd(String str) {
                    return new C0655Activity(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar
                public String KWHzl() {
                    return this.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0655Activity) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((C0655Activity) obj).OLrzqt);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    String str = this.OLrzqt;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "PlaceOrderError(errorMessage=" + this.OLrzqt + ")";
                }

                /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter$ActionBar$Activity$Activity$TaskDescription */
                public static final class TaskDescription {
                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar.Activity.Activity.TaskDescription.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private TaskDescription() {
                    }

                    public final List<String> EZpvd() {
                        return C0655Activity.KWHzl;
                    }
                }

                public C0655Activity(String str) {
                    this.OLrzqt = str;
                }
            }
        }

        public static final class Application implements ActionBar {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.KWHzl;
                }
                return application.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter.ActionBar
            public String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(String str) {
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((Application) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.KWHzl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "General(errorMessage=" + this.KWHzl + ")";
            }

            public Application(String str) {
                this.KWHzl = str;
            }
        }
    }
}
