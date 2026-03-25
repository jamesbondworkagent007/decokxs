package org.luaj.vm2;

import java.util.HashMap;
import java.util.Map;
import o.C60093zva;
import o.InterfaceC60044zuT;
import o.InterfaceComponentCallbacks2C43266rlz;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public class LuaUserdata<T> extends NLuaValue {
    public static Map<Class, InterfaceComponentCallbacks2C43266rlz> moduleMap = new HashMap();

    @InterfaceC60044zuT
    public long id;
    private long javaRefCount;
    public T javaUserdata;

    @InterfaceC60044zuT
    private String luaclassName;
    protected long memoryCastCache;
    private long refCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @InterfaceC60044zuT
    private void addRef() {
        this.refCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void freeJavaUserData() {
        this.javaUserdata = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.NLuaValue
    public /* bridge */ /* synthetic */ Globals getGlobals() {
        return super.getGlobals();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T getJavaUserdata() {
        return this.javaUserdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onJavaRef() {
        this.javaRefCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void releaseLuaRef() {
        this.refCount = 0L;
    }

    @Override // org.luaj.vm2.LuaValue
    public final LuaUserdata toUserdata() {
        return this;
    }

    @Override // org.luaj.vm2.LuaValue
    public final int type() {
        return 7;
    }

    @Override // org.luaj.vm2.NLuaValue
    @InterfaceC60044zuT
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public LuaUserdata(Globals globals, T t) {
        super(globals, globals.fJNWhG());
        this.memoryCastCache = 0L;
        this.luaclassName = initLuaClassName(globals);
        this.javaUserdata = t;
        globals.zuBGHE.EZpvd(this);
        this.refCount = 0L;
        initModule();
    }

    @InterfaceC60044zuT
    public LuaUserdata(long j, LuaValue[] luaValueArr) {
        super(j, 0L);
        this.memoryCastCache = 0L;
        this.globals.zuBGHE.EZpvd(this);
        this.refCount = 1L;
        initModule();
    }

    public final void initModule() {
        InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz = moduleMap.get(getClass());
        if (interfaceComponentCallbacks2C43266rlz != null) {
            interfaceComponentCallbacks2C43266rlz.doOnCreate();
        }
    }

    public void onJavaRecycle() {
        this.javaRefCount--;
        if (this.refCount > 0 || this.globals.isDestroyed() || this.javaRefCount > 0) {
            return;
        }
        this.globals.zuBGHE.EZpvd(this, false);
    }

    public String initLuaClassName(Globals globals) {
        return globals.EZpvd(getClass());
    }

    @InterfaceC60044zuT
    public void __onLuaGc() {
        this.refCount--;
        if (this.javaRefCount > 0 || this.globals.isDestroyed() || this.refCount > 0) {
            return;
        }
        this.globals.zuBGHE.EZpvd(this, false);
    }

    @InterfaceC60044zuT
    public boolean __onLuaEq(Object obj) {
        return equals(obj);
    }

    @InterfaceC60044zuT
    private LuaUserdata(long j, long j2) {
        super(j, j2);
        this.memoryCastCache = 0L;
    }

    @InterfaceC60044zuT
    public long memoryCast() {
        if (this.memoryCastCache == 0) {
            T t = this.javaUserdata;
            if (t != null) {
                this.memoryCastCache = C60093zva.EZpvd(t.getClass());
            }
            if (this.memoryCastCache == 0) {
                this.memoryCastCache = 8L;
            }
        }
        return this.memoryCastCache;
    }

    @Override // org.luaj.vm2.NLuaValue
    public int hashCode() {
        T t = this.javaUserdata;
        if (t != null) {
            return t.hashCode();
        }
        return super.hashCode();
    }

    @Override // org.luaj.vm2.NLuaValue
    public void finalize() throws Throwable {
        this.javaRefCount = 0L;
        this.refCount = 0L;
        Globals globals = this.globals;
        if (globals != null) {
            globals.zuBGHE.EZpvd(this, true);
        }
        super.finalize();
    }

    @Override // org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public void destroy() {
        if (this instanceof JavaUserdata) {
            super.destroy();
        }
    }
}
