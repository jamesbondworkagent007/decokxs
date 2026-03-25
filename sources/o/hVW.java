package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.OrderDetailDefiPlatformInfo;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class hVW extends AbstractC59533zio<hUY, TaskDescription> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21471hAp c21471hApAEQbTJ = C21471hAp.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21471hApAEQbTJ, "");
        return new TaskDescription(c21471hApAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull hUY huy) {
        java.lang.String percent$default;
        java.lang.String name;
        java.lang.String logo;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(huy, "");
        android.content.Context context = taskDescription.itemView.getContext();
        java.lang.String strCopydefault = huy.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_CREATE_TIME.getValue())) {
            hWN hwn = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn, "");
            EZpvd(hwn, C33070mpX.AYXKKw(C23274hvD.Fragment.startIntentSenderForResult), pTA.format$default(new Date(C33129mqd.valueOf(huy.KWHzl().getTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), "web3_dex_history_date_cell");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_TYPE.getValue())) {
            hWN hwn2 = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn2, "");
            EZpvd(hwn2, C33070mpX.AYXKKw(C23274hvD.Fragment.UkCIYP), C25352ivB.KWHzl(huy.KWHzl().getSwapTradeType(), huy.KWHzl().getTradeMode()), "web3_dex_history_txnType_cell");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_FACET_WITHDRAW_TYPE.getValue())) {
            hWN hwn3 = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn3, "");
            setCommonTitleAndValue$default(this, hwn3, C33070mpX.AYXKKw(C23274hvD.Fragment.RTWSvT), C33070mpX.AYXKKw(C23274hvD.Fragment.RvdRAu), null, 8, null);
            return;
        }
        percent$default = "--";
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_TIME.getValue())) {
            if (Intrinsics.EZpvd((java.lang.Object) huy.KWHzl().getStatus(), (java.lang.Object) "1") && huy.KWHzl().getOrderCompletionTime().length() > 0) {
                percent$default = C23311hvo.KWHzl(C33129mqd.AhwBna(C23313hvq.divCheckS$default(C23311hvo.copydefault(C23313hvq.subCheckS$default(huy.KWHzl().getOrderCompletionTime(), huy.KWHzl().getTime(), null, null, null, 14, null)), 1000, null, null, null, 14, null)), true);
            }
            hWN hwn4 = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn4, "");
            EZpvd(hwn4, C33070mpX.AYXKKw(C23274hvD.Fragment.compare), percent$default, "web3_dex_history_duration_cell");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_MEV.getValue())) {
            hWN hwn5 = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn5, "");
            setCommonTitleAndValue$default(this, hwn5, C33070mpX.AYXKKw(C23274hvD.Fragment.get), huy.KWHzl().getMevInfo(), null, 8, null);
            taskDescription.copydefault().copydefault.setCommonValueStartIcon(huy.KWHzl().getFromChainLogoUrl(), C57406yhn.Activity.QKVWgx);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SLIPPAGE.getValue())) {
            if (Intrinsics.EZpvd((java.lang.Object) huy.KWHzl().getStatus(), (java.lang.Object) "1")) {
                java.lang.String totalSlippage = huy.KWHzl().getTotalSlippage();
                if (totalSlippage.length() == 0) {
                    totalSlippage = huy.KWHzl().getSlippageValue();
                }
                java.lang.String str2 = totalSlippage;
                if (str2.length() != 0) {
                    if (C23313hvq.valueOf(str2, "0")) {
                        percent$default = C23311hvo.formatPercent$default("0", false, 0, 0, null, null, 31, null);
                    } else {
                        percent$default = C23311hvo.formatPercent$default(str2, false, 2, 0, RoundingMode.HALF_UP, null, 21, null);
                    }
                }
            }
            hWN hwn6 = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn6, "");
            EZpvd(hwn6, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatApi23Builder), percent$default, "web3_dex_history_slippage_cell");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_DE_FI_PLATFORM.getValue())) {
            hWN hwn7 = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn7, "");
            java.lang.String string = context.getString(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase);
            Intrinsics.checkNotNullExpressionValue(string, "");
            OrderDetailDefiPlatformInfo defiPlatformInfo = huy.KWHzl().getDefiPlatformInfo();
            if (defiPlatformInfo == null || (name = defiPlatformInfo.getName()) == null) {
                name = "";
            }
            EZpvd(hwn7, string, name, "web3_dex_history_singleChainProviderName_cell");
            hWN hwn8 = taskDescription.copydefault().copydefault;
            OrderDetailDefiPlatformInfo defiPlatformInfo2 = huy.KWHzl().getDefiPlatformInfo();
            if (defiPlatformInfo2 != null && (logo = defiPlatformInfo2.getLogo()) != null) {
                str = logo;
            }
            hwn8.setCommonValueStartIcon(str, C52761wXj.TaskDescription.gasjUx);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_ORDER_TYPE.getValue())) {
            hWN hwn9 = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn9, "");
            java.lang.String string2 = context.getString(C23274hvD.Fragment.equals);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            android.content.Context context2 = taskDescription.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            EZpvd(hwn9, string2, C25352ivB.KWHzl(context2, huy.KWHzl().getSwapTradeType(), huy.KWHzl().getOrderType()), "web3_dex_history_orderType_cell");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_TRANSACTION_TYPE.getValue())) {
            hWN hwn10 = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn10, "");
            java.lang.String string3 = context.getString(C23274hvD.Fragment.setSessionToken2Bundle);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            java.lang.String transactionTypeMultiLanguage = huy.KWHzl().getTransactionTypeMultiLanguage();
            EZpvd(hwn10, string3, transactionTypeMultiLanguage.length() != 0 ? transactionTypeMultiLanguage : "--", "web3_dex_history_transactionType_cell");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_APPROVE_METHOD.getValue())) {
            hWN hwn11 = taskDescription.copydefault().copydefault;
            Intrinsics.checkNotNullExpressionValue(hwn11, "");
            java.lang.String string4 = context.getString(C23274hvD.Fragment.OTJFaA);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            java.lang.String approveMethod = huy.KWHzl().getApproveMethod();
            EZpvd(hwn11, string4, approveMethod.length() != 0 ? approveMethod : "--", "web3_dex_history_approveMethod_cell");
        }
    }

    public static /* synthetic */ void setCommonTitleAndValue$default(hVW hvw, hWN hwn, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        hvw.EZpvd(hwn, str, str2, str3);
    }

    public final void EZpvd(hWN hwn, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        hwn.setContentDescription(str3);
        hwn.setCommonTitle(str);
        hwn.setCommonValue(str2);
        hwn.KWHzl();
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C21471hAp AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21471hAp copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C21471hAp c21471hAp) {
            super(c21471hAp.getRoot());
            Intrinsics.checkNotNullParameter(c21471hAp, "");
            this.AEQbTJ = c21471hAp;
        }
    }
}
