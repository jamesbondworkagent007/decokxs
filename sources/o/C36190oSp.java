package o;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.tabs.TabLayout;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oSp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36190oSp extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public oOT EZpvd;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.oSx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36190oSp.KWHzl();
        }
    });

    /* JADX INFO: renamed from: o.oSp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oSp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartViewOutSideConfig EZpvd() {
        return (ChartViewOutSideConfig) this.copydefault.getValue();
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
        wxq.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.gSBher));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = oOT.KWHzl(getCustomLayoutInflater(), constraintLayout);
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
        oOT oot = this.EZpvd;
        if (oot != null) {
            KWHzl(oot);
            AEQbTJ(oot);
        }
        C36234oUf.EZpvd.EZpvd("bottom_settings_tutorial", "y_axis");
    }

    public final void KWHzl(oOT oot) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        pFZ pfz = pFZ.KWHzl;
        AppCompatImageView appCompatImageView = oot.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        pfz.OLrzqt(appCompatImageView, C35964oKf.Activity.QKVWgx, iTradeRiseGraph$default);
        AppCompatImageView appCompatImageView2 = oot.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        pfz.OLrzqt(appCompatImageView2, C35964oKf.Activity.ORxRYg, iTradeFallGraph$default);
        java.lang.Integer num = SPUtils.getInt("chart_coordinate_model", 0);
        int i = 1;
        KWHzl(oot, num != null && num.intValue() == 0);
        oot.AhwBna.setText(xMR.formatLocalizedWithMinPrecision$default(xMR.copydefault, "20862.70", 0, 2, null));
        oot.AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        oot.AhwBna.AEQbTJ(C33070mpX.copydefault(C52761wXj.Activity.QVAiDq));
        oot.AEQbTJ.OLrzqt(C33070mpX.copydefault(C52761wXj.Activity.QVAiDq));
        for (java.lang.String str : yDY.gEmmrt(C33070mpX.AYXKKw(C35964oKf.Fragment.hfFNez), C33070mpX.AYXKKw(C35964oKf.Fragment.sJPPOI))) {
            C55249xgQ c55249xgQ = oot.values;
            c55249xgQ.addTab(c55249xgQ.newTab().setText(str));
        }
        C55249xgQ c55249xgQ2 = oot.values;
        if (num != null && num.intValue() == 0) {
            i = 0;
        }
        TabLayout.Tab tabAt = c55249xgQ2.getTabAt(i);
        if (tabAt != null) {
            tabAt.select();
        }
        oot.fetchVPNInfo.setChecked(EZpvd().getMShowAxis());
        Group group = oot.djBIcL;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(EZpvd().getMShowAxis() ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.oSp$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ oOT OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity(oOT oot) {
            this.OLrzqt = oot;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            boolean z = tab.getPosition() == 0;
            SPUtils.put("chart_coordinate_model", java.lang.Integer.valueOf(tab.getPosition()));
            C36190oSp.this.EZpvd().setMOrdinateType(tab.getPosition());
            C36190oSp.this.KWHzl(this.OLrzqt, z);
            C36234oUf.EZpvd.EZpvd("y_axis_tutorial", z ? "y_axis_type_number" : "y_axis_type_percentage");
        }
    }

    public final void AEQbTJ(final oOT oot) {
        oot.values.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity(oot));
        oot.fetchVPNInfo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.oSs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C36190oSp.copydefault(oot, compoundButton, z);
            }
        });
    }

    public static final void copydefault(oOT oot, android.widget.CompoundButton compoundButton, boolean z) {
        C36246oUr.copydefault().zLjUOn(z);
        Group group = oot.djBIcL;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ? 0 : 8);
        C36234oUf.EZpvd.EZpvd("y_axis_tutorial", "show_y_axis");
    }

    public final void KWHzl(oOT oot, boolean z) {
        if (z) {
            AppCompatTextView appCompatTextView = oot.AkhnZx;
            xMR xmr = xMR.copydefault;
            appCompatTextView.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "21762.00", 0, 2, null));
            oot.gEmmrt.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20862.00", 0, 2, null));
            oot.OLrzqt.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "19962.00", 0, 2, null));
            return;
        }
        AppCompatTextView appCompatTextView2 = oot.AkhnZx;
        xMR xmr2 = xMR.copydefault;
        appCompatTextView2.setText(xMR.formatPercent$default(xmr2, "0.05", 0, null, 6, null));
        oot.gEmmrt.setText(xMR.formatPercent$default(xmr2, "0.1", 0, null, 6, null));
        oot.OLrzqt.setText(xMR.formatPercent$default(xmr2, "0.15", 0, null, 6, null));
    }
}
