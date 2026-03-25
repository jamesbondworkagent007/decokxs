package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.market.features.holders.domain.model.BubbleMap;
import com.okinc.business.market.features.holders.domain.model.HoldersFragmentParams;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC26302jZk;
import o.jYL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jZi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26300jZi extends kLF {
    public final C21550hDn AEQbTJ;
    public final BubbleMap KWHzl;
    public final HoldersFragmentParams OLrzqt;
    public final InterfaceC26302jZk copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt() {
        return "--";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C26300jZi(@NotNull C21550hDn c21550hDn, @NotNull HoldersFragmentParams holdersFragmentParams, BubbleMap bubbleMap, @NotNull InterfaceC26302jZk interfaceC26302jZk) {
        Intrinsics.checkNotNullParameter(c21550hDn, "");
        Intrinsics.checkNotNullParameter(holdersFragmentParams, "");
        Intrinsics.checkNotNullParameter(interfaceC26302jZk, "");
        ConstraintLayout root = c21550hDn.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        super(root);
        this.AEQbTJ = c21550hDn;
        this.OLrzqt = holdersFragmentParams;
        this.KWHzl = bubbleMap;
        this.copydefault = interfaceC26302jZk;
    }

    @Override // o.kLF
    public void AEQbTJ() {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        final C21550hDn c21550hDn = this.AEQbTJ;
        c21550hDn.iwGUEr.setText(C33069mpW.copydefault(C23274hvD.Fragment.onCreate, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, "$10"))));
        c21550hDn.fARcdN.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.ComponentActivityExternalSyntheticLambda2));
        C55258xgZ c55258xgZ = c21550hDn.fARcdN;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
        boolean zAhwBna = this.OLrzqt.AhwBna();
        ConstraintLayout constraintLayout = c21550hDn.djBIcL;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(zAhwBna ? 0 : 8);
        ConstraintLayout constraintLayout2 = c21550hDn.djBIcL;
        constraintLayout2.setOnClickListener(new ActionBar(constraintLayout2, 1000L, this));
        ConstraintLayout constraintLayout3 = c21550hDn.isConnected;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(zAhwBna ? 0 : 8);
        ConstraintLayout constraintLayout4 = c21550hDn.isConnected;
        constraintLayout4.setOnClickListener(new Application(constraintLayout4, 1000L, this));
        android.widget.TextView textView = c21550hDn.zLjUOn;
        if (zAhwBna) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.addOnContextAvailableListener);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.registerForActivityResult);
        }
        textView.setText(strAYXKKw);
        android.widget.TextView textView2 = c21550hDn.getFieldNames;
        if (zAhwBna) {
            strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.ensureViewModelStore);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.requestPostMessageChannelWithExtras);
        }
        textView2.setText(strAYXKKw2);
        C55052xcf c55052xcf = c21550hDn.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55052xcf, "");
        c55052xcf.setVisibility(this.OLrzqt.AhwBna() ? 0 : 8);
        C55052xcf c55052xcf2 = c21550hDn.OLrzqt;
        c55052xcf2.setOnClickListener(new StateListAnimator(c55052xcf2, 1000L, c21550hDn, this));
        wYC wyc = c21550hDn.copydefault;
        wyc.setOnClickListener(new TaskDescription(wyc, 1000L, this));
        SwitchCompat switchCompat = c21550hDn.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(switchCompat, "");
        switchCompat.setVisibility(this.OLrzqt.AhwBna() ? 0 : 8);
        c21550hDn.DbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.jZp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26300jZi.copydefault(c21550hDn, this, view);
            }
        });
        BubbleMap bubbleMap = this.KWHzl;
        if (bubbleMap != null) {
            final java.lang.String strOLrzqt = bubbleMap.OLrzqt();
            java.lang.String strAEQbTJ = bubbleMap.AEQbTJ(C7911ask.AEQbTJ(c21550hDn.getRoot().getContext()));
            if (strOLrzqt.length() > 0) {
                android.widget.ImageView imageView = c21550hDn.gEmmrt;
                imageView.setVisibility(0);
                Intrinsics.copydefault(imageView);
                C25386ivj.EZpvd(imageView, strAEQbTJ);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: o.jZo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C26300jZi.OLrzqt(this.EZpvd, strOLrzqt, view);
                    }
                });
                return;
            }
            c21550hDn.gEmmrt.setVisibility(8);
        }
    }

    public static final void copydefault(C21550hDn c21550hDn, C26300jZi c26300jZi, android.view.View view) {
        boolean zIsChecked = c21550hDn.DbNXlk.isChecked();
        if (zIsChecked) {
            java.lang.String strCopydefault = c26300jZi.OLrzqt.copydefault();
            SwitchCompat switchCompat = c21550hDn.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(switchCompat, "");
            C28068kNs.AEQbTJ(switchCompat, strCopydefault);
        } else {
            c21550hDn.DbNXlk.setThumbDrawable(C33070mpX.KWHzl(C57406yhn.Activity.DTwDnp));
        }
        c26300jZi.copydefault.AEQbTJ(new InterfaceC26302jZk.Activity.C0864Activity(zIsChecked));
    }

    public static final void OLrzqt(C26300jZi c26300jZi, java.lang.String str, android.view.View view) {
        c26300jZi.copydefault.AEQbTJ(new InterfaceC26302jZk.Activity.StateListAnimator(str));
    }

    public final void copydefault(@NotNull jYL.Activity activity) {
        android.graphics.drawable.Drawable drawableKWHzl;
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity.OLrzqt() == null) {
            this.AEQbTJ.KWHzl.setVisibility(8);
            return;
        }
        final C21550hDn c21550hDn = this.AEQbTJ;
        c21550hDn.KWHzl.setVisibility(0);
        c21550hDn.OLrzqt.setSelected(false);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) activity.AEQbTJ())) {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.GVpNrs);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dPnHjp);
        }
        c21550hDn.copydefault.setImageDrawable(drawableKWHzl);
        c21550hDn.OLrzqt.setTitle(C31256lqb.KWHzl(activity.KWHzl().OLrzqt(), (Function0<java.lang.String>) new Function0() { // from class: o.jZh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26300jZi.copydefault(c21550hDn);
            }
        }));
        android.widget.LinearLayout linearLayout = c21550hDn.valueOf;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(activity.EZpvd() ? 0 : 8);
        c21550hDn.AubY.setText(C25392ivp.copydefault(java.lang.Float.valueOf(activity.OLrzqt().djBIcL())));
        android.widget.TextView textView = c21550hDn.getNewProxyInstance;
        java.lang.String strOLrzqt = activity.OLrzqt().OLrzqt();
        textView.setText(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt) ? C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, strOLrzqt, null, 1, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.jZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26300jZi.OLrzqt();
            }
        }));
        AppCompatTextView appCompatTextView = c21550hDn.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        kLY.formatPercentage$default(appCompatTextView, activity.OLrzqt().EZpvd(), null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
        AppCompatTextView appCompatTextView2 = c21550hDn.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        C31258lqd.setTextColorOrDisabledColor$default(appCompatTextView2, C52761wXj.Activity.DCUTEIddSDPG, 0, 2, null);
        AppCompatTextView appCompatTextView3 = c21550hDn.ejfBZ;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String strKWHzl = activity.OLrzqt().KWHzl();
        RoundingMode roundingMode = RoundingMode.DOWN;
        appCompatTextView3.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strKWHzl, true, roundingMode, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
        AppCompatTextView appCompatTextView4 = c21550hDn.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
        java.lang.String strCopydefault = activity.OLrzqt().copydefault();
        DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
        kLY.formatPercentage$default(appCompatTextView4, strCopydefault, displaySign, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 16, null);
        c21550hDn.AuCTel.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, activity.OLrzqt().AYXKKw(), true, roundingMode, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
        AppCompatTextView appCompatTextView5 = c21550hDn.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
        kLY.formatPercentage$default(appCompatTextView5, activity.OLrzqt().AEQbTJ(), displaySign, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 16, null);
    }

    public static final java.lang.String copydefault(C21550hDn c21550hDn) {
        return C33070mpX.OLrzqt(C23274hvD.Fragment.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A, c21550hDn.OLrzqt.getContext());
    }

    public final void KWHzl(boolean z) {
        C21550hDn c21550hDn = this.AEQbTJ;
        if (this.OLrzqt.AhwBna()) {
            c21550hDn.DbNXlk.setChecked(z);
            if (z) {
                java.lang.String strCopydefault = this.OLrzqt.copydefault();
                SwitchCompat switchCompat = c21550hDn.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(switchCompat, "");
                C28068kNs.AEQbTJ(switchCompat, strCopydefault);
                return;
            }
            c21550hDn.DbNXlk.setThumbDrawable(C33070mpX.KWHzl(C57406yhn.Activity.DTwDnp));
        }
    }

    /* JADX INFO: renamed from: o.jZi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C26300jZi EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C26300jZi c26300jZi) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c26300jZi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault.AEQbTJ(InterfaceC26302jZk.Activity.TaskDescription.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.jZi$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C26300jZi EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C26300jZi c26300jZi) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c26300jZi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault.AEQbTJ(InterfaceC26302jZk.Activity.ActionBar.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.jZi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C26300jZi EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26300jZi c26300jZi) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c26300jZi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.copydefault.AEQbTJ(InterfaceC26302jZk.Activity.Dialog.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.jZi$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C21550hDn AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C26300jZi KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C21550hDn c21550hDn, C26300jZi c26300jZi) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c21550hDn;
            this.KWHzl = c26300jZi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt.setSelected(true);
                this.KWHzl.copydefault.AEQbTJ(InterfaceC26302jZk.Activity.PendingIntent.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.jZi$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C26300jZi KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C26300jZi c26300jZi) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c26300jZi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.copydefault.AEQbTJ(InterfaceC26302jZk.Activity.Application.KWHzl);
            }
        }
    }
}
