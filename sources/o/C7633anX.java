package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.anX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7633anX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.Integer AEQbTJ;
    public Function0<Unit> AYXKKw;
    public java.util.List<C7626anQ> AhwBna;
    public java.lang.Integer EZpvd;
    public final android.content.Context KWHzl;
    public java.lang.Float copydefault;
    public Function1<? super java.lang.Integer, Unit> djBIcL;
    public final android.view.View fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.PopupWindow valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.util.List<C7626anQ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AhwBna = list;
    }

    public C7633anX(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
        this.AhwBna = yDY.AhwBna();
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C7343ahz.Activity.AYXKKw, (android.view.ViewGroup) null);
        this.fetchVPNInfo = viewInflate;
        this.gEmmrt = (android.widget.LinearLayout) viewInflate.findViewById(C7343ahz.TaskDescription.zuBGHE);
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(viewInflate, -2, -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setElevation(C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.anU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C7633anX.EZpvd(this.KWHzl);
            }
        });
        this.valueOf = popupWindow;
    }

    public static final void EZpvd(C7633anX c7633anX) {
        Function0<Unit> function0 = c7633anX.AYXKKw;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void KWHzl(int i) {
        this.AEQbTJ = java.lang.Integer.valueOf(i);
    }

    public final void copydefault(float f) {
        this.copydefault = java.lang.Float.valueOf(f);
    }

    public final void copydefault(int i) {
        this.EZpvd = java.lang.Integer.valueOf(i);
    }

    public final void KWHzl(@NotNull android.view.View view, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl();
        if (i3 == 0) {
            this.fetchVPNInfo.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.valueOf.showAsDropDown(view, i, -(view.getHeight() + this.fetchVPNInfo.getMeasuredHeight() + i2));
            return;
        }
        this.valueOf.showAsDropDown(view, i, i2);
    }

    public final void OLrzqt() {
        this.valueOf.dismiss();
    }

    public final void KWHzl() {
        this.gEmmrt.removeAllViews();
        EZpvd();
        final int i = 0;
        for (java.lang.Object obj : this.AhwBna) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            final C7626anQ c7626anQ = (C7626anQ) obj;
            android.view.View viewInflate = android.view.LayoutInflater.from(this.KWHzl).inflate(C7343ahz.Activity.values, (android.view.ViewGroup) this.gEmmrt, false);
            android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C7343ahz.TaskDescription.QOLQEE);
            android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C7343ahz.TaskDescription.ORxRYg);
            if (c7626anQ.KWHzl() != null) {
                Intrinsics.copydefault(imageView);
                imageView.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(0);
                textView.setLayoutParams(layoutParams2);
                EZpvd(imageView, c7626anQ.KWHzl());
            } else {
                Intrinsics.copydefault(imageView);
                imageView.setVisibility(8);
                ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart(0);
                textView.setLayoutParams(layoutParams4);
            }
            textView.setText(c7626anQ.AEQbTJ());
            java.lang.Integer numEZpvd = c7626anQ.EZpvd();
            if (numEZpvd != null) {
                textView.setTextColor(numEZpvd.intValue());
            }
            java.lang.Integer num = this.EZpvd;
            if (num != null) {
                viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, C55298xhM.dpInt$default(num.intValue(), (android.content.Context) null, 1, (java.lang.Object) null)));
            }
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o.anV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C7633anX.EZpvd(this.EZpvd, c7626anQ, i, view);
                }
            });
            this.gEmmrt.addView(viewInflate);
            i++;
        }
    }

    public static final void EZpvd(C7633anX c7633anX, C7626anQ c7626anQ, int i, android.view.View view) {
        c7633anX.OLrzqt();
        Function0<Unit> function0Copydefault = c7626anQ.copydefault();
        if (function0Copydefault != null) {
            function0Copydefault.invoke();
        }
        Function1<? super java.lang.Integer, Unit> function1 = c7633anX.djBIcL;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
    }

    public final void EZpvd() {
        android.graphics.drawable.Drawable background = this.gEmmrt.getBackground();
        if (background instanceof GradientDrawable) {
            java.lang.Integer num = this.AEQbTJ;
            if (num != null) {
                ((GradientDrawable) background).setColor(num.intValue());
            }
            if (this.copydefault != null) {
                ((GradientDrawable) background).setCornerRadius(C55298xhM.dpInt$default(r1.floatValue(), (android.content.Context) null, 1, (java.lang.Object) null));
            }
        }
    }

    public final void EZpvd(final android.widget.ImageView imageView, JDImageInfo jDImageInfo) {
        C7911ask.AEQbTJ(imageView, jDImageInfo, new InterfaceC7852are() { // from class: o.anW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC7852are
            public final void copydefault(android.graphics.drawable.Drawable drawable, java.lang.String str) {
                C7633anX.EZpvd(imageView, drawable, str);
            }
        });
    }

    public static final void EZpvd(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, java.lang.String str) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: o.anX$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.anX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
