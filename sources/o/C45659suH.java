package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45659suH implements InterfaceC33213msH {
    public final InterfaceC56387yDm<C45730svm> EZpvd;
    public InterfaceC33214msI KWHzl;
    public final InterfaceC56387yDm<InterfaceC45723svf> OLrzqt;
    public final InterfaceC56387yDm<C45706svB> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yDm<? extends o.svf> */
    /* JADX WARN: Multi-variable type inference failed */
    public C45659suH(@NotNull InterfaceC56387yDm<C45706svB> interfaceC56387yDm, @NotNull InterfaceC56387yDm<? extends InterfaceC45723svf> interfaceC56387yDm2, @NotNull InterfaceC56387yDm<C45730svm> interfaceC56387yDm3) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm2, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm3, "");
        this.copydefault = interfaceC56387yDm;
        this.OLrzqt = interfaceC56387yDm2;
        this.EZpvd = interfaceC56387yDm3;
    }

    @Override // o.InterfaceC33213msH
    public InterfaceC33214msI KWHzl() {
        InterfaceC33214msI interfaceC33214msI = this.KWHzl;
        if (interfaceC33214msI != null) {
            return interfaceC33214msI;
        }
        C45664suM c45664suM = new C45664suM(this.copydefault, this.OLrzqt, this.EZpvd);
        this.KWHzl = c45664suM;
        return c45664suM;
    }
}
