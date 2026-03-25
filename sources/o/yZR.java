package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yZR {
    public static final boolean OLrzqt(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        InterfaceC56656yNl interfaceC56656yNl = callableMemberDescriptor instanceof InterfaceC56656yNl ? (InterfaceC56656yNl) callableMemberDescriptor : null;
        if (interfaceC56656yNl == null || C56669yNy.EZpvd(interfaceC56656yNl.getNewProxyInstance())) {
            return false;
        }
        InterfaceC56658yNn interfaceC56658yNnFIwbmz = interfaceC56656yNl.fIwbmz();
        Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnFIwbmz, "");
        if (yYK.copydefault(interfaceC56658yNnFIwbmz) || yYH.fARcdN(interfaceC56656yNl.fIwbmz())) {
            return false;
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = interfaceC56656yNl.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        if ((listFetchVPNInfo instanceof java.util.Collection) && listFetchVPNInfo.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = listFetchVPNInfo.iterator();
        while (it.hasNext()) {
            AbstractC59233zdF abstractC59233zdFUzCIH = ((InterfaceC56695yOx) it.next()).uzCIH();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
            if (OLrzqt(abstractC59233zdFUzCIH)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return yYK.copydefault(interfaceC56665yNu) && !copydefault((InterfaceC56658yNn) interfaceC56665yNu);
    }

    public static final boolean EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        return interfaceC56663yNsOLrzqt != null && ((yYK.EZpvd(interfaceC56663yNsOLrzqt) && KWHzl(interfaceC56663yNsOLrzqt)) || yYK.KWHzl(abstractC59233zdF));
    }

    public static final boolean OLrzqt(AbstractC59233zdF abstractC59233zdF) {
        return EZpvd(abstractC59233zdF) || KWHzl(abstractC59233zdF, true);
    }

    public static final boolean copydefault(InterfaceC56658yNn interfaceC56658yNn) {
        return Intrinsics.EZpvd(yZE.EZpvd((InterfaceC56665yNu) interfaceC56658yNn), yMB.sSMYrx);
    }

    public static final boolean KWHzl(AbstractC59233zdF abstractC59233zdF, boolean z) {
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        InterfaceC56691yOt interfaceC56691yOt = interfaceC56663yNsOLrzqt instanceof InterfaceC56691yOt ? (InterfaceC56691yOt) interfaceC56663yNsOLrzqt : null;
        if (interfaceC56691yOt == null) {
            return false;
        }
        return (z || !yYK.AEQbTJ(interfaceC56691yOt)) && OLrzqt(C59336zfC.AEQbTJ(interfaceC56691yOt));
    }
}
