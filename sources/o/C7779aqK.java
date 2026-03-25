package o;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.immomo.mls.fun.ud.view.UDViewPager;
import com.immomo.mls.fun.ud.view.viewpager.AppbarLayoutBehavior;
import com.immomo.mls.fun.ud.view.viewpager.UDViewPagerAppbarLayoutBehavior;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.C52761wXj;
import o.InterfaceC7383aim;
import o.InterfaceC7534ale;
import org.luaj.vm2.LuaFunction;

/* JADX INFO: renamed from: o.aqK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7779aqK extends android.widget.FrameLayout implements InterfaceC7534ale<UDViewPager>, InterfaceC7472akV, InterfaceC57903yrG {
    public AppbarLayoutBehavior AEQbTJ;
    public RecyclerView AYXKKw;
    public int[] AhwBna;
    public int AkhnZx;
    public C7551alv AuCTel;
    public boolean DbNXlk;
    public C7499akw EZpvd;
    public CoordinatorLayout KWHzl;
    public C7545alp OLrzqt;
    public UDViewPagerAppbarLayoutBehavior copydefault;
    public AppBarLayout djBIcL;
    public C7778aqJ ejfBZ;
    public boolean fARcdN;
    public UDViewPager fIwbmz;
    public UDViewPager.StateListAnimator fJNWhG;
    public float fetchVPNInfo;
    public android.view.ViewGroup gEmmrt;
    public int[] isConnected;
    public int valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AppBarLayout AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public UDViewPager getUserdata() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(UDViewPager.StateListAnimator stateListAnimator) {
        this.fJNWhG = stateListAnimator;
    }

    @Override // o.InterfaceC7472akV
    public boolean OLrzqt() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7545alp isConnected() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setParentIsViewPager2(int i, int i2) {
        this.DbNXlk = true;
        this.valueOf = i;
        this.AkhnZx = i2;
    }

    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.view.ViewGroup valueOf() {
        return this.gEmmrt;
    }

    public C7779aqK(@androidx.annotation.NonNull android.content.Context context, UDViewPager uDViewPager) {
        super(context);
        this.AYXKKw = null;
        this.isConnected = new int[2];
        this.AhwBna = new int[2];
        this.fetchVPNInfo = 0.0f;
        this.values = 0.0f;
        this.fARcdN = true;
        this.fIwbmz = uDViewPager;
        C7545alp c7545alp = new C7545alp(context, uDViewPager);
        this.OLrzqt = c7545alp;
        addView(c7545alp, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setTopAndBottomOffset(int i) {
        try {
            AppBarLayout appBarLayout = this.djBIcL;
            if (appBarLayout == null) {
                return;
            }
            if (i == 0) {
                appBarLayout.setExpanded(true, true);
            } else {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
                if (behavior instanceof AppBarLayout.Behavior) {
                    ((AppBarLayout.Behavior) behavior).setTopAndBottomOffset(-i);
                }
            }
        } catch (java.lang.Exception e) {
            C7870arw.KWHzl(e, new java.lang.Object[0]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        getLocationOnScreen(this.isConnected);
    }

    public void KWHzl(AppbarLayoutBehavior.ActionBar actionBar) {
        AppbarLayoutBehavior appbarLayoutBehavior = this.AEQbTJ;
        if (appbarLayoutBehavior != null) {
            appbarLayoutBehavior.AEQbTJ(actionBar);
        }
    }

    public void AEQbTJ(boolean z) {
        CoordinatorLayout coordinatorLayout = this.KWHzl;
        if (coordinatorLayout instanceof C7939atL) {
            ((C7939atL) coordinatorLayout).setSupportHorizontal(z);
        }
    }

    public void setScrollDuration(int i) {
        C7545alp c7545alp = this.OLrzqt;
        if (c7545alp != null) {
            c7545alp.setViewPagerScroller(i);
        }
    }

    public void AEQbTJ(android.view.ViewGroup viewGroup, boolean z) {
        if (z) {
            this.KWHzl = new C7939atL(getContext());
        } else {
            this.KWHzl = new CoordinatorLayout(getContext());
        }
        this.KWHzl.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        CoordinatorLayout.LayoutParams layoutParamsCopydefault = C7823arB.copydefault();
        this.AEQbTJ = new AppbarLayoutBehavior();
        UDViewPager uDViewPager = this.fIwbmz;
        if (uDViewPager != null && uDViewPager.dxcTrN()) {
            UDViewPagerAppbarLayoutBehavior uDViewPagerAppbarLayoutBehavior = new UDViewPagerAppbarLayoutBehavior();
            this.copydefault = uDViewPagerAppbarLayoutBehavior;
            uDViewPagerAppbarLayoutBehavior.KWHzl(this.fIwbmz.finit());
        }
        layoutParamsCopydefault.setBehavior(this.AEQbTJ);
        removeAllViews();
        this.OLrzqt.setLayoutParams(layoutParamsCopydefault);
        if (this.OLrzqt.getParent() != null && (this.OLrzqt.getParent() instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) this.OLrzqt.getParent()).removeView(this.OLrzqt);
        }
        this.KWHzl.addView(this.OLrzqt);
        addView(this.KWHzl);
        AppBarLayout appBarLayout = new AppBarLayout(getContext());
        this.djBIcL = appBarLayout;
        appBarLayout.setBackgroundColor(0);
        this.djBIcL.setTargetElevation(0.0f);
        setLayoutParams(this.djBIcL, this.copydefault);
        this.djBIcL.addView(viewGroup);
        this.gEmmrt = viewGroup;
        this.KWHzl.addView(this.djBIcL, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    public final void setLayoutParams(android.view.View view, UDViewPagerAppbarLayoutBehavior uDViewPagerAppbarLayoutBehavior) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        boolean z = true;
        if (layoutParams == null) {
            layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1 && ((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
            z = false;
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        }
        if (uDViewPagerAppbarLayoutBehavior != null) {
            layoutParams.setBehavior(uDViewPagerAppbarLayoutBehavior);
        }
        if (z) {
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        getUserdata().OLrzqt(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.OLrzqt.OLrzqt();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.OLrzqt.AEQbTJ();
    }

    public boolean fetchVPNInfo() {
        return this.OLrzqt.AYXKKw();
    }

    public void setAutoScroll(boolean z) {
        this.OLrzqt.setAutoScroll(z);
    }

    public boolean values() {
        return this.OLrzqt.isConnected();
    }

    public void setRepeat(boolean z) {
        this.OLrzqt.setRepeat(z);
    }

    public float gEmmrt() {
        return this.OLrzqt.AhwBna();
    }

    public void setFrameInterval(float f) {
        this.OLrzqt.setFrameInterval(f);
    }

    public void setPageIndicator(InterfaceC7553alx interfaceC7553alx) {
        this.OLrzqt.setPageIndicator(interfaceC7553alx);
    }

    public InterfaceC7553alx AYXKKw() {
        return this.OLrzqt.djBIcL();
    }

    public void EZpvd(InterfaceC7534ale.Application application) {
        this.OLrzqt.EZpvd(application);
    }

    public void copydefault(InterfaceC7534ale.Application application) {
        this.OLrzqt.OLrzqt(application);
    }

    @Override // o.InterfaceC7534ale
    public void setPageTransformer(boolean z, @androidx.annotation.Nullable ViewPager.PageTransformer pageTransformer, int i) {
        this.OLrzqt.setPageTransformer(z, pageTransformer, i);
    }

    @Override // o.InterfaceC7472akV
    public void setRefreshEnable(boolean z) {
        if (z) {
            this.ejfBZ = new C7778aqJ(getContext());
            removeAllViews();
            addView(this.ejfBZ, C7823arB.AEQbTJ());
            CoordinatorLayout coordinatorLayout = this.KWHzl;
            if (coordinatorLayout != null) {
                this.ejfBZ.EZpvd(coordinatorLayout);
            } else {
                this.ejfBZ.EZpvd(this.OLrzqt);
            }
            this.ejfBZ.djBIcL(z);
            this.ejfBZ.AEQbTJ(new C33603mza(getContext()));
            this.ejfBZ.OLrzqt(this);
        }
    }

    public void setRefreshRate(float f, float f2, int i) {
        this.AuCTel.OLrzqt(f);
        this.AuCTel.KWHzl(f2);
        this.AuCTel.AEQbTJ(i);
    }

    public void setTwoLevelView(android.view.View view, android.view.View view2, float f) {
        C7551alv c7551alv = new C7551alv(getContext());
        this.AuCTel = c7551alv;
        c7551alv.addView(view, C7823arB.AEQbTJ());
        if (f != 0.0f) {
            this.AuCTel.AEQbTJ(f);
        }
        if (view2 == null) {
            this.AuCTel.OLrzqt(new C33603mza(getContext()));
        } else {
            C7819aqy c7819aqy = new C7819aqy(getContext());
            c7819aqy.addView(view2);
            this.AuCTel.OLrzqt(c7819aqy, view2.getLayoutParams().width, view2.getLayoutParams().height);
        }
        this.AuCTel.setOnStateChangedListener(new Function1<RefreshState, Unit>() { // from class: o.aqK.5
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public Unit invoke(RefreshState refreshState) {
                C7779aqK.this.fIwbmz.fARcdN(refreshState.ordinal());
                return null;
            }
        });
        this.AuCTel.setOnMovingListener(new Function1<java.lang.Integer, Unit>() { // from class: o.aqK.4
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public Unit invoke(java.lang.Integer num) {
                C7779aqK.this.fIwbmz.ejfBZ(num.intValue());
                return null;
            }
        });
        this.ejfBZ.AEQbTJ(this.AuCTel);
    }

    public void copydefault(int i, int i2, LuaFunction luaFunction) {
        this.ejfBZ.copydefault(i, i2, luaFunction);
    }

    public void EZpvd() {
        this.AuCTel.OLrzqt();
    }

    public void setReboundDuration(int i) {
        this.ejfBZ.OLrzqt(i);
    }

    @Override // o.InterfaceC7472akV
    public void copydefault() {
        C7778aqJ c7778aqJ = this.ejfBZ;
        if (c7778aqJ != null) {
            c7778aqJ.AhwBna();
        }
    }

    @Override // o.InterfaceC7472akV
    public void KWHzl() {
        C7870arw.KWHzl("py", "stopRefreshing==========");
        C7778aqJ c7778aqJ = this.ejfBZ;
        if (c7778aqJ != null) {
            c7778aqJ.AEQbTJ();
        }
    }

    @Override // o.InterfaceC57903yrG
    public void copydefault(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl) {
        this.fIwbmz.OLrzqt();
    }

    @Override // o.InterfaceC7472akV
    public void setMaterialHeader() {
        if (this.ejfBZ != null) {
            C57860yqQ c57860yqQ = new C57860yqQ(getContext());
            c57860yqQ.EZpvd(C7329ahl.OLrzqt());
            this.ejfBZ.AEQbTJ(c57860yqQ);
            this.ejfBZ.EZpvd(115.0f);
        }
    }

    @Override // o.InterfaceC7472akV
    public void setOKXLiteHeader() {
        if (this.ejfBZ != null) {
            this.ejfBZ.AEQbTJ(new C33603mza(getContext()));
            this.ejfBZ.EZpvd(115.0f);
        }
    }

    @Override // o.InterfaceC7472akV
    public void setOKXLightHeader() {
        if (this.ejfBZ != null) {
            C33603mza c33603mza = new C33603mza(getContext());
            java.io.InputStream inputStreamOLrzqt = C7823arB.OLrzqt("finance_refresh_loading_light_v6240.json", getUserdata().zuBGHE());
            if (inputStreamOLrzqt != null) {
                c33603mza.OLrzqt.copydefault().setAnimation(inputStreamOLrzqt, "finance_refresh_loading_light_v6240.json");
                c33603mza.OLrzqt.AEQbTJ().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.HJWChP));
            }
            this.ejfBZ.AEQbTJ(c33603mza);
        }
    }

    @Override // o.InterfaceC7472akV
    public void setNFTManyChainHeader() {
        if (this.ejfBZ == null || this.EZpvd != null) {
            return;
        }
        C7499akw c7499akw = new C7499akw(getContext());
        this.EZpvd = c7499akw;
        c7499akw.copydefault().setLayoutParams(C7823arB.OLrzqt());
        this.ejfBZ.AEQbTJ(this.EZpvd);
        if ("".equals(C7823arB.copydefault)) {
            return;
        }
        setLottieJson(C7823arB.copydefault, C7823arB.AEQbTJ, C7823arB.EZpvd);
    }

    @Override // o.InterfaceC7472akV
    public void setLottieJson(java.lang.String str, int i, int i2) {
        C7499akw c7499akw = this.EZpvd;
        if (c7499akw != null) {
            c7499akw.setLottieJson(getUserdata().zuBGHE(), str, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        UDViewPager.StateListAnimator stateListAnimator;
        int action = motionEvent.getAction();
        if (action == 0) {
            UDViewPager.StateListAnimator stateListAnimator2 = this.fJNWhG;
            if (stateListAnimator2 != null) {
                stateListAnimator2.EZpvd();
            }
        } else if ((action == 1 || action == 3) && (stateListAnimator = this.fJNWhG) != null) {
            stateListAnimator.copydefault();
        }
        if (this.djBIcL != null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.fetchVPNInfo = motionEvent.getX();
            this.values = motionEvent.getY();
            if (this.DbNXlk) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action2 == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.fARcdN = true;
        } else if (action2 != 2) {
            if (action2 == 3) {
            }
        } else if (this.DbNXlk) {
            getParent().requestDisallowInterceptTouchEvent(OLrzqt(motionEvent));
        } else if (this.fARcdN) {
            if (java.lang.Math.abs(this.values - motionEvent.getY()) >= java.lang.Math.abs(this.fetchVPNInfo - motionEvent.getX())) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (this.fetchVPNInfo < motionEvent.getX() && !this.OLrzqt.canScrollHorizontally(-1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (this.fetchVPNInfo > motionEvent.getX() && !this.OLrzqt.canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.fARcdN = false;
                return this.OLrzqt.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean OLrzqt(android.view.MotionEvent motionEvent) {
        C7545alp c7545alpIsConnected = isConnected();
        int currentItem = c7545alpIsConnected.getCurrentItem();
        PagerAdapter adapter = c7545alpIsConnected.getAdapter();
        if (adapter == null) {
            return false;
        }
        if (KWHzl(motionEvent) || motionEvent.getY() - this.values <= this.AkhnZx || !DbNXlk() || !AkhnZx()) {
            return (currentItem != 0 || java.lang.Math.abs(this.values - motionEvent.getY()) >= ((float) this.AkhnZx) || !KWHzl(motionEvent) || motionEvent.getX() - this.fetchVPNInfo <= ((float) this.valueOf)) && (currentItem != adapter.getCount() - 1 || java.lang.Math.abs(this.values - motionEvent.getY()) >= ((float) this.AkhnZx) || !KWHzl(motionEvent) || this.fetchVPNInfo - motionEvent.getX() <= ((float) this.valueOf));
        }
        return false;
    }

    public final boolean KWHzl(android.view.MotionEvent motionEvent) {
        return java.lang.Math.abs(this.fetchVPNInfo - motionEvent.getX()) > java.lang.Math.abs(this.values - motionEvent.getY());
    }

    public final boolean AkhnZx() {
        C7545alp c7545alpIsConnected = isConnected();
        if (c7545alpIsConnected == null) {
            return false;
        }
        PagerAdapter adapter = c7545alpIsConnected.getAdapter();
        int currentItem = c7545alpIsConnected.getCurrentItem();
        if (adapter instanceof C7465akO) {
            android.view.View viewKWHzl = ((C7465akO) adapter).KWHzl(currentItem);
            if (viewKWHzl instanceof android.view.ViewGroup) {
                EZpvd((android.view.ViewGroup) viewKWHzl);
                if (this.AYXKKw != null) {
                    return !r0.canScrollVertically(-1);
                }
            }
        }
        return false;
    }

    public void EZpvd(android.view.ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C7543aln) {
                this.AYXKKw = ((C7543aln) childAt).KWHzl();
                return;
            } else {
                if (childAt instanceof android.view.ViewGroup) {
                    EZpvd((android.view.ViewGroup) childAt);
                }
            }
        }
    }

    public boolean DbNXlk() {
        getLocationOnScreen(this.AhwBna);
        return this.AhwBna[1] >= this.isConnected[1];
    }

    public void setUDViewPagerNestedScrollListener(UDViewPagerAppbarLayoutBehavior.Application application) {
        UDViewPagerAppbarLayoutBehavior uDViewPagerAppbarLayoutBehavior = this.copydefault;
        if (uDViewPagerAppbarLayoutBehavior != null) {
            uDViewPagerAppbarLayoutBehavior.KWHzl(application);
        }
    }
}
