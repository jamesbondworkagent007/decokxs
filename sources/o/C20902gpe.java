package o;

import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.SendAddressReminderBean;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gpe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20902gpe extends AbstractC59533zio<SendAddressReminderBean, C20901gpd> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C20901gpd onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.GFUIi, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C20901gpd(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C20901gpd c20901gpd, @NotNull SendAddressReminderBean sendAddressReminderBean) {
        Intrinsics.checkNotNullParameter(c20901gpd, "");
        Intrinsics.checkNotNullParameter(sendAddressReminderBean, "");
        OKReminder oKReminderEZpvd = c20901gpd.EZpvd();
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(sendAddressReminderBean.getDisabledWalletSize()), 0)) {
            oKReminderEZpvd.setVisibility(0);
            android.content.Context context = oKReminderEZpvd.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            oKReminderEZpvd.setMessage(pTD.EZpvd(context, C13754dXa.Dialog.isConnected, sendAddressReminderBean.getDisabledWalletSize(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(sendAddressReminderBean.getDisabledWalletSize())))));
        } else {
            oKReminderEZpvd.setVisibility(8);
        }
        oKReminderEZpvd.setStyle(0);
        oKReminderEZpvd.setCloseIconVisibility(false);
    }
}
