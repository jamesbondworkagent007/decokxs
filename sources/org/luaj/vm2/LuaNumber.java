package org.luaj.vm2;

import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public final class LuaNumber extends LuaValue {
    public static final LuaNumber[] AEQbTJ = new LuaNumber[256];
    public final boolean OLrzqt = false;

    @InterfaceC60044zuT
    private final double value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaValue
    public boolean isInt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaValue
    public double toDouble() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaValue
    public int toInt() {
        return (int) this.value;
    }

    @Override // org.luaj.vm2.LuaValue
    public int type() {
        return 3;
    }

    static {
        for (int i = 0; i < 256; i++) {
            AEQbTJ[i] = new LuaNumber(i - 128);
        }
    }

    public LuaNumber(int i) {
        this.value = i;
    }

    @InterfaceC60044zuT
    private LuaNumber(double d) {
        this.value = d;
    }

    @InterfaceC60044zuT
    public static LuaNumber valueOf(int i) {
        if (i >= -128 && i < 128) {
            return AEQbTJ[i + 128];
        }
        return new LuaNumber(i);
    }

    public static LuaNumber copydefault(double d) {
        int i = (int) d;
        if (d == i) {
            return valueOf(i);
        }
        return new LuaNumber(d);
    }

    @Override // org.luaj.vm2.LuaValue
    public String toJavaString() {
        double d = this.value;
        int i = (int) d;
        if (d == i) {
            return Integer.toString(i);
        }
        return String.valueOf(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && LuaNumber.class == obj.getClass() && Double.compare(((LuaNumber) obj).value, this.value) == 0;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.value);
        return ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
    }

    @Override // org.luaj.vm2.LuaValue
    public String toString() {
        return LuaValue.LUA_TYPE_NAME[type()] + "@" + this.value;
    }
}
