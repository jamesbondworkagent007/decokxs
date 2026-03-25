package com.immomo.mls.fun.ud.view.recycler;

import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.UDSize;
import o.C7320ahc;
import o.C7347aiC;
import o.C7349aiE;
import o.C7350aiF;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7451akA;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDCollectionLayout extends UDBaseRecyclerLayout implements InterfaceC7451akA {
    public static final int DEFAULT_ITEM_SIZE = 100;
    public static final int DEFAULT_SPAN_COUNT = 1;
    public static final String LUA_CLASS_NAME = "CollectionViewLayout";
    public static final String[] methods = {"itemSize", "spanCount", "layoutInset", "canScroll2Screen", "minContentSize"};
    public C7347aiC itemDecoration;
    public UDSize itemSize;
    public boolean mIsCanScrollTolScreenLeft;
    public final int[] paddingValues;
    public int spanCount;
    public boolean spanCountInit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AkhnZx() {
        if (this.spanCount <= 0) {
            this.spanCount = 1;
        }
        return this.spanCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7451akA
    public int[] EZpvd() {
        return this.paddingValues;
    }

    public final int OLrzqt(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            return i;
        }
        while ((i2 + i4) * i > i3 - i4) {
            i--;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LuaValue ejfBZ() {
        return this.itemSize;
    }

    @InterfaceC60044zuT
    public UDCollectionLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.mIsCanScrollTolScreenLeft = true;
        this.spanCountInit = false;
        this.paddingValues = new int[4];
    }

    @InterfaceC60044zuT
    public LuaValue[] itemSize(LuaValue[] luaValueArr) {
        LuaValue luaValue = luaValueArr[0];
        if (luaValue != null) {
            UDSize uDSize = this.itemSize;
            if (uDSize != null) {
                uDSize.onJavaRecycle();
            }
            UDSize uDSize2 = (UDSize) luaValue.toUserdata();
            this.itemSize = uDSize2;
            uDSize2.onJavaRef();
            this.spanCountInit = false;
            return null;
        }
        return LuaValue.varargsOf(ejfBZ());
    }

    @InterfaceC60044zuT
    public LuaValue[] minContentSize(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] spanCount(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 0) {
            int i = luaValueArr[0].toInt();
            this.spanCount = i;
            return LuaValue.rNumber(i);
        }
        if (this.spanCount <= 0) {
            this.spanCount = 1;
        }
        return LuaValue.rNumber(this.spanCount);
    }

    @Override // o.InterfaceC7451akA
    @InterfaceC60044zuT
    public LuaValue[] layoutInset(LuaValue[] luaValueArr) {
        this.paddingValues[0] = C7865arr.copydefault(luaValueArr[1].toDouble());
        this.paddingValues[1] = C7865arr.copydefault(luaValueArr[0].toDouble());
        this.paddingValues[2] = C7865arr.copydefault(luaValueArr[3].toDouble());
        this.paddingValues[3] = C7865arr.copydefault(luaValueArr[2].toDouble());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] canScroll2Screen(LuaValue[] luaValueArr) {
        this.mIsCanScrollTolScreenLeft = luaValueArr[0].toBoolean();
        return null;
    }

    public C7350aiF fetchVPNInfo() {
        UDSize uDSize = this.itemSize;
        if (uDSize != null) {
            return uDSize.AEQbTJ();
        }
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout
    public RecyclerView.ItemDecoration KWHzl() {
        C7347aiC c7347aiC = this.itemDecoration;
        if (c7347aiC == null || !c7347aiC.copydefault(this.itemSpacing, this.lineSpacing)) {
            this.itemDecoration = values();
        }
        return this.itemDecoration;
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout
    public void KWHzl(int i) {
        if (this.spanCountInit) {
            this.spanCountInit = false;
            fJNWhG();
        }
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout
    public void AEQbTJ(int i, int i2) {
        super.AEQbTJ(i, i2);
        if (this.spanCountInit) {
            this.spanCountInit = false;
            fJNWhG();
        }
    }

    public final void fJNWhG() {
        if (this.spanCountInit) {
            return;
        }
        if (this.orientation == 1) {
            this.spanCount = isConnected();
        } else {
            this.spanCount = DbNXlk();
        }
        if (this.spanCount <= 0) {
            this.spanCount = 1;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("spanCount must > 0");
            if (!C7320ahc.AEQbTJ(illegalArgumentException, getGlobals())) {
                throw illegalArgumentException;
            }
        }
        this.spanCountInit = true;
    }

    public final int isConnected() {
        int iKWHzl = (int) this.itemSize.KWHzl();
        int iCopydefault = this.width;
        if (iCopydefault == 0) {
            iCopydefault = UDBaseRecyclerLayout.copydefault();
        }
        int i = this.itemSpacing;
        return OLrzqt((iCopydefault - i) / iKWHzl, iKWHzl, iCopydefault, i);
    }

    public final int DbNXlk() {
        int iCopydefault = (int) this.itemSize.copydefault();
        int iAEQbTJ = this.height;
        if (iAEQbTJ == 0) {
            iAEQbTJ = UDBaseRecyclerLayout.AEQbTJ();
        }
        int i = this.lineSpacing;
        return OLrzqt((iAEQbTJ - i) / iCopydefault, iCopydefault, iAEQbTJ, i);
    }

    public C7347aiC values() {
        return new C7349aiE(this.orientation, this);
    }

    @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout
    public void EZpvd(boolean z) {
        C7347aiC c7347aiC = this.itemDecoration;
        if (c7347aiC != null) {
            c7347aiC.KWHzl(z);
        }
    }
}
