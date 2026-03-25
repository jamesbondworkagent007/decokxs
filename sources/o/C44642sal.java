package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC44644san;
import o.rXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sal, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44642sal extends AbstractC42594rYq<InterfaceC44644san, rYI> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC42594rYq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public rYI KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        rYI ryiKWHzl = rYI.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ryiKWHzl, "");
        return ryiKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC42594rYq<InterfaceC44644san, rYI>.StateListAnimator<rYI> stateListAnimator, @NotNull InterfaceC44644san interfaceC44644san) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(interfaceC44644san, "");
        rYI ryi = (rYI) stateListAnimator.AEQbTJ();
        android.widget.TextView textView = ryi.copydefault;
        if (Intrinsics.EZpvd(interfaceC44644san, InterfaceC44644san.Application.KWHzl)) {
            string = ryi.copydefault.getContext().getString(rXV.TaskDescription.DbNXlk);
        } else if (Intrinsics.EZpvd(interfaceC44644san, InterfaceC44644san.TaskDescription.OLrzqt)) {
            string = ryi.copydefault.getContext().getString(rXV.TaskDescription.isConnected);
        } else {
            if (!Intrinsics.EZpvd(interfaceC44644san, InterfaceC44644san.StateListAnimator.OLrzqt)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ryi.copydefault.getContext().getString(rXV.TaskDescription.fetchVPNInfo);
        }
        textView.setText(string);
    }
}
