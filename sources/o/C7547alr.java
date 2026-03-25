package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.immomo.mls.fun.ud.view.UDLinearLayout;
import com.immomo.mls.fun.ud.view.UDScrollView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import java.lang.ref.WeakReference;
import o.InterfaceC7383aim;
import o.InterfaceC7475akY;

/* JADX INFO: renamed from: o.alr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7547alr extends NestedScrollView implements InterfaceC7475akY<UDScrollView> {
    public InterfaceC7384ain AEQbTJ;
    public InterfaceC7475akY.TaskDescription AYXKKw;
    public InterfaceC7475akY.StateListAnimator AhwBna;
    public float EZpvd;
    public InterfaceC7383aim.ActionBar KWHzl;
    public InterfaceC7475akY.ActionBar OLrzqt;
    public boolean copydefault;
    public WeakReference<C7547alr> djBIcL;
    public final android.os.Handler gEmmrt;
    public UDScrollView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public UDScrollView getUserdata() {
        return this.valueOf;
    }

    @Override // o.InterfaceC7475akY
    public android.view.ViewGroup djBIcL() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7475akY
    public void setFlingListener(InterfaceC7475akY.ActionBar actionBar) {
        this.OLrzqt = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7475akY
    public void setFlingSpeed(float f) {
        this.EZpvd = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7475akY
    public void setOnScrollListener(InterfaceC7475akY.TaskDescription taskDescription) {
        this.AYXKKw = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7475akY
    public void setTouchActionListener(InterfaceC7475akY.StateListAnimator stateListAnimator) {
        this.AhwBna = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    public C7547alr(android.content.Context context, UDScrollView uDScrollView, boolean z, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.copydefault = false;
        this.djBIcL = new WeakReference<>(this);
        this.gEmmrt = new Application(this.djBIcL);
        this.EZpvd = 1.0f;
        this.valueOf = uDScrollView;
        setVerticalScrollBarEnabled(true);
        setFillViewport(true);
        if (z) {
            this.AEQbTJ = (InterfaceC7384ain) new UDLinearLayout(uDScrollView.getGlobals(), 1).f_();
        } else {
            this.AEQbTJ = (InterfaceC7384ain) new UDViewGroup(uDScrollView.getGlobals()).f_();
        }
        addView(AYXKKw(), new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            if (viewGroup.getClipChildren()) {
                return;
            }
            viewGroup.setClipChildren(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.immomo.mls.fun.ud.view.UDView] */
    @Override // o.InterfaceC7475akY
    public android.view.ViewGroup AYXKKw() {
        return (android.view.ViewGroup) this.AEQbTJ.getUserdata().f_();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
        this.gEmmrt.removeCallbacksAndMessages(null);
    }

    @Override // o.InterfaceC7384ain
    public void bringSubviewToFront(UDView uDView) {
        this.AEQbTJ.bringSubviewToFront(uDView);
    }

    @Override // o.InterfaceC7384ain
    public void sendSubviewToBack(UDView uDView) {
        this.AEQbTJ.sendSubviewToBack(uDView);
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return this.AEQbTJ.applyLayoutParams(layoutParams, activity);
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return this.AEQbTJ.applyChildCenter(layoutParams, activity);
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

    @Override // o.InterfaceC7475akY
    public C7350aiF EZpvd() {
        return new C7350aiF((int) C7865arr.AEQbTJ(AYXKKw().getWidth()), (int) C7865arr.AEQbTJ(AYXKKw().getHeight()));
    }

    @Override // o.InterfaceC7475akY
    public void setContentOffset(C7348aiD c7348aiD) {
        scrollTo((int) c7348aiD.copydefault(), (int) c7348aiD.OLrzqt());
    }

    @Override // o.InterfaceC7475akY
    public void setOffsetWithAnim(C7348aiD c7348aiD) {
        smoothScrollTo((int) c7348aiD.copydefault(), (int) c7348aiD.OLrzqt());
    }

    @Override // o.InterfaceC7475akY
    public void setOffsetWithAnim(C7348aiD c7348aiD, int i) {
        smoothScrollTo((int) c7348aiD.copydefault(), (int) c7348aiD.OLrzqt(), i);
    }

    @Override // o.InterfaceC7475akY
    public C7348aiD AEQbTJ() {
        return new C7348aiD(C7865arr.AEQbTJ(getScrollX()), C7865arr.AEQbTJ(getScrollY()));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC7475akY.TaskDescription taskDescription;
        super.onScrollChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        if (!this.copydefault && (taskDescription = this.AYXKKw) != null) {
            taskDescription.AhwBna();
            this.copydefault = true;
        }
        InterfaceC7475akY.TaskDescription taskDescription2 = this.AYXKKw;
        if (taskDescription2 != null) {
            taskDescription2.DbNXlk();
        }
        copydefault();
    }

    public final void copydefault() {
        this.gEmmrt.removeMessages(-9983761);
        android.os.Handler handler = this.gEmmrt;
        handler.sendMessageDelayed(handler.obtainMessage(-9983761, this), 16L);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        InterfaceC7475akY.StateListAnimator stateListAnimator;
        if (motionEvent.getAction() == 0 && (stateListAnimator = this.AhwBna) != null) {
            stateListAnimator.AuCTel();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        InterfaceC7475akY.StateListAnimator stateListAnimator;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && (stateListAnimator = this.AhwBna) != null) {
            stateListAnimator.gEmmrt();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: o.alr$Application */
    public static class Application extends android.os.Handler {
        public WeakReference<C7547alr> EZpvd;
        public int copydefault = 0;

        public Application(WeakReference<C7547alr> weakReference) {
            this.EZpvd = weakReference;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            C7547alr c7547alr = this.EZpvd.get();
            if (c7547alr != null) {
                super.handleMessage(message);
                android.view.View view = (android.view.View) message.obj;
                if (message.what == -9983761) {
                    if (this.copydefault == view.getScrollY()) {
                        c7547alr.KWHzl();
                        this.EZpvd.get().copydefault = false;
                    } else {
                        this.EZpvd.get().copydefault();
                        this.copydefault = view.getScrollY();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KWHzl() {
        InterfaceC7475akY.TaskDescription taskDescription = this.AYXKKw;
        if (taskDescription != null) {
            taskDescription.isConnected();
        }
    }

    @Override // o.InterfaceC7475akY
    public void setBouncesEnabled(boolean z) {
        setOverScrollMode(z ? 0 : 2);
    }

    @Override // o.InterfaceC7475akY
    public void setScrollEnable(final boolean z) {
        setOnTouchListener(null);
        setOnTouchListener(new View.OnTouchListener() { // from class: o.alr.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return !z;
            }
        });
    }

    @Override // androidx.core.widget.NestedScrollView
    public void fling(int i) {
        super.fling((int) (i * this.EZpvd));
        InterfaceC7475akY.ActionBar actionBar = this.OLrzqt;
        if (actionBar != null) {
            actionBar.values();
        }
    }
}
