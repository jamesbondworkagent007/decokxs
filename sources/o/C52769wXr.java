package o;

import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52769wXr extends android.widget.FrameLayout implements InterfaceC55066xct {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public C54948xah EZpvd;
    public java.lang.String KWHzl;
    public int OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public android.graphics.drawable.Drawable gEmmrt;
    public final C55065xcs isConnected;
    public android.graphics.drawable.Drawable valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52769wXr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52769wXr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.wXr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52769wXr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52769wXr(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        C55065xcs c55065xcs = new C55065xcs(this, -7);
        this.isConnected = c55065xcs;
        C54948xah c54948xahAEQbTJ = C54948xah.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54948xahAEQbTJ, "");
        this.EZpvd = c54948xahAEQbTJ;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wXu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52769wXr.AEQbTJ(context);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wXv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52769wXr.copydefault(context);
            }
        });
        this.OLrzqt = 1;
        this.AhwBna = true;
        this.KWHzl = "";
        this.EZpvd.gEmmrt.setClipToOutline(true);
        this.EZpvd.gEmmrt.setOutlineProvider(new android.view.ViewOutlineProvider() { // from class: o.wXr.4
            @Override // android.view.ViewOutlineProvider
            public void getOutline(android.view.View view, Outline outline) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(outline, "");
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
            }
        });
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.QCjLjM, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            setAvatarType(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.dUDNAs, 1));
            setHasOutline(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.QwvEab, true));
            setHasNotificationRing(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.UlJrfe, false));
            java.lang.String string = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.OxVOHk);
            if (string != null) {
                str = string;
            }
            setAvatarText(str);
            setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.OJuSTm));
            setIconDrawable(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.QVsKAR));
            c55065xcs.OLrzqt(attributeSet, i, 0);
            Unit unit = Unit.INSTANCE;
            AhwBna();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final GradientDrawable gEmmrt() {
        return (GradientDrawable) this.AYXKKw.getValue();
    }

    public static final GradientDrawable AEQbTJ(android.content.Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(C55298xhM.dp$default(999, (android.content.Context) null, 1, (java.lang.Object) null));
        gradientDrawable.setStroke(C55298xhM.dpInt$default(1, (android.content.Context) null, 1, (java.lang.Object) null), ContextCompat.getColor(context, C52761wXj.Activity.iUnTnt));
        return gradientDrawable;
    }

    private final GradientDrawable valueOf() {
        return (GradientDrawable) this.djBIcL.getValue();
    }

    public static final GradientDrawable copydefault(android.content.Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(C55298xhM.dp$default(999, (android.content.Context) null, 1, (java.lang.Object) null));
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.OcIXYQ, typedValue, true);
        gradientDrawable.setStroke(C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null), ContextCompat.getColor(context, typedValue.resourceId));
        return gradientDrawable;
    }

    public final void setAvatarType(int i) {
        this.OLrzqt = i;
        AYXKKw();
    }

    public final void setHasOutline(boolean z) {
        this.AhwBna = z;
        EZpvd();
    }

    public final void setHasNotificationRing(boolean z) {
        this.AEQbTJ = z;
        copydefault();
    }

    public final void setAvatarText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        android.widget.TextView textView = this.EZpvd.djBIcL;
        java.lang.String upperCase = C59454zhO.AkhnZx(str, 1).toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        textView.setText(upperCase);
        if (this.OLrzqt == 1) {
            AEQbTJ();
        }
    }

    public final void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.gEmmrt = drawable;
        this.EZpvd.AEQbTJ.setImageDrawable(drawable);
    }

    public final void setIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.valueOf = drawable;
        this.EZpvd.copydefault.setImageDrawable(drawable);
        if (this.OLrzqt == 2) {
            KWHzl();
        }
    }

    public final android.widget.ImageView OLrzqt() {
        LottieAnimationView lottieAnimationView = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        return lottieAnimationView;
    }

    private final void AhwBna() {
        int iDjBIcL = djBIcL();
        android.widget.FrameLayout frameLayout = this.EZpvd.OLrzqt;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iDjBIcL;
            layoutParams.height = iDjBIcL;
        } else {
            layoutParams = new FrameLayout.LayoutParams(iDjBIcL, iDjBIcL);
        }
        frameLayout.setLayoutParams(layoutParams);
        if (this.OLrzqt == 1) {
            AEQbTJ();
        }
        if (this.OLrzqt == 2) {
            KWHzl();
        }
    }

    private final void AYXKKw() {
        LottieAnimationView lottieAnimationView = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(8);
        android.widget.TextView textView = this.EZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.ImageView imageView = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        int i = this.OLrzqt;
        if (i == 0) {
            LottieAnimationView lottieAnimationView2 = this.EZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
            lottieAnimationView2.setVisibility(0);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            android.widget.ImageView imageView2 = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            KWHzl();
            return;
        }
        android.widget.TextView textView2 = this.EZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        android.widget.TextView textView3 = this.EZpvd.djBIcL;
        java.lang.String upperCase = C59454zhO.AkhnZx(this.KWHzl, 1).toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        textView3.setText(upperCase);
        AEQbTJ();
    }

    public final void EZpvd() {
        if (this.AhwBna) {
            this.EZpvd.KWHzl.setBackground(gEmmrt());
            android.view.View view = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            return;
        }
        android.view.View view2 = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(8);
    }

    public final void copydefault() {
        if (this.AEQbTJ) {
            this.EZpvd.EZpvd.setBackground(valueOf());
            android.view.View view = this.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            return;
        }
        android.view.View view2 = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(8);
    }

    private final int djBIcL() {
        switch (this.isConnected.copydefault()) {
            case -7:
                return C55298xhM.dpInt$default(28, (android.content.Context) null, 1, (java.lang.Object) null);
            case -6:
                return C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null);
            case -5:
                return C55298xhM.dpInt$default(44, (android.content.Context) null, 1, (java.lang.Object) null);
            case -4:
                return C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null);
            case -3:
                return C55298xhM.dpInt$default(60, (android.content.Context) null, 1, (java.lang.Object) null);
            case -2:
                return C55298xhM.dpInt$default(88, (android.content.Context) null, 1, (java.lang.Object) null);
            case -1:
                return C55298xhM.dpInt$default(120, (android.content.Context) null, 1, (java.lang.Object) null);
            default:
                return -1;
        }
    }

    public final void KWHzl() {
        this.EZpvd.gEmmrt.getBackground();
        android.widget.ImageView imageView = this.EZpvd.copydefault;
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.v)));
        int iCopydefault = this.isConnected.copydefault();
        if (iCopydefault != -30) {
            switch (iCopydefault) {
                case -7:
                    imageView.setPadding(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null));
                    break;
                case -6:
                case -5:
                case -4:
                    imageView.setPadding(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
                    break;
                case -3:
                    imageView.setPadding(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
                    break;
                case -1:
                    imageView.setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
                    break;
            }
        }
        imageView.setPadding(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final void AEQbTJ() {
        android.widget.TextView textView = this.EZpvd.djBIcL;
        switch (this.isConnected.copydefault()) {
            case -7:
                TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.QOLQEE);
                break;
            case -6:
                TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.zuBGHE);
                break;
            case -5:
                TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AxsJAY);
                break;
            case -4:
                TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AxsJAY);
                break;
            case -3:
                TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.OLrzqt);
                break;
            case -2:
                TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AuCTel);
                break;
            case -1:
                TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.values);
                break;
            default:
                TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.QOLQEE);
                break;
        }
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.v));
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.isConnected.setOKDSSize(i);
        AhwBna();
    }

    /* JADX INFO: renamed from: o.wXr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wXr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
