package com.immomo.mls.fun.ud.view.viewpager;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.mls.fun.ud.view.UDViewPager;
import com.immomo.mls.utils.AssertUtils;
import java.util.HashMap;
import java.util.Map;
import o.C7465akO;
import o.InterfaceC60044zuT;
import o.InterfaceC7459akI;
import o.InterfaceC7466akP;
import org.luaj.vm2.Globals;
import org.luaj.vm2.JavaUserdata;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDViewPagerAdapter extends JavaUserdata {
    public static final String[] KWHzl = {"getCount", "initCell", "fillCellData", "reuseId", "initCellByReuseId", "fillCellDataByReuseId", "callInitAndFillWhenReloadData"};
    public Map<String, LuaFunction> AEQbTJ;
    public LuaFunction AYXKKw;
    public LuaFunction AhwBna;
    public InterfaceC7459akI AkhnZx;
    public boolean DbNXlk;
    public C7465akO EZpvd;
    public int OLrzqt;
    public InterfaceC7466akP copydefault;
    public LuaFunction djBIcL;
    public SparseArray<String> fARcdN;
    public Map<String, LuaFunction> fetchVPNInfo;
    public LuaFunction gEmmrt;
    public UDViewPager isConnected;
    public LuaFunction valueOf;
    public View.OnClickListener values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LuaValue[] AEQbTJ(LuaFunction luaFunction) {
        this.AhwBna = luaFunction;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(View.OnClickListener onClickListener) {
        this.values = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public View.OnClickListener KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(UDViewPager uDViewPager) {
        this.isConnected = uDViewPager;
    }

    @InterfaceC60044zuT
    public UDViewPagerAdapter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.DbNXlk = false;
        this.OLrzqt = -1;
    }

    @InterfaceC60044zuT
    public UDViewPagerAdapter(Globals globals, Object obj) {
        super(globals, obj);
        this.DbNXlk = false;
        this.OLrzqt = -1;
    }

    @InterfaceC60044zuT
    public LuaValue[] getCount(LuaValue[] luaValueArr) {
        this.gEmmrt = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] initCell(LuaValue[] luaValueArr) {
        this.valueOf = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] fillCellData(LuaValue[] luaValueArr) {
        this.djBIcL = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] reuseId(LuaValue[] luaValueArr) {
        this.AYXKKw = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] initCellByReuseId(LuaValue[] luaValueArr) {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = new HashMap();
        }
        this.fetchVPNInfo.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        EZpvd().notifyDataSetChanged();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] fillCellDataByReuseId(LuaValue[] luaValueArr) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new HashMap();
        }
        this.AEQbTJ.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] callInitAndFillWhenReloadData(LuaValue[] luaValueArr) {
        EZpvd().copydefault(luaValueArr[0].toBoolean() ? 1 : 0);
        return null;
    }

    public C7465akO EZpvd() {
        if (this.EZpvd == null) {
            this.EZpvd = new C7465akO(this);
        }
        return this.EZpvd;
    }

    public void OLrzqt() {
        this.OLrzqt = -1;
        SparseArray<String> sparseArray = this.fARcdN;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        EZpvd().notifyDataSetChanged();
    }

    public String KWHzl(int i) {
        String string;
        LuaFunction luaFunction = this.AYXKKw;
        if (luaFunction == null || luaFunction.isNil()) {
            return "NONE_REUSE_ID";
        }
        if (this.fARcdN == null) {
            this.fARcdN = new SparseArray<>();
        }
        String str = this.fARcdN.get(i);
        if (str != null) {
            return str;
        }
        LuaValue[] luaValueArrInvoke = this.AYXKKw.invoke(LuaValue.varargsOf(AEQbTJ(i)));
        LuaValue luaValueNil = (luaValueArrInvoke == null || luaValueArrInvoke.length == 0) ? LuaValue.Nil() : luaValueArrInvoke[0];
        if (AssertUtils.OLrzqt(luaValueNil, this.AYXKKw, getGlobals())) {
            string = luaValueNil.toJavaString();
        } else {
            string = luaValueNil.toString();
        }
        this.fARcdN.put(i, string);
        return string;
    }

    public int AEQbTJ() {
        int i = this.OLrzqt;
        if (i != -1) {
            return i;
        }
        LuaFunction luaFunction = this.gEmmrt;
        if (luaFunction == null || luaFunction.isNil()) {
            return 0;
        }
        LuaValue[] luaValueArrInvoke = this.gEmmrt.invoke(null);
        LuaValue luaValueNil = (luaValueArrInvoke == null || luaValueArrInvoke.length == 0) ? LuaValue.Nil() : luaValueArrInvoke[0];
        if (AssertUtils.EZpvd(luaValueNil, this.gEmmrt, getGlobals())) {
            InterfaceC7459akI interfaceC7459akI = this.AkhnZx;
            if (interfaceC7459akI != null) {
                interfaceC7459akI.EZpvd(luaValueNil.toInt());
            }
            this.OLrzqt = luaValueNil.toInt();
        } else {
            this.OLrzqt = 0;
        }
        return this.OLrzqt;
    }

    public void copydefault(LuaValue luaValue, String str, int i) {
        Map<String, LuaFunction> map;
        LuaFunction luaFunction = (str == null || str == "NONE_REUSE_ID" || (map = this.fetchVPNInfo) == null) ? null : map.get(str);
        if (luaFunction == null) {
            luaFunction = this.valueOf;
        }
        if (!this.globals.isDestroyed() && AssertUtils.EZpvd(luaFunction, "必须通过initCell把函数设置到adapter中", getGlobals())) {
            KWHzl(luaValue);
            luaFunction.invoke(LuaValue.varargsOf(luaValue, AEQbTJ(i)));
            this.DbNXlk = true;
            InterfaceC7466akP interfaceC7466akP = this.copydefault;
            if (interfaceC7466akP != null) {
                interfaceC7466akP.AEQbTJ();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View] */
    public final void KWHzl(LuaValue luaValue) {
        if (luaValue instanceof LuaTable) {
            UDViewPagerCell uDViewPagerCell = (UDViewPagerCell) luaValue.get("contentView");
            ViewGroup.LayoutParams layoutParams = uDViewPagerCell.f_().getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (uDViewPagerCell.f_().getWidth() == 0 && this.isConnected != null) {
                layoutParams.width = -1;
            }
            if (uDViewPagerCell.f_().getHeight() == 0 && this.isConnected != null) {
                layoutParams.height = -2;
            }
            uDViewPagerCell.f_().setLayoutParams(layoutParams);
        }
    }

    public void KWHzl(LuaValue luaValue, String str, int i) {
        Map<String, LuaFunction> map;
        LuaFunction luaFunction = (str == null || str == "NONE_REUSE_ID" || (map = this.AEQbTJ) == null) ? null : map.get(str);
        if (luaFunction == null) {
            luaFunction = this.djBIcL;
        }
        if (luaFunction == null || luaFunction.isNil()) {
            return;
        }
        luaFunction.invoke(LuaValue.varargsOf(luaValue, AEQbTJ(i)));
    }

    public CharSequence copydefault(int i) {
        LuaValue[] luaValueArrInvoke;
        LuaValue luaValue;
        LuaFunction luaFunction = this.AhwBna;
        if (luaFunction == null || (luaValueArrInvoke = luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i)))) == null || luaValueArrInvoke.length <= 0 || (luaValue = luaValueArrInvoke[0]) == null) {
            return null;
        }
        return luaValue.toJavaString();
    }

    public final LuaValue AEQbTJ(int i) {
        return LuaNumber.valueOf(i + 1);
    }
}
