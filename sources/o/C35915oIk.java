package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.widgets.bottomsheet.model.ReactionTab;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oIk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35915oIk extends RecyclerView.Adapter<StateListAnimator> {
    public final Function1<java.lang.String, Unit> KWHzl;
    public java.util.List<ReactionTab> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C35915oIk(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
        this.copydefault = yDY.AhwBna();
    }

    public final void AEQbTJ(@NotNull java.util.List<ReactionTab> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C33919nKs c33919nKsKWHzl = C33919nKs.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c33919nKsKWHzl, "");
        return new StateListAnimator(c33919nKsKWHzl, this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.KWHzl(this.copydefault.get(i));
    }

    /* JADX INFO: renamed from: o.oIk$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C35910oIf copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C33919nKs c33919nKs, @NotNull Function1<? super java.lang.String, Unit> function1) {
            super(c33919nKs.getRoot());
            Intrinsics.checkNotNullParameter(c33919nKs, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C35910oIf c35910oIf = new C35910oIf(function1);
            this.copydefault = c35910oIf;
            RecyclerView recyclerView = c33919nKs.AEQbTJ;
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutAnimation(null);
            recyclerView.setAdapter(c35910oIf);
        }

        public final void KWHzl(@NotNull ReactionTab reactionTab) {
            Intrinsics.checkNotNullParameter(reactionTab, "");
            this.copydefault.submitList(reactionTab.EZpvd());
        }
    }
}
