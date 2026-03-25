package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.internal.CollectionDescriptorsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yIc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56512yIc implements InterfaceC56551yJo<java.lang.Object>, InterfaceC56513yId {
    public static final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ;
    public static final java.util.HashMap<java.lang.String, java.lang.String> EZpvd;
    public static final java.util.Map<java.lang.Class<? extends InterfaceC56388yDn<?>>, java.lang.Integer> KWHzl;
    public static final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt;
    public static final Application copydefault = new Application(null);
    public static final java.util.Map<java.lang.String, java.lang.String> valueOf;
    public final java.lang.Class<?> AYXKKw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56513yId
    public java.lang.Class<?> OLrzqt() {
        return this.AYXKKw;
    }

    public C56512yIc(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.AYXKKw = cls;
    }

    @Override // o.InterfaceC56551yJo
    public java.lang.String valueOf() {
        return copydefault.AEQbTJ(OLrzqt());
    }

    @Override // o.InterfaceC56551yJo
    public java.lang.String gEmmrt() {
        return copydefault.KWHzl(OLrzqt());
    }

    @Override // o.InterfaceC56551yJo
    public java.util.Collection<InterfaceC56549yJm<?>> AYXKKw() {
        copydefault();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC56551yJo
    public java.util.Collection<InterfaceC56555yJs<java.lang.Object>> AhwBna() {
        copydefault();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC56544yJh
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        copydefault();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC56551yJo
    public java.lang.Object djBIcL() {
        copydefault();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC56551yJo
    public boolean copydefault(java.lang.Object obj) {
        return copydefault.OLrzqt(obj, OLrzqt());
    }

    @Override // o.InterfaceC56551yJo
    public java.util.List<InterfaceC56559yJw> isConnected() {
        copydefault();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC56551yJo
    public boolean fetchVPNInfo() {
        copydefault();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC56551yJo
    public boolean values() {
        copydefault();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC56551yJo
    public boolean AkhnZx() {
        copydefault();
        throw new KotlinNothingValueException();
    }

    @Override // o.InterfaceC56551yJo
    public boolean DbNXlk() {
        copydefault();
        throw new KotlinNothingValueException();
    }

    public final java.lang.Void copydefault() {
        throw new KotlinReflectionNotSupportedError();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C56512yIc) && Intrinsics.EZpvd(yHE.copydefault(this), yHE.copydefault((InterfaceC56551yJo) obj));
    }

    @Override // o.InterfaceC56551yJo
    public int hashCode() {
        return yHE.copydefault(this).hashCode();
    }

    public java.lang.String toString() {
        return OLrzqt() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: renamed from: o.yIc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yIc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String AEQbTJ(@NotNull java.lang.Class<?> cls) {
            java.lang.String strSubstringAfter$default;
            java.lang.String str;
            Intrinsics.checkNotNullParameter(cls, "");
            java.lang.String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (cls.isLocalClass()) {
                java.lang.String simpleName = cls.getSimpleName();
                java.lang.reflect.Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    Intrinsics.copydefault((java.lang.Object) simpleName);
                    strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(simpleName, enclosingMethod.getName() + '$', (java.lang.String) null, 2, (java.lang.Object) null);
                }
                java.lang.reflect.Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    Intrinsics.copydefault((java.lang.Object) simpleName);
                    return StringsKt__StringsKt.substringAfter$default(simpleName, '$', (java.lang.String) null, 2, (java.lang.Object) null);
                }
                Intrinsics.copydefault((java.lang.Object) simpleName);
                return StringsKt__StringsKt.substringAfter$default(simpleName, enclosingConstructor.getName() + '$', (java.lang.String) null, 2, (java.lang.Object) null);
            }
            if (cls.isArray()) {
                java.lang.Class<?> componentType = cls.getComponentType();
                strSubstringAfter$default = "Array";
                if (componentType.isPrimitive() && (str = (java.lang.String) C56512yIc.valueOf.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 != null) {
                    return str2;
                }
            } else {
                java.lang.String str3 = (java.lang.String) C56512yIc.valueOf.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            return strSubstringAfter$default;
        }

        public final java.lang.String KWHzl(@NotNull java.lang.Class<?> cls) {
            java.lang.String str;
            Intrinsics.checkNotNullParameter(cls, "");
            java.lang.String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                java.lang.Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (java.lang.String) C56512yIc.AEQbTJ.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? CollectionDescriptorsKt.ARRAY_NAME : str2;
            }
            java.lang.String str3 = (java.lang.String) C56512yIc.AEQbTJ.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }

        public final boolean OLrzqt(java.lang.Object obj, @NotNull java.lang.Class<?> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            java.util.Map map = C56512yIc.KWHzl;
            Intrinsics.copydefault(map, "");
            java.lang.Integer num = (java.lang.Integer) map.get(cls);
            if (num != null) {
                return C56532yIw.EZpvd(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = yHE.copydefault(yHE.KWHzl(cls));
            }
            return cls.isInstance(obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.util.List listGEmmrt = yDY.gEmmrt(Function0.class, Function1.class, Function2.class, yHO.class, yHT.class, yHS.class, yHQ.class, yHR.class, yHP.class, yHY.class, yHC.class, yHA.class, yHD.class, yHB.class, yHI.class, yHJ.class, yHF.class, yHG.class, yHH.class, yHL.class, yHM.class, yHN.class, yHK.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        int i = 0;
        for (java.lang.Object obj : listGEmmrt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(C56390yDp.OLrzqt((java.lang.Class) obj, java.lang.Integer.valueOf(i)));
            i++;
        }
        KWHzl = C56424yEw.copydefault(arrayList);
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        EZpvd = map;
        java.util.HashMap<java.lang.String, java.lang.String> map2 = new java.util.HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        OLrzqt = map2;
        java.util.HashMap<java.lang.String, java.lang.String> map3 = new java.util.HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        java.util.Collection<java.lang.String> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        for (java.lang.String str : collectionValues) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("kotlin.jvm.internal.");
            Intrinsics.copydefault((java.lang.Object) str);
            sb.append(StringsKt__StringsKt.substringAfterLast$default(str, '.', (java.lang.String) null, 2, (java.lang.Object) null));
            sb.append("CompanionObject");
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(sb.toString(), str + ".Companion");
            map3.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        for (Map.Entry<java.lang.Class<? extends InterfaceC56388yDn<?>>, java.lang.Integer> entry : KWHzl.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        AEQbTJ = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.String str2 = (java.lang.String) entry2.getValue();
            Intrinsics.copydefault((java.lang.Object) str2);
            linkedHashMap.put(key, StringsKt__StringsKt.substringAfterLast$default(str2, '.', (java.lang.String) null, 2, (java.lang.Object) null));
        }
        valueOf = linkedHashMap;
    }
}
