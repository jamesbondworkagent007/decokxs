package o;

import com.okinc.okimcore.model.im.ChangeType;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.PaidGroupBilling;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYP extends AbstractC34300nYw<PaidGroupBilling> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<PaidGroupBilling> KWHzl() {
        return PaidGroupBilling.class;
    }

    @Override // o.AbstractC34300nYw
    public /* bridge */ /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        AEQbTJ((oGY<nLO>) ogy, c35254nrp, (PaidGroupBilling) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull PaidGroupBilling paidGroupBilling, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(paidGroupBilling, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return EZpvd(paidGroupBilling);
    }

    public void AEQbTJ(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull PaidGroupBilling paidGroupBilling) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(paidGroupBilling, "");
        super.AEQbTJ(ogy, c35254nrp, paidGroupBilling);
        ((nLO) ogy.copydefault()).copydefault.setText(EZpvd(paidGroupBilling));
    }

    public final java.lang.CharSequence EZpvd(PaidGroupBilling paidGroupBilling) {
        java.lang.String operatorId;
        java.lang.String strCopydefault;
        java.lang.String operatorId2;
        RelationInfo relationInfoKWHzl;
        GroupSystemMessageInfo notifyInfo = paidGroupBilling.getNotifyInfo();
        if (notifyInfo == null || (operatorId = notifyInfo.getOperatorId()) == null || !C44157sFk.KWHzl(operatorId)) {
            operatorId = null;
        }
        boolean z = operatorId != null;
        GroupSystemMessageInfo notifyInfo2 = paidGroupBilling.getNotifyInfo();
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        GroupSystemMessageInfo notifyInfo3 = paidGroupBilling.getNotifyInfo();
        if (notifyInfo3 == null || (operatorId2 = notifyInfo3.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId2)) == null || (strCopydefault = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            strCopydefault = sNV.copydefault(zOLrzqt, notifyInfo2 != null ? notifyInfo2.getOperatorNickname() : null, notifyInfo2 != null ? notifyInfo2.getOperatorEnNickname() : null);
        }
        if (z && paidGroupBilling.getChangeType() == ChangeType.UPDATE) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.sVaiLC);
        }
        if (z || paidGroupBilling.getChangeType() != ChangeType.UPDATE) {
            return "";
        }
        int i = C35399nuc.LoaderManager.sJPPOI;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("userName", strCopydefault)));
    }
}
