package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59270zdq extends AbstractC59267zdn {
    public final AbstractC59242zdO copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59267zdn
    public AbstractC59242zdO EZpvd() {
        return this.copydefault;
    }

    public AbstractC59270zdq(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        this.copydefault = abstractC59242zdO;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return c59308zeb != bX_() ? new C59244zdQ(this, c59308zeb) : this;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(boolean z) {
        return z == AEQbTJ() ? this : EZpvd().AEQbTJ(z).AEQbTJ(bX_());
    }
}
