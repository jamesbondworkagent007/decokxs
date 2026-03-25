package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yUd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56837yUd {
    public static final boolean copydefault(@NotNull InterfaceC56836yUc interfaceC56836yUc) {
        Intrinsics.checkNotNullParameter(interfaceC56836yUc, "");
        return interfaceC56836yUc.AkhnZx().AubY() && (interfaceC56836yUc instanceof InterfaceC56835yUb) && OLrzqt((InterfaceC56835yUb) interfaceC56836yUc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0.equals("hashCode") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r0.equals("toString") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r3.AhwBna().isEmpty();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean OLrzqt(InterfaceC56835yUb interfaceC56835yUb) {
        java.lang.String strAEQbTJ = interfaceC56835yUb.fIwbmz().AEQbTJ();
        int iHashCode = strAEQbTJ.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode != -1295482945) {
                if (iHashCode == 147696667) {
                }
            } else if (strAEQbTJ.equals("equals")) {
                return copydefault(interfaceC56835yUb);
            }
            return false;
        }
    }

    public static final boolean copydefault(InterfaceC56835yUb interfaceC56835yUb) {
        C56933yXs c56933yXsValueOf;
        InterfaceC56844yUk interfaceC56844yUk = (InterfaceC56844yUk) CollectionsKt___CollectionsKt.zuBGHE(interfaceC56835yUb.AhwBna());
        InterfaceC56839yUf interfaceC56839yUfAYXKKw = interfaceC56844yUk != null ? interfaceC56844yUk.AYXKKw() : null;
        yTU ytu = interfaceC56839yUfAYXKKw instanceof yTU ? (yTU) interfaceC56839yUfAYXKKw : null;
        if (ytu == null) {
            return false;
        }
        yTQ ytqCopydefault = ytu.copydefault();
        return (ytqCopydefault instanceof yTT) && (c56933yXsValueOf = ((yTT) ytqCopydefault).valueOf()) != null && Intrinsics.EZpvd((java.lang.Object) c56933yXsValueOf.KWHzl(), (java.lang.Object) "java.lang.Object");
    }
}
