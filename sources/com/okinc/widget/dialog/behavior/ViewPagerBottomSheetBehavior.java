package com.okinc.widget.dialog.behavior;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import java.lang.ref.WeakReference;
import o.C57680ymw;

/* JADX INFO: loaded from: classes12.dex */
public class ViewPagerBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public boolean DbNXlk;
    public float EZpvd;
    public final ViewDragHelper.Callback KWHzl;
    public boolean OLrzqt;
    public Activity copydefault;
    public int djBIcL;
    public int ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public WeakReference<View> fetchVPNInfo;
    public boolean gEmmrt;
    public ViewDragHelper getFieldNames;
    public VelocityTracker getNewProxyInstance;
    public WeakReference<V> hDKMBd;
    public int isConnected;
    public float iwGUEr;
    public float uzCIH;
    public float valueOf;
    public int values;

    public static abstract class Activity {
        public abstract void OLrzqt(@NonNull View view, float f);

        public abstract void OLrzqt(@NonNull View view, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(Activity activity) {
        this.copydefault = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.fJNWhG = z;
    }

    public int copydefault(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.AYXKKw = 0;
        this.DbNXlk = false;
        return (i & 2) != 0;
    }

    public ViewPagerBottomSheetBehavior() {
        this.AuCTel = 4;
        this.iwGUEr = 0.0f;
        this.uzCIH = 0.0f;
        this.EZpvd = 20.0f;
        this.KWHzl = new ViewDragHelper.Callback() { // from class: com.okinc.widget.dialog.behavior.ViewPagerBottomSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                WeakReference<V> weakReference;
                View view2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ViewPagerBottomSheetBehavior.this;
                int i2 = viewPagerBottomSheetBehavior.AuCTel;
                if (i2 == 1 || viewPagerBottomSheetBehavior.fARcdN) {
                    return false;
                }
                return ((i2 == 3 && viewPagerBottomSheetBehavior.AEQbTJ == i && (view2 = viewPagerBottomSheetBehavior.fetchVPNInfo.get()) != null && view2.canScrollVertically(-1)) || (weakReference = ViewPagerBottomSheetBehavior.this.hDKMBd) == null || weakReference.get() != view) ? false : true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                ViewPagerBottomSheetBehavior.this.OLrzqt(i2);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1) {
                    ViewPagerBottomSheetBehavior.this.AEQbTJ(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int i;
                int i2 = 3;
                if (f2 < 0.0f) {
                    i = ViewPagerBottomSheetBehavior.this.isConnected;
                } else {
                    ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ViewPagerBottomSheetBehavior.this;
                    if (viewPagerBottomSheetBehavior.OLrzqt && viewPagerBottomSheetBehavior.OLrzqt(view, f2)) {
                        i = ViewPagerBottomSheetBehavior.this.AkhnZx;
                        i2 = 5;
                    } else {
                        if (f2 == 0.0f) {
                            int top = view.getTop();
                            if (Math.abs(top - ViewPagerBottomSheetBehavior.this.isConnected) < Math.abs(top - ViewPagerBottomSheetBehavior.this.AhwBna)) {
                                i = ViewPagerBottomSheetBehavior.this.isConnected;
                            } else {
                                i = ViewPagerBottomSheetBehavior.this.AhwBna;
                            }
                        } else {
                            i = ViewPagerBottomSheetBehavior.this.AhwBna;
                        }
                        i2 = 4;
                    }
                }
                if (ViewPagerBottomSheetBehavior.this.getFieldNames.settleCapturedViewAt(view.getLeft(), i)) {
                    ViewPagerBottomSheetBehavior.this.AEQbTJ(2);
                    ViewCompat.postOnAnimation(view, new TaskDescription(view, i2));
                } else {
                    ViewPagerBottomSheetBehavior.this.AEQbTJ(i2);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ViewPagerBottomSheetBehavior.this;
                return viewPagerBottomSheetBehavior.copydefault(i, viewPagerBottomSheetBehavior.isConnected, viewPagerBottomSheetBehavior.OLrzqt ? viewPagerBottomSheetBehavior.AkhnZx : viewPagerBottomSheetBehavior.AhwBna);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                int i;
                int i2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ViewPagerBottomSheetBehavior.this;
                if (viewPagerBottomSheetBehavior.OLrzqt) {
                    i = viewPagerBottomSheetBehavior.AkhnZx;
                    i2 = viewPagerBottomSheetBehavior.isConnected;
                } else {
                    i = viewPagerBottomSheetBehavior.AhwBna;
                    i2 = viewPagerBottomSheetBehavior.isConnected;
                }
                return i - i2;
            }
        };
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.AuCTel = 4;
        this.iwGUEr = 0.0f;
        this.uzCIH = 0.0f;
        this.EZpvd = 20.0f;
        this.KWHzl = new ViewDragHelper.Callback() { // from class: com.okinc.widget.dialog.behavior.ViewPagerBottomSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i2) {
                WeakReference<V> weakReference;
                View view2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ViewPagerBottomSheetBehavior.this;
                int i22 = viewPagerBottomSheetBehavior.AuCTel;
                if (i22 == 1 || viewPagerBottomSheetBehavior.fARcdN) {
                    return false;
                }
                return ((i22 == 3 && viewPagerBottomSheetBehavior.AEQbTJ == i2 && (view2 = viewPagerBottomSheetBehavior.fetchVPNInfo.get()) != null && view2.canScrollVertically(-1)) || (weakReference = ViewPagerBottomSheetBehavior.this.hDKMBd) == null || weakReference.get() != view) ? false : true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i2, int i22, int i3, int i4) {
                ViewPagerBottomSheetBehavior.this.OLrzqt(i22);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1) {
                    ViewPagerBottomSheetBehavior.this.AEQbTJ(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int i2;
                int i22 = 3;
                if (f2 < 0.0f) {
                    i2 = ViewPagerBottomSheetBehavior.this.isConnected;
                } else {
                    ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ViewPagerBottomSheetBehavior.this;
                    if (viewPagerBottomSheetBehavior.OLrzqt && viewPagerBottomSheetBehavior.OLrzqt(view, f2)) {
                        i2 = ViewPagerBottomSheetBehavior.this.AkhnZx;
                        i22 = 5;
                    } else {
                        if (f2 == 0.0f) {
                            int top = view.getTop();
                            if (Math.abs(top - ViewPagerBottomSheetBehavior.this.isConnected) < Math.abs(top - ViewPagerBottomSheetBehavior.this.AhwBna)) {
                                i2 = ViewPagerBottomSheetBehavior.this.isConnected;
                            } else {
                                i2 = ViewPagerBottomSheetBehavior.this.AhwBna;
                            }
                        } else {
                            i2 = ViewPagerBottomSheetBehavior.this.AhwBna;
                        }
                        i22 = 4;
                    }
                }
                if (ViewPagerBottomSheetBehavior.this.getFieldNames.settleCapturedViewAt(view.getLeft(), i2)) {
                    ViewPagerBottomSheetBehavior.this.AEQbTJ(2);
                    ViewCompat.postOnAnimation(view, new TaskDescription(view, i22));
                } else {
                    ViewPagerBottomSheetBehavior.this.AEQbTJ(i22);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i2, int i22) {
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ViewPagerBottomSheetBehavior.this;
                return viewPagerBottomSheetBehavior.copydefault(i2, viewPagerBottomSheetBehavior.isConnected, viewPagerBottomSheetBehavior.OLrzqt ? viewPagerBottomSheetBehavior.AkhnZx : viewPagerBottomSheetBehavior.AhwBna);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i2, int i22) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                int i2;
                int i22;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ViewPagerBottomSheetBehavior.this;
                if (viewPagerBottomSheetBehavior.OLrzqt) {
                    i2 = viewPagerBottomSheetBehavior.AkhnZx;
                    i22 = viewPagerBottomSheetBehavior.isConnected;
                } else {
                    i2 = viewPagerBottomSheetBehavior.AhwBna;
                    i22 = viewPagerBottomSheetBehavior.isConnected;
                }
                return i2 - i22;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            copydefault(i);
        } else {
            copydefault(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        KWHzl(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        OLrzqt(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        typedArrayObtainStyledAttributes.recycle();
        this.valueOf = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.AuCTel);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        int i = savedState.AEQbTJ;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.AuCTel = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        int iMax;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            ViewCompat.setFitsSystemWindows(v, true);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.AkhnZx = coordinatorLayout.getHeight();
        if (this.fIwbmz) {
            if (this.ejfBZ == 0) {
                this.ejfBZ = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            iMax = Math.max(this.ejfBZ, this.AkhnZx - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            iMax = this.values;
        }
        int iMax2 = Math.max(0, this.AkhnZx - v.getHeight());
        this.isConnected = iMax2;
        int iMax3 = Math.max(this.AkhnZx - iMax, iMax2);
        this.AhwBna = iMax3;
        int i2 = this.AuCTel;
        if (i2 == 3) {
            ViewCompat.offsetTopAndBottom(v, this.isConnected);
        } else if (this.OLrzqt && i2 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.AkhnZx);
        } else if (i2 == 4) {
            ViewCompat.offsetTopAndBottom(v, iMax3);
        } else if (i2 == 1 || i2 == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        if (this.getFieldNames == null) {
            this.getFieldNames = ViewDragHelper.create(coordinatorLayout, this.KWHzl);
        }
        this.hDKMBd = new WeakReference<>(v);
        this.fetchVPNInfo = new WeakReference<>(OLrzqt(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            this.gEmmrt = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            AEQbTJ();
        }
        if (this.getNewProxyInstance == null) {
            this.getNewProxyInstance = VelocityTracker.obtain();
        }
        this.getNewProxyInstance.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.djBIcL = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.fetchVPNInfo;
            if ((weakReference != null ? weakReference.get() : null) != null) {
                this.AEQbTJ = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.fARcdN = true;
            }
            this.gEmmrt = this.AEQbTJ == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.djBIcL);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.fARcdN = false;
            this.AEQbTJ = -1;
            if (this.gEmmrt) {
                this.gEmmrt = false;
                return false;
            }
        }
        WeakReference<RecyclerView> weakReference2 = C57680ymw.AEQbTJ;
        if (weakReference2 != null && weakReference2.get() != null) {
            RecyclerView recyclerView = C57680ymw.AEQbTJ.get();
            if (actionMasked == 2 && Math.abs(this.djBIcL - motionEvent.getY()) > this.getFieldNames.getTouchSlop() && recyclerView != null && coordinatorLayout.isPointInChildBounds(recyclerView, (int) motionEvent.getX(), (int) motionEvent.getY()) && (recyclerView instanceof RecyclerView)) {
                motionEvent.getY();
                if (this.djBIcL - motionEvent.getY() < 0.0f) {
                    RecyclerView recyclerView2 = recyclerView;
                    if (recyclerView2.getChildCount() == 0) {
                        return true;
                    }
                    if (EZpvd(recyclerView2) && recyclerView.getVisibility() == 0) {
                        return true;
                    }
                }
                return false;
            }
            if (!this.gEmmrt && this.getFieldNames.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
            if (actionMasked == 2 && recyclerView != null && !this.gEmmrt && this.AuCTel != 1 && !coordinatorLayout.isPointInChildBounds(recyclerView, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(this.djBIcL - motionEvent.getY()) > this.getFieldNames.getTouchSlop()) {
                return true;
            }
        }
        return false;
    }

    public boolean EZpvd(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
            if (recyclerView.getChildAt(0) != null) {
                recyclerView.getChildAt(0).getY();
                if (recyclerView.getChildAt(0).getY() == 0.0f && iFindFirstVisibleItemPosition == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.AuCTel == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.getFieldNames;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            AEQbTJ();
        }
        if (this.getNewProxyInstance == null) {
            this.getNewProxyInstance = VelocityTracker.obtain();
        }
        this.getNewProxyInstance.addMovement(motionEvent);
        if (actionMasked == 2 && !this.gEmmrt && Math.abs(this.djBIcL - motionEvent.getY()) > this.getFieldNames.getTouchSlop()) {
            this.getFieldNames.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.gEmmrt;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.fetchVPNInfo.get()) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            int i4 = this.isConnected;
            if (i3 < i4) {
                int i5 = top - i4;
                iArr[1] = i5;
                ViewCompat.offsetTopAndBottom(v, -i5);
                AEQbTJ(3);
            } else {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                AEQbTJ(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.AhwBna;
            if (i3 <= i6 || this.OLrzqt) {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                AEQbTJ(1);
            } else {
                int i7 = top - i6;
                iArr[1] = i7;
                ViewCompat.offsetTopAndBottom(v, -i7);
                AEQbTJ(4);
            }
        }
        OLrzqt(v.getTop());
        this.AYXKKw = i2;
        this.DbNXlk = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.isConnected) {
            AEQbTJ(3);
            return;
        }
        WeakReference<View> weakReference = this.fetchVPNInfo;
        if (weakReference != null && view == weakReference.get() && this.DbNXlk) {
            if (this.AYXKKw > 0) {
                i = this.isConnected;
            } else if (this.OLrzqt && OLrzqt(v, copydefault())) {
                i = this.AkhnZx;
                i2 = 5;
            } else if (this.AYXKKw == 0) {
                int top = v.getTop();
                if (Math.abs(top - this.isConnected) < Math.abs(top - this.AhwBna)) {
                    i = this.isConnected;
                } else {
                    i = this.AhwBna;
                    i2 = 4;
                }
            }
            if (this.getFieldNames.smoothSlideViewTo(v, v.getLeft(), i)) {
                AEQbTJ(2);
                ViewCompat.postOnAnimation(v, new TaskDescription(v, i2));
            } else {
                AEQbTJ(i2);
            }
            this.DbNXlk = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.fetchVPNInfo.get() && (this.AuCTel != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    public void EZpvd(View view) {
        view.hashCode();
        this.fetchVPNInfo = new WeakReference<>(view);
    }

    public final void copydefault(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (this.fIwbmz) {
                return;
            } else {
                this.fIwbmz = true;
            }
        } else {
            if (!this.fIwbmz && this.values == i) {
                return;
            }
            this.fIwbmz = false;
            this.values = Math.max(0, i);
            this.AhwBna = this.AkhnZx - i;
        }
        if (this.AuCTel != 4 || (weakReference = this.hDKMBd) == null || (v = weakReference.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    public final void EZpvd(final int i) {
        if (i == this.AuCTel) {
            return;
        }
        WeakReference<V> weakReference = this.hDKMBd;
        if (weakReference == null) {
            if (i == 4 || i == 3 || (this.OLrzqt && i == 5)) {
                this.AuCTel = i;
                return;
            }
            return;
        }
        final V v = weakReference.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v)) {
            v.post(new Runnable() { // from class: com.okinc.widget.dialog.behavior.ViewPagerBottomSheetBehavior.4
                @Override // java.lang.Runnable
                public void run() {
                    ViewPagerBottomSheetBehavior.this.copydefault(v, i);
                }
            });
        } else {
            copydefault(v, i);
        }
    }

    public void AEQbTJ(int i) {
        Activity activity;
        if (this.AuCTel == i) {
            return;
        }
        this.AuCTel = i;
        V v = this.hDKMBd.get();
        if (v == null || (activity = this.copydefault) == null) {
            return;
        }
        activity.OLrzqt((View) v, i);
    }

    public final void AEQbTJ() {
        this.AEQbTJ = -1;
        VelocityTracker velocityTracker = this.getNewProxyInstance;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.getNewProxyInstance = null;
        }
    }

    public boolean OLrzqt(View view, float f) {
        if (this.fJNWhG) {
            return true;
        }
        if (view.getTop() < this.AhwBna) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.AhwBna)) / ((float) this.values) > 0.5f;
    }

    public View OLrzqt(View view) {
        View viewOLrzqt;
        if (ViewCompat.isNestedScrollingEnabled(view) && (!(view instanceof RecyclerView) || ((RecyclerView) view).getLayoutManager().canScrollVertically())) {
            return view;
        }
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            View childAt = viewPager.getChildAt(viewPager.getCurrentItem());
            if (childAt != null && (viewOLrzqt = OLrzqt(childAt)) != null) {
                return viewOLrzqt;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewOLrzqt2 = OLrzqt(viewGroup.getChildAt(i));
                if (viewOLrzqt2 != null) {
                    return viewOLrzqt2;
                }
            }
        }
        return null;
    }

    public final float copydefault() {
        this.getNewProxyInstance.computeCurrentVelocity(1000, this.valueOf);
        return this.getNewProxyInstance.getYVelocity(this.AEQbTJ);
    }

    public void copydefault(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.AhwBna;
        } else if (i == 3) {
            i2 = this.isConnected;
        } else {
            if (!this.OLrzqt || i != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i);
            }
            i2 = this.AkhnZx;
        }
        if (this.getFieldNames.smoothSlideViewTo(view, view.getLeft(), i2)) {
            AEQbTJ(2);
            ViewCompat.postOnAnimation(view, new TaskDescription(view, i));
        } else {
            AEQbTJ(i);
        }
    }

    public void OLrzqt(int i) {
        Activity activity;
        V v = this.hDKMBd.get();
        if (v == null || (activity = this.copydefault) == null) {
            return;
        }
        if (i > this.AhwBna) {
            activity.OLrzqt(v, (r2 - i) / (this.AkhnZx - r2));
        } else {
            activity.OLrzqt(v, (r2 - i) / (r2 - this.isConnected));
        }
    }

    public class TaskDescription implements Runnable {
        public final View AEQbTJ;
        public final int EZpvd;

        public TaskDescription(View view, int i) {
            this.AEQbTJ = view;
            this.EZpvd = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper viewDragHelper = ViewPagerBottomSheetBehavior.this.getFieldNames;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.AEQbTJ, this);
            } else {
                ViewPagerBottomSheetBehavior.this.AEQbTJ(this.EZpvd);
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.okinc.widget.dialog.behavior.ViewPagerBottomSheetBehavior.SavedState.1
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public final int AEQbTJ;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.AEQbTJ = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.AEQbTJ = i;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.AEQbTJ);
        }
    }

    public static <V extends View> ViewPagerBottomSheetBehavior<V> AEQbTJ(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof ViewPagerBottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
        }
        return (ViewPagerBottomSheetBehavior) behavior;
    }
}
