package com.immomo.mls.fun.ud;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDCanvas extends LuaUserdata<Canvas> {
    public static final String LUA_CLASS_NAME = "Canvas";
    public static final String[] methods = {"save", RequestParameters.X_OSS_RESTORE, "drawArc", "drawColor", "drawLine", "drawPath", "drawPoint", "drawText", "drawCircle", "drawRect", "drawOval", "drawGradientColor"};
    public RectF rectFTemp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.graphics.Canvas */
    /* JADX WARN: Multi-variable type inference failed */
    public void OLrzqt(Canvas canvas) {
        this.javaUserdata = canvas;
    }

    @InterfaceC60044zuT
    public UDCanvas(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDCanvas(Globals globals, Canvas canvas) {
        super(globals, canvas);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] save(LuaValue[] luaValueArr) {
        if (this.javaUserdata != 0) {
            return LuaValue.rNumber(((Canvas) r3).save());
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] restore(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        if (luaValueArr.length > 0 && luaValueArr[0].isNumber()) {
            ((Canvas) this.javaUserdata).restoreToCount(luaValueArr[0].toInt());
            return null;
        }
        ((Canvas) this.javaUserdata).restore();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawArc(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        if (this.rectFTemp == null) {
            this.rectFTemp = new RectF();
        }
        this.rectFTemp.set(C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()), C7865arr.copydefault(luaValueArr[2].toFloat()), C7865arr.copydefault(luaValueArr[3].toFloat()));
        UDPaint uDPaint = luaValueArr.length > 6 ? (UDPaint) luaValueArr[6].toUserdata() : null;
        if (uDPaint != null) {
            ((Canvas) this.javaUserdata).drawArc(this.rectFTemp, luaValueArr[4].toFloat(), luaValueArr[5].toFloat(), false, uDPaint.getJavaUserdata());
            uDPaint.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawColor(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue.isNumber()) {
            ((Canvas) this.javaUserdata).drawColor(luaValue.toInt());
        } else {
            UDColor uDColor = (UDColor) luaValue.toUserdata();
            ((Canvas) this.javaUserdata).drawColor(uDColor.copydefault());
            uDColor.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawLine(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        UDPaint uDPaint = luaValueArr.length > 4 ? (UDPaint) luaValueArr[4].toUserdata() : null;
        if (uDPaint != null) {
            ((Canvas) this.javaUserdata).drawLine(C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()), C7865arr.copydefault(luaValueArr[2].toFloat()), C7865arr.copydefault(luaValueArr[3].toFloat()), uDPaint.getJavaUserdata());
            uDPaint.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawPath(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        UDPaint uDPaint = luaValueArr.length > 1 ? (UDPaint) luaValueArr[1].toUserdata() : null;
        if (uDPaint != null) {
            ((Canvas) this.javaUserdata).drawPath((Path) luaValueArr[0].toUserdata().getJavaUserdata(), uDPaint.getJavaUserdata());
            uDPaint.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawPoint(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        UDPaint uDPaint = luaValueArr.length > 2 ? (UDPaint) luaValueArr[2].toUserdata() : null;
        if (uDPaint != null) {
            ((Canvas) this.javaUserdata).drawPoint(C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()), uDPaint.getJavaUserdata());
            uDPaint.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawText(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        UDPaint uDPaint = luaValueArr.length > 3 ? (UDPaint) luaValueArr[3].toUserdata() : null;
        if (uDPaint != null) {
            ((Canvas) this.javaUserdata).drawText(luaValueArr[0].toJavaString(), C7865arr.copydefault(luaValueArr[1].toFloat()), C7865arr.copydefault(luaValueArr[2].toFloat()), uDPaint.getJavaUserdata());
            uDPaint.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawCircle(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        UDPaint uDPaint = luaValueArr.length > 3 ? (UDPaint) luaValueArr[3].toUserdata() : null;
        if (uDPaint != null) {
            ((Canvas) this.javaUserdata).drawCircle(C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()), C7865arr.copydefault(luaValueArr[2].toFloat()), uDPaint.getJavaUserdata());
            uDPaint.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawRect(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        UDPaint uDPaint = luaValueArr.length > 4 ? (UDPaint) luaValueArr[4].toUserdata() : null;
        if (uDPaint != null) {
            ((Canvas) this.javaUserdata).drawRect(C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()), C7865arr.copydefault(luaValueArr[2].toFloat()), C7865arr.copydefault(luaValueArr[3].toFloat()), uDPaint.getJavaUserdata());
            uDPaint.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawOval(LuaValue[] luaValueArr) {
        if (this.javaUserdata == 0) {
            return null;
        }
        UDPaint uDPaint = luaValueArr.length > 4 ? (UDPaint) luaValueArr[4].toUserdata() : null;
        if (uDPaint != null) {
            if (this.rectFTemp == null) {
                this.rectFTemp = new RectF();
            }
            this.rectFTemp.set(C7865arr.copydefault(luaValueArr[0].toFloat()), C7865arr.copydefault(luaValueArr[1].toFloat()), C7865arr.copydefault(luaValueArr[2].toFloat()), C7865arr.copydefault(luaValueArr[3].toFloat()));
            ((Canvas) this.javaUserdata).drawOval(this.rectFTemp, uDPaint.getJavaUserdata());
            uDPaint.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawGradientColor(LuaValue[] luaValueArr) {
        char c;
        boolean z;
        boolean z2;
        if (this.javaUserdata == 0) {
            return null;
        }
        float fCopydefault = luaValueArr.length > 0 ? C7865arr.copydefault(luaValueArr[0].toFloat()) : 0.0f;
        float fCopydefault2 = luaValueArr.length > 1 ? C7865arr.copydefault(luaValueArr[1].toFloat()) : 0.0f;
        float fCopydefault3 = luaValueArr.length > 2 ? C7865arr.copydefault(luaValueArr[2].toFloat()) : 0.0f;
        char c2 = 3;
        float fCopydefault4 = luaValueArr.length > 3 ? C7865arr.copydefault(luaValueArr[3].toFloat()) : 0.0f;
        int i = 4;
        LuaTable luaTable = luaValueArr.length > 4 ? luaValueArr[4].toLuaTable() : null;
        UDPath uDPath = luaValueArr.length > 5 ? (UDPath) luaValueArr[5].toUserdata() : null;
        UDPaint uDPaint = luaValueArr.length > 6 ? (UDPaint) luaValueArr[6].toUserdata() : null;
        if (luaTable == null || uDPath == null || uDPaint == null) {
            return null;
        }
        int iZLjUOn = luaTable.zLjUOn();
        int[] iArr = new int[iZLjUOn];
        int i2 = 0;
        while (i2 < iZLjUOn) {
            int i3 = i2 + 1;
            String[] strArrSplit = luaTable.get(i3).toJavaString().split(",");
            if (strArrSplit.length == i) {
                z = false;
                z2 = true;
                c = 2;
                iArr[i2] = Color.argb((int) (Float.valueOf(strArrSplit[c2]).floatValue() * 255.0f), Integer.valueOf(strArrSplit[0]).intValue(), Integer.valueOf(strArrSplit[1]).intValue(), Integer.valueOf(strArrSplit[2]).intValue());
            } else {
                c = 2;
                z = false;
                z2 = true;
            }
            i2 = i3;
            c2 = 3;
            i = 4;
        }
        LinearGradient linearGradient = new LinearGradient(C7865arr.copydefault(fCopydefault), C7865arr.copydefault(fCopydefault2), C7865arr.copydefault(fCopydefault3), C7865arr.copydefault(fCopydefault4), iArr, (float[]) null, Shader.TileMode.CLAMP);
        Paint javaUserdata = uDPaint.getJavaUserdata();
        javaUserdata.setStyle(Paint.Style.FILL);
        javaUserdata.setShader(linearGradient);
        ((Canvas) this.javaUserdata).drawPath(uDPath.getJavaUserdata(), javaUserdata);
        uDPath.destroy();
        uDPaint.destroy();
        return null;
    }
}
