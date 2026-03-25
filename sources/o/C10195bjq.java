package o;

import com.okinc.business.defi.assets.detail.biz.BaseItem;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10195bjq extends AbstractC59533zio<BaseItem.TaskDescription, C10197bjs> {
    public final TxIdOrHashHistoryDetail OLrzqt;
    public final C10854bwM copydefault;

    public C10195bjq(TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, C10854bwM c10854bwM) {
        this.OLrzqt = txIdOrHashHistoryDetail;
        this.copydefault = c10854bwM;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C10197bjs onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16986euK abstractC16986euKKWHzl = AbstractC16986euK.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16986euKKWHzl, "");
        return new C10197bjs(abstractC16986euKKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10197bjs c10197bjs, @NotNull BaseItem.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c10197bjs, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c10197bjs.KWHzl(taskDescription, this.OLrzqt, this.copydefault);
    }
}
