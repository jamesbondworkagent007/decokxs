package com.immomo.mls.fun.ud;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.immomo.mls.utils.AssertUtils;
import o.C7322ahe;
import o.C7364aiT;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public abstract class UDBaseNView<V extends View> extends LuaUserdata<V> {
    public LuaFunction AEQbTJ;
    public LuaFunction AYXKKw;
    public int AhwBna;
    public int EZpvd;
    public ViewGroup KWHzl;
    public int OLrzqt;
    public int copydefault;
    public LuaValue valueOf;

    public abstract V EZpvd(Context context, @NonNull LuaValue[] luaValueArr);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i, int i2) {
        this.OLrzqt = i;
        this.EZpvd = i2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.view.View, java.lang.Object] */
    @InterfaceC60044zuT
    public UDBaseNView(long j, @NonNull LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        ?? EZpvd = EZpvd(OLrzqt(), luaValueArr);
        this.javaUserdata = EZpvd;
        AssertUtils.AEQbTJ((Object) EZpvd);
    }

    @InterfaceC60044zuT
    public UDBaseNView(@NonNull Globals globals, V v) {
        super(globals, v);
    }

    public Context OLrzqt() {
        C7322ahe c7322ahe = (C7322ahe) getGlobals().AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public void copydefault(boolean z, double d, double d2, double d3, double d4) {
        this.AhwBna = C7865arr.copydefault(d3 - d);
        this.copydefault = C7865arr.copydefault(d4 - d2);
        int iCopydefault = C7865arr.copydefault(d);
        int iCopydefault2 = C7865arr.copydefault(d2);
        ((View) this.javaUserdata).setX(iCopydefault);
        ((View) this.javaUserdata).setY(iCopydefault2);
    }

    public void EZpvd(double d, double d2, double d3, double d4) {
        getJavaUserdata().setPaddingRelative(C7865arr.copydefault(d), C7865arr.copydefault(d2), C7865arr.copydefault(d3), C7865arr.copydefault(d4));
    }

    public void KWHzl(int i, double d, int i2, double d2) {
        int iKWHzl = C7364aiT.KWHzl(i, d);
        int iKWHzl2 = C7364aiT.KWHzl(i2, d2);
        V javaUserdata = getJavaUserdata();
        javaUserdata.measure(iKWHzl, iKWHzl2);
        EZpvd(javaUserdata.getMeasuredWidth(), javaUserdata.getMeasuredHeight());
        ViewGroup.LayoutParams layoutParams = javaUserdata.getLayoutParams();
        int i3 = layoutParams.width;
        int i4 = this.OLrzqt;
        if (i3 == i4 && layoutParams.height == this.EZpvd) {
            return;
        }
        layoutParams.width = i4;
        layoutParams.height = this.EZpvd;
        javaUserdata.requestLayout();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] onAddedToViewTree(LuaValue[] luaValueArr) {
        LuaValue luaValue = this.valueOf;
        if (luaValue != null) {
            luaValue.destroy();
        }
        this.valueOf = luaValueArr[0];
        ViewGroup viewGroup = (ViewGroup) luaValueArr[1].toUserdata().getJavaUserdata();
        this.KWHzl = viewGroup;
        viewGroup.addView((View) this.javaUserdata);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] onRemovedFromViewTree(LuaValue[] luaValueArr) {
        LuaValue luaValue = this.valueOf;
        if (luaValue != null) {
            luaValue.destroy();
        }
        this.valueOf = null;
        this.KWHzl.removeView((View) this.javaUserdata);
        this.KWHzl = null;
        return null;
    }

    @InterfaceC60044zuT
    private LuaValue[] setRefreshFunction(LuaValue[] luaValueArr) {
        this.AYXKKw = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    private LuaValue[] setLayoutFunction(LuaValue[] luaValueArr) {
        this.AEQbTJ = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    private LuaValue[] onMeasure(LuaValue[] luaValueArr) {
        KWHzl(luaValueArr[0].toInt(), luaValueArr[1].toDouble(), luaValueArr[2].toInt(), luaValueArr[3].toDouble());
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(this.OLrzqt)), LuaNumber.copydefault(C7865arr.AEQbTJ(this.EZpvd)));
    }

    @InterfaceC60044zuT
    private LuaValue[] onLayout(LuaValue[] luaValueArr) {
        copydefault(luaValueArr[0].toBoolean(), luaValueArr[1].toDouble(), luaValueArr[2].toDouble(), luaValueArr[3].toDouble(), luaValueArr[4].toDouble());
        return null;
    }

    @InterfaceC60044zuT
    private LuaValue[] onPadding(LuaValue[] luaValueArr) {
        EZpvd(luaValueArr[0].toDouble(), luaValueArr[1].toDouble(), luaValueArr[2].toDouble(), luaValueArr[3].toDouble());
        return null;
    }

    @Override // org.luaj.vm2.LuaUserdata
    public void __onLuaGc() {
        super.__onLuaGc();
    }
}
