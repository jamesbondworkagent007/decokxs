package o;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.material.tabs.TabLayout;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oSu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36195oSu extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.oSy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36195oSu.KWHzl();
        }
    });
    public oOD copydefault;

    /* JADX INFO: renamed from: o.oSu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oSu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChartViewOutSideConfig KWHzl() {
        return C36246oUr.copydefault().zLjUOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartViewOutSideConfig OLrzqt() {
        return (ChartViewOutSideConfig) this.KWHzl.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(Intrinsics.EZpvd((java.lang.Object) C37925pFu.KWHzl.KWHzl(), (java.lang.Object) "0") ? C33070mpX.AYXKKw(C35964oKf.Fragment.OUcgGI) : C33070mpX.AYXKKw(C35964oKf.Fragment.DsfknC));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = oOD.KWHzl(getCustomLayoutInflater(), constraintLayout);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C54946xaf binding = getBinding();
        if (binding != null && (constraintLayout = binding.AEQbTJ) != null) {
            constraintLayout.setPaddingRelative(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        oOD ood = this.copydefault;
        if (ood != null) {
            OLrzqt(ood);
            EZpvd(ood);
        }
        C36234oUf.EZpvd.EZpvd("bottom_settings_tutorial", "average_cost");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.android.material.tabs.TabLayout, o.xgQ] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.fragment.app.Fragment, o.oSu] */
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
    public final void OLrzqt(oOD ood) {
        boolean mShowTradePosExtendedLine;
        ?? mTradePosShowRight;
        ?? mTradePosShowPnl;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        pFZ pfz = pFZ.KWHzl;
        AppCompatImageView appCompatImageView = ood.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        pfz.OLrzqt(appCompatImageView, C35964oKf.Activity.QKVWgx, iTradeRiseGraph$default);
        AppCompatImageView appCompatImageView2 = ood.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        pfz.OLrzqt(appCompatImageView2, C35964oKf.Activity.ORxRYg, iTradeFallGraph$default);
        AppCompatTextView appCompatTextView = ood.fARcdN;
        xMR xmr = xMR.copydefault;
        appCompatTextView.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "21762.00", 0, 2, null));
        ood.AhwBna.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20862.00", 0, 2, null));
        ood.KWHzl.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "19962.00", 0, 2, null));
        ood.isConnected.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "0.01", 0, 2, null));
        ood.AEQbTJ.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20912.00", 0, 2, null));
        ood.valueOf.setLeftCornerRound(true);
        ood.valueOf.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
        C39824pzd c39824pzd = ood.isConnected;
        c39824pzd.setTextColor(iTradeRiseGraph$default);
        c39824pzd.setLeftCornerRound(false);
        c39824pzd.OLrzqt(iTradeRiseGraph$default);
        ood.AEQbTJ.setTextColor(iTradeRiseGraph$default);
        ood.AEQbTJ.AEQbTJ(iTradeRiseGraph$default);
        ood.AYXKKw.setBackgroundColor(iTradeRiseGraph$default);
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().getDexChartSource(), (java.lang.Object) "dex_src_market")) {
            mShowTradePosExtendedLine = OLrzqt().getMDexAvgExtend();
        } else {
            mShowTradePosExtendedLine = OLrzqt().getMShowTradePosExtendedLine();
        }
        ood.gEmmrt.setChecked(mShowTradePosExtendedLine);
        EZpvd(ood, mShowTradePosExtendedLine);
        for (java.lang.String str : yDY.gEmmrt(C33070mpX.AYXKKw(C35964oKf.Fragment.OrsvgJ), C33070mpX.AYXKKw(C35964oKf.Fragment.RFmUsE))) {
            C55249xgQ c55249xgQ = ood.fetchVPNInfo;
            c55249xgQ.addTab(c55249xgQ.newTab().setText(str));
        }
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().getDexChartSource(), (java.lang.Object) "dex_src_market")) {
            mTradePosShowRight = OLrzqt().getMDexAvgShowRight();
        } else {
            mTradePosShowRight = OLrzqt().getMTradePosShowRight();
        }
        TabLayout.Tab tabAt = ood.fetchVPNInfo.getTabAt(mTradePosShowRight);
        if (tabAt != null) {
            tabAt.select();
        }
        copydefault(ood, mTradePosShowRight ^ 1);
        for (java.lang.String str2 : yDY.gEmmrt(C33070mpX.AYXKKw(C35964oKf.Fragment.gAnGwV), C33070mpX.AYXKKw(C35964oKf.Fragment.RLmrWm))) {
            C55249xgQ c55249xgQ2 = ood.DbNXlk;
            c55249xgQ2.addTab(c55249xgQ2.newTab().setText(str2));
        }
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().getDexChartSource(), (java.lang.Object) "dex_src_market")) {
            mTradePosShowPnl = OLrzqt().getMDexAvgShowPnlAmt();
        } else {
            mTradePosShowPnl = OLrzqt().getMTradePosShowPnl();
        }
        TabLayout.Tab tabAt2 = ood.DbNXlk.getTabAt(mTradePosShowPnl ^ 1);
        if (tabAt2 != null) {
            tabAt2.select();
        }
        OLrzqt(ood, mTradePosShowPnl);
    }

    public final void EZpvd(final oOD ood) {
        ood.gEmmrt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.oSw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C36195oSu.copydefault(this.AEQbTJ, ood, compoundButton, z);
            }
        });
        ood.DbNXlk.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application(ood));
        ood.fetchVPNInfo.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity(ood));
    }

    public static final void copydefault(C36195oSu c36195oSu, oOD ood, android.widget.CompoundButton compoundButton, boolean z) {
        if (Intrinsics.EZpvd((java.lang.Object) c36195oSu.OLrzqt().getDexChartSource(), (java.lang.Object) "dex_src_market")) {
            SPUtils.put("kline_dex_avg_extend_line", java.lang.Boolean.valueOf(z), "dex_market");
            c36195oSu.OLrzqt().setMDexAvgExtend(z);
            c36195oSu.EZpvd(ood, z);
            C36234oUf.EZpvd.EZpvd("average_cost_tutorial", "extended_price_line");
            return;
        }
        SPUtils.put("kline_trade_position_extended_line", java.lang.Boolean.valueOf(z));
        c36195oSu.OLrzqt().setMShowTradePosExtendedLine(z);
        c36195oSu.EZpvd(ood, z);
        C36234oUf.EZpvd.EZpvd("average_cost_tutorial", "extended_price_line");
    }

    /* JADX INFO: renamed from: o.oSu$Application */
    public static final class Application implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ oOD copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application(oOD ood) {
            this.copydefault = ood;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            boolean z;
            Intrinsics.checkNotNullParameter(tab, "");
            if (Intrinsics.EZpvd((java.lang.Object) C36195oSu.this.OLrzqt().getDexChartSource(), (java.lang.Object) "dex_src_market")) {
                z = tab.getPosition() == 0;
                C36195oSu.this.OLrzqt().setMDexAvgShowPnlAmt(z);
                SPUtils.put("kline_dex_avg_show_pnl_amt", java.lang.Boolean.valueOf(z), "dex_market");
                C36195oSu c36195oSu = C36195oSu.this;
                c36195oSu.OLrzqt(this.copydefault, c36195oSu.OLrzqt().getMDexAvgShowPnlAmt());
                C36234oUf.EZpvd.EZpvd("average_cost_tutorial", z ? "pnl" : "pnl_percent");
                return;
            }
            z = tab.getPosition() == 0;
            C36195oSu.this.OLrzqt().setMTradePosShowPnl(z);
            SPUtils.put("kline_trade_position_show_pnl", java.lang.Boolean.valueOf(z));
            C36195oSu c36195oSu2 = C36195oSu.this;
            c36195oSu2.OLrzqt(this.copydefault, c36195oSu2.OLrzqt().getMTradePosShowPnl());
            C36234oUf.EZpvd.EZpvd("average_cost_tutorial", z ? "pnl" : "pnl_percent");
        }
    }

    /* JADX INFO: renamed from: o.oSu$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ oOD AEQbTJ;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity(oOD ood) {
            this.AEQbTJ = ood;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            boolean z;
            Intrinsics.checkNotNullParameter(tab, "");
            if (Intrinsics.EZpvd((java.lang.Object) C36195oSu.this.OLrzqt().getDexChartSource(), (java.lang.Object) "dex_src_market")) {
                z = tab.getPosition() == 1;
                C36195oSu.this.OLrzqt().setMDexAvgShowRight(z);
                SPUtils.put("kline_dex_avg_show_right", java.lang.Boolean.valueOf(z), "dex_market");
                C36195oSu c36195oSu = C36195oSu.this;
                c36195oSu.copydefault(this.AEQbTJ, true ^ c36195oSu.OLrzqt().getMDexAvgShowRight());
                C36234oUf.EZpvd.EZpvd("average_cost_tutorial", z ? "position_right" : "position_left");
                return;
            }
            z = tab.getPosition() == 1;
            C36195oSu.this.OLrzqt().setMTradePosShowRight(z);
            SPUtils.put("kline_trade_position_show_right", java.lang.Boolean.valueOf(z));
            C36195oSu c36195oSu2 = C36195oSu.this;
            c36195oSu2.copydefault(this.AEQbTJ, true ^ c36195oSu2.OLrzqt().getMTradePosShowRight());
            C36234oUf.EZpvd.EZpvd("average_cost_tutorial", z ? "position_right" : "position_left");
        }
    }

    public final void EZpvd(oOD ood, boolean z) {
        int id = z ? 0 : ood.valueOf.getId();
        ConstraintSet constraintSet = new ConstraintSet();
        C54946xaf binding = getBinding();
        constraintSet.clone(binding != null ? binding.AEQbTJ : null);
        constraintSet.connect(ood.AYXKKw.getId(), 6, id, 6);
        C54946xaf binding2 = getBinding();
        constraintSet.applyTo(binding2 != null ? binding2.AEQbTJ : null);
    }

    public final void OLrzqt(oOD ood, boolean z) {
        java.lang.String strAYXKKw;
        java.lang.String percentWithSymbol$default;
        if (z) {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.gAnGwV);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.RLmrWm);
        }
        if (z) {
            percentWithSymbol$default = xMR.formatICUNumber$default(xMR.copydefault, "125.32", null, null, DisplaySign.ALWAYS, null, 22, null);
        } else {
            percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xMR.copydefault, "1.2532", 0, 0, null, 14, null);
        }
        ood.valueOf.setText(strAYXKKw + " " + percentWithSymbol$default);
    }

    public final void copydefault(oOD ood, boolean z) {
        int i = z ? 7 : 6;
        int id = z ? 0 : ood.AEQbTJ.getId();
        int i2 = z ? 6 : 7;
        int iDpInt$default = C55298xhM.dpInt$default(z ? 24 : 48, (android.content.Context) null, 1, (java.lang.Object) null);
        ConstraintSet constraintSet = new ConstraintSet();
        C54946xaf binding = getBinding();
        constraintSet.clone(binding != null ? binding.AEQbTJ : null);
        constraintSet.clear(ood.valueOf.getId(), i);
        constraintSet.connect(ood.valueOf.getId(), i2, id, 6, iDpInt$default);
        C54946xaf binding2 = getBinding();
        constraintSet.applyTo(binding2 != null ? binding2.AEQbTJ : null);
    }
}
