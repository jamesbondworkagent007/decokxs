package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eKM extends eKF<C15492eKi> {
    public final AbstractC16841erY KWHzl;

    /* JADX WARN: Illegal instructions before constructor call */
    public eKM(@NotNull AbstractC16841erY abstractC16841erY) {
        Intrinsics.checkNotNullParameter(abstractC16841erY, "");
        android.view.View root = abstractC16841erY.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AbstractC16867ery abstractC16867ery = abstractC16841erY.KWHzl;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery, "");
        super(root, abstractC16867ery, abstractC16841erY.copydefault);
        this.KWHzl = abstractC16841erY;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/eKf;)V */
    @Override // o.eKF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C15492eKi c15492eKi) {
        Intrinsics.checkNotNullParameter(c15492eKi, "");
        super.copydefault(c15492eKi);
        OLrzqt(c15492eKi);
        this.KWHzl.KWHzl(c15492eKi);
    }
}
