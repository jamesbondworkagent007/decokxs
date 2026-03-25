package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import o.C56929yXo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yPU {
    public final yVO AEQbTJ;
    public final C56732yQg EZpvd;
    public final ConcurrentHashMap<C56929yXo, InterfaceC59098zad> copydefault;

    public yPU(@NotNull yVO yvo, @NotNull C56732yQg c56732yQg) {
        Intrinsics.checkNotNullParameter(yvo, "");
        Intrinsics.checkNotNullParameter(c56732yQg, "");
        this.AEQbTJ = yvo;
        this.EZpvd = c56732yQg;
        this.copydefault = new ConcurrentHashMap<>();
    }

    public final InterfaceC59098zad EZpvd(@NotNull C56726yQa c56726yQa) {
        java.util.Collection collectionEZpvd;
        Intrinsics.checkNotNullParameter(c56726yQa, "");
        ConcurrentHashMap<C56929yXo, InterfaceC59098zad> concurrentHashMap = this.copydefault;
        C56929yXo c56929yXoKWHzl = c56726yQa.KWHzl();
        InterfaceC59098zad interfaceC59098zadAEQbTJ = concurrentHashMap.get(c56929yXoKWHzl);
        if (interfaceC59098zadAEQbTJ == null) {
            C56933yXs c56933yXsOLrzqt = c56726yQa.KWHzl().OLrzqt();
            if (c56726yQa.EZpvd().KWHzl() == KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                java.util.List<java.lang.String> listGEmmrt = c56726yQa.EZpvd().gEmmrt();
                collectionEZpvd = new java.util.ArrayList();
                for (java.lang.String str : listGEmmrt) {
                    C56929yXo.ActionBar actionBar = C56929yXo.AEQbTJ;
                    C56933yXs c56933yXsOLrzqt2 = yZQ.copydefault(str).OLrzqt();
                    Intrinsics.checkNotNullExpressionValue(c56933yXsOLrzqt2, "");
                    InterfaceC56893yWf interfaceC56893yWfOLrzqt = yVZ.OLrzqt(this.EZpvd, actionBar.KWHzl(c56933yXsOLrzqt2), C59432zgt.EZpvd(this.AEQbTJ.KWHzl().OLrzqt()));
                    if (interfaceC56893yWfOLrzqt != null) {
                        collectionEZpvd.add(interfaceC56893yWfOLrzqt);
                    }
                }
            } else {
                collectionEZpvd = C56402yEa.EZpvd(c56726yQa);
            }
            C56710yPl c56710yPl = new C56710yPl(this.AEQbTJ.KWHzl().fetchVPNInfo(), c56933yXsOLrzqt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = collectionEZpvd.iterator();
            while (it.hasNext()) {
                InterfaceC59098zad interfaceC59098zadEZpvd = this.AEQbTJ.EZpvd(c56710yPl, (InterfaceC56893yWf) it.next());
                if (interfaceC59098zadEZpvd != null) {
                    arrayList.add(interfaceC59098zadEZpvd);
                }
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            interfaceC59098zadAEQbTJ = yZW.OLrzqt.AEQbTJ("package " + c56933yXsOLrzqt + " (" + c56726yQa + ')', (java.lang.Iterable<? extends InterfaceC59098zad>) listAxsJAYsNCnLh);
            InterfaceC59098zad interfaceC59098zadPutIfAbsent = concurrentHashMap.putIfAbsent(c56929yXoKWHzl, interfaceC59098zadAEQbTJ);
            if (interfaceC59098zadPutIfAbsent != null) {
                interfaceC59098zadAEQbTJ = interfaceC59098zadPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(interfaceC59098zadAEQbTJ, "");
        return interfaceC59098zadAEQbTJ;
    }
}
