package o;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55244xgL extends android.widget.RelativeLayout implements InterfaceC55066xct {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public int AEQbTJ;
    public int AYXKKw;
    public boolean AhwBna;
    public final C54961xau KWHzl;
    public int OLrzqt;
    public boolean copydefault;
    public final C55065xcs djBIcL;
    public int gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55244xgL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55244xgL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChipSize$OKUILib_uilib(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChipStyle$OKUILib_uilib(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatic$OKUILib_uilib(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabMarginHorizontal$OKUILib_uilib(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewHeight$OKUILib_uilib(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:50) call: o.xgL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55244xgL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55244xgL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = true;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.xgM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55244xgL.copydefault(this.EZpvd);
            }
        });
        C54961xau c54961xauKWHzl = C54961xau.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54961xauKWHzl, "");
        this.KWHzl = c54961xauKWHzl;
        C55065xcs c55065xcs = new C55065xcs(this, -6);
        this.djBIcL = c55065xcs;
        this.OLrzqt = -6;
        c54961xauKWHzl.OLrzqt.setContainer(this);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.YFmri);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            boolean z = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.aGOrKO, 0) == 1;
            this.AhwBna = z;
            if (z) {
                setStyle(1);
            } else {
                setStyle(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.Rtjmuc, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
            InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, 0, 0, 6, null);
            setOKDSSize(c55065xcs.copydefault());
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int gEmmrt() {
        return this.KWHzl.OLrzqt.getSelectedTabPosition();
    }

    public final int AhwBna() {
        return this.KWHzl.OLrzqt.getTabCount();
    }

    public final void setIncludeVerticalPadding(boolean z) {
        this.copydefault = z;
        setOKDSSize(AEQbTJ());
    }

    /* JADX INFO: renamed from: o.xgL$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                C55244xgL.this.KWHzl.OLrzqt.copydefault(tab.getPosition(), false);
            }
        }
    }

    private final TabLayout.OnTabSelectedListener AkhnZx() {
        return (TabLayout.OnTabSelectedListener) this.valueOf.getValue();
    }

    public static final TaskDescription copydefault(C55244xgL c55244xgL) {
        return c55244xgL.new TaskDescription();
    }

    public final void EZpvd(int i) {
        this.KWHzl.OLrzqt.copydefault(i, getVisibility() == 0);
    }

    public static /* synthetic */ TabLayout.Tab updateBadgeCount$default(C55244xgL c55244xgL, TabLayout.Tab tab, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 99;
        }
        return c55244xgL.OLrzqt(tab, i, i2);
    }

    public final TabLayout.Tab OLrzqt(@NotNull TabLayout.Tab tab, int i, int i2) {
        Intrinsics.checkNotNullParameter(tab, "");
        return this.KWHzl.OLrzqt.copydefault(tab, i, i2);
    }

    public static /* synthetic */ void updateBadgeCount$default(C55244xgL c55244xgL, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 99;
        }
        c55244xgL.EZpvd(i, i2, i3);
    }

    public final void EZpvd(int i, int i2, int i3) {
        this.KWHzl.OLrzqt.EZpvd(i, i2, i3);
    }

    public final void setMode(int i) {
        boolean z = i == 1;
        this.AhwBna = z;
        if (z) {
            setStyle(1);
        }
        setOKDSSize(AEQbTJ());
    }

    public final TabLayout.Tab KWHzl(int i) {
        return this.KWHzl.OLrzqt.getTabAt(i);
    }

    public final void AEQbTJ(@NotNull TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "");
        this.KWHzl.OLrzqt.addTab(tab);
    }

    public final void copydefault(@NotNull TabLayout.Tab tab, boolean z) {
        Intrinsics.checkNotNullParameter(tab, "");
        this.KWHzl.OLrzqt.addTab(tab, z);
    }

    public final void EZpvd(TabLayout.Tab tab) {
        this.KWHzl.OLrzqt.selectTab(tab);
    }

    public final void AEQbTJ(int i) {
        this.KWHzl.OLrzqt.selectTab(KWHzl(i));
    }

    public final void fetchVPNInfo() {
        this.KWHzl.OLrzqt.removeAllTabs();
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        this.KWHzl.OLrzqt.setupWithViewPager(viewPager);
    }

    public final void EZpvd(@NotNull TabLayout.OnTabSelectedListener onTabSelectedListener) {
        Intrinsics.checkNotNullParameter(onTabSelectedListener, "");
        this.KWHzl.OLrzqt.removeOnTabSelectedListener(onTabSelectedListener);
    }

    public final void copydefault(@NotNull TabLayout.OnTabSelectedListener onTabSelectedListener) {
        Intrinsics.checkNotNullParameter(onTabSelectedListener, "");
        this.KWHzl.OLrzqt.addOnTabSelectedListener(onTabSelectedListener);
    }

    public final void KWHzl() {
        this.KWHzl.OLrzqt.clearOnTabSelectedListeners();
    }

    public final TabLayout.Tab values() {
        return this.KWHzl.OLrzqt.newTab();
    }

    public final TabLayout AYXKKw() {
        C55246xgN c55246xgN = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55246xgN, "");
        return c55246xgN;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.KWHzl.OLrzqt.addOnTabSelectedListener(AkhnZx());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.KWHzl.OLrzqt.removeOnTabSelectedListener(AkhnZx());
    }

    public int AEQbTJ() {
        return this.djBIcL.copydefault();
    }

    public final int OLrzqt(int i) {
        int i2 = this.copydefault ? 16 : 0;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C55298xhM.OLrzqt(i + i2, context);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xgN.updateTabAppearance$default(o.xgN, boolean, int, java.lang.Object):void */
    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        if (i != -20) {
            if (i == -6) {
                this.gEmmrt = this.AhwBna ? 0 : C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT) / 2;
                this.OLrzqt = -6;
                this.AYXKKw = OLrzqt(24);
            } else if (i == -5) {
                this.gEmmrt = this.AhwBna ? 0 : C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT) / 2;
                this.OLrzqt = -5;
                this.AYXKKw = OLrzqt(32);
            } else {
                throw new java.lang.IllegalArgumentException("Invalid size: " + i);
            }
        } else if (this.AEQbTJ == 2) {
            this.gEmmrt = this.AhwBna ? 0 : C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT) / 2;
            this.OLrzqt = -20;
            this.AYXKKw = OLrzqt(28);
        }
        this.djBIcL.setOKDSSize(i);
        C55246xgN.updateTabAppearance$default(this.KWHzl.OLrzqt, false, 1, null);
    }

    public final void setStyle(int i) {
        this.AEQbTJ = i;
        this.KWHzl.OLrzqt.EZpvd(false);
    }

    public final void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.widget.LinearLayout linearLayoutEZpvd = EZpvd();
        linearLayoutEZpvd.removeAllViews();
        if (view.getParent() != null) {
            android.view.ViewParent parent = view.getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(view);
        }
        linearLayoutEZpvd.setVisibility(0);
        linearLayoutEZpvd.addView(view);
    }

    public final android.widget.LinearLayout EZpvd() {
        android.widget.LinearLayout linearLayout = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.AYXKKw, 1073741824));
    }

    /* JADX INFO: renamed from: o.xgL$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
