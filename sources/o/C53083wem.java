package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wem, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53083wem extends AbstractC54505xKx<uPI, EmptyPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final int OLrzqt = C48033uCm.Activity.hCLrkq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.wem$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wem.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53083wem OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C53083wem c53083wem = new C53083wem();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("explain_type", str);
            c53083wem.setArguments(bundle);
            return c53083wem;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        android.view.View viewInflate = null;
        java.lang.String string = arguments != null ? arguments.getString("explain_type") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -237122707) {
                if (iHashCode != 335530068) {
                    if (iHashCode == 1851562366 && string.equals("start_condition")) {
                        viewInflate = android.view.LayoutInflater.from(requireContext()).inflate(C48033uCm.Activity.gVEiQJ, (android.view.ViewGroup) null);
                        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.QSAYLr);
                        if (textView != null) {
                            textView.setText(C33070mpX.AYXKKw(C55688xof.Application.setupTitle));
                        }
                    }
                } else if (string.equals("order_limit_price")) {
                    viewInflate = android.view.LayoutInflater.from(requireContext()).inflate(C48033uCm.Activity.gVEiQJ, (android.view.ViewGroup) null);
                    android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.QSAYLr);
                    if (textView2 != null) {
                        textView2.setText(C33070mpX.AYXKKw(C55688xof.Application.setupContent));
                    }
                }
            } else if (string.equals("order_favorite")) {
                viewInflate = android.view.LayoutInflater.from(requireContext()).inflate(C48033uCm.Activity.FhERFw, (android.view.ViewGroup) null);
                Intrinsics.copydefault(viewInflate);
                copydefault(viewInflate);
            }
        }
        if (viewInflate != null) {
            gGvvIC().copydefault.addView(viewInflate);
        }
    }

    /* JADX INFO: renamed from: o.wem$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ AbstractC48595uXf AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, AbstractC48595uXf abstractC48595uXf) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = abstractC48595uXf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.OLrzqt;
                AppCompatTextView appCompatTextView = this.AEQbTJ.djBIcL;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                boolean z = appCompatTextView.getVisibility() == 0;
                appCompatImageView.setSelected(z);
                AppCompatTextView appCompatTextView2 = this.AEQbTJ.djBIcL;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                boolean z2 = !z;
                appCompatTextView2.setVisibility(z2 ? 0 : 8);
                android.view.View root = this.AEQbTJ.gEmmrt.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                root.setVisibility(z2 ? 0 : 8);
            }
        }
    }

    /* JADX INFO: renamed from: o.wem$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ AbstractC48595uXf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, AbstractC48595uXf abstractC48595uXf) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = abstractC48595uXf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.OLrzqt;
                AppCompatTextView appCompatTextView = this.copydefault.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                boolean z = appCompatTextView.getVisibility() == 0;
                appCompatImageView.setSelected(z);
                AppCompatTextView appCompatTextView2 = this.copydefault.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                boolean z2 = !z;
                appCompatTextView2.setVisibility(z2 ? 0 : 8);
                android.view.View root = this.copydefault.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                root.setVisibility(z2 ? 0 : 8);
            }
        }
    }

    /* JADX INFO: renamed from: o.wem$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ AbstractC48595uXf EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, AbstractC48595uXf abstractC48595uXf) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = abstractC48595uXf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.OLrzqt;
                AppCompatTextView appCompatTextView = this.EZpvd.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                boolean z = appCompatTextView.getVisibility() == 0;
                appCompatImageView.setSelected(z);
                AppCompatTextView appCompatTextView2 = this.EZpvd.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                boolean z2 = !z;
                appCompatTextView2.setVisibility(z2 ? 0 : 8);
                android.view.View root = this.EZpvd.AYXKKw.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                root.setVisibility(z2 ? 0 : 8);
            }
        }
    }

    public final void copydefault(android.view.View view) {
        AbstractC48530uUv abstractC48530uUv;
        AbstractC48533uUy abstractC48533uUy;
        uUE uue;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        AppCompatImageView appCompatImageView5;
        AppCompatImageView appCompatImageView6;
        AbstractC48595uXf abstractC48595uXf = (AbstractC48595uXf) DataBindingUtil.bind(view);
        if (abstractC48595uXf != null && (appCompatImageView6 = abstractC48595uXf.valueOf) != null) {
            appCompatImageView6.setSelected(false);
        }
        if (abstractC48595uXf != null && (appCompatImageView5 = abstractC48595uXf.valueOf) != null) {
            appCompatImageView5.setOnClickListener(new StateListAnimator(appCompatImageView5, 1000L, abstractC48595uXf));
        }
        if (abstractC48595uXf != null && (appCompatImageView4 = abstractC48595uXf.copydefault) != null) {
            appCompatImageView4.setSelected(false);
        }
        if (abstractC48595uXf != null && (appCompatImageView3 = abstractC48595uXf.copydefault) != null) {
            appCompatImageView3.setOnClickListener(new ActionBar(appCompatImageView3, 1000L, abstractC48595uXf));
        }
        if (abstractC48595uXf != null && (appCompatImageView2 = abstractC48595uXf.EZpvd) != null) {
            appCompatImageView2.setSelected(false);
        }
        if (abstractC48595uXf != null && (appCompatImageView = abstractC48595uXf.EZpvd) != null) {
            appCompatImageView.setOnClickListener(new Activity(appCompatImageView, 1000L, abstractC48595uXf));
        }
        if (abstractC48595uXf != null && (uue = abstractC48595uXf.AYXKKw) != null) {
            android.widget.TextView textView = uue.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            android.widget.TextView textView2 = uue.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            EZpvd(textView, textView2);
            android.widget.TextView textView3 = uue.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            android.content.Context context = uue.valueOf.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            AEQbTJ(textView3, "20000.1", C33508mxl.AEQbTJ(context));
            android.widget.TextView textView4 = uue.values;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            android.content.Context context2 = uue.values.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            AEQbTJ(textView4, "20000", C33508mxl.AEQbTJ(context2));
            android.widget.TextView textView5 = uue.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            android.content.Context context3 = uue.AkhnZx.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            AEQbTJ(textView5, "19999.9", C33508mxl.copydefault(context3));
            android.widget.TextView textView6 = uue.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            android.content.Context context4 = uue.fetchVPNInfo.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            AEQbTJ(textView6, "19999.8", C33508mxl.copydefault(context4));
            android.widget.TextView textView7 = uue.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            android.content.Context context5 = uue.AhwBna.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            copydefault(textView7, "2.9", C33508mxl.KWHzl(context5, 0.1f));
            android.widget.TextView textView8 = uue.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            android.content.Context context6 = uue.AYXKKw.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            copydefault(textView8, "2.6", C33508mxl.OLrzqt(context6, 0.1f));
            android.widget.TextView textView9 = uue.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            android.content.Context context7 = uue.gEmmrt.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            copydefault(textView9, "1.5", C33508mxl.OLrzqt(context7, 0.1f));
            android.widget.TextView textView10 = uue.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView10, "");
            copydefault(textView10);
            android.widget.TextView textView11 = uue.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView11, "");
            copydefault(textView11);
            android.widget.TextView textView12 = uue.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView12, "");
            copydefault(textView12);
            android.widget.TextView textView13 = uue.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView13, "");
            copydefault(textView13);
        }
        if (abstractC48595uXf != null && (abstractC48533uUy = abstractC48595uXf.gEmmrt) != null) {
            android.widget.TextView textView14 = abstractC48533uUy.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView14, "");
            android.widget.TextView textView15 = abstractC48533uUy.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView15, "");
            EZpvd(textView14, textView15);
            android.widget.TextView textView16 = abstractC48533uUy.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView16, "");
            android.content.Context context8 = abstractC48533uUy.valueOf.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            AEQbTJ(textView16, "20000.1", C33508mxl.AEQbTJ(context8));
            android.widget.TextView textView17 = abstractC48533uUy.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView17, "");
            android.content.Context context9 = abstractC48533uUy.gEmmrt.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            AEQbTJ(textView17, "20000", C33508mxl.AEQbTJ(context9));
            android.widget.TextView textView18 = abstractC48533uUy.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView18, "");
            android.content.Context context10 = abstractC48533uUy.isConnected.getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            AEQbTJ(textView18, "19999.9", C33508mxl.copydefault(context10));
            android.widget.TextView textView19 = abstractC48533uUy.values;
            Intrinsics.checkNotNullExpressionValue(textView19, "");
            android.content.Context context11 = abstractC48533uUy.values.getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            AEQbTJ(textView19, "19999.8", C33508mxl.copydefault(context11));
            android.widget.TextView textView20 = abstractC48533uUy.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView20, "");
            android.content.Context context12 = abstractC48533uUy.AYXKKw.getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "");
            copydefault(textView20, "2.9", C33508mxl.KWHzl(context12, 0.1f));
            android.widget.TextView textView21 = abstractC48533uUy.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView21, "");
            android.content.Context context13 = abstractC48533uUy.djBIcL.getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "");
            copydefault(textView21, "2.6", C33508mxl.OLrzqt(context13, 0.1f));
            android.widget.TextView textView22 = abstractC48533uUy.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView22, "");
            android.content.Context context14 = abstractC48533uUy.AhwBna.getContext();
            Intrinsics.checkNotNullExpressionValue(context14, "");
            copydefault(textView22, "1.5", C33508mxl.OLrzqt(context14, 0.1f));
            android.widget.TextView textView23 = abstractC48533uUy.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView23, "");
            copydefault(textView23);
            android.widget.TextView textView24 = abstractC48533uUy.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView24, "");
            copydefault(textView24);
            android.widget.TextView textView25 = abstractC48533uUy.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView25, "");
            copydefault(textView25);
        }
        if (abstractC48595uXf == null || (abstractC48530uUv = abstractC48595uXf.AEQbTJ) == null) {
            return;
        }
        android.widget.TextView textView26 = abstractC48530uUv.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView26, "");
        android.widget.TextView textView27 = abstractC48530uUv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView27, "");
        EZpvd(textView26, textView27);
        android.widget.TextView textView28 = abstractC48530uUv.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView28, "");
        android.content.Context context15 = abstractC48530uUv.AhwBna.getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "");
        AEQbTJ(textView28, "20000", C33508mxl.AEQbTJ(context15));
        android.widget.TextView textView29 = abstractC48530uUv.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView29, "");
        android.content.Context context16 = abstractC48530uUv.valueOf.getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "");
        AEQbTJ(textView29, "19999.9", C33508mxl.copydefault(context16));
        android.widget.TextView textView30 = abstractC48530uUv.values;
        Intrinsics.checkNotNullExpressionValue(textView30, "");
        android.content.Context context17 = abstractC48530uUv.values.getContext();
        Intrinsics.checkNotNullExpressionValue(context17, "");
        AEQbTJ(textView30, "19999.8", C33508mxl.copydefault(context17));
        android.widget.TextView textView31 = abstractC48530uUv.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView31, "");
        android.content.Context context18 = abstractC48530uUv.isConnected.getContext();
        Intrinsics.checkNotNullExpressionValue(context18, "");
        AEQbTJ(textView31, "19999.7", C33508mxl.copydefault(context18));
        android.widget.TextView textView32 = abstractC48530uUv.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView32, "");
        android.content.Context context19 = abstractC48530uUv.gEmmrt.getContext();
        Intrinsics.checkNotNullExpressionValue(context19, "");
        copydefault(textView32, "2.6", C33508mxl.OLrzqt(context19, 0.1f));
        android.widget.TextView textView33 = abstractC48530uUv.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView33, "");
        android.content.Context context20 = abstractC48530uUv.AYXKKw.getContext();
        Intrinsics.checkNotNullExpressionValue(context20, "");
        copydefault(textView33, "2.6", C33508mxl.OLrzqt(context20, 0.1f));
        android.widget.TextView textView34 = abstractC48530uUv.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView34, "");
        android.content.Context context21 = abstractC48530uUv.djBIcL.getContext();
        Intrinsics.checkNotNullExpressionValue(context21, "");
        copydefault(textView34, "1.5", C33508mxl.OLrzqt(context21, 0.1f));
        android.widget.TextView textView35 = abstractC48530uUv.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView35, "");
        copydefault(textView35);
        android.widget.TextView textView36 = abstractC48530uUv.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView36, "");
        copydefault(textView36);
        android.widget.TextView textView37 = abstractC48530uUv.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView37, "");
        copydefault(textView37);
    }

    public final void EZpvd(android.widget.TextView textView, android.widget.TextView textView2) {
        textView.setText(xMO.KWHzl.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.setMessage), "(USDT)"));
        textView2.setText(C33070mpX.AYXKKw(C55688xof.Application.onKeyUp));
    }

    public final void copydefault(android.widget.TextView textView, java.lang.String str, int i) {
        textView.setText(xMR.copydefault.copydefault(str) + "k");
        textView.setBackgroundColor(i);
    }

    public final void AEQbTJ(android.widget.TextView textView, java.lang.String str, int i) {
        textView.setText(xMR.copydefault.copydefault(str));
        textView.setTextColor(i);
    }

    public final void copydefault(final android.widget.TextView textView) {
        textView.post(new java.lang.Runnable() { // from class: o.weu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C53083wem.AEQbTJ(textView);
            }
        });
    }

    public static final void AEQbTJ(android.widget.TextView textView) {
        if (textView.getLayout().getEllipsisCount(r0.getLineCount() - 1) > 0) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd(0);
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
            }
            textView.setLayoutParams(layoutParams);
        }
    }
}
