package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56989yZu extends C56971yZc {
    public final AbstractC59233zdF AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC59233zdF KWHzl(AbstractC59233zdF abstractC59233zdF, yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        return abstractC59233zdF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59233zdF EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56989yZu(@NotNull java.util.List<? extends AbstractC56975yZg<?>> list, @NotNull AbstractC59233zdF abstractC59233zdF) {
        super(list, new yZA(abstractC59233zdF));
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        this.AEQbTJ = abstractC59233zdF;
    }
}
