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

/* JADX INFO: loaded from: classes8.dex */
public final class oSD extends wXX {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.oSC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oSD.AEQbTJ();
        }
    });
    public oOI copydefault;

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oSD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChartViewOutSideConfig AEQbTJ() {
        return C36246oUr.copydefault().zLjUOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartViewOutSideConfig KWHzl() {
        return (ChartViewOutSideConfig) this.AEQbTJ.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.DNMMPQ));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = oOI.OLrzqt(getCustomLayoutInflater(), constraintLayout);
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
        oOI ooi = this.copydefault;
        if (ooi != null) {
            EZpvd(ooi);
            AEQbTJ(ooi);
        }
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
    public final void EZpvd(oOI ooi) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        pFZ pfz = pFZ.KWHzl;
        AppCompatImageView appCompatImageView = ooi.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        pfz.OLrzqt(appCompatImageView, C35964oKf.Activity.QKVWgx, iTradeRiseGraph$default);
        AppCompatImageView appCompatImageView2 = ooi.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        pfz.OLrzqt(appCompatImageView2, C35964oKf.Activity.ORxRYg, iTradeFallGraph$default);
        AppCompatTextView appCompatTextView = ooi.ejfBZ;
        xMR xmr = xMR.copydefault;
        appCompatTextView.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "21762.00", 0, 2, null));
        ooi.AhwBna.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20862.00", 0, 2, null));
        ooi.EZpvd.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "19962.00", 0, 2, null));
        ooi.DbNXlk.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "0.01", 0, 2, null));
        ooi.OLrzqt.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20912.00", 0, 2, null));
        ooi.AYXKKw.setLeftCornerRound(true);
        ooi.AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
        C39824pzd c39824pzd = ooi.DbNXlk;
        c39824pzd.setTextColor(iTradeRiseGraph$default);
        c39824pzd.setLeftCornerRound(false);
        c39824pzd.OLrzqt(iTradeRiseGraph$default);
        ooi.OLrzqt.setTextColor(iTradeRiseGraph$default);
        ooi.OLrzqt.AEQbTJ(iTradeRiseGraph$default);
        ooi.valueOf.setBackgroundColor(iTradeRiseGraph$default);
        ooi.djBIcL.setChecked(KWHzl().getMShowTradePosExtendedLine());
        OLrzqt(ooi, KWHzl().getMShowTradePosExtendedLine());
        for (java.lang.String str : yDY.gEmmrt(C33070mpX.AYXKKw(C35964oKf.Fragment.OrsvgJ), C33070mpX.AYXKKw(C35964oKf.Fragment.RFmUsE))) {
            C55249xgQ c55249xgQ = ooi.AkhnZx;
            c55249xgQ.addTab(c55249xgQ.newTab().setText(str));
        }
        TabLayout.Tab tabAt = ooi.AkhnZx.getTabAt(KWHzl().getMTradePosShowRight() ? 1 : 0);
        if (tabAt != null) {
            tabAt.select();
        }
        EZpvd(ooi, !KWHzl().getMTradePosShowRight());
        for (java.lang.String str2 : yDY.gEmmrt(C33070mpX.AYXKKw(C35964oKf.Fragment.gAnGwV), C33070mpX.AYXKKw(C35964oKf.Fragment.RLmrWm))) {
            C55249xgQ c55249xgQ2 = ooi.fetchVPNInfo;
            c55249xgQ2.addTab(c55249xgQ2.newTab().setText(str2));
        }
        TabLayout.Tab tabAt2 = ooi.fetchVPNInfo.getTabAt(1 ^ (KWHzl().getMTradePosShowPnl() ? 1 : 0));
        if (tabAt2 != null) {
            tabAt2.select();
        }
        KWHzl(ooi, KWHzl().getMTradePosShowPnl());
    }

    public final void AEQbTJ(final oOI ooi) {
        ooi.djBIcL.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.oSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                oSD.copydefault(this.EZpvd, ooi, compoundButton, z);
            }
        });
        ooi.fetchVPNInfo.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar(ooi));
        ooi.AkhnZx.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator(ooi));
    }

    public static final void copydefault(oSD osd, oOI ooi, android.widget.CompoundButton compoundButton, boolean z) {
        SPUtils.put("kline_trade_position_extended_line", java.lang.Boolean.valueOf(z));
        osd.KWHzl().setMShowTradePosExtendedLine(z);
        osd.OLrzqt(ooi, z);
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ oOI copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar(oOI ooi) {
            this.copydefault = ooi;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            boolean z = tab.getPosition() == 0;
            oSD.this.KWHzl().setMTradePosShowPnl(z);
            SPUtils.put("kline_trade_position_show_pnl", java.lang.Boolean.valueOf(z));
            oSD osd = oSD.this;
            osd.KWHzl(this.copydefault, osd.KWHzl().getMTradePosShowPnl());
        }
    }

    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ oOI AEQbTJ;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(oOI ooi) {
            this.AEQbTJ = ooi;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            boolean z = tab.getPosition() == 1;
            oSD.this.KWHzl().setMTradePosShowRight(z);
            SPUtils.put("kline_trade_position_show_right", java.lang.Boolean.valueOf(z));
            oSD osd = oSD.this;
            osd.EZpvd(this.AEQbTJ, true ^ osd.KWHzl().getMTradePosShowRight());
        }
    }

    public final void OLrzqt(oOI ooi, boolean z) {
        int id = z ? 0 : ooi.AYXKKw.getId();
        ConstraintSet constraintSet = new ConstraintSet();
        C54946xaf binding = getBinding();
        constraintSet.clone(binding != null ? binding.AEQbTJ : null);
        constraintSet.connect(ooi.valueOf.getId(), 6, id, 6);
        C54946xaf binding2 = getBinding();
        constraintSet.applyTo(binding2 != null ? binding2.AEQbTJ : null);
    }

    public final void KWHzl(oOI ooi, boolean z) {
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
        ooi.AYXKKw.setText(strAYXKKw + " " + percentWithSymbol$default);
    }

    public final void EZpvd(oOI ooi, boolean z) {
        int i = z ? 7 : 6;
        int id = z ? 0 : ooi.OLrzqt.getId();
        int i2 = z ? 6 : 7;
        int iDpInt$default = C55298xhM.dpInt$default(z ? 24 : 48, (android.content.Context) null, 1, (java.lang.Object) null);
        ConstraintSet constraintSet = new ConstraintSet();
        C54946xaf binding = getBinding();
        constraintSet.clone(binding != null ? binding.AEQbTJ : null);
        constraintSet.clear(ooi.AYXKKw.getId(), i);
        constraintSet.connect(ooi.AYXKKw.getId(), i2, id, 6, iDpInt$default);
        C54946xaf binding2 = getBinding();
        constraintSet.applyTo(binding2 != null ? binding2.AEQbTJ : null);
    }
}
