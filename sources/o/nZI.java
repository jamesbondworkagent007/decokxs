package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nZI extends AbstractC35894oHq<nZM, Application> {
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull nZM nzm, @NotNull nZM nzm2) {
        Intrinsics.checkNotNullParameter(nzm, "");
        Intrinsics.checkNotNullParameter(nzm2, "");
        return Intrinsics.EZpvd((java.lang.Object) nzm.AhwBna(), (java.lang.Object) nzm2.AhwBna());
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC35894oHq
    /* JADX INFO: renamed from: OLrzqt, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull nZM nzm, @NotNull nZM nzm2) {
        Intrinsics.checkNotNullParameter(nzm, "");
        Intrinsics.checkNotNullParameter(nzm2, "");
        return Intrinsics.EZpvd((java.lang.Object) nzm.AhwBna(), (java.lang.Object) nzm2.AhwBna()) && nzm.gEmmrt() == nzm2.gEmmrt();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nND nndEZpvd = nND.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nndEZpvd, "");
        return new Application(this, nndEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        nZM nzm = KWHzl().getCurrentList().get(i);
        Intrinsics.copydefault(nzm, "");
        application.KWHzl(nzm);
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ nZI EZpvd;
        public final nND OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull nZI nzi, nND nnd) {
            super(nnd.getRoot());
            Intrinsics.checkNotNullParameter(nnd, "");
            this.EZpvd = nzi;
            this.OLrzqt = nnd;
        }

        public final void KWHzl(@NotNull nZM nzm) {
            Intrinsics.checkNotNullParameter(nzm, "");
            nND nnd = this.OLrzqt;
            nnd.valueOf.setText(nZL.KWHzl(nzm));
            android.widget.TextView textView = nnd.AhwBna;
            java.lang.String strEZpvd = nZL.EZpvd(nzm);
            android.text.SpannableString spannableString = new android.text.SpannableString(strEZpvd);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(nZL.AEQbTJ(nzm))), 0, strEZpvd.length(), 17);
            Intrinsics.copydefault(textView);
            textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd) ^ true ? 0 : 8);
            textView.setText(spannableString);
            C35893oHp c35893oHp = nnd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            java.lang.String localizedWithMinPrecision$default = null;
            C35891oHn.OLrzqt(c35893oHp, nzm.OLrzqt(), null, C33129mqd.gEmmrt(nzm.KWHzl()));
            nnd.EZpvd.setText(nzm.KWHzl());
            android.widget.TextView textView2 = nnd.djBIcL;
            java.lang.String strCopydefault = nZL.copydefault(nzm);
            java.lang.String strCopydefault2 = nzm.copydefault();
            if (strCopydefault2 != null) {
                java.lang.Integer numAEQbTJ = nzm.AEQbTJ();
                localizedWithMinPrecision$default = pTB.formatLocalizedWithMinPrecision$default(strCopydefault2, numAEQbTJ != null ? numAEQbTJ.intValue() : 2, null, 2, null);
            }
            textView2.setText(strCopydefault + localizedWithMinPrecision$default + " " + nzm.EZpvd());
        }
    }
}
