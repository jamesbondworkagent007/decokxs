package org.luaj.vm2;

import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public final class LuaString extends LuaValue {

    @InterfaceC60044zuT
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaValue
    public String toJavaString() {
        return this.value;
    }

    @Override // org.luaj.vm2.LuaValue
    public int type() {
        return 4;
    }

    @InterfaceC60044zuT
    private LuaString(String str) {
        this.value = str;
    }

    public static LuaValue copydefault(String str) {
        if (str == null) {
            return LuaValue.Nil();
        }
        return new LuaString(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LuaString.class != obj.getClass()) {
            return false;
        }
        return this.value.equals(((LuaString) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode() + 31;
    }

    @Override // org.luaj.vm2.LuaValue
    public String toString() {
        return LuaValue.LUA_TYPE_NAME[type()] + "@" + this.value;
    }
}
