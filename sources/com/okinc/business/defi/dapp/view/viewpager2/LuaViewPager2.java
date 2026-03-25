package com.okinc.business.defi.dapp.view.viewpager2;

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
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC52777wXz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class LuaViewPager2 extends RelativeLayout {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public TaskDescription<RecyclerView.ViewHolder> AEQbTJ;
    public final RecyclerView.AdapterDataObserver AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public long DbNXlk;
    public CompositePageTransformer EZpvd;
    public ViewPager2.OnPageChangeCallback KWHzl;
    public int OLrzqt;
    public float djBIcL;
    public ViewPager2 ejfBZ;
    public int fJNWhG;
    public float fetchVPNInfo;
    public InterfaceC52777wXz gEmmrt;
    public final int isConnected;
    public float valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuaViewPager2(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LuaViewPager2(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final int AEQbTJ(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaViewPager2 AEQbTJ(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.KWHzl = onPageChangeCallback;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: com.okinc.business.defi.dapp.view.viewpager2.LuaViewPager2.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ LuaViewPager2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuaViewPager2(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.DbNXlk = 800L;
        this.AhwBna = 2;
        this.AkhnZx = 1;
        this.isConnected = ViewConfiguration.get(context).getScaledTouchSlop() >> 1;
        this.AYXKKw = new Activity();
        copydefault(context);
    }

    public final int AEQbTJ() {
        TaskDescription<RecyclerView.ViewHolder> taskDescription = this.AEQbTJ;
        Intrinsics.copydefault(taskDescription);
        return taskDescription.copydefault();
    }

    public static final class Activity extends RecyclerView.AdapterDataObserver {
        public Activity() {
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
            LuaViewPager2 luaViewPager2 = LuaViewPager2.this;
            luaViewPager2.copydefault(luaViewPager2.copydefault());
        }
    }

    public final LuaViewPager2 OLrzqt(int i, int i2) {
        return EZpvd(i, i, i2);
    }

    public final LuaViewPager2 EZpvd(int i, int i2, int i3) {
        if (i3 < 0) {
            i3 = 0;
        }
        EZpvd(new MarginPageTransformer(i3));
        ViewPager2 viewPager2 = this.ejfBZ;
        ViewPager2 viewPager22 = null;
        if (viewPager2 == null) {
            Intrinsics.gEmmrt("");
            viewPager2 = null;
        }
        View childAt = viewPager2.getChildAt(0);
        Intrinsics.copydefault(childAt, "");
        RecyclerView recyclerView = (RecyclerView) childAt;
        ViewPager2 viewPager23 = this.ejfBZ;
        if (viewPager23 == null) {
            Intrinsics.gEmmrt("");
            viewPager23 = null;
        }
        if (viewPager23.getOrientation() == 1) {
            ViewPager2 viewPager24 = this.ejfBZ;
            if (viewPager24 == null) {
                Intrinsics.gEmmrt("");
                viewPager24 = null;
            }
            int paddingLeft = viewPager24.getPaddingLeft();
            int iAbs = Math.abs(i3);
            ViewPager2 viewPager25 = this.ejfBZ;
            if (viewPager25 == null) {
                Intrinsics.gEmmrt("");
            } else {
                viewPager22 = viewPager25;
            }
            recyclerView.setPadding(paddingLeft, i + iAbs, viewPager22.getPaddingRight(), i2 + Math.abs(i3));
        } else {
            int iAbs2 = Math.abs(i3);
            ViewPager2 viewPager26 = this.ejfBZ;
            if (viewPager26 == null) {
                Intrinsics.gEmmrt("");
                viewPager26 = null;
            }
            int paddingTop = viewPager26.getPaddingTop();
            int iAbs3 = Math.abs(i3);
            ViewPager2 viewPager27 = this.ejfBZ;
            if (viewPager27 == null) {
                Intrinsics.gEmmrt("");
            } else {
                viewPager22 = viewPager27;
            }
            recyclerView.setPadding(i + iAbs2, paddingTop, i2 + iAbs3, viewPager22.getPaddingBottom());
        }
        recyclerView.setClipToPadding(false);
        this.AhwBna = 4;
        this.AkhnZx = 2;
        return this;
    }

    public final LuaViewPager2 EZpvd(@NotNull ViewPager2.PageTransformer pageTransformer) {
        Intrinsics.checkNotNullParameter(pageTransformer, "");
        CompositePageTransformer compositePageTransformer = this.EZpvd;
        if (compositePageTransformer != null) {
            compositePageTransformer.addTransformer(pageTransformer);
        }
        return this;
    }

    public final LuaViewPager2 EZpvd(int i) {
        ViewPager2 viewPager2 = this.ejfBZ;
        if (viewPager2 == null) {
            Intrinsics.gEmmrt("");
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(i);
        return this;
    }

    public final void setCurrentItem(int i, boolean z) {
        this.OLrzqt = i;
        this.fJNWhG = i + this.AkhnZx;
        if (AEQbTJ() > 0) {
            ViewPager2 viewPager2 = this.ejfBZ;
            if (viewPager2 == null) {
                Intrinsics.gEmmrt("");
                viewPager2 = null;
            }
            viewPager2.setCurrentItem(this.OLrzqt, z);
        }
    }

    public final <T extends RecyclerView.ViewHolder> void setAdapter(RecyclerView.Adapter<T> adapter) {
        setAdapter(adapter, this.OLrzqt);
    }

    public final <T extends RecyclerView.ViewHolder> void setAdapter(RecyclerView.Adapter<T> adapter, int i) {
        TaskDescription<RecyclerView.ViewHolder> taskDescription = this.AEQbTJ;
        if (!(taskDescription instanceof TaskDescription)) {
            taskDescription = null;
        }
        if (taskDescription != null) {
            taskDescription.EZpvd(adapter);
        }
        copydefault(i);
    }

    public final void copydefault(Context context) {
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        this.EZpvd = compositePageTransformer;
        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.registerOnPageChangeCallback(new StateListAnimator());
        TaskDescription<RecyclerView.ViewHolder> taskDescription = new TaskDescription<>();
        this.AEQbTJ = taskDescription;
        viewPager2.setAdapter(taskDescription);
        this.ejfBZ = viewPager2;
        EZpvd(1);
        EZpvd();
        ViewPager2 viewPager22 = this.ejfBZ;
        if (viewPager22 == null) {
            Intrinsics.gEmmrt("");
            viewPager22 = null;
        }
        addView(viewPager22);
    }

    public final void copydefault(int i) {
        if (this.AkhnZx == 2) {
            ViewPager2 viewPager2 = this.ejfBZ;
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
        InterfaceC52777wXz interfaceC52777wXz = this.gEmmrt;
        if (interfaceC52777wXz == null || interfaceC52777wXz == null) {
            return;
        }
        interfaceC52777wXz.setCount(AEQbTJ(), copydefault());
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
                    this.valueOf = motionEvent.getRawX();
                    this.djBIcL = motionEvent.getRawY();
                    ViewPager2 viewPager2 = this.ejfBZ;
                    ViewPager2 viewPager22 = null;
                    if (viewPager2 == null) {
                        Intrinsics.gEmmrt("");
                        viewPager2 = null;
                    }
                    if (viewPager2.isUserInputEnabled()) {
                        float fAbs = Math.abs(this.valueOf - this.values);
                        float fAbs2 = Math.abs(this.djBIcL - this.fetchVPNInfo);
                        ViewPager2 viewPager23 = this.ejfBZ;
                        if (viewPager23 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            viewPager22 = viewPager23;
                        }
                        if (viewPager22.getOrientation() != 0 ? !(fAbs2 <= this.isConnected || fAbs2 <= fAbs) : !(fAbs <= this.isConnected || fAbs <= fAbs2)) {
                            z = true;
                        }
                        getParent().requestDisallowInterceptTouchEvent(z);
                    }
                }
            }
            return Math.abs(this.valueOf - this.values) > ((float) this.isConnected) || Math.abs(this.djBIcL - this.fetchVPNInfo) > ((float) this.isConnected);
        }
        float rawX = motionEvent.getRawX();
        this.valueOf = rawX;
        this.values = rawX;
        float rawY = motionEvent.getRawY();
        this.djBIcL = rawY;
        this.fetchVPNInfo = rawY;
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void EZpvd() {
        try {
            ViewPager2 viewPager2 = this.ejfBZ;
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
            ViewPager2 viewPager23 = this.ejfBZ;
            if (viewPager23 == null) {
                Intrinsics.gEmmrt("");
                viewPager23 = null;
            }
            declaredField2.set(viewPager23, proxyLayoutManger);
            Field declaredField3 = ViewPager2.class.getDeclaredField("mPageTransformerAdapter");
            declaredField3.setAccessible(true);
            ViewPager2 viewPager24 = this.ejfBZ;
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
            ViewPager2 viewPager25 = this.ejfBZ;
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

    public final class StateListAnimator extends ViewPager2.OnPageChangeCallback {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            ViewPager2.OnPageChangeCallback onPageChangeCallback;
            if (LuaViewPager2.this.KWHzl == null || (onPageChangeCallback = LuaViewPager2.this.KWHzl) == null) {
                return;
            }
            onPageChangeCallback.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            ViewPager2.OnPageChangeCallback onPageChangeCallback;
            if (LuaViewPager2.this.KWHzl == null || (onPageChangeCallback = LuaViewPager2.this.KWHzl) == null) {
                return;
            }
            onPageChangeCallback.onPageSelected(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            InterfaceC52777wXz interfaceC52777wXz;
            ViewPager2.OnPageChangeCallback onPageChangeCallback;
            if (LuaViewPager2.this.KWHzl != null && (onPageChangeCallback = LuaViewPager2.this.KWHzl) != null) {
                onPageChangeCallback.onPageScrollStateChanged(i);
            }
            if (LuaViewPager2.this.gEmmrt == null || (interfaceC52777wXz = LuaViewPager2.this.gEmmrt) == null) {
                return;
            }
            interfaceC52777wXz.EZpvd(i);
        }
    }

    public final class ProxyLayoutManger extends LinearLayoutManager {
        public RecyclerView.LayoutManager KWHzl;
        public final /* synthetic */ LuaViewPager2 copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProxyLayoutManger(@NotNull LuaViewPager2 luaViewPager2, @NotNull Context context, LinearLayoutManager linearLayoutManager) {
            super(context, linearLayoutManager.getOrientation(), false);
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(linearLayoutManager, "");
            this.copydefault = luaViewPager2;
            this.KWHzl = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state, int i, Bundle bundle) {
            Intrinsics.checkNotNullParameter(recycler, "");
            Intrinsics.checkNotNullParameter(state, "");
            return this.KWHzl.performAccessibilityAction(recycler, state, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state, @NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Intrinsics.checkNotNullParameter(recycler, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(accessibilityNodeInfoCompat, "");
            this.KWHzl.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(@NotNull RecyclerView recyclerView, @NotNull View view, @NotNull Rect rect, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(rect, "");
            return this.KWHzl.requestChildRectangleOnScreen(recyclerView, view, rect, z, z2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NotNull RecyclerView.State state, @NotNull int[] iArr) {
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            try {
                Method declaredMethod = this.KWHzl.getClass().getDeclaredMethod("calculateExtraLayoutSpace", state.getClass(), iArr.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.KWHzl, state, iArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }

        public static final class Application extends LinearSmoothScroller {
            public final /* synthetic */ LuaViewPager2 EZpvd;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(LuaViewPager2 luaViewPager2, Context context) {
                super(context);
                this.EZpvd = luaViewPager2;
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
            Application application = new Application(this.copydefault, recyclerView.getContext());
            application.setTargetPosition(i);
            startSmoothScroll(application);
        }
    }

    public final class TaskDescription<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {
        public RecyclerView.Adapter<T> AEQbTJ;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        public final int copydefault() {
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
            adapter.onBindViewHolder(t, LuaViewPager2.this.AEQbTJ(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            RecyclerView.Adapter<T> adapter = this.AEQbTJ;
            if (adapter == null) {
                return 0;
            }
            Intrinsics.copydefault(adapter);
            return adapter.getItemViewType(LuaViewPager2.this.AEQbTJ(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return copydefault();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            RecyclerView.Adapter<T> adapter = this.AEQbTJ;
            if (adapter == null) {
                return 0L;
            }
            Intrinsics.copydefault(adapter);
            return adapter.getItemId(LuaViewPager2.this.AEQbTJ(i));
        }

        public final void EZpvd(RecyclerView.Adapter<T> adapter) {
            RecyclerView.Adapter<T> adapter2 = this.AEQbTJ;
            if (adapter2 != null) {
                adapter2.unregisterAdapterDataObserver(LuaViewPager2.this.AYXKKw);
            }
            if (adapter != null) {
                this.AEQbTJ = adapter;
            }
            RecyclerView.Adapter<T> adapter3 = this.AEQbTJ;
            if (adapter3 != null) {
                adapter3.registerAdapterDataObserver(LuaViewPager2.this.AYXKKw);
            }
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.view.viewpager2.LuaViewPager2.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
