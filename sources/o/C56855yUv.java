package o;

import kotlin.jvm.internal.Intrinsics;
import o.yOL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yUv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56855yUv implements yOL {
    public final C56933yXs copydefault;

    @Override // o.yOL
    public boolean AEQbTJ() {
        return false;
    }

    public C56855yUv(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        this.copydefault = c56933yXs;
    }

    @Override // o.yOL
    public boolean copydefault(@NotNull C56933yXs c56933yXs) {
        return yOL.Activity.OLrzqt(this, c56933yXs);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/yXs;)Lo/yOJ; */
    @Override // o.yOL
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C56849yUp EZpvd(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        if (Intrinsics.EZpvd(c56933yXs, this.copydefault)) {
            return C56849yUp.AEQbTJ;
        }
        return null;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<yOJ> iterator() {
        return yDY.AhwBna().iterator();
    }
}
