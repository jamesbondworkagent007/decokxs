package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55246xgN extends AbstractC55238xgF {
    public C55244xgL AEQbTJ;
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55246xgN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55246xgN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContainer$OKUILib_uilib(@NotNull C55244xgL c55244xgL) {
        Intrinsics.checkNotNullParameter(c55244xgL, "");
        this.AEQbTJ = c55244xgL;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.fdOvFl int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:308) call: o.xgN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55246xgN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.fdOvFl : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55246xgN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C55246xgN.EZpvd(this.KWHzl));
            }
        });
        setSelectedTabIndicator((android.graphics.drawable.Drawable) null);
        setTabGravity(0);
        setTabMode(0);
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength(C55298xhM.OLrzqt(12, context));
    }

    public final C55244xgL copydefault() {
        C55244xgL c55244xgL = this.AEQbTJ;
        if (c55244xgL != null) {
            return c55244xgL;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final int EZpvd() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int EZpvd(C55246xgN c55246xgN) {
        return c55246xgN.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AYXKKw);
    }

    public final void copydefault(int i, boolean z) {
        android.view.View customView;
        TabLayout.Tab tabAt = getTabAt(i);
        android.view.View viewFindViewWithTag = (tabAt == null || (customView = tabAt.getCustomView()) == null) ? null : customView.findViewWithTag("red_dot_tag");
        if (viewFindViewWithTag != null) {
            viewFindViewWithTag.setVisibility(z ? 0 : 8);
        }
    }

    @Override // o.AbstractC55238xgF
    public TabLayout.Tab copydefault(@NotNull TabLayout.Tab tab, int i, int i2) {
        C55380xip c55380xipCopydefault;
        Intrinsics.checkNotNullParameter(tab, "");
        android.view.View customView = tab.getCustomView();
        C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
        if (c54989xbV != null && (c55380xipCopydefault = c54989xbV.copydefault()) != null) {
            c55380xipCopydefault.setBadgeNumber(i, i2);
        }
        return tab;
    }

    public final void setContainer(@NotNull C55244xgL c55244xgL) {
        Intrinsics.checkNotNullParameter(c55244xgL, "");
        setContainer$OKUILib_uilib(c55244xgL);
    }

    public final void setContentInset(int i, int i2) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setPaddingRelative(i, childAt.getPaddingTop(), i2, childAt.getPaddingBottom());
        }
    }

    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> djBIcL() {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            return new kotlin.Pair<>(java.lang.Integer.valueOf(childAt.getPaddingStart()), java.lang.Integer.valueOf(childAt.getPaddingEnd()));
        }
        return new kotlin.Pair<>(0, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TabLayout.TabView tabView;
        if (copydefault().DbNXlk()) {
            if (getTabCount() > 1) {
                kotlin.Pair<java.lang.Integer, java.lang.Integer> pairDjBIcL = djBIcL();
                int measuredWidth = (getMeasuredWidth() - pairDjBIcL.getFirst().intValue()) - pairDjBIcL.getSecond().intValue();
                int tabCount = getTabCount();
                for (int i5 = 0; i5 < tabCount; i5++) {
                    TabLayout.Tab tabAt = getTabAt(i5);
                    if (tabAt != null) {
                        measuredWidth -= tabAt.view.getMeasuredWidth();
                    }
                }
                if (measuredWidth > 0) {
                    int tabCount2 = measuredWidth / (getTabCount() - 1);
                    int tabCount3 = getTabCount();
                    for (int i6 = 1; i6 < tabCount3; i6++) {
                        TabLayout.Tab tabAt2 = getTabAt(i6);
                        if (tabAt2 != null && (tabView = tabAt2.view) != null) {
                            ViewGroup.LayoutParams layoutParams = tabView.getLayoutParams();
                            if (layoutParams != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.setMarginStart(tabCount2);
                                tabView.setLayoutParams(marginLayoutParams);
                            } else {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                        }
                    }
                }
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // o.AbstractC55238xgF
    public TabLayout.Tab EZpvd(@NotNull TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setPaddingRelative(copydefault().djBIcL(), 0, copydefault().djBIcL(), 0);
        tab.setCustomView(KWHzl(copydefault().copydefault()));
        return tab;
    }

    public final C54989xbV KWHzl(int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C54989xbV c54989xbV = new C54989xbV(context, null, 0, 6, null);
        c54989xbV.setOKDSSize(i);
        c54989xbV.setStyle(copydefault().OLrzqt());
        android.view.View view = new android.view.View(c54989xbV.getContext());
        view.setTag("red_dot_tag");
        view.setBackgroundResource(C52761wXj.TaskDescription.QXDzTk);
        view.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(EZpvd(), EZpvd());
        layoutParams.topToTop = 0;
        layoutParams.endToEnd = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = c54989xbV.getResources().getDimensionPixelSize(i == -6 ? C52761wXj.StateListAnimator.values : C52761wXj.StateListAnimator.gEmmrt);
        if (i == -5) {
            layoutParams.setMarginEnd(c54989xbV.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AhwBna));
        }
        c54989xbV.addView(view, layoutParams);
        return c54989xbV;
    }

    public static /* synthetic */ void updateTabAppearance$default(C55246xgN c55246xgN, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c55246xgN.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        if (z) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iEZpvd = new C52771wXt(context).EZpvd() - copydefault().djBIcL();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = copydefault().valueOf();
                setLayoutParams(layoutParams);
                setContentInset(iEZpvd, iEZpvd);
                int tabCount = getTabCount();
                for (int i = 0; i < tabCount; i++) {
                    TabLayout.Tab tabAt = getTabAt(i);
                    if (tabAt != null) {
                        tabAt.view.setPaddingRelative(copydefault().djBIcL(), 0, copydefault().djBIcL(), 0);
                        android.view.View customView = tabAt.getCustomView();
                        C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
                        if (c54989xbV != null) {
                            c54989xbV.setOKDSSize(copydefault().copydefault());
                        }
                    }
                }
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int tabCount2 = getTabCount();
        for (int i2 = 0; i2 < tabCount2; i2++) {
            TabLayout.Tab tabAt2 = getTabAt(i2);
            if (tabAt2 != null) {
                android.view.View customView2 = tabAt2.getCustomView();
                C54989xbV c54989xbV2 = customView2 instanceof C54989xbV ? (C54989xbV) customView2 : null;
                if (c54989xbV2 != null) {
                    c54989xbV2.setStyle(copydefault().OLrzqt());
                }
            }
        }
    }
}
