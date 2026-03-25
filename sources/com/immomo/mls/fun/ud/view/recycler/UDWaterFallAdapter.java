package com.immomo.mls.fun.ud.view.recycler;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.LuaStaggeredGridLayoutManager;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDWaterFallAdapter extends UDBaseNeedHeightAdapter<UDWaterFallLayout> {
    public static final String[] gGvvIC = {"getSpanIndex"};
    public LuaStaggeredGridLayoutManager gasjUx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public RecyclerView.LayoutManager fetchVPNInfo() {
        return this.gasjUx;
    }

    @InterfaceC60044zuT
    public UDWaterFallAdapter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void AhwBna(int i, int i2) {
        L l = this.AubY;
        if (l == 0) {
            throw new NullPointerException("view设置adapter之前必须先设置Layout");
        }
        ((UDWaterFallLayout) l).AEQbTJ(i, i2);
        super.AhwBna(i, i2);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public int AhwBna() {
        if (this.fZBcTu == 0) {
            return 0;
        }
        int iValues = ((UDWaterFallLayout) this.AubY).values();
        return (this.fZBcTu - ((iValues * 2) * ((UDWaterFallLayout) this.AubY).gEmmrt())) / iValues;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams, boolean z) {
        StaggeredGridLayoutManager.LayoutParams layoutParams2;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            layoutParams2 = new StaggeredGridLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            } else {
                layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(layoutParams);
            }
        }
        layoutParams2.setFullSpan(z);
        return layoutParams2;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams, int i) {
        if (this.AubY != 0 && layoutParams != null) {
            if (AuCTel(layoutParams.height)) {
                layoutParams.height += ((UDWaterFallLayout) this.AubY).lineSpacing;
            }
            if (AuCTel(layoutParams.width)) {
                layoutParams.width += ((UDWaterFallLayout) this.AubY).itemSpacing;
            }
        }
        return layoutParams;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/immomo/mls/fun/ud/view/recycler/UDBaseRecyclerLayout;)V */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(UDWaterFallLayout uDWaterFallLayout) {
        LuaStaggeredGridLayoutManager luaStaggeredGridLayoutManager = this.gasjUx;
        if (luaStaggeredGridLayoutManager == null) {
            this.gasjUx = new LuaStaggeredGridLayoutManager(uDWaterFallLayout.values(), 1);
        } else {
            luaStaggeredGridLayoutManager.setSpanCount(uDWaterFallLayout.values());
        }
        this.gasjUx.setGapStrategy(0);
    }

    @InterfaceC60044zuT
    public LuaValue[] getSpanIndex(LuaValue[] luaValueArr) {
        LuaValue luaValue = luaValueArr[0];
        if (luaValue != null) {
            UDView uDView = (UDView) luaValue;
            if (uDView.f_() != null && (uDView.f_().getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams)) {
                return LuaValue.varargsOf(LuaValue.rNumber(((StaggeredGridLayoutManager.LayoutParams) uDView.f_().getLayoutParams()).getSpanIndex()));
            }
        }
        return LuaValue.varargsOf(LuaValue.rNumber(-1.0d));
    }
}
