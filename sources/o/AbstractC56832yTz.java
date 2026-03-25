package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC56812yTf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yTz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56832yTz extends AbstractC56812yTf {
    @Override // o.AbstractC56812yTf
    public InterfaceC56679yOh AYXKKw() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56812yTf
    public void EZpvd(@NotNull C56935yXu c56935yXu, @NotNull java.util.Collection<InterfaceC56676yOe> collection) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(collection, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC56832yTz(@NotNull C56794ySo c56794ySo) {
        super(c56794ySo, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(c56794ySo, "");
    }

    @Override // o.AbstractC56812yTf
    public AbstractC56812yTf.StateListAnimator EZpvd(@NotNull InterfaceC56835yUb interfaceC56835yUb, @NotNull java.util.List<? extends InterfaceC56691yOt> list, @NotNull AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<? extends InterfaceC56695yOx> list2) {
        Intrinsics.checkNotNullParameter(interfaceC56835yUb, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new AbstractC56812yTf.StateListAnimator(abstractC59233zdF, null, list2, list, false, yDY.AhwBna());
    }
}
