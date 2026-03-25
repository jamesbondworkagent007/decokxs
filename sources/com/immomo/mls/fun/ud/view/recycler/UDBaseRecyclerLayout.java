package com.immomo.mls.fun.ud.view.recycler;

import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import o.C7326ahi;
import o.C7857arj;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.JavaUserdata;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public abstract class UDBaseRecyclerLayout<A extends UDBaseRecyclerAdapter> extends JavaUserdata {
    public static final String LUA_CLASS_NAME = "__BaseRecyclerLayout";
    public static final String[] methods = {"lineSpacing", "itemSpacing"};
    public A adapter;
    public float[] contentInsets;
    public int height;
    public int itemSpacing;
    public int lineSpacing;
    public int orientation;
    public int width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AYXKKw() {
        return this.orientation;
    }

    public void EZpvd(boolean z) {
    }

    public abstract RecyclerView.ItemDecoration KWHzl();

    public void KWHzl(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float[] OLrzqt() {
        return this.contentInsets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(A a2) {
        this.adapter = a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int djBIcL() {
        return this.lineSpacing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int gEmmrt() {
        return this.itemSpacing;
    }

    @InterfaceC60044zuT
    public UDBaseRecyclerLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.lineSpacing = 0;
        this.itemSpacing = 0;
        this.orientation = 1;
        this.contentInsets = new float[4];
    }

    @InterfaceC60044zuT
    public LuaValue[] lineSpacing(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            this.lineSpacing = C7865arr.copydefault(luaValueArr[0]);
            return null;
        }
        return LuaValue.varargsOf(valueOf());
    }

    @InterfaceC60044zuT
    public LuaValue[] itemSpacing(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            this.itemSpacing = C7865arr.copydefault(luaValueArr[0]);
            return null;
        }
        return LuaValue.varargsOf(AhwBna());
    }

    public LuaValue valueOf() {
        return LuaNumber.copydefault(C7865arr.AEQbTJ(this.lineSpacing));
    }

    public LuaValue AhwBna() {
        return LuaNumber.copydefault(C7865arr.AEQbTJ(this.itemSpacing));
    }

    public final void AEQbTJ(int i) {
        if (this.orientation != i) {
            this.orientation = i;
            KWHzl(i);
        }
    }

    public static int copydefault() {
        return C7857arj.djBIcL(C7326ahi.OLrzqt());
    }

    public static int AEQbTJ() {
        return C7857arj.AhwBna(C7326ahi.OLrzqt());
    }
}
