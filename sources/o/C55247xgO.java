package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.okinc.uilab.util.SpanUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55247xgO extends AbstractC55238xgF implements InterfaceC55066xct {
    public final android.graphics.drawable.Drawable AEQbTJ;
    public int AhwBna;
    public int AuCTel;
    public boolean EZpvd;
    public int KWHzl;
    public boolean OLrzqt;
    public android.graphics.drawable.Drawable copydefault;
    public final TabLayout.OnTabSelectedListener fARcdN;
    public final C55255xgW valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55247xgO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55247xgO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlwaysShowExtraView$OKUILib_uilib(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasIndicator$OKUILib_uilib(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStyle$OKUILib_uilib(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabSize$OKUILib_uilib(int i) {
        this.AuCTel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55255xgW valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.DcqEDu int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.xgO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55247xgO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.DcqEDu : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55247xgO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = 5;
        C55255xgW c55255xgW = new C55255xgW(this);
        this.valueOf = c55255xgW;
        this.AuCTel = 44;
        this.fARcdN = new ActionBar();
        if (attributeSet != null) {
            InterfaceC52764wXm.Application.loadFromAttributes$default(c55255xgW, attributeSet, i, 0, 4, null);
        }
        setInlineLabel(true);
        this.AEQbTJ = getTabSelectedIndicator();
        setTabMode(0);
        addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: o.xgO.3
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                android.view.View customView;
                android.widget.TextView textView;
                if (tab == null || (customView = tab.getCustomView()) == null || (textView = (android.widget.TextView) customView.findViewById(android.R.id.text1)) == null) {
                    return;
                }
                AbstractC55238xgF.updateTextAppearance$OKUILib_uilib$default(C55247xgO.this, textView, null, true, 1, null);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                android.view.View customView;
                android.widget.TextView textView;
                if (tab == null || (customView = tab.getCustomView()) == null || (textView = (android.widget.TextView) customView.findViewById(android.R.id.text1)) == null) {
                    return;
                }
                AbstractC55238xgF.updateTextAppearance$OKUILib_uilib$default(C55247xgO.this, textView, null, true, 1, null);
            }
        });
    }

    public final void setExtraViewDrawable$OKUILib_uilib(android.graphics.drawable.Drawable drawable) {
        this.copydefault = drawable;
        if (drawable != null) {
            addOnTabSelectedListener(this.fARcdN);
        } else {
            removeOnTabSelectedListener(this.fARcdN);
        }
    }

    public void setOkdsTabGravity(int i) {
        this.KWHzl = i;
        setTabMode(i == 0 ? 0 : 1);
        setTabGravity(i);
    }

    /* JADX INFO: renamed from: o.xgO$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            if (tab.getPosition() != C55247xgO.this.getTabCount() - 1 || C55247xgO.this.copydefault() == null) {
                return;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(tab.getText())).toString() + " ");
            android.graphics.drawable.Drawable drawableCopydefault = C55247xgO.this.copydefault();
            Intrinsics.copydefault(drawableCopydefault);
            spannableString.setSpan(new SpanUtils.Activity(drawableCopydefault, 2), spannableString.length() + (-1), spannableString.length(), 17);
            tab.setText(spannableString);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            if (tab.getPosition() != C55247xgO.this.getTabCount() - 1 || C55247xgO.this.EZpvd() || C55247xgO.this.copydefault() == null) {
                return;
            }
            tab.setText(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(tab.getText())).toString());
            android.view.View customView = tab.getCustomView();
            if (customView != null) {
                customView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
        }
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        KWHzl(i);
        AhwBna();
    }

    public void setOKDSIndicator(boolean z) {
        this.OLrzqt = z;
        if (!z) {
            setSelectedTabIndicator((android.graphics.drawable.Drawable) null);
        } else {
            setSelectedTabIndicator(this.AEQbTJ);
        }
        invalidate();
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.AuCTel;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C55298xhM.OLrzqt(i3, context), 1073741824));
    }

    @Override // o.AbstractC55238xgF
    public TabLayout.Tab EZpvd(@NotNull TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "");
        TabLayout.Tab customView = tab.setCustomView(C52761wXj.Fragment.QbewEr);
        Intrinsics.checkNotNullExpressionValue(customView, "");
        android.view.View customView2 = customView.getCustomView();
        if (customView2 != null) {
            OLrzqt(customView2);
        }
        return customView;
    }

    public final void KWHzl(int i) {
        C55252xgT c55252xgTAYXKKw;
        int i2 = this.AhwBna;
        if (i2 == 6 || i2 == 7) {
            return;
        }
        this.AuCTel = i;
        setTabTextAppearance$OKUILib_uilib(C52761wXj.LoaderManager.OxVOHk);
        int i3 = this.AuCTel;
        if (i3 == 24) {
            c55252xgTAYXKKw = this.valueOf.AYXKKw();
        } else if (i3 == 36) {
            c55252xgTAYXKKw = this.valueOf.OLrzqt();
        } else if (i3 != 44 && i3 == 48) {
            c55252xgTAYXKKw = this.valueOf.AEQbTJ();
        } else {
            c55252xgTAYXKKw = this.valueOf.EZpvd();
        }
        setIconSize$OKUILib_uilib(c55252xgTAYXKKw.OLrzqt());
        setIconTextMargin$OKUILib_uilib(c55252xgTAYXKKw.copydefault());
        setTabTextAppearance$OKUILib_uilib(c55252xgTAYXKKw.AEQbTJ());
        setTabTextSelectedAppearance$OKUILib_uilib(c55252xgTAYXKKw.djBIcL());
        setTabTextSize$OKUILib_uilib(c55252xgTAYXKKw.AhwBna());
        setTabSelectIconMarginStart$OKUILib_uilib(c55252xgTAYXKKw.KWHzl());
        setTabSelectIconSize$OKUILib_uilib(c55252xgTAYXKKw.EZpvd());
    }

    public final void AhwBna() {
        android.view.View customView;
        android.view.View childAt = getChildAt(0);
        Intrinsics.copydefault(childAt, "");
        int childCount = ((android.widget.LinearLayout) childAt).getChildCount();
        for (int i = 0; i < childCount; i++) {
            TabLayout.Tab tabAt = getTabAt(i);
            if (tabAt != null && (customView = tabAt.getCustomView()) != null) {
                OLrzqt(customView);
            }
        }
    }

    public final void EZpvd(C55380xip c55380xip) {
        int i = this.AuCTel;
        if (i == 24 || i == 36 || i == 44) {
            c55380xip.setOKDSSize(-5);
        } else {
            if (i != 48) {
                return;
            }
            c55380xip.setOKDSSize(-4);
        }
    }

    public final void OLrzqt(android.view.View view) {
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(android.R.id.icon);
        if (imageView != null) {
            copydefault(imageView);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.text1);
        if (textView != null) {
            AbstractC55238xgF.updateTextAppearance$OKUILib_uilib$default(this, textView, null, true, 1, null);
        }
        android.view.View viewFindViewById = view.findViewById(C52761wXj.FragmentManager.DbNXlk);
        if (viewFindViewById != null) {
            KWHzl(viewFindViewById);
        }
        C55380xip c55380xip = (C55380xip) view.findViewById(C52761wXj.FragmentManager.fHqPtx);
        if (c55380xip != null) {
            EZpvd(c55380xip);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(C52761wXj.FragmentManager.zlvcHA);
        if (imageView2 != null) {
            AbstractC55238xgF.updateIconTint$OKUILib_uilib$default(this, imageView2, null, 1, null);
        }
    }

    @Override // o.AbstractC55238xgF
    public TabLayout.Tab copydefault(@NotNull TabLayout.Tab tab, int i, int i2) {
        C55380xip c55380xip;
        Intrinsics.checkNotNullParameter(tab, "");
        android.view.View customView = tab.getCustomView();
        if (customView != null && (c55380xip = (C55380xip) customView.findViewById(C52761wXj.FragmentManager.fHqPtx)) != null) {
            c55380xip.setBadgeNumber(i, i2);
        }
        return tab;
    }

    private final void copydefault(android.widget.ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = KWHzl();
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = KWHzl();
            imageView.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void KWHzl(android.view.View view) {
        int i = this.AuCTel;
        if (i == 24 || i == 36) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams.height = C55298xhM.OLrzqt(4, context);
                android.content.Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                layoutParams.width = C55298xhM.OLrzqt(4, context2);
                view.setLayoutParams(layoutParams);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (i == 44 || i == 48) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                android.content.Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                layoutParams2.height = C55298xhM.OLrzqt(8, context3);
                android.content.Context context4 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                layoutParams2.width = C55298xhM.OLrzqt(8, context4);
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
