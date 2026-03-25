package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59309zec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59314zeh {
    public static final C59308zeb AEQbTJ(@NotNull yOL yol) {
        Intrinsics.checkNotNullParameter(yol, "");
        return InterfaceC59309zec.Application.toAttributes$default(C59263zdj.OLrzqt, yol, null, null, 6, null);
    }

    public static final C59308zeb EZpvd(@NotNull C59308zeb c59308zeb, @NotNull yOL yol) {
        C59308zeb c59308zebKWHzl;
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        Intrinsics.checkNotNullParameter(yol, "");
        if (C59259zdf.KWHzl(c59308zeb) == yol) {
            return c59308zeb;
        }
        C59257zdd c59257zddOLrzqt = C59259zdf.OLrzqt(c59308zeb);
        if (c59257zddOLrzqt != null && (c59308zebKWHzl = c59308zeb.KWHzl(c59257zddOLrzqt)) != null) {
            c59308zeb = c59308zebKWHzl;
        }
        return (yol.iterator().hasNext() || !yol.AEQbTJ()) ? c59308zeb.copydefault(new C59257zdd(yol)) : c59308zeb;
    }
}
