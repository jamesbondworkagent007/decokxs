package o;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wXQ extends LinearLayoutCompat {
    public wZZ EZpvd;
    public boolean KWHzl;
    public final C52783wYe OLrzqt;
    public android.view.View copydefault;
    public int gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.UlJrfe int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.wXQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wXQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.UlJrfe : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wXQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = -2;
        C52783wYe c52783wYe = new C52783wYe(null, this);
        this.OLrzqt = c52783wYe;
        wZZ wzzEZpvd = wZZ.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(wzzEZpvd, "");
        this.EZpvd = wzzEZpvd;
        setOrientation(1);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c52783wYe, attributeSet, i, 0, 4, null);
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(c52783wYe.copydefault());
        this.copydefault = view;
    }

    public final android.widget.ImageView EZpvd() {
        wYC wyc = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        return wyc;
    }

    public final android.widget.ImageView KWHzl() {
        wYC wyc = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        return wyc;
    }

    public final android.widget.TextView AYXKKw() {
        android.widget.TextView textView = this.EZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.view.View AEQbTJ() {
        android.widget.LinearLayout linearLayout = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final android.view.View valueOf() {
        android.widget.RelativeLayout relativeLayout = this.EZpvd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        return relativeLayout;
    }

    public final void gEmmrt() {
        removeAllViews();
        this.EZpvd = wZZ.EZpvd(android.view.LayoutInflater.from(getContext()), this, true);
    }

    public final void setStyle(int i) {
        this.gEmmrt = i;
        this.EZpvd.getRoot().setVisibility(0);
        if (i == -1) {
            removeAllViews();
            return;
        }
        if (i == 0) {
            wZZ wzz = this.EZpvd;
            wzz.gEmmrt.setVisibility(8);
            wzz.copydefault.setVisibility(0);
            return;
        }
        if (i == 1) {
            KWHzl(true, 0);
            return;
        }
        if (i == 2) {
            KWHzl(false, 0);
            return;
        }
        if (i == 3) {
            OLrzqt();
            return;
        }
        if (i == 5) {
            KWHzl(true, 1);
        } else if (i == 6) {
            KWHzl(false, 1);
        } else {
            configTitleLayoutParams$default(this, false, 0, 3, null);
        }
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        android.widget.TextView textView = this.EZpvd.valueOf;
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (C33129mqd.OLrzqt(charSequence) && this.KWHzl) {
            setDividerVisibility(true);
        }
        this.EZpvd.copydefault.setVisibility(8);
    }

    public static /* synthetic */ void setDividerVisibility$default(wXQ wxq, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        wxq.setDividerVisibility(z);
    }

    public final void setDividerVisibility(boolean z) {
        this.KWHzl = z;
        if (z) {
            android.widget.TextView textView = this.EZpvd.valueOf;
            if (this.OLrzqt.copydefault() != 0) {
                removeView(this.copydefault);
                android.view.View view = this.copydefault;
                LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, this.OLrzqt.djBIcL());
                layoutParams.setMarginStart(this.OLrzqt.AhwBna());
                layoutParams.setMarginEnd(this.OLrzqt.AhwBna());
                Unit unit = Unit.INSTANCE;
                addView(view, layoutParams);
            }
            Intrinsics.copydefault(textView);
            return;
        }
        removeView(this.copydefault);
    }

    public static /* synthetic */ void setCloseVisibility$default(wXQ wxq, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        wxq.setCloseVisibility(z);
    }

    public final void setCloseVisibility(boolean z) {
        KWHzl().setVisibility(z ? 0 : 8);
        if (this.gEmmrt == 3) {
            OLrzqt();
        }
    }

    public static /* synthetic */ void configTitleLayoutParams$default(wXQ wxq, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        wxq.KWHzl(z, i);
    }

    public final void KWHzl(boolean z, int i) {
        int i2;
        this.EZpvd.gEmmrt.setVisibility(0);
        wZZ wzz = this.EZpvd;
        android.widget.TextView textView = wzz.valueOf;
        textView.setTextSize(i == 0 ? 16.0f : 18.0f);
        textView.setMaxLines(1);
        ViewGroup.LayoutParams layoutParams = wzz.valueOf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (z) {
            layoutParams2.removeRule(13);
            layoutParams2.addRule(20);
            layoutParams2.addRule(15);
        } else {
            layoutParams2.removeRule(20);
            layoutParams2.addRule(13);
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(24, context);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt2 = iOLrzqt + C55298xhM.OLrzqt(12, context2);
        if (z) {
            int i3 = wzz.AEQbTJ.getVisibility() == 0 ? iOLrzqt2 : 0;
            if (wzz.EZpvd.getVisibility() == 0) {
                iOLrzqt2 = i3;
                i2 = iOLrzqt2;
            } else {
                iOLrzqt2 = i3;
                i2 = 0;
            }
        } else if (wzz.AEQbTJ.getVisibility() == 0 || wzz.EZpvd.getVisibility() == 0) {
            i2 = iOLrzqt2;
        } else {
            i2 = 0;
            iOLrzqt2 = 0;
        }
        wzz.valueOf.setPaddingRelative(iOLrzqt2, 0, i2, 0);
        wzz.valueOf.setLayoutParams(layoutParams2);
        wYC wyc = wzz.EZpvd;
        wyc.setImageDrawable(this.OLrzqt.EZpvd());
        wyc.setImageTintList(this.OLrzqt.KWHzl());
        wYC wyc2 = wzz.AEQbTJ;
        wyc2.setImageDrawable(this.OLrzqt.AEQbTJ());
        wyc2.setImageTintList(this.OLrzqt.OLrzqt());
    }

    public final void OLrzqt() {
        configTitleLayoutParams$default(this, true, 0, 2, null);
        wZZ wzz = this.EZpvd;
        android.widget.TextView textView = wzz.valueOf;
        textView.setMaxLines(3);
        textView.setTextSize(24.0f);
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setPaddingRelative(0, 0, C55298xhM.OLrzqt(48, context), 0);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (wzz.EZpvd.getVisibility() == 0 && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C55298xhM.OLrzqt(16, context2);
        }
        if (wzz.EZpvd.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams2 = wzz.EZpvd.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.removeRule(15);
            layoutParams3.addRule(10);
            wzz.EZpvd.setLayoutParams(layoutParams3);
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wXQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
