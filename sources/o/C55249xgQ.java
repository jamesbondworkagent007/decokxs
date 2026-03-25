package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.okinc.uilab.shape.helper.ShapeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55249xgQ extends AbstractC55238xgF implements InterfaceC55066xct {
    public final C55065xcs AuCTelauCTel;
    public int AubY;
    public final C55250xgR fARcdN;
    public int getFieldNames;
    public final C55280xgv getNewProxyInstance;
    public android.util.AttributeSet hDKMBd;
    public int iwGUEr;
    public int uzCIH;
    public int wlaJM;
    public int zLjUOn;
    public int zsXlph;
    public float zuBGHE;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AuCTel = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55249xgQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55249xgQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttrs(android.util.AttributeSet attributeSet) {
        this.hDKMBd = attributeSet;
    }

    public void setOKDSPill(int i) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.run int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:39) call: o.xgQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55249xgQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.run : i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C55249xgQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.ColorStateList colorStateListValueOf;
        Intrinsics.checkNotNullParameter(context, "");
        DefaultConstructorMarker defaultConstructorMarker = null;
        super(context, attributeSet, i, defaultConstructorMarker);
        this.hDKMBd = attributeSet;
        this.uzCIH = 32;
        C55280xgv c55280xgv = new C55280xgv();
        this.getNewProxyInstance = c55280xgv;
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, defaultConstructorMarker);
        this.AuCTelauCTel = c55065xcs;
        C55250xgR c55250xgR = new C55250xgR(this);
        this.fARcdN = c55250xgR;
        this.zLjUOn = -1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(this.hDKMBd, C52761wXj.PictureInPictureParams.onLocationChanged, i, C55250xgR.Companion.EZpvd());
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        c55250xgR.copydefault(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.DtnWsU, -1));
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, this.hDKMBd, i, 0, 4, null);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55250xgR, this.hDKMBd, i, 0, 4, null);
        if (typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.OCdtug, false)) {
            setTabMode(1);
            setTabGravity(0);
        } else {
            setTabMode(2);
            setTabGravity(1);
        }
        int iCopydefault = c55065xcs.copydefault();
        if (iCopydefault == -5) {
            colorStateListValueOf = c55250xgR.valueOf();
        } else if (iCopydefault == -4 || iCopydefault == -3) {
            colorStateListValueOf = c55250xgR.EZpvd();
        } else {
            colorStateListValueOf = c55250xgR.valueOf();
        }
        setTabTextColors(colorStateListValueOf);
        android.content.res.ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.iMXFZQ);
        if (colorStateList != null) {
            setTabTextColors(colorStateList);
            setTabIconTint(colorStateList);
        }
        this.uzCIH = EZpvd();
        AhwBna();
        this.AubY = c55250xgR.AYXKKw();
        this.zsXlph = c55250xgR.AhwBna();
        this.iwGUEr = c55250xgR.KWHzl();
        this.getFieldNames = c55250xgR.OLrzqt();
        this.wlaJM = c55250xgR.djBIcL();
        this.zuBGHE = C55298xhM.AEQbTJ(999, context);
        c55280xgv.copydefault(ShapeType.RECTANGLE).values(c55250xgR.copydefault());
        setDrawableInternal();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // o.AbstractC55238xgF
    public TabLayout.Tab EZpvd(@NotNull TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "");
        TabLayout.Tab customView = tab.setCustomView(C52761wXj.Fragment.RcXXUw);
        Intrinsics.checkNotNullExpressionValue(customView, "");
        android.view.View customView2 = customView.getCustomView();
        if (customView2 != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) customView2.findViewById(android.R.id.icon);
            if (imageView != null) {
                copydefault(imageView);
            }
            android.widget.TextView textView = (android.widget.TextView) customView2.findViewById(android.R.id.text1);
            if (textView != null) {
                AbstractC55238xgF.updateTextAppearance$OKUILib_uilib$default(this, textView, null, false, 3, null);
            }
        }
        return customView;
    }

    public final void copydefault(android.widget.ImageView imageView) {
        int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = KWHzl();
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = KWHzl() + (iOLrzqt * 2);
            imageView.setPaddingRelative(iOLrzqt, 0, iOLrzqt, 0);
            imageView.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void setSelectedColor(@androidx.annotation.ColorInt int i) {
        KWHzl(i);
    }

    public final void KWHzl(@androidx.annotation.ColorInt int i) {
        this.fARcdN.EZpvd(i);
        setDrawableInternal();
    }

    public final void KWHzl(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        this.fARcdN.EZpvd(colorStateList);
        this.fARcdN.copydefault(colorStateList);
        android.view.View childAt = getChildAt(0);
        Intrinsics.copydefault(childAt, "");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) childAt;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt2 = linearLayout.getChildAt(i);
            Intrinsics.copydefault(childAt2, "");
            android.widget.TextView textView = (android.widget.TextView) ((android.view.ViewGroup) childAt2).findViewById(android.R.id.text1);
            if (textView != null) {
                textView.setTextColor(colorStateList);
            }
        }
        setTabIconTint(colorStateList);
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.AuCTelauCTel.setOKDSSize(i);
        this.uzCIH = EZpvd();
        setDrawableInternal();
        AhwBna();
        requestLayout();
    }

    public void setOKDSTheme(int i) {
        this.zLjUOn = i;
        this.fARcdN.copydefault(i);
        InterfaceC52764wXm.Application.loadFromAttributes$default(this.fARcdN, this.hDKMBd, C52761wXj.ActionBar.run, 0, 4, null);
        this.getNewProxyInstance.copydefault(ShapeType.RECTANGLE).values(this.fARcdN.copydefault());
        this.wlaJM = this.fARcdN.djBIcL();
        setDrawableInternal();
        KWHzl(this.fARcdN.ejfBZ());
        try {
            java.lang.reflect.Field declaredField = TabLayout.class.getDeclaredField("slidingTabIndicator");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            Intrinsics.copydefault(obj, "");
            ((android.view.View) obj).invalidate();
        } catch (java.lang.Exception unused) {
        }
        invalidate();
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        android.view.View customView;
        int i3 = this.uzCIH;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C55298xhM.OLrzqt(i3, context), 1073741824));
        int tabCount = getTabCount();
        int iCopydefault = 0;
        for (int i4 = 0; i4 < tabCount; i4++) {
            TabLayout.Tab tabAt = getTabAt(i4);
            android.widget.TextView textView = (tabAt == null || (customView = tabAt.getCustomView()) == null) ? null : (android.widget.TextView) customView.findViewById(android.R.id.text1);
            if (textView != null) {
                int lineCount = textView.getLineCount();
                iCopydefault = C56548yJl.copydefault(iCopydefault, lineCount);
                if (lineCount > 1) {
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    setTabTextSize$OKUILib_uilib(C55298xhM.EZpvd(10.0f, context2));
                }
                textView.setTextSize(0, OLrzqt());
            }
        }
    }

    public final void AhwBna() {
        android.view.View customView;
        if (this.AuCTelauCTel.copydefault() >= -4) {
            setTabTextAppearance$OKUILib_uilib(this.fARcdN.values());
            setTabPaddingStart$OKUILib_uilib(this.fARcdN.isConnected());
            setTabTextSize$OKUILib_uilib(this.fARcdN.AkhnZx());
            setIconSize$OKUILib_uilib(this.fARcdN.fetchVPNInfo());
        } else {
            setTabTextAppearance$OKUILib_uilib(this.fARcdN.fARcdN());
            setTabPaddingStart$OKUILib_uilib(this.fARcdN.fJNWhG());
            setTabTextSize$OKUILib_uilib(this.fARcdN.AuCTel());
            setIconSize$OKUILib_uilib(this.fARcdN.DbNXlk());
        }
        int tabCount = getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = getTabAt(i);
            if (tabAt == null || (customView = tabAt.getCustomView()) == null) {
                customView = tabAt != null ? tabAt.view : null;
            }
            Intrinsics.copydefault(customView, "");
            ((AppCompatTextView) customView).setTextSize(OLrzqt());
        }
        setTabPaddingEnd$OKUILib_uilib(AEQbTJ());
    }

    public final void setDrawableInternal() {
        android.graphics.drawable.Drawable tabSelectedIndicator = getTabSelectedIndicator();
        Intrinsics.copydefault(tabSelectedIndicator, "");
        GradientDrawable gradientDrawable = (GradientDrawable) tabSelectedIndicator;
        gradientDrawable.setColor(this.fARcdN.gEmmrt());
        int i = this.uzCIH;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        gradientDrawable.setSize(-1, C55298xhM.OLrzqt(i, context));
        gradientDrawable.setStroke(copydefault(), this.wlaJM);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        gradientDrawable.setCornerRadius(C55298xhM.AEQbTJ(999, context2));
        C55280xgv c55280xgv = this.getNewProxyInstance;
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        c55280xgv.EZpvd(C55298xhM.AEQbTJ(999, context3));
        setBackground(this.getNewProxyInstance.EZpvd(0));
    }

    private final int EZpvd() {
        int iCopydefault = this.AuCTelauCTel.copydefault();
        if (iCopydefault == -20) {
            return 28;
        }
        if (iCopydefault != -5) {
            if (iCopydefault == -4) {
                return 32;
            }
            if (iCopydefault == -3) {
                return 48;
            }
        }
        return 24;
    }

    private final int copydefault() {
        int iCopydefault = this.AuCTelauCTel.copydefault();
        if (iCopydefault != -5) {
            if (iCopydefault == -4) {
                return this.iwGUEr;
            }
            if (iCopydefault == -3) {
                return this.getFieldNames;
            }
        }
        return this.zsXlph;
    }

    /* JADX INFO: renamed from: o.xgQ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
