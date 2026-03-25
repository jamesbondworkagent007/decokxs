package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yHE {
    public static final <T> java.lang.Class<T> OLrzqt(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.lang.Class<T> cls = (java.lang.Class<T>) ((InterfaceC56513yId) interfaceC56551yJo).OLrzqt();
        Intrinsics.copydefault(cls, "");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <T> java.lang.Class<T> AEQbTJ(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.lang.Class<T> cls = (java.lang.Class<T>) ((InterfaceC56513yId) interfaceC56551yJo).OLrzqt();
        if (cls.isPrimitive()) {
            Intrinsics.copydefault(cls, "");
            return cls;
        }
        java.lang.String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return java.lang.Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return java.lang.Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return java.lang.Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return java.lang.Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return java.lang.Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return java.lang.Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return java.lang.Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return java.lang.Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return java.lang.Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <T> java.lang.Class<T> copydefault(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.lang.Class<T> cls = (java.lang.Class<T>) ((InterfaceC56513yId) interfaceC56551yJo).OLrzqt();
        if (!cls.isPrimitive()) {
            Intrinsics.copydefault(cls, "");
            return cls;
        }
        java.lang.String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (java.lang.Class<T>) java.lang.Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (java.lang.Class<T>) java.lang.Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (java.lang.Class<T>) java.lang.Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (java.lang.Class<T>) java.lang.Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (java.lang.Class<T>) java.lang.Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (java.lang.Class<T>) java.lang.Void.class;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    cls = (java.lang.Class<T>) java.lang.Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    cls = (java.lang.Class<T>) java.lang.Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (java.lang.Class<T>) java.lang.Short.class;
                }
                break;
        }
        Intrinsics.copydefault(cls, "");
        return cls;
    }

    public static final <T> InterfaceC56551yJo<T> KWHzl(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return C56524yIo.AEQbTJ(cls);
    }

    public static final <T extends java.lang.annotation.Annotation> InterfaceC56551yJo<? extends T> OLrzqt(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        java.lang.Class<? extends java.lang.annotation.Annotation> clsAnnotationType = t.annotationType();
        Intrinsics.checkNotNullExpressionValue(clsAnnotationType, "");
        InterfaceC56551yJo<? extends T> interfaceC56551yJoKWHzl = KWHzl(clsAnnotationType);
        Intrinsics.copydefault(interfaceC56551yJoKWHzl, "");
        return interfaceC56551yJoKWHzl;
    }
}
