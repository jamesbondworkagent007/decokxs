package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbiPreviewProfitLossPresenter;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.view.SmartArbitrageCalStakingApyView;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedApyVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.FundingFeeApyItem;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wbm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52924wbm extends AbstractC48165uHj<uQG, SmartArbiPreviewProfitLossPresenter> implements ViewModelStoreOwner {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public java.lang.Boolean AYXKKw;
    public java.lang.String AhwBna;
    public ArbitrageInfoResponse AkhnZx;
    public AbstractC53029wdl KWHzl;
    public java.lang.String OLrzqt;
    public StrategyConfigInfo copydefault;
    public java.lang.Boolean djBIcL;
    public java.lang.String ejfBZ;
    public java.lang.String fARcdN;
    public SmartArbitrageCalStakingApyView fJNWhG;
    public java.lang.String gEmmrt;
    public java.lang.Float isConnected;
    public java.lang.String valueOf;
    public java.lang.String values;
    public final int DbNXlk = C48033uCm.Activity.hlkKmr;
    public java.lang.String fetchVPNInfo = "";
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wbl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52924wbm.copydefault(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.DbNXlk;
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
    }

    public C52924wbm() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.AYXKKw = bool;
        this.djBIcL = bool;
        this.isConnected = java.lang.Float.valueOf(1.0f);
    }

    /* JADX INFO: renamed from: o.wbm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wbm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C52924wbm OLrzqt(@NotNull java.lang.String str, StrategyDetailsResponse strategyDetailsResponse, boolean z, boolean z2, java.lang.String str2, @NotNull java.lang.String str3, ArbitrageInfoResponse arbitrageInfoResponse, StrategyConfigInfo strategyConfigInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("query_scene_params", str);
            bundle.putBoolean("is_staking_params", z);
            bundle.putBoolean("is_leverage_params", z2);
            bundle.putString("inst_id_params", str2);
            bundle.putParcelable("multi_min_amount_item_params", arbitrageInfoResponse);
            bundle.putParcelable("strategy_config_info_params", strategyConfigInfo);
            bundle.putString("unit_params", str3);
            bundle.putParcelable("bot_details_params", strategyDetailsResponse);
            C52924wbm c52924wbm = new C52924wbm();
            c52924wbm.setArguments(bundle);
            return c52924wbm;
        }
    }

    public static final C53518wmx copydefault(C52924wbm c52924wbm) {
        android.content.Context contextRequireContext = c52924wbm.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    private final C53518wmx valueOf() {
        return (C53518wmx) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    /* JADX DEBUG: Possible override for method o.uHj.AEQbTJ()V */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C53518wmx gEmmrt() {
        return valueOf();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        ArbitrageInfoResponse arbitrageInfoResponse;
        StrategyConfigInfo strategyConfigInfo;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.valueOf = arguments != null ? arguments.getString("inst_id_params") : null;
        android.os.Bundle arguments2 = getArguments();
        this.AhwBna = arguments2 != null ? arguments2.getString("bot_inst_type") : null;
        android.os.Bundle arguments3 = getArguments();
        this.gEmmrt = arguments3 != null ? arguments3.getString("inst_family_params") : null;
        android.os.Bundle arguments4 = getArguments();
        this.OLrzqt = arguments4 != null ? arguments4.getString("algoId") : null;
        android.os.Bundle arguments5 = getArguments();
        this.fetchVPNInfo = arguments5 != null ? arguments5.getString("unit_params") : null;
        android.os.Bundle arguments6 = getArguments();
        this.ejfBZ = arguments6 != null ? arguments6.getString("total_amt_params") : null;
        android.os.Bundle arguments7 = getArguments();
        this.values = arguments7 != null ? arguments7.getString("query_scene_params") : null;
        android.os.Bundle arguments8 = getArguments();
        this.djBIcL = arguments8 != null ? java.lang.Boolean.valueOf(arguments8.getBoolean("is_leverage_supported_params")) : null;
        android.os.Bundle arguments9 = getArguments();
        this.isConnected = arguments9 != null ? java.lang.Float.valueOf(arguments9.getFloat("leverage_principal_params")) : null;
        android.os.Bundle arguments10 = getArguments();
        this.fARcdN = arguments10 != null ? arguments10.getString("spread_ratio_params") : null;
        android.os.Bundle arguments11 = getArguments();
        this.AYXKKw = arguments11 != null ? java.lang.Boolean.valueOf(arguments11.getBoolean("is_stake_supported_params")) : null;
        android.os.Bundle arguments12 = getArguments();
        if (arguments12 == null || (arbitrageInfoResponse = (ArbitrageInfoResponse) BundleCompat.getParcelable(arguments12, "multi_min_amount_item_params", ArbitrageInfoResponse.class)) == null) {
            arbitrageInfoResponse = new ArbitrageInfoResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbitrageTotalPnlInfo) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, (java.lang.String) null, (java.lang.String) null, false, 16777215, (DefaultConstructorMarker) null);
        }
        this.AkhnZx = arbitrageInfoResponse;
        android.os.Bundle arguments13 = getArguments();
        if (arguments13 == null || (strategyConfigInfo = (StrategyConfigInfo) BundleCompat.getParcelable(arguments13, "strategy_config_info_params", StrategyConfigInfo.class)) == null) {
            strategyConfigInfo = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        this.copydefault = strategyConfigInfo;
    }

    private final boolean AYXKKw() {
        return !Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) EopTrackEvent.CLOSE);
    }

    public final boolean KWHzl() {
        return Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) "running");
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        djBIcL();
        ArbitrageInfoResponse arbitrageInfoResponse = this.AkhnZx;
        copydefault(arbitrageInfoResponse != null ? arbitrageInfoResponse.getEstimatedOpenCost() : null);
        ArbitrageInfoResponse arbitrageInfoResponse2 = this.AkhnZx;
        AEQbTJ(arbitrageInfoResponse2 != null ? arbitrageInfoResponse2.getHighestApyPeriod() : null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
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
    public final SmartArbitrageCalStakingApyView KWHzl(androidx.fragment.app.FragmentManager fragmentManager) {
        android.content.Context context = getContext();
        SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyView = null;
        if (context != null) {
            java.lang.Boolean bool = this.AYXKKw;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            java.lang.Boolean bool2 = this.djBIcL;
            SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyView2 = new SmartArbitrageCalStakingApyView(context, null, 0, zBooleanValue, bool2 != null ? bool2.booleanValue() : false, this.copydefault, 6, null);
            SmartArbitrageCalStakingApyView.PnLDuration.ActionBar actionBar = SmartArbitrageCalStakingApyView.PnLDuration.Companion;
            ArbitrageInfoResponse arbitrageInfoResponse = this.AkhnZx;
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
            smartArbitrageCalStakingApyView2.AEQbTJ(new Function2() { // from class: o.wbr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C52924wbm.EZpvd(this.AEQbTJ, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            smartArbitrageCalStakingApyView = smartArbitrageCalStakingApyView2;
        }
        this.fJNWhG = smartArbitrageCalStakingApyView;
        return smartArbitrageCalStakingApyView;
    }

    public static final Unit EZpvd(C52924wbm c52924wbm, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c52924wbm.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        java.lang.String strAYXKKw;
        java.lang.String strCopydefault;
        java.lang.String strAYXKKw2;
        C53030wdm c53030wdm = ((uQG) gGvvIC()).KWHzl;
        c53030wdm.djBIcL().setTextAppearance(C32113mPz.Dialog.hDKMBd);
        c53030wdm.djBIcL().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        C55258xgZ c55258xgZDjBIcL = c53030wdm.djBIcL();
        if (AYXKKw()) {
            if (KWHzl()) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.fbC);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.GQzpsZ);
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.fcfzuX);
        }
        c55258xgZDjBIcL.setText(strAYXKKw);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.ejfBZ)) {
            c53030wdm.KWHzl().setVisibility(8);
        } else {
            c53030wdm.KWHzl().setVisibility(0);
            android.widget.TextView textViewKWHzl = c53030wdm.KWHzl();
            int i = C48033uCm.Fragment.finishInit;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) this.ejfBZ)) {
                xMR xmr = xMR.copydefault;
                java.lang.String str = this.ejfBZ;
                if (str == null) {
                    str = "";
                }
                strCopydefault = xmr.copydefault(str);
            } else {
                strCopydefault = xMR.copydefault.copydefault("10000");
            }
            textViewKWHzl.setText(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strCopydefault + " " + this.fetchVPNInfo))));
        }
        c53030wdm.valueOf().setText("--");
        android.widget.TextView textViewAhwBna = c53030wdm.AhwBna();
        if (KWHzl()) {
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.QnnRaN);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.DBAlnt);
        }
        textViewAhwBna.setText(strAYXKKw2);
        c53030wdm.AEQbTJ().setText("--");
        c53030wdm.EZpvd().setText("--");
        c53030wdm.copydefault().setText("--");
        if (AYXKKw()) {
            c53030wdm.OLrzqt().setVisibility(0);
            if (KWHzl()) {
                c53030wdm.OLrzqt().setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKOmnske));
            } else {
                c53030wdm.OLrzqt().setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OzhFjl));
            }
        } else {
            c53030wdm.OLrzqt().setVisibility(8);
        }
        c53030wdm.gEmmrt().setVisibility(AYXKKw() ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        java.util.List<EstimatedApyVo> estimatedApyList;
        final SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyViewKWHzl = KWHzl(getChildFragmentManager());
        this.KWHzl = smartArbitrageCalStakingApyViewKWHzl;
        if (smartArbitrageCalStakingApyViewKWHzl != null) {
            android.widget.FrameLayout frameLayout = ((uQG) gGvvIC()).AhwBna;
            frameLayout.removeAllViews();
            frameLayout.addView(this.KWHzl, new ViewGroup.LayoutParams(-1, -2));
            ArbitrageInfoResponse arbitrageInfoResponse = this.AkhnZx;
            AbstractC53029wdl.refreshView$default(smartArbitrageCalStakingApyViewKWHzl, (arbitrageInfoResponse == null || (estimatedApyList = arbitrageInfoResponse.getEstimatedApyList()) == null) ? null : OLrzqt(estimatedApyList), false, false, 6, null);
            smartArbitrageCalStakingApyViewKWHzl.setFirstApyViewExplainClickListener(new Function1() { // from class: o.wbo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52924wbm.EZpvd(smartArbitrageCalStakingApyViewKWHzl, (android.view.View) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(AbstractC53029wdl abstractC53029wdl, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = abstractC53029wdl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.hbZCHz));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.Dfm));
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.wbp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C52924wbm.copydefault(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(CostVo costVo) {
        C53030wdm c53030wdm = ((uQG) gGvvIC()).KWHzl;
        if (costVo != null) {
            c53030wdm.valueOf().setTextColor(C56033xvF.OLrzqt((java.lang.Object) costVo.getTotalCostAmt()));
            android.widget.TextView textViewValueOf = c53030wdm.valueOf();
            java.lang.String totalCostAmt = costVo.getTotalCostAmt();
            DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
            textViewValueOf.setText(OLrzqt(totalCostAmt, 3, displaySign) + " " + this.fetchVPNInfo);
            c53030wdm.AEQbTJ().setTextColor(C56033xvF.OLrzqt((java.lang.Object) costVo.getSpreadAmt()));
            c53030wdm.AEQbTJ().setText(OLrzqt(costVo.getSpreadAmt(), 3, displaySign) + " " + this.fetchVPNInfo);
            c53030wdm.EZpvd().setText(getFormatedAmount$default(this, costVo.getSpotFeeAmt(), 3, null, 4, null) + " " + this.fetchVPNInfo);
            c53030wdm.copydefault().setText(getFormatedAmount$default(this, costVo.getSwapFeeAmt(), 3, null, 4, null) + " " + this.fetchVPNInfo);
        }
    }

    public static /* synthetic */ void refreshMinHoldDays$default(C52924wbm c52924wbm, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c52924wbm.AEQbTJ(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str) {
        java.lang.String strAYXKKw;
        java.util.List<EstimatedApyVo> estimatedApyList;
        java.lang.Object next;
        ArbitrageInfoResponse arbitrageInfoResponse = this.AkhnZx;
        java.lang.String minPaybackDays = null;
        if (arbitrageInfoResponse != null && (estimatedApyList = arbitrageInfoResponse.getEstimatedApyList()) != null) {
            java.util.Iterator<T> it = estimatedApyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((EstimatedApyVo) next).getPeriod(), (java.lang.Object) str)) {
                        break;
                    }
                }
            }
            EstimatedApyVo estimatedApyVo = (EstimatedApyVo) next;
            if (estimatedApyVo != null) {
                minPaybackDays = estimatedApyVo.getMinPaybackDays();
            }
        }
        C55258xgZ c55258xgZ = ((uQG) gGvvIC()).AYXKKw;
        if (C33129mqd.AEQbTJ(minPaybackDays, "0")) {
            int i = C48033uCm.Fragment.RFmUsE;
            if (minPaybackDays == null) {
                minPaybackDays = "";
            }
            strAYXKKw = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", minPaybackDays)));
        } else if (C33129mqd.OLrzqt(minPaybackDays, "0")) {
            if (KWHzl()) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.getValue);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.RLmrWm);
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.drbYRJ);
        }
        c55258xgZ.setText(strAYXKKw);
    }

    public static /* synthetic */ java.lang.String getFormatedAmount$default(C52924wbm c52924wbm, java.lang.String str, int i, DisplaySign displaySign, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return c52924wbm.OLrzqt(str, i, displaySign);
    }

    public final java.lang.String OLrzqt(java.lang.String str, int i, DisplaySign displaySign) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xMR.formatFloorToMax$default(xmr, str, i, null, displaySign, 4, null);
    }

    public final java.util.List<FundingFeeApyItem> OLrzqt(java.util.List<EstimatedApyVo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (EstimatedApyVo estimatedApyVo : list) {
            arrayList.add(new FundingFeeApyItem(estimatedApyVo.getPeriod(), estimatedApyVo.getTotalApy(), estimatedApyVo.getStakingApy(), estimatedApyVo.getArbApy(), estimatedApyVo.getInterestYearRate(), estimatedApyVo.getInterestYearRate(), null));
        }
        return arrayList;
    }
}
