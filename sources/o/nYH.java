package o;

import com.okinc.okimcore.model.im.AnnouncementGroupMessage;
import com.okinc.okimcore.model.im.GroupSystemMessageInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nYH extends AbstractC34300nYw<AnnouncementGroupMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<AnnouncementGroupMessage> KWHzl() {
        return AnnouncementGroupMessage.class;
    }

    @Override // o.AbstractC34300nYw
    public /* synthetic */ void AEQbTJ(oGY ogy, C35254nrp c35254nrp, OKGroupNotificationMessage oKGroupNotificationMessage) {
        OLrzqt((oGY<nLO>) ogy, c35254nrp, (AnnouncementGroupMessage) oKGroupNotificationMessage);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull AnnouncementGroupMessage announcementGroupMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(announcementGroupMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return EZpvd(context, announcementGroupMessage);
    }

    public void OLrzqt(@NotNull oGY<nLO> ogy, @NotNull C35254nrp c35254nrp, @NotNull AnnouncementGroupMessage announcementGroupMessage) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(announcementGroupMessage, "");
        super.AEQbTJ(ogy, c35254nrp, announcementGroupMessage);
        nLO nlo = (nLO) ogy.copydefault();
        android.widget.TextView textView = nlo.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.CharSequence charSequenceEZpvd = EZpvd(C35334ntP.EZpvd(textView), announcementGroupMessage);
        nlo.copydefault.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        nlo.copydefault.setText(java.lang.String.valueOf(charSequenceEZpvd));
    }

    public final java.lang.CharSequence EZpvd(android.content.Context context, AnnouncementGroupMessage announcementGroupMessage) {
        java.lang.String formattedQuantityString$default;
        java.util.List<java.lang.Long> announcementIds;
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.util.List<java.lang.Long> announcementIds2;
        java.lang.String operatorId;
        java.lang.String operatorId2;
        RelationInfo relationInfoKWHzl;
        if (announcementGroupMessage.isPinnedUpdate()) {
            formattedQuantityString$default = context.getString(C35399nuc.LoaderManager.unregister);
        } else if (announcementGroupMessage.isUpdate()) {
            formattedQuantityString$default = context.getString(C35399nuc.LoaderManager.DGgkXd);
        } else if (announcementGroupMessage.isPost()) {
            formattedQuantityString$default = context.getString(C35399nuc.LoaderManager.zuWLRA);
        } else {
            GroupSystemMessageInfo notifyInfo = announcementGroupMessage.getNotifyInfo();
            int iAhwBna = C33129mqd.AhwBna((notifyInfo == null || (announcementIds = notifyInfo.getAnnouncementIds()) == null) ? null : java.lang.Integer.valueOf(announcementIds.size()));
            android.content.res.Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            formattedQuantityString$default = pTD.getFormattedQuantityString$default(resources, C35399nuc.Fragment.hDKMBd, iAhwBna, (java.util.Map) null, 4, (java.lang.Object) null);
        }
        Intrinsics.copydefault((java.lang.Object) formattedQuantityString$default);
        boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
        GroupSystemMessageInfo notifyInfo2 = announcementGroupMessage.getNotifyInfo();
        if (notifyInfo2 == null || (operatorId2 = notifyInfo2.getOperatorId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(operatorId2)) == null || (strCopydefault = C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null)) == null) {
            GroupSystemMessageInfo notifyInfo3 = announcementGroupMessage.getNotifyInfo();
            java.lang.String operatorNickname = notifyInfo3 != null ? notifyInfo3.getOperatorNickname() : null;
            GroupSystemMessageInfo notifyInfo4 = announcementGroupMessage.getNotifyInfo();
            strCopydefault = sNV.copydefault(zOLrzqt, operatorNickname, notifyInfo4 != null ? notifyInfo4.getOperatorEnNickname() : null);
            if (strCopydefault == null) {
                strCopydefault = "";
            }
        }
        if (announcementGroupMessage.isPinnedUpdate()) {
            android.content.res.Resources resources2 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            strCopydefault2 = C33069mpW.copydefault(resources2, C35399nuc.LoaderManager.fZc, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", strCopydefault)));
        } else if (announcementGroupMessage.isUpdate()) {
            android.content.res.Resources resources3 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "");
            strCopydefault2 = C33069mpW.copydefault(resources3, C35399nuc.LoaderManager.onLocationChanged, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", strCopydefault)));
        } else if (announcementGroupMessage.isPost()) {
            android.content.res.Resources resources4 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "");
            strCopydefault2 = C33069mpW.copydefault(resources4, C35399nuc.LoaderManager.DWgRXt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", strCopydefault)));
        } else {
            GroupSystemMessageInfo notifyInfo5 = announcementGroupMessage.getNotifyInfo();
            int iAhwBna2 = C33129mqd.AhwBna((notifyInfo5 == null || (announcementIds2 = notifyInfo5.getAnnouncementIds()) == null) ? null : java.lang.Integer.valueOf(announcementIds2.size()));
            android.content.res.Resources resources5 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources5, "");
            strCopydefault2 = pTD.copydefault(resources5, C35399nuc.Fragment.getFieldNames, iAhwBna2, C56423yEv.EZpvd(C56390yDp.OLrzqt("user", strCopydefault)));
        }
        GroupSystemMessageInfo notifyInfo6 = announcementGroupMessage.getNotifyInfo();
        if (notifyInfo6 != null && (operatorId = notifyInfo6.getOperatorId()) != null) {
            if ((C44157sFk.KWHzl(operatorId) ? operatorId : null) != null) {
                return formattedQuantityString$default;
            }
        }
        return strCopydefault2;
    }
}
