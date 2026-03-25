package o;

import android.view.ViewGroup;
import com.immomo.mls.fun.ud.view.UDHStack;
import com.immomo.mls.fun.ud.view.UDView;
import o.AbstractC7780aqL;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.alg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7536alg<U extends UDHStack> extends C7813aqs implements InterfaceC7384ain<U> {
    public U KWHzl;
    public InterfaceC7383aim.ActionBar OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    /* JADX DEBUG: Possible override for method o.aqL.EZpvd()V */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
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

    public C7536alg(android.content.Context context, U u) {
        super(context);
        this.KWHzl = u;
        setViewLifeCycleCallback(u);
    }

    @Override // o.AbstractC7780aqL, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // o.C7770aqB, o.AbstractC7780aqL, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // o.C7813aqs, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        getUserdata().OLrzqt(canvas);
    }

    @Override // o.InterfaceC7384ain
    public void bringSubviewToFront(UDView uDView) {
        C7833arL.KWHzl("Row does not support bringSubviewToFront method");
    }

    @Override // o.InterfaceC7384ain
    public void sendSubviewToBack(UDView uDView) {
        C7833arL.KWHzl("Row does not support sendSubviewToBack method");
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        AbstractC7780aqL.Activity activityAEQbTJ = AEQbTJ(layoutParams);
        C7460akJ.OLrzqt(activityAEQbTJ, activity.DbNXlk, activity.AkhnZx, activity.isConnected, activity.AYXKKw);
        if (activity.AEQbTJ) {
            activityAEQbTJ.KWHzl = activity.OLrzqt;
        } else {
            activity.OLrzqt = -1;
            activityAEQbTJ.KWHzl = -1;
        }
        activityAEQbTJ.OLrzqt = activity.AhwBna;
        activityAEQbTJ.copydefault = activity.fetchVPNInfo;
        return activityAEQbTJ;
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

    public final AbstractC7780aqL.Activity AEQbTJ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = OLrzqt();
        } else if (!(layoutParams instanceof AbstractC7780aqL.Activity)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = EZpvd((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                layoutParams = KWHzl(layoutParams);
            }
        }
        return (AbstractC7780aqL.Activity) layoutParams;
    }

    /* JADX DEBUG: Possible override for method o.aqL.OLrzqt()V */
    /* JADX DEBUG: Possible override for method o.aqO.OLrzqt()V */
    public ViewGroup.LayoutParams OLrzqt() {
        return new AbstractC7780aqL.Activity(-2, -2);
    }

    public ViewGroup.LayoutParams EZpvd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return new AbstractC7780aqL.Activity(marginLayoutParams);
    }

    public ViewGroup.LayoutParams KWHzl(ViewGroup.LayoutParams layoutParams) {
        return new AbstractC7780aqL.Activity(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }
}
