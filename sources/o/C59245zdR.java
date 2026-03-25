package o;

import kotlin.jvm.internal.Intrinsics;
import o.C59265zdl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59245zdR {
    public static final C59186zcL OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        if (abstractC59331zeyAkhnZx instanceof C59186zcL) {
            return (C59186zcL) abstractC59331zeyAkhnZx;
        }
        return null;
    }

    public static final AbstractC59242zdO copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        C59186zcL c59186zcLOLrzqt = OLrzqt(abstractC59233zdF);
        if (c59186zcLOLrzqt != null) {
            return c59186zcLOLrzqt.valueOf();
        }
        return null;
    }

    public static final AbstractC59242zdO AEQbTJ(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59242zdO abstractC59242zdO2) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(abstractC59242zdO2, "");
        return C59238zdK.AEQbTJ(abstractC59242zdO) ? abstractC59242zdO : new C59186zcL(abstractC59242zdO, abstractC59242zdO2);
    }

    public static final boolean AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return abstractC59233zdF.AkhnZx() instanceof C59265zdl;
    }

    public static /* synthetic */ AbstractC59242zdO makeSimpleTypeDefinitelyNotNullOrNotNull$default(AbstractC59242zdO abstractC59242zdO, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copydefault(abstractC59242zdO, z);
    }

    public static final AbstractC59242zdO copydefault(@NotNull AbstractC59242zdO abstractC59242zdO, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        C59265zdl c59265zdlMakeDefinitelyNotNull$default = C59265zdl.ActionBar.makeDefinitelyNotNull$default(C59265zdl.copydefault, abstractC59242zdO, z, false, 4, null);
        if (c59265zdlMakeDefinitelyNotNull$default != null) {
            return c59265zdlMakeDefinitelyNotNull$default;
        }
        AbstractC59242zdO abstractC59242zdOKWHzl = KWHzl(abstractC59242zdO);
        return abstractC59242zdOKWHzl == null ? abstractC59242zdO.AEQbTJ(false) : abstractC59242zdOKWHzl;
    }

    public static final C59288zeH OLrzqt(@NotNull C59288zeH c59288zeH) {
        Intrinsics.checkNotNullParameter(c59288zeH, "");
        return new C59288zeH(c59288zeH.valueOf(), c59288zeH.djBIcL(), c59288zeH.gEmmrt(), c59288zeH.bX_(), c59288zeH.AEQbTJ(), true);
    }

    public static /* synthetic */ AbstractC59331zey makeDefinitelyNotNullOrNotNull$default(AbstractC59331zey abstractC59331zey, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copydefault(abstractC59331zey, z);
    }

    public static final AbstractC59331zey copydefault(@NotNull AbstractC59331zey abstractC59331zey, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC59331zey, "");
        C59265zdl c59265zdlMakeDefinitelyNotNull$default = C59265zdl.ActionBar.makeDefinitelyNotNull$default(C59265zdl.copydefault, abstractC59331zey, z, false, 4, null);
        if (c59265zdlMakeDefinitelyNotNull$default != null) {
            return c59265zdlMakeDefinitelyNotNull$default;
        }
        AbstractC59242zdO abstractC59242zdOKWHzl = KWHzl(abstractC59331zey);
        return abstractC59242zdOKWHzl != null ? abstractC59242zdOKWHzl : abstractC59331zey.AEQbTJ(false);
    }

    public static final AbstractC59242zdO KWHzl(AbstractC59233zdF abstractC59233zdF) {
        C59228zdA c59228zdAEZpvd;
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59233zdF.djBIcL();
        C59228zdA c59228zdA = interfaceC59315zeiDjBIcL instanceof C59228zdA ? (C59228zdA) interfaceC59315zeiDjBIcL : null;
        if (c59228zdA == null || (c59228zdAEZpvd = EZpvd(c59228zdA)) == null) {
            return null;
        }
        return c59228zdAEZpvd.AYXKKw();
    }

    public static final C59228zdA EZpvd(C59228zdA c59228zdA) {
        AbstractC59233zdF abstractC59233zdFMakeDefinitelyNotNullOrNotNull$default;
        java.util.Collection<AbstractC59233zdF> collectionBV_ = c59228zdA.bV_();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collectionBV_, 10));
        java.util.Iterator<T> it = collectionBV_.iterator();
        boolean z = false;
        while (true) {
            abstractC59233zdFMakeDefinitelyNotNullOrNotNull$default = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC59233zdF abstractC59233zdFMakeDefinitelyNotNullOrNotNull$default2 = (AbstractC59233zdF) it.next();
            if (C59322zep.valueOf(abstractC59233zdFMakeDefinitelyNotNullOrNotNull$default2)) {
                abstractC59233zdFMakeDefinitelyNotNullOrNotNull$default2 = makeDefinitelyNotNullOrNotNull$default(abstractC59233zdFMakeDefinitelyNotNullOrNotNull$default2.AkhnZx(), false, 1, null);
                z = true;
            }
            arrayList.add(abstractC59233zdFMakeDefinitelyNotNullOrNotNull$default2);
        }
        if (!z) {
            return null;
        }
        AbstractC59233zdF abstractC59233zdFAhwBna = c59228zdA.AhwBna();
        if (abstractC59233zdFAhwBna != null) {
            abstractC59233zdFMakeDefinitelyNotNullOrNotNull$default = C59322zep.valueOf(abstractC59233zdFAhwBna) ? makeDefinitelyNotNullOrNotNull$default(abstractC59233zdFAhwBna.AkhnZx(), false, 1, null) : abstractC59233zdFAhwBna;
        }
        return new C59228zdA(arrayList).EZpvd(abstractC59233zdFMakeDefinitelyNotNullOrNotNull$default);
    }
}
