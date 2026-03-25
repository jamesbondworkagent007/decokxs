package o;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oII extends RecyclerView.Adapter<oIP> {
    public java.util.List<java.lang.String> EZpvd;
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public oII(@NotNull java.util.List<java.lang.String> list, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = list;
        this.copydefault = function1;
    }

    public final void copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new oIM(this.EZpvd, list));
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
        this.EZpvd = list;
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public oIP onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.widget.ImageView imageView = (android.widget.ImageView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35399nuc.Dialog.alsFma, viewGroup, false).findViewById(C35399nuc.StateListAnimator.aVhqwO);
        Intrinsics.copydefault(imageView);
        return new oIP(imageView, this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull oIP oip, int i) {
        Intrinsics.checkNotNullParameter(oip, "");
        oip.OLrzqt(this.EZpvd.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }
}
