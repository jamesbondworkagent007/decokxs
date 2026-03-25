package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.immomo.mls.fun.ud.view.viewpager.UDViewPagerAppbarLayoutBehavior;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C38420pYc;
import o.C41431qqg;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pYc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38420pYc extends qXZ {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public android.view.View AEQbTJ;
    public final boolean AYXKKw;
    public android.view.ViewPropertyAnimator AhwBna;
    public int AkhnZx;
    public boolean AuCTel;
    public final StateListAnimator DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public android.view.View djBIcL;
    public int fetchVPNInfo;
    public final boolean gEmmrt;
    public boolean isConnected;
    public android.view.View valueOf;
    public C7779aqK values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38420pYc(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38420pYc(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:69) call: o.pYc.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C38420pYc(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38420pYc(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setPadding(getPaddingLeft(), C33570myu.OLrzqt(), getPaddingRight(), getPaddingBottom());
        this.AYXKKw = true;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.pXY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38420pYc.EZpvd(this.AEQbTJ, context);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pYg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38420pYc.KWHzl(this.EZpvd, context);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.pYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38420pYc.values(this.EZpvd);
            }
        });
        this.DbNXlk = new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.pYc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pYc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final InterfaceC7298ahG gEmmrt() {
        return C7323ahf.KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View djBIcL() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = findViewById(qZH.StateListAnimator.aQtmcU);
        }
        return this.AEQbTJ;
    }

    private final android.view.View AhwBna() {
        android.view.View view = this.valueOf;
        if (view == null || (view != null && !view.isAttachedToWindow())) {
            this.valueOf = findViewWithTag("market_feed_root_header");
        }
        return this.valueOf;
    }

    private final android.view.View valueOf() {
        android.view.View view = this.djBIcL;
        if (view == null || (view != null && !view.isAttachedToWindow())) {
            this.djBIcL = findViewWithTag("market_feed_news_header");
        }
        return this.djBIcL;
    }

    private final C7779aqK AYXKKw() {
        C7779aqK c7779aqK = this.values;
        if (c7779aqK == null || c7779aqK.isAttachedToWindow()) {
            return this.values;
        }
        return null;
    }

    /* JADX INFO: renamed from: o.pYc$Dialog */
    public static final class Dialog extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ int KWHzl;

        public Dialog(int i) {
            this.KWHzl = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            android.view.View viewDjBIcL = C38420pYc.this.djBIcL();
            if (viewDjBIcL == null || viewDjBIcL.getTranslationY() == 0.0f) {
                return;
            }
            int i3 = this.KWHzl;
            if (i == i3 - 1) {
                C38420pYc.this.AEQbTJ((-r5.EZpvd(viewDjBIcL)) * f, false);
            } else if (i != i3) {
                C38420pYc.this.AEQbTJ(0.0f, true);
            } else {
                if (viewDjBIcL.getTranslationY() == 0.0f) {
                    return;
                }
                C38420pYc.this.AEQbTJ((-r0.EZpvd(viewDjBIcL)) * (1 - f), false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            C38420pYc.this.AEQbTJ(0.0f, true);
            if (i == this.KWHzl) {
                C38420pYc.this.copydefault();
            }
        }
    }

    public final void setupDiscoverRootViewPagerScrollListener$OKMarket_market_impl(@NotNull Lifecycle lifecycle, int i, @NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Intrinsics.checkNotNullParameter(viewPager2, "");
        viewPager2.registerOnPageChangeCallback(new Dialog(i));
        AEQbTJ(lifecycle);
        AkhnZx();
    }

    public final void copydefault(@NotNull C7545alp c7545alp) {
        Intrinsics.checkNotNullParameter(c7545alp, "");
        if (this.AYXKKw) {
            OLrzqt(c7545alp);
        } else {
            KWHzl(c7545alp);
        }
    }

    /* JADX INFO: renamed from: o.pYc$Activity */
    public static final class Activity implements UDViewPagerAppbarLayoutBehavior.Application {
        public Activity() {
        }

        @Override // com.immomo.mls.fun.ud.view.viewpager.UDViewPagerAppbarLayoutBehavior.Application
        public void copydefault(int i, int i2, int i3) {
            C41298qoF.AEQbTJ.AEQbTJ("MarketDiscoverImmersiveContainer", "onNestedPreScroll, dx: " + i + ", dy: " + i2 + ", type: " + i3);
            C38420pYc.this.AEQbTJ(i2);
        }

        @Override // com.immomo.mls.fun.ud.view.viewpager.UDViewPagerAppbarLayoutBehavior.Application
        public void AEQbTJ(int i, boolean z) {
            C41298qoF.AEQbTJ.AEQbTJ("MarketDiscoverImmersiveContainer", "onStopNestedScroll, type: " + i + ", isNestedFling: " + z);
            if (z) {
                return;
            }
            C38420pYc.this.AEQbTJ();
        }

        @Override // com.immomo.mls.fun.ud.view.viewpager.UDViewPagerAppbarLayoutBehavior.Application
        public void copydefault(int i) {
            C41298qoF.AEQbTJ.AEQbTJ("MarketDiscoverImmersiveContainer", "onStartNestedScroll, type: " + i);
            android.view.ViewPropertyAnimator viewPropertyAnimator = C38420pYc.this.AhwBna;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            C38420pYc.this.AhwBna = null;
        }

        @Override // com.immomo.mls.fun.ud.view.viewpager.UDViewPagerAppbarLayoutBehavior.Application
        public void AEQbTJ(int i, int i2, int i3) {
            C41298qoF.AEQbTJ.AEQbTJ("MarketDiscoverImmersiveContainer", "onSetTopAndBottomOffset, offset: " + i + ", headerHeight: " + i2 + ", headerMiniHeight: " + i3);
            C38420pYc.this.AkhnZx = i2;
            C38420pYc.this.fetchVPNInfo = i;
        }
    }

    public final void KWHzl(C7545alp c7545alp) {
        PagerAdapter adapter = c7545alp.getAdapter();
        C7465akO c7465akO = adapter instanceof C7465akO ? (C7465akO) adapter : null;
        if (c7465akO != null && c7465akO.getCount() > 0) {
            android.view.View viewKWHzl = c7465akO.KWHzl(c7545alp.getCurrentItem());
            android.view.ViewGroup viewGroup = viewKWHzl instanceof android.view.ViewGroup ? (android.view.ViewGroup) viewKWHzl : null;
            if (viewGroup == null) {
                return;
            }
            android.view.View viewCopydefault = C41431qqg.copydefault(viewGroup, Application.OLrzqt);
            C7781aqM c7781aqM = (C7781aqM) (viewCopydefault instanceof C7781aqM ? viewCopydefault : null);
            if (c7781aqM == null) {
                return;
            }
            if (c7781aqM.getTag() == null || !(c7781aqM.getTag() instanceof RecyclerView.OnScrollListener)) {
                ActionBar actionBar = new ActionBar();
                c7781aqM.addOnScrollListener(actionBar);
                c7781aqM.setTag(actionBar);
            }
        }
    }

    /* JADX INFO: renamed from: o.pYc$ActionBar */
    public static final class ActionBar extends RecyclerView.OnScrollListener {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 0) {
                C38420pYc.this.AEQbTJ();
                recyclerView.removeOnScrollListener(this);
                recyclerView.setTag(null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            C38420pYc.this.AEQbTJ(i2);
        }
    }

    public final int EZpvd(android.view.View view) {
        int height = view.getHeight();
        android.view.View viewAhwBna = AhwBna();
        return height + (viewAhwBna != null ? viewAhwBna.getHeight() : 0);
    }

    public final void AEQbTJ() {
        android.view.View viewDjBIcL = djBIcL();
        if (viewDjBIcL == null) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "MarketDiscoverImmersiveContainer", "onStickyHeader ignore, discoverRootHeaderView is null", null, 4, null);
            return;
        }
        float f = viewDjBIcL.getTranslationY() < ((float) ((-EZpvd(viewDjBIcL)) / 2)) ? -EZpvd(viewDjBIcL) : 0.0f;
        C41298qoF.AEQbTJ.AEQbTJ("MarketDiscoverImmersiveContainer", "onStickyHeader, translationY: " + getTranslationY() + ", dstY: " + f);
        AEQbTJ(f, true);
    }

    public final void AEQbTJ(int i) {
        java.lang.Number numberValueOf;
        android.view.View viewDjBIcL = djBIcL();
        if (viewDjBIcL == null) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "MarketDiscoverImmersiveContainer", "onScrollingHeader ignore, discoverRootHeaderView is null", null, 4, null);
            return;
        }
        C41298qoF.AEQbTJ.AEQbTJ("MarketDiscoverImmersiveContainer", "onScrollingHeader, translationY: " + getTranslationY() + ", dy: " + i);
        float translationY = viewDjBIcL.getTranslationY() - ((float) i);
        if (translationY > 0.0f) {
            numberValueOf = 0;
        } else if (translationY < (-EZpvd(viewDjBIcL))) {
            numberValueOf = java.lang.Integer.valueOf(-EZpvd(viewDjBIcL));
        } else {
            numberValueOf = java.lang.Float.valueOf(translationY);
        }
        AEQbTJ(numberValueOf.floatValue(), false);
    }

    public static /* synthetic */ void updateHeaderViewTransition$default(C38420pYc c38420pYc, float f, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c38420pYc.AEQbTJ(f, z);
    }

    public final void AEQbTJ(final float f, boolean z) {
        final android.view.View viewDjBIcL = djBIcL();
        if (viewDjBIcL == null) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "MarketDiscoverImmersiveContainer", "updateHeaderViewTransition ignore, discoverRootHeaderView is null", null, 4, null);
            return;
        }
        C41298qoF.AEQbTJ.AEQbTJ("MarketDiscoverImmersiveContainer", "updateHeaderViewTransition, toY: " + f + ", anim: " + z);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.AhwBna;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.AhwBna = null;
        if (z) {
            final float translationY = viewDjBIcL.getTranslationY();
            final int i = this.fetchVPNInfo;
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = viewDjBIcL.animate();
            this.AhwBna = viewPropertyAnimatorAnimate;
            viewPropertyAnimatorAnimate.translationY(f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.pYf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    C38420pYc.copydefault(viewDjBIcL, this, translationY, f, i, valueAnimator);
                }
            }).start();
            return;
        }
        float fAbs = java.lang.Math.abs(viewDjBIcL.getTranslationY()) / EZpvd(viewDjBIcL);
        viewDjBIcL.setAlpha(1 - fAbs);
        viewDjBIcL.setTranslationY(f);
        copydefault(f, fAbs);
        AEQbTJ(EZpvd(viewDjBIcL), f);
        KWHzl(fAbs);
    }

    public static final void copydefault(android.view.View view, C38420pYc c38420pYc, float f, float f2, int i, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float fAbs = java.lang.Math.abs(view.getTranslationY()) / c38420pYc.EZpvd(view);
        view.setAlpha(1 - fAbs);
        c38420pYc.copydefault(view.getTranslationY(), fAbs);
        c38420pYc.AEQbTJ(c38420pYc.EZpvd(view), view.getTranslationY());
        c38420pYc.KWHzl(fAbs);
        c38420pYc.AEQbTJ(f, f2, view.getTranslationY(), i);
    }

    /* JADX INFO: renamed from: o.pYc$Application */
    public static final class Application implements Function1<android.view.View, java.lang.Boolean> {
        public static final Application OLrzqt = new Application();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return java.lang.Boolean.valueOf(view instanceof C7781aqM);
        }
    }

    public final void AEQbTJ(float f, float f2, float f3, int i) {
        if (f2 == 0.0f) {
            if (!this.AuCTel) {
                this.AuCTel = true;
            }
            C41298qoF.AEQbTJ.AEQbTJ("MarketDiscoverImmersiveContainer", "updateLuaAppBarTopOffset ignore, toY is 0");
            return;
        }
        if (f2 == f) {
            this.AuCTel = false;
            C41298qoF.AEQbTJ.AEQbTJ("MarketDiscoverImmersiveContainer", "updateLuaAppBarTopOffset ignore, toY is same as fromY: " + f2);
            return;
        }
        if (this.AkhnZx == 0) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "MarketDiscoverImmersiveContainer", "updateLuaAppBarTopOffset ignore, luaAppBarHeaderHeight is 0", null, 4, null);
            return;
        }
        float fAbs = java.lang.Math.abs(f2 - f);
        if (fAbs > 0.0f) {
            float fAbs2 = java.lang.Math.abs(f3 - f) / fAbs;
            float fAbs3 = java.lang.Math.abs(i);
            float fAbs4 = this.AkhnZx - java.lang.Math.abs(i);
            C7779aqK c7779aqKAYXKKw = AYXKKw();
            if (c7779aqKAYXKKw != null) {
                c7779aqKAYXKKw.setTopAndBottomOffset(yII.EZpvd(fAbs3 + (fAbs4 * fAbs2)));
            }
        }
    }

    public final void copydefault(float f, float f2) {
        android.view.View viewAhwBna = AhwBna();
        if (viewAhwBna == null) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "MarketDiscoverImmersiveContainer", "updateLuaFeedRootHeaderTransition ignore, feedRootHeaderView is null", null, 4, null);
        } else {
            viewAhwBna.setTranslationY(f);
            viewAhwBna.setAlpha(1 - f2);
        }
    }

    public final void AEQbTJ(int i, float f) {
        android.view.View viewValueOf = valueOf();
        if (viewValueOf == null) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "MarketDiscoverImmersiveContainer", "updateLuaFeedNewsHeaderTransition ignore, feedNewsHeaderView is null", null, 4, null);
            return;
        }
        int i2 = this.fetchVPNInfo;
        float fMax = 0.0f;
        if (i2 != 0) {
            float f2 = i;
            if (i2 == (-this.AkhnZx)) {
                fMax = f2 + f;
            } else {
                fMax = java.lang.Math.max(0.0f, (f2 + f) - (r3 + i2));
            }
        }
        viewValueOf.setTranslationY(fMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View EZpvd() {
        return (android.view.View) this.EZpvd.getValue();
    }

    public static final android.view.View EZpvd(C38420pYc c38420pYc, android.content.Context context) {
        int identifier = c38420pYc.getResources().getIdentifier("main_container", "id", context.getPackageName());
        android.app.Activity activityKWHzl = C41431qqg.KWHzl(c38420pYc);
        if (activityKWHzl != null) {
            return activityKWHzl.findViewById(identifier);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View KWHzl() {
        return (android.view.View) this.OLrzqt.getValue();
    }

    public static final android.view.View KWHzl(C38420pYc c38420pYc, android.content.Context context) {
        int identifier = c38420pYc.getResources().getIdentifier("btm_navi", "id", context.getPackageName());
        android.app.Activity activityKWHzl = C41431qqg.KWHzl(c38420pYc);
        if (activityKWHzl != null) {
            return activityKWHzl.findViewById(identifier);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View OLrzqt() {
        return (android.view.View) this.copydefault.getValue();
    }

    public static final android.view.View values(C38420pYc c38420pYc) {
        android.app.Activity activityKWHzl = C41431qqg.KWHzl(c38420pYc);
        android.view.View viewFindViewById = activityKWHzl != null ? activityKWHzl.findViewById(android.R.id.content) : null;
        android.view.ViewGroup viewGroup = viewFindViewById instanceof android.view.ViewGroup ? (android.view.ViewGroup) viewFindViewById : null;
        if (viewGroup != null) {
            return C41431qqg.copydefault(viewGroup, (Function1<? super android.view.View, java.lang.Boolean>) new Function1() { // from class: o.pYd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C38420pYc.KWHzl((android.view.View) obj));
                }
            });
        }
        return null;
    }

    public static final boolean KWHzl(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String simpleName = view.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) "TradeTabView", false, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(Lifecycle lifecycle) {
        if (this.gEmmrt) {
            lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.discover.features.feed.MarketDiscoverImmersiveContainer$registerLifecycleToUpdateAppBottomNavbar$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(LifecycleOwner lifecycleOwner) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    View viewEZpvd = this.KWHzl.EZpvd();
                    if (viewEZpvd != null) {
                        ViewGroup.LayoutParams layoutParams = viewEZpvd.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = 0;
                            viewEZpvd.setLayoutParams(marginLayoutParams);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onPause(LifecycleOwner lifecycleOwner) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate;
                    ViewPropertyAnimator viewPropertyAnimatorAlpha;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2;
                    ViewPropertyAnimator viewPropertyAnimatorAlpha2;
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    View viewEZpvd = this.KWHzl.EZpvd();
                    if (viewEZpvd != null) {
                        C38420pYc c38420pYc = this.KWHzl;
                        ViewGroup.LayoutParams layoutParams = viewEZpvd.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (int) C41431qqg.OLrzqt(c38420pYc, C32113mPz.StateListAnimator.AEQbTJ);
                            View viewKWHzl = c38420pYc.KWHzl();
                            if (viewKWHzl != null && (viewPropertyAnimatorAnimate2 = viewKWHzl.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(1.0f)) != null) {
                                viewPropertyAnimatorAlpha2.start();
                            }
                            View viewOLrzqt = c38420pYc.OLrzqt();
                            if (viewOLrzqt != null && (viewPropertyAnimatorAnimate = viewOLrzqt.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null) {
                                viewPropertyAnimatorAlpha.start();
                            }
                            viewEZpvd.setLayoutParams(marginLayoutParams);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.pYc$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public StateListAnimator() {
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            if (!C38420pYc.this.AuCTel) {
                return true;
            }
            C38420pYc.this.copydefault();
            return true;
        }
    }

    private final void AkhnZx() {
        if (gEmmrt() == null || this.isConnected) {
            return;
        }
        InterfaceC7298ahG interfaceC7298ahGGEmmrt = gEmmrt();
        Intrinsics.copydefault(interfaceC7298ahGGEmmrt);
        interfaceC7298ahGGEmmrt.EZpvd("MarketFeeds_Tab_Reset_To_Initial", this.DbNXlk, "MarketFeeds_Tab_Reset_To_Initial");
        this.isConnected = true;
    }

    public final void KWHzl(float f) {
        if (this.gEmmrt) {
            float f2 = 1 - (f * 0.4f);
            android.view.View viewKWHzl = KWHzl();
            if (viewKWHzl != null) {
                viewKWHzl.setAlpha(f2);
            }
            android.view.View viewOLrzqt = OLrzqt();
            if (viewOLrzqt != null) {
                viewOLrzqt.setAlpha(f2);
            }
        }
    }

    public final void copydefault() {
        C41298qoF c41298qoF = C41298qoF.AEQbTJ;
        c41298qoF.AEQbTJ("MarketDiscoverImmersiveContainer", "resetHeadersToInitialPosition called");
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.AhwBna;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.AhwBna = null;
        C7779aqK c7779aqKAYXKKw = AYXKKw();
        if (c7779aqKAYXKKw != null) {
            c7779aqKAYXKKw.setTopAndBottomOffset(0);
        }
        this.fetchVPNInfo = 0;
        android.view.View viewDjBIcL = djBIcL();
        if (viewDjBIcL != null) {
            viewDjBIcL.setTranslationY(0.0f);
            viewDjBIcL.setAlpha(1.0f);
            android.view.View viewAhwBna = AhwBna();
            if (viewAhwBna != null) {
                viewAhwBna.setTranslationY(0.0f);
                viewAhwBna.setAlpha(1.0f);
            }
            android.view.View viewValueOf = valueOf();
            if (viewValueOf != null) {
                viewValueOf.setTranslationY(0.0f);
                c41298qoF.AEQbTJ("MarketDiscoverImmersiveContainer", "resetHeadersToInitialPosition: feedNewsHeaderView reset to translationY = 0");
            }
            KWHzl(0.0f);
            post(new java.lang.Runnable() { // from class: o.pYe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C38420pYc.fetchVPNInfo(this.EZpvd);
                }
            });
        } else {
            C41298qoF.w$default(c41298qoF, "MarketDiscoverImmersiveContainer", "resetHeadersToInitialPosition: discoverRootHeaderView is null", null, 4, null);
        }
        c41298qoF.AEQbTJ("MarketDiscoverImmersiveContainer", "resetHeadersToInitialPosition completed");
    }

    public static final void fetchVPNInfo(C38420pYc c38420pYc) {
        c38420pYc.AEQbTJ(0.0f, true);
    }

    public final void OLrzqt(C7545alp c7545alp) {
        android.view.View view;
        android.view.ViewParent parent = c7545alp.getParent();
        while (true) {
            if (parent == null) {
                view = null;
                break;
            }
            if (parent instanceof C7779aqK) {
                view = (android.view.View) parent;
                if (view instanceof C7779aqK) {
                    break;
                }
            }
            parent = parent.getParent();
        }
        C7779aqK c7779aqK = (C7779aqK) view;
        if (c7779aqK != null) {
            this.values = c7779aqK;
            c7779aqK.setUDViewPagerNestedScrollListener(new Activity());
        } else {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "MarketDiscoverImmersiveContainer", "findMLNAppBarBehaviorAndSetScrollingListener ignore, LuaViewPagerContainer is null", null, 4, null);
        }
    }
}
