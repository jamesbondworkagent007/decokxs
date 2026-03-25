package o;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oSm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36187oSm extends wXX {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.oSk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36187oSm.AEQbTJ();
        }
    });
    public oOH OLrzqt;
    public boolean copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.oSm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oSm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C36187oSm newInstance$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return actionBar.OLrzqt(z);
        }

        public final C36187oSm OLrzqt(boolean z) {
            C36187oSm c36187oSm = new C36187oSm();
            c36187oSm.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("is_landscape", java.lang.Boolean.valueOf(z))));
            return c36187oSm;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChartViewOutSideConfig AEQbTJ() {
        return C36246oUr.copydefault().zLjUOn();
    }

    private final ChartViewOutSideConfig copydefault() {
        return (ChartViewOutSideConfig) this.EZpvd.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.RXdAnZ));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = oOH.copydefault(getCustomLayoutInflater(), constraintLayout);
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
        android.os.Bundle arguments = getArguments();
        this.copydefault = arguments != null ? arguments.getBoolean("is_landscape") : false;
        oOH ooh = this.OLrzqt;
        if (ooh != null) {
            OLrzqt(ooh);
            KWHzl(ooh);
        }
        C36234oUf.EZpvd.EZpvd("bottom_settings_tutorial", "economic_event");
    }

    public final void OLrzqt(oOH ooh) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iTradeRiseGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        int iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null);
        pFZ pfz = pFZ.KWHzl;
        AppCompatImageView appCompatImageView = ooh.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        pfz.OLrzqt(appCompatImageView, C35964oKf.Activity.QKVWgx, iTradeRiseGraph$default);
        AppCompatImageView appCompatImageView2 = ooh.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        pfz.OLrzqt(appCompatImageView2, C35964oKf.Activity.ORxRYg, iTradeFallGraph$default);
        AppCompatTextView appCompatTextView = ooh.AuCTel;
        xMR xmr = xMR.copydefault;
        appCompatTextView.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "21762.00", 0, 2, null));
        ooh.fetchVPNInfo.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "20862.00", 0, 2, null));
        ooh.AEQbTJ.setText(xMR.formatLocalizedWithMinPrecision$default(xmr, "19962.00", 0, 2, null));
        AEQbTJ(ooh);
        C36236oUh c36236oUh = C36236oUh.EZpvd;
        boolean zIwGUEr = c36236oUh.iwGUEr();
        ooh.isConnected.setChecked(zIwGUEr);
        Group group = ooh.djBIcL;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(zIwGUEr ^ true ? 4 : 0);
        boolean fieldNames = c36236oUh.getFieldNames();
        ooh.values.setChecked(fieldNames);
        Group group2 = ooh.KWHzl;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(fieldNames ^ true ? 4 : 0);
    }

    public final void AEQbTJ(oOH ooh) {
        ooh.OLrzqt.setHighlightColor(0);
        ooh.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.sYcwUD);
        final java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.DGgkXd);
        ooh.OLrzqt.setText(C33061mpO.setupSpanStyles$default(strAYXKKw + " " + strAYXKKw2, new java.lang.String[]{strAYXKKw2}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.oSt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36187oSm.OLrzqt(strAYXKKw2, this, (java.util.List) obj);
            }
        }, 10, null));
    }

    /* JADX INFO: renamed from: o.oSm$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ C36187oSm AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;

        public Activity(java.lang.String str, C36187oSm c36187oSm) {
            this.KWHzl = str;
            this.AEQbTJ = c36187oSm;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.prj.addPrimaryButton$default(o.prj, java.lang.CharSequence, android.view.View$OnClickListener, int, java.lang.Object):o.prj */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ViewOnClickListenerC39407prj viewOnClickListenerC39407prj = new ViewOnClickListenerC39407prj(context);
            java.lang.String str = this.KWHzl;
            C36187oSm c36187oSm = this.AEQbTJ;
            viewOnClickListenerC39407prj.setTitle(str);
            viewOnClickListenerC39407prj.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.OFqMGB));
            ViewOnClickListenerC39407prj.addPrimaryButton$default(viewOnClickListenerC39407prj, C33070mpX.AYXKKw(C35964oKf.Fragment.sSMYrx), null, 2, null);
            if (c36187oSm.copydefault) {
                viewOnClickListenerC39407prj.AEQbTJ(2);
            }
            viewOnClickListenerC39407prj.setCanceledOnTouchOutside(true);
            viewOnClickListenerC39407prj.show();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public static final Unit OLrzqt(java.lang.String str, C36187oSm c36187oSm, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)));
        list.add(new Activity(str, c36187oSm));
        return Unit.INSTANCE;
    }

    public final void KWHzl(final oOH ooh) {
        ooh.isConnected.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.oSl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C36187oSm.KWHzl(this.copydefault, ooh, compoundButton, z);
            }
        });
        ooh.values.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.oSq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C36187oSm.EZpvd(this.EZpvd, ooh, compoundButton, z);
            }
        });
    }

    public static final void KWHzl(C36187oSm c36187oSm, oOH ooh, android.widget.CompoundButton compoundButton, boolean z) {
        C36236oUh.EZpvd.copydefault(z);
        c36187oSm.copydefault().setShowUpcomingEvents(z);
        Group group = ooh.djBIcL;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ^ true ? 4 : 0);
        C36234oUf.EZpvd.EZpvd("economic_calendar_tutorial", "future_event");
    }

    public static final void EZpvd(C36187oSm c36187oSm, oOH ooh, android.widget.CompoundButton compoundButton, boolean z) {
        C36236oUh.EZpvd.OLrzqt(z);
        c36187oSm.copydefault().setShowPastEvents(z);
        Group group = ooh.KWHzl;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ^ true ? 4 : 0);
        C36234oUf.EZpvd.EZpvd("economic_calendar_tutorial", "past_event");
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C36236oUh c36236oUh = C36236oUh.EZpvd;
        if (c36236oUh.hDKMBd()) {
            FragmentKt.setFragmentResult(this, "re_open_eco_calendar", BundleKt.bundleOf());
        }
        C36246oUr.copydefault().zLjUOn().setEconomicDefaultStatus(c36236oUh.iwGUEr());
    }
}
