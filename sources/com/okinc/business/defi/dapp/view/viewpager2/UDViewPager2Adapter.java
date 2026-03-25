package com.okinc.business.defi.dapp.view.viewpager2;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseNeedHeightAdapter;
import com.immomo.mls.fun.ui.LuaLinearLayoutManager;
import o.C7350aiF;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC60044zuT
public class UDViewPager2Adapter extends UDBaseNeedHeightAdapter {
    public LinearLayoutManager flVtFt;
    public C7350aiF fvQaOB;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public int AhwBna() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseNeedHeightAdapter, com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public C7350aiF AhwBna(int i) {
        return this.fvQaOB;
    }

    @InterfaceC60044zuT
    public UDViewPager2Adapter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        getNewProxyInstance();
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public RecyclerView.LayoutManager fetchVPNInfo() {
        if (this.flVtFt == null) {
            this.flVtFt = new LuaLinearLayoutManager(valueOf());
        }
        return this.flVtFt;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams, boolean z) {
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    /* JADX DEBUG: Possible override for method com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter.getNewProxyInstance()Z */
    public final void getNewProxyInstance() {
        this.fvQaOB = new C7350aiF(Float.MIN_VALUE, Float.MIN_VALUE);
    }
}
