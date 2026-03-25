package org.luaj.vm2;

import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public class LuaNil extends LuaValue {
    public static volatile LuaNil copydefault;

    @Override // org.luaj.vm2.LuaValue
    public boolean toBoolean() {
        return false;
    }

    @Override // org.luaj.vm2.LuaValue
    public String toJavaString() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaValue
    public String toString() {
        return "nil";
    }

    @Override // org.luaj.vm2.LuaValue
    public int type() {
        return 0;
    }

    @InterfaceC60044zuT
    public static LuaNil NIL() {
        if (copydefault == null) {
            synchronized (LuaNil.class) {
                if (copydefault == null) {
                    copydefault = new LuaNil();
                }
            }
        }
        return copydefault;
    }

    private LuaNil() {
    }
}
