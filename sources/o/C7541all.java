package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.immomo.mls.fun.ud.view.UDLinearLayout;
import com.immomo.mls.fun.ud.view.UDView;
import o.C7773aqE;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.all, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7541all<U extends UDLinearLayout> extends C7815aqu implements InterfaceC7384ain<U> {
    public InterfaceC7383aim.ActionBar OLrzqt;
    public U copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public U getUserdata() {
        return this.copydefault;
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.OLrzqt = actionBar;
    }

    public C7541all(android.content.Context context, U u, int i) {
        super(context);
        this.copydefault = u;
        setViewLifeCycleCallback(u);
        setOrientation(i);
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
        C7773aqE.StateListAnimator stateListAnimatorEZpvd = EZpvd(layoutParams);
        C7460akJ.OLrzqt(stateListAnimatorEZpvd, activity.DbNXlk, activity.AkhnZx, activity.isConnected, activity.AYXKKw);
        ((LinearLayout.LayoutParams) stateListAnimatorEZpvd).gravity = activity.OLrzqt;
        stateListAnimatorEZpvd.AEQbTJ = activity.AhwBna;
        ((LinearLayout.LayoutParams) stateListAnimatorEZpvd).weight = activity.fetchVPNInfo;
        return stateListAnimatorEZpvd;
    }

    @Override // o.C7773aqE, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // o.C7820aqz, o.C7773aqE, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // o.C7815aqu, android.view.ViewGroup, android.view.View
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

    public final C7773aqE.StateListAnimator EZpvd(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = KWHzl();
        } else if (!(layoutParams instanceof C7773aqE.StateListAnimator)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = KWHzl((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                layoutParams = OLrzqt(layoutParams);
            }
        }
        return (C7773aqE.StateListAnimator) layoutParams;
    }

    public ViewGroup.LayoutParams KWHzl() {
        return new C7773aqE.StateListAnimator(-2, -2);
    }

    public ViewGroup.LayoutParams KWHzl(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return new C7773aqE.StateListAnimator(marginLayoutParams);
    }

    public ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams) {
        return new C7773aqE.StateListAnimator(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }
}
