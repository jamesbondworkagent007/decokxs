package o;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yMb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56619yMb {
    public static final java.lang.Object copydefault(java.lang.Object obj, java.lang.Class<?> cls) {
        if (obj instanceof java.lang.Class) {
            return null;
        }
        if (obj instanceof InterfaceC56551yJo) {
            obj = yHE.OLrzqt((InterfaceC56551yJo) obj);
        } else if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr instanceof java.lang.Class[]) {
                return null;
            }
            if (objArr instanceof InterfaceC56551yJo[]) {
                Intrinsics.copydefault(obj, "");
                InterfaceC56551yJo[] interfaceC56551yJoArr = (InterfaceC56551yJo[]) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(interfaceC56551yJoArr.length);
                for (InterfaceC56551yJo interfaceC56551yJo : interfaceC56551yJoArr) {
                    arrayList.add(yHE.OLrzqt(interfaceC56551yJo));
                }
                obj = arrayList.toArray(new java.lang.Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    public static final java.lang.Void EZpvd(int i, java.lang.String str, java.lang.Class<?> cls) {
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ;
        java.lang.String strGEmmrt;
        if (Intrinsics.EZpvd(cls, java.lang.Class.class)) {
            interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(InterfaceC56551yJo.class);
        } else {
            interfaceC56551yJoAEQbTJ = (cls.isArray() && Intrinsics.EZpvd(cls.getComponentType(), java.lang.Class.class)) ? C56524yIo.AEQbTJ(InterfaceC56551yJo[].class) : yHE.KWHzl(cls);
        }
        if (Intrinsics.EZpvd((java.lang.Object) interfaceC56551yJoAEQbTJ.gEmmrt(), (java.lang.Object) C56524yIo.AEQbTJ(java.lang.Object[].class).gEmmrt())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(interfaceC56551yJoAEQbTJ.gEmmrt());
            sb.append('<');
            java.lang.Class<?> componentType = yHE.OLrzqt(interfaceC56551yJoAEQbTJ).getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "");
            sb.append(yHE.KWHzl(componentType).gEmmrt());
            sb.append('>');
            strGEmmrt = sb.toString();
        } else {
            strGEmmrt = interfaceC56551yJoAEQbTJ.gEmmrt();
        }
        throw new java.lang.IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + strGEmmrt);
    }

    public static /* synthetic */ java.lang.Object createAnnotationInstance$default(java.lang.Class cls, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            java.util.Set setKeySet = map.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(setKeySet, 10));
            java.util.Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((java.lang.String) it.next(), new java.lang.Class[0]));
            }
            list = arrayList;
        }
        return copydefault(cls, map, list);
    }

    public static final <T> boolean OLrzqt(java.lang.Class<T> cls, java.util.List<java.lang.reflect.Method> list, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.Object obj) throws java.lang.IllegalAccessException, InvocationTargetException {
        boolean zEZpvd;
        InterfaceC56551yJo interfaceC56551yJoOLrzqt;
        java.lang.Class clsOLrzqt = null;
        java.lang.annotation.Annotation annotation = obj instanceof java.lang.annotation.Annotation ? (java.lang.annotation.Annotation) obj : null;
        if (annotation != null && (interfaceC56551yJoOLrzqt = yHE.OLrzqt(annotation)) != null) {
            clsOLrzqt = yHE.OLrzqt(interfaceC56551yJoOLrzqt);
        }
        if (!Intrinsics.EZpvd(clsOLrzqt, cls)) {
            return false;
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            for (java.lang.reflect.Method method : list) {
                java.lang.Object obj2 = map.get(method.getName());
                java.lang.Object objInvoke = method.invoke(obj, new java.lang.Object[0]);
                if (obj2 instanceof boolean[]) {
                    Intrinsics.copydefault(objInvoke, "");
                    zEZpvd = java.util.Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    Intrinsics.copydefault(objInvoke, "");
                    zEZpvd = java.util.Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    Intrinsics.copydefault(objInvoke, "");
                    zEZpvd = java.util.Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    Intrinsics.copydefault(objInvoke, "");
                    zEZpvd = java.util.Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    Intrinsics.copydefault(objInvoke, "");
                    zEZpvd = java.util.Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    Intrinsics.copydefault(objInvoke, "");
                    zEZpvd = java.util.Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    Intrinsics.copydefault(objInvoke, "");
                    zEZpvd = java.util.Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    Intrinsics.copydefault(objInvoke, "");
                    zEZpvd = java.util.Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof java.lang.Object[]) {
                    Intrinsics.copydefault(objInvoke, "");
                    zEZpvd = java.util.Arrays.equals((java.lang.Object[]) obj2, (java.lang.Object[]) objInvoke);
                } else {
                    zEZpvd = Intrinsics.EZpvd(obj2, objInvoke);
                }
                if (!zEZpvd) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final int AEQbTJ(InterfaceC56387yDm<java.lang.Integer> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue().intValue();
    }

    public static final <T> T copydefault(@NotNull java.lang.Class<T> cls, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull java.util.List<java.lang.reflect.Method> list) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC56387yDm interfaceC56387yDmCopydefault = C56392yDr.copydefault(new C56621yMd(map));
        T t = (T) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new C56622yMe(cls, map, C56392yDr.copydefault(new C56620yMc(cls, map)), interfaceC56387yDmCopydefault, list));
        Intrinsics.copydefault(t, "");
        return t;
    }

    public static final int KWHzl(java.util.Map map) {
        int iHashCode;
        int iHashCode2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof boolean[]) {
                iHashCode = java.util.Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                iHashCode = java.util.Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                iHashCode = java.util.Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                iHashCode = java.util.Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                iHashCode = java.util.Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                iHashCode = java.util.Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                iHashCode = java.util.Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                iHashCode = java.util.Arrays.hashCode((double[]) value);
            } else {
                iHashCode = value instanceof java.lang.Object[] ? java.util.Arrays.hashCode((java.lang.Object[]) value) : value.hashCode();
            }
            iHashCode2 += iHashCode ^ (str.hashCode() * 127);
        }
        return iHashCode2;
    }

    public static final java.lang.String OLrzqt(InterfaceC56387yDm<java.lang.String> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    public static final java.lang.String copydefault(java.lang.Class cls, java.util.Map map) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('@');
        sb.append(cls.getCanonicalName());
        CollectionsKt___CollectionsKt.joinTo$default(map.entrySet(), sb, ", ", "(", ")", 0, null, C56623yMf.EZpvd, 48, null);
        return sb.toString();
    }

    public static final java.lang.CharSequence KWHzl(Map.Entry entry) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(entry, "");
        java.lang.String str = (java.lang.String) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = java.util.Arrays.toString((boolean[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (value instanceof char[]) {
            string = java.util.Arrays.toString((char[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (value instanceof byte[]) {
            string = java.util.Arrays.toString((byte[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (value instanceof short[]) {
            string = java.util.Arrays.toString((short[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (value instanceof int[]) {
            string = java.util.Arrays.toString((int[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (value instanceof float[]) {
            string = java.util.Arrays.toString((float[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (value instanceof long[]) {
            string = java.util.Arrays.toString((long[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (value instanceof double[]) {
            string = java.util.Arrays.toString((double[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else if (value instanceof java.lang.Object[]) {
            string = java.util.Arrays.toString((java.lang.Object[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    public static final java.lang.Object EZpvd(java.lang.Class cls, java.util.Map map, InterfaceC56387yDm interfaceC56387yDm, InterfaceC56387yDm interfaceC56387yDm2, java.util.List list, java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return java.lang.Integer.valueOf(AEQbTJ((InterfaceC56387yDm<java.lang.Integer>) interfaceC56387yDm2));
                }
            } else if (name.equals("toString")) {
                return OLrzqt(interfaceC56387yDm);
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) name, (java.lang.Object) "equals") && objArr != null && objArr.length == 1) {
            return java.lang.Boolean.valueOf(OLrzqt(cls, list, map, yDV.sSMYrx(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        sb.append(yDV.AwvSrB(objArr));
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }
}
