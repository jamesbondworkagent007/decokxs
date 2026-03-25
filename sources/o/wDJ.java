package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.fragment.detail.RecurringDetailParameterFragment$initPresenter$1;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.RecurringBuyDto;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C49511upt;
import o.C55688xof;
import o.InterfaceC52662wTs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wDJ extends AbstractC52228wDq implements InterfaceC52662wTs {
    public final InterfaceC56387yDm djBIcL;
    public C48464uSj gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wDG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wDJ.EZpvd(this.copydefault);
        }
    });
    public final int fetchVPNInfo = C48033uCm.Activity.DQYQgr;
    public TacticsData values = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wDN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wDJ.AhwBna();
        }
    });

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    @Override // o.InterfaceC52662wTs
    public void DbNXlk() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC52662wTs
    public void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fetchVPNInfo;
    }

    @Override // o.InterfaceC52662wTs
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC52662wTs.TaskDescription.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC52662wTs
    public void bz_() {
        InterfaceC52662wTs.TaskDescription.KWHzl(this);
    }

    @Override // o.InterfaceC52662wTs
    public void gEmmrt() {
        InterfaceC52662wTs.TaskDescription.copydefault(this);
    }

    public wDJ() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.RecurringDetailParameterFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.RecurringDetailParameterFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.RecurringDetailParameterFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wDJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final wDJ AEQbTJ() {
            return new wDJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BotOperatorButtonDisposer AkhnZx() {
        return (BotOperatorButtonDisposer) this.valueOf.getValue();
    }

    public static final BotOperatorButtonDisposer EZpvd(wDJ wdj) {
        return new BotOperatorButtonDisposer(wdj, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsDetailPresenter values() {
        return (TacticsDetailPresenter) this.djBIcL.getValue();
    }

    private final C43316rmw djBIcL() {
        return (C43316rmw) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AhwBna() {
        return new C43316rmw();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = C48464uSj.EZpvd(view);
        isConnected();
        fetchVPNInfo();
        C48464uSj c48464uSj = this.gEmmrt;
        if (c48464uSj == null || (constraintLayout = c48464uSj.AEQbTJ) == null) {
            return;
        }
        constraintLayout.setVisibility(values().copydefault() ? 0 : 8);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        java.lang.String sourceAlgoId;
        super.onResume();
        if (!values().copydefault() || (sourceAlgoId = values().AhwBna().getSourceAlgoId()) == null) {
            return;
        }
        values().EZpvd(sourceAlgoId);
    }

    private final void isConnected() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new RecurringDetailParameterFragment$initPresenter$1(this, null), 3, null);
        C56111xwe<java.util.List<StgySourceInfo>> c56111xweIwGUEr = values().iwGUEr();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweIwGUEr.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wDK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDJ.copydefault(this.copydefault, (java.util.List) obj);
            }
        }));
    }

    public static final Unit copydefault(wDJ wdj, java.util.List list) {
        java.lang.String username;
        java.lang.String str;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(list, "");
        C48464uSj c48464uSj = wdj.gEmmrt;
        if (c48464uSj != null) {
            ConstraintLayout constraintLayout = c48464uSj.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            if (constraintLayout.getVisibility() == 0) {
                AppCompatTextView appCompatTextView = c48464uSj.valueOf;
                StgySourceInfo stgySourceInfo = (StgySourceInfo) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
                if (stgySourceInfo == null || (username = stgySourceInfo.getUsername()) == null) {
                    username = "";
                }
                appCompatTextView.setText(username);
                StgySourceInfo stgySourceInfo2 = (StgySourceInfo) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
                if (stgySourceInfo2 != null) {
                    android.widget.ImageView imageView = c48464uSj.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    C33054mpH.loadAvatar$default(imageView, stgySourceInfo2.getAvatar(), stgySourceInfo2.getUsername(), null, 4, null);
                }
                AppCompatTextView appCompatTextView2 = c48464uSj.fIwbmz;
                StgySourceInfo stgySourceInfo3 = (StgySourceInfo) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
                if (stgySourceInfo3 != null && (str = (java.lang.String) C56033xvF.getDcdBotState$default(stgySourceInfo3.getState(), null, 2, null).getFirst()) != null) {
                    str2 = str;
                }
                appCompatTextView2.setText(str2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(C55804xqp<StrategyDetailsResponse> c55804xqp) {
        NestedScrollView root;
        TacticsData tacticsData = (TacticsData) CollectionsKt___CollectionsKt.AkhnZx(new C55936xtO().EZpvd(new C55804xqp<>(c55804xqp.OLrzqt(), C56402yEa.EZpvd(c55804xqp.copydefault()), null, null, 12, null)), 0);
        if (tacticsData != null) {
            this.values = tacticsData;
        }
        C48464uSj c48464uSj = this.gEmmrt;
        if (c48464uSj != null && (root = c48464uSj.getRoot()) != null) {
            root.setVisibility(0);
        }
        if (values().AubY() || values().AwvSrB() || Intrinsics.EZpvd((java.lang.Object) "stopped", (java.lang.Object) c55804xqp.copydefault().getState())) {
            EZpvd(c55804xqp.copydefault());
        } else {
            copydefault(c55804xqp.copydefault());
        }
    }

    private final void copydefault(StrategyDetailsResponse strategyDetailsResponse) {
        C48464uSj c48464uSj = this.gEmmrt;
        if (c48464uSj != null) {
            OLrzqt(strategyDetailsResponse);
            KWHzl(strategyDetailsResponse);
            AEQbTJ(strategyDetailsResponse);
            C43316rmw c43316rmwDjBIcL = djBIcL();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33064mpR.OLrzqt(c43316rmwDjBIcL, (java.util.List<? extends java.lang.Object>) C52310wGr.OLrzqt(strategyDetailsResponse, contextRequireContext));
            C52705wVh c52705wVh = c48464uSj.gEmmrt;
            c52705wVh.setOnClickListener(new StateListAnimator(c52705wVh, 1000L, this));
        }
    }

    public static final class ActionBar implements Function0<Unit> {
        public static final ActionBar copydefault = new ActionBar();

        public final void EZpvd() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }
    }

    private final void EZpvd(StrategyDetailsResponse strategyDetailsResponse) {
        C48464uSj c48464uSj = this.gEmmrt;
        if (c48464uSj != null) {
            C52705wVh c52705wVh = c48464uSj.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c52705wVh, "");
            c52705wVh.setVisibility(8);
            OLrzqt(strategyDetailsResponse);
            KWHzl(strategyDetailsResponse);
            AEQbTJ(strategyDetailsResponse);
            C43316rmw c43316rmwDjBIcL = djBIcL();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33064mpR.OLrzqt(c43316rmwDjBIcL, (java.util.List<? extends java.lang.Object>) C52310wGr.OLrzqt(strategyDetailsResponse, contextRequireContext));
        }
    }

    public final void OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        LinearLayoutCompat linearLayoutCompat;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        LinearLayoutCompat linearLayoutCompat2;
        AppCompatTextView appCompatTextView3;
        RecurringBuyDto recurring;
        RecurringBuyDto recurring2;
        java.lang.Integer recurringTimeType;
        AppCompatTextView appCompatTextView4;
        StrategyDetailsResponse strategyDetailsResponseAhwBna = values().AhwBna();
        C48464uSj c48464uSj = this.gEmmrt;
        if (c48464uSj != null && (appCompatTextView4 = c48464uSj.fJNWhG) != null) {
            appCompatTextView4.setText(C33070mpX.AYXKKw(C55688xof.Application.attributeId));
        }
        C48464uSj c48464uSj2 = this.gEmmrt;
        if (c48464uSj2 != null && (appCompatTextView3 = c48464uSj2.fARcdN) != null) {
            C56046xvS c56046xvS = C56046xvS.AEQbTJ;
            java.lang.String period = strategyDetailsResponseAhwBna.getPeriod();
            java.lang.String recurringDay = strategyDetailsResponseAhwBna.getRecurringDay();
            java.lang.String recurringTime = strategyDetailsResponseAhwBna.getRecurringTime();
            java.lang.String recurringHour = strategyDetailsResponseAhwBna.getRecurringHour();
            BotVo bot = strategyDetailsResponseAhwBna.getBot();
            java.lang.String recurringTimeMinutes = null;
            java.lang.String string = (bot == null || (recurring2 = bot.getRecurring()) == null || (recurringTimeType = recurring2.getRecurringTimeType()) == null) ? null : recurringTimeType.toString();
            if (string == null) {
                string = "";
            }
            BotVo bot2 = strategyDetailsResponseAhwBna.getBot();
            if (bot2 != null && (recurring = bot2.getRecurring()) != null) {
                recurringTimeMinutes = recurring.getRecurringTimeMinutes();
            }
            if (recurringTimeMinutes == null) {
                recurringTimeMinutes = "";
            }
            appCompatTextView3.setText(c56046xvS.copydefault(period, recurringDay, recurringTime, recurringHour, string, recurringTimeMinutes));
        }
        if (strategyDetailsResponseAhwBna.isHistory()) {
            C48464uSj c48464uSj3 = this.gEmmrt;
            if (c48464uSj3 == null || (linearLayoutCompat = c48464uSj3.zsXlph) == null) {
                return;
            }
            linearLayoutCompat.setVisibility(8);
            return;
        }
        C48464uSj c48464uSj4 = this.gEmmrt;
        if (c48464uSj4 != null && (linearLayoutCompat2 = c48464uSj4.zsXlph) != null) {
            linearLayoutCompat2.setVisibility(0);
        }
        java.lang.String nextInvestTime = strategyDetailsResponseAhwBna.getNextInvestTime();
        java.lang.String strCopydefault = C56046xvS.AEQbTJ.copydefault(nextInvestTime != null ? nextInvestTime : "");
        C48464uSj c48464uSj5 = this.gEmmrt;
        if (c48464uSj5 != null && (appCompatTextView2 = c48464uSj5.ejfBZ) != null) {
            appCompatTextView2.setText(C33070mpX.AYXKKw(C55688xof.Application.isAvailable));
        }
        C48464uSj c48464uSj6 = this.gEmmrt;
        if (c48464uSj6 == null || (appCompatTextView = c48464uSj6.AuCTel) == null) {
            return;
        }
        appCompatTextView.setText(strCopydefault);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ wDJ EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, wDJ wdj) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = wdj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                BotOperatorButtonDisposer.dispose$default(this.EZpvd.AkhnZx(), "strategy_button_stop", this.EZpvd.values, ActionBar.copydefault, null, null, null, 56, null);
            }
        }
    }

    public final void KWHzl(StrategyDetailsResponse strategyDetailsResponse) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        StrategyDetailsResponse strategyDetailsResponseAhwBna = values().AhwBna();
        java.lang.String strFmtBotValueBySymbol$default = "--";
        java.lang.String strCopydefault = strategyDetailsResponseAhwBna.getCycles().length() == 0 ? "--" : xMR.copydefault.copydefault(strategyDetailsResponseAhwBna.getCycles());
        if (strategyDetailsResponseAhwBna.getAmt().length() != 0) {
            java.lang.String strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseAhwBna.takeNonBlankTradeQuoteCcy();
            if (strTakeNonBlankTradeQuoteCcy == null) {
                strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseAhwBna.getInvestCcy();
            }
            strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(strTakeNonBlankTradeQuoteCcy, strategyDetailsResponseAhwBna.getAmt(), RoundingMode.UP, true, null, false, strategyDetailsResponseAhwBna.getInstType(), strategyDetailsResponseAhwBna.getInstId(), null, null, null, 1840, null);
        }
        C48464uSj c48464uSj = this.gEmmrt;
        if (c48464uSj != null && (appCompatTextView4 = c48464uSj.fetchVPNInfo) != null) {
            appCompatTextView4.setText(C33070mpX.AYXKKw(C55688xof.Application.setState));
        }
        C48464uSj c48464uSj2 = this.gEmmrt;
        if (c48464uSj2 != null && (appCompatTextView3 = c48464uSj2.isConnected) != null) {
            appCompatTextView3.setText(strFmtBotValueBySymbol$default);
        }
        C48464uSj c48464uSj3 = this.gEmmrt;
        if (c48464uSj3 != null && (appCompatTextView2 = c48464uSj3.uzCIH) != null) {
            appCompatTextView2.setText(C33070mpX.AYXKKw(C55688xof.Application.r8lambda7lLdjm1L5OSJIz1pWP4kzityPws));
        }
        C48464uSj c48464uSj4 = this.gEmmrt;
        if (c48464uSj4 == null || (appCompatTextView = c48464uSj4.iwGUEr) == null) {
            return;
        }
        appCompatTextView.setText(strCopydefault);
    }

    public final void AEQbTJ(StrategyDetailsResponse strategyDetailsResponse) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        StrategyDetailsResponse strategyDetailsResponseAhwBna = values().AhwBna();
        java.lang.String strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseAhwBna.takeNonBlankTradeQuoteCcy();
        if (strTakeNonBlankTradeQuoteCcy == null) {
            strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseAhwBna.getInvestCcy();
            if (strTakeNonBlankTradeQuoteCcy.length() == 0) {
                strTakeNonBlankTradeQuoteCcy = "--";
            }
        }
        java.lang.String str = (java.lang.String) values().KWHzl(new Function1() { // from class: o.wDL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wDJ.OLrzqt((C55887xsS) obj);
            }
        });
        C48464uSj c48464uSj = this.gEmmrt;
        if (c48464uSj != null && (appCompatTextView4 = c48464uSj.values) != null) {
            appCompatTextView4.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResult));
        }
        C48464uSj c48464uSj2 = this.gEmmrt;
        if (c48464uSj2 != null && (appCompatTextView3 = c48464uSj2.DbNXlk) != null) {
            appCompatTextView3.setText(str);
        }
        C48464uSj c48464uSj3 = this.gEmmrt;
        if (c48464uSj3 != null && (appCompatTextView2 = c48464uSj3.hDKMBd) != null) {
            appCompatTextView2.setText(C33070mpX.AYXKKw(C49511upt.Activity.dNCPSb));
        }
        C48464uSj c48464uSj4 = this.gEmmrt;
        if (c48464uSj4 == null || (appCompatTextView = c48464uSj4.getFieldNames) == null) {
            return;
        }
        appCompatTextView.setText(strTakeNonBlankTradeQuoteCcy);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String OLrzqt(C55887xsS c55887xsS) {
        boolean z;
        java.lang.String quoteSymbol;
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        xVB xvb = xVB.OLrzqt;
        BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
        java.util.List<java.lang.String> tradeQuoteCcyList = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getTradeQuoteCcyList() : null;
        BizInstrument bizInstrumentAhwBna2 = c55887xsS.AhwBna();
        if (bizInstrumentAhwBna2 != null) {
            z = bizInstrumentAhwBna2.isSupportTradeReceive();
        }
        java.lang.String strEZpvd = xvb.EZpvd(tradeQuoteCcyList, z);
        if (strEZpvd != null && strEZpvd.length() != 0) {
            return strEZpvd;
        }
        BizInstrument bizInstrumentAhwBna3 = c55887xsS.AhwBna();
        return (bizInstrumentAhwBna3 == null || (quoteSymbol = bizInstrumentAhwBna3.getQuoteSymbol()) == null) ? "" : quoteSymbol;
    }

    private final void fetchVPNInfo() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        djBIcL().register(C52312wGt.class, new C52311wGs());
        C48464uSj c48464uSj = this.gEmmrt;
        if (c48464uSj != null && (recyclerView2 = c48464uSj.EZpvd) != null) {
            recyclerView2.setLayoutManager(C33047mpA.KWHzl(getContext()));
        }
        C48464uSj c48464uSj2 = this.gEmmrt;
        if (c48464uSj2 == null || (recyclerView = c48464uSj2.EZpvd) == null) {
            return;
        }
        recyclerView.setAdapter(djBIcL());
    }

    /* JADX DEBUG: Possible override for method o.wDq.OLrzqt()V */
    @Override // o.InterfaceC52662wTs
    public TradeLiveData<java.util.ArrayList<java.lang.Object>> OLrzqt() {
        TradeLiveData<java.util.ArrayList<java.lang.Object>> tradeLiveData = new TradeLiveData<>();
        tradeLiveData.setValue(yDY.copydefault(this.values));
        return tradeLiveData;
    }

    @Override // o.InterfaceC52662wTs
    public void copydefault(@NotNull java.lang.String str, int i, boolean z) {
        NestedScrollView nestedScrollView;
        C55284xgz c55284xgzAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        C48464uSj c48464uSj = this.gEmmrt;
        if (c48464uSj == null || (nestedScrollView = c48464uSj.copydefault) == null || (c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(requireContext(), nestedScrollView, str)) == null) {
            return;
        }
        c55284xgzAEQbTJ.isConnected(i);
        c55284xgzAEQbTJ.hDKMBd();
    }

    @Override // o.InterfaceC52662wTs
    public void fARcdN() {
        TacticsDetailPresenter.queryBotDetails$default(values(), false, 1, null);
    }
}
