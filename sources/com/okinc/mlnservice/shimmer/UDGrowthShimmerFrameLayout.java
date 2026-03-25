package com.okinc.mlnservice.shimmer;

import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.okinc.mlnservice.shimmer.LuaGrowthShimmerFrameLayout;
import o.C5492Tv;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public class UDGrowthShimmerFrameLayout<T extends LuaGrowthShimmerFrameLayout> extends UDViewGroup<T> {
    public static final String[] EZpvd = {"initColorHighlightShimmer", "startShimmer", "stopShimmer", "isShimmerStarted", "showShimmer", "hideShimmer", "isShimmerVisible"};

    @InterfaceC60044zuT
    public UDGrowthShimmerFrameLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDGrowthShimmerFrameLayout(Globals globals, @NonNull T t) {
        super(globals, t);
    }

    @InterfaceC60044zuT
    public UDGrowthShimmerFrameLayout(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        return (T) new LuaGrowthShimmerFrameLayout(AubY(), this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @InterfaceC60044zuT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] initColorHighlightShimmer(LuaValue[] luaValueArr) {
        UDColor uDColor;
        UDColor uDColor2;
        if (luaValueArr.length > 0) {
            LuaValue luaValue = luaValueArr[0];
            uDColor = luaValue instanceof UDColor ? (UDColor) luaValue : null;
        }
        if (luaValueArr.length > 1) {
            LuaValue luaValue2 = luaValueArr[1];
            uDColor2 = luaValue2 instanceof UDColor ? (UDColor) luaValue2 : null;
        }
        float f = luaValueArr.length > 2 ? luaValueArr[2].toFloat() : -1.0f;
        float f2 = luaValueArr.length > 3 ? luaValueArr[3].toFloat() : -1.0f;
        long j = luaValueArr.length > 4 ? luaValueArr[4].toLong() : 0L;
        int i = luaValueArr.length > 5 ? luaValueArr[5].toInt() : 2;
        float f3 = luaValueArr.length > 6 ? luaValueArr[6].toFloat() : 30.0f;
        long j2 = luaValueArr.length > 7 ? luaValueArr[7].toLong() : 0L;
        C5492Tv.Activity activity = new C5492Tv.Activity();
        if (uDColor != null) {
            activity.djBIcL(uDColor.AEQbTJ().getColor(this.globals));
            uDColor.destroy();
        }
        if (uDColor2 != null) {
            activity.AYXKKw(uDColor2.AEQbTJ().getColor(this.globals));
            uDColor2.destroy();
        }
        if (f >= 0.0f) {
            activity.EZpvd(f);
        }
        if (f2 >= 0.0f) {
            activity.AEQbTJ(f2);
        }
        activity.OLrzqt(i);
        if (j > 0) {
            activity.copydefault(j);
        }
        activity.AhwBna(f3);
        if (j2 > 0) {
            activity.OLrzqt(j2);
        }
        ((LuaGrowthShimmerFrameLayout) f_()).setShimmer(activity.copydefault());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] startShimmer(LuaValue[] luaValueArr) {
        ((LuaGrowthShimmerFrameLayout) f_()).startShimmer();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] stopShimmer(LuaValue[] luaValueArr) {
        ((LuaGrowthShimmerFrameLayout) f_()).stopShimmer();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isShimmerStarted(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(((LuaGrowthShimmerFrameLayout) f_()).isShimmerStarted()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showShimmer(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        ((LuaGrowthShimmerFrameLayout) f_()).showShimmer(luaValueArr[0].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] hideShimmer(LuaValue[] luaValueArr) {
        ((LuaGrowthShimmerFrameLayout) f_()).hideShimmer();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isShimmerVisible(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(((LuaGrowthShimmerFrameLayout) f_()).isShimmerVisible()));
    }
}
