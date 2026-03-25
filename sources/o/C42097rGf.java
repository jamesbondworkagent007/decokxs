package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C42095rGd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rGf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42097rGf extends AbstractC59533zio<C42095rGd.TaskDescription.Activity, ActionBar> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C43830rwg c43830rwgOLrzqt = C43830rwg.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c43830rwgOLrzqt, "");
        return new ActionBar(c43830rwgOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull C42095rGd.TaskDescription.Activity activity) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(activity, "");
        actionBar.copydefault(activity.EZpvd().copydefault());
    }

    /* JADX INFO: renamed from: o.rGf$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C43830rwg AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C43830rwg c43830rwg) {
            super(c43830rwg.getRoot());
            Intrinsics.checkNotNullParameter(c43830rwg, "");
            this.AEQbTJ = c43830rwg;
        }

        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.getRoot().setText(str);
        }
    }
}
