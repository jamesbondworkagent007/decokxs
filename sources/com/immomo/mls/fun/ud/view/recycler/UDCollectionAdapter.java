package com.immomo.mls.fun.ud.view.recycler;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.UDSize;
import com.immomo.mls.fun.ui.LuaGridLayoutManager;
import com.immomo.mls.utils.AssertUtils;
import java.util.HashMap;
import java.util.Map;
import o.C7326ahi;
import o.C7350aiF;
import o.C7833arL;
import o.C7857arj;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDCollectionAdapter extends UDBaseRecyclerAdapter<UDCollectionLayout> {
    public static final String[] OLrzqt = {"sizeForCell", "sizeForCellByReuseId", "setSpanSizeLookUp"};
    public C7350aiF AEQbTJ;
    public GridLayoutManager AYXKKw;
    public float AhwBna;
    public Map<String, LuaFunction> EZpvd;
    public LuaFunction KWHzl;
    public float copydefault;
    public SparseIntArray flVtFt;
    public SparseArray<C7350aiF> fvQaOB;
    public LuaFunction gGvvIC;
    public final GridLayoutManager.SpanSizeLookup gasjUx;
    public UDCollectionLayout giSNqX;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public C7350aiF AhwBna(int i) {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public RecyclerView.LayoutManager fetchVPNInfo() {
        return this.AYXKKw;
    }

    @InterfaceC60044zuT
    public UDCollectionAdapter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.gasjUx = new GridLayoutManager.SpanSizeLookup() { // from class: com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                if (UDCollectionAdapter.this.flVtFt == null) {
                    UDCollectionAdapter.this.flVtFt = new SparseIntArray();
                }
                if (UDCollectionAdapter.this.flVtFt.get(i) > 0) {
                    return UDCollectionAdapter.this.flVtFt.get(i);
                }
                int iAEQbTJ = AEQbTJ(i);
                UDCollectionAdapter.this.flVtFt.put(i, iAEQbTJ);
                return iAEQbTJ;
            }

            public final int AEQbTJ(int i) {
                int iCopydefault;
                int iCopydefault2;
                int i2;
                if (i == UDCollectionAdapter.this.fIwbmz()) {
                    if (UDCollectionAdapter.this.wlaJM.djBIcL() || UDCollectionAdapter.this.gEmmrt().copydefault()) {
                        return UDCollectionAdapter.this.AYXKKw.getSpanCount();
                    }
                    return 1;
                }
                if (UDCollectionAdapter.this.gGvvIC != null) {
                    int[] iArrFetchVPNInfo = UDCollectionAdapter.this.fetchVPNInfo(i);
                    LuaValue[] luaValueArrInvoke = UDCollectionAdapter.this.gGvvIC.invoke(LuaValue.varargsOf(UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[0]), UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[1])));
                    LuaValue luaValueNil = (luaValueArrInvoke == null || luaValueArrInvoke.length <= 0) ? LuaValue.Nil() : luaValueArrInvoke[0];
                    if (!luaValueNil.isNil() && AssertUtils.EZpvd(luaValueNil, UDCollectionAdapter.this.gGvvIC, UDCollectionAdapter.this.getGlobals()) && (i2 = luaValueNil.toInt()) > 0) {
                        int spanCount = UDCollectionAdapter.this.AYXKKw.getSpanCount();
                        return i2 > spanCount ? spanCount : i2;
                    }
                }
                UDCollectionAdapter uDCollectionAdapter = UDCollectionAdapter.this;
                if (uDCollectionAdapter.giSNqX != null) {
                    return copydefault(i);
                }
                if (uDCollectionAdapter.KWHzl == null && UDCollectionAdapter.this.EZpvd == null) {
                    return 1;
                }
                int orientation = UDCollectionAdapter.this.AYXKKw.getOrientation();
                C7350aiF c7350aiFKWHzl = UDCollectionAdapter.this.KWHzl(i);
                C7350aiF c7350aiFFetchVPNInfo = ((UDCollectionLayout) UDCollectionAdapter.this.AubY).fetchVPNInfo();
                if (orientation == 0) {
                    iCopydefault = c7350aiFKWHzl.AEQbTJ();
                    iCopydefault2 = c7350aiFFetchVPNInfo.AEQbTJ();
                } else {
                    iCopydefault = c7350aiFKWHzl.copydefault();
                    iCopydefault2 = c7350aiFFetchVPNInfo.copydefault();
                }
                if (iCopydefault <= iCopydefault2) {
                    return 1;
                }
                int iCeil = (int) Math.ceil(iCopydefault / iCopydefault2);
                int spanCount2 = UDCollectionAdapter.this.AYXKKw.getSpanCount();
                return iCeil > spanCount2 ? spanCount2 : iCeil;
            }

            public final int copydefault(int i) {
                double dCeil;
                int i2;
                int width = UDCollectionAdapter.this.zuBGHE.getWidth();
                if (width == 0) {
                    width = C7857arj.djBIcL(C7326ahi.OLrzqt());
                }
                int height = UDCollectionAdapter.this.zuBGHE.getHeight();
                if (height == 0) {
                    height = C7857arj.AhwBna(C7326ahi.OLrzqt());
                }
                int iAkhnZx = UDCollectionAdapter.this.giSNqX.AkhnZx();
                int orientation = UDCollectionAdapter.this.AYXKKw.getOrientation();
                C7350aiF c7350aiFKWHzl = UDCollectionAdapter.this.KWHzl(i);
                UDCollectionLayout uDCollectionLayout = UDCollectionAdapter.this.giSNqX;
                int i3 = 1;
                if (uDCollectionLayout != null) {
                    int[] iArrEZpvd = uDCollectionLayout.EZpvd();
                    int iCopydefault = c7350aiFKWHzl.copydefault();
                    int iAEQbTJ = c7350aiFKWHzl.AEQbTJ();
                    if (orientation == 0) {
                        if ((((height - (UDCollectionAdapter.this.AhwBna * (iAkhnZx - 1))) - iArrEZpvd[1]) - iArrEZpvd[3]) / iAkhnZx > 0.0f) {
                            dCeil = Math.ceil(iAEQbTJ / r0);
                            i2 = (int) dCeil;
                        }
                        i2 = iAkhnZx;
                    } else {
                        if ((((width - (UDCollectionAdapter.this.copydefault * (iAkhnZx - 1))) - iArrEZpvd[0]) - iArrEZpvd[2]) / iAkhnZx > 0.0f) {
                            dCeil = Math.ceil(iCopydefault / r9);
                            i2 = (int) dCeil;
                        }
                        i2 = iAkhnZx;
                    }
                    if (i2 != 0) {
                        i3 = i2;
                    }
                }
                return i3 > iAkhnZx ? iAkhnZx : i3;
            }
        };
        this.AEQbTJ = getNewProxyInstance();
    }

    /* JADX DEBUG: Possible override for method com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter.getNewProxyInstance()Z */
    public C7350aiF getNewProxyInstance() {
        return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
    }

    @InterfaceC60044zuT
    public LuaValue[] sizeForCell(LuaValue[] luaValueArr) {
        this.KWHzl = luaValueArr.length > 0 ? luaValueArr[0].toLuaFunction() : null;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] sizeForCellByReuseId(LuaValue[] luaValueArr) {
        if (this.EZpvd == null) {
            this.EZpvd = new HashMap();
        }
        this.EZpvd.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setSpanSizeLookUp(LuaValue[] luaValueArr) {
        this.gGvvIC = luaValueArr.length > 0 ? luaValueArr[0].toLuaFunction() : null;
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void AhwBna(int i, int i2) {
        L l = this.AubY;
        if (l == 0) {
            throw new NullPointerException("view设置adapter之前必须先设置Layout");
        }
        ((UDCollectionLayout) l).AEQbTJ(i, i2);
        super.AhwBna(i, i2);
        EZpvd((UDCollectionLayout) this.AubY);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public int AhwBna() {
        return ((UDCollectionLayout) this.AubY).fetchVPNInfo().copydefault();
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public int EZpvd() {
        return ((UDCollectionLayout) this.AubY).fetchVPNInfo().AEQbTJ();
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public boolean copydefault() {
        L l;
        return (this.KWHzl == null && ((l = this.AubY) == 0 || ((UDCollectionLayout) l).fetchVPNInfo() == null)) ? false : true;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public C7350aiF KWHzl(int i) {
        LuaFunction luaFunction;
        if (this.fvQaOB == null) {
            this.fvQaOB = new SparseArray<>();
        }
        C7350aiF c7350aiF = this.fvQaOB.get(i);
        if (c7350aiF != null) {
            return c7350aiF;
        }
        int[] iArrFetchVPNInfo = fetchVPNInfo(i);
        if (iArrFetchVPNInfo == null) {
            return new C7350aiF(2.8E-45f, 2.8E-45f);
        }
        LuaValue luaValueValueOf = UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[0]);
        LuaValue luaValueValueOf2 = UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[1]);
        if (this.EZpvd != null) {
            luaFunction = this.EZpvd.get(isConnected(gEmmrt().getItemViewType(i)));
            if (luaFunction == null || !luaFunction.isFunction()) {
                luaFunction = this.KWHzl;
            }
        } else {
            luaFunction = this.KWHzl;
            if (luaFunction == null) {
                luaFunction = null;
            }
        }
        if (luaFunction == null || luaFunction.isNil()) {
            if (!AssertUtils.KWHzl(this.AubY, "must set layout before!", getGlobals())) {
                return new C7350aiF(2.8E-45f, 2.8E-45f);
            }
            if (!(this instanceof UDCollectionAutoFitAdapter)) {
                C7833arL.valueOf("sizeForCell must be Called when not using CollectionViewAutoFitAdapter", getGlobals());
            }
            return ((UDCollectionLayout) this.AubY).fetchVPNInfo();
        }
        LuaValue[] luaValueArrInvoke = luaFunction.invoke(LuaValue.varargsOf(luaValueValueOf, luaValueValueOf2));
        LuaValue luaValueNil = (luaValueArrInvoke == null || luaValueArrInvoke.length == 0) ? LuaValue.Nil() : luaValueArrInvoke[0];
        if (AssertUtils.EZpvd(luaValueNil, UDSize.class, luaFunction, getGlobals())) {
            C7350aiF c7350aiFAEQbTJ = ((UDSize) luaValueNil).AEQbTJ();
            this.fvQaOB.put(i, c7350aiFAEQbTJ);
            if (c7350aiFAEQbTJ.AEQbTJ() < 0 || c7350aiFAEQbTJ.copydefault() < 0 || c7350aiFAEQbTJ.AEQbTJ() > this.zuBGHE.getHeight() || c7350aiFAEQbTJ.copydefault() > this.zuBGHE.getWidth()) {
                int iAEQbTJ = c7350aiFAEQbTJ.AEQbTJ();
                if (iAEQbTJ < 0 && iAEQbTJ != -1 && iAEQbTJ != -2) {
                    c7350aiFAEQbTJ.KWHzl(0.0f);
                }
                int iCopydefault = c7350aiFAEQbTJ.copydefault();
                if (iCopydefault < 0 && iCopydefault != -1 && iCopydefault != -2) {
                    c7350aiFAEQbTJ.AEQbTJ(0.0f);
                }
            }
            return c7350aiFAEQbTJ;
        }
        return new C7350aiF(2.8E-45f, 2.8E-45f);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public C7350aiF copydefault(int i) {
        return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams, boolean z) {
        if (layoutParams != null) {
            return layoutParams;
        }
        if (this.sSMYrx == 1) {
            return new ViewGroup.LayoutParams(-1, -2);
        }
        return new ViewGroup.LayoutParams(-2, -1);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void uzCIH() {
        if (this.sSMYrx == 0) {
            this.AEQbTJ.AEQbTJ(2.8E-45f);
            this.AEQbTJ.KWHzl(Float.MIN_VALUE);
        } else {
            this.AEQbTJ.KWHzl(2.8E-45f);
            this.AEQbTJ.AEQbTJ(Float.MIN_VALUE);
        }
        L l = this.AubY;
        if (l != 0) {
            EZpvd((UDCollectionLayout) l);
        }
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void AEQbTJ() {
        super.AEQbTJ();
        SparseArray<C7350aiF> sparseArray = this.fvQaOB;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        SparseIntArray sparseIntArray = this.flVtFt;
        if (sparseIntArray != null) {
            sparseIntArray.clear();
        }
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void AEQbTJ(boolean z) {
        L l = this.AubY;
        if (l != 0) {
            ((UDCollectionLayout) l).EZpvd(z);
        }
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void djBIcL(int i) {
        super.djBIcL(i);
        UDBaseRecyclerAdapter.OLrzqt(this.fvQaOB, i);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/immomo/mls/fun/ud/view/recycler/UDBaseRecyclerLayout;)V */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(UDCollectionLayout uDCollectionLayout) {
        this.giSNqX = uDCollectionLayout;
        if (uDCollectionLayout.ejfBZ() == null) {
            uDCollectionLayout.itemSize(LuaValue.varargsOf(new UDSize(getGlobals(), new C7350aiF(100.0f, 100.0f))));
        }
        int iAkhnZx = uDCollectionLayout.AkhnZx();
        int i = iAkhnZx > 0 ? iAkhnZx : 1;
        GridLayoutManager gridLayoutManager = this.AYXKKw;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanCount(i);
            return;
        }
        this.copydefault = C7865arr.copydefault(this.giSNqX.AhwBna());
        this.AhwBna = C7865arr.copydefault(this.giSNqX.valueOf());
        LuaGridLayoutManager luaGridLayoutManager = new LuaGridLayoutManager(valueOf(), i);
        this.AYXKKw = luaGridLayoutManager;
        luaGridLayoutManager.setSpanSizeLookup(this.gasjUx);
    }
}
