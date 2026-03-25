package org.luaj.vm2;

import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public final class LuaBoolean extends LuaValue {
    public static volatile LuaBoolean KWHzl;
    public static volatile LuaBoolean OLrzqt;

    @InterfaceC60044zuT
    private final boolean value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaValue
    public boolean toBoolean() {
        return this.value;
    }

    @Override // org.luaj.vm2.LuaValue
    public int type() {
        return 1;
    }

    @InterfaceC60044zuT
    public static LuaBoolean TRUE() {
        if (KWHzl == null) {
            synchronized (LuaBoolean.class) {
                if (KWHzl == null) {
                    KWHzl = new LuaBoolean(true);
                }
            }
        }
        return KWHzl;
    }

    @InterfaceC60044zuT
    public static LuaBoolean FALSE() {
        if (OLrzqt == null) {
            synchronized (LuaBoolean.class) {
                if (OLrzqt == null) {
                    OLrzqt = new LuaBoolean(false);
                }
            }
        }
        return OLrzqt;
    }

    public LuaBoolean(boolean z) {
        this.value = z;
    }

    @Override // org.luaj.vm2.LuaValue
    public String toJavaString() {
        return String.valueOf(this.value);
    }

    @Override // org.luaj.vm2.LuaValue
    public String toString() {
        return LuaValue.LUA_TYPE_NAME[type()] + "@" + this.value;
    }

    public static LuaValue AEQbTJ(boolean z) {
        return new LuaBoolean(z);
    }
}
