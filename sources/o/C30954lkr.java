package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C30954lkr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lkr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30954lkr extends RecyclerView.Adapter<StateListAnimator> {
    public final java.util.List<C30956lkt> KWHzl;
    public final Function1<C30956lkt, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.lkt, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C30954lkr(@NotNull java.util.List<C30956lkt> list, @NotNull Function1<? super C30956lkt, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = list;
        this.OLrzqt = function1;
    }

    /* JADX INFO: renamed from: o.lkr$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C21584hEu AEQbTJ;
        public final /* synthetic */ C30954lkr OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C30954lkr c30954lkr, C21584hEu c21584hEu) {
            super(c21584hEu.getRoot());
            Intrinsics.checkNotNullParameter(c21584hEu, "");
            this.OLrzqt = c30954lkr;
            this.AEQbTJ = c21584hEu;
        }

        public final void OLrzqt(@NotNull final C30956lkt c30956lkt) {
            Intrinsics.checkNotNullParameter(c30956lkt, "");
            C21584hEu c21584hEu = this.AEQbTJ;
            final C30954lkr c30954lkr = this.OLrzqt;
            c21584hEu.djBIcL.setText(c30956lkt.EZpvd());
            c21584hEu.valueOf.setText(c30956lkt.AYXKKw());
            c21584hEu.EZpvd.setText(c30956lkt.KWHzl());
            android.widget.ImageView imageView = c21584hEu.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.loadImageWithBorder$default(imageView, c30956lkt.AEQbTJ(), null, 2, null);
            android.widget.ImageView imageView2 = c21584hEu.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C25386ivj.loadImageWithBorder$default(imageView2, c30956lkt.copydefault(), null, 2, null);
            this.AEQbTJ.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lkq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30954lkr.StateListAnimator.OLrzqt(c30954lkr, c30956lkt, view);
                }
            });
        }

        public static final void OLrzqt(C30954lkr c30954lkr, C30956lkt c30956lkt, android.view.View view) {
            c30954lkr.OLrzqt.invoke(c30956lkt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21584hEu c21584hEuCopydefault = C21584hEu.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21584hEuCopydefault, "");
        return new StateListAnimator(this, c21584hEuCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.OLrzqt(this.KWHzl.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }
}
