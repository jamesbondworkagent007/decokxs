package com.immomo.mls.fun.ui.custom;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.OMLinearLayout;
import o.C7460akJ;
import o.C7833arL;
import o.InterfaceC7383aim;
import o.InterfaceC7384ain;

/* JADX INFO: loaded from: classes22.dex */
public class OLuaLinearLayout<U extends OMLinearLayout> extends LinearLayout implements InterfaceC7384ain<U> {
    private InterfaceC7383aim.ActionBar cycleCallback;
    protected U userdata;

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public U getUserdata() {
        return this.userdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public OLuaLinearLayout(Context context, U u, int i) {
        super(context);
        this.userdata = u;
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

    public void setLayoutGravity(int i) {
        setGravity(i);
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        LinearLayout.LayoutParams layoutParams2 = parseLayoutParams(layoutParams);
        C7460akJ.OLrzqt(layoutParams2, activity.DbNXlk, activity.AkhnZx, activity.isConnected, activity.AYXKKw);
        layoutParams2.gravity = activity.OLrzqt;
        layoutParams2.weight = activity.fetchVPNInfo;
        return layoutParams2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    private LinearLayout.LayoutParams parseLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = generateNewWrapContentLayoutParams();
        } else if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = generateNewLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                layoutParams = generateNewLayoutParams(layoutParams);
            }
        }
        return (LinearLayout.LayoutParams) layoutParams;
    }

    public ViewGroup.LayoutParams generateNewWrapContentLayoutParams() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateNewLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return new LinearLayout.LayoutParams(marginLayoutParams);
    }

    public ViewGroup.LayoutParams generateNewLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }
}
