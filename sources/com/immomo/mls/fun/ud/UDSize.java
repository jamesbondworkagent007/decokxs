package com.immomo.mls.fun.ud;

import o.C7350aiF;
import o.InterfaceC60044zuT;
import o.InterfaceC8009aud;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDSize extends LuaUserdata {
    public static final String LUA_CLASS_NAME = "Size";
    public final C7350aiF mSize;
    public static final String[] methods = {"width", "height"};
    public static final InterfaceC8009aud<UDSize, C7350aiF> G = new InterfaceC8009aud<UDSize, C7350aiF>() { // from class: com.immomo.mls.fun.ud.UDSize.5
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Lorg/luaj/vm2/Globals;Ljava/lang/Object;)Lorg/luaj/vm2/LuaValue; */
        @Override // o.InterfaceC8009aud
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public UDSize KWHzl(Globals globals, C7350aiF c7350aiF) {
            return new UDSize(globals, c7350aiF);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7350aiF AEQbTJ() {
        return this.mSize;
    }

    public UDSize(Globals globals, Object obj) {
        super(globals, obj);
        this.mSize = (C7350aiF) obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, o.aiF] */
    @InterfaceC60044zuT
    public UDSize(long j, LuaValue[] luaValueArr) {
        super(j, (LuaValue[]) null);
        ?? c7350aiF = new C7350aiF();
        this.mSize = c7350aiF;
        this.javaUserdata = c7350aiF;
        AEQbTJ(luaValueArr);
    }

    private void AEQbTJ(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            if (luaValueArr.length >= 1) {
                AEQbTJ((float) luaValueArr[0].toDouble());
            }
            if (luaValueArr.length >= 2) {
                KWHzl((float) luaValueArr[1].toDouble());
            }
        }
    }

    public float KWHzl() {
        return this.mSize.copydefault();
    }

    public float copydefault() {
        return this.mSize.AEQbTJ();
    }

    @InterfaceC60044zuT
    public LuaValue[] width(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(this.mSize.KWHzl()));
        }
        AEQbTJ((float) luaValueArr[0].toDouble());
        return null;
    }

    public void AEQbTJ(float f) {
        if (f == -1.0f) {
            f = Float.MIN_VALUE;
        }
        if (f == -2.0f) {
            f = 2.8E-45f;
        }
        this.mSize.AEQbTJ(f);
    }

    @InterfaceC60044zuT
    public LuaValue[] height(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(this.mSize.EZpvd()));
        }
        KWHzl((float) luaValueArr[0].toDouble());
        return null;
    }

    public void KWHzl(float f) {
        if (f == -1.0f) {
            f = Float.MIN_VALUE;
        }
        if (f == -2.0f) {
            f = 2.8E-45f;
        }
        this.mSize.KWHzl(f);
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public String toString() {
        return this.mSize.toString();
    }
}
