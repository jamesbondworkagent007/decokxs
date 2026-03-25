package org.luaj.vm2.jse;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;

/* JADX INFO: loaded from: classes24.dex */
public final class JavaClass extends JavaInstance<Class> {
    public static final String LUA_CLASS_NAME = "__JavaClass";
    private static final Map<Class, JavaClass> classes = new HashMap();
    private List<Constructor> constructors;
    private Map<String, Field> fields;
    private Map<String, Class> innerclasses;
    private Map<String, List<Method>> methods;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.jse.JavaInstance, org.luaj.vm2.LuaUserdata
    public String initLuaClassName(Globals globals) {
        return LUA_CLASS_NAME;
    }

    private JavaClass(Globals globals, Object obj) {
        super(globals, obj);
        this.jclass = this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.jse.JavaInstance, org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public void __onLuaGc() {
        if (this.globals.isDestroyed()) {
            Map<String, Field> map = this.fields;
            if (map != null) {
                map.clear();
            }
            Map<String, List<Method>> map2 = this.methods;
            if (map2 != null) {
                map2.clear();
            }
            List<Constructor> list = this.constructors;
            if (list != null) {
                list.clear();
            }
            Map<String, Class> map3 = this.innerclasses;
            if (map3 != null) {
                map3.clear();
            }
            classes.remove((Class) this.javaUserdata);
        }
        super.__onLuaGc();
    }

    public static JavaClass forClass(Globals globals, Class cls) {
        Map<Class, JavaClass> map = classes;
        JavaClass javaClass = map.get(cls);
        if (javaClass != null) {
            return javaClass;
        }
        JavaClass javaClass2 = new JavaClass(globals, cls);
        map.put(cls, javaClass2);
        return javaClass2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final Field getField(String str) {
        if (this.fields == null) {
            HashMap map = new HashMap();
            for (Field field : ((Class) this.javaUserdata).getFields()) {
                if (Modifier.isPublic(field.getModifiers())) {
                    map.put(field.getName(), field);
                    try {
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                    } catch (SecurityException unused) {
                    }
                }
            }
            this.fields = map;
        }
        return this.fields.get(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<Method> getMethod(String str) {
        if (this.methods == null) {
            HashMap map = new HashMap();
            for (Method method : ((Class) this.javaUserdata).getMethods()) {
                if (Modifier.isPublic(method.getModifiers())) {
                    String name = method.getName();
                    List arrayList = (List) map.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(name, arrayList);
                    }
                    arrayList.add(method);
                }
            }
            this.methods = map;
        }
        return this.methods.get(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final Class getInnerClass(String str) {
        if (this.innerclasses == null) {
            HashMap map = new HashMap();
            for (Class<?> cls : ((Class) this.javaUserdata).getClasses()) {
                String name = cls.getName();
                map.put(name.substring(Math.max(name.lastIndexOf(36), name.lastIndexOf(46)) + 1), cls);
            }
            this.innerclasses = map;
        }
        return this.innerclasses.get(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<Constructor> getConstructor() {
        if (this.constructors == null) {
            Constructor<?>[] constructors = ((Class) this.javaUserdata).getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            this.constructors = arrayList;
            arrayList.addAll(Arrays.asList(constructors));
        }
        return this.constructors;
    }
}
