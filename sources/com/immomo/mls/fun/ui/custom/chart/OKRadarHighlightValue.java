package com.immomo.mls.fun.ui.custom.chart;

import com.github.mikephil.charting.highlight.Highlight;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OKRadarHighlightValue extends LuaUserdata<Highlight> {
    public static final String LUA_CLASS_NAME = "OKRadarHighlightValue";
    public static final String[] methods = new String[0];

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.github.mikephil.charting.highlight.Highlight] */
    @InterfaceC60044zuT
    public OKRadarHighlightValue(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        if (luaValueArr == null || luaValueArr.length != 3) {
            return;
        }
        this.javaUserdata = new Highlight(luaValueArr[0].toFloat(), luaValueArr[1].toFloat(), luaValueArr[2].toInt());
    }
}
