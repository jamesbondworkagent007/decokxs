package org.luaj.vm2.jse;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import o.C60039zuO;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.exception.InvokeError;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class JavaInstance<T> extends LuaUserdata {
    public static final String LUA_CLASS_NAME = "__JavaInstance";
    JavaClass jclass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaUserdata
    public final T getJavaUserdata() {
        return this.javaUserdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.LuaUserdata
    public String initLuaClassName(Globals globals) {
        return LUA_CLASS_NAME;
    }

    public JavaInstance(Globals globals, Object obj) {
        super(globals, obj);
    }

    @InterfaceC60044zuT
    public final LuaValue[] __index(String str, LuaValue[] luaValueArr) {
        if (this.jclass == null) {
            this.jclass = JavaClass.forClass(this.globals, this.javaUserdata.getClass());
        }
        Field field = this.jclass.getField(str);
        if (field != null) {
            try {
                return toLua(field.get(this.javaUserdata));
            } catch (Exception unused) {
            }
        }
        Method methodCopydefault = C60039zuO.copydefault(this.jclass.getMethod(str), luaValueArr);
        if (methodCopydefault != null) {
            try {
                return toLua(methodCopydefault.invoke(this.javaUserdata, C60039zuO.AEQbTJ(luaValueArr, methodCopydefault.getParameterTypes())));
            } catch (Exception unused2) {
            }
        }
        Class innerClass = this.jclass.getInnerClass(str);
        return innerClass != null ? LuaValue.varargsOf(JavaClass.forClass(this.globals, innerClass)) : LuaValue.rNil();
    }

    public final LuaValue[] toLua(Object obj) {
        if (obj == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(C60039zuO.copydefault(this.globals, obj));
    }

    @InterfaceC60044zuT
    public final void __newindex(String str, LuaValue luaValue) {
        if (this.jclass == null) {
            this.jclass = JavaClass.forClass(this.globals, this.javaUserdata.getClass());
        }
        Field field = this.jclass.getField(str);
        if (field != null) {
            try {
                field.set(this.javaUserdata, C60039zuO.copydefault(luaValue, field.getType()));
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new InvokeError("no field in " + this.javaUserdata.getClass().getName() + " named " + str);
    }

    @Override // org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public void __onLuaGc() {
        if (this.globals.isDestroyed()) {
            this.javaUserdata = null;
            this.jclass = null;
        }
        super.__onLuaGc();
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t = this.javaUserdata;
        if (t != null) {
            return t.equals(((JavaInstance) obj).javaUserdata);
        }
        return ((JavaInstance) obj).javaUserdata == null;
    }
}
