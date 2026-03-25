package com.immomo.mls.fun.ui.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.okinc.core.widget.OKSlidingTabLayout;
import o.C7343ahz;
import o.C7812aqr;
import o.C7823arB;
import o.InterfaceC7383aim;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
public class OkLuaSegmentLayout extends C7812aqr implements InterfaceC7383aim<OkSegmentLayout> {
    OKSlidingTabLayout baseTabLayout;
    private InterfaceC7383aim.ActionBar cycleCallback;
    private final OkSegmentLayout userdata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKSlidingTabLayout getTabLayout() {
        return this.baseTabLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public OkSegmentLayout getUserdata() {
        return this.userdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public OkLuaSegmentLayout(Context context, OkSegmentLayout okSegmentLayout, LuaValue[] luaValueArr) {
        super(context);
        this.userdata = okSegmentLayout;
        this.baseTabLayout = (OKSlidingTabLayout) LayoutInflater.from(context).inflate(C7343ahz.Activity.fIwbmz, (ViewGroup) null);
        setViewLifeCycleCallback(okSegmentLayout);
        addView(this.baseTabLayout, C7823arB.KWHzl());
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
