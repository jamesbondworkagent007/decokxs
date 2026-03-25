package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35364ntt {
    public static final void OLrzqt(@NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        InterfaceC56387yDm interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.nts
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35364ntt.copydefault();
            }
        });
        DeeplinkMode deeplinkMode = DeeplinkMode.APP;
        OLrzqt(interfaceC43237rlW, new C35357ntm(deeplinkMode), interfaceC56387yDmCopydefault);
        OLrzqt(interfaceC43237rlW, new C35367ntw(deeplinkMode), interfaceC56387yDmCopydefault);
        OLrzqt(interfaceC43237rlW, new C35366ntv(deeplinkMode), interfaceC56387yDmCopydefault);
        OLrzqt(interfaceC43237rlW, new C35362ntr(deeplinkMode), interfaceC56387yDmCopydefault);
        OLrzqt(interfaceC43237rlW, new C35356ntl(deeplinkMode), interfaceC56387yDmCopydefault);
        OLrzqt(interfaceC43237rlW, new C35355ntk(deeplinkMode), interfaceC56387yDmCopydefault);
        OLrzqt(interfaceC43237rlW, new C35361ntq(deeplinkMode), interfaceC56387yDmCopydefault);
        OLrzqt(interfaceC43237rlW, new C35368ntx(deeplinkMode), interfaceC56387yDmCopydefault);
        OLrzqt(interfaceC43237rlW, new C35365ntu(deeplinkMode), interfaceC56387yDmCopydefault);
    }

    public static final C35358ntn copydefault() {
        return new C35358ntn();
    }

    public static final void OLrzqt(InterfaceC43237rlW interfaceC43237rlW, InterfaceC43233rlS interfaceC43233rlS, InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDm) {
        try {
            interfaceC43237rlW.copydefault(interfaceC43233rlS, interfaceC56387yDm);
        } catch (java.lang.AssertionError e) {
            pUU.valueOf("IMDeeplinkHandlerRegistry", "Deeplink path already registered: " + interfaceC43233rlS.OLrzqt() + " — " + e.getMessage());
        }
    }
}
