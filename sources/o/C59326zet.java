package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zet, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59326zet {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC59233zdF copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<? extends InterfaceC59317zek> list, @NotNull yOL yol) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yol, "");
        return replace$default(abstractC59233zdF, list, yol, null, 4, null);
    }

    public static /* synthetic */ AbstractC59233zdF replace$default(AbstractC59233zdF abstractC59233zdF, java.util.List list, yOL yol, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = abstractC59233zdF.bY_();
        }
        if ((i & 2) != 0) {
            yol = abstractC59233zdF.copydefault();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return AEQbTJ(abstractC59233zdF, list, yol, list2);
    }

    public static final AbstractC59233zdF AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<? extends InterfaceC59317zek> list, @NotNull yOL yol, @NotNull java.util.List<? extends InterfaceC59317zek> list2) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if ((list.isEmpty() || list == abstractC59233zdF.bY_()) && yol == abstractC59233zdF.copydefault()) {
            return abstractC59233zdF;
        }
        C59308zeb c59308zebBX_ = abstractC59233zdF.bX_();
        if ((yol instanceof yOS) && ((yOS) yol).AEQbTJ()) {
            yol = yOL.KWHzl.OLrzqt();
        }
        C59308zeb c59308zebEZpvd = C59314zeh.EZpvd(c59308zebBX_, yol);
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        if (abstractC59331zeyAkhnZx instanceof AbstractC59272zds) {
            AbstractC59272zds abstractC59272zds = (AbstractC59272zds) abstractC59331zeyAkhnZx;
            return C59231zdD.copydefault(KWHzl(abstractC59272zds.valueOf(), list, c59308zebEZpvd), KWHzl(abstractC59272zds.AYXKKw(), list2, c59308zebEZpvd));
        }
        if (abstractC59331zeyAkhnZx instanceof AbstractC59242zdO) {
            return KWHzl((AbstractC59242zdO) abstractC59331zeyAkhnZx, list, c59308zebEZpvd);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ AbstractC59242zdO replace$default(AbstractC59242zdO abstractC59242zdO, java.util.List list, C59308zeb c59308zeb, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = abstractC59242zdO.bY_();
        }
        if ((i & 2) != 0) {
            c59308zeb = abstractC59242zdO.bX_();
        }
        return KWHzl(abstractC59242zdO, list, c59308zeb);
    }

    public static final AbstractC59242zdO KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull java.util.List<? extends InterfaceC59317zek> list, @NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        if (list.isEmpty() && c59308zeb == abstractC59242zdO.bX_()) {
            return abstractC59242zdO;
        }
        if (list.isEmpty()) {
            return abstractC59242zdO.AEQbTJ(c59308zeb);
        }
        if (abstractC59242zdO instanceof C59366zfg) {
            return ((C59366zfg) abstractC59242zdO).KWHzl(list);
        }
        return C59231zdD.simpleType$default(c59308zeb, abstractC59242zdO.djBIcL(), list, abstractC59242zdO.AEQbTJ(), (AbstractC59287zeG) null, 16, (java.lang.Object) null);
    }

    public static final AbstractC59242zdO copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        AbstractC59242zdO abstractC59242zdO = abstractC59331zeyAkhnZx instanceof AbstractC59242zdO ? (AbstractC59242zdO) abstractC59331zeyAkhnZx : null;
        if (abstractC59242zdO != null) {
            return abstractC59242zdO;
        }
        throw new java.lang.IllegalStateException(("This is should be simple type: " + abstractC59233zdF).toString());
    }
}
