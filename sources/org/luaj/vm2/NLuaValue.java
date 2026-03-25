package org.luaj.vm2;

import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public abstract class NLuaValue extends LuaValue {
    volatile boolean calledDestroy;
    public Globals globals;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Globals getGlobals() {
        return this.globals;
    }

    public NLuaValue(Globals globals, long j) {
        this.calledDestroy = false;
        globals.getClass();
        this.globals = globals;
        this.nativeGlobalKey = j;
    }

    public NLuaValue(long j) {
        this.calledDestroy = false;
        this.nativeGlobalKey = j;
    }

    @InterfaceC60044zuT
    public NLuaValue(long j, long j2) {
        this(j2);
        Globals globalsEZpvd = Globals.EZpvd(j);
        this.globals = globalsEZpvd;
        if (globalsEZpvd != null) {
            return;
        }
        throw new NullPointerException("no Globals object for pointer " + Long.toHexString(j) + "\n" + Globals.copydefault());
    }

    @Override // org.luaj.vm2.LuaValue
    public void destroy() {
        synchronized (this) {
            if (this.calledDestroy) {
                return;
            }
            this.calledDestroy = true;
            if (notInGlobalTable() || this.destroyed || this.globals.isDestroyed()) {
                return;
            }
            this.destroyed = this.globals.AEQbTJ(this);
        }
    }

    public boolean checkStateByNative() {
        this.destroyed = !LuaCApi._hasNativeValue(this.globals.AYXKKw, this.nativeGlobalKey, type());
        return !this.destroyed;
    }

    @InterfaceC60044zuT
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NLuaValue nLuaValue = (NLuaValue) obj;
        if (notInGlobalTable()) {
            return super.equals(obj);
        }
        return this.nativeGlobalKey == nLuaValue.nativeGlobalKey;
    }

    public int hashCode() {
        if (notInGlobalTable()) {
            return super.hashCode();
        }
        long j = this.nativeGlobalKey;
        return (int) (j ^ (j >>> 32));
    }

    @Override // org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public String toString() {
        return LuaValue.LUA_TYPE_NAME[type()] + "#(" + Long.toHexString(this.nativeGlobalKey) + ")";
    }

    public void finalize() throws Throwable {
        if (this instanceof Globals) {
            return;
        }
        try {
            destroy();
        } finally {
            super.finalize();
        }
    }
}
