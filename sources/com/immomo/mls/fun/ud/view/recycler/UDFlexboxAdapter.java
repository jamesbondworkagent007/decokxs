package com.immomo.mls.fun.ud.view.recycler;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.immomo.mls.fun.ud.UDSize;
import com.immomo.mls.fun.ui.LuaFlexboxLayoutManager;
import o.C7350aiF;
import o.InterfaceC60044zuT;
import o.InterfaceC7451akA;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDFlexboxAdapter extends UDCollectionAdapter {
    public FlexboxLayoutManager hUfVAv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter, com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public RecyclerView.LayoutManager fetchVPNInfo() {
        return this.hUfVAv;
    }

    @InterfaceC60044zuT
    public UDFlexboxAdapter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter
    public C7350aiF getNewProxyInstance() {
        return new C7350aiF(2.8E-45f, 2.8E-45f);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/immomo/mls/fun/ud/view/recycler/UDBaseRecyclerLayout;)V */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter, com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    /* JADX INFO: renamed from: copydefault */
    public void EZpvd(UDCollectionLayout uDCollectionLayout) {
        this.giSNqX = uDCollectionLayout;
        if (uDCollectionLayout.ejfBZ() == null) {
            uDCollectionLayout.itemSize(LuaValue.varargsOf(new UDSize(getGlobals(), new C7350aiF(100.0f, 100.0f))));
        }
        uDCollectionLayout.AkhnZx();
        if (this.hUfVAv == null) {
            LuaFlexboxLayoutManager luaFlexboxLayoutManager = new LuaFlexboxLayoutManager(valueOf());
            this.hUfVAv = luaFlexboxLayoutManager;
            luaFlexboxLayoutManager.setAlignItems(0);
            this.hUfVAv.setJustifyContent(0);
        }
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter, com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void uzCIH() {
        super.uzCIH();
        this.AEQbTJ.KWHzl(2.8E-45f);
        this.AEQbTJ.AEQbTJ(2.8E-45f);
        this.hUfVAv.setFlexDirection(this.sSMYrx == 1 ? 0 : 2);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter, com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams, boolean z) {
        if (layoutParams instanceof FlexboxLayoutManager.LayoutParams) {
            return layoutParams;
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new FlexboxLayoutManager.LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new FlexboxLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new FlexboxLayoutManager.LayoutParams(layoutParams);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams, int i) {
        return OLrzqt(super.OLrzqt(layoutParams, i), true);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void copydefault(RecyclerView recyclerView) {
        int[] iArrEZpvd = ((InterfaceC7451akA) this.AubY).EZpvd();
        UDCollectionLayout uDCollectionLayout = (UDCollectionLayout) this.AubY;
        if (uDCollectionLayout.orientation == 1) {
            recyclerView.setPaddingRelative(iArrEZpvd[0] - (uDCollectionLayout.gEmmrt() / 2), iArrEZpvd[1], iArrEZpvd[2] - (((UDCollectionLayout) this.AubY).gEmmrt() / 2), 0);
        } else {
            recyclerView.setPaddingRelative(iArrEZpvd[0], iArrEZpvd[1] - (uDCollectionLayout.djBIcL() / 2), 0, iArrEZpvd[3] - (((UDCollectionLayout) this.AubY).djBIcL() / 2));
        }
    }
}
