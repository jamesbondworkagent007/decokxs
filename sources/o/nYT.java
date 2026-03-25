package o;

import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.RequireAdminApprovalToJoin;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYT extends AbstractC34300nYw<RequireAdminApprovalToJoin> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<RequireAdminApprovalToJoin> KWHzl() {
        return RequireAdminApprovalToJoin.class;
    }

    @Override // o.AbstractC34300nYw
    public /* bridge */ /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        AEQbTJ((oGY<nLO>) ogy, c35254nrp, (RequireAdminApprovalToJoin) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull RequireAdminApprovalToJoin requireAdminApprovalToJoin, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(requireAdminApprovalToJoin, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return OLrzqt(requireAdminApprovalToJoin);
    }

    public void AEQbTJ(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull RequireAdminApprovalToJoin requireAdminApprovalToJoin) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(requireAdminApprovalToJoin, "");
        super.AEQbTJ(ogy, c35254nrp, requireAdminApprovalToJoin);
        ((nLO) ogy.copydefault()).copydefault.setText(OLrzqt(requireAdminApprovalToJoin));
    }

    public final java.lang.CharSequence OLrzqt(RequireAdminApprovalToJoin requireAdminApprovalToJoin) {
        java.lang.String operatorId;
        GroupSystemMessageInfo notifyInfo = requireAdminApprovalToJoin.getNotifyInfo();
        if (notifyInfo == null || (operatorId = notifyInfo.getOperatorId()) == null || !C44157sFk.KWHzl(operatorId)) {
            operatorId = null;
        }
        boolean z = operatorId != null;
        if (z && requireAdminApprovalToJoin.isEnabled()) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.RLmrWm);
        }
        if (z && !requireAdminApprovalToJoin.isEnabled()) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.gAnGwV);
        }
        if (requireAdminApprovalToJoin.isEnabled()) {
            return C33069mpW.copydefault(C35399nuc.LoaderManager.RFmUsE, C56423yEv.EZpvd(C56390yDp.OLrzqt("userName", C37683oyU.AEQbTJ(requireAdminApprovalToJoin.getNotifyInfo()))));
        }
        return C33069mpW.copydefault(C35399nuc.LoaderManager.drbYRJ, C56423yEv.EZpvd(C56390yDp.OLrzqt("userName", C37683oyU.AEQbTJ(requireAdminApprovalToJoin.getNotifyInfo()))));
    }
}
