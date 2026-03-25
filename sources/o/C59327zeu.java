package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59327zeu {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.zdF */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC59233zdF OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        if (abstractC59233zdF instanceof InterfaceC59329zew) {
            return ((InterfaceC59329zew) abstractC59233zdF).AhwBna();
        }
        return null;
    }

    public static final AbstractC59331zey OLrzqt(@NotNull AbstractC59331zey abstractC59331zey, @NotNull AbstractC59233zdF abstractC59233zdF, @NotNull Function1<? super AbstractC59233zdF, ? extends AbstractC59233zdF> function1) {
        Intrinsics.checkNotNullParameter(abstractC59331zey, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC59233zdF abstractC59233zdFOLrzqt = OLrzqt(abstractC59233zdF);
        return OLrzqt(abstractC59331zey, abstractC59233zdFOLrzqt != null ? function1.invoke(abstractC59233zdFOLrzqt) : null);
    }

    public static final AbstractC59331zey copydefault(@NotNull AbstractC59331zey abstractC59331zey, @NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59331zey, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return OLrzqt(abstractC59331zey, OLrzqt(abstractC59233zdF));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.zey */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC59331zey OLrzqt(@NotNull AbstractC59331zey abstractC59331zey, AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59331zey, "");
        if (abstractC59331zey instanceof InterfaceC59329zew) {
            return OLrzqt(((InterfaceC59329zew) abstractC59331zey).fetchVPNInfo(), abstractC59233zdF);
        }
        if (abstractC59233zdF == null || Intrinsics.EZpvd(abstractC59233zdF, abstractC59331zey)) {
            return abstractC59331zey;
        }
        if (abstractC59331zey instanceof AbstractC59242zdO) {
            return new C59246zdS((AbstractC59242zdO) abstractC59331zey, abstractC59233zdF);
        }
        if (abstractC59331zey instanceof AbstractC59272zds) {
            return new C59277zdx((AbstractC59272zds) abstractC59331zey, abstractC59233zdF);
        }
        throw new NoWhenBranchMatchedException();
    }
}
