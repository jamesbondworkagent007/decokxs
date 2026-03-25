package o;

import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eKO extends eKF<C15494eKk> {
    public final AbstractC16861ers OLrzqt;

    /* JADX WARN: Illegal instructions before constructor call */
    public eKO(@NotNull AbstractC16861ers abstractC16861ers) {
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
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C15494eKk c15494eKk) {
        Intrinsics.checkNotNullParameter(c15494eKk, "");
        super.copydefault(c15494eKk);
        this.OLrzqt.EZpvd(c15494eKk);
        if (!C15487eKd.AEQbTJ.EZpvd(c15494eKk.AuCTel().getTxType()) && c15494eKk.AuCTel().getTxType() != 80) {
            OLrzqt(c15494eKk);
        } else {
            this.OLrzqt.EZpvd.AhwBna.setVisibility(8);
            this.OLrzqt.EZpvd.valueOf.setVisibility(8);
            C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(this.OLrzqt.EZpvd.djBIcL).EZpvd((c15494eKk.AuCTel().getTxType() == 27 && Intrinsics.EZpvd(c15494eKk.AuCTel().getApprovalForAllListFlag(), java.lang.Boolean.TRUE)) ? null : c15494eKk.AuCTel().getContractIcon());
            android.content.Context context = this.itemView.getContext();
            int i = C52761wXj.Activity.invokespecialDPHOMC;
            android.content.Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C5335Nt c5335NtEZpvd2 = c5335NtEZpvd.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(context, 0.5f, C33070mpX.OLrzqt(i, context2), false, 8, null));
            C5448Sc c5448Sc = new C5448Sc();
            android.content.Context context3 = this.itemView.getContext();
            eKR ekr = eKR.OLrzqt;
            c5448Sc.AEQbTJ(context3.getDrawable(eKR.getPlaceholder$default(ekr, c15494eKk, null, 2, null)));
            c5448Sc.EZpvd(this.itemView.getContext().getDrawable(eKR.getPlaceholder$default(ekr, c15494eKk, null, 2, null)));
            c5448Sc.OLrzqt(this.itemView.getContext().getDrawable(eKR.getPlaceholder$default(ekr, c15494eKk, null, 2, null)));
            Intrinsics.copydefault(c5335NtEZpvd2.OLrzqt((RX<?>) c5448Sc).EZpvd(this.OLrzqt.EZpvd.djBIcL));
        }
        EZpvd(OLrzqt());
    }
}
