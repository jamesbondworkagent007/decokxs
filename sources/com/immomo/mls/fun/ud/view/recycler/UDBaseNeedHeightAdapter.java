package com.immomo.mls.fun.ud.view.recycler;

import android.util.SparseArray;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;
import com.immomo.mls.utils.AssertUtils;
import java.util.HashMap;
import java.util.Map;
import o.C7350aiF;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public abstract class UDBaseNeedHeightAdapter<L extends UDBaseRecyclerLayout> extends UDBaseRecyclerAdapter<L> {
    public static final String[] copydefault = {"heightForCell", "heightForHeader", "heightForCellByReuseId", "openHeightMatchParent"};
    public LuaFunction AEQbTJ;
    public SparseArray<C7350aiF> AYXKKw;
    public boolean AhwBna;
    public LuaFunction EZpvd;
    public C7350aiF KWHzl;
    public Map<String, LuaFunction> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public C7350aiF AhwBna(int i) {
        return this.KWHzl;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public int EZpvd() {
        return -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public boolean copydefault() {
        return (this.AEQbTJ == null && this.OLrzqt == null) ? false : true;
    }

    @InterfaceC60044zuT
    public UDBaseNeedHeightAdapter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AhwBna = false;
        getNewProxyInstance();
    }

    private void getNewProxyInstance() {
        this.KWHzl = new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
    }

    @InterfaceC60044zuT
    public LuaValue[] heightForCell(LuaValue[] luaValueArr) {
        this.AEQbTJ = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] heightForHeader(LuaValue[] luaValueArr) {
        this.EZpvd = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] heightForCellByReuseId(LuaValue[] luaValueArr) {
        if (this.OLrzqt == null) {
            this.OLrzqt = new HashMap();
        }
        this.OLrzqt.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] openHeightMatchParent(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0 || !luaValueArr[0].isBoolean()) {
            return null;
        }
        this.AhwBna = luaValueArr[0].toBoolean();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public C7350aiF KWHzl(int i) {
        LuaFunction luaFunction;
        C7350aiF c7350aiF;
        if (this.AYXKKw == null) {
            this.AYXKKw = new SparseArray<>();
        }
        C7350aiF c7350aiF2 = this.AYXKKw.get(i);
        if (c7350aiF2 != null) {
            return c7350aiF2;
        }
        int[] iArrFetchVPNInfo = fetchVPNInfo(i);
        int i2 = 0;
        LuaValue luaValueValueOf = UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[0]);
        LuaValue luaValueValueOf2 = UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[1]);
        if (this.OLrzqt != null) {
            luaFunction = this.OLrzqt.get(isConnected(gEmmrt().getItemViewType(i)));
            if (!AssertUtils.EZpvd(luaFunction, "heightForCellByReuseId和heightForCell互斥，请统一使用方法", getGlobals())) {
                return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
            }
        } else {
            luaFunction = this.AEQbTJ;
        }
        if (!AssertUtils.EZpvd(luaFunction, "必须通过heightForCell将函数设置到adapter中", getGlobals())) {
            return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
        }
        LuaValue[] luaValueArrInvoke = luaFunction.invoke(LuaValue.varargsOf(luaValueValueOf, luaValueValueOf2));
        if (luaValueArrInvoke == null || luaValueArrInvoke.length == 0) {
            return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
        }
        LuaValue luaValue = luaValueArrInvoke[0];
        if (!AssertUtils.EZpvd(luaValue, luaFunction, getGlobals())) {
            return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
        }
        int i3 = luaValue.toInt();
        if (i3 >= 0 || i3 == -2 || i3 == -1) {
            if (i3 == -2) {
                c7350aiF = new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
            } else if (i3 == -1) {
                c7350aiF = new C7350aiF(Float.MIN_VALUE, Float.MIN_VALUE);
            } else {
                c7350aiF = new C7350aiF(Float.MIN_VALUE, luaValue.toFloat());
            }
            i2 = i3;
        } else {
            c7350aiF = new C7350aiF(Float.MIN_VALUE, 0);
        }
        if (this.AhwBna && i2 == -1) {
            c7350aiF = new C7350aiF(Float.MIN_VALUE, Float.MIN_VALUE);
        }
        this.AYXKKw.put(i, c7350aiF);
        return c7350aiF;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public C7350aiF copydefault(int i) {
        LuaValue luaValueNil;
        LuaFunction luaFunction = this.EZpvd;
        if (luaFunction == null) {
            return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
        }
        LuaValue[] luaValueArrInvoke = luaFunction.invoke(null);
        if (luaValueArrInvoke == null || luaValueArrInvoke.length == 0) {
            luaValueNil = LuaValue.Nil();
        } else {
            luaValueNil = luaValueArrInvoke[0];
        }
        if (!AssertUtils.EZpvd(luaValueNil, luaFunction, getGlobals())) {
            return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
        }
        return new C7350aiF(Float.MIN_VALUE, luaValueNil.toInt() >= 0 ? r6 : 0);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void AEQbTJ() {
        super.AEQbTJ();
        SparseArray<C7350aiF> sparseArray = this.AYXKKw;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void djBIcL(int i) {
        super.djBIcL(i);
        UDBaseRecyclerAdapter.OLrzqt(this.AYXKKw, i);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter
    public void gEmmrt(int i) {
        super.gEmmrt(i);
        SparseArray<C7350aiF> sparseArray = this.AYXKKw;
        if (sparseArray == null || sparseArray.size() <= i) {
            return;
        }
        try {
            this.AYXKKw.removeAt(i);
        } catch (Exception unused) {
        }
    }
}
