package o;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.material.tabs.TabLayout;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oSH extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.oSG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oSH.KWHzl();
        }
    });
    public oON KWHzl;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oSH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartViewOutSideConfig EZpvd() {
        return (ChartViewOutSideConfig) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChartViewOutSideConfig KWHzl() {
        return C36246oUr.copydefault().zLjUOn();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.DGUQLI));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = oON.copydefault(getCustomLayoutInflater(), constraintLayout);
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
        oON oon = this.KWHzl;
        if (oon != null) {
            KWHzl(oon);
            copydefault(oon);
        }
        C36234oUf.EZpvd.EZpvd("bottom_settings_tutorial", "open_order");
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
    public final void KWHzl(oON oon) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        pFZ pfz = pFZ.KWHzl;
        AppCompatImageView appCompatImageView = oon.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        pfz.OLrzqt(appCompatImageView, C35964oKf.Activity.QKVWgx, iTradeRiseGraph$default);
        AppCompatImageView appCompatImageView2 = oon.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        pfz.OLrzqt(appCompatImageView2, C35964oKf.Activity.ORxRYg, iTradeFallGraph$default);
        AppCompatTextView appCompatTextView = oon.AkhnZx;
        xMR xmr = xMR.copydefault;
        appCompatTextView.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "21762.00", 0, 2, null));
        oon.valueOf.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20862.00", 0, 2, null));
        oon.KWHzl.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "19962.00", 0, 2, null));
        oon.gEmmrt.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "0.01", 0, 2, null));
        oon.djBIcL.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20187.56", 0, 2, null));
        C39824pzd c39824pzd = oon.AYXKKw;
        c39824pzd.setLeftCornerRound(true);
        c39824pzd.setTextColor(iTradeRiseGraph$default);
        c39824pzd.OLrzqt(iTradeRiseGraph$default);
        C39824pzd c39824pzd2 = oon.gEmmrt;
        c39824pzd2.setLeftCornerRound(false);
        c39824pzd2.setTextColor(iTradeRiseGraph$default);
        c39824pzd2.OLrzqt(iTradeRiseGraph$default);
        pAJ paj = oon.djBIcL;
        paj.setTextColor(iTradeRiseGraph$default);
        paj.AEQbTJ(iTradeRiseGraph$default);
        oon.copydefault.OLrzqt(iTradeRiseGraph$default);
        oon.AEQbTJ.setChecked(EZpvd().getMShowOpenOrderExtendedLine());
        AEQbTJ(oon, EZpvd().getMShowOpenOrderExtendedLine());
        for (java.lang.String str : yDY.gEmmrt(C33070mpX.AYXKKw(C35964oKf.Fragment.OrsvgJ), C33070mpX.AYXKKw(C35964oKf.Fragment.RFmUsE))) {
            C55249xgQ c55249xgQ = oon.DbNXlk;
            c55249xgQ.addTab(c55249xgQ.newTab().setText(str));
        }
        TabLayout.Tab tabAt = oon.DbNXlk.getTabAt(EZpvd().getMOpenOrderShowRight() ? 1 : 0);
        if (tabAt != null) {
            tabAt.select();
        }
        OLrzqt(oon, !EZpvd().getMOpenOrderShowRight());
        if (C36246oUr.copydefault().DLWbHP()) {
            oon.values.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.RqmePg));
        }
    }

    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ oON EZpvd;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity(oON oon) {
            this.EZpvd = oon;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            boolean z = tab.getPosition() == 1;
            oSH.this.EZpvd().setMOpenOrderShowRight(z);
            SPUtils.put("kline_open_order_show_right", java.lang.Boolean.valueOf(z));
            oSH osh = oSH.this;
            osh.OLrzqt(this.EZpvd, true ^ osh.EZpvd().getMOpenOrderShowRight());
            C36234oUf.EZpvd.EZpvd("open_orders_tutorial", z ? "position_right" : "position_left");
        }
    }

    public final void copydefault(final oON oon) {
        oon.DbNXlk.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity(oon));
        oon.AEQbTJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.oSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                oSH.AEQbTJ(this.EZpvd, oon, compoundButton, z);
            }
        });
    }

    public static final void AEQbTJ(oSH osh, oON oon, android.widget.CompoundButton compoundButton, boolean z) {
        SPUtils.put("kline_open_order_extended_line", java.lang.Boolean.valueOf(z));
        osh.EZpvd().setMShowOpenOrderExtendedLine(z);
        osh.AEQbTJ(oon, z);
        C36234oUf.EZpvd.EZpvd("open_orders_tutorial", "extended_price_line");
    }

    public final void AEQbTJ(oON oon, boolean z) {
        int id = z ? 0 : oon.AYXKKw.getId();
        ConstraintSet constraintSet = new ConstraintSet();
        C54946xaf binding = getBinding();
        constraintSet.clone(binding != null ? binding.AEQbTJ : null);
        constraintSet.connect(oon.copydefault.getId(), 6, id, 6);
        C54946xaf binding2 = getBinding();
        constraintSet.applyTo(binding2 != null ? binding2.AEQbTJ : null);
    }

    public final void OLrzqt(oON oon, boolean z) {
        int i = z ? 7 : 6;
        int id = z ? 0 : oon.djBIcL.getId();
        int i2 = z ? 6 : 7;
        int iDpInt$default = C55298xhM.dpInt$default(z ? 24 : 48, (android.content.Context) null, 1, (java.lang.Object) null);
        ConstraintSet constraintSet = new ConstraintSet();
        C54946xaf binding = getBinding();
        constraintSet.clone(binding != null ? binding.AEQbTJ : null);
        constraintSet.clear(oon.AYXKKw.getId(), i);
        constraintSet.connect(oon.AYXKKw.getId(), i2, id, 6, iDpInt$default);
        C54946xaf binding2 = getBinding();
        constraintSet.applyTo(binding2 != null ? binding2.AEQbTJ : null);
    }
}
