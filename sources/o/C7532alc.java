package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.immomo.mls.fun.ud.view.UDCoordinatorLayout;
import com.immomo.mls.fun.ud.view.UDView;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.alc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7532alc<U extends UDCoordinatorLayout> extends C7935atH implements InterfaceC7384ain<U>, InterfaceC7410ajM {
    public InterfaceC7383aim.ActionBar EZpvd;
    public U KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public U getUserdata() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC7384ain
    public void bringSubviewToFront(UDView uDView) {
    }

    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return 0;
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return new float[0];
    }

    @Override // o.InterfaceC7409ajL
    public float getStrokeWidth() {
        return 0.0f;
    }

    @Override // o.InterfaceC7384ain
    public void sendSubviewToBack(UDView uDView) {
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
    }

    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
    }

    public void setRadius(float f, float f2, float f3, float f4) {
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.EZpvd = actionBar;
    }

    public C7532alc(android.content.Context context, U u) {
        super(context);
        this.KWHzl = u;
        setViewLifeCycleCallback(u);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        getUserdata().OLrzqt(canvas);
    }

    /* JADX DEBUG: Method merged with bridge method: applyLayoutParams(Landroid/view/ViewGroup$LayoutParams;Lcom/immomo/mls/fun/ud/view/UDView$Activity;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // o.InterfaceC7384ain
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
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
        } else {
            i = activity.valueOf;
            i2 = activity.gEmmrt;
            i3 = activity.djBIcL;
            i4 = activity.copydefault;
            i5 = 8388659;
        }
        CoordinatorLayout.LayoutParams layoutParamsAEQbTJ = AEQbTJ(layoutParams);
        C7460akJ.OLrzqt(layoutParamsAEQbTJ, i, i2, i3, i4);
        layoutParamsAEQbTJ.gravity = i5;
        return layoutParamsAEQbTJ;
    }

    public final CoordinatorLayout.LayoutParams AEQbTJ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = AEQbTJ();
        } else if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = copydefault((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                layoutParams = KWHzl(layoutParams);
            }
        }
        return (CoordinatorLayout.LayoutParams) layoutParams;
    }

    public ViewGroup.LayoutParams AEQbTJ() {
        return new CoordinatorLayout.LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams copydefault(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return new CoordinatorLayout.LayoutParams(marginLayoutParams);
    }

    public ViewGroup.LayoutParams KWHzl(ViewGroup.LayoutParams layoutParams) {
        return new CoordinatorLayout.LayoutParams(layoutParams);
    }

    /* JADX DEBUG: Method merged with bridge method: applyChildCenter(Landroid/view/ViewGroup$LayoutParams;Lcom/immomo/mls/fun/ud/view/UDView$Activity;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // o.InterfaceC7384ain
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        CoordinatorLayout.LayoutParams layoutParamsAEQbTJ = AEQbTJ(layoutParams);
        if (!java.lang.Float.isNaN(activity.EZpvd)) {
            int i = layoutParamsAEQbTJ.gravity;
            if (i == 16 || i == 17) {
                layoutParamsAEQbTJ.gravity = 17;
            } else {
                layoutParamsAEQbTJ.gravity = 1;
            }
            if (getUserdata().fetchVPNInfo() > 0) {
                layoutParamsAEQbTJ.setMarginStart((int) (activity.EZpvd - (r0 >> 1)));
            }
        }
        if (!java.lang.Float.isNaN(activity.KWHzl)) {
            int i2 = layoutParamsAEQbTJ.gravity;
            if (i2 == 1 || i2 == 17) {
                layoutParamsAEQbTJ.gravity = 17;
            } else {
                layoutParamsAEQbTJ.gravity = 16;
            }
            if (getUserdata().djBIcL() > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParamsAEQbTJ).topMargin = (int) (activity.KWHzl - (r0 >> 1));
            }
        }
        return layoutParamsAEQbTJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        setBackgroundColor(i);
    }
}
