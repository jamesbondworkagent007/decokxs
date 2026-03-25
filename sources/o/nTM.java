package o;

import com.okinc.im.imui.group.join.model.JoinGroupDisplayModel;
import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import com.okinc.okimcore.model.im.group.GroupApplicationType;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus;
import com.okinc.okimcore.model.im.group.TransactionStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nTM {
    public static final boolean gEmmrt(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
        Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
        GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfoKWHzl = joinGroupDisplayModel.KWHzl();
        return (groupEntryAssetVerificationInfoKWHzl != null ? groupEntryAssetVerificationInfoKWHzl.getAssetVerificationStatus() : null) == GroupEntryAssetsVerificationStatus.ENABLED;
    }

    public static final boolean KWHzl(JoinGroupDisplayModel joinGroupDisplayModel) {
        return joinGroupDisplayModel.EZpvd() == GroupApplicationType.ADMIN_APPROVAL;
    }

    public static final boolean copydefault(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
        Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
        return KWHzl(joinGroupDisplayModel) && joinGroupDisplayModel.AEQbTJ() == GroupApplicationStatus.PENDING;
    }

    public static final boolean AhwBna(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
        Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
        return KWHzl(joinGroupDisplayModel) && joinGroupDisplayModel.AEQbTJ() != GroupApplicationStatus.APPROVED;
    }

    public static final boolean valueOf(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
        Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
        return joinGroupDisplayModel.gEmmrt() == GroupTagType.PAID_GROUP;
    }

    public static final GroupBillingType AEQbTJ(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
        GroupEntryBillingModel billingModel;
        Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
        GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreviewIsConnected = joinGroupDisplayModel.isConnected();
        if (paidGroupPreviewIsConnected == null || (billingModel = paidGroupPreviewIsConnected.getBillingModel()) == null) {
            return null;
        }
        return billingModel.getBillingType();
    }

    public static final boolean djBIcL(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
        Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
        GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreviewIsConnected = joinGroupDisplayModel.isConnected();
        return (paidGroupPreviewIsConnected != null ? paidGroupPreviewIsConnected.getPaymentRequiredStatus() : null) == PaymentRequiredStatus.REQUIRED;
    }

    public static final java.lang.String OLrzqt(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
        GroupEntryBillingModel billingModel;
        Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
        GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreviewIsConnected = joinGroupDisplayModel.isConnected();
        java.lang.String currencySign = (paidGroupPreviewIsConnected == null || (billingModel = paidGroupPreviewIsConnected.getBillingModel()) == null) ? null : billingModel.getCurrencySign();
        return currencySign == null ? "" : currencySign;
    }

    public static final java.lang.String EZpvd(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
        GroupEntryBillingModel billingModel;
        Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
        GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreviewIsConnected = joinGroupDisplayModel.isConnected();
        java.lang.String amount = (paidGroupPreviewIsConnected == null || (billingModel = paidGroupPreviewIsConnected.getBillingModel()) == null) ? null : billingModel.getAmount();
        return amount == null ? "" : amount;
    }

    public static final TransactionStatus AYXKKw(@NotNull JoinGroupDisplayModel joinGroupDisplayModel) {
        TransactionStatus transactionStatus;
        Intrinsics.checkNotNullParameter(joinGroupDisplayModel, "");
        GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreviewIsConnected = joinGroupDisplayModel.isConnected();
        return (paidGroupPreviewIsConnected == null || (transactionStatus = paidGroupPreviewIsConnected.getTransactionStatus()) == null) ? TransactionStatus.NONE : transactionStatus;
    }
}
