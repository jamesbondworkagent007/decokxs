package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37257oqS implements InterfaceC35897oHt<java.lang.Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((c35895oHr instanceof Application) && (obj instanceof AbstractC37253oqO)) {
            ((Application) c35895oHr).OLrzqt((AbstractC37253oqO) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof AbstractC37253oqO;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNQ nnqAEQbTJ = nNQ.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnqAEQbTJ, "");
        return new Application(this, nnqAEQbTJ);
    }

    /* JADX INFO: renamed from: o.oqS$Application */
    public final class Application extends C35895oHr {
        public final nNQ OLrzqt;
        public final /* synthetic */ C37257oqS copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C37257oqS c37257oqS, nNQ nnq) {
            super(nnq.getRoot().getContext(), nnq.getRoot());
            Intrinsics.checkNotNullParameter(nnq, "");
            this.copydefault = c37257oqS;
            this.OLrzqt = nnq;
        }

        public final void OLrzqt(@NotNull AbstractC37253oqO abstractC37253oqO) {
            Intrinsics.checkNotNullParameter(abstractC37253oqO, "");
            this.OLrzqt.copydefault.setText(abstractC37253oqO.KWHzl().EZpvd());
        }
    }
}
