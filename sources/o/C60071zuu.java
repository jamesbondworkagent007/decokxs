package o;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;

/* JADX INFO: renamed from: o.zuu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60071zuu {
    public static final C60071zuu OLrzqt = new C60071zuu();

    private C60071zuu() {
    }

    public static /* synthetic */ AbstractC59987ztP defaultLogger$default(C60071zuu c60071zuu, Level level, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            level = Level.INFO;
        }
        return c60071zuu.OLrzqt(level);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(exc);
        sb.append("\n\t");
        java.lang.StackTraceElement[] stackTrace = exc.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            Intrinsics.checkNotNullExpressionValue(stackTraceElement.getClassName(), "");
            if (!(!StringsKt__StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) "sun.reflect", false, 2, (java.lang.Object) null))) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, "\n\t", null, null, 0, null, null, 62, null));
        return sb.toString();
    }

    public final java.lang.String EZpvd(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.lang.String name = yHE.OLrzqt(interfaceC56551yJo).getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return name;
    }

    public final java.lang.String KWHzl() {
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final LazyThreadSafetyMode EZpvd() {
        return LazyThreadSafetyMode.SYNCHRONIZED;
    }

    public final AbstractC59987ztP OLrzqt(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "");
        return new C59986ztO(level);
    }

    public final InterfaceC59980ztI AEQbTJ() {
        return C59972ztA.EZpvd;
    }

    public final <R> R copydefault(@NotNull java.lang.Object obj, @NotNull Function0<? extends R> function0) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(function0, "");
        synchronized (obj) {
            rInvoke = function0.invoke();
        }
        return rInvoke;
    }

    public final <K, V> java.util.Map<K, V> copydefault() {
        return new ConcurrentHashMap();
    }
}
