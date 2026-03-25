package com.immomo.mls.fun.ud;

import android.graphics.Path;
import android.graphics.RectF;
import com.okinc.liveness.lca.EopTrackEvent;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDPath extends LuaUserdata<Path> {
    public static final String LUA_CLASS_NAME = "Path";
    public static final String[] methods = {"reset", "moveTo", "lineTo", "arcTo", "quadTo", "cubicTo", "addPath", EopTrackEvent.CLOSE, "setFillType", "addArc", "addRect", "addCircle"};

    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.graphics.Path] */
    @InterfaceC60044zuT
    public UDPath(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = new Path();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] reset(LuaValue[] luaValueArr) {
        ((Path) this.javaUserdata).reset();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] moveTo(LuaValue[] luaValueArr) {
        ((Path) this.javaUserdata).moveTo(C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] lineTo(LuaValue[] luaValueArr) {
        ((Path) this.javaUserdata).lineTo(C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] quadTo(LuaValue[] luaValueArr) {
        ((Path) this.javaUserdata).quadTo(C7865arr.copydefault(luaValueArr[2].toFloat()), C7865arr.copydefault(luaValueArr[3].toFloat()), C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cubicTo(LuaValue[] luaValueArr) {
        ((Path) this.javaUserdata).cubicTo(C7865arr.copydefault(luaValueArr[2].toFloat()), C7865arr.copydefault(luaValueArr[3].toFloat()), C7865arr.copydefault(luaValueArr[4].toFloat()), C7865arr.copydefault(luaValueArr[5].toFloat()), C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] arcTo(LuaValue[] luaValueArr) {
        float fCopydefault = luaValueArr.length > 0 ? C7865arr.copydefault(luaValueArr[0].toFloat()) : 0.0f;
        float fCopydefault2 = luaValueArr.length > 1 ? C7865arr.copydefault(luaValueArr[1].toFloat()) : 0.0f;
        int iCopydefault = luaValueArr.length > 2 ? C7865arr.copydefault(luaValueArr[2].toInt()) : 0;
        float f = iCopydefault;
        ((Path) this.javaUserdata).arcTo(new RectF(fCopydefault - f, fCopydefault2 - f, fCopydefault + f, fCopydefault2 + f), luaValueArr.length > 3 ? luaValueArr[3].toInt() : 0, (luaValueArr.length > 4 ? luaValueArr[4].toInt() : 0) - r4);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addPath(LuaValue[] luaValueArr) {
        UDPath uDPath = luaValueArr.length > 0 ? (UDPath) luaValueArr[0].toUserdata() : null;
        if (uDPath != null) {
            ((Path) this.javaUserdata).addPath((Path) uDPath.javaUserdata);
            uDPath.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] close(LuaValue[] luaValueArr) {
        ((Path) this.javaUserdata).close();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setFillType(LuaValue[] luaValueArr) {
        int i = luaValueArr.length > 0 ? luaValueArr[0].toInt() : -1;
        if (i == -1) {
            return null;
        }
        Path.FillType fillType = Path.FillType.WINDING;
        if (i != 0) {
            if (i == 1) {
                fillType = Path.FillType.EVEN_ODD;
            } else if (i == 2) {
                fillType = Path.FillType.INVERSE_WINDING;
            } else if (i == 3) {
                fillType = Path.FillType.INVERSE_EVEN_ODD;
            }
        }
        ((Path) this.javaUserdata).setFillType(fillType);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addRect(LuaValue[] luaValueArr) {
        boolean z = false;
        int iCopydefault = luaValueArr.length > 0 ? C7865arr.copydefault(luaValueArr[0].toInt()) : 0;
        int iCopydefault2 = luaValueArr.length > 1 ? C7865arr.copydefault(luaValueArr[1].toInt()) : 0;
        int iCopydefault3 = luaValueArr.length > 2 ? C7865arr.copydefault(luaValueArr[2].toInt()) : 0;
        int iCopydefault4 = luaValueArr.length > 3 ? C7865arr.copydefault(luaValueArr[3].toInt()) : 0;
        if (luaValueArr.length > 4 && luaValueArr[4].toBoolean()) {
            z = true;
        }
        Path.Direction direction = Path.Direction.CCW;
        if (z) {
            direction = Path.Direction.CW;
        }
        ((Path) this.javaUserdata).addRect(iCopydefault, iCopydefault2, iCopydefault3, iCopydefault4, direction);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addArc(LuaValue[] luaValueArr) {
        float fCopydefault = luaValueArr.length > 0 ? C7865arr.copydefault(luaValueArr[0].toFloat()) : 0.0f;
        float fCopydefault2 = luaValueArr.length > 1 ? C7865arr.copydefault(luaValueArr[1].toFloat()) : 0.0f;
        int iCopydefault = luaValueArr.length > 2 ? C7865arr.copydefault(luaValueArr[2].toInt()) : 0;
        float f = iCopydefault;
        ((Path) this.javaUserdata).addArc(new RectF(fCopydefault - f, fCopydefault2 - f, fCopydefault + f, fCopydefault2 + f), luaValueArr.length > 3 ? luaValueArr[3].toInt() : 0, (luaValueArr.length > 4 ? luaValueArr[4].toInt() : 0) - r4);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addCircle(LuaValue[] luaValueArr) {
        boolean z = false;
        int iCopydefault = luaValueArr.length > 0 ? C7865arr.copydefault(luaValueArr[0].toInt()) : -1;
        int iCopydefault2 = luaValueArr.length > 1 ? C7865arr.copydefault(luaValueArr[1].toInt()) : -1;
        int iCopydefault3 = luaValueArr.length > 2 ? C7865arr.copydefault(luaValueArr[2].toInt()) : -1;
        if (luaValueArr.length > 3 && luaValueArr[3].toBoolean()) {
            z = true;
        }
        Path.Direction direction = Path.Direction.CCW;
        if (z) {
            direction = Path.Direction.CW;
        }
        ((Path) this.javaUserdata).addCircle(iCopydefault, iCopydefault2, iCopydefault3, direction);
        return null;
    }
}
