package com.immomo.mls.fun.ud;

import com.ibm.icu.text.DateFormat;
import o.C7348aiD;
import o.InterfaceC60044zuT;
import o.InterfaceC8009aud;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDPoint extends LuaUserdata {
    public static final String LUA_CLASS_NAME = "Point";
    public final C7348aiD point;
    public static final String[] methods = {"x", DateFormat.YEAR};
    public static final InterfaceC8009aud<UDPoint, C7348aiD> G = new InterfaceC8009aud<UDPoint, C7348aiD>() { // from class: com.immomo.mls.fun.ud.UDPoint.4
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Lorg/luaj/vm2/Globals;Ljava/lang/Object;)Lorg/luaj/vm2/LuaValue; */
        @Override // o.InterfaceC8009aud
        public UDPoint KWHzl(Globals globals, C7348aiD c7348aiD) {
            return new UDPoint(globals, c7348aiD);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7348aiD EZpvd() {
        return this.point;
    }

    public UDPoint(Globals globals, Object obj) {
        super(globals, obj);
        this.point = (C7348aiD) obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, o.aiD] */
    @InterfaceC60044zuT
    public UDPoint(long j, LuaValue[] luaValueArr) {
        super(j, (LuaValue[]) null);
        ?? c7348aiD = new C7348aiD();
        this.point = c7348aiD;
        this.javaUserdata = c7348aiD;
        AEQbTJ(luaValueArr);
    }

    private void AEQbTJ(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            if (luaValueArr.length >= 1) {
                OLrzqt((float) luaValueArr[0].toDouble());
            }
            if (luaValueArr.length >= 2) {
                KWHzl((float) luaValueArr[1].toDouble());
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] x(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            OLrzqt((float) luaValueArr[0].toDouble());
            return null;
        }
        return LuaValue.rNumber(copydefault());
    }

    @InterfaceC60044zuT
    public LuaValue[] y(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            KWHzl((float) luaValueArr[0].toDouble());
            return null;
        }
        return LuaValue.rNumber(AEQbTJ());
    }

    private void OLrzqt(float f) {
        this.point.KWHzl(f);
    }

    private float copydefault() {
        return this.point.KWHzl();
    }

    private void KWHzl(float f) {
        this.point.AEQbTJ(f);
    }

    private float AEQbTJ() {
        return this.point.EZpvd();
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        return this.point.toString();
    }
}
