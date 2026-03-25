package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.ParameterizedType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.C56929yXo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56743yQr {
    public static final java.util.List<InterfaceC56551yJo<? extends java.lang.Object>> AEQbTJ;
    public static final java.util.Map<java.lang.Class<? extends InterfaceC56388yDn<?>>, java.lang.Integer> EZpvd;
    public static final java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> KWHzl;
    public static final java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> copydefault;

    public static final java.lang.ClassLoader copydefault(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        java.lang.ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "");
        return systemClassLoader;
    }

    public static final boolean AhwBna(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return java.lang.Enum.class.isAssignableFrom(cls);
    }

    static {
        java.util.List<InterfaceC56551yJo<? extends java.lang.Object>> listGEmmrt = yDY.gEmmrt(C56524yIo.AEQbTJ(java.lang.Boolean.TYPE), C56524yIo.AEQbTJ(java.lang.Byte.TYPE), C56524yIo.AEQbTJ(java.lang.Character.TYPE), C56524yIo.AEQbTJ(java.lang.Double.TYPE), C56524yIo.AEQbTJ(java.lang.Float.TYPE), C56524yIo.AEQbTJ(java.lang.Integer.TYPE), C56524yIo.AEQbTJ(java.lang.Long.TYPE), C56524yIo.AEQbTJ(java.lang.Short.TYPE));
        AEQbTJ = listGEmmrt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        java.util.Iterator<T> it = listGEmmrt.iterator();
        while (it.hasNext()) {
            InterfaceC56551yJo interfaceC56551yJo = (InterfaceC56551yJo) it.next();
            arrayList.add(C56390yDp.OLrzqt(yHE.copydefault(interfaceC56551yJo), yHE.AEQbTJ(interfaceC56551yJo)));
        }
        KWHzl = C56424yEw.copydefault(arrayList);
        java.util.List<InterfaceC56551yJo<? extends java.lang.Object>> list = AEQbTJ;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC56551yJo interfaceC56551yJo2 = (InterfaceC56551yJo) it2.next();
            arrayList2.add(C56390yDp.OLrzqt(yHE.AEQbTJ(interfaceC56551yJo2), yHE.copydefault(interfaceC56551yJo2)));
        }
        copydefault = C56424yEw.copydefault(arrayList2);
        java.util.List listGEmmrt2 = yDY.gEmmrt(Function0.class, Function1.class, Function2.class, yHO.class, yHT.class, yHS.class, yHQ.class, yHR.class, yHP.class, yHY.class, yHC.class, yHA.class, yHD.class, yHB.class, yHI.class, yHJ.class, yHF.class, yHG.class, yHH.class, yHL.class, yHM.class, yHN.class, yHK.class);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt2, 10));
        int i = 0;
        for (java.lang.Object obj : listGEmmrt2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList3.add(C56390yDp.OLrzqt((java.lang.Class) obj, java.lang.Integer.valueOf(i)));
            i++;
        }
        EZpvd = C56424yEw.copydefault(arrayList3);
    }

    public static final java.lang.Class<?> OLrzqt(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return KWHzl.get(cls);
    }

    public static final java.lang.Class<?> valueOf(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return copydefault.get(cls);
    }

    public static final java.lang.Integer EZpvd(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return EZpvd.get(cls);
    }

    public static final C56929yXo AEQbTJ(@NotNull java.lang.Class<?> cls) {
        C56929yXo c56929yXoAEQbTJ;
        Intrinsics.checkNotNullParameter(cls, "");
        if (cls.isPrimitive()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            java.lang.String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            if (simpleName.length() != 0) {
                java.lang.Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (c56929yXoAEQbTJ = AEQbTJ(declaringClass)) != null) {
                    C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(cls.getSimpleName());
                    Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
                    C56929yXo c56929yXoEZpvd = c56929yXoAEQbTJ.EZpvd(c56935yXuAEQbTJ);
                    if (c56929yXoEZpvd != null) {
                        return c56929yXoEZpvd;
                    }
                }
                C56929yXo.ActionBar actionBar = C56929yXo.AEQbTJ;
                java.lang.String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                return actionBar.KWHzl(new C56933yXs(name));
            }
        }
        java.lang.String name2 = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        C56933yXs c56933yXs = new C56933yXs(name2);
        return new C56929yXo(c56933yXs.EZpvd(), C56933yXs.OLrzqt.KWHzl(c56933yXs.OLrzqt()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.String KWHzl(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        if (cls.isPrimitive()) {
            java.lang.String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return ExifInterface.LATITUDE_SOUTH;
                    }
                    break;
            }
            throw new java.lang.IllegalArgumentException("Unsupported primitive type: " + cls);
        }
        if (cls.isArray()) {
            java.lang.String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "");
            return C59449zhJ.replace$default(name2, '.', JsonPointer.SEPARATOR, false, 4, (java.lang.Object) null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('L');
        java.lang.String name3 = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "");
        sb.append(C59449zhJ.replace$default(name3, '.', JsonPointer.SEPARATOR, false, 4, (java.lang.Object) null));
        sb.append(';');
        return sb.toString();
    }

    public static final java.util.List<java.lang.reflect.Type> OLrzqt(@NotNull java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        if (!(type instanceof ParameterizedType)) {
            return yDY.AhwBna();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C59467zhb.zuBGHE(C59467zhb.isConnected(C59405zgS.EZpvd(type, (Function1<? super java.lang.reflect.Type, ? extends java.lang.reflect.Type>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C56739yQn.copydefault)), C56742yQq.copydefault));
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
        return yDV.AwvSrB(actualTypeArguments);
    }

    public static final ParameterizedType EZpvd(ParameterizedType parameterizedType) {
        Intrinsics.checkNotNullParameter(parameterizedType, "");
        java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    public static final Sequence KWHzl(ParameterizedType parameterizedType) {
        Intrinsics.checkNotNullParameter(parameterizedType, "");
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
        return yDV.getNewProxyInstance(actualTypeArguments);
    }
}
