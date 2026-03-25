package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC18139fck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18130fcb extends AbstractC59533zio<InterfaceC18139fck.TaskDescription, C18131fcc> {
    public final View.OnClickListener EZpvd;

    public C18130fcb(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.EZpvd = onClickListener;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C18131fcc onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.glVQsU, viewGroup, false);
        Intrinsics.copydefault(viewInflate, "");
        return new C18131fcc((C55173xeu) viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C18131fcc c18131fcc, @NotNull InterfaceC18139fck.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c18131fcc, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C55173xeu c55173xeuCopydefault = c18131fcc.copydefault();
        java.lang.String string = c55173xeuCopydefault.getContext().getString(C13754dXa.FragmentManager.DcMfJKfNLfdT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeuCopydefault.setTitle(string);
        java.lang.String string2 = c55173xeuCopydefault.getContext().getString(C13754dXa.FragmentManager.DcMfJKffREWX);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeuCopydefault.setSubTitle((java.lang.CharSequence) string2);
        c55173xeuCopydefault.setEmptyTypeImage(8);
        java.lang.String string3 = c55173xeuCopydefault.getContext().getString(C13754dXa.FragmentManager.DcMfJKfNUfqk);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeuCopydefault.setRetry(string3);
        c55173xeuCopydefault.setRetryClickListener(this.EZpvd);
    }
}
