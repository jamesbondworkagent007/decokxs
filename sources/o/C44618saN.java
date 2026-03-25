package o;

import kotlin.jvm.internal.Intrinsics;
import o.rXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.saN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44618saN extends AbstractC42594rYq<C44617saM, rYJ> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC42594rYq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public rYJ KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        rYJ ryjOLrzqt = rYJ.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ryjOLrzqt, "");
        return ryjOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC42594rYq<C44617saM, rYJ>.StateListAnimator<rYJ> stateListAnimator, @NotNull C44617saM c44617saM) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(c44617saM, "");
        ((rYJ) stateListAnimator.AEQbTJ()).AEQbTJ.setTextSize(14.0f);
        ((rYJ) stateListAnimator.AEQbTJ()).AEQbTJ.setText(Intrinsics.EZpvd((java.lang.Object) c44617saM.EZpvd(), (java.lang.Object) C44617saM.Companion.copydefault().EZpvd()) ? C33070mpX.AYXKKw(rXV.TaskDescription.EZpvd) : c44617saM.EZpvd());
    }
}
