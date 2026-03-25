package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18376fhI extends AbstractC59533zio<C18375fhH, RecyclerView.ViewHolder> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull C18375fhH c18375fhH) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(c18375fhH, "");
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setText(C13754dXa.FragmentManager.ResultReceiverMyResultReceiver);
        TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.OHqIaq);
        appCompatTextView.setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.gLWkOL));
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
        Intrinsics.copydefault(context);
        layoutParams.setMarginStart(C55298xhM.OLrzqt(16, context));
        layoutParams.setMarginEnd(C55298xhM.OLrzqt(16, context));
        appCompatTextView.setLayoutParams(layoutParams);
        return new StateListAnimator(appCompatTextView);
    }

    /* JADX INFO: renamed from: o.fhI$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public StateListAnimator(AppCompatTextView appCompatTextView) {
            super(appCompatTextView);
        }
    }
}
