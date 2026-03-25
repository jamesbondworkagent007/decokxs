package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kJB extends AbstractC59533zio<C27622jyf, Activity> {
    public final Function1<android.view.View, Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public long getItemId(@NotNull C27622jyf c27622jyf) {
        Intrinsics.checkNotNullParameter(c27622jyf, "");
        return -912145285;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public kJB(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    public static final class Activity extends RecyclerView.ViewHolder implements InterfaceC46795tds {
        @Override // o.InterfaceC46795tds
        public boolean AEQbTJ() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.OHqIaq, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Activity(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C27622jyf c27622jyf) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c27622jyf, "");
        activity.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.kJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                kJB.OLrzqt(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(kJB kjb, android.view.View view) {
        Function1<android.view.View, Unit> function1 = kjb.EZpvd;
        Intrinsics.copydefault(view);
        function1.invoke(view);
    }
}
