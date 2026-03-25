package com.immomo.mls.fun.ui.custom;

import android.graphics.Color;
import androidx.viewpager.widget.ViewPager;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.custom.OkLuaImageTitleSegmentLayout;
import java.util.List;
import o.C7801aqg;
import o.C7829arH;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OkSegmentImageTitleLayout<T extends OkLuaImageTitleSegmentLayout> extends UDViewGroup<T> {
    public static final String[] AEQbTJ = {"setPadding", "itemWidth", "setItemSpacing", "textColor", "setFontNameSize"};
    public static final int copydefault = Color.argb(255, 50, 51, 51);
    public OkLuaImageTitleSegmentLayout EZpvd;
    public JColor KWHzl;

    @InterfaceC60044zuT
    public OkSegmentImageTitleLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        OLrzqt(luaValueArr);
    }

    private void OLrzqt(LuaValue[] luaValueArr) {
        if (luaValueArr == null) {
            throw new IllegalArgumentException();
        }
        if (luaValueArr.length == 2) {
            UDColor uDColor = (UDColor) luaValueArr[2];
            this.KWHzl = uDColor.AEQbTJ();
            uDColor.destroy();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        T t = (T) new OkLuaImageTitleSegmentLayout(AubY(), this, luaValueArr);
        this.EZpvd = t;
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setPadding(LuaValue[] luaValueArr) {
        ((OkLuaImageTitleSegmentLayout) f_()).setPaddingRelative(C7865arr.copydefault(luaValueArr[0].toInt()), C7865arr.copydefault(luaValueArr[1].toInt()), C7865arr.copydefault(luaValueArr[2].toInt()), C7865arr.copydefault(luaValueArr[3].toInt()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] itemWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.EZpvd.imageTitleIndicatorView.setItemWidth(C7865arr.copydefault(luaValue.toInt()));
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(C7865arr.AEQbTJ(this.EZpvd.imageTitleIndicatorView.copydefault())));
    }

    @InterfaceC60044zuT
    public LuaValue[] setItemSpacing(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.EZpvd.imageTitleIndicatorView.setItemSpacing(C7865arr.copydefault(luaValue.toInt()));
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(C7865arr.AEQbTJ(this.EZpvd.imageTitleIndicatorView.OLrzqt())));
    }

    @InterfaceC60044zuT
    public LuaValue[] textColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            UDColor uDColor = (UDColor) luaValue.toUserdata();
            this.KWHzl = uDColor.AEQbTJ();
            uDColor.destroy();
            this.EZpvd.imageTitleIndicatorView.setTextColor(this.KWHzl.getColor(this.globals));
            return null;
        }
        LuaValue[] luaValueArr2 = new LuaValue[1];
        Globals globals = getGlobals();
        JColor jColor = this.KWHzl;
        luaValueArr2[0] = new UDColor(globals, jColor == null ? copydefault : jColor.getColor(this.globals));
        return LuaValue.varargsOf(luaValueArr2);
    }

    @InterfaceC60044zuT
    public LuaValue[] setFontNameSize(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr != null && luaValueArr.length == 2 && (luaValue2 = luaValueArr[1]) != null) {
            this.EZpvd.imageTitleIndicatorView.setFontSizePx(C7865arr.OLrzqt(luaValue2.toInt()));
        }
        if (luaValueArr == null || luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.EZpvd.imageTitleIndicatorView.setFontTypeface(C7829arH.KWHzl.AEQbTJ(luaValue.toJavaString(), AubY()));
        return null;
    }

    public void EZpvd(List<C7801aqg.TaskDescription> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.EZpvd.imageTitleIndicatorView.setItems(list);
    }

    public void KWHzl(ViewPager viewPager) {
        this.EZpvd.imageTitleIndicatorView.setViewPager(viewPager);
    }
}
