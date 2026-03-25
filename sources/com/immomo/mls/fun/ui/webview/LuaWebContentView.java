package com.immomo.mls.fun.ui.webview;

import android.content.Context;
import androidx.annotation.NonNull;
import o.C57319ygF;
import o.InterfaceC7383aim;

/* JADX INFO: loaded from: classes3.dex */
public class LuaWebContentView extends C57319ygF implements InterfaceC7383aim<UDWebContentView> {
    private InterfaceC7383aim.ActionBar cycleCallback;
    private UDWebContentView userData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public UDWebContentView getUserdata() {
        return this.userData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public LuaWebContentView(@NonNull Context context) {
        super(context);
    }

    public LuaWebContentView(Context context, UDWebContentView uDWebContentView) {
        super(context);
        this.userData = uDWebContentView;
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
