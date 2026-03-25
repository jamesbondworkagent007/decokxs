package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.feT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18228feT extends AbstractC59533zio<java.lang.String, ActionBar> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        c55173xeu.setEmptyTypeImage(7);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C33052mpF.dp2px$default(96.0f, null, 1, null);
        c55173xeu.setLayoutParams(layoutParams);
        return new ActionBar(this, c55173xeu);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.view.View view = actionBar.itemView;
        Intrinsics.copydefault(view, "");
        ((C55173xeu) view).setSubTitle((java.lang.CharSequence) str);
    }

    /* JADX INFO: renamed from: o.feT$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final /* synthetic */ C18228feT EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C18228feT c18228feT, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = c18228feT;
        }
    }
}
