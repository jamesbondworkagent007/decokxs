package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eKZ extends eKF<C15488eKe> {
    public final AbstractC16858erp EZpvd;

    /* JADX WARN: Illegal instructions before constructor call */
    public eKZ(@NotNull AbstractC16858erp abstractC16858erp) {
        Intrinsics.checkNotNullParameter(abstractC16858erp, "");
        android.view.View root = abstractC16858erp.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AbstractC16867ery abstractC16867ery = abstractC16858erp.valueOf;
        Intrinsics.checkNotNullExpressionValue(abstractC16867ery, "");
        super(root, abstractC16867ery, null);
        this.EZpvd = abstractC16858erp;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/eKf;)V */
    @Override // o.eKF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C15488eKe c15488eKe) {
        Intrinsics.checkNotNullParameter(c15488eKe, "");
        this.EZpvd.EZpvd(c15488eKe);
        this.EZpvd.executePendingBindings();
    }
}
