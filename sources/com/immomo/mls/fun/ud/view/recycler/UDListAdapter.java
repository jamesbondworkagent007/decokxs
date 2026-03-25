package com.immomo.mls.fun.ud.view.recycler;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ui.LuaLinearLayoutManager;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDListAdapter extends UDBaseNeedHeightAdapter {
    public static final String[] gasjUx = {"heightForSectionHeader", "sectionHeader"};
    public LinearLayoutManager flVtFt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public int AhwBna() {
        return this.fZBcTu;
    }

    @InterfaceC60044zuT
    public UDListAdapter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
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
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -2) : layoutParams;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void EZpvd(UDBaseRecyclerLayout uDBaseRecyclerLayout) {
        throw new UnsupportedOperationException("cannot set layout to list adapter");
    }

    @InterfaceC60044zuT
    public LuaValue[] heightForSectionHeader(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0 || !luaValueArr[0].isFunction()) {
            return null;
        }
        this.QVAiDq = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] sectionHeader(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0 || !luaValueArr[0].isFunction()) {
            return null;
        }
        this.QbewEr = luaValueArr[0].toLuaFunction();
        return null;
    }
}
