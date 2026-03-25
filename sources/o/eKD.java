package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eKD extends eKF<C15493eKj> {
    public final AbstractC16861ers EZpvd;

    /* JADX WARN: Illegal instructions before constructor call */
    public eKD(@NotNull AbstractC16861ers abstractC16861ers) {
        Intrinsics.checkNotNullParameter(abstractC16861ers, "");
        android.view.View root = abstractC16861ers.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AbstractC16867ery abstractC16867ery = abstractC16861ers.copydefault;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery, "");
        super(root, abstractC16867ery, abstractC16861ers.EZpvd);
        this.EZpvd = abstractC16861ers;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/eKf;)V */
    @Override // o.eKF
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C15493eKj c15493eKj) {
        Intrinsics.checkNotNullParameter(c15493eKj, "");
        super.copydefault(c15493eKj);
        OLrzqt(c15493eKj);
        this.EZpvd.EZpvd(c15493eKj);
    }
}
