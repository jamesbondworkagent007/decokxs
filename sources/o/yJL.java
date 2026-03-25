package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJL {
    public static final InterfaceC56551yJo<?> KWHzl(@NotNull InterfaceC56559yJw interfaceC56559yJw) {
        InterfaceC56551yJo<?> interfaceC56551yJoEZpvd;
        Intrinsics.checkNotNullParameter(interfaceC56559yJw, "");
        InterfaceC56553yJq classifier = interfaceC56559yJw.getClassifier();
        if (classifier != null && (interfaceC56551yJoEZpvd = EZpvd(classifier)) != null) {
            return interfaceC56551yJoEZpvd;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + interfaceC56559yJw);
    }

    public static final InterfaceC56551yJo<?> EZpvd(@NotNull InterfaceC56553yJq interfaceC56553yJq) {
        java.lang.Object obj;
        InterfaceC56551yJo<?> interfaceC56551yJoKWHzl;
        Intrinsics.checkNotNullParameter(interfaceC56553yJq, "");
        if (interfaceC56553yJq instanceof InterfaceC56551yJo) {
            return (InterfaceC56551yJo) interfaceC56553yJq;
        }
        if (interfaceC56553yJq instanceof yJD) {
            java.util.List<InterfaceC56559yJw> listEZpvd = ((yJD) interfaceC56553yJq).EZpvd();
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                InterfaceC56559yJw interfaceC56559yJw = (InterfaceC56559yJw) next;
                Intrinsics.copydefault(interfaceC56559yJw, "");
                InterfaceC56663yNs interfaceC56663yNsKWHzl = ((yLJ) interfaceC56559yJw).AEQbTJ().djBIcL().OLrzqt();
                InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsKWHzl : null;
                if (interfaceC56658yNn != null && interfaceC56658yNn.DbNXlk() != ClassKind.INTERFACE && interfaceC56658yNn.DbNXlk() != ClassKind.ANNOTATION_CLASS) {
                    obj = next;
                    break;
                }
            }
            InterfaceC56559yJw interfaceC56559yJw2 = (InterfaceC56559yJw) obj;
            if (interfaceC56559yJw2 == null) {
                interfaceC56559yJw2 = (InterfaceC56559yJw) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd);
            }
            return (interfaceC56559yJw2 == null || (interfaceC56551yJoKWHzl = KWHzl(interfaceC56559yJw2)) == null) ? C56524yIo.AEQbTJ(java.lang.Object.class) : interfaceC56551yJoKWHzl;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + interfaceC56553yJq);
    }
}
