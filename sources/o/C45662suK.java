package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45662suK {
    public static final C45662suK KWHzl = new C45662suK();

    private C45662suK() {
    }

    public final void OLrzqt(@NotNull final InterfaceC56387yDm<C45706svB> interfaceC56387yDm, @NotNull final InterfaceC56387yDm<? extends InterfaceC45723svf> interfaceC56387yDm2, @NotNull final InterfaceC56387yDm<C45730svm> interfaceC56387yDm3) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm2, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm3, "");
        C43248rlh.KWHzl.EZpvd(InterfaceC33171mrS.class, new Function1() { // from class: o.suL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45662suK.EZpvd(interfaceC56387yDm, interfaceC56387yDm2, interfaceC56387yDm3, (InterfaceC33171mrS) obj);
            }
        });
    }

    public static final Unit EZpvd(InterfaceC56387yDm interfaceC56387yDm, InterfaceC56387yDm interfaceC56387yDm2, InterfaceC56387yDm interfaceC56387yDm3, InterfaceC33171mrS interfaceC33171mrS) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        pUU.copydefault("LiteHeroPage", "LiteHeroBottomNavItem setup");
        interfaceC33171mrS.OLrzqt(new C45659suH(interfaceC56387yDm, interfaceC56387yDm2, interfaceC56387yDm3));
        return Unit.INSTANCE;
    }
}
