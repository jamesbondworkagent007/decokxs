package o;

import androidx.camera.video.AudioStats;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: o.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5619Yr {
    public static final java.lang.Class<?> OLrzqt = java.lang.Object.class;
    public static final java.lang.annotation.Annotation[] EZpvd = new java.lang.annotation.Annotation[0];
    public static final StateListAnimator[] AEQbTJ = new StateListAnimator[0];
    public static final java.util.Iterator<?> copydefault = Collections.emptyIterator();

    public static <T> T KWHzl(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String KWHzl(java.lang.String str) {
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <T> java.util.Iterator<T> KWHzl() {
        return (java.util.Iterator<T>) copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean fetchVPNInfo(java.lang.Class<?> cls) {
        return cls == java.lang.Void.class || cls == java.lang.Void.TYPE || cls == VR.class;
    }

    public static java.util.List<java.lang.Class<?>> OLrzqt(java.lang.Class<?> cls, java.lang.Class<?> cls2, boolean z) {
        if (cls == null || cls == cls2 || cls == java.lang.Object.class) {
            return Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(8);
        KWHzl(cls, cls2, arrayList, z);
        return arrayList;
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ(java.lang.Class<?> cls, java.lang.Class<?> cls2, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static void KWHzl(java.lang.Class<?> cls, java.lang.Class<?> cls2, java.util.Collection<java.lang.Class<?>> collection, boolean z) {
        if (cls == cls2 || cls == null || cls == java.lang.Object.class) {
            return;
        }
        if (z) {
            if (collection.contains(cls)) {
                return;
            } else {
                collection.add(cls);
            }
        }
        for (java.lang.Class<?> cls3 : EZpvd(cls)) {
            KWHzl(cls3, cls2, collection, true);
        }
        KWHzl(cls.getSuperclass(), cls2, collection, true);
    }

    public static java.lang.String AEQbTJ(java.lang.Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (java.lang.Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return TreeJsonEncoderKt.PRIMITIVE_TAG;
        }
        return null;
    }

    public static java.lang.String KWHzl(java.lang.Class<?> cls, boolean z) {
        try {
            boolean zIsStatic = Modifier.isStatic(cls.getModifiers());
            if (!zIsStatic && DbNXlk(cls)) {
                return "local/anonymous";
            }
            if (z || zIsStatic) {
                return null;
            }
            if (gEmmrt(cls) != null) {
                return "non-static member class";
            }
            return null;
        } catch (java.lang.NullPointerException | java.lang.SecurityException unused) {
            return null;
        }
    }

    public static java.lang.Class<?> isConnected(java.lang.Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (DbNXlk(cls)) {
                    return null;
                }
                return gEmmrt(cls);
            } catch (java.lang.SecurityException unused) {
            }
        }
        return null;
    }

    public static boolean AuCTel(java.lang.Class<?> cls) {
        java.lang.String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static boolean values(java.lang.Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean iwGUEr(java.lang.Class<?> cls) {
        java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
        return superclass != null && "java.lang.Record".equals(superclass.getName());
    }

    public static boolean fJNWhG(java.lang.Class<?> cls) {
        return cls == OLrzqt || cls.isPrimitive();
    }

    public static boolean AEQbTJ(java.lang.Object obj, java.lang.Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static void AEQbTJ(java.lang.Class<?> cls, java.lang.Object obj, java.lang.String str) {
        if (obj.getClass() != cls) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
        }
    }

    public static java.lang.Throwable copydefault(java.lang.Throwable th) {
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
        return th;
    }

    public static java.lang.Throwable AhwBna(java.lang.Throwable th) {
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        return th;
    }

    public static java.lang.Throwable KWHzl(java.lang.Throwable th) throws java.io.IOException {
        if (th instanceof java.io.IOException) {
            throw ((java.io.IOException) th);
        }
        return th;
    }

    public static java.lang.Throwable OLrzqt(java.lang.Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static java.lang.Throwable gEmmrt(java.lang.Throwable th) throws java.io.IOException {
        return KWHzl(OLrzqt(th));
    }

    public static void AEQbTJ(java.lang.Throwable th) {
        copydefault(th, th.getMessage());
    }

    public static void copydefault(java.lang.Throwable th, java.lang.String str) {
        AhwBna(th);
        copydefault(th);
        throw new java.lang.IllegalArgumentException(str, th);
    }

    public static <T> T copydefault(DeserializationContext deserializationContext, java.io.IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        throw JsonMappingException.from(deserializationContext, iOException.getMessage()).withCause(iOException);
    }

    public static void AYXKKw(java.lang.Throwable th) {
        AEQbTJ(OLrzqt(th));
    }

    public static void AEQbTJ(java.lang.Throwable th, java.lang.String str) {
        copydefault(OLrzqt(th), str);
    }

    public static void copydefault(JsonGenerator jsonGenerator, java.lang.Exception exc) throws java.io.IOException {
        jsonGenerator.KWHzl(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (java.lang.Exception e) {
            exc.addSuppressed(e);
        }
        KWHzl((java.lang.Throwable) exc);
        AhwBna(exc);
        throw new java.lang.RuntimeException(exc);
    }

    public static void OLrzqt(JsonGenerator jsonGenerator, java.io.Closeable closeable, java.lang.Exception exc) throws java.io.IOException {
        if (jsonGenerator != null) {
            jsonGenerator.KWHzl(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (java.lang.Exception e) {
                exc.addSuppressed(e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        KWHzl((java.lang.Throwable) exc);
        AhwBna(exc);
        throw new java.lang.RuntimeException(exc);
    }

    public static <T> T EZpvd(java.lang.Class<T> cls, boolean z) throws java.lang.IllegalArgumentException {
        java.lang.reflect.Constructor constructorOLrzqt = OLrzqt(cls, z);
        if (constructorOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
        try {
            return (T) constructorOLrzqt.newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            AEQbTJ(e, "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    public static <T> java.lang.reflect.Constructor<T> OLrzqt(java.lang.Class<T> cls, boolean z) throws java.lang.IllegalArgumentException {
        try {
            java.lang.reflect.Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            if (z) {
                EZpvd(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new java.lang.IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        } catch (java.lang.Exception e) {
            AEQbTJ(e, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    public static java.lang.Class<?> OLrzqt(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static java.lang.Class<?> EZpvd(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public static java.lang.String EZpvd(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static java.lang.String KWHzl(java.lang.Object obj, java.lang.String str) {
        return obj == null ? str : java.lang.String.format("\"%s\"", obj);
    }

    public static java.lang.String KWHzl(java.lang.Object obj) {
        if (obj == null) {
            return "unknown";
        }
        return uzCIH(obj instanceof java.lang.Class ? (java.lang.Class) obj : obj.getClass());
    }

    public static java.lang.String copydefault(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(80);
        sb.append('`');
        sb.append(javaType.toCanonical());
        sb.append('`');
        return sb.toString();
    }

    public static java.lang.String copydefault(java.lang.Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return uzCIH(obj instanceof java.lang.Class ? (java.lang.Class) obj : obj.getClass());
    }

    public static java.lang.String uzCIH(java.lang.Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        java.lang.String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(simpleName);
            do {
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        return EZpvd(simpleName);
    }

    public static java.lang.String KWHzl(InterfaceC5623Yw interfaceC5623Yw) {
        return interfaceC5623Yw == null ? "[null]" : OLrzqt(interfaceC5623Yw.getName());
    }

    public static java.lang.String copydefault(java.lang.String str) {
        return str == null ? "[null]" : OLrzqt(str);
    }

    public static java.lang.String copydefault(PropertyName propertyName) {
        return propertyName == null ? "[null]" : OLrzqt(propertyName.getSimpleName());
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        if (str == null) {
            return "[null]";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    public static java.lang.String OLrzqt(java.lang.String str) {
        if (str == null) {
            return "[null]";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    public static java.lang.String EZpvd(java.lang.Throwable th) {
        if (th instanceof JacksonException) {
            return ((JacksonException) th).getOriginalMessage();
        }
        if ((th instanceof InvocationTargetException) && th.getCause() != null) {
            return th.getCause().getMessage();
        }
        return th.getMessage();
    }

    public static java.lang.Object copydefault(java.lang.Class<?> cls) {
        if (cls == java.lang.Integer.TYPE) {
            return 0;
        }
        if (cls == java.lang.Long.TYPE) {
            return 0L;
        }
        if (cls == java.lang.Boolean.TYPE) {
            return java.lang.Boolean.FALSE;
        }
        if (cls == java.lang.Double.TYPE) {
            return java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        if (cls == java.lang.Float.TYPE) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (cls == java.lang.Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == java.lang.Short.TYPE) {
            return (short) 0;
        }
        if (cls == java.lang.Character.TYPE) {
            return (char) 0;
        }
        throw new java.lang.IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static java.lang.Class<?> getFieldNames(java.lang.Class<?> cls) {
        if (cls == java.lang.Integer.TYPE) {
            return java.lang.Integer.class;
        }
        if (cls == java.lang.Long.TYPE) {
            return java.lang.Long.class;
        }
        if (cls == java.lang.Boolean.TYPE) {
            return java.lang.Boolean.class;
        }
        if (cls == java.lang.Double.TYPE) {
            return java.lang.Double.class;
        }
        if (cls == java.lang.Float.TYPE) {
            return java.lang.Float.class;
        }
        if (cls == java.lang.Byte.TYPE) {
            return java.lang.Byte.class;
        }
        if (cls == java.lang.Short.TYPE) {
            return java.lang.Short.class;
        }
        if (cls == java.lang.Character.TYPE) {
            return java.lang.Character.class;
        }
        throw new java.lang.IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static java.lang.Class<?> hDKMBd(java.lang.Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == java.lang.Integer.class) {
            return java.lang.Integer.TYPE;
        }
        if (cls == java.lang.Long.class) {
            return java.lang.Long.TYPE;
        }
        if (cls == java.lang.Boolean.class) {
            return java.lang.Boolean.TYPE;
        }
        if (cls == java.lang.Double.class) {
            return java.lang.Double.TYPE;
        }
        if (cls == java.lang.Float.class) {
            return java.lang.Float.TYPE;
        }
        if (cls == java.lang.Byte.class) {
            return java.lang.Byte.TYPE;
        }
        if (cls == java.lang.Short.class) {
            return java.lang.Short.TYPE;
        }
        if (cls == java.lang.Character.class) {
            return java.lang.Character.TYPE;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.reflect.Member */
    /* JADX WARN: Multi-variable type inference failed */
    public static void EZpvd(java.lang.reflect.Member member, boolean z) {
        java.lang.reflect.AccessibleObject accessibleObject = (java.lang.reflect.AccessibleObject) member;
        try {
            java.lang.Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z || fARcdN(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (java.lang.SecurityException e) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new java.lang.IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e.getMessage());
        } catch (java.lang.RuntimeException e2) {
            if ("InaccessibleObjectException".equals(e2.getClass().getSimpleName())) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Failed to call `setAccess()` on %s '%s' (of class %s) due to `%s`, problem: %s", member.getClass().getSimpleName(), member.getName(), uzCIH(member.getDeclaringClass()), e2.getClass().getName(), e2.getMessage()), e2);
            }
            throw e2;
        }
    }

    public static boolean AkhnZx(java.lang.Class<?> cls) {
        return java.lang.Enum.class.isAssignableFrom(cls);
    }

    public static java.lang.Class<? extends java.lang.Enum<?>> EZpvd(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return OLrzqt((java.lang.Enum<?>) enumSet.iterator().next());
        }
        return Application.AEQbTJ.AEQbTJ(enumSet);
    }

    public static java.lang.Class<? extends java.lang.Enum<?>> KWHzl(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return OLrzqt((java.lang.Enum<?>) enumMap.keySet().iterator().next());
        }
        return Application.AEQbTJ.copydefault(enumMap);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.lang.Class<E extends java.lang.Enum<E>>, java.lang.Class<? extends java.lang.Enum<?>> */
    public static java.lang.Class<? extends java.lang.Enum<?>> OLrzqt(java.lang.Enum<?> r0) {
        return r0.getDeclaringClass();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Class<? extends java.lang.Enum<?>> KWHzl(java.lang.Class<?> cls) {
        return cls.getSuperclass() != java.lang.Enum.class ? cls.getSuperclass() : cls;
    }

    public static <T extends java.lang.annotation.Annotation> java.lang.Enum<?> EZpvd(java.lang.Class<java.lang.Enum<?>> cls, java.lang.Class<T> cls2) {
        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                java.lang.String name = field.getName();
                for (java.lang.Enum<?> r8 : cls.getEnumConstants()) {
                    if (name.equals(r8.name())) {
                        return r8;
                    }
                }
            }
        }
        return null;
    }

    public static boolean AEQbTJ(java.lang.Object obj) {
        return obj == null || ejfBZ(obj.getClass());
    }

    public static boolean ejfBZ(java.lang.Class<?> cls) {
        return cls.getAnnotation(VK.class) != null;
    }

    public static boolean fARcdN(java.lang.Class<?> cls) {
        java.lang.String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean fIwbmz(java.lang.Class<?> cls) {
        return (Modifier.isStatic(cls.getModifiers()) || gEmmrt(cls) == null) ? false : true;
    }

    public static boolean DbNXlk(java.lang.Class<?> cls) {
        return (fJNWhG(cls) || cls.getEnclosingMethod() == null) ? false : true;
    }

    public static java.lang.annotation.Annotation[] OLrzqt(java.lang.Class<?> cls) {
        return fJNWhG(cls) ? EZpvd : cls.getDeclaredAnnotations();
    }

    public static java.lang.reflect.Method[] djBIcL(java.lang.Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (java.lang.NoClassDefFoundError e) {
            java.lang.ClassLoader contextClassLoader = java.lang.Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                return EZpvd(cls, e);
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (java.lang.Throwable th) {
                    return EZpvd(cls, th);
                }
            } catch (java.lang.ClassNotFoundException e2) {
                e.addSuppressed(e2);
                return EZpvd(cls, e);
            }
        } catch (java.lang.Throwable th2) {
            return EZpvd(cls, th2);
        }
    }

    public static java.lang.reflect.Method[] EZpvd(java.lang.Class<?> cls, java.lang.Throwable th) throws java.lang.IllegalArgumentException {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), th.getClass().getName(), th.getMessage()), th);
    }

    public static StateListAnimator[] AhwBna(java.lang.Class<?> cls) {
        if (cls.isInterface() || fJNWhG(cls)) {
            return AEQbTJ;
        }
        java.lang.reflect.Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        StateListAnimator[] stateListAnimatorArr = new StateListAnimator[length];
        for (int i = 0; i < length; i++) {
            stateListAnimatorArr[i] = new StateListAnimator(declaredConstructors[i]);
        }
        return stateListAnimatorArr;
    }

    public static java.lang.reflect.Type valueOf(java.lang.Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static java.lang.reflect.Type[] AYXKKw(java.lang.Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static java.lang.Class<?> gEmmrt(java.lang.Class<?> cls) {
        if (fJNWhG(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static java.lang.Class<?>[] EZpvd(java.lang.Class<?> cls) {
        return cls.getInterfaces();
    }

    /* JADX INFO: renamed from: o.Yr$Application */
    public static class Application {
        public static final Application AEQbTJ = new Application();
        public final java.lang.String EZpvd;
        public final java.lang.reflect.Field KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.reflect.Field copydefault;

        private Application() throws java.lang.Exception {
            java.lang.String string;
            java.lang.reflect.Field fieldAEQbTJ;
            java.lang.String string2;
            java.lang.reflect.Field fieldAEQbTJ2 = null;
            try {
                fieldAEQbTJ = AEQbTJ(EnumSet.class, "elementType", java.lang.Class.class);
                string = null;
            } catch (java.lang.Exception e) {
                string = e.toString();
                fieldAEQbTJ = null;
            }
            this.copydefault = fieldAEQbTJ;
            this.OLrzqt = string;
            try {
                string2 = null;
                fieldAEQbTJ2 = AEQbTJ(EnumMap.class, "keyType", java.lang.Class.class);
            } catch (java.lang.Exception e2) {
                string2 = e2.toString();
            }
            this.KWHzl = fieldAEQbTJ2;
            this.EZpvd = string2;
        }

        public java.lang.Class<? extends java.lang.Enum<?>> AEQbTJ(EnumSet<?> enumSet) {
            java.lang.reflect.Field field = this.copydefault;
            if (field != null) {
                return (java.lang.Class) copydefault(enumSet, field);
            }
            throw new java.lang.IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + this.OLrzqt);
        }

        public java.lang.Class<? extends java.lang.Enum<?>> copydefault(EnumMap<?, ?> enumMap) {
            java.lang.reflect.Field field = this.KWHzl;
            if (field != null) {
                return (java.lang.Class) copydefault(enumMap, field);
            }
            throw new java.lang.IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + this.EZpvd);
        }

        public final java.lang.Object copydefault(java.lang.Object obj, java.lang.reflect.Field field) {
            try {
                return field.get(obj);
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }

        public static java.lang.reflect.Field AEQbTJ(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?> cls2) throws java.lang.Exception {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            throw new java.lang.IllegalStateException(java.lang.String.format("No field named '%s' in class '%s'", str, cls.getName()));
        }
    }

    /* JADX INFO: renamed from: o.Yr$StateListAnimator */
    public static final class StateListAnimator {
        public transient java.lang.annotation.Annotation[][] AEQbTJ;
        public final java.lang.reflect.Constructor<?> KWHzl;
        public transient java.lang.annotation.Annotation[] OLrzqt;
        public int copydefault = -1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.reflect.Constructor<?> AEQbTJ() {
            return this.KWHzl;
        }

        public StateListAnimator(java.lang.reflect.Constructor<?> constructor) {
            this.KWHzl = constructor;
        }

        public int OLrzqt() {
            int i = this.copydefault;
            if (i >= 0) {
                return i;
            }
            int parameterCount = this.KWHzl.getParameterCount();
            this.copydefault = parameterCount;
            return parameterCount;
        }

        public java.lang.Class<?> copydefault() {
            return this.KWHzl.getDeclaringClass();
        }

        public java.lang.annotation.Annotation[] KWHzl() {
            java.lang.annotation.Annotation[] annotationArr = this.OLrzqt;
            if (annotationArr != null) {
                return annotationArr;
            }
            java.lang.annotation.Annotation[] declaredAnnotations = this.KWHzl.getDeclaredAnnotations();
            this.OLrzqt = declaredAnnotations;
            return declaredAnnotations;
        }

        public java.lang.annotation.Annotation[][] EZpvd() {
            java.lang.annotation.Annotation[][] annotationArr = this.AEQbTJ;
            if (annotationArr != null) {
                return annotationArr;
            }
            java.lang.annotation.Annotation[][] parameterAnnotations = this.KWHzl.getParameterAnnotations();
            this.AEQbTJ = parameterAnnotations;
            return parameterAnnotations;
        }
    }
}
