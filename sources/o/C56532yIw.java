package o;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.yIG;

/* JADX INFO: renamed from: o.yIw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56532yIw {
    public static <T extends java.lang.Throwable> T KWHzl(T t) {
        return (T) Intrinsics.AEQbTJ((java.lang.Throwable) t, C56532yIw.class.getName());
    }

    public static void EZpvd(java.lang.Object obj, java.lang.String str) {
        copydefault((obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void copydefault(java.lang.String str) {
        throw AEQbTJ(new java.lang.ClassCastException(str));
    }

    public static java.lang.ClassCastException AEQbTJ(java.lang.ClassCastException classCastException) {
        throw ((java.lang.ClassCastException) KWHzl(classCastException));
    }

    public static java.lang.Iterable copydefault(java.lang.Object obj) {
        if ((obj instanceof InterfaceC56535yIz) && !(obj instanceof yIA)) {
            EZpvd(obj, "kotlin.collections.MutableIterable");
        }
        return AhwBna(obj);
    }

    public static java.lang.Iterable AhwBna(java.lang.Object obj) {
        try {
            return (java.lang.Iterable) obj;
        } catch (java.lang.ClassCastException e) {
            throw AEQbTJ(e);
        }
    }

    public static java.util.Collection EZpvd(java.lang.Object obj) {
        if ((obj instanceof InterfaceC56535yIz) && !(obj instanceof yIC)) {
            EZpvd(obj, "kotlin.collections.MutableCollection");
        }
        return gEmmrt(obj);
    }

    public static java.util.Collection gEmmrt(java.lang.Object obj) {
        try {
            return (java.util.Collection) obj;
        } catch (java.lang.ClassCastException e) {
            throw AEQbTJ(e);
        }
    }

    public static boolean DbNXlk(java.lang.Object obj) {
        return (obj instanceof java.util.List) && (!(obj instanceof InterfaceC56535yIz) || (obj instanceof yIE));
    }

    public static java.util.List OLrzqt(java.lang.Object obj) {
        if ((obj instanceof InterfaceC56535yIz) && !(obj instanceof yIE)) {
            EZpvd(obj, "kotlin.collections.MutableList");
        }
        return djBIcL(obj);
    }

    public static java.util.List djBIcL(java.lang.Object obj) {
        try {
            return (java.util.List) obj;
        } catch (java.lang.ClassCastException e) {
            throw AEQbTJ(e);
        }
    }

    public static boolean fARcdN(java.lang.Object obj) {
        return (obj instanceof java.util.Set) && (!(obj instanceof InterfaceC56535yIz) || (obj instanceof yIF));
    }

    public static java.util.Set valueOf(java.lang.Object obj) {
        if ((obj instanceof InterfaceC56535yIz) && !(obj instanceof yIF)) {
            EZpvd(obj, "kotlin.collections.MutableSet");
        }
        return AkhnZx(obj);
    }

    public static java.util.Set AkhnZx(java.lang.Object obj) {
        try {
            return (java.util.Set) obj;
        } catch (java.lang.ClassCastException e) {
            throw AEQbTJ(e);
        }
    }

    public static boolean isConnected(java.lang.Object obj) {
        return (obj instanceof java.util.Map) && (!(obj instanceof InterfaceC56535yIz) || (obj instanceof yIG));
    }

    public static java.util.Map AEQbTJ(java.lang.Object obj) {
        if ((obj instanceof InterfaceC56535yIz) && !(obj instanceof yIG)) {
            EZpvd(obj, "kotlin.collections.MutableMap");
        }
        return AYXKKw(obj);
    }

    public static java.util.Map AYXKKw(java.lang.Object obj) {
        try {
            return (java.util.Map) obj;
        } catch (java.lang.ClassCastException e) {
            throw AEQbTJ(e);
        }
    }

    public static boolean fJNWhG(java.lang.Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof InterfaceC56535yIz) || (obj instanceof yIG.Activity));
    }

    public static Map.Entry KWHzl(java.lang.Object obj) {
        if ((obj instanceof InterfaceC56535yIz) && !(obj instanceof yIG.Activity)) {
            EZpvd(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return values(obj);
    }

    public static Map.Entry values(java.lang.Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (java.lang.ClassCastException e) {
            throw AEQbTJ(e);
        }
    }

    public static int fetchVPNInfo(java.lang.Object obj) {
        if (obj instanceof InterfaceC56517yIh) {
            return ((InterfaceC56517yIh) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof yHO) {
            return 3;
        }
        if (obj instanceof yHT) {
            return 4;
        }
        if (obj instanceof yHS) {
            return 5;
        }
        if (obj instanceof yHQ) {
            return 6;
        }
        if (obj instanceof yHR) {
            return 7;
        }
        if (obj instanceof yHP) {
            return 8;
        }
        if (obj instanceof yHY) {
            return 9;
        }
        if (obj instanceof yHC) {
            return 10;
        }
        if (obj instanceof yHA) {
            return 11;
        }
        if (obj instanceof yHD) {
            return 12;
        }
        if (obj instanceof yHB) {
            return 13;
        }
        if (obj instanceof yHI) {
            return 14;
        }
        if (obj instanceof yHJ) {
            return 15;
        }
        if (obj instanceof yHF) {
            return 16;
        }
        if (obj instanceof yHG) {
            return 17;
        }
        if (obj instanceof yHH) {
            return 18;
        }
        if (obj instanceof yHL) {
            return 19;
        }
        if (obj instanceof yHM) {
            return 20;
        }
        if (obj instanceof yHN) {
            return 21;
        }
        return obj instanceof yHK ? 22 : -1;
    }

    public static boolean EZpvd(java.lang.Object obj, int i) {
        return (obj instanceof InterfaceC56388yDn) && fetchVPNInfo(obj) == i;
    }

    public static java.lang.Object KWHzl(java.lang.Object obj, int i) {
        if (obj != null && !EZpvd(obj, i)) {
            EZpvd(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }
}
