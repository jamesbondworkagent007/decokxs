package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbiArbitrageApyPresenter;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageManualPresenter;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.view.SmartArbitrageCalStakingApyView;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.KlineFundingRateData;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.UnitType;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wbc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52914wbc extends AbstractC49945uyC<uQD, SmartArbiArbitrageApyPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public java.lang.Boolean AYXKKw;
    public java.lang.String AhwBna;
    public SmartArbitrageCalStakingApyView AkhnZx;
    public java.util.ArrayList<java.lang.String> AuCTel;
    public ArbitrageInfoResponse DbNXlk;
    public AbstractC53029wdl KWHzl;
    public final int copydefault;
    public java.lang.Boolean djBIcL;
    public java.util.ArrayList<java.lang.Long> fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public C55113xdn isConnected;
    public final int valueOf = C48033uCm.Activity.gmHjFq;
    public C53019wdb values;

    /* JADX INFO: renamed from: o.wbc$Fragment */
    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.valueOf;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public C52914wbc() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.djBIcL = bool;
        this.AYXKKw = bool;
        this.fJNWhG = new java.util.ArrayList<>();
        this.AuCTel = new java.util.ArrayList<>();
        this.copydefault = 400;
    }

    /* JADX INFO: renamed from: o.wbc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wbc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C52914wbc copydefault(@NotNull java.lang.String str, StrategyDetailsResponse strategyDetailsResponse, boolean z, boolean z2, java.lang.String str2, ArbitrageInfoResponse arbitrageInfoResponse, @NotNull SmartArbitrageManualPresenter.PnLDuration pnLDuration, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(pnLDuration, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("query_scene_params", str);
            bundle.putBoolean("is_staking_params", z);
            bundle.putBoolean("is_leverage_params", z2);
            bundle.putString("inst_id_params", str2);
            bundle.putParcelable("multi_min_amount_item_params", arbitrageInfoResponse);
            bundle.putString("day_annualized_params", java.lang.String.valueOf(pnLDuration.getValue()));
            bundle.putString("arbitrage_year_rate_params", str3);
            bundle.putParcelable("bot_details_params", strategyDetailsResponse);
            C52914wbc c52914wbc = new C52914wbc();
            c52914wbc.setArguments(bundle);
            return c52914wbc;
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        ArbitrageInfoResponse arbitrageInfoResponse;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.fetchVPNInfo = arguments != null ? arguments.getString("query_scene_params") : null;
        android.os.Bundle arguments2 = getArguments();
        this.djBIcL = arguments2 != null ? java.lang.Boolean.valueOf(arguments2.getBoolean("is_staking_params")) : null;
        android.os.Bundle arguments3 = getArguments();
        this.AYXKKw = arguments3 != null ? java.lang.Boolean.valueOf(arguments3.getBoolean("is_leverage_params")) : null;
        android.os.Bundle arguments4 = getArguments();
        this.gEmmrt = arguments4 != null ? arguments4.getString("inst_id_params") : null;
        android.os.Bundle arguments5 = getArguments();
        if (arguments5 == null || (arbitrageInfoResponse = (ArbitrageInfoResponse) BundleCompat.getParcelable(arguments5, "multi_min_amount_item_params", ArbitrageInfoResponse.class)) == null) {
            arbitrageInfoResponse = new ArbitrageInfoResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbitrageTotalPnlInfo) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, (java.lang.String) null, (java.lang.String) null, false, 16777215, (DefaultConstructorMarker) null);
        }
        this.DbNXlk = arbitrageInfoResponse;
        android.os.Bundle arguments6 = getArguments();
        this.AhwBna = arguments6 != null ? arguments6.getString("day_annualized_params") : null;
        android.os.Bundle arguments7 = getArguments();
        this.AEQbTJ = arguments7 != null ? arguments7.getString("arbitrage_year_rate_params") : null;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.isConnected = values().valueOf;
        fJNWhG();
        fIwbmz();
        AuCTel();
        isConnected();
        fARcdN();
        SmartArbiArbitrageApyPresenter smartArbiArbitrageApyPresenterOLrzqt = OLrzqt();
        java.lang.String str = this.gEmmrt;
        smartArbiArbitrageApyPresenterOLrzqt.OLrzqt(str != null ? str : "");
    }

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
    private final SmartArbitrageCalStakingApyView OLrzqt(androidx.fragment.app.FragmentManager fragmentManager) {
        android.content.Context context = getContext();
        SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyView = null;
        if (context != null) {
            java.lang.Boolean bool = this.djBIcL;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            java.lang.Boolean bool2 = this.AYXKKw;
            SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyView2 = new SmartArbitrageCalStakingApyView(context, null, 0, zBooleanValue, bool2 != null ? bool2.booleanValue() : false, null, 38, null);
            SmartArbitrageCalStakingApyView.PnLDuration.ActionBar actionBar = SmartArbitrageCalStakingApyView.PnLDuration.Companion;
            ArbitrageInfoResponse arbitrageInfoResponse = this.DbNXlk;
            java.lang.String highestApyPeriod = arbitrageInfoResponse != null ? arbitrageInfoResponse.getHighestApyPeriod() : null;
            if (highestApyPeriod == null) {
                highestApyPeriod = "";
            }
            SmartArbitrageCalStakingApyView.PnLDuration pnLDurationKWHzl = actionBar.KWHzl(highestApyPeriod);
            if (pnLDurationKWHzl == null) {
                pnLDurationKWHzl = SmartArbitrageCalStakingApyView.PnLDuration.APY_3DAYS;
            }
            smartArbitrageCalStakingApyView2.setSelectedDuration(pnLDurationKWHzl);
            smartArbitrageCalStakingApyView2.EZpvd(fragmentManager);
            smartArbitrageCalStakingApyView = smartArbitrageCalStakingApyView2;
        }
        this.AkhnZx = smartArbitrageCalStakingApyView;
        return smartArbitrageCalStakingApyView;
    }

    private final void fIwbmz() {
        final SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyViewOLrzqt = OLrzqt(getChildFragmentManager());
        this.KWHzl = smartArbitrageCalStakingApyViewOLrzqt;
        if (smartArbitrageCalStakingApyViewOLrzqt != null) {
            smartArbitrageCalStakingApyViewOLrzqt.setFirstApyViewExplainClickListener(new Function1() { // from class: o.waY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52914wbc.KWHzl(smartArbitrageCalStakingApyViewOLrzqt, (android.view.View) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(AbstractC53029wdl abstractC53029wdl, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = abstractC53029wdl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.hbZCHz));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.Dfm));
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.wbb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C52914wbc.EZpvd(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.wbc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C52914wbc KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52914wbc c52914wbc) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c52914wbc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.ejfBZ();
            }
        }
    }

    /* JADX INFO: renamed from: o.wbc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52914wbc OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52914wbc c52914wbc) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c52914wbc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.ejfBZ();
            }
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.dbUqJD));
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ));
        wyf.setOnClickListener(new Application(wyf, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    private final void fJNWhG() {
        uQD uqdValues = values();
        java.lang.String str = this.AEQbTJ;
        int iOLrzqt = C56033xvF.OLrzqt((java.lang.Object) (str != null ? StringsKt__StringsKt.EZpvd(str, (java.lang.CharSequence) "%") : null));
        java.lang.String str2 = this.AEQbTJ;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(this, C48033uCm.Fragment.GPCHlQ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(this.AhwBna))));
        java.lang.String str3 = " " + str2;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
        int length = strCopydefault.length();
        spannableStringBuilder.append((java.lang.CharSequence) str3);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iOLrzqt), length, str3.length() + length, 0);
        uqdValues.OLrzqt.setText(spannableStringBuilder);
        uqdValues.AEQbTJ.setText(C33069mpW.copydefault(this, C48033uCm.Fragment.GLcwwN, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(this.AhwBna)))));
    }

    public final void fARcdN() {
        C55113xdn c55113xdn = this.isConnected;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(0);
        }
        C55113xdn c55113xdn2 = this.isConnected;
        if (c55113xdn2 != null) {
            c55113xdn2.setAnimation(C52761wXj.PendingIntent.isConnected);
        }
        C55113xdn c55113xdn3 = this.isConnected;
        if (c55113xdn3 != null) {
            C55113xdn.showLoading$default(c55113xdn3, 0L, 1, null);
        }
    }

    public final void copydefault() {
        C55113xdn c55113xdn = this.isConnected;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(8);
        }
        C55113xdn c55113xdn2 = this.isConnected;
        if (c55113xdn2 != null) {
            c55113xdn2.copydefault();
        }
    }

    public final void AuCTel() {
        values().KWHzl.setLeftTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.hTAtCx));
        values().KWHzl.setRightTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.RhlVAI));
        values().KWHzl.setLeftBgStyle(true);
        values().KWHzl.setRightBgStyle(true);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.values = new C53019wdb(contextRequireContext);
        android.content.Context context = getContext();
        C53019wdb c53019wdb = null;
        if (context != null) {
            C53019wdb c53019wdb2 = this.values;
            if (c53019wdb2 == null) {
                Intrinsics.gEmmrt("");
                c53019wdb2 = null;
            }
            c53019wdb2.setLayoutDirection(C55296xhK.AEQbTJ(context));
            C53018wda c53018wda = values().KWHzl;
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            c53018wda.setLeftBgColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null));
            values().KWHzl.setRightBgColor(C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null));
        }
        C53020wdc c53020wdc = values().EZpvd;
        c53020wdc.getAxisLeft().setEnabled(true);
        c53020wdc.getAxisRight().setEnabled(false);
        c53020wdc.getAxisLeft().setDrawZeroLine(true);
        c53020wdc.getAxisLeft().setZeroLineColor(c53020wdc.getResources().getColor(C52761wXj.Activity.putInt));
        c53020wdc.setNoDataText("");
        C53421wlF c53421wlF = C53421wlF.EZpvd;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        Intrinsics.copydefault(c53020wdc);
        C53019wdb c53019wdb3 = this.values;
        if (c53019wdb3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c53019wdb = c53019wdb3;
        }
        c53421wlF.copydefault(contextRequireContext2, c53020wdc, c53019wdb, false);
        c53020wdc.setOnChartValueSelectedListener(new Dialog(c53020wdc));
    }

    /* JADX INFO: renamed from: o.wbc$Dialog */
    public static final class Dialog implements OnChartValueSelectedListener {
        public final /* synthetic */ C53020wdc copydefault;

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public Dialog(C53020wdc c53020wdc) {
            this.copydefault = c53020wdc;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            if (Intrinsics.EZpvd(entry != null ? java.lang.Float.valueOf(entry.getY()) : null, 0.0f)) {
                T dataSetByIndex = this.copydefault.getLineData().getDataSetByIndex(0);
                Intrinsics.copydefault(dataSetByIndex, "");
                ((LineDataSet) dataSetByIndex).setHighLightColor(0);
            } else {
                T dataSetByIndex2 = this.copydefault.getLineData().getDataSetByIndex(0);
                Intrinsics.copydefault(dataSetByIndex2, "");
                ((LineDataSet) dataSetByIndex2).setHighLightColor(ContextCompat.getColor(this.copydefault.getContext(), C52761wXj.Activity.dXcUrg));
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        TradeLiveData<java.util.ArrayList<KlineFundingRateData>> tradeLiveDataAEQbTJ = OLrzqt().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new Fragment(new Function1() { // from class: o.wbg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52914wbc.AEQbTJ(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C52914wbc c52914wbc, java.util.ArrayList arrayList) {
        c52914wbc.copydefault();
        if (arrayList != null) {
            c52914wbc.copydefault(arrayList);
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(java.util.ArrayList<KlineFundingRateData> arrayList) {
        values().EZpvd.clear();
        this.fJNWhG.clear();
        this.AuCTel.clear();
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() < 2) {
            return;
        }
        java.util.ArrayList<java.lang.Long> arrayList2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(C33129mqd.valueOf(((KlineFundingRateData) it.next()).getTs())));
        }
        this.fJNWhG = arrayList2;
        java.util.List<KlineFundingRateData> listZLjUOn = C56405yEd.zLjUOn(arrayList);
        java.util.Iterator<T> it2 = listZLjUOn.iterator();
        while (it2.hasNext()) {
            this.AuCTel.add(C33129mqd.gEmmrt(java.lang.Float.valueOf(C33129mqd.djBIcL(((KlineFundingRateData) it2.next()).getRate()))));
        }
        AEQbTJ(this.fJNWhG);
        EZpvd(listZLjUOn, this.AuCTel);
    }

    private final void AEQbTJ(java.util.ArrayList<java.lang.Long> arrayList) {
        XAxis xAxis = values().EZpvd.getXAxis();
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        xAxis.setSpaceMin(1.0f);
        xAxis.setSpaceMax(1.0f);
        Activity activity = new Activity(arrayList, false, 2, null);
        UnitType unitType = new UnitType();
        unitType.setType(2);
        activity.copydefault(unitType);
        xAxis.setValueFormatter(activity);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wlF.createLineDataSet$default(o.wlF, android.content.Context, java.util.ArrayList, java.util.ArrayList, com.github.mikephil.charting.components.YAxis$AxisDependency, boolean, boolean, boolean, java.lang.Integer, android.graphics.drawable.Drawable, int, int, java.lang.Object):com.github.mikephil.charting.data.LineDataSet */
    private final void EZpvd(java.util.List<KlineFundingRateData> list, java.util.ArrayList<java.lang.String> arrayList) {
        java.util.ArrayList<Entry> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = list.size();
        float fDjBIcL = 0.0f;
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                if (C33129mqd.djBIcL(arrayList.get(i)) > 0.0f && fDjBIcL < 0.0f) {
                    AEQbTJ(arrayList, arrayList2, i, fDjBIcL);
                    android.content.Context context = getContext();
                    if (context != null) {
                        arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null)));
                    }
                } else if (C33129mqd.djBIcL(arrayList.get(i)) < 0.0f && fDjBIcL > 0.0f) {
                    AEQbTJ(arrayList, arrayList2, i, fDjBIcL);
                    android.content.Context context2 = getContext();
                    if (context2 != null) {
                        arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context2, 0.0f, 2, null)));
                    }
                }
            }
            fDjBIcL = C33129mqd.djBIcL(arrayList.get(i));
            arrayList2.add(new Entry(i, C33129mqd.djBIcL(arrayList.get(i)), list.get(i)));
            android.content.Context context3 = getContext();
            if (context3 != null) {
                if (i == 0) {
                    if (C33129mqd.djBIcL(arrayList.get(1)) > 0.0f) {
                        arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context3, 0.0f, 2, null)));
                    } else {
                        arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context3, 0.0f, 2, null)));
                    }
                } else if (C33129mqd.djBIcL(arrayList.get(i)) > 0.0f) {
                    arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(C33512mxp.AEQbTJ, context3, 0.0f, 2, null)));
                } else {
                    arrayList3.add(java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(C33512mxp.AEQbTJ, context3, 0.0f, 2, null)));
                }
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        C53421wlF c53421wlF = C53421wlF.EZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        arrayList4.add(c53421wlF.KWHzl(contextRequireContext, arrayList2, arrayList3, (992 & 8) != 0 ? YAxis.AxisDependency.LEFT : YAxis.AxisDependency.LEFT, (992 & 16) != 0 ? false : true, (992 & 32) != 0 ? false : false, (992 & 64) != 0 ? false : false, (992 & 128) != 0 ? null : null, (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? 6 : 0));
        LineData lineData = new LineData(arrayList4);
        YAxis axisLeft = values().EZpvd.getAxisLeft();
        axisLeft.setTypeface(C55051xce.OLrzqt.valueOf());
        axisLeft.setValueFormatter(new TaskDescription(3));
        axisLeft.setLabelCount(5, true);
        values().EZpvd.setData(lineData);
        values().EZpvd.animateX(this.copydefault);
    }

    private final void AEQbTJ(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<Entry> arrayList2, int i, float f) {
        float fDjBIcL = C33129mqd.djBIcL(arrayList.get(i)) - f;
        arrayList2.add(new Entry((0 - (C33129mqd.djBIcL(arrayList.get(i)) - (i * fDjBIcL))) / fDjBIcL, 0.0f, ""));
    }

    /* JADX INFO: renamed from: o.wbc$Activity */
    public static final class Activity extends ValueFormatter {
        public final boolean AEQbTJ;
        public UnitType EZpvd;
        public final java.util.List<java.lang.Long> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(UnitType unitType) {
            this.EZpvd = unitType;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.util.List<java.lang.Long>, boolean):void (m)] (LINE:430) call: o.wbc.Activity.<init>(java.util.List, boolean):void type: THIS */
        public /* synthetic */ Activity(java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? true : z);
        }

        public Activity(@NotNull java.util.List<java.lang.Long> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
            this.AEQbTJ = z;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            java.lang.Long l;
            int i = (int) f;
            if (i < 0 || i >= this.copydefault.size()) {
                return "";
            }
            if (this.AEQbTJ) {
                java.util.List<java.lang.Long> list = this.copydefault;
                l = (java.lang.Long) CollectionsKt___CollectionsKt.AkhnZx(list, (list.size() - 1) - i);
            } else {
                l = (java.lang.Long) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault, i);
            }
            UnitType unitType = this.EZpvd;
            java.lang.Integer type = unitType != null ? unitType.getType() : null;
            if (type != null && type.intValue() == 1) {
                return pTA.formatTime$default(new Date(l != null ? l.longValue() : 0L), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
            }
            return pTA.formatDate$default(new Date(l != null ? l.longValue() : 0L), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
        }
    }

    /* JADX INFO: renamed from: o.wbc$TaskDescription */
    public static final class TaskDescription extends ValueFormatter {
        public int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(0, 1, null);
        }

        public TaskDescription(int i) {
            this.KWHzl = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:454) call: o.wbc.TaskDescription.<init>(int):void type: THIS */
        public /* synthetic */ TaskDescription(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2 : i);
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return pTB.KWHzl(xMR.copydefault.OLrzqt(java.lang.Float.valueOf(f)), this.KWHzl, RoundingMode.HALF_UP);
        }
    }
}
