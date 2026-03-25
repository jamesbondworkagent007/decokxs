package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iST extends RecyclerView.Adapter<C24052iTc> {
    public final long EZpvd;
    public final iSW KWHzl;
    public final java.util.List<C24109iVf> copydefault;

    public iST(long j, @NotNull java.util.List<C24109iVf> list, @NotNull iSW isw) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(isw, "");
        this.EZpvd = j;
        this.copydefault = list;
        this.KWHzl = isw;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C24052iTc onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC23846iLm abstractC23846iLmKWHzl = AbstractC23846iLm.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC23846iLmKWHzl, "");
        return new C24052iTc(abstractC23846iLmKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C24052iTc c24052iTc, @android.annotation.SuppressLint({"RecyclerView"}) int i) {
        Intrinsics.checkNotNullParameter(c24052iTc, "");
        final C24109iVf c24109iVf = this.copydefault.get(i);
        android.widget.TextView textView = c24052iTc.EZpvd().gEmmrt;
        java.lang.String strKWHzl = c24109iVf.KWHzl();
        java.lang.String strLimitFmtNoZeroWithKMB$default = strKWHzl != null ? C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, strKWHzl, 0, 0, false, false, 30, null) : null;
        textView.setText(strLimitFmtNoZeroWithKMB$default + " " + c24109iVf.OLrzqt());
        c24052iTc.EZpvd().KWHzl.setText(C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, c24109iVf.AEQbTJ(), false, 2, null));
        c24052iTc.EZpvd().AYXKKw.setText(c24109iVf.AYXKKw());
        c24052iTc.EZpvd().copydefault.setText(c24109iVf.EZpvd() + " " + c24109iVf.OLrzqt());
        java.lang.Long lCopydefault = c24109iVf.copydefault();
        long j = this.EZpvd;
        if (lCopydefault != null && lCopydefault.longValue() == j) {
            c24052iTc.EZpvd().valueOf.setBackgroundResource(C25493ixk.StateListAnimator.getFieldNames);
        } else {
            c24052iTc.EZpvd().valueOf.setBackgroundResource(C25493ixk.StateListAnimator.iwGUEr);
        }
        c24052iTc.EZpvd().valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.iSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iST.AEQbTJ(this.OLrzqt, c24109iVf, view);
            }
        });
    }

    public static final void AEQbTJ(iST ist, C24109iVf c24109iVf, android.view.View view) {
        ist.KWHzl.KWHzl(c24109iVf);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }
}
