package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59313zeg {
    public static final boolean OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        java.lang.Object objAkhnZx = abstractC59233zdF.AkhnZx();
        InterfaceC59261zdh interfaceC59261zdh = objAkhnZx instanceof InterfaceC59261zdh ? (InterfaceC59261zdh) objAkhnZx : null;
        if (interfaceC59261zdh != null) {
            return interfaceC59261zdh.KWHzl();
        }
        return false;
    }

    public static final InterfaceC59261zdh KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        java.lang.Object objAkhnZx = abstractC59233zdF.AkhnZx();
        InterfaceC59261zdh interfaceC59261zdh = objAkhnZx instanceof InterfaceC59261zdh ? (InterfaceC59261zdh) objAkhnZx : null;
        if (interfaceC59261zdh == null || !interfaceC59261zdh.KWHzl()) {
            return null;
        }
        return interfaceC59261zdh;
    }
}
