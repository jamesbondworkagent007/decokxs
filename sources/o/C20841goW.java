package o;

import com.okinc.business.defi.wallet.mine.data.WalletAddressEmpty;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20841goW extends AbstractC59533zio<WalletAddressEmpty, C20844goZ> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C20844goZ onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.dlRikr, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C20844goZ(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C20844goZ c20844goZ, @NotNull WalletAddressEmpty walletAddressEmpty) {
        Intrinsics.checkNotNullParameter(c20844goZ, "");
        Intrinsics.checkNotNullParameter(walletAddressEmpty, "");
        C55173xeu c55173xeuOLrzqt = c20844goZ.OLrzqt();
        android.content.Context context = c20844goZ.OLrzqt().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55173xeuOLrzqt.setSubTitle((java.lang.CharSequence) pTD.KWHzl(context, C13754dXa.FragmentManager.ReportDrawnWhen, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("network", walletAddressEmpty.getNetwork()))));
        c20844goZ.OLrzqt().setEmptyTypeImage(7);
    }
}
