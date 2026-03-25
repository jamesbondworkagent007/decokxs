package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59257zdd extends AbstractC59311zee<C59257zdd> {
    public final yOL KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yOL OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59311zee
    public InterfaceC56551yJo<? extends C59257zdd> copydefault() {
        return C56524yIo.AEQbTJ(C59257zdd.class);
    }

    public C59257zdd(@NotNull yOL yol) {
        Intrinsics.checkNotNullParameter(yol, "");
        this.KWHzl = yol;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/zee;)Lo/zee; */
    @Override // o.AbstractC59311zee
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C59257zdd OLrzqt(C59257zdd c59257zdd) {
        if (Intrinsics.EZpvd(c59257zdd, this)) {
            return this;
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/zee;)Lo/zee; */
    @Override // o.AbstractC59311zee
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59257zdd EZpvd(C59257zdd c59257zdd) {
        return c59257zdd == null ? this : new C59257zdd(yOP.AEQbTJ(this.KWHzl, c59257zdd.KWHzl));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C59257zdd) {
            return Intrinsics.EZpvd(((C59257zdd) obj).KWHzl, this.KWHzl);
        }
        return false;
    }

    public int hashCode() {
        return this.KWHzl.hashCode();
    }
}
