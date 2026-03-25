package com.okinc.uilab.banner;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC52777wXz;
import o.wXK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OKBannerLayout extends RelativeLayout {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public TaskDescription<RecyclerView.ViewHolder> AEQbTJ;
    public InterfaceC52777wXz AYXKKw;
    public boolean AhwBna;
    public float AkhnZx;
    public float AuCTel;
    public long DbNXlk;
    public long EZpvd;
    public ViewPager2.OnPageChangeCallback KWHzl;
    public CompositePageTransformer copydefault;
    public boolean djBIcL;
    public int ejfBZ;
    public float fARcdN;
    public final int fIwbmz;
    public final Runnable fJNWhG;
    public final RecyclerView.AdapterDataObserver fetchVPNInfo;
    public boolean gEmmrt;
    public ViewPager2 getNewProxyInstance;
    public int isConnected;
    public int iwGUEr;
    public int valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKBannerLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKBannerLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKBannerLayout EZpvd(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.KWHzl = onPageChangeCallback;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKBannerLayout OLrzqt(long j) {
        this.EZpvd = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC52777wXz OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: com.okinc.uilab.banner.OKBannerLayout.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKBannerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKBannerLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = true;
        this.djBIcL = true;
        this.EZpvd = 3000L;
        this.DbNXlk = 800L;
        this.isConnected = 2;
        this.ejfBZ = 1;
        this.fetchVPNInfo = new ActionBar();
        this.fJNWhG = new StateListAnimator();
        this.fIwbmz = ViewConfiguration.get(context).getScaledTouchSlop() >> 1;
        KWHzl(context);
    }

    public final int KWHzl() {
        TaskDescription<RecyclerView.ViewHolder> taskDescription = this.AEQbTJ;
        Intrinsics.copydefault(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class ActionBar extends RecyclerView.AdapterDataObserver {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            if (i > 1) {
                onChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            OKBannerLayout oKBannerLayout = OKBannerLayout.this;
            oKBannerLayout.AEQbTJ(oKBannerLayout.copydefault());
        }
    }

    public static final class StateListAnimator implements Runnable {
        public StateListAnimator() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!OKBannerLayout.this.EZpvd() || OKBannerLayout.this.KWHzl() <= 1) {
                return;
            }
            OKBannerLayout.this.iwGUEr++;
            ViewPager2 viewPager2 = null;
            if (OKBannerLayout.this.iwGUEr == OKBannerLayout.this.KWHzl() + OKBannerLayout.this.ejfBZ + 1) {
                OKBannerLayout.this.djBIcL = false;
                ViewPager2 viewPager22 = OKBannerLayout.this.getNewProxyInstance;
                if (viewPager22 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    viewPager2 = viewPager22;
                }
                viewPager2.setCurrentItem(OKBannerLayout.this.ejfBZ, false);
                OKBannerLayout.this.post(this);
                return;
            }
            OKBannerLayout.this.djBIcL = true;
            ViewPager2 viewPager23 = OKBannerLayout.this.getNewProxyInstance;
            if (viewPager23 == null) {
                Intrinsics.gEmmrt("");
            } else {
                viewPager2 = viewPager23;
            }
            viewPager2.setCurrentItem(OKBannerLayout.this.iwGUEr);
            OKBannerLayout oKBannerLayout = OKBannerLayout.this;
            oKBannerLayout.postDelayed(this, oKBannerLayout.EZpvd);
        }
    }

    public final OKBannerLayout KWHzl(int i) {
        ViewPager2 viewPager2 = this.getNewProxyInstance;
        if (viewPager2 == null) {
            Intrinsics.gEmmrt("");
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(i);
        return this;
    }

    public final OKBannerLayout OLrzqt(int i) {
        ViewPager2 viewPager2 = this.getNewProxyInstance;
        if (viewPager2 == null) {
            Intrinsics.gEmmrt("");
            viewPager2 = null;
        }
        viewPager2.setOrientation(i);
        return this;
    }

    public final OKBannerLayout OLrzqt(boolean z) {
        this.gEmmrt = z;
        if (z && KWHzl() > 1) {
            djBIcL();
        }
        return this;
    }

    public final OKBannerLayout copydefault(wXK wxk) {
        return copydefault(wxk, true);
    }

    public final OKBannerLayout copydefault(wXK wxk, boolean z) {
        EZpvd(wxk, z);
        return this;
    }

    public final OKBannerLayout copydefault(InterfaceC52777wXz interfaceC52777wXz) {
        return EZpvd(interfaceC52777wXz, true);
    }

    public final OKBannerLayout EZpvd(InterfaceC52777wXz interfaceC52777wXz, boolean z) {
        InterfaceC52777wXz interfaceC52777wXz2 = this.AYXKKw;
        if (interfaceC52777wXz2 != null) {
            removeView(interfaceC52777wXz2 != null ? interfaceC52777wXz2.EZpvd() : null);
        }
        if (interfaceC52777wXz != null) {
            this.AYXKKw = interfaceC52777wXz;
            if (z) {
                View viewEZpvd = interfaceC52777wXz.EZpvd();
                InterfaceC52777wXz interfaceC52777wXz3 = this.AYXKKw;
                addView(viewEZpvd, interfaceC52777wXz3 != null ? interfaceC52777wXz3.OLrzqt() : null);
            }
        }
        return this;
    }

    public final void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public final void setCurrentItem(int i, boolean z) {
        this.valueOf = i;
        this.iwGUEr = i + this.ejfBZ;
        if (KWHzl() > 0) {
            ViewPager2 viewPager2 = this.getNewProxyInstance;
            if (viewPager2 == null) {
                Intrinsics.gEmmrt("");
                viewPager2 = null;
            }
            viewPager2.setCurrentItem(this.valueOf, z);
        }
    }

    public final void djBIcL() {
        AhwBna();
        postDelayed(this.fJNWhG, this.EZpvd);
        this.AhwBna = true;
    }

    public final void AhwBna() {
        if (this.AhwBna) {
            removeCallbacks(this.fJNWhG);
            this.AhwBna = false;
        }
    }

    public final <T extends RecyclerView.ViewHolder> void setAdapter(RecyclerView.Adapter<T> adapter) {
        setAdapter(adapter, this.valueOf);
    }

    public final <T extends RecyclerView.ViewHolder> void setAdapter(RecyclerView.Adapter<T> adapter, int i) {
        TaskDescription<RecyclerView.ViewHolder> taskDescription = this.AEQbTJ;
        if (!(taskDescription instanceof TaskDescription)) {
            taskDescription = null;
        }
        if (taskDescription != null) {
            taskDescription.OLrzqt(adapter);
        }
        AEQbTJ(i);
    }

    public final void KWHzl(Context context) {
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        this.copydefault = compositePageTransformer;
        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.registerOnPageChangeCallback(new Activity());
        TaskDescription<RecyclerView.ViewHolder> taskDescription = new TaskDescription<>();
        this.AEQbTJ = taskDescription;
        viewPager2.setAdapter(taskDescription);
        this.getNewProxyInstance = viewPager2;
        KWHzl(1);
        AEQbTJ();
        ViewPager2 viewPager22 = this.getNewProxyInstance;
        if (viewPager22 == null) {
            Intrinsics.gEmmrt("");
            viewPager22 = null;
        }
        addView(viewPager22);
    }

    public final void AEQbTJ(int i) {
        if (this.ejfBZ == 2) {
            ViewPager2 viewPager2 = this.getNewProxyInstance;
            if (viewPager2 == null) {
                Intrinsics.gEmmrt("");
                viewPager2 = null;
            }
            viewPager2.setAdapter(this.AEQbTJ);
        } else {
            TaskDescription<RecyclerView.ViewHolder> taskDescription = this.AEQbTJ;
            if (taskDescription != null) {
                taskDescription.notifyDataSetChanged();
            }
        }
        setCurrentItem(i, false);
        InterfaceC52777wXz interfaceC52777wXz = this.AYXKKw;
        if (interfaceC52777wXz != null && interfaceC52777wXz != null) {
            interfaceC52777wXz.setCount(KWHzl(), copydefault());
        }
        if (!EZpvd() || KWHzl() <= 1) {
            return;
        }
        djBIcL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!EZpvd() || KWHzl() <= 1) {
            return;
        }
        djBIcL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!EZpvd() || KWHzl() <= 1) {
            return;
        }
        AhwBna();
    }

    public final int EZpvd(int i) {
        int iKWHzl = KWHzl() > 1 ? (i - this.ejfBZ) % KWHzl() : 0;
        return iKWHzl < 0 ? iKWHzl + KWHzl() : iKWHzl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (EZpvd()) {
            ViewPager2 viewPager2 = this.getNewProxyInstance;
            if (viewPager2 == null) {
                Intrinsics.gEmmrt("");
                viewPager2 = null;
            }
            if (viewPager2.isUserInputEnabled()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    AhwBna();
                } else if (action == 1 || action == 3 || action == 4) {
                    djBIcL();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r1 != 3) goto L40;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z = false;
            if (action != 1) {
                if (action == 2) {
                    this.AkhnZx = motionEvent.getRawX();
                    this.values = motionEvent.getRawY();
                    ViewPager2 viewPager2 = this.getNewProxyInstance;
                    ViewPager2 viewPager22 = null;
                    if (viewPager2 == null) {
                        Intrinsics.gEmmrt("");
                        viewPager2 = null;
                    }
                    if (viewPager2.isUserInputEnabled()) {
                        float fAbs = Math.abs(this.AkhnZx - this.AuCTel);
                        float fAbs2 = Math.abs(this.values - this.fARcdN);
                        ViewPager2 viewPager23 = this.getNewProxyInstance;
                        if (viewPager23 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            viewPager22 = viewPager23;
                        }
                        if (viewPager22.getOrientation() != 0 ? !(fAbs2 <= this.fIwbmz || fAbs2 <= fAbs) : !(fAbs <= this.fIwbmz || fAbs <= fAbs2)) {
                            z = true;
                        }
                        getParent().requestDisallowInterceptTouchEvent(z);
                    }
                }
            }
            return Math.abs(this.AkhnZx - this.AuCTel) > ((float) this.fIwbmz) || Math.abs(this.values - this.fARcdN) > ((float) this.fIwbmz);
        }
        float rawX = motionEvent.getRawX();
        this.AkhnZx = rawX;
        this.AuCTel = rawX;
        float rawY = motionEvent.getRawY();
        this.values = rawY;
        this.fARcdN = rawY;
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void AEQbTJ() {
        try {
            ViewPager2 viewPager2 = this.getNewProxyInstance;
            ViewPager2 viewPager22 = null;
            if (viewPager2 == null) {
                Intrinsics.gEmmrt("");
                viewPager2 = null;
            }
            View childAt = viewPager2.getChildAt(0);
            Intrinsics.copydefault(childAt, "");
            RecyclerView recyclerView = (RecyclerView) childAt;
            recyclerView.setOverScrollMode(2);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ProxyLayoutManger proxyLayoutManger = new ProxyLayoutManger(this, context, linearLayoutManager);
            recyclerView.setLayoutManager(proxyLayoutManger);
            Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            declaredField.set(linearLayoutManager, recyclerView);
            Field declaredField2 = ViewPager2.class.getDeclaredField("mLayoutManager");
            declaredField2.setAccessible(true);
            ViewPager2 viewPager23 = this.getNewProxyInstance;
            if (viewPager23 == null) {
                Intrinsics.gEmmrt("");
                viewPager23 = null;
            }
            declaredField2.set(viewPager23, proxyLayoutManger);
            Field declaredField3 = ViewPager2.class.getDeclaredField("mPageTransformerAdapter");
            declaredField3.setAccessible(true);
            ViewPager2 viewPager24 = this.getNewProxyInstance;
            if (viewPager24 == null) {
                Intrinsics.gEmmrt("");
                viewPager24 = null;
            }
            Object obj = declaredField3.get(viewPager24);
            if (obj != null) {
                Field declaredField4 = obj.getClass().getDeclaredField("mLayoutManager");
                declaredField4.setAccessible(true);
                declaredField4.set(obj, proxyLayoutManger);
            }
            Field declaredField5 = ViewPager2.class.getDeclaredField("mScrollEventAdapter");
            declaredField5.setAccessible(true);
            ViewPager2 viewPager25 = this.getNewProxyInstance;
            if (viewPager25 == null) {
                Intrinsics.gEmmrt("");
            } else {
                viewPager22 = viewPager25;
            }
            Object obj2 = declaredField5.get(viewPager22);
            if (obj2 != null) {
                Field declaredField6 = obj2.getClass().getDeclaredField("mLayoutManager");
                declaredField6.setAccessible(true);
                declaredField6.set(obj2, proxyLayoutManger);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final class Activity extends ViewPager2.OnPageChangeCallback {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            InterfaceC52777wXz interfaceC52777wXz;
            ViewPager2.OnPageChangeCallback onPageChangeCallback;
            int iEZpvd = OKBannerLayout.this.EZpvd(i);
            if (OKBannerLayout.this.KWHzl != null && (onPageChangeCallback = OKBannerLayout.this.KWHzl) != null) {
                onPageChangeCallback.onPageScrolled(iEZpvd, f, i2);
            }
            if (OKBannerLayout.this.AYXKKw == null || (interfaceC52777wXz = OKBannerLayout.this.AYXKKw) == null) {
                return;
            }
            interfaceC52777wXz.copydefault(iEZpvd, f, i2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            InterfaceC52777wXz interfaceC52777wXz;
            ViewPager2.OnPageChangeCallback onPageChangeCallback;
            OKBannerLayout.this.valueOf = i;
            if (OKBannerLayout.this.KWHzl() > 1) {
                OKBannerLayout.this.iwGUEr = i;
            }
            if (OKBannerLayout.this.djBIcL) {
                int iEZpvd = OKBannerLayout.this.EZpvd(i);
                if (OKBannerLayout.this.KWHzl != null && (onPageChangeCallback = OKBannerLayout.this.KWHzl) != null) {
                    onPageChangeCallback.onPageSelected(iEZpvd);
                }
                if (OKBannerLayout.this.AYXKKw == null || (interfaceC52777wXz = OKBannerLayout.this.AYXKKw) == null) {
                    return;
                }
                interfaceC52777wXz.AEQbTJ(iEZpvd);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            InterfaceC52777wXz interfaceC52777wXz;
            ViewPager2.OnPageChangeCallback onPageChangeCallback;
            if (i == 1) {
                int i2 = OKBannerLayout.this.iwGUEr;
                ViewPager2 viewPager2 = null;
                if (i2 == OKBannerLayout.this.ejfBZ - 1) {
                    OKBannerLayout.this.djBIcL = false;
                    ViewPager2 viewPager22 = OKBannerLayout.this.getNewProxyInstance;
                    if (viewPager22 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        viewPager2 = viewPager22;
                    }
                    viewPager2.setCurrentItem(OKBannerLayout.this.KWHzl() + OKBannerLayout.this.iwGUEr, false);
                } else if (i2 == OKBannerLayout.this.KWHzl() + OKBannerLayout.this.ejfBZ) {
                    OKBannerLayout.this.djBIcL = false;
                    ViewPager2 viewPager23 = OKBannerLayout.this.getNewProxyInstance;
                    if (viewPager23 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        viewPager2 = viewPager23;
                    }
                    viewPager2.setCurrentItem(OKBannerLayout.this.ejfBZ, false);
                } else {
                    OKBannerLayout.this.djBIcL = true;
                }
            }
            if (OKBannerLayout.this.KWHzl != null && (onPageChangeCallback = OKBannerLayout.this.KWHzl) != null) {
                onPageChangeCallback.onPageScrollStateChanged(i);
            }
            if (OKBannerLayout.this.AYXKKw == null || (interfaceC52777wXz = OKBannerLayout.this.AYXKKw) == null) {
                return;
            }
            interfaceC52777wXz.EZpvd(i);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final class ProxyLayoutManger extends LinearLayoutManager {
        public final /* synthetic */ OKBannerLayout AEQbTJ;
        public RecyclerView.LayoutManager EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProxyLayoutManger(@NotNull OKBannerLayout oKBannerLayout, @NotNull Context context, LinearLayoutManager linearLayoutManager) {
            super(context, linearLayoutManager.getOrientation(), false);
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(linearLayoutManager, "");
            this.AEQbTJ = oKBannerLayout;
            this.EZpvd = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state, int i, Bundle bundle) {
            Intrinsics.checkNotNullParameter(recycler, "");
            Intrinsics.checkNotNullParameter(state, "");
            return this.EZpvd.performAccessibilityAction(recycler, state, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state, @NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Intrinsics.checkNotNullParameter(recycler, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat, "");
            this.EZpvd.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(@NotNull RecyclerView recyclerView, @NotNull View view, @NotNull Rect rect, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(rect, "");
            return this.EZpvd.requestChildRectangleOnScreen(recyclerView, view, rect, z, z2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NotNull RecyclerView.State state, @NotNull int[] iArr) {
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            try {
                Method declaredMethod = this.EZpvd.getClass().getDeclaredMethod("calculateExtraLayoutSpace", state.getClass(), iArr.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.EZpvd, state, iArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }

        public static final class StateListAnimator extends LinearSmoothScroller {
            public final /* synthetic */ OKBannerLayout EZpvd;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(OKBannerLayout oKBannerLayout, Context context) {
                super(context);
                this.EZpvd = oKBannerLayout;
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateTimeForDeceleration(int i) {
                return (int) (this.EZpvd.DbNXlk * 0.6644d);
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            StateListAnimator stateListAnimator = new StateListAnimator(this.AEQbTJ, recyclerView.getContext());
            stateListAnimator.setTargetPosition(i);
            startSmoothScroll(stateListAnimator);
        }
    }

    public final class TaskDescription<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {
        public RecyclerView.Adapter<T> AEQbTJ;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        public final int EZpvd() {
            RecyclerView.Adapter<T> adapter = this.AEQbTJ;
            if (adapter == null) {
                return 0;
            }
            Intrinsics.copydefault(adapter);
            return adapter.getItemCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public T onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            RecyclerView.Adapter<T> adapter = this.AEQbTJ;
            if (adapter == null) {
                throw new IllegalStateException("Adapter is not set".toString());
            }
            Intrinsics.copydefault(adapter);
            T t = (T) adapter.onCreateViewHolder(viewGroup, i);
            Intrinsics.checkNotNullExpressionValue(t, "");
            return t;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull T t, int i) {
            Intrinsics.checkNotNullParameter(t, "");
            RecyclerView.Adapter<T> adapter = this.AEQbTJ;
            if (adapter == null || adapter == null) {
                return;
            }
            adapter.onBindViewHolder(t, OKBannerLayout.this.EZpvd(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            RecyclerView.Adapter<T> adapter = this.AEQbTJ;
            if (adapter == null) {
                return 0;
            }
            Intrinsics.copydefault(adapter);
            return adapter.getItemViewType(OKBannerLayout.this.EZpvd(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return EZpvd() > 1 ? EZpvd() + OKBannerLayout.this.isConnected : EZpvd();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            RecyclerView.Adapter<T> adapter = this.AEQbTJ;
            if (adapter == null) {
                return 0L;
            }
            Intrinsics.copydefault(adapter);
            return adapter.getItemId(OKBannerLayout.this.EZpvd(i));
        }

        public final void OLrzqt(RecyclerView.Adapter<T> adapter) {
            RecyclerView.Adapter<T> adapter2 = this.AEQbTJ;
            if (adapter2 != null) {
                adapter2.unregisterAdapterDataObserver(OKBannerLayout.this.fetchVPNInfo);
            }
            if (adapter != null) {
                this.AEQbTJ = adapter;
            }
            RecyclerView.Adapter<T> adapter3 = this.AEQbTJ;
            if (adapter3 != null) {
                adapter3.registerAdapterDataObserver(OKBannerLayout.this.fetchVPNInfo);
            }
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.banner.OKBannerLayout.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
