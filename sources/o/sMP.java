package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sMP {
    public static final sMP AEQbTJ = new sMP();
    public static final java.util.HashMap<java.lang.String, java.lang.Class<? extends sJU<?>>> copydefault = new java.util.HashMap<>();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.sMO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sMP.EZpvd();
        }
    });
    public static final int EZpvd = 8;

    private sMP() {
    }

    public static final java.lang.String EZpvd() {
        return "defaultBizName_" + xVW.copydefault();
    }

    public final java.lang.String copydefault() {
        return (java.lang.String) OLrzqt.getValue();
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return str + ":" + str2;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.Class<? extends sJU<?>> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(cls, "");
        C44124sEe.imLogCore$default("registerOKMessageByServiceBizKey: serviceName=" + str + ", bizNames=" + list + ", okMessageConverter=" + cls, null, 2, null);
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            C44124sEe.imLogCore$default("registerOKMessageByServiceBizKey: serviceName is blank", null, 2, null);
            return;
        }
        for (java.lang.String str2 : list) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
                copydefault.put(AEQbTJ.KWHzl(str, str2), cls);
            } else {
                C44124sEe.imLogCore$default("registerOKMessageByServiceBizKey: bizName is blank", null, 2, null);
            }
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.Class<? extends sJU<?>> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        C44124sEe.imLogCore$default("registerDefaultOKMessageConverter: serviceName=" + str + ", okMessageConverter=" + cls, null, 2, null);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            copydefault.put(KWHzl(str, copydefault()), cls);
        } else {
            C44124sEe.imLogCore$default("registerDefaultOKMessageConverter: serviceName is blank", null, 2, null);
        }
    }

    public final sJU<?> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.reflect.Constructor<? extends sJU<?>> declaredConstructor;
        java.lang.reflect.Constructor<? extends sJU<?>> declaredConstructor2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strKWHzl = KWHzl(str, str2);
        java.util.HashMap<java.lang.String, java.lang.Class<? extends sJU<?>>> map = copydefault;
        if (map.containsKey(strKWHzl)) {
            java.lang.Class<? extends sJU<?>> cls = map.get(strKWHzl);
            if (cls == null || (declaredConstructor2 = cls.getDeclaredConstructor(new java.lang.Class[0])) == null) {
                return null;
            }
            return declaredConstructor2.newInstance(new java.lang.Object[0]);
        }
        C44124sEe.imLogCore$default("getConverterByServiceBizKey: Converter not found, trying default fallback converter for this serviceName: " + str, null, 2, null);
        java.lang.Class<? extends sJU<?>> cls2 = map.get(KWHzl(str, copydefault()));
        if (cls2 == null || (declaredConstructor = cls2.getDeclaredConstructor(new java.lang.Class[0])) == null) {
            return null;
        }
        return declaredConstructor.newInstance(new java.lang.Object[0]);
    }
}
