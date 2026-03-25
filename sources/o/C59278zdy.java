package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59278zdy {
    public static final boolean EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return abstractC59233zdF.AkhnZx() instanceof AbstractC59272zds;
    }

    public static final AbstractC59272zds AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        Intrinsics.copydefault(abstractC59331zeyAkhnZx, "");
        return (AbstractC59272zds) abstractC59331zeyAkhnZx;
    }

    public static final AbstractC59242zdO KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        if (abstractC59331zeyAkhnZx instanceof AbstractC59272zds) {
            return ((AbstractC59272zds) abstractC59331zeyAkhnZx).valueOf();
        }
        if (abstractC59331zeyAkhnZx instanceof AbstractC59242zdO) {
            return (AbstractC59242zdO) abstractC59331zeyAkhnZx;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AbstractC59242zdO OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        if (abstractC59331zeyAkhnZx instanceof AbstractC59272zds) {
            return ((AbstractC59272zds) abstractC59331zeyAkhnZx).AYXKKw();
        }
        if (abstractC59331zeyAkhnZx instanceof AbstractC59242zdO) {
            return (AbstractC59242zdO) abstractC59331zeyAkhnZx;
        }
        throw new NoWhenBranchMatchedException();
    }
}
