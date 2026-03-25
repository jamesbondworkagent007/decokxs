package com.immomo.mls.fun.ud.view.recycler;

import androidx.recyclerview.widget.RecyclerView;
import o.C7320ahc;
import o.C7353aiI;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7451akA;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDWaterFallLayout extends UDBaseRecyclerLayout implements InterfaceC7451akA {
    public static final String[] EZpvd = {"spanCount", "layoutInset"};
    public int AEQbTJ;
    public C7353aiI OLrzqt;
    public final int[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7451akA
    public int[] EZpvd() {
        return this.copydefault;
    }

    @InterfaceC60044zuT
    public UDWaterFallLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AEQbTJ = 2;
        this.copydefault = new int[4];
    }

    @Override // o.InterfaceC7451akA
    @InterfaceC60044zuT
    public LuaValue[] layoutInset(LuaValue[] luaValueArr) {
        this.copydefault[0] = C7865arr.copydefault(luaValueArr[1].toDouble());
        this.copydefault[1] = C7865arr.copydefault(luaValueArr[0].toDouble());
        this.copydefault[2] = C7865arr.copydefault(luaValueArr[3].toDouble());
        this.copydefault[3] = C7865arr.copydefault(luaValueArr[2].toDouble());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] spanCount(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            this.AEQbTJ = luaValueArr[0].toInt();
            A a2 = this.adapter;
            if (a2 != 0) {
                a2.AEQbTJ(this, a2.zuBGHE);
            }
            return LuaValue.rNumber(this.AEQbTJ);
        }
        return LuaValue.rNumber(values());
    }

    public int values() {
        if (this.AEQbTJ <= 0) {
            this.AEQbTJ = 1;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("spanCount must > 0");
            if (!C7320ahc.AEQbTJ(illegalArgumentException, getGlobals())) {
                throw illegalArgumentException;
            }
        }
        return this.AEQbTJ;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout
    public RecyclerView.ItemDecoration KWHzl() {
        C7353aiI c7353aiI = this.OLrzqt;
        if (c7353aiI == null || c7353aiI.EZpvd != this.itemSpacing || c7353aiI.copydefault != this.lineSpacing) {
            this.OLrzqt = new C7353aiI(this);
        }
        return this.OLrzqt;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout
    public void EZpvd(boolean z) {
        C7353aiI c7353aiI = this.OLrzqt;
        if (c7353aiI != null) {
            c7353aiI.KWHzl(z);
        }
    }
}
