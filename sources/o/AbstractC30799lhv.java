package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30799lhv extends android.widget.FrameLayout {
    public boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public java.lang.Runnable OLrzqt;
    public android.widget.PopupWindow djBIcL;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC30799lhv(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public abstract void AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:31) call: o.lhv.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ AbstractC30799lhv(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC30799lhv(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.lhz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC30799lhv.KWHzl(context);
            }
        });
    }

    /* JADX INFO: renamed from: o.lhv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lhv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final android.view.View isConnected() {
        return (android.view.View) this.KWHzl.getValue();
    }

    public static final android.view.View KWHzl(android.content.Context context) {
        return android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.sYcwUD, (android.view.ViewGroup) null);
    }

    public final void setDisabled(boolean z) {
        this.EZpvd = z;
        C30565ldZ.EZpvd(this, !z);
    }

    public final void AkhnZx() {
        removeAllViews();
        KWHzl();
        EZpvd();
        copydefault();
        OLrzqt();
        AEQbTJ();
    }

    public final void OLrzqt(boolean z) {
        C55001xbh c55001xbhAhwBna;
        android.widget.TextView textViewFJNWhG;
        java.lang.String strIsConnected;
        C55001xbh c55001xbhAhwBna2 = AhwBna();
        int i = 0;
        boolean z2 = (c55001xbhAhwBna2 == null || (strIsConnected = c55001xbhAhwBna2.isConnected()) == null || strIsConnected.length() == 0) ? false : true;
        AppCompatTextView appCompatTextViewGEmmrt = gEmmrt();
        if (appCompatTextViewGEmmrt != null) {
            appCompatTextViewGEmmrt.setVisibility((z || z2) ? 8 : 0);
        }
        AppCompatTextView appCompatTextViewAYXKKw = AYXKKw();
        if (appCompatTextViewAYXKKw != null) {
            appCompatTextViewAYXKKw.setVisibility((z || z2) ? 8 : 0);
        }
        boolean z3 = !z && z2;
        AppCompatImageView appCompatImageViewDjBIcL = djBIcL();
        if (appCompatImageViewDjBIcL != null) {
            appCompatImageViewDjBIcL.setVisibility(z3 ? 0 : 8);
        }
        int iDp2px$default = z3 ? C55298xhM.dp2px$default(40.0f, null, 1, null) : 0;
        C55001xbh c55001xbhAhwBna3 = AhwBna();
        if (c55001xbhAhwBna3 != null) {
            C55001xbh c55001xbhAhwBna4 = AhwBna();
            int paddingLeft = c55001xbhAhwBna4 != null ? c55001xbhAhwBna4.getPaddingLeft() : 0;
            C55001xbh c55001xbhAhwBna5 = AhwBna();
            int paddingTop = c55001xbhAhwBna5 != null ? c55001xbhAhwBna5.getPaddingTop() : 0;
            C55001xbh c55001xbhAhwBna6 = AhwBna();
            c55001xbhAhwBna3.setPadding(paddingLeft, paddingTop, iDp2px$default, c55001xbhAhwBna6 != null ? c55001xbhAhwBna6.getPaddingBottom() : 0);
        }
        C55008xbo c55008xboValueOf = valueOf();
        if (c55008xboValueOf != null && (textViewFJNWhG = c55008xboValueOf.fJNWhG()) != null) {
            if (!z && !z2) {
                i = 8;
            }
            textViewFJNWhG.setVisibility(i);
        }
        if (!z) {
            DbNXlk();
        } else {
            if (z2 || (c55001xbhAhwBna = AhwBna()) == null) {
                return;
            }
            c55001xbhAhwBna.setPlainNumericText("");
        }
    }

    public final C55008xbo valueOf() {
        android.view.View childAt = getChildAt(0);
        if (childAt instanceof C55008xbo) {
            return (C55008xbo) childAt;
        }
        return null;
    }

    public final C55001xbh AhwBna() {
        C55008xbo c55008xboValueOf = valueOf();
        if (c55008xboValueOf != null) {
            return c55008xboValueOf.AkhnZx();
        }
        return null;
    }

    public final AppCompatTextView gEmmrt() {
        android.view.View childAt = getChildAt(1);
        if (childAt instanceof AppCompatTextView) {
            return (AppCompatTextView) childAt;
        }
        return null;
    }

    public final AppCompatTextView AYXKKw() {
        android.view.View childAt = getChildAt(2);
        if (childAt instanceof AppCompatTextView) {
            return (AppCompatTextView) childAt;
        }
        return null;
    }

    public final AppCompatImageView djBIcL() {
        android.view.View childAt = getChildAt(3);
        if (childAt instanceof AppCompatImageView) {
            return (AppCompatImageView) childAt;
        }
        return null;
    }

    public final void DbNXlk() {
        java.lang.Runnable runnable = this.OLrzqt;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.OLrzqt = null;
        android.widget.PopupWindow popupWindow = this.djBIcL;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.djBIcL = null;
    }

    public final void KWHzl(java.lang.String str, android.view.View view) {
        if (android.text.TextUtils.isEmpty(str) || view == null) {
            return;
        }
        ((android.widget.TextView) isConnected().findViewById(C23274hvD.Application.generateConfigDelta_locale)).setText(str);
        android.widget.PopupWindow popupWindow = this.djBIcL;
        if (popupWindow != null && popupWindow.isShowing()) {
            values();
            return;
        }
        android.widget.PopupWindow popupWindow2 = new android.widget.PopupWindow(isConnected(), -2, -2, false);
        isConnected().measure(0, 0);
        popupWindow2.showAsDropDown(view, 0, -(view.getHeight() + isConnected().getMeasuredHeight() + C55298xhM.dp2px$default(2.0f, null, 1, null)));
        values();
        this.djBIcL = popupWindow2;
    }

    public final void values() {
        java.lang.Runnable runnable = this.OLrzqt;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: o.lhy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC30799lhv.OLrzqt(this.OLrzqt);
            }
        };
        this.OLrzqt = runnable2;
        Intrinsics.copydefault(runnable2);
        postDelayed(runnable2, 3000L);
    }

    public static final void OLrzqt(AbstractC30799lhv abstractC30799lhv) {
        abstractC30799lhv.DbNXlk();
    }

    public final void KWHzl() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55008xbo c55008xbo = new C55008xbo(context, null, 0, 6, null);
        c55008xbo.setTitleType(2);
        c55008xbo.setSizeType(40);
        c55008xbo.setCursorStyleWeb3();
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setInputType(8194);
            c55001xbhAkhnZx.setImeOptions(6);
            c55001xbhAkhnZx.setShowThousandsSeparator(true);
        }
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setBackgroundColor(C25382ivf.KWHzl(C52761wXj.Activity.invokespecialDPHOMC));
        }
        addView(c55008xbo, new FrameLayout.LayoutParams(-1, -2));
    }

    public final void EZpvd() {
        int iDp2px$default = C55298xhM.dp2px$default(16.0f, null, 1, null);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.OJuSTm);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, iDp2px$default, iDp2px$default);
        } else {
            drawableKWHzl = null;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setPadding(appCompatTextView.getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.UeEOUB), 0, 0, 0);
        C25352ivB.AEQbTJ(appCompatTextView, C52761wXj.LoaderManager.gHZMYf);
        appCompatTextView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        appCompatTextView.setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
        appCompatTextView.setGravity(16);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        Unit unit = Unit.INSTANCE;
        addView(appCompatTextView, layoutParams);
    }

    public final void copydefault() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setPadding(0, 0, appCompatTextView.getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.UeEOUB), 0);
        C25352ivB.AEQbTJ(appCompatTextView, C52761wXj.LoaderManager.gHZMYf);
        appCompatTextView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = TextAlign.RIGHT;
        Unit unit = Unit.INSTANCE;
        addView(appCompatTextView, layoutParams);
    }

    public final void OLrzqt() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.UeEOUB);
        int iDp2px$default = C55298xhM.dp2px$default(16.0f, null, 1, null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.OJuSTm));
        appCompatImageView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.lhx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC30799lhv.AEQbTJ(this.KWHzl, view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDp2px$default + (dimensionPixelSize * 2), -1);
        layoutParams.gravity = 8388613;
        Unit unit = Unit.INSTANCE;
        addView(appCompatImageView, layoutParams);
    }

    public static final void AEQbTJ(AbstractC30799lhv abstractC30799lhv, android.view.View view) {
        AppCompatTextView appCompatTextViewGEmmrt = abstractC30799lhv.gEmmrt();
        if (appCompatTextViewGEmmrt != null) {
            appCompatTextViewGEmmrt.performClick();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.OLrzqt);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        C55001xbh c55001xbhAhwBna;
        java.lang.String strIsConnected;
        Intrinsics.checkNotNullParameter(str, "");
        if (getVisibility() == 0) {
            C55001xbh c55001xbhAhwBna2 = AhwBna();
            if (c55001xbhAhwBna2 == null || c55001xbhAhwBna2.isFocused()) {
                if (str.length() == 0 || ((c55001xbhAhwBna = AhwBna()) != null && (strIsConnected = c55001xbhAhwBna.isConnected()) != null && strIsConnected.length() == 0)) {
                    DbNXlk();
                } else {
                    KWHzl(str, valueOf());
                }
            }
        }
    }
}
