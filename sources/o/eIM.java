package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eIM extends AbstractC59533zio<C15497eKn, RecyclerView.ViewHolder> {
    public final Function1<java.util.Map<java.lang.String, java.lang.String>, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.String>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public eIM(@NotNull Function1<? super java.util.Map<java.lang.String, java.lang.String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        public Activity(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new Activity(layoutInflater.inflate(C13754dXa.TaskDescription.FF, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull final C15497eKn c15497eKn) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(c15497eKn, "");
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.eIK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eIM.OLrzqt(this.EZpvd, c15497eKn, view);
            }
        });
    }

    public static final void OLrzqt(eIM eim, C15497eKn c15497eKn, android.view.View view) {
        eim.copydefault.invoke(c15497eKn.getFieldNames());
    }
}
