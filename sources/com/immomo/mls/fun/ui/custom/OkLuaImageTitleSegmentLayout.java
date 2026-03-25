package com.immomo.mls.fun.ui.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.C33052mpF;
import o.C33566myq;
import o.C7343ahz;
import o.C7801aqg;
import o.C7812aqr;
import o.InterfaceC7383aim;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
public class OkLuaImageTitleSegmentLayout extends C7812aqr implements InterfaceC7383aim<OkSegmentImageTitleLayout> {
    private InterfaceC7383aim.ActionBar cycleCallback;
    public C7801aqg imageTitleIndicatorView;
    private final OkSegmentImageTitleLayout userdata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public OkSegmentImageTitleLayout getUserdata() {
        return this.userdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public OkLuaImageTitleSegmentLayout(Context context, OkSegmentImageTitleLayout okSegmentImageTitleLayout, LuaValue[] luaValueArr) {
        super(context);
        this.userdata = okSegmentImageTitleLayout;
        this.imageTitleIndicatorView = (C7801aqg) LayoutInflater.from(context).inflate(C7343ahz.Activity.fJNWhG, (ViewGroup) null);
        setViewLifeCycleCallback(okSegmentImageTitleLayout);
        removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C33566myq.EZpvd.EZpvd(context), C33052mpF.EZpvd(118.0f, context));
        layoutParams.gravity = 17;
        addView(this.imageTitleIndicatorView, layoutParams);
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
}
