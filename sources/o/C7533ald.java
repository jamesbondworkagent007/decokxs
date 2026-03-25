package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.immomo.mls.fun.ud.view.UDAppBarLayout;
import com.immomo.mls.fun.ud.view.UDView;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.ald, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7533ald<U extends UDAppBarLayout> extends AppBarLayout implements InterfaceC7384ain<U>, InterfaceC7410ajM {
    public U AEQbTJ;
    public InterfaceC7383aim.ActionBar EZpvd;

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return layoutParams;
    }

    @Override // o.InterfaceC7384ain
    public void bringSubviewToFront(UDView uDView) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public U getUserdata() {
        return this.AEQbTJ;
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

    public C7533ald(android.content.Context context, U u) {
        super(context);
        this.AEQbTJ = u;
        setViewLifeCycleCallback(u);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        getUserdata().OLrzqt(canvas);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.EZpvd;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.EZpvd;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        LinearLayout.LayoutParams layoutParamsKWHzl = KWHzl(layoutParams);
        C7460akJ.OLrzqt(layoutParamsKWHzl, activity.DbNXlk, activity.AkhnZx, activity.isConnected, activity.AYXKKw);
        layoutParamsKWHzl.gravity = activity.OLrzqt;
        layoutParamsKWHzl.weight = activity.fetchVPNInfo;
        return layoutParamsKWHzl;
    }

    public final LinearLayout.LayoutParams KWHzl(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = KWHzl();
        } else if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = KWHzl((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                layoutParams = OLrzqt(layoutParams);
            }
        }
        return (LinearLayout.LayoutParams) layoutParams;
    }

    public ViewGroup.LayoutParams KWHzl() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams KWHzl(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return new LinearLayout.LayoutParams(marginLayoutParams);
    }

    public ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
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
