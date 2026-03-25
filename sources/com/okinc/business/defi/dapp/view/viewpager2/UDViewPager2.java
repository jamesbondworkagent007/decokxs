package com.okinc.business.defi.dapp.view.viewpager2;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import com.okinc.business.defi.dapp.view.viewpager2.LuaViewPager2;
import o.C7840arS;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7949atV;
import o.InterfaceC8006aua;
import o.dAV;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC60044zuT
public class UDViewPager2<U extends LuaViewPager2, A extends UDBaseRecyclerAdapter> extends UDViewGroup<U> {
    public static final String[] copydefault = {"adapter", "reloadData", "onChangeSelected", "setCurrentItem", "setPageMargin", "setMinScale"};
    public LuaViewPager2 EZpvd;
    public A KWHzl;
    public InterfaceC7949atV OLrzqt;

    @InterfaceC60044zuT
    public UDViewPager2(Globals globals, U u) {
        super(globals, u);
    }

    @InterfaceC60044zuT
    public UDViewPager2(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDViewPager2(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        this.EZpvd = new LuaViewPager2(AubY());
        this.OLrzqt = new InterfaceC7949atV() { // from class: com.okinc.business.defi.dapp.view.viewpager2.UDViewPager2.1
            @Override // o.InterfaceC7949atV
            public int AEQbTJ() {
                return 0;
            }

            @Override // o.InterfaceC7949atV
            public void AYXKKw() {
            }

            @Override // o.InterfaceC7949atV
            public void EZpvd() {
            }

            @Override // o.InterfaceC7949atV
            public void EZpvd(boolean z) {
            }

            @Override // o.InterfaceC7949atV
            public boolean OLrzqt() {
                return false;
            }

            @Override // o.InterfaceC7949atV
            public boolean OLrzqt(boolean z) {
                return false;
            }

            @Override // o.InterfaceC7949atV
            public <T extends View & InterfaceC8006aua> T copydefault() {
                return null;
            }

            @Override // o.InterfaceC7949atV
            public boolean djBIcL() {
                return false;
            }

            @Override // o.InterfaceC7949atV
            public void gEmmrt() {
            }

            @Override // o.InterfaceC7949atV
            public void valueOf() {
            }
        };
        return (U) this.EZpvd;
    }

    @InterfaceC60044zuT
    public final LuaValue[] adapter(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            LuaValue[] luaValueArr2 = new LuaValue[1];
            LuaValue luaValueNil = this.KWHzl;
            if (luaValueNil == null) {
                luaValueNil = LuaValue.Nil();
            }
            luaValueArr2[0] = luaValueNil;
            return LuaValue.varargsOf(luaValueArr2);
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isUserdata()) {
            return null;
        }
        final UDBaseRecyclerAdapter uDBaseRecyclerAdapter = (UDBaseRecyclerAdapter) luaValue.toUserdata();
        C7840arS.KWHzl(new Runnable() { // from class: com.okinc.business.defi.dapp.view.viewpager2.UDViewPager2.2
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.view.viewpager2.UDViewPager2 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                UDViewPager2.this.copydefault(uDBaseRecyclerAdapter);
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMinScale(LuaValue[] luaValueArr) {
        this.EZpvd.EZpvd(1);
        this.EZpvd.EZpvd(new dAV((float) luaValueArr[0].toDouble()));
        return null;
    }

    public void copydefault(A a2) {
        this.KWHzl = a2;
        a2.copydefault(this.OLrzqt);
        this.KWHzl.KWHzl(this.EZpvd);
        a2.AhwBna(AubY().getResources().getDisplayMetrics().widthPixels, AubY().getResources().getDisplayMetrics().heightPixels);
        this.EZpvd.setAdapter(a2.gEmmrt());
    }

    @InterfaceC60044zuT
    public LuaValue[] reloadData(LuaValue[] luaValueArr) {
        A a2 = this.KWHzl;
        if (a2 == null) {
            return null;
        }
        a2.hDKMBd();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] onChangeSelected(final LuaValue[] luaValueArr) {
        this.EZpvd.AEQbTJ(new ViewPager2.OnPageChangeCallback() { // from class: com.okinc.business.defi.dapp.view.viewpager2.UDViewPager2.5
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i, float f, int i2) {
                super.onPageScrolled(i, f, i2);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                super.onPageSelected(i);
                luaValueArr[0].toLuaFunction().EZpvd(i + 1);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCurrentItem(LuaValue[] luaValueArr) {
        int i = luaValueArr[0].toInt();
        this.EZpvd.setCurrentItem(i - 1, luaValueArr[1].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPageMargin(LuaValue[] luaValueArr) {
        this.EZpvd.OLrzqt(C7865arr.copydefault((float) luaValueArr[0].toDouble()), C7865arr.copydefault((float) luaValueArr[1].toDouble()));
        return null;
    }
}
