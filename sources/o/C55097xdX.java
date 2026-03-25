package o;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55097xdX extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public android.graphics.drawable.Drawable AYXKKw;
    public android.graphics.drawable.Drawable AhwBna;
    public final C54959xas EZpvd;
    public final C55153xea KWHzl;
    public Function0<Unit> copydefault;
    public int djBIcL;
    public int gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55097xdX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55097xdX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCloseCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.DGOPHZ int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.xdX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55097xdX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.DGOPHZ : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55097xdX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54959xas c54959xasCopydefault = C54959xas.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54959xasCopydefault, "");
        this.EZpvd = c54959xasCopydefault;
        this.AEQbTJ = true;
        C55153xea c55153xea = new C55153xea(this);
        this.KWHzl = c55153xea;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55153xea, attributeSet, i, 0, 4, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.clearCurrentKeyboardTarget);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        typedArrayObtainStyledAttributes.recycle();
        setLeadingIconType(c55153xea.AwvSrB());
        setLeadingIconLottieRepeatCount(c55153xea.zuBGHE());
        setLeadingIconLottieRawRes(c55153xea.sSMYrx());
        if (c55153xea.gHZMYf()) {
            c54959xasCopydefault.OLrzqt.playAnimation();
        }
        c54959xasCopydefault.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.xdU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55097xdX.KWHzl(this.KWHzl, view);
            }
        });
        TextViewCompat.setTextAppearance(c54959xasCopydefault.isConnected, c55153xea.fIwbmz());
        TextViewCompat.setTextAppearance(c54959xasCopydefault.fetchVPNInfo, c55153xea.KWHzl());
        c54959xasCopydefault.isConnected.setTextColor(c55153xea.fetchVPNInfo());
        c54959xasCopydefault.fetchVPNInfo.setTextColor(c55153xea.valueOf());
        c54959xasCopydefault.gEmmrt.setTextColor(c55153xea.AEQbTJ());
        c54959xasCopydefault.AkhnZx.setTextColor(c55153xea.AEQbTJ());
        android.widget.FrameLayout frameLayout = c54959xasCopydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        C55296xhK.EZpvd(frameLayout, c55153xea.fARcdN());
        C55375xik root = c54959xasCopydefault.getRoot();
        root.setCornerRadius(c55153xea.fARcdN());
        root.getViewTreeObserver().addOnPreDrawListener(new Application(context));
    }

    public final void setLeadingIcon(android.graphics.drawable.Drawable drawable) {
        this.AYXKKw = drawable;
        android.widget.ImageView imageView = this.EZpvd.copydefault;
        imageView.setBackground(drawable);
        imageView.setBackgroundTintList(null);
    }

    public final void setNotificationBackground(android.graphics.drawable.Drawable drawable) {
        this.AhwBna = drawable;
        this.EZpvd.djBIcL.setBackground(drawable);
    }

    public final void setLeadingIconType(int i) {
        if (this.djBIcL != i) {
            this.djBIcL = i;
            if (i == 1) {
                this.EZpvd.copydefault.setVisibility(8);
                this.EZpvd.OLrzqt.setVisibility(0);
            } else {
                this.EZpvd.copydefault.setVisibility(0);
                C55353xiO c55353xiO = this.EZpvd.OLrzqt;
                c55353xiO.setVisibility(8);
                c55353xiO.cancelAnimation();
            }
        }
    }

    public final void setLeadingIconLottieRepeatCount(int i) {
        this.valueOf = i;
        this.EZpvd.OLrzqt.setRepeatCount(i == 0 ? -1 : 0);
    }

    public final void setLeadingIconLottieRawRes(int i) {
        this.gEmmrt = i;
        if (i != 0) {
            this.EZpvd.OLrzqt.cancelAnimation();
            this.EZpvd.OLrzqt.setAnimation(i);
        } else {
            this.EZpvd.OLrzqt.cancelAnimation();
            this.EZpvd.OLrzqt.setImageDrawable(null);
            this.EZpvd.OLrzqt.clearAnimation();
        }
    }

    public static final void KWHzl(C55097xdX c55097xdX, android.view.View view) {
        Function0<Unit> function0 = c55097xdX.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.xdX$Application */
    public static final class Application implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ android.content.Context copydefault;

        public Application(android.content.Context context) {
            this.copydefault = context;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (C55097xdX.this.EZpvd.gEmmrt.getLineCount() > 1 || C55097xdX.this.EZpvd.AkhnZx.getLineCount() > 1) {
                C55097xdX.this.EZpvd.AEQbTJ.setOrientation(1);
                android.widget.TextView textView = C55097xdX.this.EZpvd.gEmmrt;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                C55097xdX.this.EZpvd.gEmmrt.setMaxLines(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = this.copydefault.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.RJOkX);
                android.widget.TextView textView2 = C55097xdX.this.EZpvd.AkhnZx;
                textView2.setLayoutParams(layoutParams);
                textView2.setEllipsize(truncateAt);
                textView2.setMaxLines(1);
            }
            if (C55097xdX.this.EZpvd.isConnected.getVisibility() == 0 && C55097xdX.this.EZpvd.fetchVPNInfo.getVisibility() != 0 && C55097xdX.this.EZpvd.AEQbTJ.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams2 = C55097xdX.this.EZpvd.AEQbTJ.getLayoutParams();
                Intrinsics.copydefault(layoutParams2, "");
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.topMargin = C55097xdX.this.KWHzl.djBIcL();
                C55097xdX.this.EZpvd.AEQbTJ.setLayoutParams(layoutParams3);
            }
            C55097xdX.this.EZpvd.getRoot().getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    public final void setState(int i) {
        EZpvd(i);
        setNotificationBackground();
    }

    public final void setType(int i) {
        AEQbTJ(i);
    }

    public final void setNotificationBackground() {
        if (C33492mxV.OLrzqt()) {
            if (this.KWHzl.UeEOUB() != -1) {
                C55280xgv c55280xgv = new C55280xgv();
                C55279xgu c55279xgu = new C55279xgu();
                c55279xgu.AkhnZx(0);
                if (this.KWHzl.gEmmrt() instanceof ColorDrawable) {
                    android.graphics.drawable.Drawable drawableGEmmrt = this.KWHzl.gEmmrt();
                    Intrinsics.copydefault(drawableGEmmrt, "");
                    c55279xgu.isConnected(((ColorDrawable) drawableGEmmrt).getColor());
                }
                c55279xgu.DbNXlk(this.KWHzl.UeEOUB());
                c55279xgu.fIwbmz(this.KWHzl.aKErDB());
                c55279xgu.OLrzqt(this.KWHzl.fARcdN());
                android.widget.FrameLayout frameLayout = this.EZpvd.djBIcL;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                c55280xgv.KWHzl(frameLayout, c55279xgu);
            }
            C55375xik c55375xik = this.EZpvd.AhwBna;
            c55375xik.setXOffset(this.KWHzl.QbewEr());
            c55375xik.setYOffset(this.KWHzl.QUSxYX());
            c55375xik.setShadowSpread(this.KWHzl.QfsBiF());
            c55375xik.setShadowColor(EZpvd(this.KWHzl.RJOkX(), this.KWHzl.QVAiDq()));
            return;
        }
        C55375xik c55375xik2 = this.EZpvd.AhwBna;
        c55375xik2.setXOffset(this.KWHzl.DTwDnp());
        c55375xik2.setYOffset(this.KWHzl.OcIXYQ());
        c55375xik2.setShadowSpread(this.KWHzl.QKVWgx());
        c55375xik2.setShadowColor(EZpvd(this.KWHzl.ORxRYg(), this.KWHzl.QOLQEE()));
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.EZpvd.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
        AhwBna();
        AYXKKw();
    }

    public final void setMessage(java.lang.String str) {
        android.widget.TextView textView = this.EZpvd.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xdX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addPrimaryAction$default(C55097xdX c55097xdX, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c55097xdX.OLrzqt(str, (Function0<Unit>) function0);
    }

    public final void OLrzqt(java.lang.String str, final Function0<Unit> function0) {
        if (str == null || str.length() == 0) {
            this.EZpvd.gEmmrt.setVisibility(8);
            return;
        }
        this.EZpvd.AEQbTJ.setVisibility(0);
        android.widget.TextView textView = this.EZpvd.gEmmrt;
        textView.setVisibility(0);
        textView.setText(str);
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.xec
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55097xdX.KWHzl(function0, view);
            }
        });
        Intrinsics.copydefault(textView);
    }

    public static final void KWHzl(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xdX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addSecondaryAction$default(C55097xdX c55097xdX, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c55097xdX.copydefault(str, (Function0<Unit>) function0);
    }

    public final void copydefault(java.lang.String str, final Function0<Unit> function0) {
        if (str == null || str.length() == 0) {
            this.EZpvd.AkhnZx.setVisibility(8);
            return;
        }
        this.EZpvd.AEQbTJ.setVisibility(0);
        android.widget.TextView textView = this.EZpvd.AkhnZx;
        textView.setVisibility(0);
        textView.setText(str);
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.xeb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55097xdX.EZpvd(function0, view);
            }
        });
        Intrinsics.copydefault(textView);
    }

    public static final void EZpvd(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.widget.LinearLayout linearLayout = this.EZpvd.AEQbTJ;
        linearLayout.addView(view);
        linearLayout.setVisibility(0);
    }

    public final void setCloseBtnShow(boolean z) {
        this.AEQbTJ = z;
        valueOf();
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.EZpvd.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.EZpvd.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.ImageView AEQbTJ() {
        android.widget.ImageView imageView = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final android.widget.LinearLayout OLrzqt() {
        android.widget.LinearLayout linearLayout = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final android.widget.TextView KWHzl() {
        return copydefault();
    }

    public final void EZpvd(int i) {
        android.graphics.drawable.Drawable colorDrawable = new ColorDrawable(ContextCompat.getColor(getContext(), C52761wXj.Activity.scanPackages));
        android.graphics.drawable.Drawable drawableEjfBZ = null;
        if (i == 0) {
            this.EZpvd.copydefault.setBackground(null);
            this.EZpvd.copydefault.setVisibility(8);
            return;
        }
        int i2 = C52761wXj.TaskDescription.gqOnQv;
        int color = ContextCompat.getColor(getContext(), C52761wXj.Activity.fbC);
        if (i == 1) {
            i2 = C52761wXj.TaskDescription.FSMca;
            color = ContextCompat.getColor(getContext(), C52761wXj.Activity.QOjuYg);
        } else if (i == 2) {
            drawableEjfBZ = this.KWHzl.ejfBZ();
            color = this.KWHzl.fJNWhG();
            colorDrawable = this.KWHzl.DbNXlk();
        } else if (i == 3) {
            drawableEjfBZ = this.KWHzl.AubY();
            color = this.KWHzl.AxsJAY();
            colorDrawable = this.KWHzl.zLjUOn();
        } else if (i == 4) {
            drawableEjfBZ = this.KWHzl.isConnected();
            color = this.KWHzl.AkhnZx();
            colorDrawable = this.KWHzl.gEmmrt();
        } else if (i == 5) {
            drawableEjfBZ = this.KWHzl.wlaJM();
            color = this.KWHzl.getNewProxyInstance();
            colorDrawable = this.KWHzl.iwGUEr();
        }
        android.graphics.drawable.Drawable drawable = this.AYXKKw;
        if (drawable != null) {
            drawableEjfBZ = drawable;
        }
        C54959xas c54959xas = this.EZpvd;
        c54959xas.djBIcL.setBackground(colorDrawable);
        android.widget.ImageView imageView = c54959xas.copydefault;
        if (this.djBIcL == 0) {
            imageView.setVisibility(0);
        }
        if (drawableEjfBZ != null) {
            imageView.setBackground(drawableEjfBZ);
        } else {
            imageView.setBackgroundResource(i2);
        }
        if (this.AYXKKw == null) {
            imageView.setBackgroundTintList(android.content.res.ColorStateList.valueOf(color));
        }
    }

    public static /* synthetic */ void handleType$default(C55097xdX c55097xdX, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 10;
        }
        c55097xdX.AEQbTJ(i);
    }

    public final void AEQbTJ(int i) {
        android.graphics.drawable.Drawable drawableGEmmrt;
        int iFetchVPNInfo;
        int iValueOf;
        int i2 = 0;
        if (i == 1) {
            drawableGEmmrt = this.KWHzl.gEmmrt();
            iFetchVPNInfo = this.KWHzl.fetchVPNInfo();
            iValueOf = this.KWHzl.valueOf();
        } else if (i == 2) {
            drawableGEmmrt = this.KWHzl.iwGUEr();
            iFetchVPNInfo = this.KWHzl.uzCIH();
            iValueOf = this.KWHzl.getFieldNames();
        } else if (i == 3) {
            drawableGEmmrt = this.KWHzl.zLjUOn();
            iFetchVPNInfo = this.KWHzl.zsXlph();
            iValueOf = this.KWHzl.AuCTelauCTel();
        } else if (i == 4) {
            drawableGEmmrt = this.KWHzl.DbNXlk();
            iFetchVPNInfo = this.KWHzl.AuCTel();
            iValueOf = this.KWHzl.values();
        } else {
            drawableGEmmrt = new ColorDrawable(ContextCompat.getColor(getContext(), C52761wXj.Activity.zpGcln));
            iFetchVPNInfo = ContextCompat.getColor(getContext(), C52761wXj.Activity.gLWkOL);
            iValueOf = ContextCompat.getColor(getContext(), C52761wXj.Activity.dXcUrg);
            i2 = 8;
        }
        C54959xas c54959xas = this.EZpvd;
        c54959xas.getRoot().setBackground(drawableGEmmrt);
        if (this.djBIcL == 0) {
            c54959xas.copydefault.setVisibility(i2);
        }
        c54959xas.isConnected.setTextColor(iFetchVPNInfo);
        c54959xas.fetchVPNInfo.setTextColor(iValueOf);
    }

    public final void valueOf() {
        int iKWHzl = 0;
        this.EZpvd.KWHzl.setVisibility(this.AEQbTJ ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = this.EZpvd.valueOf.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (this.AEQbTJ) {
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iKWHzl = C55298xhM.KWHzl(26.0f, context);
                }
                marginLayoutParams.rightMargin = iKWHzl;
            }
            this.EZpvd.valueOf.setLayoutParams(layoutParams);
        }
    }

    public final void AhwBna() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(20, context);
        android.widget.ImageView imageView = this.EZpvd.copydefault;
        imageView.getLayoutParams().width = iOLrzqt;
        imageView.getLayoutParams().height = iOLrzqt;
    }

    public final void AYXKKw() {
        ViewGroup.LayoutParams layoutParams = this.EZpvd.fetchVPNInfo.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.EZpvd.isConnected.getVisibility() == 8 ? 0 : this.KWHzl.djBIcL();
        }
    }

    public final int EZpvd(int i, int i2) {
        return ((i & 16777215) | C56548yJl.valueOf(255, C56548yJl.copydefault(0, i2))) << 24;
    }

    /* JADX INFO: renamed from: o.xdX$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xdX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
