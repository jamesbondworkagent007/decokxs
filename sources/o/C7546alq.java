package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.alq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7546alq<U extends UDViewGroup> extends C7812aqr implements InterfaceC7384ain<U> {
    public InterfaceC7383aim.ActionBar KWHzl;
    public U copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public U getUserdata() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    public C7546alq(android.content.Context context, U u) {
        super(context);
        this.copydefault = u;
        setViewLifeCycleCallback(u);
    }

    @Override // android.view.ViewGroup, android.view.View
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
    }

    @Override // o.InterfaceC7384ain
    public void bringSubviewToFront(UDView uDView) {
        uDView.f_().bringToFront();
    }

    @Override // o.InterfaceC7384ain
    public void sendSubviewToBack(UDView uDView) {
        android.view.View viewF_ = uDView.f_();
        removeView(viewF_);
        addView(viewF_, 0);
    }

    @Override // o.C7771aqC, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // o.C7771aqC, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // o.C7812aqr, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        getUserdata().OLrzqt(canvas);
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (activity.values) {
            i = activity.DbNXlk;
            i2 = activity.AkhnZx;
            i3 = activity.isConnected;
            i4 = activity.AYXKKw;
            i5 = activity.OLrzqt;
            if ((8388615 & i5) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & WalletImportError.ERROR_CODE_AA_EXIST) == 0) {
                i5 |= 48;
            }
        } else {
            i = activity.valueOf;
            i2 = activity.gEmmrt;
            i3 = activity.djBIcL;
            i4 = activity.copydefault;
            i5 = 8388659;
        }
        FrameLayout.LayoutParams layoutParamsKWHzl = KWHzl(layoutParams);
        C7460akJ.OLrzqt(layoutParamsKWHzl, i, i2, i3, i4);
        layoutParamsKWHzl.gravity = i5;
        return layoutParamsKWHzl;
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        FrameLayout.LayoutParams layoutParamsKWHzl = KWHzl(layoutParams);
        if (!java.lang.Float.isNaN(activity.EZpvd)) {
            int i = layoutParamsKWHzl.gravity;
            if (i == 16 || i == 17) {
                layoutParamsKWHzl.gravity = 17;
            } else {
                layoutParamsKWHzl.gravity = 1;
            }
            if (getUserdata().fetchVPNInfo() > 0) {
                layoutParamsKWHzl.setMarginStart((int) (activity.EZpvd - (r0 >> 1)));
            }
        }
        if (!java.lang.Float.isNaN(activity.KWHzl)) {
            int i2 = layoutParamsKWHzl.gravity;
            if (i2 == 1 || i2 == 17) {
                layoutParamsKWHzl.gravity = 17;
            } else {
                layoutParamsKWHzl.gravity = 16;
            }
            if (getUserdata().djBIcL() > 0) {
                layoutParamsKWHzl.topMargin = (int) (activity.KWHzl - (r0 >> 1));
            }
        }
        return layoutParamsKWHzl;
    }

    public final FrameLayout.LayoutParams KWHzl(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = AYXKKw();
        } else if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = EZpvd((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                layoutParams = copydefault(layoutParams);
            }
        }
        return (FrameLayout.LayoutParams) layoutParams;
    }

    public ViewGroup.LayoutParams AYXKKw() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams EZpvd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return new FrameLayout.LayoutParams(marginLayoutParams);
    }

    public ViewGroup.LayoutParams copydefault(ViewGroup.LayoutParams layoutParams) {
        return new FrameLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }
}
