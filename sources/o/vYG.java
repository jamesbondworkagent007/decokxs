package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.google.android.material.tabs.TabLayout;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.unify_trade.biz.BotMaxAvailableResult;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.config.SignalBotManualOrderType;
import com.okinc.unify_trade.bot.config.SignalBotManualOrderUnit;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotManualOrderPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C47978uAl;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vYG extends AbstractC49945uyC<uWN, SignalBotManualOrderPresenter> {
    public static final Application Companion = new Application(null);
    public final int AEQbTJ = C48033uCm.Activity.dlRikr;

    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    public static final /* synthetic */ uWN AEQbTJ(vYG vyg) {
        return vyg.values();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void copydefault(@NotNull DetailsData detailsData, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(detailsData, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            vYG vyg = new vYG();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", detailsData);
            vyg.setArguments(bundle);
            vyg.show(fragmentManager, vYG.class.getSimpleName());
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        SignalBotManualOrderPresenter signalBotManualOrderPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        signalBotManualOrderPresenterOLrzqt.copydefault(arguments != null ? (DetailsData) arguments.getParcelable("data") : null);
        hDKMBd();
        getFieldNames();
        uzCIH();
        fIwbmz();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.ruDxL));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new LoaderManager(imageViewKWHzl, 1000L, this));
    }

    private final void fIwbmz() {
        OLrzqt().AYXKKw();
        OLrzqt().djBIcL();
        OLrzqt().uzCIH();
    }

    private final void hDKMBd() {
        java.lang.String level;
        android.widget.TextView textView = values().valueOf;
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        DetailsData detailsDataFJNWhG = OLrzqt().fJNWhG();
        java.lang.String instId = detailsDataFJNWhG != null ? detailsDataFJNWhG.getInstId() : null;
        DetailsData detailsDataFJNWhG2 = OLrzqt().fJNWhG();
        textView.setText(C54799xVt.getTitleByIdAndType$default(c54799xVt, instId, detailsDataFJNWhG2 != null ? detailsDataFJNWhG2.getInstType() : null, false, false, 12, null));
        C55251xgS c55251xgS = values().DbNXlk;
        DetailsData detailsDataFJNWhG3 = OLrzqt().fJNWhG();
        if (detailsDataFJNWhG3 == null || (level = detailsDataFJNWhG3.getLevel()) == null) {
            level = "";
        }
        c55251xgS.setText(C56033xvF.getBotLever$default(level, false, 2, null));
        C55249xgQ c55249xgQ = values().AhwBna;
        TabLayout.Tab tabNewTab = c55249xgQ.newTab();
        tabNewTab.setText(C33070mpX.AYXKKw(C55688xof.Application.setPipParamsSourceRectHint));
        tabNewTab.setTag("buy");
        c55249xgQ.addTab(tabNewTab);
        TabLayout.Tab tabNewTab2 = c55249xgQ.newTab();
        tabNewTab2.setText(C33070mpX.AYXKKw(C55688xof.Application.addMenuProvider));
        tabNewTab2.setTag("sell");
        c55249xgQ.addTab(tabNewTab2);
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Fragment(c55249xgQ));
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = c55249xgQ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55249xgQ.KWHzl(C33512mxp.tradeRiseHighlightsFill$default(c33512mxp, context, 0.0f, 2, null));
        android.content.Context context2 = c55249xgQ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        copydefault(C33512mxp.tradeRiseHighlightsContent$default(c33512mxp, context2, 0.0f, 2, null));
        C50193vFi c50193vFi = values().fARcdN;
        java.util.List<TradeMenuItemBean> listCopydefault = OLrzqt().copydefault();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c50193vFi.setData(listCopydefault, childFragmentManager, new Function1() { // from class: o.vYI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYG.AEQbTJ(this.OLrzqt, (TradeMenuItemBean) obj);
            }
        });
        final C47988uAv c47988uAv = values().AEQbTJ;
        c47988uAv.setUnitClickable(true, new Function0() { // from class: o.vYJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vYG.KWHzl(this.AEQbTJ, c47988uAv);
            }
        });
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.vYM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vYG.copydefault(c47988uAv, this, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        C47988uAv c47988uAv2 = values().fJNWhG;
        SwapInstrument swapInstrumentDbNXlk = OLrzqt().DbNXlk();
        c47988uAv2.setInputUnit(swapInstrumentDbNXlk != null ? swapInstrumentDbNXlk.getQuoteSymbol() : null);
        c47988uAv2.setMaxDecimal(OLrzqt().getNewProxyInstance());
        c47988uAv2.setOnTextChangeCallback(new Function2() { // from class: o.vYK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vYG.AEQbTJ(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv2.setOnFocusChangeCallback(new Function2() { // from class: o.vYL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vYG.OLrzqt(this.AEQbTJ, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final class Fragment implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C55249xgQ OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Fragment(C55249xgQ c55249xgQ) {
            this.OLrzqt = c55249xgQ;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            kotlin.Pair pairOLrzqt;
            SignalBotManualOrderPresenter signalBotManualOrderPresenterOLrzqt = vYG.this.OLrzqt();
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
            if (str == null) {
                str = "buy";
            }
            signalBotManualOrderPresenterOLrzqt.djBIcL(str);
            if (Intrinsics.EZpvd(tab != null ? tab.getTag() : null, (java.lang.Object) "sell")) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iTradeFallHighlightsFill$default = C33512mxp.tradeFallHighlightsFill$default(c33512mxp, context, 0.0f, 2, null);
                android.content.Context context2 = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(iTradeFallHighlightsFill$default), java.lang.Integer.valueOf(C33512mxp.tradeFallHighlightsContent$default(c33512mxp, context2, 0.0f, 2, null)));
            } else {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context3 = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                int iTradeRiseHighlightsFill$default = C33512mxp.tradeRiseHighlightsFill$default(c33512mxp2, context3, 0.0f, 2, null);
                android.content.Context context4 = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(iTradeRiseHighlightsFill$default), java.lang.Integer.valueOf(C33512mxp.tradeRiseHighlightsContent$default(c33512mxp2, context4, 0.0f, 2, null)));
            }
            int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
            int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
            this.OLrzqt.KWHzl(iIntValue);
            vYG.this.copydefault(iIntValue2);
        }
    }

    public static final Unit AEQbTJ(vYG vyg, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        SignalBotManualOrderPresenter signalBotManualOrderPresenterOLrzqt = vyg.OLrzqt();
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        signalBotManualOrderPresenterOLrzqt.gEmmrt((java.lang.String) data);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vYG vyg, final C47988uAv c47988uAv) {
        C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(C47978uAl.Companion, vyg.OLrzqt().AEQbTJ(), null, true, null, 0, 26, null);
        c47978uAlNewInstance$default.KWHzl(vyg.new PendingIntent(c47988uAv));
        c47978uAlNewInstance$default.copydefault(new Function0() { // from class: o.vYS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vYG.EZpvd(c47988uAv);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = vyg.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c47978uAlNewInstance$default.show(childFragmentManager, "");
        return Unit.INSTANCE;
    }

    public static final class PendingIntent implements C47978uAl.StateListAnimator {
        public final /* synthetic */ C47988uAv EZpvd;

        public PendingIntent(C47988uAv c47988uAv) {
            this.EZpvd = c47988uAv;
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            SignalBotManualOrderPresenter signalBotManualOrderPresenterOLrzqt = vYG.this.OLrzqt();
            java.lang.Object data = tradeMenuItemBean.getData();
            signalBotManualOrderPresenterOLrzqt.copydefault(data instanceof SignalBotManualOrderUnit ? (SignalBotManualOrderUnit) data : null);
            this.EZpvd.setSidesLabelUnselect();
        }
    }

    public static final Unit EZpvd(C47988uAv c47988uAv) {
        c47988uAv.setSidesLabelUnselect();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C47988uAv c47988uAv, vYG vyg, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        c47988uAv.copydefault();
        vyg.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vYG vyg, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        vyg.ejfBZ();
        vyg.isConnected();
        vyg.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vYG vyg, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z) {
            vyg.OLrzqt().OLrzqt(vyg.values().fJNWhG.AkhnZx());
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ vYG KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vYG vyg) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = vyg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.getVisualMimeTypeactivity_release));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new FragmentManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vYG KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vYG vyg) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = vyg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.KWHzl.fARcdN()) {
                    this.KWHzl.OLrzqt().AEQbTJ(vYG.AEQbTJ(this.KWHzl).AEQbTJ.AkhnZx(), vYG.AEQbTJ(this.KWHzl).fJNWhG.AkhnZx());
                }
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vYG KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, vYG vyg) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = vyg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.fJNWhG();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ vYG AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vYG vyg) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = vyg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.getIntentSender));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(@androidx.annotation.ColorInt int i) {
        TabLayout.TabView tabView;
        android.widget.TextView textView;
        C55249xgQ c55249xgQ = values().AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
        int tabCount = c55249xgQ.getTabCount();
        int i2 = 0;
        while (i2 < tabCount) {
            TabLayout.Tab tabAt = c55249xgQ.getTabAt(i2);
            if (tabAt != null && (tabView = tabAt.view) != null && (textView = (android.widget.TextView) tabView.findViewById(android.R.id.text1)) != null) {
                textView.setTextColor(i2 == c55249xgQ.getSelectedTabPosition() ? i : C33070mpX.copydefault(C32113mPz.ActionBar.uzCIH));
            }
            i2++;
        }
    }

    private final void getFieldNames() {
        TradeLiveData<java.lang.String> tradeLiveDataEjfBZ = OLrzqt().ejfBZ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEjfBZ.observe(viewLifecycleOwner, new Dialog(new Function1() { // from class: o.vYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYG.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataValues = OLrzqt().values();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataValues.observe(viewLifecycleOwner2, new Dialog(new Function1() { // from class: o.vYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYG.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        TradeLiveData<SignalBotManualOrderUnit> tradeLiveDataAuCTel = OLrzqt().AuCTel();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAuCTel.observe(viewLifecycleOwner3, new Dialog(new Function1() { // from class: o.vYO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYG.EZpvd(this.copydefault, (SignalBotManualOrderUnit) obj);
            }
        }));
        TradeLiveData<BotMaxAvailableResult> tradeLiveDataFIwbmz = OLrzqt().fIwbmz();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataFIwbmz.observe(viewLifecycleOwner4, new Dialog(new Function1() { // from class: o.vYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYG.KWHzl(this.KWHzl, (BotMaxAvailableResult) obj);
            }
        }));
        TradeLiveData<TickersData> tradeLiveDataHDKMBd = OLrzqt().hDKMBd();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataHDKMBd.observe(viewLifecycleOwner5, new Dialog(new Function1() { // from class: o.vYN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYG.KWHzl(this.copydefault, (TickersData) obj);
            }
        }));
        TradeLiveData<TickersData> tradeLiveDataIsConnected = OLrzqt().isConnected();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataIsConnected.observe(viewLifecycleOwner6, new Dialog(new Function1() { // from class: o.vYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYG.OLrzqt(this.copydefault, (TickersData) obj);
            }
        }));
        TradeLiveData<java.util.List<StrategyResponse>> tradeLiveDataFetchVPNInfo = OLrzqt().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner7, new Dialog(new Function1() { // from class: o.vYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYG.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().fARcdN().AhwBna();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner8, new Observer() { // from class: o.vYT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                vYG.AEQbTJ((java.lang.Exception) obj);
            }
        });
        TradeLiveData<StrategyPositionResponse> tradeLiveDataAkhnZx = OLrzqt().AkhnZx();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        tradeLiveDataAkhnZx.observe(viewLifecycleOwner9, new Dialog(new Function1() { // from class: o.vYV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYG.copydefault(this.KWHzl, (StrategyPositionResponse) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(vYG vyg, java.lang.String str) {
        java.lang.String quoteSymbol = "";
        Intrinsics.checkNotNullParameter(str, "");
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) SignalBotManualOrderType.LIMIT.getConst());
        C47988uAv c47988uAv = vyg.values().fJNWhG;
        C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        if (zEZpvd) {
            SwapInstrument swapInstrumentDbNXlk = vyg.OLrzqt().DbNXlk();
            quoteSymbol = swapInstrumentDbNXlk != null ? swapInstrumentDbNXlk.getQuoteSymbol() : null;
        }
        c47988uAv.setInputUnit(quoteSymbol);
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(zEZpvd ? C55688xof.Application.ContextAwareHelper : C55688xof.Application.launchUnit), null, 2, null);
        C47988uAv.setInputLayoutState$default(c47988uAv, zEZpvd ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
        vyg.isConnected();
        vyg.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vYG vyg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C52794wYp c52794wYpCopydefault = vyg.values().AYXKKw.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy") ? C55688xof.Application.ikEgkI : C55688xof.Application.iTrKTi));
            c52794wYpCopydefault.setOKDSType(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy") ? 261 : 262);
        }
        vyg.values().uzCIH.setText(C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy") ? C55688xof.Application.dispatchResult : C55688xof.Application.ActivityResultRegistryCallbackAndContract));
        vyg.values().ejfBZ.setChecked(false);
        vyg.ejfBZ();
        vyg.isConnected();
        vyg.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vYG vyg, SignalBotManualOrderUnit signalBotManualOrderUnit) {
        Intrinsics.checkNotNullParameter(signalBotManualOrderUnit, "");
        C47988uAv c47988uAv = vyg.values().AEQbTJ;
        C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        c47988uAv.setInputUnit(vyg.OLrzqt().EZpvd(signalBotManualOrderUnit));
        c47988uAv.setMaxDecimal(vyg.OLrzqt().AEQbTJ(signalBotManualOrderUnit));
        vyg.ejfBZ();
        vyg.isConnected();
        vyg.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vYG vyg, BotMaxAvailableResult botMaxAvailableResult) {
        java.lang.String instFamily;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(botMaxAvailableResult, "");
        android.widget.TextView textView = vyg.values().OLrzqt;
        AbstractC54531xLw abstractC54531xLwGEmmrt = vyg.OLrzqt().gEmmrt();
        if (abstractC54531xLwGEmmrt != null) {
            SwapInstrument swapInstrumentDbNXlk = vyg.OLrzqt().DbNXlk();
            if (swapInstrumentDbNXlk == null || (instFamily = swapInstrumentDbNXlk.getInstFamily()) == null) {
                instFamily = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwGEmmrt, instFamily, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                java.lang.String available = botMaxAvailableResult.getAvailable();
                if (available == null) {
                    available = "";
                }
                C54536xML c54536xMLCopydefault2 = xmvCreateSizeConverterWithIndex$default.copydefault(available);
                if (c54536xMLCopydefault2 != null && (c54536xMLCopydefault = c54536xMLCopydefault2.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                    str = safeString$default;
                }
            }
        }
        textView.setText(str);
        vyg.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vYG vyg, TickersData tickersData) {
        xMS xmsGEmmrt;
        java.lang.String strAhwBna;
        java.lang.String instFamily;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tickersData, "");
        AbstractC54531xLw abstractC54531xLwGEmmrt = vyg.OLrzqt().gEmmrt();
        if (abstractC54531xLwGEmmrt != null) {
            SwapInstrument swapInstrumentDbNXlk = vyg.OLrzqt().DbNXlk();
            if (swapInstrumentDbNXlk == null || (instFamily = swapInstrumentDbNXlk.getInstFamily()) == null) {
                instFamily = "";
            }
            xmsGEmmrt = abstractC54531xLwGEmmrt.gEmmrt(instFamily);
        } else {
            xmsGEmmrt = null;
        }
        android.widget.TextView textView = vyg.values().gEmmrt;
        xMR xmr = xMR.copydefault;
        if (xmsGEmmrt != null && (strAhwBna = xmsGEmmrt.AhwBna(tickersData.getLast())) != null) {
            str = strAhwBna;
        }
        textView.setText(xmr.EZpvd(str, C33129mqd.AhwBna(xmsGEmmrt != null ? xmsGEmmrt.AEQbTJ() : null)));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vYG vyg, TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        vyg.OLrzqt().OLrzqt(vyg.values().fJNWhG.AkhnZx());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vYG vyg, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onRequestPermissionsResult, 0, 1, (java.lang.Object) null);
        vyg.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(vYG vyg, StrategyPositionResponse strategyPositionResponse) {
        Intrinsics.checkNotNullParameter(strategyPositionResponse, "");
        vyg.AuCTel();
        return Unit.INSTANCE;
    }

    private final void uzCIH() {
        values().ejfBZ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vYP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vYG.KWHzl(this.copydefault, compoundButton, z);
            }
        });
        C52794wYp c52794wYpCopydefault = values().AYXKKw.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        C55258xgZ c55258xgZ = values().djBIcL;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = values().AuCTel;
        c55258xgZ2.setOnClickListener(new ActionBar(c55258xgZ2, 1000L, this));
    }

    public static final void KWHzl(vYG vyg, android.widget.CompoundButton compoundButton, boolean z) {
        vyg.OLrzqt().KWHzl(z);
        vyg.OLrzqt().OLrzqt(vyg.values().fJNWhG.AkhnZx());
        vyg.isConnected();
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public final void ejfBZ() {
        values().fIwbmz.setText(OLrzqt().AEQbTJ(values().fJNWhG.AkhnZx()));
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        values().isConnected.setText(OLrzqt().EZpvd(values().AEQbTJ.AkhnZx(), values().fJNWhG.AkhnZx()));
    }

    public final void AuCTel() {
        if (OLrzqt().KWHzl()) {
            values().ejfBZ.setEnabled(true);
            values().AuCTel.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        } else {
            values().ejfBZ.setEnabled(false);
            values().AuCTel.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        }
    }

    public final void copydefault() {
        kotlin.Pair pair;
        if (OLrzqt().AuCTel().getValue() == SignalBotManualOrderUnit.U && (C33129mqd.AEQbTJ(values().fJNWhG.AkhnZx(), 0) || Intrinsics.EZpvd((java.lang.Object) OLrzqt().ejfBZ().getValue(), (java.lang.Object) SignalBotManualOrderType.MARKET.getConst()))) {
            java.lang.String strKWHzl = OLrzqt().KWHzl(values().fJNWhG.AkhnZx());
            pair = new kotlin.Pair(strKWHzl, "≥ " + xMR.copydefault.copydefault(strKWHzl));
        } else {
            pair = new kotlin.Pair("", "");
        }
        C47988uAv c47988uAv = values().AEQbTJ;
        c47988uAv.setTag(C48033uCm.Application.setSplitBackgroundDrawable, pair.getFirst());
        c47988uAv.setInputHint((java.lang.String) pair.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fARcdN() {
        C47988uAv c47988uAv = values().fJNWhG;
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().ejfBZ().getValue(), (java.lang.Object) SignalBotManualOrderType.LIMIT.getConst()) && C33129mqd.valueOf(c47988uAv.AkhnZx(), 0)) {
            c47988uAv.zsXlph();
            return false;
        }
        C47988uAv c47988uAv2 = values().AEQbTJ;
        if (C33129mqd.valueOf(c47988uAv2.AkhnZx(), 0)) {
            c47988uAv2.zsXlph();
            return false;
        }
        java.lang.Object tag = c47988uAv2.getTag(C48033uCm.Application.setSplitBackgroundDrawable);
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (!C33129mqd.gEmmrt(c47988uAv2.AkhnZx(), str)) {
            return true;
        }
        int i = C55688xof.Application.UlJrfe;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("fieldName", c47988uAv2.values());
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("minValue", xmr.copydefault(str));
        pairArr[2] = C56390yDp.OLrzqt("unit", c47988uAv2.fARcdN());
        c47988uAv2.setInputErrorMsg(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
