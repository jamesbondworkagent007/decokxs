package o;

import com.okinc.market.common.biz_spot.Members;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.piN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38909piN extends AbstractC59533zio<Members, C38912piQ> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C38912piQ onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DXXBbs, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C38912piQ(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C38912piQ c38912piQ, @NotNull Members members) {
        Intrinsics.checkNotNullParameter(c38912piQ, "");
        Intrinsics.checkNotNullParameter(members, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) members.getHeadImage())) {
            c38912piQ.KWHzl().setVisibility(0);
            C33054mpH.KWHzl(c38912piQ.KWHzl(), members.getHeadImage());
        } else {
            c38912piQ.KWHzl().setVisibility(8);
        }
        c38912piQ.AEQbTJ().setText(members.getName());
        c38912piQ.copydefault().setText(members.getPosition());
        c38912piQ.OLrzqt().setText(members.getIntroduce());
    }
}
