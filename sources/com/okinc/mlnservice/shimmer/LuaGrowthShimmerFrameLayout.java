package com.okinc.mlnservice.shimmer;

import android.content.Context;
import android.util.AttributeSet;
import o.C5495Ty;
import o.InterfaceC7383aim;

/* JADX INFO: loaded from: classes9.dex */
public class LuaGrowthShimmerFrameLayout extends C5495Ty implements InterfaceC7383aim<UDGrowthShimmerFrameLayout> {
    private InterfaceC7383aim.ActionBar cycleCallback;
    private UDGrowthShimmerFrameLayout userdata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public UDGrowthShimmerFrameLayout getUserdata() {
        return this.userdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public LuaGrowthShimmerFrameLayout(Context context) {
        super(context);
    }

    public LuaGrowthShimmerFrameLayout(Context context, UDGrowthShimmerFrameLayout uDGrowthShimmerFrameLayout) {
        super(context);
        this.userdata = uDGrowthShimmerFrameLayout;
    }

    public LuaGrowthShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.C5495Ty, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }
}
