package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eKJ extends eKF<C15491eKh> {
    public final AbstractC16861ers OLrzqt;

    /* JADX WARN: Illegal instructions before constructor call */
    public eKJ(@NotNull AbstractC16861ers abstractC16861ers) {
        Intrinsics.checkNotNullParameter(abstractC16861ers, "");
        android.view.View root = abstractC16861ers.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AbstractC16867ery abstractC16867ery = abstractC16861ers.copydefault;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery, "");
        super(root, abstractC16867ery, abstractC16861ers.EZpvd);
        this.OLrzqt = abstractC16861ers;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/eKf;)V */
    @Override // o.eKF
    public void copydefault(@NotNull C15491eKh c15491eKh) {
        Intrinsics.checkNotNullParameter(c15491eKh, "");
        super.copydefault(c15491eKh);
        this.OLrzqt.EZpvd(c15491eKh);
        OLrzqt(c15491eKh);
    }
}
