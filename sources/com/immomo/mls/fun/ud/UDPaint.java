package com.immomo.mls.fun.ud;

import android.graphics.BlurMaskFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.C7323ahf;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7304ahM;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDPaint extends LuaUserdata<Paint> {
    public static final String LUA_CLASS_NAME = "Paint";
    public static final String[] methods = {TtmlNode.ATTR_TTS_FONT_SIZE, "fontNameSize", "setShadowLayer", "setDash", "paintColor", "alpha", "width", TtmlNode.TAG_STYLE, "cap", "setBlurMask", "a_setAntiAlias"};

    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.graphics.Paint] */
    @InterfaceC60044zuT
    public UDPaint(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = new Paint();
        KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private void KWHzl() {
        ((Paint) this.javaUserdata).setStyle(Paint.Style.STROKE);
        ((Paint) this.javaUserdata).setStrokeWidth(C7865arr.copydefault(1.0f));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] fontSize(LuaValue[] luaValueArr) {
        T t = this.javaUserdata;
        if (t == 0) {
            return null;
        }
        ((Paint) t).setTextSize(C7865arr.OLrzqt(luaValueArr[0].toFloat()));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] fontNameSize(LuaValue[] luaValueArr) {
        InterfaceC7304ahM interfaceC7304ahMEjfBZ;
        String javaString = luaValueArr.length > 0 ? luaValueArr[0].toJavaString() : null;
        int iOLrzqt = luaValueArr.length > 1 ? C7865arr.OLrzqt(luaValueArr[1].toInt()) : 0;
        if (this.javaUserdata != 0) {
            if (!TextUtils.isEmpty(javaString) && (interfaceC7304ahMEjfBZ = C7323ahf.ejfBZ()) != null) {
                ((Paint) this.javaUserdata).setTypeface(interfaceC7304ahMEjfBZ.KWHzl(javaString));
            }
            ((Paint) this.javaUserdata).setTextSize(iOLrzqt);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setShadowLayer(LuaValue[] luaValueArr) {
        int iOLrzqt = luaValueArr.length > 0 ? C7865arr.OLrzqt(luaValueArr[0].toInt()) : 0;
        int iOLrzqt2 = luaValueArr.length > 1 ? C7865arr.OLrzqt(luaValueArr[1].toInt()) : 0;
        int iOLrzqt3 = luaValueArr.length > 2 ? C7865arr.OLrzqt(luaValueArr[2].toInt()) : 0;
        UDColor uDColor = luaValueArr.length > 3 ? (UDColor) luaValueArr[3].toUserdata() : null;
        if (uDColor != null) {
            ((Paint) this.javaUserdata).setShadowLayer(iOLrzqt, iOLrzqt2, iOLrzqt3, uDColor.copydefault());
            uDColor.destroy();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDash(LuaValue[] luaValueArr) {
        LuaTable luaTable = luaValueArr.length > 0 ? luaValueArr[0].toLuaTable() : null;
        int i = luaValueArr.length > 1 ? luaValueArr[1].toInt() - 1 : 0;
        if (luaTable != null) {
            int iZLjUOn = luaTable.zLjUOn();
            float[] fArr = new float[iZLjUOn];
            for (int i2 = 0; i2 < iZLjUOn; i2++) {
                fArr[i2] = C7865arr.copydefault(luaTable.get(r5).toFloat());
            }
            ((Paint) this.javaUserdata).setPathEffect(new DashPathEffect(fArr, i));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] paintColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return LuaValue.varargsOf(new UDColor(getGlobals(), ((Paint) this.javaUserdata).getColor()));
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue.isNumber()) {
            ((Paint) this.javaUserdata).setColor((int) luaValue.toLong());
            return null;
        }
        UDColor uDColor = (UDColor) luaValueArr[0].toUserdata();
        ((Paint) this.javaUserdata).setColor(uDColor.copydefault());
        uDColor.destroy();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] width(LuaValue[] luaValueArr) {
        int iCopydefault = luaValueArr.length > 0 ? C7865arr.copydefault(luaValueArr[0].toInt()) : -1;
        if (iCopydefault != -1) {
            ((Paint) this.javaUserdata).setStrokeWidth(iCopydefault);
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(((Paint) this.javaUserdata).getStrokeWidth()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] alpha(LuaValue[] luaValueArr) {
        int i = luaValueArr.length > 0 ? (int) (luaValueArr[0].toFloat() * 255.0f) : -1;
        if (i != -1) {
            ((Paint) this.javaUserdata).setAlpha(i);
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(((Paint) this.javaUserdata).getAlpha()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] style(LuaValue[] luaValueArr) {
        Paint.Style style;
        int i = luaValueArr.length > 0 ? luaValueArr[0].toInt() : -1;
        if (i == -1) {
            return LuaValue.varargsOf(LuaValue.rNumber(((Paint) this.javaUserdata).getStyle().ordinal()));
        }
        if (i == 0) {
            style = Paint.Style.FILL;
        } else if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = i != 2 ? null : Paint.Style.FILL_AND_STROKE;
        }
        if (style != null) {
            ((Paint) this.javaUserdata).setStyle(style);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cap(LuaValue[] luaValueArr) {
        Paint.Cap cap;
        int i = luaValueArr.length > 0 ? luaValueArr[0].toInt() : -1;
        if (i == -1) {
            return LuaValue.varargsOf(LuaValue.rNumber(((Paint) this.javaUserdata).getStrokeCap().ordinal()));
        }
        if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i != 2 ? null : Paint.Cap.SQUARE;
        }
        if (cap != null) {
            ((Paint) this.javaUserdata).setStrokeCap(cap);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setBlurMask(LuaValue[] luaValueArr) {
        float f = luaValueArr.length > 0 ? luaValueArr[0].toFloat() : 0.0f;
        int i = luaValueArr.length > 1 ? luaValueArr[1].toInt() : 0;
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        if (i != 0) {
            if (i == 1) {
                blur = BlurMaskFilter.Blur.SOLID;
            } else if (i == 2) {
                blur = BlurMaskFilter.Blur.OUTER;
            } else if (i == 3) {
                blur = BlurMaskFilter.Blur.INNER;
            }
        }
        if (((Paint) this.javaUserdata).getAlpha() == 255) {
            ((Paint) this.javaUserdata).setAlpha(254);
        }
        if (f <= 0.0f) {
            return null;
        }
        ((Paint) this.javaUserdata).setMaskFilter(new BlurMaskFilter(f, blur));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] a_setAntiAlias(LuaValue[] luaValueArr) {
        boolean z = false;
        if (luaValueArr.length > 0 && luaValueArr[0].toBoolean()) {
            z = true;
        }
        ((Paint) this.javaUserdata).setAntiAlias(z);
        return null;
    }
}
