package o;

import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.mlnservice.view.UDFlexboxLayout;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.rkV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43183rkV<U extends UDFlexboxLayout> extends C43185rkX implements InterfaceC7384ain<U> {
    public U KWHzl;
    public InterfaceC7383aim.ActionBar OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public U getUserdata() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.OLrzqt = actionBar;
    }

    public C43183rkV(android.content.Context context, U u, int i) {
        super(context);
        this.KWHzl = u;
        setViewLifeCycleCallback(u);
        setFlexDirection(i);
        setFlexWrap(1);
        setJustifyContent(0);
    }

    @Override // o.InterfaceC7384ain
    public void bringSubviewToFront(UDView uDView) {
        C7833arL.KWHzl("LinearLayout does not support bringSubviewToFront method");
    }

    @Override // o.InterfaceC7384ain
    public void sendSubviewToBack(UDView uDView) {
        C7833arL.KWHzl("LinearLayout does not support sendSubviewToBack method");
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        FlexboxLayout.LayoutParams layoutParamsAEQbTJ = AEQbTJ(layoutParams);
        C7460akJ.OLrzqt(layoutParamsAEQbTJ, activity.DbNXlk, activity.AkhnZx, activity.isConnected, activity.AYXKKw);
        return layoutParamsAEQbTJ;
    }

    @Override // com.google.android.flexbox.FlexboxLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // o.C43245rle, com.google.android.flexbox.FlexboxLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // o.C43185rkX, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        getUserdata().OLrzqt(canvas);
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
    }

    public final FlexboxLayout.LayoutParams AEQbTJ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = OLrzqt();
        } else if (!(layoutParams instanceof FlexboxLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = AEQbTJ((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                layoutParams = EZpvd(layoutParams);
            }
        }
        return (FlexboxLayout.LayoutParams) layoutParams;
    }

    public ViewGroup.LayoutParams OLrzqt() {
        return new FlexboxLayout.LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams AEQbTJ(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return new FlexboxLayout.LayoutParams(marginLayoutParams);
    }

    public ViewGroup.LayoutParams EZpvd(ViewGroup.LayoutParams layoutParams) {
        return new FlexboxLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }
}
