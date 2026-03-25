package o;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import o.InterfaceC59101zag;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYA extends yYR {
    public static final yYA copydefault = new yYA();

    private yYA() {
    }

    public java.util.Collection<InterfaceC56658yNn> KWHzl(@NotNull InterfaceC56658yNn interfaceC56658yNn, boolean z) {
        InterfaceC56665yNu next;
        InterfaceC56665yNu interfaceC56665yNuAuCTel;
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        if (interfaceC56658yNn.isConnected() != Modality.SEALED) {
            return yDY.AhwBna();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z) {
            interfaceC56665yNuAuCTel = interfaceC56658yNn.AuCTel();
        } else {
            java.util.Iterator<InterfaceC56665yNu> it = yZE.AYXKKw(interfaceC56658yNn).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof yNW) {
                    break;
                }
            }
            interfaceC56665yNuAuCTel = next;
        }
        if (interfaceC56665yNuAuCTel instanceof yNW) {
            EZpvd(interfaceC56658yNn, linkedHashSet, ((yNW) interfaceC56665yNuAuCTel).AEQbTJ(), z);
        }
        InterfaceC59098zad interfaceC59098zadOcIXYQ = interfaceC56658yNn.OcIXYQ();
        Intrinsics.checkNotNullExpressionValue(interfaceC59098zadOcIXYQ, "");
        EZpvd(interfaceC56658yNn, linkedHashSet, interfaceC59098zadOcIXYQ, true);
        return CollectionsKt___CollectionsKt.EZpvd(linkedHashSet, new TaskDescription());
    }

    public static final void EZpvd(InterfaceC56658yNn interfaceC56658yNn, LinkedHashSet<InterfaceC56658yNn> linkedHashSet, InterfaceC59098zad interfaceC59098zad, boolean z) {
        for (InterfaceC56665yNu interfaceC56665yNu : InterfaceC59101zag.Application.getContributedDescriptors$default(interfaceC59098zad, yZU.EZpvd, null, 2, null)) {
            if (interfaceC56665yNu instanceof InterfaceC56658yNn) {
                InterfaceC56658yNn interfaceC56658yNnAEQbTJ = (InterfaceC56658yNn) interfaceC56665yNu;
                if (interfaceC56658yNnAEQbTJ.zLjUOn()) {
                    C56935yXu c56935yXuBR_ = interfaceC56658yNnAEQbTJ.bR_();
                    Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                    InterfaceC56663yNs interfaceC56663yNsEZpvd = interfaceC59098zad.EZpvd(c56935yXuBR_, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    if (interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn) {
                        interfaceC56658yNnAEQbTJ = (InterfaceC56658yNn) interfaceC56663yNsEZpvd;
                    } else {
                        interfaceC56658yNnAEQbTJ = interfaceC56663yNsEZpvd instanceof InterfaceC56690yOs ? ((InterfaceC56690yOs) interfaceC56663yNsEZpvd).AEQbTJ() : null;
                    }
                }
                if (interfaceC56658yNnAEQbTJ != null) {
                    if (yYH.OLrzqt(interfaceC56658yNnAEQbTJ, interfaceC56658yNn)) {
                        linkedHashSet.add(interfaceC56658yNnAEQbTJ);
                    }
                    if (z) {
                        InterfaceC59098zad interfaceC59098zadOcIXYQ = interfaceC56658yNnAEQbTJ.OcIXYQ();
                        Intrinsics.checkNotNullExpressionValue(interfaceC59098zadOcIXYQ, "");
                        EZpvd(interfaceC56658yNn, linkedHashSet, interfaceC59098zadOcIXYQ, z);
                    }
                }
            }
        }
    }

    public static final class TaskDescription<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(yZE.EZpvd((InterfaceC56665yNu) t).KWHzl(), yZE.EZpvd((InterfaceC56665yNu) t2).KWHzl());
        }
    }
}
