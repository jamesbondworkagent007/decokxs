package com.immomo.mls.fun.ud;

import com.ibm.icu.text.DateFormat;
import o.C7352aiH;
import o.InterfaceC60044zuT;
import o.InterfaceC8009aud;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDRect extends LuaUserdata {
    public static final String LUA_CLASS_NAME = "Rect";
    public final C7352aiH rect;
    public static final String[] methods = {"x", DateFormat.YEAR, "width", "height", "point", "size"};
    public static final InterfaceC8009aud<UDRect, C7352aiH> G = new InterfaceC8009aud<UDRect, C7352aiH>() { // from class: com.immomo.mls.fun.ud.UDRect.2
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Lorg/luaj/vm2/Globals;Ljava/lang/Object;)Lorg/luaj/vm2/LuaValue; */
        @Override // o.InterfaceC8009aud
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public UDRect KWHzl(Globals globals, C7352aiH c7352aiH) {
            return new UDRect(globals, c7352aiH);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7352aiH EZpvd() {
        return this.rect;
    }

    public UDRect(Globals globals, Object obj) {
        super(globals, obj);
        this.rect = (C7352aiH) obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, o.aiH] */
    @InterfaceC60044zuT
    public UDRect(long j, LuaValue[] luaValueArr) {
        super(j, (LuaValue[]) null);
        ?? c7352aiH = new C7352aiH();
        this.rect = c7352aiH;
        this.javaUserdata = c7352aiH;
        copydefault(luaValueArr);
    }

    private void copydefault(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            if (luaValueArr.length >= 1) {
                this.rect.AEQbTJ((float) luaValueArr[0].toDouble());
            }
            if (luaValueArr.length >= 2) {
                this.rect.OLrzqt((float) luaValueArr[1].toDouble());
            }
            if (luaValueArr.length >= 3) {
                this.rect.EZpvd((float) luaValueArr[2].toDouble());
            }
            if (luaValueArr.length >= 4) {
                this.rect.KWHzl((float) luaValueArr[3].toDouble());
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] x(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            this.rect.AEQbTJ((float) luaValueArr[0].toDouble());
            return null;
        }
        return LuaValue.rNumber(this.rect.KWHzl());
    }

    @InterfaceC60044zuT
    public LuaValue[] y(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            this.rect.OLrzqt((float) luaValueArr[0].toDouble());
            return null;
        }
        return LuaValue.rNumber(this.rect.djBIcL());
    }

    @InterfaceC60044zuT
    public LuaValue[] width(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            this.rect.EZpvd((float) luaValueArr[0].toDouble());
            return null;
        }
        return LuaValue.rNumber(this.rect.AEQbTJ());
    }

    @InterfaceC60044zuT
    public LuaValue[] height(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            this.rect.KWHzl((float) luaValueArr[0].toDouble());
            return null;
        }
        return LuaValue.rNumber(this.rect.OLrzqt());
    }

    @InterfaceC60044zuT
    public LuaValue[] point(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(new UDPoint(getGlobals(), this.rect.copydefault()));
        }
        this.rect.OLrzqt(((UDPoint) luaValueArr[0]).EZpvd());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] size(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(new UDSize(getGlobals(), this.rect.EZpvd()));
        }
        this.rect.EZpvd(((UDSize) luaValueArr[0]).AEQbTJ());
        return null;
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        return this.rect.toString();
    }
}
