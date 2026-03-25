package o;

import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jFO extends RecyclerView.Adapter<TaskDescription> {
    public final Function1<C25780jGb, Unit> AEQbTJ;
    public final long OLrzqt;
    public final java.util.List<C25780jGb> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.jGb, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jFO(@NotNull java.util.List<C25780jGb> list, long j, Function1<? super C25780jGb, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.OLrzqt = j;
        this.AEQbTJ = function1;
    }

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final /* synthetic */ jFO EZpvd;
        public final C21628hGk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21628hGk AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull jFO jfo, C21628hGk c21628hGk) {
            super(c21628hGk.getRoot());
            Intrinsics.checkNotNullParameter(c21628hGk, "");
            this.EZpvd = jfo;
            this.OLrzqt = c21628hGk;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21628hGk c21628hGkOLrzqt = C21628hGk.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21628hGkOLrzqt, "");
        return new TaskDescription(this, c21628hGkOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        final C25780jGb c25780jGb = this.copydefault.get(taskDescription.getBindingAdapterPosition());
        C21628hGk c21628hGkAEQbTJ = taskDescription.AEQbTJ();
        OKRegularCell oKRegularCell = c21628hGkAEQbTJ.AEQbTJ;
        oKRegularCell.setTitle(c25780jGb.AEQbTJ());
        oKRegularCell.EZpvd().setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(oKRegularCell.getContext(), C52761wXj.Dialog.valueOf), 0));
        oKRegularCell.EZpvd().setTextSize(16.0f);
        c21628hGkAEQbTJ.KWHzl.setVisibility(c25780jGb.copydefault() != this.OLrzqt ? 8 : 0);
        c21628hGkAEQbTJ.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jFM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jFO.KWHzl(this.KWHzl, c25780jGb, view);
            }
        });
    }

    public static final void KWHzl(jFO jfo, C25780jGb c25780jGb, android.view.View view) {
        Function1<C25780jGb, Unit> function1 = jfo.AEQbTJ;
        if (function1 != null) {
            function1.invoke(c25780jGb);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }
}
