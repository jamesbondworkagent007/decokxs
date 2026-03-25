package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pMS implements InterfaceC2618ASr {
    public static final int AEQbTJ = C43239rlY.KWHzl;
    public final C43239rlY KWHzl;
    public final pMM copydefault;

    public pMS(@NotNull C43239rlY c43239rlY, @NotNull pMM pmm) {
        Intrinsics.checkNotNullParameter(c43239rlY, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        this.KWHzl = c43239rlY;
        this.copydefault = pmm;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return str + "/" + str2;
    }

    @Override // o.InterfaceC2618ASr
    public InterfaceC2607ASg copydefault(@NotNull ASC asc) {
        InterfaceC43233rlS interfaceC43233rlSDjBIcL;
        InterfaceC43234rlT value;
        Intrinsics.checkNotNullParameter(asc, "");
        pMQ pmq = asc instanceof pMQ ? (pMQ) asc : null;
        if (pmq != null && (interfaceC43233rlSDjBIcL = pmq.djBIcL()) != null) {
            InterfaceC56387yDm<InterfaceC43234rlT> interfaceC56387yDm = this.KWHzl.EZpvd().get(AEQbTJ(interfaceC43233rlSDjBIcL.KWHzl().getMode(), interfaceC43233rlSDjBIcL.OLrzqt()));
            if (interfaceC56387yDm != null && (value = interfaceC56387yDm.getValue()) != null) {
                return new pMO(value, this.copydefault);
            }
        }
        return null;
    }

    @Override // o.InterfaceC2618ASr
    public ASC copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC43233rlS interfaceC43233rlS = this.KWHzl.copydefault().get(AEQbTJ(str, str2));
        if (interfaceC43233rlS == null) {
            return null;
        }
        return new pMQ(interfaceC43233rlS);
    }

    @Override // o.InterfaceC2618ASr
    public InterfaceC2607ASg EZpvd(@NotNull java.lang.String str) {
        InterfaceC43234rlT value;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC56387yDm<InterfaceC43234rlT> interfaceC56387yDm = this.KWHzl.AEQbTJ().get(str);
        if (interfaceC56387yDm == null || (value = interfaceC56387yDm.getValue()) == null) {
            return null;
        }
        return new pMO(value, this.copydefault);
    }

    @Override // o.InterfaceC2618ASr
    public ASC copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC43233rlS interfaceC43233rlS = this.KWHzl.copydefault().get(str);
        if (interfaceC43233rlS == null) {
            return null;
        }
        return new pMQ(interfaceC43233rlS);
    }
}
