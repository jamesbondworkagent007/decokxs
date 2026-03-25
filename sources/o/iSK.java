package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iSK extends RecyclerView.Adapter<iSZ> {
    public final java.util.List<C24109iVf> EZpvd;
    public final iSN KWHzl;
    public final long OLrzqt;

    public iSK(long j, @NotNull java.util.List<C24109iVf> list, @NotNull iSN isn) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(isn, "");
        this.OLrzqt = j;
        this.EZpvd = list;
        this.KWHzl = isn;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public iSZ onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC23757iIe abstractC23757iIeAEQbTJ = AbstractC23757iIe.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC23757iIeAEQbTJ, "");
        return new iSZ(abstractC23757iIeAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull iSZ isz, @android.annotation.SuppressLint({"RecyclerView"}) int i) {
        Intrinsics.checkNotNullParameter(isz, "");
        final C24109iVf c24109iVf = this.EZpvd.get(i);
        android.widget.TextView textView = isz.copydefault().AEQbTJ;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        java.lang.String strKWHzl = c24109iVf.KWHzl();
        textView.setText(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, strKWHzl == null ? "" : strKWHzl, 6, 2, false, false, 24, null) + " " + c24109iVf.OLrzqt());
        isz.copydefault().copydefault.setText(C27492jwH.formatRatePercent$default(c27492jwH, c24109iVf.AEQbTJ(), false, 2, null));
        isz.copydefault().KWHzl.setText(c24109iVf.AYXKKw());
        long j = this.OLrzqt;
        java.lang.Long lCopydefault = c24109iVf.copydefault();
        if (lCopydefault != null && j == lCopydefault.longValue()) {
            isz.copydefault().AYXKKw.setBackgroundResource(C25493ixk.StateListAnimator.getFieldNames);
        } else {
            isz.copydefault().AYXKKw.setBackgroundResource(C25493ixk.StateListAnimator.iwGUEr);
        }
        isz.copydefault().AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.iSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iSK.AEQbTJ(this.EZpvd, c24109iVf, view);
            }
        });
    }

    public static final void AEQbTJ(iSK isk, C24109iVf c24109iVf, android.view.View view) {
        isk.KWHzl.KWHzl(c24109iVf);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }
}
