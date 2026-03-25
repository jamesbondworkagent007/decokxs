package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eGh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C15383eGh extends AbstractC59533zio<eFL, RecyclerView.ViewHolder> {
    public final Function1<eFL, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.eFL, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C15383eGh(@NotNull Function1<? super eFL, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX INFO: renamed from: o.eGh$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public ActionBar(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new ActionBar(layoutInflater.inflate(C13754dXa.TaskDescription.UfveVb, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull final eFL efl) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(efl, "");
        ((android.widget.ImageView) viewHolder.itemView.findViewById(C13754dXa.ActionBar.SaJVGb)).setImageResource(efl.EZpvd());
        ((android.widget.TextView) viewHolder.itemView.findViewById(C13754dXa.ActionBar.PipHintTrackerKttrackPipAnimationHintView2)).setText(efl.copydefault());
        C8003auW.copydefault(viewHolder.itemView).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.eGg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15383eGh.copydefault(this.AEQbTJ, efl, obj);
            }
        });
    }

    public static final void copydefault(C15383eGh c15383eGh, eFL efl, java.lang.Object obj) {
        c15383eGh.EZpvd.invoke(efl);
    }
}
