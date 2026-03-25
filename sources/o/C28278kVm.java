package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import o.C31172lox;

/* JADX INFO: renamed from: o.kVm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28278kVm {
    public static final int AEQbTJ;
    public static final C28278kVm KWHzl = new C28278kVm();
    public static final java.util.Map<C31172lox, InterfaceC28279kVn> copydefault;

    private C28278kVm() {
    }

    static {
        C31172lox.TaskDescription taskDescription = C31172lox.Companion;
        copydefault = C56424yEw.gEmmrt(C56390yDp.OLrzqt(C31172lox.KWHzl(taskDescription.KWHzl()), new C28287kVv()), C56390yDp.OLrzqt(C31172lox.KWHzl(taskDescription.OLrzqt()), new kVG()));
        AEQbTJ = 8;
    }

    public final InterfaceC28279kVn EZpvd(int i) {
        InterfaceC28279kVn interfaceC28279kVn = copydefault.get(C31172lox.KWHzl(i));
        return interfaceC28279kVn == null ? new C28287kVv() : interfaceC28279kVn;
    }

    public final java.util.List<InterfaceC28279kVn> OLrzqt() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(copydefault.values());
    }
}
