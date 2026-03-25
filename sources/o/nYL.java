package o;

import com.okinc.okimcore.model.im.ChangeType;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.RequireAssetVerificationToJoin;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYL extends AbstractC34300nYw<RequireAssetVerificationToJoin> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<RequireAssetVerificationToJoin> KWHzl() {
        return RequireAssetVerificationToJoin.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        OLrzqt((oGY<nLO>) ogy, c35254nrp, (RequireAssetVerificationToJoin) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull RequireAssetVerificationToJoin requireAssetVerificationToJoin, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(requireAssetVerificationToJoin, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return KWHzl(requireAssetVerificationToJoin);
    }

    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull RequireAssetVerificationToJoin requireAssetVerificationToJoin) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(requireAssetVerificationToJoin, "");
        super.AEQbTJ(ogy, c35254nrp, requireAssetVerificationToJoin);
        ((nLO) ogy.copydefault()).copydefault.setText(KWHzl(requireAssetVerificationToJoin));
    }

    public final java.lang.CharSequence KWHzl(RequireAssetVerificationToJoin requireAssetVerificationToJoin) {
        java.lang.String operatorId;
        java.lang.String strCopydefault;
        java.lang.String operatorId2;
        RelationInfo relationInfoKWHzl;
        GroupSystemMessageInfo notifyInfo = requireAssetVerificationToJoin.getNotifyInfo();
        if (notifyInfo == null || (operatorId = notifyInfo.getOperatorId()) == null || !C44157sFk.KWHzl(operatorId)) {
            operatorId = null;
        }
        boolean z = operatorId != null;
        GroupSystemMessageInfo notifyInfo2 = requireAssetVerificationToJoin.getNotifyInfo();
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        GroupSystemMessageInfo notifyInfo3 = requireAssetVerificationToJoin.getNotifyInfo();
        if (notifyInfo3 == null || (operatorId2 = notifyInfo3.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId2)) == null || (strCopydefault = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            strCopydefault = sNV.copydefault(zOLrzqt, notifyInfo2 != null ? notifyInfo2.getOperatorNickname() : null, notifyInfo2 != null ? notifyInfo2.getOperatorEnNickname() : null);
        }
        if (z && requireAssetVerificationToJoin.getChangeType() == ChangeType.ENABLE) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.dPnHjp);
        }
        if (z && requireAssetVerificationToJoin.getChangeType() == ChangeType.DISABLE) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.aGOrKO);
        }
        if (z && requireAssetVerificationToJoin.getChangeType() == ChangeType.UPDATE) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.RuDPQV);
        }
        if (!z && requireAssetVerificationToJoin.getChangeType() == ChangeType.ENABLE) {
            int i = C35399nuc.LoaderManager.dIjzlO;
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("admin", strCopydefault)));
        }
        if (!z && requireAssetVerificationToJoin.getChangeType() == ChangeType.DISABLE) {
            int i2 = C35399nuc.LoaderManager.atDTRm;
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            return C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("admin", strCopydefault)));
        }
        if (z || requireAssetVerificationToJoin.getChangeType() != ChangeType.UPDATE) {
            return "";
        }
        int i3 = C35399nuc.LoaderManager.Rtjmuc;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        return C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("admin", strCopydefault)));
    }
}
