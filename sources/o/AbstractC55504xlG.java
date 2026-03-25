package o;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xlG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55504xlG implements InterfaceC58151yvq<Lifecycle.Event> {
    public yBM<Lifecycle.Event> AEQbTJ;

    public AbstractC55504xlG() {
        yBM<Lifecycle.Event> ybmAEQbTJ = yBM.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(ybmAEQbTJ, "");
        this.AEQbTJ = ybmAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Lo/yvu; */
    @Override // o.InterfaceC58151yvq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public <T> C58155yvu<T> OLrzqt(@NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "");
        C58155yvu<T> c58155yvuKWHzl = C58159yvy.KWHzl(this.AEQbTJ, event);
        Intrinsics.checkNotNullExpressionValue(c58155yvuKWHzl, "");
        return c58155yvuKWHzl;
    }

    @Override // o.InterfaceC58151yvq
    public <T> C58155yvu<T> EZpvd() {
        return OLrzqt(Lifecycle.Event.ON_DESTROY);
    }

    public void copydefault() {
        this.AEQbTJ.onNext(Lifecycle.Event.ON_DESTROY);
    }
}
