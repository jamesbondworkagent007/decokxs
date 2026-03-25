package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C24478ieb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ieb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24478ieb extends RecyclerView.Adapter<StateListAnimator> {
    public final Function1<PoolInfo, Unit> KWHzl;
    public final java.util.List<PoolInfo> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C24478ieb(@NotNull java.util.List<PoolInfo> list, @NotNull Function1<? super PoolInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = list;
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hBA hbaAEQbTJ = hBA.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hbaAEQbTJ, "");
        return new StateListAnimator(this, hbaAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.EZpvd(this.copydefault.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    /* JADX INFO: renamed from: o.ieb$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final hBA KWHzl;
        public final /* synthetic */ C24478ieb copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C24478ieb c24478ieb, hBA hba) {
            super(hba.getRoot());
            Intrinsics.checkNotNullParameter(hba, "");
            this.copydefault = c24478ieb;
            this.KWHzl = hba;
        }

        public final void EZpvd(@NotNull final PoolInfo poolInfo) {
            Intrinsics.checkNotNullParameter(poolInfo, "");
            this.KWHzl.copydefault.setText(poolInfo.getDexName());
            this.KWHzl.KWHzl.setText(C23311hvo.formatPercent$default(poolInfo.getPercent(), false, 0, 0, null, null, 30, null));
            android.widget.ImageView imageView = this.KWHzl.EZpvd;
            final C24478ieb c24478ieb = this.copydefault;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.iec
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24478ieb.StateListAnimator.KWHzl(c24478ieb, poolInfo, view);
                }
            });
        }

        public static final void KWHzl(C24478ieb c24478ieb, PoolInfo poolInfo, android.view.View view) {
            c24478ieb.KWHzl.invoke(poolInfo);
        }
    }
}
