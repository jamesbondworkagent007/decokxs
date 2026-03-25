package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.immomo.mls.fun.ud.view.UDLinearLayout;
import com.immomo.mls.fun.ud.view.UDScrollView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import java.lang.ref.WeakReference;
import o.InterfaceC7383aim;
import o.InterfaceC7475akY;

/* JADX INFO: renamed from: o.ali, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7538ali extends android.widget.HorizontalScrollView implements InterfaceC7475akY<UDScrollView> {
    public boolean AEQbTJ;
    public long AYXKKw;
    public final android.os.Handler AhwBna;
    public UDScrollView AkhnZx;
    public InterfaceC7384ain EZpvd;
    public float KWHzl;
    public InterfaceC7383aim.ActionBar OLrzqt;
    public InterfaceC7475akY.ActionBar copydefault;
    public WeakReference<C7538ali> djBIcL;
    public InterfaceC7475akY.TaskDescription gEmmrt;
    public InterfaceC7475akY.StateListAnimator valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public UDScrollView getUserdata() {
        return this.AkhnZx;
    }

    @Override // o.InterfaceC7475akY
    public android.view.ViewGroup djBIcL() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7475akY
    public void setFlingListener(InterfaceC7475akY.ActionBar actionBar) {
        this.copydefault = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7475akY
    public void setFlingSpeed(float f) {
        this.KWHzl = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7475akY
    public void setOnScrollListener(InterfaceC7475akY.TaskDescription taskDescription) {
        this.gEmmrt = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7475akY
    public void setTouchActionListener(InterfaceC7475akY.StateListAnimator stateListAnimator) {
        this.valueOf = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.OLrzqt = actionBar;
    }

    public C7538ali(android.content.Context context, UDScrollView uDScrollView, boolean z) {
        super(context);
        this.AYXKKw = 0L;
        this.AEQbTJ = false;
        this.djBIcL = new WeakReference<>(this);
        this.AhwBna = new Activity(this.djBIcL);
        this.KWHzl = 1.0f;
        this.AkhnZx = uDScrollView;
        setHorizontalScrollBarEnabled(true);
        if (z) {
            this.EZpvd = (InterfaceC7384ain) new UDLinearLayout(uDScrollView.getGlobals(), 0).f_();
        } else {
            this.EZpvd = (InterfaceC7384ain) new UDViewGroup(uDScrollView.getGlobals()).f_();
        }
        addView(AYXKKw(), new ViewGroup.LayoutParams(-2, -2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.immomo.mls.fun.ud.view.UDView] */
    @Override // o.InterfaceC7475akY
    public android.view.ViewGroup AYXKKw() {
        return (android.view.ViewGroup) this.EZpvd.getUserdata().f_();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.OLrzqt;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.OLrzqt;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
        this.AhwBna.removeCallbacksAndMessages(null);
    }

    @Override // o.InterfaceC7384ain
    public void bringSubviewToFront(UDView uDView) {
        this.EZpvd.bringSubviewToFront(uDView);
    }

    @Override // o.InterfaceC7384ain
    public void sendSubviewToBack(UDView uDView) {
        this.EZpvd.sendSubviewToBack(uDView);
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return this.EZpvd.applyLayoutParams(layoutParams, activity);
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return this.EZpvd.applyChildCenter(layoutParams, activity);
    }

    @Override // o.InterfaceC7475akY
    public void setContentSize(C7350aiF c7350aiF) {
        if (c7350aiF.copydefault() == 0 || c7350aiF.AEQbTJ() == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = AYXKKw().getLayoutParams();
        layoutParams.width = c7350aiF.copydefault();
        layoutParams.height = c7350aiF.AEQbTJ();
        AYXKKw().setLayoutParams(layoutParams);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams != null && layoutParams.width > getMeasuredWidth()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            }
        }
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            if (viewGroup.getClipChildren()) {
                return;
            }
            viewGroup.setClipChildren(true);
        }
    }

    @Override // o.InterfaceC7475akY
    public C7350aiF EZpvd() {
        return new C7350aiF((int) C7865arr.AEQbTJ(AYXKKw().getWidth()), (int) C7865arr.AEQbTJ(AYXKKw().getHeight()));
    }

    @Override // o.InterfaceC7475akY
    public void setContentOffset(C7348aiD c7348aiD) {
        int iCopydefault = (int) c7348aiD.copydefault();
        if (C55296xhK.AEQbTJ(this)) {
            iCopydefault = java.lang.Math.max(0, AYXKKw().getWidth() - ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd())) - iCopydefault;
        }
        scrollTo(iCopydefault, (int) c7348aiD.OLrzqt());
    }

    @Override // o.InterfaceC7475akY
    public void setOffsetWithAnim(C7348aiD c7348aiD) {
        int iCopydefault = (int) c7348aiD.copydefault();
        if (C55296xhK.AEQbTJ(this)) {
            iCopydefault = java.lang.Math.max(0, AYXKKw().getWidth() - ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd())) - iCopydefault;
        }
        smoothScrollTo(iCopydefault, (int) c7348aiD.OLrzqt());
    }

    @Override // o.InterfaceC7475akY
    public void setOffsetWithAnim(C7348aiD c7348aiD, int i) {
        int iCopydefault = (int) c7348aiD.copydefault();
        if (C55296xhK.AEQbTJ(this)) {
            iCopydefault = java.lang.Math.max(0, AYXKKw().getWidth() - ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd())) - iCopydefault;
        }
        smoothScrollTo(iCopydefault, (int) c7348aiD.OLrzqt());
    }

    @Override // o.InterfaceC7475akY
    public C7348aiD AEQbTJ() {
        return new C7348aiD(C7865arr.AEQbTJ(getScrollX()), C7865arr.AEQbTJ(getScrollY()));
    }

    @Override // o.InterfaceC7475akY
    public void setBouncesEnabled(boolean z) {
        setOverScrollMode(z ? 0 : 2);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        if (!this.AEQbTJ && this.gEmmrt != null) {
            if (java.lang.System.currentTimeMillis() - this.AYXKKw <= 200) {
                this.AYXKKw = java.lang.System.currentTimeMillis();
                return;
            } else {
                this.gEmmrt.AhwBna();
                this.AEQbTJ = true;
            }
        }
        InterfaceC7475akY.TaskDescription taskDescription = this.gEmmrt;
        if (taskDescription != null) {
            taskDescription.DbNXlk();
        }
        OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OLrzqt() {
        this.AhwBna.removeMessages(-9983761);
        android.os.Handler handler = this.AhwBna;
        handler.sendMessageDelayed(handler.obtainMessage(-9983761, this), 16L);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        InterfaceC7475akY.StateListAnimator stateListAnimator;
        if (motionEvent.getAction() == 0 && (stateListAnimator = this.valueOf) != null) {
            stateListAnimator.AuCTel();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            InterfaceC7475akY.StateListAnimator stateListAnimator = this.valueOf;
            if (stateListAnimator != null) {
                stateListAnimator.gEmmrt();
            }
        } else if (action == 2) {
            InterfaceC7475akY.TaskDescription taskDescription = this.gEmmrt;
            if (taskDescription != null) {
                taskDescription.DbNXlk();
            }
        } else if (action == 3) {
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: o.ali$Activity */
    public static class Activity extends android.os.Handler {
        public WeakReference<C7538ali> KWHzl;
        public int OLrzqt = 0;

        public Activity(WeakReference<C7538ali> weakReference) {
            this.KWHzl = weakReference;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            C7538ali c7538ali = this.KWHzl.get();
            if (c7538ali != null) {
                super.handleMessage(message);
                android.view.View view = (android.view.View) message.obj;
                if (message.what == -9983761) {
                    if (this.OLrzqt == view.getScrollX()) {
                        c7538ali.KWHzl();
                        this.KWHzl.get().AEQbTJ = false;
                    } else {
                        this.KWHzl.get().OLrzqt();
                        this.OLrzqt = view.getScrollX();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KWHzl() {
        InterfaceC7475akY.TaskDescription taskDescription = this.gEmmrt;
        if (taskDescription != null) {
            taskDescription.isConnected();
            this.AYXKKw = java.lang.System.currentTimeMillis();
        }
    }

    @Override // o.InterfaceC7475akY
    public void setScrollEnable(final boolean z) {
        setOnTouchListener(null);
        setOnTouchListener(new View.OnTouchListener() { // from class: o.ali.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return !z;
            }
        });
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        super.fling((int) (i * this.KWHzl));
        InterfaceC7475akY.ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.values();
        }
    }
}
