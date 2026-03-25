package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.prv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39418prv extends AbstractC59533zio<C39420prx, C39421pry> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C39421pry onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.valueOf, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new C39421pry(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C39421pry c39421pry, @NotNull final C39420prx c39420prx) {
        Intrinsics.checkNotNullParameter(c39421pry, "");
        Intrinsics.checkNotNullParameter(c39420prx, "");
        android.widget.TextView textViewKWHzl = c39421pry.KWHzl();
        if (textViewKWHzl != null) {
            textViewKWHzl.setText(c39420prx.OLrzqt());
        }
        android.widget.TextView textViewGEmmrt = c39421pry.gEmmrt();
        if (textViewGEmmrt != null) {
            textViewGEmmrt.setText(c39420prx.EZpvd());
        }
        C55251xgS c55251xgSAhwBna = c39421pry.AhwBna();
        if (c55251xgSAhwBna != null) {
            c55251xgSAhwBna.setText(c39420prx.AhwBna());
        }
        C55251xgS c55251xgSAhwBna2 = c39421pry.AhwBna();
        if (c55251xgSAhwBna2 != null) {
            c55251xgSAhwBna2.setVisibility(c39420prx.AhwBna().length() == 0 ? 4 : 0);
        }
        android.widget.TextView textViewEZpvd = c39421pry.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setText(c39420prx.copydefault());
        }
        android.widget.TextView textViewOLrzqt = c39421pry.OLrzqt();
        if (textViewOLrzqt != null) {
            textViewOLrzqt.setText(c39420prx.AEQbTJ());
        }
        android.view.View viewCopydefault = c39421pry.copydefault();
        if (viewCopydefault != null) {
            viewCopydefault.setVisibility(c39420prx.AEQbTJ().length() != 0 ? 0 : 4);
        }
        android.widget.Button buttonAEQbTJ = c39421pry.AEQbTJ();
        if (buttonAEQbTJ != null) {
            buttonAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.prz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39418prv.KWHzl(c39420prx, c39421pry, view);
                }
            });
        }
    }

    public static final void KWHzl(C39420prx c39420prx, C39421pry c39421pry, android.view.View view) {
        Function1<android.content.Context, Unit> function1KWHzl = c39420prx.KWHzl();
        android.content.Context context = c39421pry.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        function1KWHzl.invoke(context);
    }
}
